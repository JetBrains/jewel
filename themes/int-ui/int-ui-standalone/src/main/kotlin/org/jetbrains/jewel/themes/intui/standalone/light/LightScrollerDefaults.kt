package org.jetbrains.jewel.themes.intui.standalone.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.ScrollerColors
import org.jetbrains.jewel.scrollerColors
import org.jetbrains.jewel.themes.intui.standalone.IntUiScrollerDefaults
import org.jetbrains.jewel.themes.intui.standalone.LocalIntUiPalette

@Suppress("MagicNumber")
object LightScrollerDefaults : IntUiScrollerDefaults() {
    @Composable
    override fun colors(): ScrollerColors {
        val palette = LocalIntUiPalette.current
        return remember {
            scrollerColors(
                palette.grey(8),
                palette.grey(10)
            )
        }
    }
}
