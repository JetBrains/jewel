package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.internal.MenuColors
import org.jetbrains.jewel.internal.MenuItemColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiMenuDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object LightMenuDefaults : IntUiMenuDefaults() {

    @Composable
    override fun menuColors(): MenuColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            org.jetbrains.jewel.internal.menuColors(
                background = palette.grey(14),
                borderStroke = Stroke(1.dp, palette.grey(9), Stroke.Alignment.Inside),
                shadowColor = Color(0x78919191)
            )
        }
    }

    @Composable
    override fun menuItemColors(): MenuItemColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            org.jetbrains.jewel.internal.menuItemColors(
                foreground = palette.grey(1),
                background = palette.grey(14),
                iconColor = palette.grey(7),
                focusedForeground = palette.grey(1),
                focusedBackground = palette.blue(11),
                focusedIconColor = palette.grey(7),
                disabledForeground = palette.grey(8),
                disabledBackground = palette.grey(14),
                disabledIconColor = palette.grey(7),
                separatorColor = palette.grey(12)
            )
        }
    }
}
