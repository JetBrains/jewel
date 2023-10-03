package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.DropdownState

@Stable
interface TooltipStyle {

    val colors: TooltipColors
    val metrics: TooltipMetrics
}

@Stable
interface TooltipColors {

    val backgroundColor: Color
    val contentColor: Color

}

@Stable
interface TooltipMetrics {

    val paddingValues: PaddingValues
}

val LocalTooltipStyle = staticCompositionLocalOf<TooltipStyle> {
    error("No TooltipStyle provided")
}
