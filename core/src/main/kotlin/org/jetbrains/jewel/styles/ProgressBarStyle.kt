package org.jetbrains.jewel.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.IntelliJPalette

typealias ProgressBarStyle = ControlStyle<ProgressBarAppearance, ProgressBarState>

data class ProgressBarAppearance(
    val foreground: Color,
    val background: Color
)

object ProgressBarState

val LocalProgressBarStyle = compositionLocalOf<ProgressBarStyle> { localNotProvided() }

val Styles.progressBar: ProgressBarStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalProgressBarStyle.current

fun ProgressBarStyle(palette: IntelliJPalette): ProgressBarStyle = ProgressBarStyle {
    default {
        state(
            ProgressBarState,
            ProgressBarAppearance(
                palette.progressBar.foreground,
                palette.progressBar.background
            )
        )
    }
}
