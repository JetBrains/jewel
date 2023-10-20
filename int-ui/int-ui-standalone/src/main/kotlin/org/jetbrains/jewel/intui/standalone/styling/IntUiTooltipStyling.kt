package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.styling.TooltipColors
import org.jetbrains.jewel.styling.TooltipMetrics
import org.jetbrains.jewel.styling.TooltipStyle
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun TooltipStyle.Companion.light(
    intUiTooltipColors: TooltipColors = TooltipColors.light(),
    intUiTooltipMetrics: TooltipMetrics = TooltipMetrics.defaults(),
): TooltipStyle = TooltipStyle(
    colors = intUiTooltipColors,
    metrics = intUiTooltipMetrics,
)

@Composable
fun TooltipStyle.Companion.dark(
    intUiTooltipColors: TooltipColors = TooltipColors.dark(),
    intUiTooltipMetrics: TooltipMetrics = TooltipMetrics.defaults(),
): TooltipStyle = TooltipStyle(
    colors = intUiTooltipColors,
    metrics = intUiTooltipMetrics,
)

@Composable
fun TooltipColors.Companion.light(
    backgroundColor: Color = IntUiLightTheme.colors.grey(2),
    contentColor: Color = IntUiLightTheme.colors.grey(12),
    borderColor: Color = backgroundColor,
    shadow: Color = Color(0x78919191), // Not a palette color
) = TooltipColors(backgroundColor, contentColor, borderColor, shadow)

@Composable
fun TooltipColors.Companion.dark(
    backgroundColor: Color = IntUiDarkTheme.colors.grey(2),
    contentColor: Color = IntUiDarkTheme.colors.grey(12),
    borderColor: Color = IntUiDarkTheme.colors.grey(3),
    shadow: Color = Color(0x66000000), // Not a palette color
) = TooltipColors(backgroundColor, contentColor, borderColor, shadow)

fun TooltipMetrics.Companion.defaults(
    contentPadding: PaddingValues = PaddingValues(vertical = 9.dp, horizontal = 12.dp),
    showDelay: Duration = 0.milliseconds,
    cornerSize: CornerSize = CornerSize(5.dp),
    borderWidth: Dp = 1.dp,
    shadowSize: Dp = 12.dp,
    tooltipOffset: DpOffset = DpOffset(0.dp, 20.dp),
    tooltipAlignment: Alignment.Horizontal = Alignment.Start,
) = TooltipMetrics(contentPadding, showDelay, cornerSize, borderWidth, shadowSize, tooltipOffset, tooltipAlignment)
