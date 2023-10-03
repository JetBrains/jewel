package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.styling.TooltipColors
import org.jetbrains.jewel.styling.TooltipMetrics
import org.jetbrains.jewel.styling.TooltipStyle

@Stable
data class IntUiTooltipStyle(
    override val colors: IntUiTooltipColors,
    override val metrics: IntUiTooltipMetrics
) : TooltipStyle {

    companion object {

        @Composable
        fun light(): IntUiTooltipStyle = IntUiTooltipStyle(
            colors = IntUiTooltipColors.light(),
            metrics = IntUiTooltipMetrics()
        )

        @Composable
        fun dark(): IntUiTooltipStyle = IntUiTooltipStyle(
            colors = IntUiTooltipColors.dark(),
            metrics = IntUiTooltipMetrics()
        )
    }
}

@Stable data class IntUiTooltipColors(
    override val contentColor: Color,
    override val backgroundColor: Color,
) : TooltipColors {

    companion object {

        @Composable
        fun light(): IntUiTooltipColors =
            IntUiTooltipColors(contentColor = Color.White, backgroundColor = Color.Blue)

        @Composable
        fun dark(): IntUiTooltipColors =
            IntUiTooltipColors(contentColor = Color.Blue, backgroundColor = Color.White)
    }
}

@Stable data class IntUiTooltipMetrics(override val paddingValues: PaddingValues = PaddingValues()) : TooltipMetrics