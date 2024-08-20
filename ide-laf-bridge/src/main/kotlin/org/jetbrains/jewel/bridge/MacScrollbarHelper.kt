package org.jetbrains.jewel.bridge

import com.intellij.openapi.util.SystemInfoRt
import com.intellij.openapi.util.registry.Registry
import com.intellij.ui.mac.foundation.Foundation
import com.intellij.ui.mac.foundation.Foundation.NSAutoreleasePool
import com.intellij.ui.mac.foundation.ID
import com.intellij.util.ui.EdtInvocationManager
import com.sun.jna.Callback
import com.sun.jna.Pointer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.jewel.bridge.theme.default
import org.jetbrains.jewel.bridge.theme.macOs
import org.jetbrains.jewel.bridge.theme.windowsAndLinux
import org.jetbrains.jewel.foundation.util.myLogger
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility
import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior

// Most of this code is copied from MacScrollBarUI — we don't have another way of
// knowing when the behaviour or style changes by reusing the existing IJP code
internal object MacScrollbarHelper {
    private val logger = myLogger()

    private val _scrollbarVisibilityStyleFlow =
        MutableStateFlow<ScrollbarVisibility>(ScrollbarVisibility.AlwaysVisible.default())
    val scrollbarVisibilityStyleFlow: StateFlow<ScrollbarVisibility> = _scrollbarVisibilityStyleFlow

    private val _trackClickBehaviorFlow = MutableStateFlow(TrackClickBehavior.JumpToSpot)
    val trackClickBehaviorFlow: StateFlow<TrackClickBehavior> = _trackClickBehaviorFlow

    private val copiedCode = CopiedCode {
        _scrollbarVisibilityStyleFlow.value = it.asScrollbarVisibility()
    }

    val trackClickBehavior: TrackClickBehavior
        get() = CopiedCode.callMac { CopiedCode.Behavior.CURRENT_BEHAVIOR() }
            ?.asTrackClickBehavior()
            ?: TrackClickBehavior.JumpToSpot

    val scrollbarVisibility: ScrollbarVisibility
        get() = CopiedCode.callMac { copiedCode.CURRENT_STYLE() }
            ?.asScrollbarVisibility()
            ?: ScrollbarVisibility.AlwaysVisible.windowsAndLinux()

    init {
        CopiedCode.callMac {
            _scrollbarVisibilityStyleFlow.value = scrollbarVisibility
            _trackClickBehaviorFlow.value = trackClickBehavior
        }
    }

    private fun CopiedCode.Behavior.asTrackClickBehavior() =
        when (this) {
            CopiedCode.Behavior.NextPage -> TrackClickBehavior.NextPage
            CopiedCode.Behavior.JumpToSpot -> TrackClickBehavior.JumpToSpot
        }

    private fun CopiedCode.MacScrollbarStyle.asScrollbarVisibility() =
        when (this) {
            CopiedCode.MacScrollbarStyle.Legacy -> ScrollbarVisibility.AlwaysVisible.macOs()
            CopiedCode.MacScrollbarStyle.Overlay -> ScrollbarVisibility.WhenScrolling.macOs()
        }

    // Code below this point has not been modified from the IJP, except where [MARKED] ////////////////////////////////

    private class CopiedCode(private val onNewStyle: (MacScrollbarStyle) -> Unit) {

