package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.TabState
import org.jetbrains.jewel.painterResource

@Stable
interface TabStyle {

    val colors: TabColors
    val metrics: TabMetrics
    val icons: TabIcons
}

@Immutable
interface TabIcons {

    val close: String

    @Composable
    fun closePainter(resourceLoader: ResourceLoader) = painterResource(close, resourceLoader)
}

interface TabMetrics {

    val underlineThickness: Dp
    val elementContentPadding: PaddingValues
    val elementMinHeight: Dp
    val closeContentGap: Dp
}

interface TabColors {

    val tabBackground: Color
    val tabBackgroundHovered: Color
    val tabBackgroundHoveredFocused: Color
    val tabBackgroundHoveredSelected: Color
    val tabBackgroundHoveredFocusedSelected: Color
    val tabBackgroundFocused: Color
    val tabBackgroundFocusedSelected: Color
    val tabBackgroundSelected: Color

    val tabForeground: Color
    val tabForegroundHovered: Color
    val tabForegroundHoveredFocused: Color
    val tabForegroundHoveredSelected: Color
    val tabForegroundHoveredFocusedSelected: Color
    val tabForegroundFocused: Color
    val tabForegroundFocusedSelected: Color
    val tabForegroundSelected: Color

    val tabUnderline: Color
    val tabUnderlineHovered: Color
    val tabUnderlineHoveredFocused: Color
    val tabUnderlineHoveredSelected: Color
    val tabUnderlineHoveredFocusedSelected: Color
    val tabUnderlineFocused: Color
    val tabUnderlineFocusedSelected: Color
    val tabUnderlineSelected: Color

    val closeTint: Color
    val closeHoveredTint: Color
    val closeHoveredFocusedTint: Color
    val closeHoveredSelectedTint: Color
    val closeHoveredFocusedSelectedTint: Color
    val closeFocusedTint: Color
    val closeFocusedSelectedTint: Color
    val closeSelectedTint: Color


    @Composable
    fun foregroundColorFor(state: TabState) = rememberUpdatedState(
        when {
            state.isSelected && state.isFocused && state.isHovered -> tabForegroundHoveredFocusedSelected
            state.isSelected && state.isFocused -> tabForegroundFocusedSelected
            state.isSelected && state.isHovered -> tabForegroundHoveredSelected
            state.isFocused && state.isHovered -> tabForegroundHoveredFocused
            state.isFocused -> tabForegroundFocused
            state.isHovered -> tabForegroundHovered
            state.isSelected -> tabForegroundSelected
            else -> tabForeground
        }
    )
    @Composable
    fun backGroundColorFor(state: TabState) = rememberUpdatedState(
        when {
            state.isSelected && state.isFocused && state.isHovered -> tabBackgroundHoveredFocusedSelected
            state.isSelected && state.isFocused -> tabBackgroundFocusedSelected
            state.isSelected && state.isHovered -> tabBackgroundHoveredSelected
            state.isFocused && state.isHovered -> tabBackgroundHoveredFocused
            state.isFocused -> tabBackgroundFocused
            state.isHovered -> tabBackgroundHovered
            state.isSelected -> tabBackgroundSelected
            else -> tabBackground
        }
    )

    @Composable
    fun closeTintFor(state: TabState) = rememberUpdatedState(
        when {
            state.isSelected && state.isFocused && state.isHovered -> closeHoveredFocusedSelectedTint
            state.isSelected && state.isFocused -> closeFocusedSelectedTint
            state.isSelected && state.isHovered -> closeHoveredSelectedTint
            state.isFocused && state.isHovered -> closeHoveredFocusedTint
            state.isFocused -> closeFocusedTint
            state.isHovered -> closeHoveredTint
            state.isSelected -> closeSelectedTint
            else -> closeTint
        }
    )

    @Composable
    fun underlineTintFor(state: TabState) = rememberUpdatedState(
        when {
            state.isSelected && state.isFocused && state.isHovered -> tabUnderlineHoveredFocusedSelected
            state.isSelected && state.isFocused -> tabUnderlineFocusedSelected
            state.isSelected && state.isHovered -> tabUnderlineHoveredSelected
            state.isFocused && state.isHovered -> tabUnderlineHoveredFocused
            state.isFocused -> tabUnderlineFocused
            state.isHovered -> tabUnderlineHovered
            state.isSelected -> tabUnderlineSelected
            else -> tabUnderline
        }
    )
}

@Immutable
@JvmInline
value class TabState(val state: ULong) {

    @Stable
    val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    val isHovered: Boolean
        get() = state and Hovered != 0UL

    @Stable
    val isSelected: Boolean
        get() = state and Selected != 0UL

    fun copy(focused: Boolean = isFocused, hovered: Boolean = isHovered, selected: Boolean = isSelected): TabState =
        of(focused, hovered, selected)

    override fun toString(): String = "TabState(focused=$isFocused, Hovered=$isHovered, pressed=$isSelected)"

    companion object {

        private val Focused = 1UL shl 0
        private val Hovered = 1UL shl 1
        private val Selected = 1UL shl 2

        fun of(focused: Boolean = false, hovered: Boolean = false, selected: Boolean = false): TabState {
            return TabState(
                state = (if (focused) Focused else 0UL) or (if (hovered) Hovered else 0UL) or if (selected) Selected else 0UL
            )
        }
    }
}

val LocalDefaultTabStyle = staticCompositionLocalOf<TabStyle> {
    error("No LocalTabStyle provided")
}

val LocalEditorTabStyle = staticCompositionLocalOf<TabStyle> {
    error("No LocalTabStyle provided")
}
