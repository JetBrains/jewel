package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.LocalResourceLoader
import org.jetbrains.jewel.styling.TabColors
import org.jetbrains.jewel.styling.TabIcons
import org.jetbrains.jewel.styling.TabMetrics
import org.jetbrains.jewel.styling.TabStyle
import org.jetbrains.jewel.themes.intui.core.theme.IntUiLightTheme

data class IntUiTabStyle(
    override val colors: TabColors,
    override val metrics: TabMetrics,
    override val icons: TabIcons,
) : TabStyle {

    object Default {

        @Composable
        fun light(
            colors: TabColors = IntUiTabColors.Default.light(),
            metrics: TabMetrics = IntUiTabMetrics(),
            icons: TabIcons = IntUiTabIcons(),
        ) = IntUiTabStyle(colors, metrics, icons)

        @Composable
        fun dark(
            colors: TabColors = IntUiTabColors.Default.dark(),
            metrics: TabMetrics = IntUiTabMetrics(),
            icons: TabIcons = IntUiTabIcons(),
        ) = IntUiTabStyle(colors, metrics, icons)
    }

    object Editor {

        @Composable
        fun light(
            colors: TabColors = IntUiTabColors.Editor.light(),
            metrics: TabMetrics = IntUiTabMetrics(),
            icons: TabIcons = IntUiTabIcons(),
        ) = IntUiTabStyle(colors, metrics, icons)

        @Composable
        fun dark(
            colors: TabColors = IntUiTabColors.Editor.dark(),
            metrics: TabMetrics = IntUiTabMetrics(),
            icons: TabIcons = IntUiTabIcons(),
        ) = IntUiTabStyle(colors, metrics, icons)
    }
}

data class IntUiTabIcons(
    override val close: String = "icons/close.svg",
) : TabIcons {

    @Composable
    override fun closePainter(resourceLoader: ResourceLoader) = painterResource(close, LocalResourceLoader.current)
}

@Immutable
data class IntUiTabMetrics(
    override val underlineThickness: Dp = 3.dp,
    override val elementContentPadding: PaddingValues = PaddingValues(8.dp),
    override val closeContentGap: Dp = 8.dp,
    override val elementMinHeight: Dp = 40.dp,
) : TabMetrics

