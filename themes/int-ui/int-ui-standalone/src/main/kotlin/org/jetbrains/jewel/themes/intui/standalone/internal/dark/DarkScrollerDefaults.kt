package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.internal.ScrollerColors
import org.jetbrains.jewel.internal.scrollerColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiScrollerDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object DarkScrollerDefaults : IntUiScrollerDefaults() {
    @Composable
    override fun colors(): ScrollerColors {
        val palette = LocalIntUiPalette.current
        return scrollerColors(
            palette.grey(10),
            palette.grey(12)
        )
    }
}
