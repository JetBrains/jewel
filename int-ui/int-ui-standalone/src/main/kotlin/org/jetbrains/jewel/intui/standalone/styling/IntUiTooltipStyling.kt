package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.styling.TooltipColors
import org.jetbrains.jewel.styling.TooltipMetrics
import org.jetbrains.jewel.styling.TooltipStyle
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Stable
data class IntUiTooltipStyle(
    override val colors: IntUiTooltipColors,
    override val metrics: IntUiTooltipMetrics,
) : TooltipStyle {

    companion object {

        @Composable
        fun light(
            intUiTooltipColors: IntUiTooltipColors = IntUiTooltipColors.light(),
            intUiTooltipMetrics: IntUiTooltipMetrics = IntUiTooltipMetrics(),
        ): IntUiTooltipStyle = IntUiTooltipStyle(
            colors = intUiTooltipColors,
            metrics = intUiTooltipMetrics,
        )

        @Composable
        fun dark(
            intUiTooltipColors: IntUiTooltipColors = IntUiTooltipColors.dark(),
            intUiTooltipMetrics: IntUiTooltipMetrics = IntUiTooltipMetrics(),
        ): IntUiTooltipStyle = IntUiTooltipStyle(
            colors = intUiTooltipColors,
            metrics = intUiTooltipMetrics,
        )
    }
}

@Stable
data class IntUiTooltipColors(
    override val contentColor: Color,
    override val backgroundColor: Color,
    override val borderColor: Color,
) : TooltipColors {

    companion object {

        @Composable
        fun light(
            contentColor: Color = IntUiLightTheme.colors.grey(12),
            backgroundColor: Color = IntUiLightTheme.colors.grey(2),
            borderColor: Color = IntelliJTheme.globalColors.borders.normal,
        ) = IntUiTooltipColors(contentColor, backgroundColor, borderColor)

        @Composable
        fun dark(
            contentColor: Color = IntUiDarkTheme.colors.grey(12),
            backgroundColor: Color = IntUiDarkTheme.colors.grey(2),
            borderColor: Color = IntelliJTheme.globalColors.borders.normal,
        ) = IntUiTooltipColors(contentColor, backgroundColor, borderColor)
    }
}

@Stable
data class IntUiTooltipMetrics(
    override val paddingValues: PaddingValues = PaddingValues(vertical = 8.dp, horizontal = 8.dp),
    override val showDelay: Duration = 0.milliseconds,
) : TooltipMetrics
