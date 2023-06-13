package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.LabelledTextFieldColors
import org.jetbrains.jewel.internal.labelledTextFieldColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiLabelledTextFieldDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object DarkLabelledTextFieldDefaults : IntUiLabelledTextFieldDefaults() {

    @Composable
    override fun colors(): LabelledTextFieldColors {
        val baseColors = DarkTextFieldDefaults.colors()
        val palette = LocalIntUiPalette.current

        return remember(baseColors, palette) {
            labelledTextFieldColors(
                baseColors,
                labelTextColor = palette.grey(12),
                hintTextColor = palette.grey(7)
            )
        }
    }
}
