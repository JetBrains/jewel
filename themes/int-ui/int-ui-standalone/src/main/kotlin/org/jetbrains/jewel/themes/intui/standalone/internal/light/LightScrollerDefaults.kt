package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.ScrollerColors
import org.jetbrains.jewel.internal.scrollerColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiScrollerDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

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
