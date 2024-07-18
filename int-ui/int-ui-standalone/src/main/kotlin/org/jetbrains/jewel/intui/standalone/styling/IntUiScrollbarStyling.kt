package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ui.component.styling.ScrollbarColors
import org.jetbrains.jewel.ui.component.styling.ScrollbarMetrics
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.skiko.hostOs
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Composable
public fun ScrollbarStyle.Companion.light(
    colors: ScrollbarColors = ScrollbarColors.light(),
    metrics: ScrollbarMetrics = provideScrollbarMetrics(),
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarStyle =
    ScrollbarStyle(
        colors,
        metrics,
        appearAnimationDuration,
        disappearAnimationDuration,
        expandAnimationDuration,
        lingerDuration,
    )

@Composable
public fun ScrollbarStyle.Companion.dark(
    colors: ScrollbarColors = ScrollbarColors.dark(),
    metrics: ScrollbarMetrics = provideScrollbarMetrics(),
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarStyle =
    ScrollbarStyle(
        colors,
        metrics,
        appearAnimationDuration,
        disappearAnimationDuration,
        expandAnimationDuration,
        lingerDuration,
    )

@Composable
public fun ScrollbarColors.Companion.light(
    thumbBackground: Color = Color(0x33737373),
    thumbBackgroundHovered: Color = Color(0x47737373),
    thumbBackgroundPressed: Color = Color(0x47737373),
    thumbBorder: Color = Color(0x33595959),
    thumbBorderHovered: Color = Color(0x47595959),
    thumbBorderPressed: Color = Color(0x47595959),
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x00808080),
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground,
        thumbBackgroundHovered,
        thumbBackgroundPressed,
        thumbBorder,
        thumbBorderHovered,
        thumbBorderPressed,
        trackBackground,
        trackBackgroundHovered,
    )

@Composable
public fun ScrollbarColors.Companion.dark(
    thumbBackground: Color = Color(0x59808080),
    thumbBackgroundHovered: Color = Color(0x8C808080),
    thumbBackgroundPressed: Color = Color(0x8C808080),
    thumbBorder: Color = Color(0x47383838),
    thumbBorderHovered: Color = Color(0x59A6A6A6),
    thumbBorderPressed: Color = Color(0x59A6A6A6),
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground,
        thumbBackgroundHovered,
        thumbBackgroundPressed,
        thumbBorder,
        thumbBorderHovered,
        thumbBorderPressed,
        trackBackground,
        trackBackgroundHovered,
    )

public fun ScrollbarMetrics.Companion.defaults(
    thumbCornerSize: CornerSize = CornerSize(100),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(2.dp),
    thumbThicknessExpanded: Dp = 14.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(2.dp),
): ScrollbarMetrics =
    ScrollbarMetrics(
        thumbCornerSize,
        thumbThickness,
        thumbThicknessExpanded,
        minThumbLength,
        trackPadding,
        trackPaddingExpanded,
    )

private fun provideScrollbarMetrics(): ScrollbarMetrics =
    when {
        hostOs.isMacOS -> ScrollbarMetrics.macOs()
        hostOs.isLinux -> ScrollbarMetrics.linux()
        else -> ScrollbarMetrics.windows()
    }

public fun ScrollbarMetrics.Companion.macOs(
    thumbCornerSize: CornerSize = CornerSize(100),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(2.dp),
    thumbThicknessExpanded: Dp = 14.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(2.dp),
): ScrollbarMetrics =
    ScrollbarMetrics(
        thumbCornerSize,
        thumbThickness,
        thumbThicknessExpanded,
        minThumbLength,
        trackPadding,
        trackPaddingExpanded,
    )

public fun ScrollbarMetrics.Companion.windows(
    thumbCornerSize: CornerSize = CornerSize(0),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 16.dp,
    trackPadding: PaddingValues = PaddingValues(horizontal = 0.dp),
    thumbThicknessExpanded: Dp = 8.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(horizontal = 0.dp),
): ScrollbarMetrics =
    ScrollbarMetrics(
        thumbCornerSize,
        thumbThickness,
        thumbThicknessExpanded,
        minThumbLength,
        trackPadding,
        trackPaddingExpanded,
    )

public fun ScrollbarMetrics.Companion.linux(
    thumbCornerSize: CornerSize = CornerSize(0),
    thumbThickness: Dp = 8.dp,
    minThumbLength: Dp = 16.dp,
    trackPadding: PaddingValues = PaddingValues(horizontal = 0.dp),
    thumbThicknessExpanded: Dp = 8.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(horizontal = 0.dp),
): ScrollbarMetrics =
    ScrollbarMetrics(
        thumbCornerSize,
        thumbThickness,
        thumbThicknessExpanded,
        minThumbLength,
        trackPadding,
        trackPaddingExpanded,
    )
