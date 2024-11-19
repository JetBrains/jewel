package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.BannerColors
import org.jetbrains.jewel.ui.component.styling.BannerMetrics
import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyle
import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyles

public val DefaultBannerStyles.Companion.Default: IntUiDefaultBannerStylesFactory
    get() = IntUiDefaultBannerStylesFactory

public object IntUiDefaultBannerStylesFactory {
    @Composable
    public fun light(information: DefaultBannerStyle = DefaultBannerStyle.Information.light()): DefaultBannerStyles =
        DefaultBannerStyles(information = information)

    @Composable
    public fun dark(information: DefaultBannerStyle = DefaultBannerStyle.Information.dark()): DefaultBannerStyles =
        DefaultBannerStyles(information = information)
}

public val DefaultBannerStyle.Companion.Information: IntUiDefaultInformationBannerStyleFactory
    get() = IntUiDefaultInformationBannerStyleFactory

public object IntUiDefaultInformationBannerStyleFactory {
    @Composable
    public fun light(
        colors: BannerColors = BannerColors.Default.informationLight(),
        metrics: BannerMetrics = BannerMetrics.default(),
    ): DefaultBannerStyle = DefaultBannerStyle(colors = colors, metrics = metrics)

    @Composable
    public fun dark(
        colors: BannerColors = BannerColors.Default.informationDark(),
        metrics: BannerMetrics = BannerMetrics.default(),
    ): DefaultBannerStyle = DefaultBannerStyle(colors = colors, metrics = metrics)
}

public fun BannerMetrics.Companion.default(borderWidth: Dp = 1.dp): BannerMetrics = BannerMetrics(borderWidth)

public val BannerColors.Companion.Default: IntUiDefaultBannerColorFactory
    get() = IntUiDefaultBannerColorFactory

public object IntUiDefaultBannerColorFactory {
    @Composable
    public fun informationLight(
        background: Color = IntUiLightTheme.colors.blue(13),
        content: Color = IntUiLightTheme.colors.gray(14),
        border: Color = IntUiLightTheme.colors.blue(10),
        foreground: Color = IntUiLightTheme.colors.red(4),
    ): BannerColors = BannerColors(background = background, content = content, border = border, foreground = foreground)

    @Composable
    public fun informationDark(
        background: Color = IntUiDarkTheme.colors.blue(1),
        content: Color = IntUiDarkTheme.colors.gray(14),
        border: Color = IntUiDarkTheme.colors.blue(3),
        foreground: Color = IntUiDarkTheme.colors.red(4),
    ): BannerColors = BannerColors(background = background, content = content, border = border, foreground = foreground)
}
