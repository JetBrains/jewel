package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import org.jetbrains.jewel.internal.ButtonDefaults
import org.jetbrains.jewel.internal.IntellijColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiTheme

object DarkTheme : IntUiTheme(DarkPalette) {

    override val colors: IntellijColors = IntellijColors(
        foreground = palette.grey(12),
        background = palette.grey(2),
        borderColor = palette.grey(1),

        disabledForeground = palette.grey(5),
        disabledBackground = palette.grey(1),
        disabledBorderColor = palette.grey(3)
    )

    override val buttonDefaults: ButtonDefaults = DarkButtonDefaults
    override val isLight: Boolean = false
}
