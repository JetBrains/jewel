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
    public fun light(
        information: DefaultBannerStyle = DefaultBannerStyle.Information.light(),
        success: DefaultBannerStyle = DefaultBannerStyle.Success.light(),
    ): DefaultBannerStyles = DefaultBannerStyles(information = information, success = success)

    @Composable
    public fun dark(
        information: DefaultBannerStyle = DefaultBannerStyle.Information.dark(),
        success: DefaultBannerStyle = DefaultBannerStyle.Success.dark(),
    ): DefaultBannerStyles = DefaultBannerStyles(information = information, success = success)
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

public val DefaultBannerStyle.Companion.Success: IntUiDefaultSuccessBannerStyleFactory
    get() = IntUiDefaultSuccessBannerStyleFactory

public object IntUiDefaultSuccessBannerStyleFactory {
    @Composable
    public fun light(
        colors: BannerColors = BannerColors.Default.successLight(),
        metrics: BannerMetrics = BannerMetrics.default(),
    ): DefaultBannerStyle = DefaultBannerStyle(colors = colors, metrics = metrics)

    @Composable
    public fun dark(
        colors: BannerColors = BannerColors.Default.successDark(),
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
        border: Color = IntUiLightTheme.colors.blue(10),
    ): BannerColors = BannerColors(background = background, border = border)

    @Composable
    public fun informationDark(
        background: Color = IntUiDarkTheme.colors.blue(1),
        border: Color = IntUiDarkTheme.colors.blue(3),
    ): BannerColors = BannerColors(background = background, border = border)

    @Composable
    public fun successLight(
        background: Color = IntUiLightTheme.colors.green(11),
        border: Color = IntUiLightTheme.colors.green(9),
    ): BannerColors = BannerColors(background = background, border = border)

    @Composable
    public fun successDark(
        background: Color = IntUiDarkTheme.colors.green(1),
        border: Color = IntUiDarkTheme.colors.green(3),
    ): BannerColors = BannerColors(background = background, border = border)
}
