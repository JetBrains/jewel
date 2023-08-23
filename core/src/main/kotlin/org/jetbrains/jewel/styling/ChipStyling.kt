package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.ChipState

@Stable
interface ChipStyle {

    val colors: ChipColors
    val metrics: ChipMetrics
}

@Immutable
interface ChipColors {

    val background: Brush
    val backgroundDisabled: Brush
    val backgroundFocused: Brush
    val backgroundPressed: Brush
    val backgroundHovered: Brush
    val backgroundSelected: Brush
    val backgroundSelectedDisabled: Brush
    val backgroundSelectedPressed: Brush
    val backgroundSelectedFocused: Brush
    val backgroundSelectedHovered: Brush

    @Composable
    fun backgroundFor(state: ChipState) = rememberUpdatedState(
        if (state.isSelected) {
            when {
                !state.isEnabled -> backgroundSelectedDisabled
                state.isPressed -> backgroundSelectedPressed
                state.isFocused -> backgroundSelectedFocused
                state.isHovered -> backgroundSelectedHovered
                else -> backgroundSelected
            }
        } else {
            when {
                !state.isEnabled -> backgroundDisabled
                state.isPressed -> backgroundPressed
                state.isFocused -> backgroundFocused
                state.isHovered -> backgroundHovered
                else -> background
            }
        },
    )

    val content: Color
    val contentDisabled: Color
    val contentFocused: Color
    val contentPressed: Color
    val contentHovered: Color
    val contentSelected: Color
    val contentSelectedDisabled: Color
    val contentSelectedPressed: Color
    val contentSelectedFocused: Color
    val contentSelectedHovered: Color

    @Composable
    fun contentFor(state: ChipState) = rememberUpdatedState(
        if (state.isSelected) {
            when {
                !state.isEnabled -> contentSelectedDisabled
                state.isPressed -> contentSelectedPressed
                state.isFocused -> contentSelectedFocused
                state.isHovered -> contentSelectedHovered
                else -> contentSelected
            }
        } else {
            when {
                !state.isEnabled -> contentDisabled
                state.isPressed -> contentPressed
                state.isFocused -> contentFocused
                state.isHovered -> contentHovered
                else -> content
            }
        },
    )

    val border: Brush
    val borderDisabled: Brush
    val borderFocused: Brush
    val borderPressed: Brush
    val borderHovered: Brush
    val borderSelected: Brush
    val borderSelectedDisabled: Brush
    val borderSelectedPressed: Brush
    val borderSelectedFocused: Brush
    val borderSelectedHovered: Brush

    @Composable
    fun borderFor(state: ChipState) = rememberUpdatedState(
        if (state.isSelected) {
            when {
                !state.isEnabled -> borderSelectedDisabled
                state.isPressed -> borderSelectedPressed
                state.isFocused -> borderSelectedFocused
                state.isHovered -> borderSelectedHovered
                else -> borderSelected
            }
        } else {
            when {
                !state.isEnabled -> borderDisabled
                state.isPressed -> borderPressed
                state.isFocused -> borderFocused
                state.isHovered -> borderHovered
                else -> border
            }
        },
    )
}

@Stable
interface ChipMetrics {

    val cornerSize: CornerSize
    val padding: PaddingValues
    val borderWidth: Dp
    val borderWidthSelected: Dp
}

val LocalChipStyle = staticCompositionLocalOf<ChipStyle> {
    error("No ChipStyle provided")
}
