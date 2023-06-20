package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.ProgressBarColors
import org.jetbrains.jewel.internal.progressBarDefaultsColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiProgressBarDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

object DarkProgressBarDefaults : IntUiProgressBarDefaults() {

    @Composable
    override fun colors(): ProgressBarColors {
        val palette = LocalIntUiPalette.current
        return remember {
            progressBarDefaultsColors(
                palette.grey(4),
                palette.blue(6)
            )
        }
    }
}
