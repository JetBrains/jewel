package org.jetbrains.jewel.themes.intui.standalone.dark

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.ScrollerColors
import org.jetbrains.jewel.scrollerColors
import org.jetbrains.jewel.themes.intui.standalone.IntUiScrollerDefaults
import org.jetbrains.jewel.themes.intui.standalone.LocalIntUiPalette

@Suppress("MagicNumber")
object DarkScrollerDefaults : IntUiScrollerDefaults() {
    @Composable
    override fun colors(): ScrollerColors {
        val palette = LocalIntUiPalette.current
        return scrollerColors(
            Color(0xFF48494B),
            Color(0xFF595A5C)
        )
    }
}
