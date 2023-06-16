package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.internal.DropdownColors
import org.jetbrains.jewel.internal.MenuColors
import org.jetbrains.jewel.internal.MenuItemColors
import org.jetbrains.jewel.internal.dropdownColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiDropdownDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

object DarkDropdownDefaults : IntUiDropdownDefaults() {

    @Composable
    override fun colors(): DropdownColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            dropdownColors(
                foreground = palette.grey(12),
                background = palette.grey(2),
                iconColor = palette.grey(10),
                borderStroke = Stroke(1.dp, palette.grey(5), Stroke.Alignment.Inside),
                focusedForeground = palette.grey(12),
                focusedBackground = palette.grey(2),
                focusedBorderStroke = Stroke(2.dp, palette.blue(6), Stroke.Alignment.Center),
                errorForeground = palette.grey(12),
                errorBackground = palette.grey(2),
                errorBorderStroke = Stroke(2.dp, palette.red(2), Stroke.Alignment.Center),
                errorFocusedForeground = palette.grey(12),
                errorFocusedBackground = palette.grey(2),
                errorFocusedBorderStroke = Stroke(2.dp, palette.red(6), Stroke.Alignment.Center),
                disabledForeground = palette.grey(7),
                disabledBackground = palette.grey(2),
                disabledBorderStroke = Stroke(1.dp, palette.grey(5), Stroke.Alignment.Inside),
                disabledIconColor = palette.grey(6),
            )
        }
    }

    @Composable
    override fun menuColors(): MenuColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            org.jetbrains.jewel.internal.menuColors(
                background = palette.grey(2),
                borderStroke = Stroke(1.dp, palette.grey(3), Stroke.Alignment.Inside),
                shadowColor = Color(0x66000000)
            )
        }
    }

    @Composable
    override fun menuItemColors(): MenuItemColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            org.jetbrains.jewel.internal.menuItemColors(
                foreground = palette.grey(12),
                background = palette.grey(2),
                borderStroke = Stroke.None,
                hoveredForeground = palette.grey(12),
                hoveredBackground = palette.blue(2),
                hoveredBorderStroke = Stroke.None,
                focusedForeground = palette.grey(12),
                focusedBackground = palette.blue(2),
                focusedBorderStroke = Stroke.None,
                disabledForeground = palette.grey(7),
                disabledBackground = palette.grey(2),
                disabledBorderStroke = Stroke.None,
                separatorColor = palette.grey(3),
            )
        }
    }
}
