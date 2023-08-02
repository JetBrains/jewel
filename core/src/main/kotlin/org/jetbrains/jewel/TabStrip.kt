package org.jetbrains.jewel

import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection

@Composable
fun TabStrip(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: TabStripScope.() -> Unit,
) {
    val tabsData = remember { content.asList() }

    var tabStripState: TabStripState by remember(interactionSource) { mutableStateOf(TabStripState.of(enabled = true)) }

    remember(enabled) { tabStripState = tabStripState.copy(enabled) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is HoverInteraction.Enter -> tabStripState = tabStripState.copy(hovered = true)
                is HoverInteraction.Exit -> tabStripState = tabStripState.copy(hovered = false)
                is FocusInteraction.Focus -> tabStripState = tabStripState.copy(focused = true, active = true)
                is FocusInteraction.Unfocus -> tabStripState = tabStripState.copy(focused = false, active = false)
            }
        }
    }
    val scrollState = rememberScrollState()

    Box(
        Modifier
            .focusable(true, interactionSource)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState)
                .scrollable(
                    orientation = Orientation.Vertical,
                    reverseDirection = ScrollableDefaults.reverseDirection(
                        LocalLayoutDirection.current,
                        Orientation.Vertical,
                        false
                    ),
                    enabled = tabStripState.isHovered,
                    state = scrollState,
                    interactionSource = interactionSource
                )
        ) {
            tabsData.forEach {
                TabImpl(
                    tabStripState.isActive,
                    it
                )
            }
        }
        if (tabStripState.isHovered) {
            Box(
                modifier =
                Modifier
                    .matchParentSize()
            ) {
                HorizontalScrollbar(
                    rememberScrollbarAdapter(scrollState),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

interface TabStripScope {

    fun tab(
        selected: Boolean,
        tabNameString: String,
        tabIconResource: String? = null,
        closable: Boolean = true,
        onTabClose: () -> Unit = {},
        onTabClick: () -> Unit = {},
    )

    fun tabs(
        tabsCount: Int,
        selected: (Int) -> Boolean,
        tabNameString: (Int) -> String,
        tabIconResource: (Int) -> String?,
        closable: (Int) -> Boolean,
        onTabClose: (Int) -> Unit,
        onTabClick: (Int) -> Unit,
    )

    fun editorTab(
        selected: Boolean,
        tabNameString: String,
        tabIconResource: String? = null,
        closable: Boolean = true,
        onTabClose: () -> Unit = {},
        onTabClick: () -> Unit = {},
    )

    fun editorTabs(
        tabsCount: Int,
        selected: (Int) -> Boolean,
        tabNameString: (Int) -> String,
        tabIconResource: (Int) -> String?,
        closable: (Int) -> Boolean,
        onTabClose: (Int) -> Unit,
        onTabClick: (Int) -> Unit,
    )
}

sealed class TabData(
    val selected: Boolean,
    val tabNameString: String,
    val tabIconResource: String? = null,
    val closable: Boolean = true,
    val onTabClose: () -> Unit = {},
    val onTabClick: () -> Unit = {},
) {

    class Default(
        selected: Boolean,
        tabNameString: String,
        tabIconResource: String? = null,
        closable: Boolean = true,
        onTabClose: () -> Unit = {},
        onTabClick: () -> Unit = {},
    ) : TabData(
        selected,
        tabNameString,
        tabIconResource,
        closable,
        onTabClose,
        onTabClick
    )

    class Editor(
        selected: Boolean,
        tabNameString: String,
        tabIconResource: String? = null,
        closable: Boolean = true,
        onTabClose: () -> Unit = {},
        onTabClick: () -> Unit = {},
    ) : TabData(
        selected,
        tabNameString,
        tabIconResource,
        closable,
        onTabClose,
        onTabClick
    )
}

private fun (TabStripScope.() -> Unit).asList() = buildList {
    this@asList(
        object : TabStripScope {
            override fun tab(
                selected: Boolean,
                tabNameString: String,
                tabIconResource: String?,
                closable: Boolean,
                onTabClose: () -> Unit,
                onTabClick: () -> Unit,
            ) {
                add(
                    TabData.Default(
                        selected = selected,
                        tabNameString = tabNameString,
                        tabIconResource = tabIconResource,
                        closable = closable,
                        onTabClose = onTabClose,
                        onTabClick = onTabClick
                    )
                )
            }

            override fun tabs(
                tabsCount: Int,
                selected: (Int) -> Boolean,
                tabNameString: (Int) -> String,
                tabIconResource: (Int) -> String?,
                closable: (Int) -> Boolean,
                onTabClose: (Int) -> Unit,
                onTabClick: (Int) -> Unit,
            ) {
                repeat(tabsCount) {
                    tab(
                        selected(it),
                        tabNameString(it),
                        tabIconResource(it),
                        closable(it),
                        { onTabClose(it) },
                        { onTabClick(it) }
                    )
                }
            }

            override fun editorTab(
                selected: Boolean,
                tabNameString: String,
                tabIconResource: String?,
                closable: Boolean,
                onTabClose: () -> Unit,
                onTabClick: () -> Unit,
            ) {
                add(
                    TabData.Editor(
                        selected = selected,
                        tabNameString = tabNameString,
                        tabIconResource = tabIconResource,
                        closable = closable,
                        onTabClose = onTabClose,
                        onTabClick = onTabClick
                    )
                )
            }

            override fun editorTabs(
                tabsCount: Int,
                selected: (Int) -> Boolean,
                tabNameString: (Int) -> String,
                tabIconResource: (Int) -> String?,
                closable: (Int) -> Boolean,
                onTabClose: (Int) -> Unit,
                onTabClick: (Int) -> Unit,
            ) {
                repeat(tabsCount) {
                    editorTab(
                        selected(it),
                        tabNameString(it),
                        tabIconResource(it),
                        closable(it),
                        { onTabClose(it) },
                        { onTabClick(it) }
                    )
                }
            }
        }
    )
}

@Immutable
@JvmInline
value class TabStripState(val state: ULong) : FocusableComponentState {

    @Stable
    override val isActive: Boolean
        get() = state and CommonStateBitMask.Active != 0UL

    @Stable
    override val isEnabled: Boolean
        get() = state and CommonStateBitMask.Enabled != 0UL

    @Stable
    override val isFocused: Boolean
        get() = state and CommonStateBitMask.Focused != 0UL

    @Stable
    override val isHovered: Boolean
        get() = state and CommonStateBitMask.Hovered != 0UL

    @Stable
    override val isPressed: Boolean
        get() = state and CommonStateBitMask.Pressed != 0UL

    fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        active: Boolean = isActive,
    ) = of(
        enabled = enabled,
        focused = focused,
        pressed = pressed,
        hovered = hovered,
        active = active
    )

    override fun toString() =
        "${javaClass.simpleName}(isEnabled=$isEnabled, isFocused=$isFocused, isHovered=$isHovered, " +
            "isPressed=$isPressed, isActive=$isActive)"

    companion object {

        fun of(
            enabled: Boolean = true,
            focused: Boolean = false,
            error: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            warning: Boolean = false,
            active: Boolean = false,
        ) = TabStripState(
            state = (if (enabled) CommonStateBitMask.Enabled else 0UL) or
                (if (focused) CommonStateBitMask.Focused else 0UL) or
                (if (hovered) CommonStateBitMask.Hovered else 0UL) or
                (if (pressed) CommonStateBitMask.Pressed else 0UL) or
                (if (warning) CommonStateBitMask.Warning else 0UL) or
                (if (error) CommonStateBitMask.Error else 0UL) or
                (if (active) CommonStateBitMask.Active else 0UL)
        )
    }
}
