package org.jetbrains.jewel.window.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.window.TitleBarState

@Stable
interface TitleBarStyle {

    val colors: TitleBarColors
    val metrics: TitleBarMetrics
}

@Stable
interface TitleBarColors {

    val background: Color
    val inactiveBackground: Color
    val buttonsBackground: Color
    val content: Color
    val border: Color

    @Composable
    fun backgroundFor(state: TitleBarState) = rememberUpdatedState(
        when {
            !state.isActive -> inactiveBackground
            else -> background
        },
    )
}

@Stable
interface TitleBarMetrics {

    val height: Dp

    val gradientStartX: Dp

    val gradientEndX: Dp
}

val LocalTitleBarStyle = staticCompositionLocalOf<TitleBarStyle> {
    error("No TitleBarStyle provided")
}
