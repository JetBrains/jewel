package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.styling.CircularProgressIcons
import org.jetbrains.jewel.styling.CircularProgressStyle
import org.jetbrains.jewel.styling.PainterProvider
import org.jetbrains.jewel.styling.ResourcePainterProvider
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
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressIcons(svgLoader),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)

        @Composable
        fun light(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressIcons(svgLoader),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)
    }

    object Big {

        @Composable
        fun dark(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressBigIcons(svgLoader),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)

        @Composable
        fun light(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            frameIcons: IntUiCircularProgressIcons = intUiCircularProgressBigIcons(svgLoader),
        ) =
            IntUiCircularProgressStyle(frameIcons, frameTime)
    }
}

data class IntUiCircularProgressIcons(
    override val frames: List<PainterProvider<Unit>>,
) : CircularProgressIcons {

    companion object {

        @Composable
        fun getFrames(
            svgLoader: SvgLoader,
            iconPaths: List<String>,
        ): List<PainterProvider<Unit>> = iconPaths.map {
            ResourcePainterProvider.stateless(basePath = it, svgLoader = svgLoader)
        }
    }
}

@Composable
fun intUiCircularProgressIcons(
    svgLoader: SvgLoader,
    iconPrefix: String = "icons/intui/animated/smallSpinner/",
    iconNames: List<String> = listOf(
        "spinner1.svg",
        "spinner2.svg",
        "spinner3.svg",
        "spinner4.svg",
        "spinner5.svg",
        "spinner6.svg",
        "spinner7.svg",
        "spinner8.svg",
    ),
) = IntUiCircularProgressIcons(
    IntUiCircularProgressIcons.getFrames(
        svgLoader,
        iconNames.map { iconPrefix + it },
    ),
)

@Composable
fun intUiCircularProgressBigIcons(svgLoader: SvgLoader) =
    intUiCircularProgressIcons(svgLoader = svgLoader, iconPrefix = "icons/intui/animated/bigSpinner/")
