package org.jetbrains.jewel.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styles.LocalProgressBarStyle
import org.jetbrains.jewel.styles.ProgressBarState
import org.jetbrains.jewel.styles.ProgressBarStyle

@Composable
fun ProgressBar(
    modifier: Modifier = Modifier,
    progress: Float,
    style: ProgressBarStyle = LocalProgressBarStyle.current
) {
    val appearance = remember(style) { style.appearance(ProgressBarState) }
    Canvas(
        modifier.progressSemantics(progress).size(200.dp, 4.dp)
    ) {
        val strokeWidth = size.height
        val length = size.width

        drawLine(
            appearance.background,
            Offset(0f, strokeWidth / 2f),
            Offset(length, strokeWidth / 2f),
            strokeWidth,
            cap = StrokeCap.Round
        )
        drawLine(
            appearance.foreground,
            Offset(0f, strokeWidth / 2f),
            Offset(length * progress, strokeWidth / 2f),
            strokeWidth,
            cap = StrokeCap.Round
        )
    }
}
