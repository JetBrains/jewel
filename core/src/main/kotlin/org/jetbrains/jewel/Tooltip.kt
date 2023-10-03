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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styling.TooltipStyle

@Composable
fun Tooltip(
    tooltip: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    delayMillis: Int = 500,
    tooltipPlacement: TooltipPlacement = TooltipPlacement.CursorPoint(offset = DpOffset(0.dp, 16.dp)),
    style: TooltipStyle = IntelliJTheme.tooltipStyle,
    content: @Composable () -> Unit
) {
    TooltipArea(
        tooltip = {
            CompositionLocalProvider(
                LocalContentColor provides style.colors.contentColor,
            ) {
                Box(
                    modifier = Modifier
                        .background(style.colors.backgroundColor)
                        .clip(
                            RoundedCornerShape(8.dp)
                        )
                        .border(1.dp, Color.Red)
                        .padding(style.metrics.paddingValues)
                ) {
                    tooltip()
                }
            }
        },
        modifier = modifier,
        delayMillis = delayMillis,
        tooltipPlacement = tooltipPlacement,
        content = content
    )
}
