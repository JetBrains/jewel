package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable
import org.jetbrains.jewel.internal.IntelliJTheme

abstract class IntUiTheme(
    protected val palette: IntUiColorPalette
) : IntelliJTheme {

    override fun provideCompositionLocalValues(): Array<ProvidedValue<*>> = arrayOf(LocalIntUiPalette provides palette)

    companion object {

        val palette: IntUiColorPalette
            @Composable
            @ReadOnlyComposable
            get() = LocalIntUiPalette.current
    }
}
