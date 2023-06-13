package org.jetbrains.jewel.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.styles.localNotProvided

interface IntelliJTheme {

    val colors: IntellijColors

    val buttonDefaults: ButtonDefaults

    val checkboxDefaults: CheckboxDefaults

    val groupHeaderDefaults: GroupHeaderDefaults

    val linkDefaults: LinkDefaults

    val textFieldDefaults: TextFieldDefaults

    val labelledTextFieldDefaults: LabelledTextFieldDefaults

    val radioButtonDefaults: RadioButtonDefaults

    val defaultTextStyle: TextStyle

    val isLight: Boolean

    fun provideCompositionLocalValues(): Array<ProvidedValue<*>>

    companion object {

        val buttonDefaults: ButtonDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalButtonDefaults.current

        val checkboxDefaults: CheckboxDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalCheckboxDefaults.current

        val groupHeaderDefaults: GroupHeaderDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalGroupHeaderDefaults.current

        val linkDefaults: LinkDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalLinkDefaults.current

        val textFieldDefaults: TextFieldDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalTextFieldDefaults.current

        val labelledTextFieldDefaults: LabelledTextFieldDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalLabelledTextFieldDefaults.current

        val radioButtonDefaults: RadioButtonDefaults
            @Composable
            @ReadOnlyComposable
            get() = LocalRadioButtonDefaults.current

        val colors: IntellijColors
            @Composable
            @ReadOnlyComposable
            get() = LocalIntellijColors.current

        val defaultTextStyle: TextStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalTextStyle.current

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
        LocalCheckboxDefaults provides theme.checkboxDefaults,
        LocalGroupHeaderDefaults provides theme.groupHeaderDefaults,
        LocalLinkDefaults provides theme.linkDefaults,
        LocalTextFieldDefaults provides theme.textFieldDefaults,
        LocalLabelledTextFieldDefaults provides theme.labelledTextFieldDefaults,
        LocalRadioButtonDefaults provides theme.radioButtonDefaults,
        LocalTextStyle provides theme.defaultTextStyle,
        LocalTextColor provides theme.colors.foreground,
        LocalInLightTheme provides theme.isLight,
        *theme.provideCompositionLocalValues(),
        content = content
    )
}

internal val LocalInLightTheme = staticCompositionLocalOf<Boolean> {
    localNotProvided()
}
