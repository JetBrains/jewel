package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.DividerStyle
import org.jetbrains.jewel.ui.component.styling.SplitButtonStyle

public val SplitButtonStyle.Companion.Default: IntUiDefaultSplitButtonStyleFactory
    get() = IntUiDefaultSplitButtonStyleFactory

public object IntUiDefaultSplitButtonStyleFactory {
    @Composable
    public fun light(
        buttonStyle: ButtonStyle = ButtonStyle.Default.light(),
        dividerStyle: DividerStyle = DividerStyle.light(),
    ): SplitButtonStyle = SplitButtonStyle(buttonStyle, dividerStyle)

    @Composable
    public fun dark(
        buttonStyle: ButtonStyle = ButtonStyle.Default.dark(),
        dividerStyle: DividerStyle = DividerStyle.dark(),
    ): SplitButtonStyle = SplitButtonStyle(buttonStyle, dividerStyle)
}

public val SplitButtonStyle.Companion.Outlined: IntUiOutlinedSplitButtonStyleFactory
    get() = IntUiOutlinedSplitButtonStyleFactory

public object IntUiOutlinedSplitButtonStyleFactory {
    @Composable
    public fun light(
        buttonStyle: ButtonStyle = ButtonStyle.Outlined.light(),
        dividerStyle: DividerStyle = DividerStyle.light(),
    ): SplitButtonStyle = SplitButtonStyle(buttonStyle, dividerStyle)

    @Composable
    public fun dark(
        buttonStyle: ButtonStyle = ButtonStyle.Outlined.dark(),
        dividerStyle: DividerStyle = DividerStyle.dark(),
    ): SplitButtonStyle = SplitButtonStyle(buttonStyle, dividerStyle)
}
