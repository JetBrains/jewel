package org.jetbrains.jewel.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import kotlin.time.Duration

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
