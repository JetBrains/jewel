package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
        dividerMetrics: DividerMetrics = DividerMetrics.defaults(),
        dividerColor: Color = IntUiLightTheme.colors.blue(8),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(4),
        dividerPadding: Dp = 4.dp,
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, dividerPadding, chevronColor)

    @Composable
    public fun dark(
        buttonStyle: ButtonStyle = ButtonStyle.Default.dark(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaults(),
        dividerColor: Color = IntUiLightTheme.colors.blue(9),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(4),
        dividerPadding: Dp = 4.dp,
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, dividerPadding, chevronColor)
}

public val SplitButtonStyle.Companion.Outlined: IntUiOutlinedSplitButtonStyleFactory
    get() = IntUiOutlinedSplitButtonStyleFactory

public object IntUiOutlinedSplitButtonStyleFactory {
    @Composable
    public fun light(
        buttonStyle: ButtonStyle = ButtonStyle.Outlined.light(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaults(),
        dividerColor: Color = IntUiLightTheme.colors.gray(9),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(12),
        dividerPadding: Dp = 4.dp,
        chevronColor: Color = Color.Unspecified,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, dividerPadding, chevronColor)

    @Composable
    public fun dark(
        buttonStyle: ButtonStyle = ButtonStyle.Outlined.dark(),
        dividerMetrics: DividerMetrics = DividerMetrics.defaults(),
        dividerColor: Color = IntUiLightTheme.colors.gray(5),
        dividerDisabledColor: Color = IntUiLightTheme.colors.gray(5),
        dividerPadding: Dp = 4.dp,
        chevronColor: Color = Color.White,
    ): SplitButtonStyle =
        SplitButtonStyle(buttonStyle, dividerMetrics, dividerColor, dividerDisabledColor, dividerPadding, chevronColor)
}