package org.jetbrains.jewel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import org.jetbrains.jewel.styling.CircularProgressStyle
import org.jetbrains.jewel.util.toHexString

@Composable
fun CircularProgressIndicator(
    modifier: Modifier = Modifier,
    svgLoader: SvgLoader,
    style: CircularProgressStyle = IntelliJTheme.circularProgressStyle,
) {
    CircularProgressIndicatorImpl(
        modifier = modifier,
        svgLoader = svgLoader,
        style = style,
        iconSize = DpSize(16.dp, 16.dp),
        frameRetriever = { color -> SpinnerProgressIconGenerator.Small.generateSvgFrames(color.toHexString()) }
    )
}

@Composable
fun CircularProgressIndicatorBig(
    modifier: Modifier = Modifier,
    svgLoader: SvgLoader,
    style: CircularProgressStyle = IntelliJTheme.circularProgressStyle,
) {
    CircularProgressIndicatorImpl(
        modifier = modifier,
        svgLoader = svgLoader,
        style = style,
        iconSize = DpSize(32.dp, 32.dp),
        frameRetriever = { color -> SpinnerProgressIconGenerator.Big.generateSvgFrames(color.toHexString()) }
    )
}

@Composable
private fun CircularProgressIndicatorImpl(
    modifier: Modifier = Modifier,
    svgLoader: SvgLoader,
    iconSize: DpSize,
    style: CircularProgressStyle,
    frameRetriever: (Color) -> List<String>,
) {
    val defaultColor = if (IntelliJTheme.isDark) Color(0xFF6F737A) else Color(0xFFA8ADBD)
    var isFrameReady by remember { mutableStateOf(false) }
    var currentFrame: Pair<String, Int> by remember { mutableStateOf("" to 0) }

    if (!isFrameReady) {
        Box(modifier.size(iconSize))
    } else {
        Icon(
            modifier = modifier.size(iconSize),
            painter = svgLoader.loadRawSvg(
                currentFrame.first,
                "circularProgressIndicator_frame_${currentFrame.second}"
            ),
            contentDescription = null,
        )
    }

    LaunchedEffect(style.color) {
        val frames = frameRetriever(style.color.takeOrElse { defaultColor })
        while (true) {
            for (i in 0 until frames.size) {
                currentFrame = frames[i] to i
                isFrameReady = true
                delay(style.frameTime.inWholeMilliseconds)
            }
        }
    }
}

object SpinnerProgressIconGenerator {

    private val opacityList = listOf(1.0f, 0.93f, 0.78f, 0.69f, 0.62f, 0.48f, 0.38f, 0.0f)

    private val rotations = listOf(0, -45, 0, 45, 0, -45, 0, 45)

    // for a 16x16 icon
    private val points = listOf(
        7f to 1f,
        2.34961f to 3.76416f,
        1f to 7f,
        5.17871f to 9.40991f,
        7f to 11f,
        9.41016f to 10.8242f,
        11f to 7f,
        12.2383f to 2.34961f,
    )

    private fun StringBuilder.closeRoot() = append("</svg>")
    private fun StringBuilder.openRoot(sizePx: Int) = append(
        "<svg width=\"$sizePx\" height=\"$sizePx\" viewBox=\"0 0 $sizePx $sizePx\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">"
    )

    private fun generateSvgIcon(
        step: Int,
        pointList: List<Pair<Float, Float>>,
        colorHex: String,
        thickness: Int,
        length: Int,
        cornerRadius: Int,
    ) =
        buildString {
            openRoot(16)
            for (index in 0..opacityList.lastIndex) {
                val currentIndex = (index + step + 1) % opacityList.size
                val currentOpacity = opacityList[currentIndex]
                if (currentOpacity == 0.0f) continue
                element(
                    colorHex = colorHex,
                    opacity = currentOpacity,
                    x = pointList[index].first,
                    y = pointList[index].second,
                    width = thickness,
                    height = length,
                    rx = cornerRadius,
                    rotation = rotations[index],
                )
            }
            closeRoot()
        }

    private fun StringBuilder.element(
        colorHex: String,
        opacity: Float,
        x: Float,
        y: Float,
        width: Int,
        height: Int,
        rx: Int,
        rotation: Int,
    ) {
        append("<rect fill=\"${colorHex}\" opacity=\"$opacity\" x=\"$x\" y=\"$y\" width=\"$width\" height=\"$height\" rx=\"$rx\"")
        if (rotation != 0) append(" transform=\"rotate($rotation $x $y)\"")
        append("/>\n")
    }

    object Small {

        fun generateSvgFrames(colorHex: String) = buildList {
            for (index in 0..opacityList.lastIndex) {
                add(
                    generateSvgIcon(
                        step = index,
                        pointList = points,
                        colorHex = colorHex,
                        thickness = 2,
                        length = 4,
                        cornerRadius = 1
                    )
                )
            }
        }
    }

    object Big {

        fun generateSvgFrames(colorHex: String) = buildList {
            for (index in 0..opacityList.lastIndex) {
                add(
                    generateSvgIcon(
                        step = index,
                        pointList = points.map { it.first * 2f to it.second * 2f },
                        colorHex = colorHex,
                        thickness = 4,
                        length = 8,
                        cornerRadius = 2,
                    )
                )
            }
        }
    }
}
