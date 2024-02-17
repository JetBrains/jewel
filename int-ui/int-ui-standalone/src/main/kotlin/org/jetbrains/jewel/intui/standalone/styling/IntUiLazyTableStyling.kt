package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.LazyTableColors
import org.jetbrains.jewel.ui.component.styling.LazyTableMetrics
import org.jetbrains.jewel.ui.component.styling.LazyTableStyle
import kotlin.math.max
import kotlin.math.min

@Composable
public fun LazyTableStyle.Companion.light(): LazyTableStyle =
    LazyTableStyle(
        colors = LazyTableColors.light(),
        metrics = LazyTableMetrics.defaults(),
    )

@Composable
public fun LazyTableStyle.Companion.dark(): LazyTableStyle =
    LazyTableStyle(
        colors = LazyTableColors.dark(),
        metrics = LazyTableMetrics.defaults(),
    )

@Composable
public fun LazyTableColors.Companion.light(
    background: Color = IntUiLightTheme.colors.grey(13),
    backgroundSelected: Color = IntUiLightTheme.colors.blue(11),
    backgroundInactiveSelected: Color = IntUiLightTheme.colors.grey(11),
    foreground: Color = IntUiLightTheme.colors.grey(1),
    foregroundSelected: Color = IntUiLightTheme.colors.grey(1),
    foregroundInactiveSelected: Color = IntUiLightTheme.colors.grey(1),
    gridColor: Color = IntUiLightTheme.colors.grey(12),
    stripeColor: Color = IntUiLightTheme.colors.grey(13),
    headerBackground: Color = IntUiLightTheme.colors.grey(13),
    headerForeground: Color = IntUiLightTheme.colors.grey(1),
    headerSeparatorColor: Color = IntUiLightTheme.colors.grey(12),
): LazyTableColors =
    LazyTableColors(
        background = background,
        backgroundSelected = backgroundSelected,
        backgroundInactiveSelected = backgroundInactiveSelected,
        foreground = foreground,
        foregroundSelected = foregroundSelected,
        foregroundInactiveSelected = foregroundInactiveSelected,
        gridColor = gridColor,
        stripeColor = stripeColor,
        headerBackground = headerBackground,
        headerForeground = headerForeground,
        headerSeparatorColor = headerSeparatorColor,
    )

@Composable
public fun LazyTableColors.Companion.dark(
    background: Color = IntUiDarkTheme.colors.grey(2),
    backgroundSelected: Color = IntUiDarkTheme.colors.blue(2),
    backgroundInactiveSelected: Color = IntUiDarkTheme.colors.grey(4),
    foreground: Color = IntUiDarkTheme.colors.grey(12),
    foregroundSelected: Color = IntUiDarkTheme.colors.grey(12),
    foregroundInactiveSelected: Color = IntUiDarkTheme.colors.grey(12),
    gridColor: Color = IntUiDarkTheme.colors.grey(1),
    stripeColor: Color = IntUiDarkTheme.colors.grey(2),
    headerBackground: Color = IntUiDarkTheme.colors.grey(2),
    headerForeground: Color = IntUiDarkTheme.colors.grey(12),
    headerSeparatorColor: Color = IntUiDarkTheme.colors.grey(1),
): LazyTableColors =
    LazyTableColors(
        background = background,
        backgroundSelected = backgroundSelected,
        backgroundInactiveSelected = backgroundInactiveSelected,
        foreground = foreground,
        foregroundSelected = foregroundSelected,
        foregroundInactiveSelected = foregroundInactiveSelected,
        gridColor = gridColor,
        stripeColor = stripeColor,
        headerBackground = headerBackground,
        headerForeground = headerForeground,
        headerSeparatorColor = headerSeparatorColor,
    )

@Composable
public fun LazyTableMetrics.Companion.defaults(): LazyTableMetrics = LazyTableMetrics()
