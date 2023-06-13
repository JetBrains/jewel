package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.LabelledTextFieldColors
import org.jetbrains.jewel.internal.labelledTextFieldColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiLabelledTextFieldDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object LightLabelledTextFieldDefaults : IntUiLabelledTextFieldDefaults() {

    @Composable
    override fun colors(): LabelledTextFieldColors {
        val baseColors = LightTextFieldDefaults.colors()
        val palette = LocalIntUiPalette.current

        return remember(baseColors, palette) {
            labelledTextFieldColors(
                baseColors,
                labelTextColor = palette.grey(1),
                hintTextColor = palette.grey(6)
            )
        }
    }
}
