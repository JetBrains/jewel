package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ui.component.styling.ScrollbarColors
import org.jetbrains.jewel.ui.component.styling.ScrollbarMetrics

// Reference: com.intellij.ui.components.ScrollBarPainter
public fun ScrollbarColors.Companion.MacLight(
    thumbBackground: Color = Color(0x00000000),
    thumbBackgroundHovered: Color = Color(0x80000000),
    thumbBackgroundPressed: Color = Color(0x80000000),
    thumbBorder: Color = Color(0x33000000),
    thumbBorderHovered: Color = Color(0x80000000),
    thumbBorderPressed: Color = Color(0x80000000),
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
): ScrollbarColors = ScrollbarColors(
    thumbBackground,
    thumbBackgroundHovered,
    thumbBackgroundPressed,
    thumbBorder,
    thumbBorderHovered,
    thumbBorderPressed,
    trackBackground,
    trackBackgroundHovered
)

// Reference: com.intellij.ui.components.ScrollBarPainter
public fun ScrollbarColors.Companion.light(
    thumbBackground: Color = Color(0x33737373),
    thumbBackgroundHovered: Color = Color(0x47737373),
    thumbBackgroundPressed: Color = Color(0x47737373),
    thumbBorder: Color = Color(0x33595959),
    thumbBorderHovered: Color = Color(0x47595959),
    thumbBorderPressed: Color = Color(0x47595959),
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x00808080),
): ScrollbarColors = ScrollbarColors(
    thumbBackground,
    thumbBackgroundHovered,
    thumbBackgroundPressed,
    thumbBorder,
    thumbBorderHovered,
    thumbBorderPressed,
    trackBackground,
    trackBackgroundHovered
)

// Reference: com.intellij.ui.components.ScrollBarPainter
public fun ScrollbarColors.Companion.dark(
    thumbBackground: Color = Color(0x47A6A6A6),
    thumbBackgroundHovered: Color = Color(0x59A6A6A6),
    thumbBackgroundPressed: Color = Color(0x59A6A6A6),
    thumbBorder: Color = Color(0x47383838),
    thumbBorderHovered: Color = Color(0x59383838),
    thumbBorderPressed: Color = Color(0x59383838),
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x00808080),
): ScrollbarColors = ScrollbarColors(
    thumbBackground,
    thumbBackgroundHovered,
    thumbBackgroundPressed,
    thumbBorder,
    thumbBorderHovered,
    thumbBorderPressed,
    trackBackground,
    trackBackgroundHovered
)

// Reference: com.intellij.ui.components.ScrollBarPainter
public fun ScrollbarColors.Companion.MacDark(
    thumbBackground: Color = Color(0x59808080),
    thumbBackgroundHovered: Color = Color(0x8C808080),
    thumbBackgroundPressed: Color = Color(0x8C808080),
    thumbBorder: Color = Color(0x00262626),
    thumbBorderHovered: Color = Color(0x8C262626),
    thumbBorderPressed: Color = Color(0x8C262626),
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
): ScrollbarColors = ScrollbarColors(
    thumbBackground,
    thumbBackgroundHovered,
    thumbBackgroundPressed,
    thumbBorder,
    thumbBorderHovered,
    thumbBorderPressed,
    trackBackground,
    trackBackgroundHovered
)

public fun ScrollbarMetrics.Companion.macOs(
    thumbCornerSize: CornerSize = CornerSize(100),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(2.dp),
    thumbThicknessExpanded: Dp = 14.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(2.dp),
): ScrollbarMetrics = ScrollbarMetrics(
    thumbCornerSize,
    thumbThickness,
    thumbThicknessExpanded,
    minThumbLength,
    trackPadding,
    trackPaddingExpanded
)

public fun ScrollbarMetrics.Companion.windows(
    thumbCornerSize: CornerSize = CornerSize(0),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 16.dp,
    trackPadding: PaddingValues = PaddingValues(horizontal = 0.dp),
    thumbThicknessExpanded: Dp = 8.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(horizontal = 0.dp),
): ScrollbarMetrics = ScrollbarMetrics(
    thumbCornerSize,
    thumbThickness,
    thumbThicknessExpanded,
    minThumbLength,
    trackPadding,
    trackPaddingExpanded
)

public fun ScrollbarMetrics.Companion.linux(
    thumbCornerSize: CornerSize = CornerSize(0),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 16.dp,
    trackPadding: PaddingValues = PaddingValues(horizontal = 0.dp),
    thumbThicknessExpanded: Dp = 8.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(horizontal = 0.dp),
): ScrollbarMetrics = ScrollbarMetrics(
    thumbCornerSize,
    thumbThickness,
    thumbThicknessExpanded,
    minThumbLength,
    trackPadding,
    trackPaddingExpanded
)
