package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.intellij.util.ui.JBUI
import org.jetbrains.jewel.bridge.createVerticalBrush
import org.jetbrains.jewel.bridge.retrieveArcAsCornerSizeWithFallbacks
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.bridge.toComposeColor
import org.jetbrains.jewel.bridge.toDpSize
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.ui.component.styling.ButtonColors
import org.jetbrains.jewel.ui.component.styling.ButtonMetrics
import org.jetbrains.jewel.ui.component.styling.ButtonStyle

internal fun readDefaultButtonStyle(): ButtonStyle {
    val normalBackground =
        listOf(
                JBUI.CurrentTheme.Button.defaultButtonColorStart().toComposeColor(),
                JBUI.CurrentTheme.Button.defaultButtonColorEnd().toComposeColor(),
            )
            .createVerticalBrush()

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
                padding = PaddingValues(horizontal = 14.dp), // see DarculaButtonUI.HORIZONTAL_PADDING
                minSize = DpSize(minimumSize.width, minimumSize.height),
                borderWidth = 1.dp,
                focusOutlineExpand = 1.5.dp, // From DarculaButtonPainter.getBorderInsets
            ),
        focusOutlineAlignment = Stroke.Alignment.Center,
    )
}
