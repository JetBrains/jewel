package org.jetbrains.jewel.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import org.jetbrains.jewel.styles.localNotProvided

interface IntelliJTheme {

    val colors: IntellijColors

    val buttonDefaults: ButtonDefaults

    val isLight: Boolean

    fun provideCompositionLocalValues(): Array<ProvidedValue<*>>

    companion object {

        val buttonDefaults: ButtonDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalButtonDefaults.current

        val colors: IntellijColors
            @Composable
            @ReadOnlyComposable
            get() = LocalIntellijColors.current

        val isLight: Boolean
            @Composable
            @ReadOnlyComposable
            get() = LocalInLightTheme.current
    }
}

@Composable
fun IntelliJTheme(theme: IntelliJTheme, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalIntellijColors provides theme.colors,
        LocalButtonDefaults provides theme.buttonDefaults,
        LocalInLightTheme provides theme.isLight,
        *theme.provideCompositionLocalValues(),
        content = content
    )
}

internal val LocalInLightTheme = staticCompositionLocalOf<Boolean> {
    localNotProvided()
}
