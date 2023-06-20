package org.jetbrains.jewel.themes.intui.standalone.internal.light

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.internal.ProgressBarColors
import org.jetbrains.jewel.internal.progressBarDefaultsColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiProgressBarDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

object LightProgressBarDefaults : IntUiProgressBarDefaults() {

    @Composable
    override fun colors(): ProgressBarColors {
        val palette = LocalIntUiPalette.current
        return remember {
            progressBarDefaultsColors(
                palette.grey(11),
                palette.blue(4)
            )
        }
    }
}
