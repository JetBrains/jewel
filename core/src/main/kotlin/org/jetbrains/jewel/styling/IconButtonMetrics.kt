package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import org.jetbrains.jewel.ButtonState

@Stable
interface IconButtonStyle {

    val colors: IconButtonColors
    val metrics: IconButtonMetrics
}

@Immutable
interface IconButtonColors {

    val background: Color
    val backgroundDisabled: Color
    val backgroundFocused: Color
    val backgroundPressed: Color
    val backgroundHovered: Color

    @Composable
    fun backgroundFor(state: ButtonState) = rememberUpdatedState(
        when {
            !state.isEnabled -> backgroundDisabled
            state.isPressed -> backgroundPressed
            state.isHovered -> backgroundHovered
            state.isFocused -> backgroundFocused
            else -> background
        }
    )
}

@Stable
interface IconButtonMetrics {

    val cornerSize: CornerSize
    val padding: PaddingValues
    val minSize: DpSize
}

val LocalIconButtonStyle = staticCompositionLocalOf<IconButtonStyle> {
    error("No IconButtonStyle provided")
}
