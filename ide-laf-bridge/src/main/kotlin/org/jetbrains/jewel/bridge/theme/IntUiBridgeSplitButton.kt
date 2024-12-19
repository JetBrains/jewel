package org.jetbrains.jewel.bridge.theme

import androidx.compose.ui.unit.dp
import com.intellij.util.ui.JBUI
import org.jetbrains.jewel.bridge.isNewUiTheme
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.bridge.toComposeColor
import org.jetbrains.jewel.ui.component.styling.SplitButtonStyle

private val dividerPadding: Int
    get() = if (isNewUiTheme()) 4 else 1

public fun readDefaultSplitButtonStyle(): SplitButtonStyle = SplitButtonStyle(
    button = readDefaultButtonStyle(),
    dividerMetrics = readDividerStyle().metrics,
    dividerColor = retrieveColorOrUnspecified("Button.Split.default.separatorColor"),
    dividerDisabledColor = retrieveColorOrUnspecified("Button.Split.default.separatorColor.disabled"),
    dividerPadding = dividerPadding.dp,
    chevronColor = JBUI.CurrentTheme.Button.Split.Default.ICON_COLOR.toComposeColor(),
)

public fun readOutlinedSplitButtonStyle(): SplitButtonStyle = SplitButtonStyle(
    button = readOutlinedButtonStyle(),
    dividerMetrics = readDividerStyle().metrics,
    dividerColor = JBUI.CurrentTheme.Button.buttonOutlineColorStart(false).toComposeColor(),
    dividerDisabledColor = JBUI.CurrentTheme.Button.buttonOutlineColorStart(false).toComposeColor(),
    dividerPadding = dividerPadding.dp,
    chevronColor = JBUI.CurrentTheme.Button.Split.Default.ICON_COLOR.toComposeColor(),
)
