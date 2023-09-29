package org.jetbrains.jewel.styling

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.SvgLoader
import kotlin.time.Duration

interface CircularProgressStyle {

    val svgLoader: SvgLoader
    val frameTime: Duration
    val color: Color
}

val LocalCircularProgressStyle = staticCompositionLocalOf<CircularProgressStyle> {
    error("No CircularProgressIndicatorStyle provided")
}
