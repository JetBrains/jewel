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
    trackThickness: Dp = 14.dp,
    trackPadding: PaddingValues = PaddingValues(2.dp),
    thumbColorAnimationDuration: Duration = 330.milliseconds,
): ScrollbarVisibility.AlwaysVisible = ScrollbarVisibility.AlwaysVisible(trackThickness, trackPadding, trackPadding, thumbColorAnimationDuration)

public fun ScrollbarVisibility.AlwaysVisible.Companion.windowsAndLinux(
    trackThickness: Dp = 18.dp,
    trackPadding: PaddingValues = PaddingValues(),
    thumbColorAnimationDuration: Duration = 330.milliseconds,
): ScrollbarVisibility.AlwaysVisible = ScrollbarVisibility.AlwaysVisible(trackThickness, trackPadding, trackPadding, thumbColorAnimationDuration)

public fun ScrollbarVisibility.WhenScrolling.Companion.default(): ScrollbarVisibility.WhenScrolling =
    if (hostOs.isMacOS) {
        ScrollbarVisibility.WhenScrolling.macOs()
    } else {
        ScrollbarVisibility.WhenScrolling.windowsAndLinux()
    }

public fun ScrollbarVisibility.WhenScrolling.Companion.macOs(
    trackThickness: Dp = 11.dp,
    trackThicknessExpanded: Dp = 14.dp,
    trackPadding: PaddingValues = PaddingValues(2.dp),
    trackPaddingWithBorder: PaddingValues = PaddingValues(1.dp),
    trackColorAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = trackColorAnimationDuration,
    thumbColorAnimationDuration: Duration = trackColorAnimationDuration,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        trackThickness = trackThickness,
        trackThicknessExpanded = trackThicknessExpanded,
        trackPadding = trackPadding,
        trackPaddingWithBorder = trackPaddingWithBorder,
        trackColorAnimationDuration = trackColorAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        thumbColorAnimationDuration = thumbColorAnimationDuration,
        lingerDuration = lingerDuration,
    )

public fun ScrollbarVisibility.WhenScrolling.Companion.windowsAndLinux(
    trackThickness: Dp = 11.dp,
    trackThicknessExpanded: Dp = 14.dp,
    trackPadding: PaddingValues = PaddingValues(),
    trackPaddingWithBorder: PaddingValues = trackPadding,
    trackColorAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = trackColorAnimationDuration,
    thumbColorAnimationDuration: Duration = trackColorAnimationDuration,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        trackThickness = trackThickness,
        trackThicknessExpanded = trackThicknessExpanded,
        trackPadding = trackPadding,
        trackPaddingWithBorder = trackPaddingWithBorder,
        trackColorAnimationDuration = trackColorAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        thumbColorAnimationDuration = thumbColorAnimationDuration,
        lingerDuration = lingerDuration,
    )

public fun ScrollbarColors.Companion.macOsLight(
    thumbBackground: Color = Color(0x00000000),
    thumbBackgroundActive: Color = Color(0x80000000),
    thumbOpaqueBackground: Color = Color(0x33000000),
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundActive,
    thumbBorder: Color = thumbBackground,
    thumbBorderActive: Color = thumbBackgroundActive,
    thumbOpaqueBorder: Color = thumbOpaqueBackground,
    thumbOpaqueBorderHovered: Color = thumbBackgroundActive,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackBackground,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundActive,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderActive,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarColors.Companion.windowsAndLinuxLight(
    thumbBackground: Color = Color(0x33737373),
    thumbBackgroundActive: Color = Color(0x47737373),
    thumbOpaqueBackground: Color = thumbBackground,
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundActive,
    thumbBorder: Color = Color(0x33595959),
    thumbBorderActive: Color = Color(0x47595959),
    thumbOpaqueBorder: Color = thumbBorder,
    thumbOpaqueBorderHovered: Color = thumbBorderActive,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackBackground,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundActive,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderActive,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarColors.Companion.macOsDark(
    thumbBackground: Color = Color(0x00808080),
    thumbBackgroundActive: Color = Color(0x8C808080),
    thumbOpaqueBackground: Color = Color(0x59808080),
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundActive,
    thumbBorder: Color = Color(0x00262626),
    thumbBorderActive: Color = Color(0x8C262626),
    thumbOpaqueBorder: Color = Color(0x59262626),
    thumbOpaqueBorderHovered: Color = thumbBorderActive,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackBackground,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundActive,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderActive,
        thumbOpaqueBorder = thumbOpaqueBorder,
        thumbOpaqueBorderHovered = thumbOpaqueBorderHovered,
        trackBackground = trackBackground,
        trackBackgroundExpanded = trackBackgroundHovered,
        trackOpaqueBackground = trackOpaqueBackground,
        trackOpaqueBackgroundHovered = trackOpaqueBackgroundHovered,
    )

public fun ScrollbarColors.Companion.windowsAndLinuxDark(
    thumbBackground: Color = Color(0x47A6A6A6),
    thumbBackgroundActive: Color = Color(0x59A6A6A6),
    thumbOpaqueBackground: Color = thumbBackground,
    thumbOpaqueBackgroundHovered: Color = thumbBackgroundActive,
    thumbBorder: Color = Color(0x47383838),
    thumbBorderActive: Color = Color(0x59383838),
    thumbOpaqueBorder: Color = thumbBorder,
    thumbOpaqueBorderHovered: Color = thumbBorderActive,
    trackBackground: Color = Color(0x00808080),
    trackBackgroundHovered: Color = Color(0x1A808080),
    trackOpaqueBackground: Color = trackBackground,
    trackOpaqueBackgroundHovered: Color = trackBackground,
): ScrollbarColors =
    ScrollbarColors(
        thumbBackground = thumbBackground,
        thumbBackgroundActive = thumbBackgroundActive,
        thumbOpaqueBackground = thumbOpaqueBackground,
        thumbOpaqueBackgroundHovered = thumbOpaqueBackgroundHovered,
        thumbBorder = thumbBorder,
        thumbBorderActive = thumbBorderActive,
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
): ScrollbarMetrics = ScrollbarMetrics(thumbCornerSize, minThumbLength)

public fun ScrollbarMetrics.Companion.windowsAndLinux(
    thumbCornerSize: CornerSize = CornerSize(0),
    minThumbLength: Dp = 20.dp,
): ScrollbarMetrics = ScrollbarMetrics(thumbCornerSize, minThumbLength)
