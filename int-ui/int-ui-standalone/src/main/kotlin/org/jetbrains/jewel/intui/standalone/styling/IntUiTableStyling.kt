package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.TableColors
import org.jetbrains.jewel.ui.component.styling.TableMetrics
import org.jetbrains.jewel.ui.component.styling.TableStyle

@Composable
public fun TableStyle.Companion.light(): TableStyle =
    TableStyle(
        colors = TableColors.light(),
        metrics = TableMetrics.defaults(),
    )

@Composable
public fun TableStyle.Companion.dark(): TableStyle =
    TableStyle(
        colors = TableColors.dark(),
        metrics = TableMetrics.defaults(),
    )

@Composable
public fun TableColors.Companion.light(
    background: Brush = SolidColor(IntUiLightTheme.colors.gray(13)),
    backgroundSelected: Brush = SolidColor(IntUiLightTheme.colors.blue(11)),
    backgroundInactiveSelected: Brush = SolidColor(IntUiLightTheme.colors.gray(11)),
    foreground: Color = IntUiLightTheme.colors.gray(1),
    foregroundSelected: Color = IntUiLightTheme.colors.gray(1),
    foregroundInactiveSelected: Color = IntUiLightTheme.colors.gray(1),
    gridColor: Color = IntUiLightTheme.colors.gray(12),
    stripeBackground: Brush = SolidColor(IntUiLightTheme.colors.gray(13)),
    headerBackground: Brush = SolidColor(IntUiLightTheme.colors.gray(13)),
    headerForeground: Color = IntUiLightTheme.colors.gray(1),
    headerSeparatorColor: Color = IntUiLightTheme.colors.gray(12),
): TableColors =
    TableColors(
        background = background,
        backgroundSelected = backgroundSelected,
        backgroundInactiveSelected = backgroundInactiveSelected,
        foreground = foreground,
        foregroundSelected = foregroundSelected,
        foregroundInactiveSelected = foregroundInactiveSelected,
        gridColor = gridColor,
        stripeBackground = stripeBackground,
        headerBackground = headerBackground,
        headerForeground = headerForeground,
        headerSeparatorColor = headerSeparatorColor,
    )

@Composable
public fun TableColors.Companion.dark(
    background: Brush = SolidColor(IntUiDarkTheme.colors.gray(2)),
    backgroundSelected: Brush = SolidColor(IntUiDarkTheme.colors.blue(2)),
    backgroundInactiveSelected: Brush = SolidColor(IntUiDarkTheme.colors.gray(4)),
    foreground: Color = IntUiDarkTheme.colors.gray(12),
    foregroundSelected: Color = IntUiDarkTheme.colors.gray(12),
    foregroundInactiveSelected: Color = IntUiDarkTheme.colors.gray(12),
    gridColor: Color = IntUiDarkTheme.colors.gray(1),
    stripeBackground: Brush = SolidColor(IntUiDarkTheme.colors.gray(2)),
    headerBackground: Brush = SolidColor(IntUiDarkTheme.colors.gray(2)),
    headerForeground: Color = IntUiDarkTheme.colors.gray(12),
    headerSeparatorColor: Color = IntUiDarkTheme.colors.gray(1),
): TableColors =
    TableColors(
        background = background,
        backgroundSelected = backgroundSelected,
        backgroundInactiveSelected = backgroundInactiveSelected,
        foreground = foreground,
        foregroundSelected = foregroundSelected,
        foregroundInactiveSelected = foregroundInactiveSelected,
        gridColor = gridColor,
        stripeBackground = stripeBackground,
        headerBackground = headerBackground,
        headerForeground = headerForeground,
        headerSeparatorColor = headerSeparatorColor,
    )

@Composable
public fun TableMetrics.Companion.defaults(): TableMetrics = TableMetrics()
