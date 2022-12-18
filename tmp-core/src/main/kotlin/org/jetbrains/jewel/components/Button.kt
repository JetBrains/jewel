@file:Suppress("MatchingDeclarationName")

package org.jetbrains.jewel.themes.expui.standalone.control

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.components.state.ButtonState
import org.jetbrains.jewel.styles.ButtonStyle
import org.jetbrains.jewel.styles.LocalButtonStyle
import org.jetbrains.jewel.styles.LocalOutLinedButtonStyle
import org.jetbrains.jewel.styles.LocalPrimaryButtonStyle

@Composable
fun OutlineButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: ButtonStyle = LocalOutLinedButtonStyle.current,
    content: @Composable RowScope.() -> Unit
) {
    ButtonImpl(onClick, modifier, enabled, interactionSource, colors, content)
}

@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: ButtonStyle = LocalPrimaryButtonStyle.current,
    content: @Composable RowScope.() -> Unit
) {
    ButtonImpl(onClick, modifier, enabled, interactionSource, colors, content)
}

@Composable
private fun ButtonImpl(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ButtonStyle = LocalButtonStyle.current,
    content: @Composable RowScope.() -> Unit
) {

    var buttonState by remember { mutableStateOf(ButtonState(enabled = enabled)) }
    val appearance by derivedStateOf(policy = structuralEqualityPolicy()) {
        requireNotNull(style[buttonState]) { "no appearance has not been defined for state: $buttonState" }
    }
    Box(
        modifier = Modifier.defaultMinSize(72.dp, 24.dp)
            .drawWithCache {
                onDrawBehind {
                    appearance.shadowColor?.let { color ->
                        drawRoundRect(
                            color = color,
                            size = Size(size.width + 4.dp.toPx(), size.height + 4.dp.toPx()),
                            topLeft = Offset(-2.dp.toPx(), -2.dp.toPx()),
                            cornerRadius = CornerRadius(5.dp.toPx())
                        )
                    }
                    //border if focused
                    appearance.shapeStroke?.let {
                        drawRoundRect(brush = it.brush, cornerRadius = CornerRadius(3.dp.toPx()))
                    }
                    appearance.background?.let { brush ->
                        drawRoundRect(
                            brush = brush,
                            size = Size(size.width - 2.dp.toPx(), size.height - 2.dp.toPx()),
                            topLeft = Offset(1.dp.toPx(), 1.dp.toPx()),
                            cornerRadius = CornerRadius(2.dp.toPx())
                        )
                    }
                }
            }
            .onFocusEvent {
                buttonState = buttonState.copy(focused = it.hasFocus)
            }
            .then(
                if (buttonState.enabled) {
                    modifier
                        .pointerInput(Unit) {
                            awaitPointerEventScope() {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    buttonState = when (event.type) {
                                        PointerEventType.Enter -> buttonState.copy(mouseOver = true)
                                        PointerEventType.Exit -> buttonState.copy(mouseOver = false)
                                        PointerEventType.Release -> buttonState.copy(mouseClick = false)
                                        PointerEventType.Press -> buttonState.copy(mouseClick = true).also { onClick() }
                                        else -> buttonState
                                    }
                                }
                            }
                        }
                } else modifier
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.padding(14.dp, 3.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            content()
        }
    }
}
