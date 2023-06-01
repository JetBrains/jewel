package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.runtime.ProvidedValue
import org.jetbrains.jewel.internal.ButtonDefaults
import org.jetbrains.jewel.internal.IntelliJColors
import org.jetbrains.jewel.internal.IntelliJTheme

class IntUiTheme(
    private val palettes: IntUiPalettes
) : IntelliJTheme {

    override val colors: IntelliJColors
        get() = palettes.toIntelliJColor()

    override val buttonDefaults: ButtonDefaults get() = IntUiButtonDefaults

    override fun provideCompositionLocalValues(): Array<ProvidedValue<*>> {
        return arrayOf(LocalIntUiPalettes provides palettes)
    }
}

