package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styling.ChipColors
import org.jetbrains.jewel.styling.ChipMetrics
import org.jetbrains.jewel.styling.ChipStyle
import org.jetbrains.jewel.themes.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.themes.intui.core.theme.IntUiLightTheme

@Stable
data class IntUiChipStyle(
    override val colors: IntUiChipColors,
    override val metrics: IntUiChipMetrics,
) : ChipStyle {

    companion object {

        @Composable
        fun light(
            colors: IntUiChipColors = IntUiChipColors.light(),
            metrics: IntUiChipMetrics = IntUiChipMetrics(),
        ) = IntUiChipStyle(colors, metrics)

        @Composable
        fun dark(
            colors: IntUiChipColors = IntUiChipColors.dark(),
            metrics: IntUiChipMetrics = IntUiChipMetrics(),
        ) = IntUiChipStyle(colors, metrics)
    }
}

@Immutable
data class IntUiChipColors(
    override val background: Brush,
    override val backgroundDisabled: Brush,
    override val backgroundFocused: Brush,
    override val backgroundPressed: Brush,
    override val backgroundHovered: Brush,
    override val backgroundSelected: Brush,
    override val backgroundSelectedDisabled: Brush,
    override val backgroundSelectedPressed: Brush,
    override val backgroundSelectedFocused: Brush,
    override val backgroundSelectedHovered: Brush,
    override val content: Color,
    override val contentDisabled: Color,
    override val contentFocused: Color,
    override val contentPressed: Color,
    override val contentHovered: Color,
    override val contentSelected: Color,
    override val contentSelectedDisabled: Color,
    override val contentSelectedPressed: Color,
    override val contentSelectedFocused: Color,
    override val contentSelectedHovered: Color,
    override val border: Brush,
    override val borderDisabled: Brush,
    override val borderFocused: Brush,
    override val borderPressed: Brush,
    override val borderHovered: Brush,
    override val borderSelected: Brush,
    override val borderSelectedDisabled: Brush,
    override val borderSelectedPressed: Brush,
    override val borderSelectedFocused: Brush,
    override val borderSelectedHovered: Brush,
) : ChipColors {

    companion object {

        @Composable
        fun light(
            background: Brush = SolidColor(IntUiLightTheme.colors.grey(14)),
            backgroundDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
            backgroundFocused: Brush = background,
            backgroundPressed: Brush = SolidColor(IntUiLightTheme.colors.grey(13)),
            backgroundHovered: Brush = background,
            backgroundSelected: Brush = background,
            backgroundSelectedDisabled: Brush = backgroundDisabled,
            backgroundSelectedFocused: Brush = background,
            backgroundSelectedPressed: Brush = background,
            backgroundSelectedHovered: Brush = background,
            content: Color = IntUiLightTheme.colors.grey(1),
            contentDisabled: Color = IntUiLightTheme.colors.grey(8),
            contentFocused: Color = content,
            contentPressed: Color = content,
            contentHovered: Color = content,
            contentSelected: Color = content,
            contentSelectedDisabled: Color = contentDisabled,
            contentSelectedFocused: Color = content,
            contentSelectedPressed: Color = content,
            contentSelectedHovered: Color = content,
            border: Brush = SolidColor(IntUiLightTheme.colors.grey(9)),
            borderDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(6)),
            borderFocused: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
            borderPressed: Brush = SolidColor(IntUiLightTheme.colors.grey(7)),
            borderHovered: Brush = SolidColor(IntUiLightTheme.colors.grey(8)),
            borderSelected: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
            borderSelectedDisabled: Brush = borderSelected,
            borderSelectedFocused: Brush = borderSelected,
            borderSelectedPressed: Brush = borderSelected,
            borderSelectedHovered: Brush = borderSelected,
        ) = IntUiChipColors(
            background,
            backgroundDisabled,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundSelected,
            backgroundSelectedDisabled,
            backgroundSelectedPressed,
            backgroundSelectedFocused,
            backgroundSelectedHovered,
            content,
            contentDisabled,
            contentFocused,
            contentPressed,
            contentHovered,
            contentSelected,
            contentSelectedDisabled,
            contentSelectedPressed,
            contentSelectedFocused,
            contentSelectedHovered,
            border,
            borderDisabled,
            borderFocused,
            borderPressed,
            borderHovered,
            borderSelected,
            borderSelectedDisabled,
            borderSelectedPressed,
            borderSelectedFocused,
            borderSelectedHovered,
        )

        @Composable
        fun dark(
            background: Brush = SolidColor(IntUiDarkTheme.colors.grey(2)),
            backgroundDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
            backgroundFocused: Brush = background,
            backgroundPressed: Brush = background,
            backgroundHovered: Brush = background,
            backgroundSelected: Brush = background,
            backgroundSelectedDisabled: Brush = backgroundDisabled,
            backgroundSelectedFocused: Brush = background,
            backgroundSelectedPressed: Brush = background,
            backgroundSelectedHovered: Brush = background,
            content: Color = IntUiDarkTheme.colors.grey(12),
            contentDisabled: Color = IntUiDarkTheme.colors.grey(8),
            contentFocused: Color = content,
            contentPressed: Color = content,
            contentHovered: Color = content,
            contentSelected: Color = content,
            contentSelectedDisabled: Color = contentDisabled,
            contentSelectedFocused: Color = content,
            contentSelectedPressed: Color = content,
            contentSelectedHovered: Color = content,
            border: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
            borderDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(6)),
            borderFocused: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
            borderPressed: Brush = SolidColor(IntUiDarkTheme.colors.grey(7)),
            borderHovered: Brush = borderPressed,
            borderSelected: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
            borderSelectedDisabled: Brush = borderSelected,
            borderSelectedFocused: Brush = borderSelected,
            borderSelectedPressed: Brush = borderSelected,
            borderSelectedHovered: Brush = borderSelected,
        ) = IntUiChipColors(
            background,
            backgroundDisabled,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundSelected,
            backgroundSelectedDisabled,
            backgroundSelectedPressed,
            backgroundSelectedFocused,
            backgroundSelectedHovered,
            content,
            contentDisabled,
            contentFocused,
            contentPressed,
            contentHovered,
            contentSelected,
            contentSelectedDisabled,
            contentSelectedPressed,
            contentSelectedFocused,
            contentSelectedHovered,
            border,
            borderDisabled,
            borderFocused,
            borderPressed,
            borderHovered,
            borderSelected,
            borderSelectedDisabled,
            borderSelectedPressed,
            borderSelectedFocused,
            borderSelectedHovered,
        )
    }
}

@Stable
data class IntUiChipMetrics(
    override val cornerSize: CornerSize = CornerSize(6.dp),
    override val padding: PaddingValues = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
    override val borderWidth: Dp = 1.dp,
    override val borderWidthSelected: Dp = 2.dp,
) : ChipMetrics
