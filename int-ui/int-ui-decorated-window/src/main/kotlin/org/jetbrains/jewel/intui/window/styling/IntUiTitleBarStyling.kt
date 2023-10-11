package org.jetbrains.jewel.intui.window.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.window.styling.TitleBarColors
import org.jetbrains.jewel.window.styling.TitleBarMetrics
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Stable data class IntUiTitleBarStyle(
    override val colors: IntUiTitleBarColors,
    override val metrics: IntUiTitleBarMetrics,
) : TitleBarStyle {

    companion object {

        @Composable fun light(
            intUiTitleBarColors: IntUiTitleBarColors = IntUiTitleBarColors.light(),
            intUiTitleBarMetrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(
            colors = intUiTitleBarColors,
            metrics = intUiTitleBarMetrics,
        )

        @Composable fun lightWithLightHeader(
            intUiTitleBarColors: IntUiTitleBarColors = IntUiTitleBarColors.lightWithLightHeader(),
            intUiTitleBarMetrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(
            colors = intUiTitleBarColors,
            metrics = intUiTitleBarMetrics,
        )

        @Composable fun dark(
            intUiTitleBarColors: IntUiTitleBarColors = IntUiTitleBarColors.dark(),
            intUiTitleBarMetrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(
            colors = intUiTitleBarColors,
            metrics = intUiTitleBarMetrics,
        )
    }
}

@Stable data class IntUiTitleBarColors(
    override val background: Color,
    override val inactiveBackground: Color,
    override val buttonsBackground: Color,
    override val content: Color,
    override val border: Color,
) : TitleBarColors {

    companion object {

        @Composable fun light(
            backgroundColor: Color = IntUiLightTheme.colors.grey(2),
            inactiveBackground: Color = IntUiLightTheme.colors.grey(3),
            buttonsBackground: Color = Color(0xFF7A7B80),
            contentColor: Color = IntUiLightTheme.colors.grey(12),
            borderColor: Color = IntUiLightTheme.colors.grey(4),
        ) = IntUiTitleBarColors(backgroundColor, inactiveBackground, buttonsBackground, contentColor, borderColor)

        @Composable fun lightWithLightHeader(
            backgroundColor: Color = IntUiLightTheme.colors.grey(13),
            inactiveBackground: Color = IntUiLightTheme.colors.grey(12),
            buttonsBackground: Color = Color(0xFF7A7B80),
            contentColor: Color = IntUiLightTheme.colors.grey(1),
            borderColor: Color = IntUiLightTheme.colors.grey(11),
        ) = IntUiTitleBarColors(backgroundColor, inactiveBackground, buttonsBackground, contentColor, borderColor)

        @Composable fun dark(
            backgroundColor: Color = IntUiDarkTheme.colors.grey(2),
            inactiveBackground: Color = IntUiDarkTheme.colors.grey(3),
            buttonsBackground: Color = Color(0xFF575A5C),
            contentColor: Color = IntUiDarkTheme.colors.grey(12),
            borderColor: Color = IntUiDarkTheme.colors.grey(4),
        ) = IntUiTitleBarColors(backgroundColor, inactiveBackground, buttonsBackground, contentColor, borderColor)
    }
}

@Stable data class IntUiTitleBarMetrics(
    override val height: Dp = 40.dp,
    override val gradientStartX: Dp = (-100).dp,
    override val gradientEndX: Dp = 400.dp,
) : TitleBarMetrics
