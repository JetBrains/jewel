package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.PointerInputScope
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.window.PopupProperties
import kotlinx.coroutines.coroutineScope
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Active
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Enabled
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Focused
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Hovered
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Pressed
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle
import org.jetbrains.jewel.ui.focusOutline
import org.jetbrains.jewel.ui.outline
import org.jetbrains.jewel.ui.theme.comboBoxStyle
import org.jetbrains.jewel.ui.util.thenIf

@Composable
public fun ComboBox(
    modifier: Modifier = Modifier,
    menuModifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    inputTextFieldState: TextFieldState = rememberTextFieldState(),
    outline: Outline = Outline.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ComboBoxStyle = JewelTheme.comboBoxStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    onArrowDownPress: () -> Unit = {},
    onArrowUpPress: () -> Unit = {},
    onEnterPress: () -> Unit = {},
    onPopupStateChange: (Boolean) -> Unit = {},
    popupContent: @Composable () -> Unit,
) {
    var popupExpanded by remember { mutableStateOf(false) }
    var chevronClicked by remember { mutableStateOf(false) }
    var textFieldHover by remember { mutableStateOf(false) }

    val textFieldInteractionSource = remember { MutableInteractionSource() }
    val textFieldFocusRequester = remember { FocusRequester() }

    fun setPopupExpanded(expanded: Boolean) {
        popupExpanded = expanded
        onPopupStateChange(expanded)
    }

    fun togglePopup() {
        setPopupExpanded(!popupExpanded)
    }

    val onPressWhenEnabled = {
        togglePopup()
        textFieldFocusRequester.requestFocus()
    }

    var comboBoxState by remember { mutableStateOf(ComboBoxState.of(enabled = isEnabled)) }
    var isFocused by remember { mutableStateOf(false) }

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

    BoxWithConstraints(
        modifier =
            modifier
                .background(style.colors.backgroundFor(comboBoxState, true).value, shape)
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
                modifier =
                    Modifier.onFocusChanged {
                        comboBoxState = comboBoxState.copy(focused = it.isFocused)
                        if (!it.isFocused) {
                            setPopupExpanded(false)
                        }
                    },
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Text field
                if (isEnabled) {
                    BasicTextField(
                        state = inputTextFieldState,
                        modifier =
                            Modifier.testTag("Jewel.ComboBox.TextField")
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(style.metrics.contentPadding)
                                .onFocusChanged { isFocused = it.isFocused }
                                .focusRequester(textFieldFocusRequester)
                                .onPreviewKeyEvent {
                                    if (it.type == KeyEventType.KeyDown && it.key == Key.DirectionDown) {
                                        if (popupExpanded) {
                                            onArrowDownPress()
                                        } else {
                                            togglePopup()
                                            textFieldFocusRequester.requestFocus()
                                        }
                                    }
                                    if (it.type == KeyEventType.KeyDown && it.key == Key.DirectionUp) {
                                        if (popupExpanded) {
                                            onArrowUpPress()
                                        } else {
                                            togglePopup()
                                            textFieldFocusRequester.requestFocus()
                                        }
                                    }

                                    if (it.type == KeyEventType.KeyDown && it.key == Key.Enter && popupExpanded) {
                                        setPopupExpanded(false)
                                        onEnterPress()
                                    }
                                    false
                                }
                                .onHover { textFieldHover = it },
                        lineLimits = TextFieldLineLimits.SingleLine,
                        textStyle = textStyle.copy(color = style.colors.content),
                        cursorBrush = SolidColor(style.colors.content),
                        interactionSource = textFieldInteractionSource,
                    )
                }

                // Text label
                if (!isEnabled) {
                    Text(
                        text = inputTextFieldState.text.toString(),
                        style = textStyle,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier =
                            Modifier.testTag("Jewel.ComboBox.NonEditableText")
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(style.metrics.contentPadding),
                    )
                }

                // Chevron
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier =
                        Modifier.testTag("Jewel.ComboBox.ChevronContainer").thenIf(isEnabled) {
                            onHover { chevronClicked = it }
                                .pointerInput(interactionSource) {
                                    detectPressAndCancel(
                                        onPress = onPressWhenEnabled,
                                        onCancel = { setPopupExpanded(false) },
                                    )
                                }
                                .semantics {
                                    onClick(
                                        action = {
                                            onPressWhenEnabled()
                                            true
                                        },
                                        label = "Chevron",
                                    )
                                }
                        },
                ) {
                    val iconColor = if (isEnabled) Color.Unspecified else style.colors.borderDisabled
                    Divider(
                        orientation = Orientation.Vertical,
                        thickness = style.metrics.borderWidth,
                        color = style.colors.border,
                        modifier = Modifier.testTag("Jewel.ComboBox.Divider"),
                    )
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
            PopupContainer(
                onDismissRequest = {
                    if (!chevronClicked && !textFieldHover) {
                        setPopupExpanded(false)
                    }
                },
                modifier =
                    menuModifier
                        .testTag("Jewel.ComboBox.PopupMenu")
                        .semantics { contentDescription = "Jewel.ComboBox.PopupMenu" }
                        .width(boxWith),
                horizontalAlignment = Alignment.Start,
                popupProperties = PopupProperties(focusable = false),
                content = popupContent,
            )
        }
    }
}

@Immutable
@JvmInline
public value class ComboBoxState(public val state: ULong) : FocusableComponentState {
    override val isActive: Boolean
        get() = state and Active != 0UL

    override val isEnabled: Boolean
        get() = state and Enabled != 0UL

    override val isFocused: Boolean
        get() = state and Focused != 0UL

    override val isHovered: Boolean
        get() = state and Hovered != 0UL

    override val isPressed: Boolean
        get() = state and Pressed != 0UL

    public fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        active: Boolean = isActive,
    ): ComboBoxState = of(enabled = enabled, focused = focused, pressed = pressed, hovered = hovered, active = active)

    override fun toString(): String =
        "${javaClass.simpleName}(isEnabled=$isEnabled, isFocused=$isFocused, " +
            "isHovered=$isHovered, isPressed=$isPressed, isActive=$isActive)"

    public companion object {
        public fun of(
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            active: Boolean = false,
        ): ComboBoxState =
            ComboBoxState(
                (if (enabled) Enabled else 0UL) or
                    (if (focused) Focused else 0UL) or
                    (if (hovered) Hovered else 0UL) or
                    (if (pressed) Pressed else 0UL) or
                    (if (active) Active else 0UL)
            )
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
