package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.intellij.ide.ui.laf.darcula.DarculaUIUtil
import com.intellij.util.ui.JBUI
import org.jetbrains.jewel.bridge.createVerticalBrush
import org.jetbrains.jewel.bridge.dp
import org.jetbrains.jewel.bridge.retrieveArcAsCornerSizeWithFallbacks
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.bridge.toComposeColor
import org.jetbrains.jewel.bridge.toDpSize
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.ui.component.styling.ButtonColors
import org.jetbrains.jewel.ui.component.styling.ButtonMetrics
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.DividerMetrics
import org.jetbrains.jewel.ui.component.styling.SplitButtonStyle

public fun readDefaultSplitButtonStyle(): SplitButtonStyle = SplitButtonStyle(
    button = readDefaultStyle(),
    dividerMetrics = DividerMetrics(thickness = 1.dp, startIndent = 0.dp),
    dividerColor = retrieveColorOrUnspecified("Button.Split.default.separatorColor"),
    dividerDisabledColor = retrieveColorOrUnspecified("Button.Split.default.separatorColor.disabled"),
    chevronColor = JBUI.CurrentTheme.Button.Split.Default.ICON_COLOR.toComposeColor()
)

public fun readOutlinedSplitButtonStyle(): SplitButtonStyle {
    return SplitButtonStyle(
        button = readOutlinedStyle(),
        dividerMetrics = DividerMetrics(thickness = 1.dp, startIndent = 0.dp),
        dividerColor = JBUI.CurrentTheme.Button.buttonOutlineColorStart(false).toComposeColor(),
        dividerDisabledColor = JBUI.CurrentTheme.Button.buttonOutlineColorStart(false).toComposeColor(),
        chevronColor = JBUI.CurrentTheme.Button.Split.Default.ICON_COLOR.toComposeColor()
    )
}

private fun readDefaultStyle(): ButtonStyle {
    val normalBackground =
        listOf(
            JBUI.CurrentTheme.Button.defaultButtonColorStart().toComposeColor(),
            JBUI.CurrentTheme.Button.defaultButtonColorEnd().toComposeColor(),
        ).createVerticalBrush()

    val normalContent = retrieveColorOrUnspecified("Button.default.foreground")

    val normalBorder =
        listOf(
            JBUI.CurrentTheme.Button.buttonOutlineColorStart(true).toComposeColor(),
            JBUI.CurrentTheme.Button.buttonOutlineColorEnd(true).toComposeColor(),
        )
            .createVerticalBrush()

    val colors =
        ButtonColors(
            background = normalBackground,
            backgroundDisabled = SolidColor(Color.Transparent),
            backgroundFocused = normalBackground,
            backgroundPressed = normalBackground,
            backgroundHovered = normalBackground,
            content = normalContent,
            contentDisabled = retrieveColorOrUnspecified("Button.disabledText"),
            contentFocused = normalContent,
            contentPressed = normalContent,
            contentHovered = normalContent,
            border = normalBorder,
            borderDisabled = SolidColor(JBUI.CurrentTheme.Button.disabledOutlineColor().toComposeColor()),
            borderFocused = SolidColor(retrieveColorOrUnspecified("Button.default.focusedBorderColor")),
            borderPressed = normalBorder,
            borderHovered = normalBorder,
        )

    val minimumSize = JBUI.CurrentTheme.Button.minimumSize().toDpSize()
    return ButtonStyle(
        colors = colors,
        metrics =
        ButtonMetrics(
            cornerSize = retrieveArcAsCornerSizeWithFallbacks("Button.default.arc", "Button.arc"),
            padding = PaddingValues(start = 14.dp, end = 4.dp),
            minSize = DpSize(minimumSize.width, minimumSize.height),
            borderWidth = 1.dp,
            focusOutlineExpand = 1.5.dp, // From DarculaButtonPainter.getBorderInsets
        ),
        focusOutlineAlignment = Stroke.Alignment.Center,
    )
}

private fun readOutlinedStyle(): ButtonStyle {
    val normalBackground =
        listOf(
            JBUI.CurrentTheme.Button.buttonColorStart().toComposeColor(),
            JBUI.CurrentTheme.Button.buttonColorEnd().toComposeColor(),
        )
            .createVerticalBrush()

    val normalContent = retrieveColorOrUnspecified("Button.foreground")

    val normalBorder =
        listOf(
            JBUI.CurrentTheme.Button.buttonOutlineColorStart(false).toComposeColor(),
            JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false).toComposeColor(),
        ).createVerticalBrush()

    val colors =
        ButtonColors(
            background = normalBackground,
            backgroundDisabled = SolidColor(Color.Transparent),
            backgroundFocused = normalBackground,
            backgroundPressed = normalBackground,
            backgroundHovered = normalBackground,
            content = normalContent,
            contentDisabled = retrieveColorOrUnspecified("Button.disabledText"),
            contentFocused = normalContent,
            contentPressed = normalContent,
            contentHovered = normalContent,
            border = normalBorder,
            borderDisabled = SolidColor(JBUI.CurrentTheme.Button.disabledOutlineColor().toComposeColor()),
            borderFocused = SolidColor(JBUI.CurrentTheme.Button.focusBorderColor(false).toComposeColor()),
            borderPressed = normalBorder,
            borderHovered = normalBorder,
        )

    val minimumSize = JBUI.CurrentTheme.Button.minimumSize().toDpSize()
    return ButtonStyle(
        colors = colors,
        metrics =
        ButtonMetrics(
            cornerSize = CornerSize(DarculaUIUtil.BUTTON_ARC.dp / 2),
            padding = PaddingValues(start = 14.dp, end = 4.dp),
            minSize = DpSize(minimumSize.width, minimumSize.height),
            borderWidth = DarculaUIUtil.LW.dp,
            focusOutlineExpand = Dp.Unspecified,
        ),
        focusOutlineAlignment = Stroke.Alignment.Center,
    )
}
