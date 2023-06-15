package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.TreeColors
import org.jetbrains.jewel.internal.treeColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUITreeDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object LightTreeDefaults : IntUITreeDefaults() {
    @Composable
    override fun colors(): TreeColors {
        val palette = LocalIntUiPalette.current
        return remember(this) {
            treeColors(
                backgroundColor = palette.grey(14),
                selectedBackgroundColor = palette.grey(3),
                focusedBackgroundColor = palette.blue(9),
                selectedFocusedBackgroundColor = palette.blue(4),
                nodeIconColor = palette.grey(1),
                foregroundColor = palette.grey(1),
                focusedForegroundColor = palette.grey(1),
                selectedForegroundColor = palette.grey(1),
                selectedFocusedForegroundColor = palette.grey(1)
            )
        }
    }
}
