package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.PointerInputScope
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.PopupProperties
import kotlinx.coroutines.coroutineScope
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle
import org.jetbrains.jewel.ui.focusOutline
import org.jetbrains.jewel.ui.outline
import org.jetbrains.jewel.ui.theme.comboBoxStyle
import org.jetbrains.jewel.ui.util.thenIf

@Composable
public fun NotEditableComboBox(
    labelText: String,
    modifier: Modifier = Modifier,
    menuModifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    outline: Outline = Outline.None,
    maxPopupHeight: Dp = Dp.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ComboBoxStyle = JewelTheme.comboBoxStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    onArrowDownPress: () -> Unit = {},
    onArrowUpPress: () -> Unit = {},
    onPopupStateChange: (Boolean) -> Unit = {},
    popupContent: @Composable () -> Unit,
) {
    var popupExpanded by remember { mutableStateOf(false) }
    var chevronClicked by remember { mutableStateOf(false) }

    fun setPopupExpanded(expanded: Boolean) {
        popupExpanded = expanded
        onPopupStateChange(expanded)
    }

    var comboBoxState by remember { mutableStateOf(ComboBoxState.of(enabled = isEnabled)) }
    var isFocused by remember { mutableStateOf(false) }
    val comboBoxFocusRequester = remember { FocusRequester() }

    remember(isEnabled) { comboBoxState = comboBoxState.copy(enabled = isEnabled) }

    LaunchedEffect(isFocused) { comboBoxState = comboBoxState.copy(focused = isFocused) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> comboBoxState = comboBoxState.copy(pressed = true)
                is PressInteraction.Cancel,
                is PressInteraction.Release -> comboBoxState = comboBoxState.copy(pressed = false)
                is HoverInteraction.Enter -> comboBoxState = comboBoxState.copy(hovered = true)
                is HoverInteraction.Exit -> comboBoxState = comboBoxState.copy(hovered = false)
            }
        }
    }

    val shape = RoundedCornerShape(style.metrics.cornerSize)
    val borderColor by style.colors.borderFor(comboBoxState)
    var comboBoxWidth by remember { mutableIntStateOf(-1) }
    val mph =
        if (maxPopupHeight == Dp.Unspecified) {
            JewelTheme.comboBoxStyle.metrics.maxPopupHeight
        } else {
            maxPopupHeight
        }

    BoxWithConstraints(
        modifier =
            modifier
                .focusRequester(comboBoxFocusRequester)
                .onFocusChanged { focusState ->
                    isFocused = focusState.isFocused
                    if (!isFocused) {
                        setPopupExpanded(false)
                    }
                }
                .thenIf(isEnabled) {
                    focusable(true, interactionSource)
                        .onHover { chevronClicked = it }
                        .pointerInput(interactionSource) {
                            detectPressAndCancel(
                                onPress = {
                                    setPopupExpanded(!popupExpanded)
                                    comboBoxFocusRequester.requestFocus()
                                },
                                onCancel = { setPopupExpanded(false) },
                            )
                        }
                        .semantics(mergeDescendants = true) { role = Role.DropdownList }
                        .onPreviewKeyEvent {
                            if (it.type == KeyEventType.KeyDown && it.key == Key.Spacebar) {
                                setPopupExpanded(!popupExpanded)
                            }
                            if (it.type == KeyEventType.KeyDown && it.key == Key.DirectionDown) {
                                if (popupExpanded) {
                                    onArrowDownPress()
                                } else {
                                    setPopupExpanded(true)
                                }
                            }
                            if (it.type == KeyEventType.KeyDown && it.key == Key.DirectionUp && popupExpanded) {
                                onArrowUpPress()
                            }
                            false
                        }
                }
                .background(style.colors.backgroundFor(comboBoxState, false).value, shape)
                .thenIf(outline == Outline.None) {
                    focusOutline(state = comboBoxState, outlineShape = shape, alignment = Stroke.Alignment.Center)
                        .border(
                            alignment = Stroke.Alignment.Inside,
                            width = style.metrics.borderWidth,
                            color = borderColor,
                            shape = shape,
                        )
                }
                .outline(
                    state = comboBoxState,
                    outline = outline,
                    outlineShape = shape,
                    alignment = Stroke.Alignment.Center,
                )
                .widthIn(min = style.metrics.minSize.width)
                .height(style.metrics.minSize.height)
                .onSizeChanged { comboBoxWidth = it.width },
        contentAlignment = Alignment.CenterStart,
    ) {
        val boxWith = maxWidth
        CompositionLocalProvider(LocalContentColor provides style.colors.contentFor(comboBoxState).value) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.focusable(false).focusProperties { canFocus = false },
            ) {
                Text(
                    text = labelText,
                    style = textStyle,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier =
                        Modifier.testTag("Jewel.ComboBox.NonEditableText")
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(style.metrics.contentPadding),
                )

                // Chevron
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.testTag("Jewel.ComboBox.ChevronContainer"),
                ) {
                    val iconColor = if (isEnabled) Color.Unspecified else style.colors.borderDisabled
                    Icon(
                        modifier =
                            Modifier.width(style.metrics.arrowMinSize.width).height(style.metrics.arrowMinSize.height),
                        key = style.icons.chevronDown,
                        tint = iconColor,
                        contentDescription = null,
                    )
                }
            }
        }

        if (popupExpanded) {
            val density = LocalDensity.current
            PopupContainer(
                onDismissRequest = {
                    if (!chevronClicked) {
                        setPopupExpanded(false)
                    }
                },
                modifier =
                    menuModifier
                        .testTag("Jewel.ComboBox.PopupMenu")
                        .semantics { contentDescription = "Jewel.ComboBox.PopupMenu" }
                        .defaultMinSize(minWidth = with(density) { comboBoxWidth.toDp() })
                        .heightIn(max = mph)
                        .width(boxWith),
                horizontalAlignment = Alignment.Start,
                popupProperties = PopupProperties(focusable = false),
                content = popupContent,
            )
        }
    }
}

private suspend fun PointerInputScope.detectPressAndCancel(onPress: () -> Unit, onCancel: () -> Unit) {
    coroutineScope {
        awaitEachGesture {
            awaitFirstDown().also { it.consume() }
            onPress()

            val up = waitForUpOrCancellation()
            if (up == null) {
                onCancel()
            } else {
                up.consume()
            }
        }
    }
}
