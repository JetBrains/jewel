@file:Suppress("MatchingDeclarationName")

package org.jetbrains.jewel.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ShapeStroke
import org.jetbrains.jewel.styles.ComboBoxStyle
import org.jetbrains.jewel.styles.LocalComboBoxStyle
import org.jetbrains.jewel.styles.state.ComboBoxState

@Immutable
data class ComboBoxAppearance(
    val backgroundColor: Color = Color.Blue,
    val foregroundColor: Color = Color.White,
    val shapeStroke: ShapeStroke<*>? = ShapeStroke.SolidColor(1.dp, Color.Blue),
    val shape: Shape = RectangleShape,
    val haloStroke: ShapeStroke<*>? = null,
    val haloShape: Shape = shape
)

@Composable
fun <T> ComboBox(
    items: List<T>,
    value: T,
    onValueChange: ((T) -> Unit)? = null,
    modifier: Modifier = Modifier,
    menuModifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRender: @Composable (T) -> Unit = { Label("$it") },
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    comboBoxStyle: ComboBoxStyle = LocalComboBoxStyle.current
) {
    var comboBoxState by remember { mutableStateOf(ComboBoxState()) }
    val comboBoxAppearance = remember(comboBoxState) { comboBoxStyle.appearance(comboBoxState) ?: comboBoxStyle.defaultAppearance()!! }

    Box {
        Box(
            Modifier.defaultMinSize(72.dp, 24.dp).drawWithCache {
                onDrawBehind {
                    if (comboBoxState.focused) {
                        comboBoxAppearance.haloStroke?.let {
                            drawRoundRect(
                                it.brush,
                                size = Size(size.width + 4.dp.toPx(), size.height + 4.dp.toPx()),
                                topLeft = Offset(-2.dp.toPx(), -2.dp.toPx()),
                                cornerRadius = CornerRadius(5.dp.toPx())
                            )
                        }
                    }
                    comboBoxAppearance.shapeStroke?.let {
                        drawRoundRect(it.brush, cornerRadius = CornerRadius(3.dp.toPx()))
                    }
                    drawRoundRect(
                        comboBoxAppearance.backgroundColor,
                        size = Size(size.width - 2.dp.toPx(), size.height - 2.dp.toPx()),
                        topLeft = Offset(1.dp.toPx(), 1.dp.toPx()),
                        cornerRadius = CornerRadius(2.dp.toPx())
                    )
                }
            }.onFocusEvent {
                if (comboBoxState.focused != it.isFocused) comboBoxState = comboBoxState.copy(focused = it.isFocused)
            }.clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = enabled,
                onClick = {
                    comboBoxState = comboBoxState.copy(isOpen = true)
                },
                role = Role.Button
            ).padding(6.dp, 3.dp).then(modifier),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                valueRender(value)
            }

            Icon("icons/buttonDropTriangle.svg", modifier = Modifier.align(Alignment.CenterEnd))
        }

        DropdownMenu(comboBoxState.isOpen, { comboBoxState = comboBoxState.copy(isOpen = false) }, modifier = menuModifier) {
            items.forEach { item ->
                val focusRequester = remember { FocusRequester() }
                DropdownMenuItem(
                    onClick = {
                        if (value != item) {
                            onValueChange?.invoke(item)
                        }
                        comboBoxState = comboBoxState.copy(isOpen = false)
                    },
                    Modifier.focusRequester(focusRequester).onFocusEvent {
                        if (it.isFocused && value != item) {
                            onValueChange?.invoke(item)
                        }
                    }
                ) {
                    valueRender(item)
                }
                LaunchedEffect(comboBoxState.isOpen) {
                    if (comboBoxState.isOpen && value == item) {
                        focusRequester.requestFocus()
                    }
                }
            }
        }
    }
}

