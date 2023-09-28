package org.jetbrains.jewel.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.painter.Painter
import kotlin.time.Duration

interface CircularProgressStyle {

    val frameIcons: CircularProgressIcons
    val frameTime: Duration
}

@Immutable
interface CircularProgressIcons {

    val frames: List<Painter>
}

val LocalCircularProgressStyle = staticCompositionLocalOf<CircularProgressStyle> {
    error("No CircularProgressIndicatorStyle provided")
}

val LocalCircularProgressBigStyle = staticCompositionLocalOf<CircularProgressStyle> {
    error("No CircularProgressIndicatorBigStyle provided")
}
