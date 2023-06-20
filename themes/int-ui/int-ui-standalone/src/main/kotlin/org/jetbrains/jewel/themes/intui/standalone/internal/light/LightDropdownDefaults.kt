package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.internal.DropdownColors
import org.jetbrains.jewel.internal.MenuColors
import org.jetbrains.jewel.internal.MenuItemColors
import org.jetbrains.jewel.internal.dropdownColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiDropdownDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object LightDropdownDefaults : IntUiDropdownDefaults() {

    @Composable
    override fun colors(): DropdownColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            dropdownColors(
                foreground = palette.grey(1),
                background = palette.grey(14),
                iconColor = palette.grey(7),
                borderStroke = Stroke(1.dp, palette.grey(9), Stroke.Alignment.Inside),
                focusedForeground = palette.grey(1),
                focusedBackground = palette.grey(14),
                focusedBorderStroke = Stroke(2.dp, palette.blue(4), Stroke.Alignment.Center),
                errorForeground = palette.grey(1),
                errorBackground = palette.grey(14),
                errorBorderStroke = Stroke(2.dp, palette.red(8), Stroke.Alignment.Center),
                errorFocusedForeground = palette.grey(1),
                errorFocusedBackground = palette.grey(14),
                errorFocusedBorderStroke = Stroke(2.dp, palette.red(4), Stroke.Alignment.Center),
                disabledForeground = palette.grey(8),
                disabledBackground = palette.grey(13),
                disabledBorderStroke = Stroke(1.dp, palette.grey(11), Stroke.Alignment.Inside),
                disabledIconColor = palette.grey(9)
            )
        }
    }

    @Composable
    override fun menuColors(): MenuColors = LightMenuDefaults.menuColors()

    @Composable
    override fun menuItemColors(): MenuItemColors = LightMenuDefaults.menuItemColors()
}
