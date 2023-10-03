package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import kotlin.time.Duration

@Stable
interface TooltipStyle {

    val colors: TooltipColors
    val metrics: TooltipMetrics
}

@Stable
interface TooltipColors {

    val backgroundColor: Color
    val contentColor: Color
    val borderColor: Color

}

@Stable
interface TooltipMetrics {

    val paddingValues: PaddingValues
    val showDelay: Duration
}

val LocalTooltipStyle = staticCompositionLocalOf<TooltipStyle> {
    error("No TooltipStyle provided")
}
