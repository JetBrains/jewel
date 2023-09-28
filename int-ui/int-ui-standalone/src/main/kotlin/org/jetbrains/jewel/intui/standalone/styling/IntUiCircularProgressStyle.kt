package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.painter.Painter
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.styling.CircularProgressIcons
import org.jetbrains.jewel.styling.CircularProgressStyle
import org.jetbrains.jewel.util.SpinnerProgressIconGenerator
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Stable
data class IntUiCircularProgressStyle(
    override val frameIcons: IntUiCircularProgressIcons,
    override val frameTime: Duration,
) : CircularProgressStyle {

    object Small {

        @Composable
        fun dark(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressIcons(
                svgLoader,
                SpinnerProgressIconGenerator.Small.generateRawSvg("#6F737A"),
            ),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)

        @Composable
        fun light(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressIcons(
                svgLoader,
                SpinnerProgressIconGenerator.Small.generateRawSvg("#A8ADBD"),
            ),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)
    }

    object Big {

        @Composable
        fun dark(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressIcons(
                svgLoader,
                SpinnerProgressIconGenerator.Big.generateRawSvg("#6F737A"),
            ),
        ) = IntUiCircularProgressStyle(frameIcons, frameTime)

        @Composable
        fun light(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressIcons(
                svgLoader,
                SpinnerProgressIconGenerator.Big.generateRawSvg("#A8ADBD"),
            ),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)
    }
}

data class IntUiCircularProgressIcons(
    override val frames: List<Painter>,
) : CircularProgressIcons

fun intUiCircularProgressIcons(
    svgLoader: SvgLoader,
    rawSVGIcons: List<String>,
) = IntUiCircularProgressIcons(
    rawSVGIcons.map { svgLoader.loadRawSvg(it, it.hashCode().toString()) }
)
