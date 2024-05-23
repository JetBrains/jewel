package org.jetbrains.jewel.ui.component.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.ui.component.SegmentedControlButtonState

public class SegmentedControlButtonStyle(
    public val colors: SegmentedControlButtonColors,
    public val metrics: SegmentedControlButtonMetrics,
) {

    public companion object
}

@Immutable
@GenerateDataFunctions
public class SegmentedControlButtonColors(
    public val background: Brush,
    public val backgroundDisabled: Brush,
    public val backgroundPressed: Brush,
    public val backgroundHovered: Brush,
    public val backgroundSelected: Brush,
    public val content: Color,
    public val contentDisabled: Color,
    public val contentPressed: Color,
    public val contentHovered: Color,
    public val contentSelected: Color,
    public val border: Brush,
    public val borderDisabled: Brush,
    public val borderPressed: Brush,
    public val borderHovered: Brush,
    public val borderSelected: Brush,
) {

    @Composable
    public fun contentFor(state: SegmentedControlButtonState): State<Color> =
        rememberUpdatedState(
            when {
                state.isSelected -> contentSelected
                else ->
                    state.chooseValueIgnoreCompat(
                        normal = content,
                        disabled = contentDisabled,
                        pressed = contentPressed,
                        hovered = contentHovered,
                        active = content,
                    )
            }
        )

    @Composable
    public fun backgroundFor(state: SegmentedControlButtonState): State<Brush> =
        rememberUpdatedState(
            when {
                !state.isEnabled -> backgroundDisabled
                state.isPressed -> backgroundPressed
                state.isHovered -> backgroundHovered
                state.isActive -> background
                state.isSelected -> backgroundSelected
                else -> background
            }
        )

    @Composable
    public fun borderFor(state: SegmentedControlButtonState): State<Brush> =
        rememberUpdatedState(
            when {
                state.isSelected && state.isEnabled && state.isFocused -> borderSelected
                state.isSelected && !state.isFocused -> borderDisabled
                else ->
                    state.chooseValueIgnoreCompat(
                        normal = border,
                        disabled = borderDisabled,
                        pressed = borderPressed,
                        hovered = borderHovered,
                        active = border,
                    )
            }
        )

    public companion object
}

@Stable
@GenerateDataFunctions
public class SegmentedControlButtonMetrics(
    public val cornerSize: CornerSize,
    public val segmentedButtonPadding: PaddingValues,
    public val minSize: DpSize,
    public val segmentedButtonContentSpacing: Dp,
    public val borderWidth: Dp,
) {

    public companion object
}

@Composable
private fun <T> SegmentedControlButtonState.chooseValueIgnoreCompat(
    normal: T,
    disabled: T,
    pressed: T,
    hovered: T,
    active: T,
): T =
    when {
        !isEnabled -> disabled
        isPressed -> pressed
        isHovered -> hovered
        isActive -> active
        else -> normal
    }

public val LocalSegmentedControlButtonStyle: ProvidableCompositionLocal<SegmentedControlButtonStyle> =
    staticCompositionLocalOf {
        error("No LocalSegmentedControlButtonStyle provided. Have you forgotten the theme?")
    }