        val CURRENT_STYLE = object : MacScrollbarNative<MacScrollbarStyle>() {
            override fun run() {
                // [REMOVED] not checking the old style
                if (SystemInfoRt.isMac && !Registry.`is`("ide.mac.disableMacScrollbars", false)) {
                    super.run()
            }

                // [CHANGED] Emit new value
                onNewStyle(invoke())
            }

            override fun invoke(): MacScrollbarStyle {
                val style = Foundation.invoke(Foundation.getObjcClass("NSScroller"), "preferredScrollerStyle")
                val value = if (1 == style.toInt()) MacScrollbarStyle.Overlay else MacScrollbarStyle.Legacy
                logger.debug("scroll bar style $value from $style")
                return value
        }

            override fun toString(): String = "scroll bar style"

            override fun initialize(): ID {
                return Foundation.invoke(
                    Foundation.invoke("NSNotificationCenter", "defaultCenter"),
                "addObserver:selector:name:object:",
                    createDelegate(
                        "JBScrollBarStyleObserver",
                        Foundation.createSelector("handleScrollerStyleChanged:"),
                        this
                    ),
                Foundation.createSelector("handleScrollerStyleChanged:"),
                Foundation.nsString("NSPreferredScrollerStyleDidChangeNotification"),
                    ID.NIL
            )
            }
        }

        enum class MacScrollbarStyle {
            Legacy, Overlay;
        }

        enum class Behavior {
            NextPage, JumpToSpot;

            companion object {
                val CURRENT_BEHAVIOR = object : MacScrollbarNative<Behavior>() {
                    override fun invoke(): Behavior {
                        val defaults = Foundation.invoke("NSUserDefaults", "standardUserDefaults")
                        Foundation.invoke(defaults, "synchronize")
                        val behavior =
                            Foundation.invoke(
                                defaults,
                                "boolForKey:",
                                Foundation.nsString("AppleScrollerPagingBehavior")
                            )
                        val value = if (behavior.toInt() == 1) JumpToSpot else NextPage
                        logger.debug("scroll bar behavior $value from $behavior")
                        return value
                    }

                    override fun toString(): String = "scroll bar behavior"

                    override fun initialize(): ID {
                        return Foundation.invoke(
                            Foundation.invoke("NSDistributedNotificationCenter", "defaultCenter"),
                            "addObserver:selector:name:object:",
                            createDelegate(
                                "JBScrollBarBehaviorObserver",
                                Foundation.createSelector("handleBehaviorChanged:"),
                                this
                            ),
                            Foundation.createSelector("handleBehaviorChanged:"),
                            Foundation.nsString("AppleNoRedisplayAppearancePreferenceChanged"),
                            ID.NIL,
                            2 // NSNotificationSuspensionBehaviorCoalesce
                        )
                    }
                }
            }
        }

        abstract class MacScrollbarNative<T> : Callback, Runnable, () -> T? {
            private var value: T? = null

            init {
                callMac { initialize() }
                @Suppress("LeakingThis")
                EdtInvocationManager.invokeLaterIfNeeded(this)
            }

            abstract fun initialize(): ID

            override fun invoke() = value

            @Suppress("UNUSED_PARAMETER")
            fun callback(self: ID?, selector: Pointer?, event: ID?) {
                EdtInvocationManager.invokeLaterIfNeeded(this)
            }

            override fun run() {
                value = callMac(this)
            }
        }

        companion object {
            private fun createDelegate(name: String, pointer: Pointer, callback: Callback): ID {
                val delegateClass = Foundation.allocateObjcClassPair(Foundation.getObjcClass("NSObject"), name)
                if (ID.NIL != delegateClass) {
                    if (!Foundation.addMethod(delegateClass, pointer, callback, "v@")) {
                        @Suppress("detekt:TooGenericExceptionThrown") // From IJP code
                        throw RuntimeException("Cannot add observer method")
                    }
                    Foundation.registerObjcClassPair(delegateClass)
                }
                return Foundation.invoke(name, "new")
            }

            fun <T : Any> callMac(producer: () -> T?): T? {
                if (!SystemInfoRt.isMac) {
                    return null
                }

                val pool = NSAutoreleasePool()
                @Suppress("detekt:TooGenericExceptionCaught") // From IJP code
                try {
                    return producer()
                } catch (e: Throwable) {
                    logger.warn(e)
                } finally {
                    pool.drain()
                }
                return null
            }
        }
    }
}
