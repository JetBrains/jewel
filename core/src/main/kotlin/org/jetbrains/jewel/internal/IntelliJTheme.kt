package org.jetbrains.jewel.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable

interface IntelliJTheme {

    val colors: IntelliJColors

    val buttonDefaults: ButtonDefaults

    fun provideCompositionLocalValues(): Array<ProvidedValue<*>>

    companion object {

        val colors: IntelliJColors
            @Composable
            @ReadOnlyComposable
            get() = LocalIntelliJColors.current

        val buttonDefaults: ButtonDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalButtonDefaults.current
    }
}

@Composable
fun IntelliJTheme(theme: IntelliJTheme, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalIntelliJColors provides theme.colors,
        LocalButtonDefaults provides theme.buttonDefaults,
        *theme.provideCompositionLocalValues(),
        content = content
    )
}
