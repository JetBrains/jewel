package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.DividerMetrics
import org.jetbrains.jewel.ui.component.styling.SplitButtonStyle

public val SplitButtonStyle.Companion.Default: IntUiDefaultSplitButtonStyleFactory
    get() = IntUiDefaultSplitButtonStyleFactory

public object IntUiDefaultSplitButtonStyleFactory {
    @Composable
    public fun light(
        buttonStyle: ButtonStyle = ButtonStyle.Default.light(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaultSplitButton(),
        dividerColor: Color = IntUiLightTheme.colors.blue(8),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(4),
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, chevronColor)

    @Composable
    public fun dark(
        buttonStyle: ButtonStyle = ButtonStyle.Default.dark(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaultSplitButton(),
        dividerColor: Color = IntUiLightTheme.colors.blue(9),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(4),
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, chevronColor)
}

public val SplitButtonStyle.Companion.Outlined: IntUiOutlinedSplitButtonStyleFactory
    get() = IntUiOutlinedSplitButtonStyleFactory

public object IntUiOutlinedSplitButtonStyleFactory {
    @Composable
    public fun light(
        buttonStyle: ButtonStyle = ButtonStyle.Default.light(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaults(),
        dividerColor: Color = IntUiLightTheme.colors.blue(8),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(4),
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, chevronColor)

    @Composable
    public fun dark(
        buttonStyle: ButtonStyle = ButtonStyle.Default.dark(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaults(),
        dividerColor: Color = IntUiLightTheme.colors.blue(9),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(4),
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, chevronColor)
}
