package org.jetbrains.jewel.styles

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.Insets
import org.jetbrains.jewel.IntelliJMetrics
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.ShapeStroke
import org.jetbrains.jewel.styles.state.ButtonMouseState
import org.jetbrains.jewel.styles.state.TextLinkState
import org.jetbrains.jewel.toBrush

typealias TextLinkAppearance = TextFieldAppearance

fun TextLinkStyle(
    palette: IntelliJPalette,
    metrics: IntelliJMetrics,
    textStyle: TextStyle
) = TextLinkStyle {
    val defaultAppearance = TextLinkAppearance(
        textStyle = textStyle.copy(
            color = palette.textLink.foreground,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        ),
        backgroundColor = palette.textLink.background,
        shape = RectangleShape,
        contentPadding = PaddingValues(7.dp, 4.dp),
        cursorBrush = palette.text.toBrush(),
        shapeStroke = ShapeStroke.SolidColor(1.dp, palette.controlStroke, Insets(0.dp)),
        minWidth = 8.dp * 8
    )
    for (visited in listOf(true, false)) {
        for (focussed in listOf(true, false)) {
            for (mouseState in ButtonMouseState.values()) {
                val appearance = when (mouseState) {
                    ButtonMouseState.None -> {
                        if (visited) {
                            defaultAppearance.copy(
                                textStyle = defaultAppearance.textStyle.copy(
                                    color = palette.textLink.visitedForeground
                                )
                            )
                        } else {
                            defaultAppearance
                        }
                    }

                    ButtonMouseState.Hovered, ButtonMouseState.Pressed ->
                        defaultAppearance
                            .copy(
                                shapeStroke = ShapeStroke.SolidColor(1.dp, palette.textLink.hoverForeground, Insets(0.dp)),
                                textStyle = defaultAppearance.textStyle.copy(
                                    color = palette.textLink.hoverForeground
                                )
                            )
                }
                state(TextLinkState(visited = visited, focused = focussed, mouseState = mouseState), appearance)
            }
        }
    }
}
