package org.jetbrains.jewel.samples.standalone

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.materialkolor.PaletteStyle
import com.materialkolor.dynamicColorScheme
import org.jetbrains.jewel.foundation.BorderColors
import org.jetbrains.jewel.foundation.OutlineColors
import org.jetbrains.jewel.foundation.TextColors
import org.jetbrains.jewel.intui.standalone.theme.dark
import org.jetbrains.jewel.intui.standalone.theme.light
import org.jetbrains.jewel.foundation.GlobalColors as JewelGlobalColors

object DynamicTheme {
    object GlobalColors {
        @Composable
        fun dark() : JewelGlobalColors {
            val theme = generateDynamicColors(true)

            return JewelGlobalColors.dark(
                paneBackground = theme.surfaceContainer,
                text = TextColors.dark(
                    normal = theme.onSurface,
                    selected = theme.onSurface,
                    info = theme.onSurfaceVariant,
                    disabled = theme.onSurfaceVariant,
                    error = theme.error
                ),
                borders = BorderColors.dark(
                    normal = theme.outline,
                    focused = theme.outlineVariant,
                    disabled = theme.outlineVariant
                ),
                outlines = OutlineColors.dark(
                    focused = theme.primary,
                    focusedError = theme.error,
                    error = theme.error
                )
            )
        }

        @Composable
        fun light() : JewelGlobalColors {
            val theme = generateDynamicColors(false)

            return JewelGlobalColors.light(
                paneBackground = theme.surfaceContainer,
                text = TextColors.light(
                    normal = theme.onSurface,
                    selected = theme.onSurface,
                    info = theme.onSurfaceVariant,
                    disabled = theme.onSurfaceVariant,
                    error = theme.error
                ),
                borders = BorderColors.light(
                    normal = theme.outline,
                    focused = theme.outlineVariant,
                    disabled = theme.outlineVariant
                ),
                outlines = OutlineColors.light(
                    focused = theme.primary,
                    focusedError = theme.error,
                    error = theme.error
                )
            )
        }
    }
}

@Composable
private fun generateDynamicColors(isDark: Boolean): ColorScheme {
    return dynamicColorScheme(
        seedColor = Color.Red,
        isAmoled = true,
        isDark = isDark,
        style = PaletteStyle.TonalSpot
    )
}

