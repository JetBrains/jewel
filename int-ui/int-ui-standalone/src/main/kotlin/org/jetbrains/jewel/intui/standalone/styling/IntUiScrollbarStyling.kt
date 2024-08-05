package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ui.component.styling.ScrollbarColors
import org.jetbrains.jewel.ui.component.styling.ScrollbarMetrics
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility
import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior
import org.jetbrains.skiko.hostOs
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

public fun ScrollbarStyle.Companion.dark(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.macOsDark()
    } else {
        ScrollbarStyle.winOsDark()
    }

public fun ScrollbarStyle.Companion.light(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.macOsLight()
    } else {
        ScrollbarStyle.winOsLight()
    }

public fun ScrollbarStyle.Companion.macOsLight(
    colors: ScrollbarColors = ScrollbarColors.macOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.macOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.defaults(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.macOsDark(
    colors: ScrollbarColors = ScrollbarColors.macOsDark(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.macOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.defaults(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.winOsDark(
    colors: ScrollbarColors = ScrollbarColors.winOsDark(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.windows(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible,
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.winOsLight(
    colors: ScrollbarColors = ScrollbarColors.winOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.windows(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible,
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarVisibility.WhenScrolling.Companion.defaults(
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        appearAnimationDuration = appearAnimationDuration,
        disappearAnimationDuration = disappearAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        lingerDuration = lingerDuration,
    )

// COLORS

public fun ScrollbarColors.Companion.macOsLight(
    thumbBackground: Color = Color(0x00000000),
    thumbBackgroundHovered: Color = Color(0x80000000),
    thumbBackgroundPressed: Color = thumbBackgroundHovered,
    thumbBorder: Color = Color(0x33000000),
    thumbBorderHovered: Color = Color(0x80000000),
    thumbBorderPressed: Color = thumbBorderHovered,
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

public fun ScrollbarColors.Companion.winOsLight(
    thumbBackground: Color = Color(0x33737373),
    thumbBackgroundHovered: Color = Color(0x47737373),
    thumbBackgroundPressed: Color = thumbBackgroundHovered,
    thumbBorder: Color = Color(0x33595959),
    thumbBorderHovered: Color = Color(0x47595959),
    thumbBorderPressed: Color = thumbBorderHovered,
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

public fun ScrollbarColors.Companion.macOsDark(
    thumbBackground: Color = Color(0x59808080),
    thumbBackgroundHovered: Color = Color(0x8C808080),
    thumbBackgroundPressed: Color = Color(0x8C808080),
    thumbBorder: Color = Color(0x59262626),
    thumbBorderHovered: Color = Color(0x8C262626),
    thumbBorderPressed: Color = Color(0x8C262626),
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

public fun ScrollbarColors.Companion.winOsDark(
    thumbBackground: Color = Color(0x47A6A6A6),
    thumbBackgroundHovered: Color = Color(0x59A6A6A6),
    thumbBackgroundPressed: Color = Color(0x59A6A6A6),
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

// METRICS

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

// TAB STYLING
public fun ScrollbarStyle.Companion.macOsTabLight(
    colors: ScrollbarColors = ScrollbarColors.macOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripMacOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.defaults(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripMacOsDark(
    colors: ScrollbarColors = ScrollbarColors.macOsDark(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripMacOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.defaults(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripMacOsLight(
    colors: ScrollbarColors = ScrollbarColors.macOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripMacOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.defaults(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripWinOsDark(
    colors: ScrollbarColors = ScrollbarColors.winOsDark(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripWindows(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible,
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripWinOsLight(
    colors: ScrollbarColors = ScrollbarColors.winOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripWindows(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible,
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripDark(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.tabStripMacOsDark()
    } else {
        ScrollbarStyle.tabStripWinOsDark()
    }

public fun ScrollbarStyle.Companion.tabStripLight(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.tabStripMacOsLight()
    } else {
        ScrollbarStyle.tabStripWinOsLight()
    }

public fun ScrollbarMetrics.Companion.tabStripMacOs(
    thumbCornerSize: CornerSize = CornerSize(100),
    thumbThickness: Dp = 3.dp,
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(),
    thumbThicknessExpanded: Dp = 3.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(),
): ScrollbarMetrics =
    ScrollbarMetrics(
        thumbCornerSize,
        thumbThickness,
        thumbThicknessExpanded,
        minThumbLength,
        trackPadding,
        trackPaddingExpanded,
    )

public fun ScrollbarMetrics.Companion.tabStripWindows(
    thumbCornerSize: CornerSize = CornerSize(0),
    thumbThickness: Dp = 3.dp,
    minThumbLength: Dp = 16.dp,
    trackPadding: PaddingValues = PaddingValues(),
    thumbThicknessExpanded: Dp = 3.dp,
    trackPaddingExpanded: PaddingValues = PaddingValues(),
): ScrollbarMetrics =
    ScrollbarMetrics(
        thumbCornerSize,
        thumbThickness,
        thumbThicknessExpanded,
        minThumbLength,
        trackPadding,
        trackPaddingExpanded,
    )
