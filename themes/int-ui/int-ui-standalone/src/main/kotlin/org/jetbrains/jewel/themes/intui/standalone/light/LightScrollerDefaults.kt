package org.jetbrains.jewel.themes.intui.standalone.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.ScrollerColors
import org.jetbrains.jewel.scrollerColors
import org.jetbrains.jewel.themes.intui.standalone.IntUiScrollerDefaults

@Suppress("MagicNumber")
object LightScrollerDefaults : IntUiScrollerDefaults() {
    @Composable
    override fun colors(): ScrollerColors {
        return remember {
            scrollerColors(
                Color(0xFFD9D9D9),
                Color(0xFF7B7C7D)
            )
        }
    }
}
