package org.jetbrains.jewel.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import kotlin.time.Duration

interface CircularProgressStyle {

    val frameIcons: CircularProgressIcons
    val frameTime: Duration
}

@Immutable
interface CircularProgressIcons {

    val frames: List<PainterProvider<Unit>>
}

val LocalCircularProgressStyle = staticCompositionLocalOf<CircularProgressStyle> {
    error("No CircularProgressStyle provided")
}

val LocalCircularProgressBigStyle = staticCompositionLocalOf<CircularProgressStyle> {
    error("No CircularProgressStyle provided")
}
