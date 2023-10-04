package org.jetbrains.jewel

import androidx.compose.foundation.TooltipArea
import androidx.compose.foundation.TooltipPlacement
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styling.TooltipStyle

@Composable
fun Tooltip(
    modifier: Modifier = Modifier,
    tooltipPlacement: TooltipPlacement = TooltipPlacement.ComponentRect(
        alignment = Alignment.CenterEnd,
        anchor = Alignment.BottomEnd,
        offset = DpOffset(4.dp, 4.dp),
    ),
    style: TooltipStyle = IntelliJTheme.tooltipStyle,
    tooltip: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    TooltipArea(
        tooltip = {
            CompositionLocalProvider(
                LocalContentColor provides style.colors.contentColor,
            ) {
                Box(
                    modifier = Modifier
                        .background(style.colors.backgroundColor, RoundedCornerShape(8.dp))
                        .border(1.dp, style.colors.borderColor, shape = RoundedCornerShape(8.dp))
                        .padding(style.metrics.paddingValues),
                ) {
                    tooltip()
                }
            }
        },
        modifier = modifier,
        delayMillis = style.metrics.showDelay.inWholeMilliseconds.toInt(),
        tooltipPlacement = tooltipPlacement,
        content = content,
    )
}
