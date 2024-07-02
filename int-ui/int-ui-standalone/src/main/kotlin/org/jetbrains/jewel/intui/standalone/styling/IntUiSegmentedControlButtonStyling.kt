package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonColors
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonMetrics
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle

@Composable
public fun SegmentedControlButtonStyle.Companion.light(
    colors: SegmentedControlButtonColors = SegmentedControlButtonColors.light(),
    metrics: SegmentedControlButtonMetrics = SegmentedControlButtonMetrics.defaults(),
): SegmentedControlButtonStyle =
    SegmentedControlButtonStyle(colors, metrics)

@Composable
public fun SegmentedControlButtonStyle.Companion.dark(
    colors: SegmentedControlButtonColors = SegmentedControlButtonColors.dark(),
    metrics: SegmentedControlButtonMetrics = SegmentedControlButtonMetrics.defaults(),
): SegmentedControlButtonStyle =
    SegmentedControlButtonStyle(colors, metrics)

@Composable
public fun SegmentedControlButtonColors.Companion.light(
    background: Brush = SolidColor(IntUiLightTheme.colors.grey(13)),
    backgroundDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
    backgroundPressed: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
    backgroundHovered: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
    backgroundSelected: Brush = SolidColor(IntUiLightTheme.colors.grey(14)),
    content: Color = IntUiLightTheme.colors.grey(1),
    contentDisabled: Color = IntUiLightTheme.colors.grey(8),
    contentPressed: Color = content,
    contentHovered: Color = content,
    contentSelected: Color = content,
    border: Brush = SolidColor(Color.Transparent),
    borderDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(9)),
    borderPressed: Brush = border,
    borderHovered: Brush = border,
    borderSelected: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
): SegmentedControlButtonColors =
    SegmentedControlButtonColors(
        background = background,
        backgroundDisabled = backgroundDisabled,
        backgroundPressed = backgroundPressed,
        backgroundHovered = backgroundHovered,
        backgroundSelected = backgroundSelected,
        content = content,
        contentDisabled = contentDisabled,
        contentPressed = contentPressed,
        contentHovered = contentHovered,
        contentSelected = contentSelected,
        border = border,
        borderDisabled = borderDisabled,
        borderPressed = borderPressed,
        borderHovered = borderHovered,
        borderSelected = borderSelected,
    )

// TODO: This is incorrect
@Composable
public fun SegmentedControlButtonColors.Companion.dark(
    background: Brush = SolidColor(IntUiDarkTheme.colors.grey(3)),
    backgroundDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
    backgroundPressed: Brush = SolidColor(IntUiDarkTheme.colors.grey(4)),
    backgroundHovered: Brush = SolidColor(IntUiDarkTheme.colors.grey(4)),
    backgroundSelected: Brush = SolidColor(IntUiDarkTheme.colors.grey(2)),
    content: Color = IntUiDarkTheme.colors.grey(12),
    contentDisabled: Color = IntUiDarkTheme.colors.grey(8),
    contentPressed: Color = content,
    contentHovered: Color = content,
    contentSelected: Color = content,
    border: Brush = SolidColor(Color.Transparent),
    borderDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
    borderPressed: Brush = border,
    borderHovered: Brush = border,
    borderSelected: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
): SegmentedControlButtonColors =
    SegmentedControlButtonColors(
        background = background,
        backgroundDisabled = backgroundDisabled,
        backgroundPressed = backgroundPressed,
        backgroundHovered = backgroundHovered,
        backgroundSelected = backgroundSelected,
        content = content,
        contentDisabled = contentDisabled,
        contentPressed = contentPressed,
        contentHovered = contentHovered,
        contentSelected = contentSelected,
        border = border,
        borderDisabled = borderDisabled,
        borderPressed = borderPressed,
        borderHovered = borderHovered,
        borderSelected = borderSelected,
    )

public fun SegmentedControlButtonMetrics.Companion.defaults(
    cornerSize: CornerSize = CornerSize(4.dp),
    segmentedButtonPadding: PaddingValues = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
    minSize: DpSize = DpSize(72.dp, 28.dp),
    segmentedButtonContentSpacing: Dp = 4.dp,
    borderWidth: Dp = 1.dp
): SegmentedControlButtonMetrics =
    SegmentedControlButtonMetrics(cornerSize, segmentedButtonPadding, minSize, segmentedButtonContentSpacing, borderWidth)