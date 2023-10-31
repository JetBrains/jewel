package org.jetbrains.jewel.ui.component.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Stable
@GenerateDataFunctions
public class TooltipStyle(
    public val colors: TooltipColors,
    public val metrics: TooltipMetrics,
) {

    public companion object
}

@Stable
@GenerateDataFunctions
public class TooltipColors(
    public val background: Color,
    public val content: Color,
    public val border: Color,
    public val shadow: Color,
) {

    public companion object
}

@Stable
@GenerateDataFunctions
public class TooltipMetrics(
    public val contentPadding: PaddingValues,
    public val showDelay: Duration,
    public val cornerSize: CornerSize,
    public val borderWidth: Dp,
    public val shadowSize: Dp,
    public val tooltipOffset: DpOffset,
    public val tooltipAlignment: Alignment.Horizontal,
) {

    public companion object {

        public fun defaults(
            contentPadding: PaddingValues = PaddingValues(vertical = 9.dp, horizontal = 12.dp),
            showDelay: Duration = 0.milliseconds,
            cornerSize: CornerSize = CornerSize(5.dp),
            borderWidth: Dp = 1.dp,
            shadowSize: Dp = 12.dp,
            tooltipOffset: DpOffset = DpOffset(0.dp, 20.dp),
            tooltipAlignment: Alignment.Horizontal = Alignment.Start,
        ): TooltipMetrics =
            TooltipMetrics(
                contentPadding,
                showDelay,
                cornerSize,
                borderWidth,
                shadowSize,
                tooltipOffset,
                tooltipAlignment,
            )
    }
}

public val LocalTooltipStyle: ProvidableCompositionLocal<TooltipStyle> =
    staticCompositionLocalOf<TooltipStyle> { error("No TooltipStyle provided. Have you forgotten the theme?") }
