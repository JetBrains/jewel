package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ui.component.styling.ScrollbarColors
import org.jetbrains.jewel.ui.component.styling.ScrollbarMetrics
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility
import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior
import org.jetbrains.skiko.hostOs
import kotlin.time.Duration.Companion.milliseconds

public fun ScrollbarStyle.Companion.tabStripLight(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.tabStripMacOsLight()
    } else {
        ScrollbarStyle.tabStripWindowsAndLinuxLight()
    }

public fun ScrollbarStyle.Companion.tabStripDark(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.tabStripMacOsDark()
    } else {
        ScrollbarStyle.tabStripWindowsAndLinuxDark()
    }

public fun ScrollbarStyle.Companion.tabStripMacOsLight(
    colors: ScrollbarColors = ScrollbarColors.macOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripMacOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.macOs(),
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
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.macOs(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripWindowsAndLinuxLight(
    colors: ScrollbarColors = ScrollbarColors.windowsAndLinuxLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripWindowsAndLinux(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible.tabStrip(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.tabStripWindowsAndLinuxDark(
    colors: ScrollbarColors = ScrollbarColors.windowsAndLinuxDark(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.tabStripWindowsAndLinux(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible.tabStrip(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarMetrics.Companion.tabStripMacOs(
    thumbCornerSize: CornerSize = CornerSize(100),
    minThumbLength: Dp = 20.dp,
): ScrollbarMetrics =
    ScrollbarMetrics(thumbCornerSize, minThumbLength)

public fun ScrollbarMetrics.Companion.tabStripWindowsAndLinux(
    thumbCornerSize: CornerSize = CornerSize(0),
    minThumbLength: Dp = 16.dp,
): ScrollbarMetrics =
    ScrollbarMetrics(thumbCornerSize, minThumbLength)

public fun ScrollbarVisibility.AlwaysVisible.Companion.tabStrip(
    thumbThickness: Dp = 3.dp,
    trackPadding: PaddingValues = PaddingValues(),
    trackPaddingWithBorder: PaddingValues = trackPadding,
): ScrollbarVisibility.AlwaysVisible =
    ScrollbarVisibility.AlwaysVisible(
        thumbThickness,
        trackPadding,
        trackPaddingWithBorder,
        thumbColorAnimationDuration = 0.milliseconds
    )
