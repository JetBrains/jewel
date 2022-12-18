package org.jetbrains.jewel.themes.expui.standalone

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.IntelliJMetrics
import org.jetbrains.jewel.IntelliJPainters
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.IntelliJTypography
import org.jetbrains.jewel.IntelliJTheme as BaseIntelliJTheme

@Composable
fun ExpUiTheme(isDark: Boolean, content: @Composable () -> Unit) =
    // Putting content in condition branches will cause full recomposition(remembers in content will be re-calculated)
    BaseIntelliJTheme(
        if (isDark) IntelliJPalette.dark else IntelliJPalette.light,
        IntelliJMetrics.default,
        if (isDark) IntelliJPainters.dark else IntelliJPainters.light,
        if (isDark) IntelliJTypography.darcula else IntelliJTypography.light,
        content
    )

@Composable
fun ExpUiThemeLight(content: @Composable () -> Unit) =
    BaseIntelliJTheme(
        IntelliJPalette.light,
        IntelliJMetrics.default,
        IntelliJPainters.light,
        IntelliJTypography.light,
        content
    )

@Composable
fun ExpUiThemeDark(content: @Composable () -> Unit) =
    BaseIntelliJTheme(
        IntelliJPalette.dark,
        IntelliJMetrics.default,
        IntelliJPainters.dark,
        IntelliJTypography.darcula,
        content
    )