@Immutable
data class IntUiTabColors(
    override val tabBackground: Color,
    override val tabBackgroundHovered: Color,
    override val tabBackgroundHoveredFocused: Color,
    override val tabBackgroundHoveredSelected: Color,
    override val tabBackgroundHoveredFocusedSelected: Color,
    override val tabBackgroundFocused: Color,
    override val tabBackgroundFocusedSelected: Color,
    override val tabBackgroundSelected: Color,

    override val tabForeground: Color,
    override val tabForegroundHovered: Color,
    override val tabForegroundHoveredFocused: Color,
    override val tabForegroundHoveredSelected: Color,
    override val tabForegroundHoveredFocusedSelected: Color,
    override val tabForegroundFocused: Color,
    override val tabForegroundFocusedSelected: Color,
    override val tabForegroundSelected: Color,

    override val tabUnderline: Color,
    override val tabUnderlineHovered: Color,
    override val tabUnderlineHoveredFocused: Color,
    override val tabUnderlineHoveredSelected: Color,
    override val tabUnderlineHoveredFocusedSelected: Color,
    override val tabUnderlineFocused: Color,
    override val tabUnderlineFocusedSelected: Color,
    override val tabUnderlineSelected: Color,

    override val closeTint: Color,
    override val closeHoveredTint: Color,
    override val closeHoveredFocusedTint: Color,
    override val closeHoveredSelectedTint: Color,
    override val closeHoveredFocusedSelectedTint: Color,
    override val closeFocusedTint: Color,
    override val closeFocusedSelectedTint: Color,
    override val closeSelectedTint: Color,
) : TabColors {

    object Default {

        fun light(
            tabBackground: Color = Color.Unspecified,
            tabBackgroundHovered: Color = IntUiLightTheme.colors.grey(12),
            tabBackgroundHoveredFocused: Color = tabBackgroundHovered,
            tabBackgroundHoveredSelected: Color = tabBackgroundHovered,
            tabBackgroundHoveredFocusedSelected: Color = tabBackgroundHovered,
            tabBackgroundFocused: Color = Color.Unspecified,
            tabBackgroundFocusedSelected: Color = Color.Unspecified,
            tabBackgroundSelected: Color = Color.Unspecified,

            tabForeground: Color = IntUiLightTheme.colors.grey(1),
            tabForegroundHovered: Color = tabForeground,
            tabForegroundHoveredFocused: Color = tabForeground,
            tabForegroundHoveredSelected: Color = tabForeground,
            tabForegroundHoveredFocusedSelected: Color = tabForeground,
            tabForegroundFocused: Color = tabForeground,
            tabForegroundFocusedSelected: Color = tabForeground,
            tabForegroundSelected: Color = tabForeground,

            tabUnderline: Color = Color.Unspecified,
            tabUnderlineHovered: Color = tabUnderline,
            tabUnderlineHoveredFocused: Color = tabUnderline,
            tabUnderlineHoveredSelected: Color = IntUiLightTheme.colors.grey(8),
            tabUnderlineHoveredFocusedSelected: Color = IntUiLightTheme.colors.blue(4),
            tabUnderlineFocused: Color = tabUnderline,
            tabUnderlineFocusedSelected: Color = tabUnderlineHoveredFocusedSelected,
            tabUnderlineSelected: Color = IntUiLightTheme.colors.grey(8),

            closeTint: Color = tabForeground,
            closeHoveredTint: Color = closeTint,
            closeHoveredFocusedTint: Color = closeTint,
            closeHoveredSelectedTint: Color = closeTint,
            closeHoveredFocusedSelectedTint: Color = closeTint,
            closeFocusedTint: Color = closeTint,
            closeFocusedSelectedTint: Color = closeTint,
            closeSelectedTint: Color = closeTint,
        ) = IntUiTabColors(
            tabBackground,
            tabBackgroundHovered,
            tabBackgroundHoveredFocused,
            tabBackgroundHoveredSelected,
            tabBackgroundHoveredFocusedSelected,
            tabBackgroundFocused,
            tabBackgroundFocusedSelected,
            tabBackgroundSelected,
            tabForeground,
            tabForegroundHovered,
            tabForegroundHoveredFocused,
            tabForegroundHoveredSelected,
            tabForegroundHoveredFocusedSelected,
            tabForegroundFocused,
            tabForegroundFocusedSelected,
            tabForegroundSelected,
            tabUnderline,
            tabUnderlineHovered,
            tabUnderlineHoveredFocused,
            tabUnderlineHoveredSelected,
            tabUnderlineHoveredFocusedSelected,
            tabUnderlineFocused,
            tabUnderlineFocusedSelected,
            tabUnderlineSelected,
            closeTint,
            closeHoveredTint,
            closeHoveredFocusedTint,
            closeHoveredSelectedTint,
            closeHoveredFocusedSelectedTint,
            closeFocusedTint,
            closeFocusedSelectedTint,
            closeSelectedTint
        )

        fun dark(
            tabBackground: Color = Color.Unspecified,
            tabBackgroundHovered: Color = IntUiLightTheme.colors.grey(4),
            tabBackgroundHoveredFocused: Color = tabBackgroundHovered,
            tabBackgroundHoveredSelected: Color = tabBackgroundHovered,
            tabBackgroundHoveredFocusedSelected: Color = tabBackgroundHovered,
            tabBackgroundFocused: Color = Color.Unspecified,
            tabBackgroundFocusedSelected: Color = Color.Unspecified,
            tabBackgroundSelected: Color = Color.Unspecified,

            tabForeground: Color = IntUiLightTheme.colors.grey(14),
            tabForegroundHovered: Color = tabForeground,
            tabForegroundHoveredFocused: Color = tabForeground,
            tabForegroundHoveredSelected: Color = tabForeground,
            tabForegroundHoveredFocusedSelected: Color = tabForeground,
            tabForegroundFocused: Color = tabForeground,
            tabForegroundFocusedSelected: Color = tabForeground,
            tabForegroundSelected: Color = tabForeground,


            tabUnderline: Color = Color.Unspecified,
            tabUnderlineHovered: Color = tabUnderline,
            tabUnderlineHoveredFocused: Color = tabUnderline,
            tabUnderlineHoveredSelected: Color = IntUiLightTheme.colors.grey(8),
            tabUnderlineHoveredFocusedSelected: Color = IntUiLightTheme.colors.blue(6),
            tabUnderlineFocused: Color = tabUnderline,
            tabUnderlineFocusedSelected: Color = tabUnderlineHoveredFocusedSelected,
            tabUnderlineSelected: Color = tabUnderlineHoveredSelected,

            closeTint: Color = IntUiLightTheme.colors.grey(14),
            closeHoveredTint: Color = closeTint,
            closeHoveredFocusedTint: Color = closeTint,
            closeHoveredSelectedTint: Color = closeTint,
            closeHoveredFocusedSelectedTint: Color = closeTint,
            closeFocusedTint: Color = closeTint,
            closeFocusedSelectedTint: Color = closeTint,
            closeSelectedTint: Color = closeTint,
        ) = IntUiTabColors(
            tabBackground,
            tabBackgroundHovered,
            tabBackgroundHoveredFocused,
            tabBackgroundHoveredSelected,
            tabBackgroundHoveredFocusedSelected,
            tabBackgroundFocused,
            tabBackgroundFocusedSelected,
            tabBackgroundSelected,
            tabForeground,
            tabForegroundHovered,
            tabForegroundHoveredFocused,
            tabForegroundHoveredSelected,
            tabForegroundHoveredFocusedSelected,
            tabForegroundFocused,
            tabForegroundFocusedSelected,
            tabForegroundSelected,
            tabUnderline,
            tabUnderlineHovered,
            tabUnderlineHoveredFocused,
            tabUnderlineHoveredSelected,
            tabUnderlineHoveredFocusedSelected,
            tabUnderlineFocused,
            tabUnderlineFocusedSelected,
            tabUnderlineSelected,
            closeTint,
            closeHoveredTint,
            closeHoveredFocusedTint,
            closeHoveredSelectedTint,
            closeHoveredFocusedSelectedTint,
            closeFocusedTint,
            closeFocusedSelectedTint,
            closeSelectedTint
        )
    }

    object Editor {

        fun light(
            tabBackground: Color = Color.Transparent,
            tabBackgroundHovered: Color = tabBackground,
            tabBackgroundHoveredFocused: Color = tabBackground,
            tabBackgroundHoveredSelected: Color = tabBackground,
            tabBackgroundHoveredFocusedSelected: Color = tabBackground,
            tabBackgroundFocused: Color = tabBackground,
            tabBackgroundFocusedSelected: Color = tabBackground,
            tabBackgroundSelected: Color = tabBackground,

            tabForeground: Color = IntUiLightTheme.colors.grey(3),
            tabForegroundHovered: Color = IntUiLightTheme.colors.grey(1),
            tabForegroundHoveredFocused: Color = tabBackgroundHovered,
            tabForegroundHoveredSelected: Color = tabForeground,
            tabForegroundHoveredFocusedSelected: Color = tabForegroundHovered,
            tabForegroundFocused: Color = tabForegroundHovered,
            tabForegroundFocusedSelected: Color = tabForegroundHovered,
            tabForegroundSelected: Color = tabForeground,

            tabUnderline: Color = Color.Unspecified,
            tabUnderlineHovered: Color = tabUnderline,
            tabUnderlineHoveredFocused: Color = tabUnderline,
            tabUnderlineHoveredSelected: Color = IntUiLightTheme.colors.grey(8),
            tabUnderlineHoveredFocusedSelected: Color = IntUiLightTheme.colors.blue(4),
            tabUnderlineFocused: Color = tabUnderline,
            tabUnderlineFocusedSelected: Color = tabUnderlineHoveredFocusedSelected,
            tabUnderlineSelected: Color = tabUnderlineHoveredSelected,

            closeTint: Color = Color.Transparent,
            closeHoveredTint: Color = IntUiLightTheme.colors.grey(1),
            closeHoveredFocusedTint: Color = closeHoveredTint,
            closeHoveredSelectedTint: Color = closeHoveredTint,
            closeHoveredFocusedSelectedTint: Color = closeHoveredTint,
            closeFocusedTint: Color = closeTint,
            closeFocusedSelectedTint: Color = closeHoveredTint,
            closeSelectedTint: Color = closeHoveredTint,
        ) = IntUiTabColors(
            tabBackground = tabBackground,
            tabBackgroundHovered = tabBackgroundHovered,
            tabBackgroundHoveredFocused = tabBackgroundHoveredFocused,
            tabBackgroundHoveredSelected = tabBackgroundHoveredSelected,
            tabBackgroundHoveredFocusedSelected = tabBackgroundHoveredFocusedSelected,
            tabBackgroundFocused = tabBackgroundFocused,
            tabBackgroundFocusedSelected = tabBackgroundFocusedSelected,
            tabBackgroundSelected = tabBackgroundSelected,
            tabForeground = tabForeground,
            tabForegroundHovered = tabForegroundHovered,
            tabForegroundHoveredFocused = tabForegroundHoveredFocused,
            tabForegroundHoveredSelected = tabForegroundHoveredSelected,
            tabForegroundHoveredFocusedSelected = tabForegroundHoveredFocusedSelected,
            tabForegroundFocused = tabForegroundFocused,
            tabForegroundFocusedSelected = tabForegroundFocusedSelected,
            tabForegroundSelected = tabForegroundSelected,
            tabUnderline = tabUnderline,
            tabUnderlineHovered = tabUnderlineHovered,
            tabUnderlineHoveredFocused = tabUnderlineHoveredFocused,
            tabUnderlineHoveredSelected = tabUnderlineHoveredSelected,
            tabUnderlineHoveredFocusedSelected = tabUnderlineHoveredFocusedSelected,
            tabUnderlineFocused = tabUnderlineFocused,
            tabUnderlineFocusedSelected = tabUnderlineFocusedSelected,
            tabUnderlineSelected = tabUnderlineSelected,
            closeTint = closeTint,
            closeHoveredTint = closeHoveredTint,
            closeHoveredFocusedTint = closeHoveredFocusedTint,
            closeHoveredSelectedTint = closeHoveredSelectedTint,
            closeHoveredFocusedSelectedTint = closeHoveredFocusedSelectedTint,
            closeFocusedTint = closeFocusedTint,
            closeFocusedSelectedTint = closeFocusedSelectedTint,
            closeSelectedTint = closeSelectedTint
        )

        fun dark(
            tabBackground: Color = Color.Unspecified,
            tabBackgroundHovered: Color = IntUiLightTheme.colors.grey(4),
            tabBackgroundHoveredFocused: Color = tabBackgroundHovered,
            tabBackgroundHoveredSelected: Color = tabBackgroundHovered,
            tabBackgroundHoveredFocusedSelected: Color = tabBackgroundHovered,
            tabBackgroundFocused: Color = Color.Unspecified,
            tabBackgroundFocusedSelected: Color = Color.Unspecified,
            tabBackgroundSelected: Color = Color.Unspecified,

            tabForeground: Color = IntUiLightTheme.colors.grey(1),
            tabForegroundHovered: Color = tabForeground,
            tabForegroundHoveredFocused: Color = tabForeground,
            tabForegroundHoveredSelected: Color = tabForeground,
            tabForegroundHoveredFocusedSelected: Color = tabForeground,
            tabForegroundFocused: Color = tabForeground,
            tabForegroundFocusedSelected: Color = tabForeground,
            tabForegroundSelected: Color = tabForeground,

            tabUnderline: Color = Color.Unspecified,
            tabUnderlineHovered: Color = tabUnderline,
            tabUnderlineHoveredFocused: Color = tabUnderline,
            tabUnderlineHoveredSelected: Color = IntUiLightTheme.colors.grey(8),
            tabUnderlineHoveredFocusedSelected: Color = IntUiLightTheme.colors.blue(6),
            tabUnderlineFocused: Color = tabUnderline,
            tabUnderlineFocusedSelected: Color = tabUnderlineHoveredFocusedSelected,
            tabUnderlineSelected: Color = tabUnderlineHoveredSelected,

            closeTint: Color = IntUiLightTheme.colors.grey(14),
            closeHoveredTint: Color = closeTint,
            closeHoveredFocusedTint: Color = closeTint,
            closeHoveredSelectedTint: Color = closeTint,
            closeHoveredFocusedSelectedTint: Color = closeTint,
            closeFocusedTint: Color = closeTint,
            closeFocusedSelectedTint: Color = closeTint,
            closeSelectedTint: Color = closeTint,
        ) = IntUiTabColors(
            tabBackground,
            tabBackgroundHovered,
            tabBackgroundHoveredFocused,
            tabBackgroundHoveredSelected,
            tabBackgroundHoveredFocusedSelected,
            tabBackgroundFocused,
            tabBackgroundFocusedSelected,
            tabBackgroundSelected,
            tabForeground,
            tabForegroundHovered,
            tabForegroundHoveredFocused,
            tabForegroundHoveredSelected,
            tabForegroundHoveredFocusedSelected,
            tabForegroundFocused,
            tabForegroundFocusedSelected,
            tabForegroundSelected,
            tabUnderline,
            tabUnderlineHovered,
            tabUnderlineHoveredFocused,
            tabUnderlineHoveredSelected,
            tabUnderlineHoveredFocusedSelected,
            tabUnderlineFocused,
            tabUnderlineFocusedSelected,
            tabUnderlineSelected,
            closeTint,
            closeHoveredTint,
            closeHoveredFocusedTint,
            closeHoveredSelectedTint,
            closeHoveredFocusedSelectedTint,
            closeFocusedTint,
            closeFocusedSelectedTint,
            closeSelectedTint
        )
    }
}
