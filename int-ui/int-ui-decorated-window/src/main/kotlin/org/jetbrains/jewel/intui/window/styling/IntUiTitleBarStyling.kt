package org.jetbrains.jewel.intui.window.styling

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconMapper
import org.jetbrains.jewel.InternalJewelApi
import org.jetbrains.jewel.LocalIconData
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.rememberSvgLoader
import org.jetbrains.jewel.intui.standalone.styling.IntUiIconButtonColors
import org.jetbrains.jewel.intui.standalone.styling.IntUiIconButtonMetrics
import org.jetbrains.jewel.intui.standalone.styling.IntUiIconButtonStyle
import org.jetbrains.jewel.styling.IconButtonStyle
import org.jetbrains.jewel.styling.PainterProvider
import org.jetbrains.jewel.styling.ResourcePainterProvider
import org.jetbrains.jewel.styling.SimpleResourcePathPatcher
import org.jetbrains.jewel.window.DecoratedWindowState
import org.jetbrains.jewel.window.styling.TitleBarColors
import org.jetbrains.jewel.window.styling.TitleBarIcons
import org.jetbrains.jewel.window.styling.TitleBarMetrics
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Stable
@Immutable
class IntUiTitleBarStyle(
    override val colors: IntUiTitleBarColors,
    override val metrics: IntUiTitleBarMetrics,
    override val icons: TitleBarIcons,
) : TitleBarStyle {

    override fun hashCode(): Int {
        var result = colors.hashCode()
        result = 31 * result + metrics.hashCode()
        result = 31 * result + icons.hashCode()
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IntUiTitleBarStyle) return false

        if (colors != other.colors) return false
        if (metrics != other.metrics) return false
        if (icons != other.icons) return false

        return true
    }

    override fun toString(): String = "IntUiTitleBarStyle(colors=$colors, metrics=$metrics, icons=$icons)"

    override fun iconButtonStyle(): IconButtonStyle = IntUiIconButtonStyle(
        IntUiIconButtonColors(
            background = Color.Transparent,
            backgroundDisabled = Color.Transparent,
            backgroundFocused = Color.Transparent,
            backgroundPressed = colors.iconButtonPressBackground,
            backgroundHovered = colors.iconButtonHoverBackground,
            border = Color.Transparent,
            borderDisabled = Color.Transparent,
            borderFocused = Color.Transparent,
            borderPressed = Color.Transparent,
            borderHovered = Color.Transparent,
        ),
        IntUiIconButtonMetrics(borderWidth = 0.dp),
    )

    override fun paneButtonStyle(): IconButtonStyle = IntUiIconButtonStyle(
        IntUiIconButtonColors(
            background = Color.Transparent,
            backgroundDisabled = Color.Transparent,
            backgroundFocused = Color.Transparent,
            backgroundPressed = colors.titlePaneButtonPressBackground,
            backgroundHovered = colors.titlePaneButtonHoverBackground,
            border = Color.Transparent,
            borderDisabled = Color.Transparent,
            borderFocused = Color.Transparent,
            borderPressed = Color.Transparent,
            borderHovered = Color.Transparent,
        ),
        IntUiIconButtonMetrics(CornerSize(0.dp), borderWidth = 0.dp),
    )

    override fun paneCloseButtonStyle(): IconButtonStyle {
        return IntUiIconButtonStyle(
            IntUiIconButtonColors(
                background = Color.Transparent,
                backgroundDisabled = Color.Transparent,
                backgroundFocused = Color.Transparent,
                backgroundPressed = colors.titlePaneCloseButtonPressBackground,
                backgroundHovered = colors.titlePaneCloseButtonHoverBackground,
                border = Color.Transparent,
                borderDisabled = Color.Transparent,
                borderFocused = Color.Transparent,
                borderPressed = Color.Transparent,
                borderHovered = Color.Transparent,
            ),
            IntUiIconButtonMetrics(CornerSize(0.dp), borderWidth = 0.dp),
        )
    }

    companion object {

        @Composable
        fun light(
            svgLoader: SvgLoader = rememberSvgLoader(false).value,
            colors: IntUiTitleBarColors = IntUiTitleBarColors.light(),
            metrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
            icons: IntUiTitleBarIcons = intUiTitleBarIcons(svgLoader),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(colors, metrics, icons)

        @Composable
        fun lightWithLightHeader(
            svgLoader: SvgLoader = rememberSvgLoader(false).value,
            colors: IntUiTitleBarColors = IntUiTitleBarColors.lightWithLightHeader(),
            metrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
            icons: IntUiTitleBarIcons = intUiTitleBarIcons(svgLoader),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(colors, metrics, icons)

        @Composable
        fun dark(
            svgLoader: SvgLoader = rememberSvgLoader(true).value,
            colors: IntUiTitleBarColors = IntUiTitleBarColors.dark(),
            metrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
            icons: IntUiTitleBarIcons = intUiTitleBarIcons(svgLoader),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(colors, metrics, icons)
    }
}

@Stable
@Immutable
class IntUiTitleBarColors(
    override val background: Color,
    override val inactiveBackground: Color,
    override val content: Color,
    override val border: Color,
    override val fullscreenControlButtonsBackground: Color,
    override val titlePaneButtonHoverBackground: Color,
    override val titlePaneButtonPressBackground: Color,
    override val titlePaneCloseButtonHoverBackground: Color,
    override val titlePaneCloseButtonPressBackground: Color,
    override val iconButtonHoverBackground: Color,
    override val iconButtonPressBackground: Color,
) : TitleBarColors {

    override fun hashCode(): Int {
        var result = background.hashCode()
        result = 31 * result + inactiveBackground.hashCode()
        result = 31 * result + content.hashCode()
        result = 31 * result + border.hashCode()
        result = 31 * result + fullscreenControlButtonsBackground.hashCode()
        result = 31 * result + titlePaneButtonHoverBackground.hashCode()
        result = 31 * result + titlePaneButtonPressBackground.hashCode()
        result = 31 * result + titlePaneCloseButtonHoverBackground.hashCode()
        result = 31 * result + titlePaneCloseButtonPressBackground.hashCode()
        result = 31 * result + iconButtonHoverBackground.hashCode()
        result = 31 * result + iconButtonPressBackground.hashCode()
        return result
    }

    override fun toString(): String {
        return "IntUiTitleBarColors(background=$background, " +
            "inactiveBackground=$inactiveBackground, " +
            "content=$content, " +
            "border=$border, " +
            "fullscreenControlButtonsBackground=$fullscreenControlButtonsBackground, " +
            "titlePaneButtonHoverBackground=$titlePaneButtonHoverBackground, " +
            "titlePaneButtonPressBackground=$titlePaneButtonPressBackground, " +
            "titlePaneCloseButtonHoverBackground=$titlePaneCloseButtonHoverBackground, " +
            "titlePaneCloseButtonPressBackground=$titlePaneCloseButtonPressBackground, " +
            "iconButtonHoverBackground=$iconButtonHoverBackground, " +
            "iconButtonPressBackground=$iconButtonPressBackground)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IntUiTitleBarColors) return false

        if (background != other.background) return false
        if (inactiveBackground != other.inactiveBackground) return false
        if (content != other.content) return false
        if (border != other.border) return false
        if (fullscreenControlButtonsBackground != other.fullscreenControlButtonsBackground) return false
        if (titlePaneButtonHoverBackground != other.titlePaneButtonHoverBackground) return false
        if (titlePaneButtonPressBackground != other.titlePaneButtonPressBackground) return false
        if (titlePaneCloseButtonHoverBackground != other.titlePaneCloseButtonHoverBackground) return false
        if (titlePaneCloseButtonPressBackground != other.titlePaneCloseButtonPressBackground) return false
        if (iconButtonHoverBackground != other.iconButtonHoverBackground) return false
        if (iconButtonPressBackground != other.iconButtonPressBackground) return false

        return true
    }

    companion object {

        @Composable
        fun light(
            backgroundColor: Color = IntUiLightTheme.colors.grey(2),
            inactiveBackground: Color = IntUiLightTheme.colors.grey(3),
            contentColor: Color = IntUiLightTheme.colors.grey(12),
            borderColor: Color = IntUiLightTheme.colors.grey(4),
            fullscreenControlButtonsBackground: Color = Color(0xFF7A7B80),
            // Color hex from
            // com.intellij.util.ui.JBUI.CurrentTheme.CustomFrameDecorations.titlePaneButtonHoverBackground
            titlePaneButtonHoverBackground: Color = Color(0x1AFFFFFF),
            // Same as
            // com.intellij.util.ui.JBUI.CurrentTheme.CustomFrameDecorations.titlePaneButtonPressBackground
            titlePaneButtonPressBackground: Color = titlePaneButtonHoverBackground,
            // Color hex from
            // com.intellij.openapi.wm.impl.customFrameDecorations.CustomFrameTitleButtons.closeStyleBuilder
            titlePaneCloseButtonHoverBackground: Color = Color(0xFFE81123),
            titlePaneCloseButtonPressBackground: Color = Color(0xFFF1707A),

            iconButtonHoverBackground: Color = IntUiLightTheme.colors.grey(3),
            iconButtonPressBackground: Color = IntUiLightTheme.colors.grey(3),
        ) = IntUiTitleBarColors(
            backgroundColor,
            inactiveBackground,
            contentColor,
            borderColor,
            fullscreenControlButtonsBackground,
            titlePaneButtonHoverBackground,
            titlePaneButtonPressBackground,
            titlePaneCloseButtonHoverBackground,
            titlePaneCloseButtonPressBackground,
            iconButtonHoverBackground,
            iconButtonPressBackground,
        )

        @Composable
        fun lightWithLightHeader(
            backgroundColor: Color = IntUiLightTheme.colors.grey(13),
            inactiveBackground: Color = IntUiLightTheme.colors.grey(12),
            fullscreenControlButtonsBackground: Color = Color(0xFF7A7B80),
            contentColor: Color = IntUiLightTheme.colors.grey(1),
            borderColor: Color = IntUiLightTheme.colors.grey(11),
            titlePaneButtonHoverBackground: Color = Color(0x1A000000),
            titlePaneButtonPressBackground: Color = titlePaneButtonHoverBackground,
            titlePaneCloseButtonHoverBackground: Color = Color(0xFFE81123),
            titlePaneCloseButtonPressBackground: Color = Color(0xFFF1707A),
            iconButtonHoverBackground: Color = IntUiLightTheme.colors.grey(12),
            iconButtonPressBackground: Color = IntUiLightTheme.colors.grey(11),
        ) = IntUiTitleBarColors(
            backgroundColor,
            inactiveBackground,
            contentColor,
            borderColor,
            fullscreenControlButtonsBackground,
            titlePaneButtonHoverBackground,
            titlePaneButtonPressBackground,
            titlePaneCloseButtonHoverBackground,
            titlePaneCloseButtonPressBackground,
            iconButtonHoverBackground,
            iconButtonPressBackground,
        )

        @Composable
        fun dark(
            backgroundColor: Color = IntUiDarkTheme.colors.grey(2),
            inactiveBackground: Color = IntUiDarkTheme.colors.grey(3),
            fullscreenControlButtonsBackground: Color = Color(0xFF575A5C),
            contentColor: Color = IntUiDarkTheme.colors.grey(12),
            borderColor: Color = IntUiDarkTheme.colors.grey(4),
            titlePaneButtonHoverBackground: Color = Color(0x1AFFFFFF),
            titlePaneButtonPressBackground: Color = titlePaneButtonHoverBackground,
            titlePaneCloseButtonHoverBackground: Color = Color(0xFFE81123),
            titlePaneCloseButtonPressBackground: Color = Color(0xFFF1707A),
            iconButtonHoverBackground: Color = IntUiLightTheme.colors.grey(3),
            iconButtonPressBackground: Color = IntUiLightTheme.colors.grey(3),
        ) = IntUiTitleBarColors(
            backgroundColor,
            inactiveBackground,
            contentColor,
            borderColor,
            fullscreenControlButtonsBackground,
            titlePaneButtonHoverBackground,
            titlePaneButtonPressBackground,
            titlePaneCloseButtonHoverBackground,
            titlePaneCloseButtonPressBackground,
            iconButtonHoverBackground,
            iconButtonPressBackground,
        )
    }
}

@Stable
@Immutable
class IntUiTitleBarMetrics(
    override val height: Dp = 40.dp,
    override val gradientStartX: Dp = (-100).dp,
    override val gradientEndX: Dp = 400.dp,
    override val titlePaneButtonSize: DpSize = DpSize(40.dp, 40.dp),
) : TitleBarMetrics {

    override fun hashCode(): Int {
        var result = height.hashCode()
        result = 31 * result + gradientStartX.hashCode()
        result = 31 * result + gradientEndX.hashCode()
        result = 31 * result + titlePaneButtonSize.hashCode()
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IntUiTitleBarMetrics) return false

        if (height != other.height) return false
        if (gradientStartX != other.gradientStartX) return false
        if (gradientEndX != other.gradientEndX) return false
        if (titlePaneButtonSize != other.titlePaneButtonSize) return false

        return true
    }

    override fun toString(): String = "IntUiTitleBarMetrics(height=$height, " +
        "gradientStartX=$gradientStartX, " +
        "gradientEndX=$gradientEndX, " +
        "titlePaneButtonSize=$titlePaneButtonSize)"
}

class IntUiTitleBarIcons(
    override val minimizeButton: PainterProvider<DecoratedWindowState>,
    override val maximizeButton: PainterProvider<DecoratedWindowState>,
    override val restoreButton: PainterProvider<DecoratedWindowState>,
    override val closeButton: PainterProvider<DecoratedWindowState>,
) : TitleBarIcons {

    override fun hashCode(): Int {
        var result = minimizeButton.hashCode()
        result = 31 * result + maximizeButton.hashCode()
        result = 31 * result + restoreButton.hashCode()
        result = 31 * result + closeButton.hashCode()
        return result
    }

    override fun toString(): String = "IntUiTitleBarIcons(minimizeButton=$minimizeButton, " +
        "maximizeButton=$maximizeButton, " +
        "restoreButton=$restoreButton, " +
        "closeButton=$closeButton)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IntUiTitleBarIcons) return false

        if (minimizeButton != other.minimizeButton) return false
        if (maximizeButton != other.maximizeButton) return false
        if (restoreButton != other.restoreButton) return false
        if (closeButton != other.closeButton) return false

        return true
    }

    @OptIn(InternalJewelApi::class)
    companion object {

        @Composable
        fun minimize(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/minimize.svg",
        ): PainterProvider<DecoratedWindowState> = ResourcePainterProvider(
            basePath,
            svgLoader,
            IntelliJIconMapper,
            LocalIconData.current,
            TitleBarResourcePathPatcher(),
        )

        @Composable
        fun maximize(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/maximize.svg",
        ): PainterProvider<DecoratedWindowState> =
            ResourcePainterProvider(
                basePath,
                svgLoader,
                IntelliJIconMapper,
                LocalIconData.current,
                TitleBarResourcePathPatcher(),
            )

        @Composable
        fun restore(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/restore.svg",
        ): PainterProvider<DecoratedWindowState> =
            ResourcePainterProvider(
                basePath,
                svgLoader,
                IntelliJIconMapper,
                LocalIconData.current,
                TitleBarResourcePathPatcher(),
            )

        @Composable
        fun close(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/close.svg",
        ): PainterProvider<DecoratedWindowState> =
            ResourcePainterProvider(
                basePath,
                svgLoader,
                IntelliJIconMapper,
                LocalIconData.current,
                TitleBarResourcePathPatcher(),
            )
    }
}

@Composable
fun intUiTitleBarIcons(
    svgLoader: SvgLoader,
    minimize: PainterProvider<DecoratedWindowState> = IntUiTitleBarIcons.minimize(svgLoader),
    maximize: PainterProvider<DecoratedWindowState> = IntUiTitleBarIcons.maximize(svgLoader),
    restore: PainterProvider<DecoratedWindowState> = IntUiTitleBarIcons.restore(svgLoader),
    close: PainterProvider<DecoratedWindowState> = IntUiTitleBarIcons.close(svgLoader),
) = IntUiTitleBarIcons(minimize, maximize, restore, close)

private class TitleBarResourcePathPatcher(
    private val prefixTokensProvider: (state: DecoratedWindowState) -> String = { "" },
    private val suffixTokensProvider: (state: DecoratedWindowState) -> String = { "" },
) : SimpleResourcePathPatcher<DecoratedWindowState>() {

    @Composable
    override fun injectVariantTokens(extraData: DecoratedWindowState?): String = buildString {
        if (extraData == null) return@buildString

        append(prefixTokensProvider(extraData))

        if (!extraData.isActive) {
            append("Inactive")
        }

        append(suffixTokensProvider(extraData))
    }
}
