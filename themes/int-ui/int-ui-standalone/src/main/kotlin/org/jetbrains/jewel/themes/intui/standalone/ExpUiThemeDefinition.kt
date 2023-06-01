package org.jetbrains.jewel.themes.intui.standalone

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.IntelliJMetrics
import org.jetbrains.jewel.IntelliJPainters
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.IntelliJTypography
import org.jetbrains.jewel.IntelliJTheme as BaseIntelliJTheme

@Composable
fun IntUiTheme(isDark: Boolean, content: @Composable () -> Unit) =
    // Putting content in condition branches will cause full recomposition(remembers in content will be re-calculated)
    BaseIntelliJTheme(
        if (isDark) IntelliJPalette.dark else IntelliJPalette.light,
        IntelliJMetrics.default,
        if (isDark) IntelliJPainters.dark else IntelliJPainters.light,
        if (isDark) IntelliJTypography.dark else IntelliJTypography.light,
        content
    )

@Composable
fun IntUiThemeLight(content: @Composable () -> Unit) =
    BaseIntelliJTheme(
        IntelliJPalette.light,
        IntelliJMetrics.default,
        IntelliJPainters.light,
        IntelliJTypography.light,
        content
    )

@Composable
fun IntUiThemeDark(content: @Composable () -> Unit) =
    BaseIntelliJTheme(
        IntelliJPalette.dark,
        IntelliJMetrics.default,
        IntelliJPainters.dark,
        IntelliJTypography.dark,
        content
    )
