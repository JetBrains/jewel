package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.BannerColors
import org.jetbrains.jewel.ui.component.styling.BannerMetrics
import org.jetbrains.jewel.ui.component.styling.BannerStyle

public val BannerStyle.Companion.Default: IntUiDefaultBannerStyleFactory
    get() = IntUiDefaultBannerStyleFactory

public object IntUiDefaultBannerStyleFactory {
    @Composable
    public fun light(
        colors: BannerColors = BannerColors.Default.light(),
        metrics: BannerMetrics = BannerMetrics.default(),
    ): BannerStyle = BannerStyle(colors, metrics)

    @Composable
    public fun dark(
        colors: BannerColors = BannerColors.Default.dark(),
        metrics: BannerMetrics = BannerMetrics.default(),
    ): BannerStyle = BannerStyle(colors, metrics)
}

public fun BannerMetrics.Companion.default(borderWidth: Dp = 1.dp): BannerMetrics = BannerMetrics(borderWidth)

public val BannerColors.Companion.Default: IntUiDefaultBannerColorFactory
    get() = IntUiDefaultBannerColorFactory

public object IntUiDefaultBannerColorFactory {
    @Composable
    public fun light(
        background: Color = IntUiLightTheme.colors.blue(13),
        content: Color = IntUiLightTheme.colors.gray(14),
        dividerInformation: Color = IntUiLightTheme.colors.blue(10),
        foreground: Color = IntUiLightTheme.colors.red(4),
    ): BannerColors = BannerColors(background = background, content = content, dividerInformation = dividerInformation, foreground = foreground)

    @Composable
    public fun dark(
        background: Color = IntUiDarkTheme.colors.blue(1),
        content: Color = IntUiDarkTheme.colors.gray(14),
        dividerInformation: Color = IntUiDarkTheme.colors.blue(3),
        foreground: Color = IntUiDarkTheme.colors.red(4),
    ): BannerColors = BannerColors(background = background, content = content, dividerInformation = dividerInformation, foreground = foreground)
}
