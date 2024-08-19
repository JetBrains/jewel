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

public fun ScrollbarStyle.Companion.light(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.macOsLight()
    } else {
        ScrollbarStyle.windowsAndLinuxLight()
    }

public fun ScrollbarStyle.Companion.dark(): ScrollbarStyle =
    if (hostOs.isMacOS) {
        ScrollbarStyle.macOsDark()
    } else {
        ScrollbarStyle.windowsAndLinuxDark()
    }

public fun ScrollbarStyle.Companion.macOsLight(
    colors: ScrollbarColors = ScrollbarColors.macOsLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.macOs(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.NextPage,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.macOs(),
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
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.WhenScrolling.macOs(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.windowsAndLinuxLight(
    colors: ScrollbarColors = ScrollbarColors.windowsAndLinuxLight(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.windowsAndLinux(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible.macOs(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarStyle.Companion.windowsAndLinuxDark(
    colors: ScrollbarColors = ScrollbarColors.windowsAndLinuxDark(),
    metrics: ScrollbarMetrics = ScrollbarMetrics.windowsAndLinux(),
    trackClickBehavior: TrackClickBehavior = TrackClickBehavior.JumpToSpot,
    scrollbarVisibility: ScrollbarVisibility = ScrollbarVisibility.AlwaysVisible.macOs(),
): ScrollbarStyle =
    ScrollbarStyle(
        colors = colors,
        metrics = metrics,
        trackClickBehavior = trackClickBehavior,
        scrollbarVisibility = scrollbarVisibility,
    )

public fun ScrollbarVisibility.AlwaysVisible.Companion.default(): ScrollbarVisibility.AlwaysVisible =
    if (hostOs.isMacOS) {
        ScrollbarVisibility.AlwaysVisible.macOs()
    } else {
        ScrollbarVisibility.AlwaysVisible.windowsAndLinux()
    }

public fun ScrollbarVisibility.AlwaysVisible.Companion.macOs(
    thumbThickness: Dp = 14.dp,
): ScrollbarVisibility.AlwaysVisible =
    ScrollbarVisibility.AlwaysVisible(thumbThickness)

public fun ScrollbarVisibility.AlwaysVisible.Companion.windowsAndLinux(
    thumbThickness: Dp = 18.dp,
): ScrollbarVisibility.AlwaysVisible =
    ScrollbarVisibility.AlwaysVisible(thumbThickness)

public fun ScrollbarVisibility.WhenScrolling.Companion.default(): ScrollbarVisibility.WhenScrolling =
    if (hostOs.isMacOS) {
        ScrollbarVisibility.WhenScrolling.macOs()
    } else {
        ScrollbarVisibility.WhenScrolling.windowsAndLinux()
    }

public fun ScrollbarVisibility.WhenScrolling.Companion.macOs(
    thumbThickness: Dp = 7.dp,
    thumbThicknessExpanded: Dp = 10.dp,
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        thumbThickness = thumbThickness,
        thumbThicknessExpanded = thumbThicknessExpanded,
        appearAnimationDuration = appearAnimationDuration,
        disappearAnimationDuration = disappearAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        lingerDuration = lingerDuration,
    )

public fun ScrollbarVisibility.WhenScrolling.Companion.windowsAndLinux(
    thumbThickness: Dp = 7.dp,
    thumbThicknessExpanded: Dp = 10.dp,
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        thumbThickness = thumbThickness,
        thumbThicknessExpanded = thumbThicknessExpanded,
        appearAnimationDuration = appearAnimationDuration,
        disappearAnimationDuration = disappearAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        lingerDuration = lingerDuration,
    )

public fun ScrollbarColors.Companion.macOsLight(
    thumbBackground: Color = Color(0x00000000),
    thumbBackgroundHovered: Color = Color(0x80000000),
    thumbOpaqueBackground: Color = Color(0x33000000),
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundHovered,
    thumbBorder: Color = thumbBackground,
    thumbBorderHovered: Color = thumbBackgroundHovered,
    thumbOpaqueBorder: Color = thumbOpaqueBackground,
    thumbOpaqueBorderHovered: Color = thumbOpaqueBackgroundHovered,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackOpaqueBackground,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundHovered,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderHovered,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarColors.Companion.windowsAndLinuxLight(
    thumbBackground: Color = Color(0x33737373),
    thumbBackgroundHovered: Color = Color(0x47737373),
    thumbOpaqueBackground: Color = thumbBackground,
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundHovered,
    thumbBorder: Color = Color(0x33595959),
    thumbBorderHovered: Color = Color(0x47595959),
    thumbOpaqueBorder: Color = thumbBorder,
    thumbOpaqueBorderHovered: Color = thumbBorderHovered,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackOpaqueBackground,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundHovered,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderHovered,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarColors.Companion.macOsDark(
    thumbBackground: Color = Color(0x00808080),
    thumbBackgroundHovered: Color = Color(0x8C808080),
    thumbOpaqueBackground: Color = Color(0x59808080),
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundHovered,
    thumbBorder: Color = Color(0x00262626),
    thumbBorderHovered: Color = Color(0x8C262626),
    thumbOpaqueBorder: Color = Color(0x59262626),
    thumbOpaqueBorderHovered: Color = thumbBorderHovered,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackBackgroundHovered,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundHovered,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderHovered,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarColors.Companion.windowsAndLinuxDark(
    thumbBackground: Color = Color(0x47A6A6A6),
    thumbBackgroundHovered: Color = Color(0x59A6A6A6),
    thumbOpaqueBackground: Color = thumbBackground,
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundHovered,
    thumbBorder: Color = Color(0x47383838),
    thumbBorderHovered: Color = Color(0x59383838),
    thumbOpaqueBorder: Color = thumbBorder,
    thumbOpaqueBorderHovered: Color = thumbBorderHovered,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackBackgroundHovered,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundHovered,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderHovered,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarMetrics.Companion.macOs(
    thumbCornerSize: CornerSize = CornerSize(100),
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(3.dp),
): ScrollbarMetrics =
    ScrollbarMetrics(thumbCornerSize, minThumbLength, trackPadding)

public fun ScrollbarMetrics.Companion.windowsAndLinux(
    thumbCornerSize: CornerSize = CornerSize(0),
    minThumbLength: Dp = 20.dp,
    trackPadding: PaddingValues = PaddingValues(),
): ScrollbarMetrics =
    ScrollbarMetrics(thumbCornerSize, minThumbLength, trackPadding)
