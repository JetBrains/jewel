package org.jetbrains.jewel.bridge

import com.intellij.openapi.util.SystemInfoRt
import com.intellij.ui.mac.foundation.Foundation
import com.intellij.ui.mac.foundation.Foundation.NSAutoreleasePool
import com.intellij.ui.mac.foundation.ID
import com.sun.jna.Callback
import com.sun.jna.Pointer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

internal object MacScrollbarHelper {

    private val _scrollbarVisibilityStyle = MutableStateFlow(scrollbarStyle)
    val scrollbarVisibilityStyleFlow: StateFlow<ScrollbarStyle> = _scrollbarVisibilityStyle

    private val _trackClickBehavior = MutableStateFlow(trackClickBehavior)
    val trackClickBehaviorFlow: StateFlow<TrackClickBehavior> = _trackClickBehavior

    private val APPEARANCE_CALLBACK: Callback = object : Callback {
        @SuppressWarnings("UnusedDeclaration")
        fun callback(self: ID?, selector: Pointer?, event: ID?) {
            _scrollbarVisibilityStyle.tryEmit(scrollbarStyle)
        }
    }
    private val BEHAVIOR_CALLBACK: Callback = object : Callback {
        @SuppressWarnings("UnusedDeclaration")
        fun callback(self: ID?, selector: Pointer?, event: ID?) {
            _trackClickBehavior.tryEmit(trackClickBehavior)
        }
    }

    init {
        if (SystemInfoRt.isMac) {
            initNotificationObserver()
        }
    }

    private fun initNotificationObserver() {
        val pool = NSAutoreleasePool()

        val delegateClass =
            Foundation.allocateObjcClassPair(Foundation.getObjcClass("NSObject"), "NSScrollerChangesObserver")
        if (ID.NIL != delegateClass) {
            // This static initializer might be called more than once (with different class loaders). In that case NSScrollerChangesObserver
            // already exists.
            if (!Foundation.addMethod(
                    delegateClass,
                    Foundation.createSelector("handleScrollerStyleChanged:"),
                    APPEARANCE_CALLBACK,
                    "v@"
                )) {
                throw RuntimeException("Cannot add observer method")
            }
            if (!Foundation.addMethod(
                    delegateClass,
                    Foundation.createSelector("handleBehaviorChanged:"),
                    BEHAVIOR_CALLBACK,
                    "v@"
                )) {
                throw RuntimeException("Cannot add observer method")
            }

            Foundation.registerObjcClassPair(delegateClass)
        }
        val delegate = Foundation.invoke("NSScrollerChangesObserver", "new")

        try {
            var center =
                Foundation.invoke("NSNotificationCenter", "defaultCenter")
            Foundation.invoke(
                center, "addObserver:selector:name:object:",
                delegate,
                Foundation.createSelector("handleScrollerStyleChanged:"),
                Foundation.nsString("NSPreferredScrollerStyleDidChangeNotification"),
                ID.NIL
            )

            center = Foundation.invoke("NSDistributedNotificationCenter", "defaultCenter")
            Foundation.invoke(
                center, "addObserver:selector:name:object:",
                delegate,
                Foundation.createSelector("handleBehaviorChanged:"),
                Foundation.nsString("AppleNoRedisplayAppearancePreferenceChanged"),
                ID.NIL,
                2 // NSNotificationSuspensionBehaviorCoalesce
            )
        } finally {
            pool.drain()
        }
    }

    val trackClickBehavior: TrackClickBehavior
        get() {
            val pool = NSAutoreleasePool()
            try {
                val defaults = Foundation.invoke("NSUserDefaults", "standardUserDefaults")
                Foundation.invoke(defaults, "synchronize")
                return if (Foundation.invoke(defaults, "boolForKey:", Foundation.nsString("AppleScrollerPagingBehavior")).booleanValue())
                    TrackClickBehavior.JumpToSpot
                else
                    TrackClickBehavior.NextPage
            } finally {
                pool.drain()
            }
        }

    val scrollbarStyle: ScrollbarStyle
        get() {
            val pool = NSAutoreleasePool()
            try {
                if (Foundation.invoke(Foundation.getObjcClass("NSScroller"), "preferredScrollerStyle").toInt() == 1) {
                    return ScrollbarStyle.Overlay
                }
            } catch (ignore: Throwable) {
            } finally {
                pool.drain()
            }
            return ScrollbarStyle.Legacy
        }

    internal enum class TrackClickBehavior {
        NextPage, JumpToSpot
    }

    internal enum class ScrollbarStyle {
        Legacy, Overlay
    }
}