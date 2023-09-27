package org.jetbrains.jewel

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import org.jetbrains.jewel.styling.CircularProgressStyle

@Composable
fun CircularProgressIndicator(
    modifier: Modifier = Modifier,
    style: CircularProgressStyle = IntelliJTheme.circularProgressStyle,
) {
    var currentFrame by remember { mutableStateOf(style.frameIcons.frames.first()) }

    Icon(
        modifier = modifier,
        painter = currentFrame.getPainter(LocalResourceLoader.current).value,
        contentDescription = null,
    )

    LaunchedEffect(Unit) {
        while (true) {
            for (i in 0 until style.frameIcons.frames.size) {
                currentFrame = style.frameIcons.frames[i]
                delay(style.frameTime.inWholeMilliseconds)
            }
        }
    }
}

@Composable
fun CircularProgressIndicatorBig() {
    CircularProgressIndicator(modifier = Modifier.size(32.dp), style = IntelliJTheme.circularProgressBigStyle)
}
