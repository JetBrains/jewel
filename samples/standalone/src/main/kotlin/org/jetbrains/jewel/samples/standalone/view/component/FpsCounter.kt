package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameMillis
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.jewel.ui.component.Text
import kotlin.math.roundToInt

@Composable
fun FpsCounter(modifier: Modifier = Modifier) {
    var displayedFPS by remember { mutableStateOf(0) }
    var textContent by remember { mutableStateOf("FPS:") }
    var minMaxContent by remember { mutableStateOf("") }
    var fpsCountMethod by remember { mutableStateOf(FPSCountMethod.RealTime) }
    var minFps by remember { mutableStateOf(240) }
    var maxFps by remember { mutableStateOf(0) }

    val textColor by remember {
        derivedStateOf {
            when (fpsCountMethod) {
                FPSCountMethod.RealTime -> {
                    textContent = "FPS(Realtime):$displayedFPS"
                }

                FPSCountMethod.FixedInterval -> {
                    textContent = "FPS(latest ${fpsUpdDelay}ms):$displayedFPS"
                }

                FPSCountMethod.FixedFrameCount -> {
                    textContent = "FPS(${frameCount}frame):$displayedFPS"
                }
            }
            minMaxContent = "min:$minFps, max:$maxFps"
            if (displayedFPS > greenFPS) Color.Green else Color.Red
        }
    }

    Row(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = textContent,
            modifier =
                Modifier.clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) {
                    fpsCountMethod =
                        when (fpsCountMethod) {
                            FPSCountMethod.FixedInterval -> FPSCountMethod.FixedFrameCount
                            FPSCountMethod.FixedFrameCount -> FPSCountMethod.RealTime
                            FPSCountMethod.RealTime -> FPSCountMethod.FixedInterval
                        }
                    minFps = 240
                    maxFps = 0
                },
            color = textColor,
        )

        Text(
            text = minMaxContent,
            modifier =
                Modifier.clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) {
                    minFps = 240
                    maxFps = 0
                },
        )
    }

    LaunchedEffect(Unit) {
        launch(Dispatchers.Default) {
            val fpsArray = FloatArray(frameCount) { 0f }

            var fpsCount = 0
            var avgFPS = 0
            var lastWriteIndex = 0

            val countTask: suspend CoroutineScope.() -> Unit = {
                var lastUpdTime = 0L
                var writeIndex = 0
                while (true) {
                    withFrameMillis { frameTimeMillis ->
                        fpsCount++

                        fpsArray[writeIndex] = 1000f / (frameTimeMillis - lastUpdTime)
                        lastUpdTime = frameTimeMillis

                        lastWriteIndex = writeIndex

                        writeIndex++
                        if (writeIndex >= fpsArray.size) {
                            avgFPS = fpsArray.average().roundToInt()
                            writeIndex = 0
                        }
                    }
                }
            }
            val updDataTask: suspend CoroutineScope.() -> Unit = {
                while (true) {
                    delay(fpsUpdDelay)

                    displayedFPS =
                        when (fpsCountMethod) {
                            FPSCountMethod.FixedInterval -> fpsCount * 1000 / fpsUpdDelay.toInt()
                            FPSCountMethod.FixedFrameCount -> avgFPS
                            FPSCountMethod.RealTime -> fpsArray[lastWriteIndex].roundToInt()
                        }
                    if (displayedFPS > 0) {
                        minFps = minOf(minFps, displayedFPS)
                    }
                    maxFps = maxOf(maxFps, displayedFPS)
                    fpsCount = 0
                }
            }
            launch(block = countTask)
            launch(block = updDataTask)
        }
    }
}

private const val fpsUpdDelay = 250L
private const val frameCount = 10
private const val greenFPS = 57

enum class FPSCountMethod {
    FixedInterval,

    FixedFrameCount,

    RealTime,
}
