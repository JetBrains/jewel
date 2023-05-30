package org.jetbrains.jewel.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.IntelliJPalette

typealias FrameStyle = ControlStyle<Unit, FrameAppearance>

@Immutable
data class FrameAppearance(
    val backgroundColor: Color = Color.White
)

val LocalFrameStyle = compositionLocalOf<FrameStyle> { localNotProvided() }
val Styles.frame: FrameStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalFrameStyle.current

fun FrameStyle(palette: IntelliJPalette) = FrameStyle {
    state(Unit, FrameAppearance(backgroundColor = palette.background))
}
