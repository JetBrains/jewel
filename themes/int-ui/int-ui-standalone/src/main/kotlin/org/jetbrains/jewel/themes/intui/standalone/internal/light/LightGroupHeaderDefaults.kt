package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.GroupHeaderColors
import org.jetbrains.jewel.internal.groupHeaderColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiGroupHeaderDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object LightGroupHeaderDefaults : IntUiGroupHeaderDefaults() {

    @Composable
    override fun colors(): GroupHeaderColors {
        val palette = LocalIntUiPalette.current

        return remember(palette) {
            groupHeaderColors(
                textColor = palette.grey(1),
                dividerColor = palette.grey(12)
            )
        }
    }
}
