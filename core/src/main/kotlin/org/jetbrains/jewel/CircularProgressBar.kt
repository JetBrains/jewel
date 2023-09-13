package org.jetbrains.jewel

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import org.jetbrains.jewel.styling.CircularProgressStyle

@Composable
fun CircularProgress(
    modifier: Modifier,
    style: CircularProgressStyle = IntelliJTheme.circularProgressStyle,
) {
    var currentFrame by remember { mutableStateOf(0) }

    Icon(
        painter = style.frameIcons.frames.value[currentFrame],
        contentDescription = null,
        modifier = modifier.size(style.metrics.size)
    )

    LaunchedEffect(Unit) {
        delay(style.metrics.animationDelay.toMillis())
        while (true) {
            for (i in 0 until style.frameIcons.frames.value.size) {
                currentFrame = i
                delay(style.metrics.frameTime.toMillis())
            }
        }
    }
}
