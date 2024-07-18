package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ui.component.styling.ScrollbarMetrics

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
    thumbCornerSize: CornerSize = CornerSize(100),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(2.dp),
    thumbThicknessExpanded: Dp = 14.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(2.dp),
): ScrollbarMetrics = ScrollbarMetrics.windows()
