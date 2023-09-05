package org.jetbrains.jewel.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import java.time.Duration

data class IntUiCircularProgressStyle(
    override val frameIcons: CircularProgressIcons,
    override val metrics: CircularProgressMetrics,
) : CircularProgressStyle {

    companion object {
        // todo
//        @Composable
//        fun light(
//            svgLoader: SvgLoader,
//            metrics: IntUiLazyTreeMetrics = IntUiLazyTreeMetrics(),
//            frameIcons: CircularProgressIcons: IntUiLazyTreeIcons = intUiLazyTreeIcons(svgLoader),
//        ) = IntUiLazyTreeStyle(colors, metrics, icons)
//
//        @Composable
//        fun dark(
//            svgLoader: SvgLoader,
//            colors: IntUiLazyTreeColors = IntUiLazyTreeColors.dark(),
//            metrics: IntUiLazyTreeMetrics = IntUiLazyTreeMetrics(),
//            icons: IntUiLazyTreeIcons = intUiLazyTreeIcons(svgLoader),
//        ) = IntUiLazyTreeStyle(colors, metrics, icons)
    }
}

interface CircularProgressStyle {

    val frameIcons: CircularProgressIcons
    val metrics: CircularProgressMetrics
}

@Immutable
interface CircularProgressIcons {

    val frames: State<List<Painter>>
}

@Immutable
interface CircularProgressMetrics {

    val animationDelay: Duration
    val frameTime: Duration
    val size: DpSize
}

val LocalCircularProgressStyle = staticCompositionLocalOf<CircularProgressStyle> {
    error("No CircularProgressStyle provided")
}
