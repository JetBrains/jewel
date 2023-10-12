package org.jetbrains.jewel.intui.window.styling

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.InternalJewelApi
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.styling.IntUiIconButtonColors
import org.jetbrains.jewel.intui.standalone.styling.IntUiIconButtonMetrics
import org.jetbrains.jewel.intui.standalone.styling.IntUiIconButtonStyle
import org.jetbrains.jewel.styling.IconButtonStyle
import org.jetbrains.jewel.styling.PainterProvider
import org.jetbrains.jewel.styling.ResourcePainterProvider
import org.jetbrains.jewel.styling.SimpleResourcePathPatcher
import org.jetbrains.jewel.window.TitleBarState
import org.jetbrains.jewel.window.styling.TitleBarColors
import org.jetbrains.jewel.window.styling.TitleBarIcons
import org.jetbrains.jewel.window.styling.TitleBarMetrics
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Stable data class IntUiTitleBarStyle(
    override val colors: IntUiTitleBarColors,
    override val metrics: IntUiTitleBarMetrics,
    override val icons: TitleBarIcons,
) : TitleBarStyle {

    override fun iconButtonStyle(): IconButtonStyle {
        return IntUiIconButtonStyle(
            IntUiIconButtonColors(
                Color.Transparent,
                Color.Transparent,
                Color.Transparent,
                colors.iconButtonPressBackground,
                colors.iconButtonHoverBackground,
            ),
            IntUiIconButtonMetrics(),
        )
    }

    override fun paneButtonStyle(): IconButtonStyle {
        return IntUiIconButtonStyle(
            IntUiIconButtonColors(
                Color.Transparent,
                Color.Transparent,
                Color.Transparent,
                colors.titlePaneButtonPressBackground,
                colors.titlePaneButtonHoverBackground,
            ),
            IntUiIconButtonMetrics(CornerSize(0.dp)),
        )
    }

    override fun paneCloseButtonStyle(): IconButtonStyle {
        return IntUiIconButtonStyle(
            IntUiIconButtonColors(
                Color.Transparent,
                Color.Transparent,
                Color.Transparent,
                colors.titlePaneCloseButtonPressBackground,
                colors.titlePaneCloseButtonHoverBackground,
            ),
            IntUiIconButtonMetrics(CornerSize(0.dp)),
        )
    }

    companion object {

        @Composable fun light(
            svgLoader: SvgLoader,
            intUiTitleBarColors: IntUiTitleBarColors = IntUiTitleBarColors.light(),
            intUiTitleBarMetrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
            intUiTitleBarIcons: IntUiTitleBarIcons = intUiTitleBarIcons(svgLoader),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(
            colors = intUiTitleBarColors,
            metrics = intUiTitleBarMetrics,
            icons = intUiTitleBarIcons,
        )

        @Composable fun lightWithLightHeader(
            svgLoader: SvgLoader,
            intUiTitleBarColors: IntUiTitleBarColors = IntUiTitleBarColors.lightWithLightHeader(),
            intUiTitleBarMetrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
            intUiTitleBarIcons: IntUiTitleBarIcons = intUiTitleBarIcons(svgLoader),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(
            colors = intUiTitleBarColors,
            metrics = intUiTitleBarMetrics,
            icons = intUiTitleBarIcons,
        )

        @Composable fun dark(
            svgLoader: SvgLoader,
            intUiTitleBarColors: IntUiTitleBarColors = IntUiTitleBarColors.dark(),
            intUiTitleBarMetrics: IntUiTitleBarMetrics = IntUiTitleBarMetrics(),
            intUiTitleBarIcons: IntUiTitleBarIcons = intUiTitleBarIcons(svgLoader),
        ): IntUiTitleBarStyle = IntUiTitleBarStyle(
            colors = intUiTitleBarColors,
            metrics = intUiTitleBarMetrics,
            icons = intUiTitleBarIcons,
        )
    }
}

@Stable data class IntUiTitleBarColors(
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

    companion object {

        @Composable fun light(
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

        @Composable fun lightWithLightHeader(
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

        @Composable fun dark(
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

@Stable data class IntUiTitleBarMetrics(
    override val height: Dp = 40.dp,
    override val gradientStartX: Dp = (-100).dp,
    override val gradientEndX: Dp = 400.dp,
    override val titlePaneButtonSize: DpSize = DpSize(40.dp, 40.dp),
) : TitleBarMetrics

@Immutable data class IntUiTitleBarIcons(
    override val minimizeButton: PainterProvider<TitleBarState>,
    override val maximizeButton: PainterProvider<TitleBarState>,
    override val restoreButton: PainterProvider<TitleBarState>,
    override val closeButton: PainterProvider<TitleBarState>,
) : TitleBarIcons {

    @OptIn(InternalJewelApi::class)
    companion object {

        @Composable fun minimize(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/minimize.svg",
        ): PainterProvider<TitleBarState> = ResourcePainterProvider(basePath, svgLoader, TitleBarResourcePathPatcher())

        @Composable fun maximize(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/maximize.svg",
        ): PainterProvider<TitleBarState> = ResourcePainterProvider(basePath, svgLoader, TitleBarResourcePathPatcher())

        @Composable fun restore(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/restore.svg",
        ): PainterProvider<TitleBarState> = ResourcePainterProvider(basePath, svgLoader, TitleBarResourcePathPatcher())

        @Composable fun close(
            svgLoader: SvgLoader,
            basePath: String = "icons/intui/window/close.svg",
        ): PainterProvider<TitleBarState> = ResourcePainterProvider(basePath, svgLoader, TitleBarResourcePathPatcher())
    }
}

@Composable fun intUiTitleBarIcons(
    svgLoader: SvgLoader,
    minimize: PainterProvider<TitleBarState> = IntUiTitleBarIcons.minimize(svgLoader),
    maximize: PainterProvider<TitleBarState> = IntUiTitleBarIcons.maximize(svgLoader),
    restore: PainterProvider<TitleBarState> = IntUiTitleBarIcons.restore(svgLoader),
    close: PainterProvider<TitleBarState> = IntUiTitleBarIcons.close(svgLoader),
) = IntUiTitleBarIcons(minimize, maximize, restore, close)

private class TitleBarResourcePathPatcher(
    private val prefixTokensProvider: (state: TitleBarState) -> String = { "" },
    private val suffixTokensProvider: (state: TitleBarState) -> String = { "" },
) : SimpleResourcePathPatcher<TitleBarState>() {

    @Composable override fun injectAdditionalTokens(extraData: TitleBarState?): String = buildString {
        if (extraData == null) return@buildString

        append(prefixTokensProvider(extraData))

        if (!extraData.isActive) {
            append("Inactive")
        }

        append(suffixTokensProvider(extraData))
    }
}
