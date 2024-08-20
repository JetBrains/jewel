package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.bridge.ScrollbarHelper
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.ui.component.styling.ScrollbarColors
import org.jetbrains.jewel.ui.component.styling.ScrollbarMetrics
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility
import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior
import org.jetbrains.skiko.hostOs
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

internal fun readScrollbarStyle(isDark: Boolean): ScrollbarStyle =
    ScrollbarStyle(
        colors = readScrollbarColors(isDark),
        metrics = readScrollbarMetrics(),
        trackClickBehavior = readTrackClickBehavior(),
        scrollbarVisibility = readScrollbarVisibility(),
    )

private fun readScrollbarVisibility() =
    if (hostOs.isMacOS) {
        ScrollbarHelper.getInstance().scrollbarVisibilityStyleFlow.value
    } else {
        ScrollbarVisibility.AlwaysVisible.windowsAndLinux()
    }

private fun readScrollbarColors(isDark: Boolean) =
    if (hostOs.isMacOS) {
        readScrollbarMacColors(isDark)
    } else {
        readScrollbarWindowsAndLinuxColors(isDark)
    }

private fun readTrackClickBehavior() =
    if (hostOs.isMacOS) {
        ScrollbarHelper.getInstance().trackClickBehaviorFlow.value
    } else {
        TrackClickBehavior.JumpToSpot
    }

private fun readScrollbarWindowsAndLinuxColors(isDark: Boolean): ScrollbarColors =
    ScrollbarColors(
        thumbBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Transparent.thumbColor",
                0x33737373,
                0x47A6A6A6,
            ),
        thumbBackgroundActive =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Transparent.hoverThumbColor",
                0x47737373,
                0x59A6A6A6,
            ),
        thumbOpaqueBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.thumbColor",
                0x33737373,
                0x47A6A6A6,
            ),
        thumbOpaqueBackgroundHovered =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.hoverThumbColor",
                0x47737373,
                0x59A6A6A6,
            ),
        thumbBorder =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Transparent.thumbBorderColor",
                0x33595959,
                0x47383838,
            ),
        thumbBorderActive =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Transparent.hoverThumbBorderColor",
                0x47595959,
                0x59383838,
            ),
        thumbOpaqueBorder =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.thumbBorderColor",
                0x33595959,
                0x47383838,
            ),
        thumbOpaqueBorderHovered =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.hoverThumbBorderColor",
                0x47595959,
                0x59383838,
            ),
        trackBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Transparent.trackColor",
                0x00808080,
                0x00808080,
            ),
        trackBackgroundExpanded =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Transparent.hoverTrackColor",
                0x1A808080,
                0x1A808080,
            ),
        trackOpaqueBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.trackColor",
                0x00808080,
                0x00808080,
            ),
        trackOpaqueBackgroundHovered =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.hoverTrackColor",
                0x1A808080,
                0x1A808080,
            ),
    )

private fun readScrollbarMacColors(isDark: Boolean): ScrollbarColors =
    ScrollbarColors(
        thumbBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.Transparent.thumbColor",
                0x00000000,
                0x59808080,
            ),
        thumbBackgroundActive =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.Transparent.hoverThumbColor",
                0x80000000,
                0x8C808080,
            ),
        thumbOpaqueBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.thumbColor",
                0x33000000,
                0x59808080,
            ),
        thumbOpaqueBackgroundHovered =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.hoverThumbColor",
                0x80000000,
                0x8C808080,
            ),
        thumbBorder =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.Transparent.thumbBorderColor",
                0x00000000,
                0x59262626,
            ),
        thumbBorderActive =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.Transparent.hoverThumbBorderColor",
                0x80000000,
                0x8C262626,
            ),
        thumbOpaqueBorder =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.thumbBorderColor",
                0x33000000,
                0x59262626,
            ),
        thumbOpaqueBorderHovered =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.hoverThumbBorderColor",
                0x80000000,
                0x8C262626,
            ),
        trackBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.Transparent.trackColor",
                0x00808080,
                0x00808080,
            ),
        trackBackgroundExpanded =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.Transparent.hoverTrackColor",
                0x1A808080,
                0x1A808080,
            ),
        trackOpaqueBackground =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.trackColor",
                0x00808080,
                0x00808080,
            ),
        trackOpaqueBackgroundHovered =
            readScrollBarColorForKey(
                isDark,
                "ScrollBar.Mac.hoverTrackColor",
                0x1A808080,
                0x1A808080,
            ),
    )

private fun readScrollBarColorForKey(
    isDark: Boolean,
    colorKey: String,
    fallbackLight: Long,
    fallbackDark: Long,
) = retrieveColorOrUnspecified(colorKey)
    .takeOrElse { if (isDark) Color(fallbackDark) else Color(fallbackLight) }

private fun readScrollbarMetrics(): ScrollbarMetrics =
    if (hostOs.isMacOS) {
        ScrollbarMetrics(
            thumbCornerSize = CornerSize(percent = 100),
            minThumbLength = 20.dp,
        )
    } else {
        ScrollbarMetrics(
            thumbCornerSize = CornerSize(0),
            minThumbLength = 16.dp,
        )
    }

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
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        trackThickness = trackThickness,
        trackThicknessExpanded = trackThicknessExpanded,
        trackPadding = trackPadding,
        trackPaddingWithBorder = trackPaddingWithBorder,
        appearAnimationDuration = appearAnimationDuration,
        disappearAnimationDuration = disappearAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        lingerDuration = lingerDuration,
    )

public fun ScrollbarVisibility.WhenScrolling.Companion.windowsAndLinux(
    trackThickness: Dp = 11.dp,
    trackThicknessExpanded: Dp = 14.dp,
    trackPadding: PaddingValues = PaddingValues(),
    trackPaddingWithBorder: PaddingValues = trackPadding,
    appearAnimationDuration: Duration = 125.milliseconds,
    disappearAnimationDuration: Duration = 125.milliseconds,
    expandAnimationDuration: Duration = 125.milliseconds,
    lingerDuration: Duration = 700.milliseconds,
): ScrollbarVisibility.WhenScrolling =
    ScrollbarVisibility.WhenScrolling(
        trackThickness = trackThickness,
        trackThicknessExpanded = trackThicknessExpanded,
        trackPadding = trackPadding,
        trackPaddingWithBorder = trackPaddingWithBorder,
        appearAnimationDuration = appearAnimationDuration,
        disappearAnimationDuration = disappearAnimationDuration,
        expandAnimationDuration = expandAnimationDuration,
        lingerDuration = lingerDuration,
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
