package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.border
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Active
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Enabled
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Focused
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Hovered
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Pressed
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.styling.InputFieldStyle
import org.jetbrains.jewel.ui.focusOutline
import org.jetbrains.jewel.ui.outline
import org.jetbrains.jewel.ui.util.thenIf

@Composable
internal fun InputField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    readOnly: Boolean,
    outline: Outline,
    undecorated: Boolean,
    visualTransformation: VisualTransformation,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    singleLine: Boolean,
    maxLines: Int,
    onTextLayout: (TextLayoutResult) -> Unit,
    interactionSource: MutableInteractionSource,
    style: InputFieldStyle,
    textStyle: TextStyle,
    decorationBox: @Composable (innerTextField: @Composable () -> Unit, state: InputFieldState) -> Unit,
) {
    var inputState by remember(interactionSource) {
        mutableStateOf(InputFieldState.of(enabled = enabled))
    }
    remember(enabled) {
        inputState = inputState.copy(enabled = enabled)
    }
    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is FocusInteraction.Focus -> inputState = inputState.copy(focused = true)
                is FocusInteraction.Unfocus -> inputState = inputState.copy(focused = false)
            }
        }
    }

    val colors = style.colors
    val backgroundColor by colors.backgroundFor(inputState)
    val shape = RoundedCornerShape(style.metrics.cornerSize)

    val backgroundModifier = Modifier.thenIf(!undecorated && backgroundColor.isSpecified) {
        background(backgroundColor, shape)
    }

    val borderColor by style.colors.borderFor(inputState)
    val hasNoOutline = outline == Outline.None
    val borderModifier = Modifier.thenIf(!undecorated && borderColor.isSpecified && hasNoOutline) {
        Modifier.border(
            alignment = Stroke.Alignment.Center,
            width = style.metrics.borderWidth,
            color = borderColor,
            shape = shape,
        )
    }

    val contentColor by colors.contentFor(inputState)
    val mergedTextStyle = style.textStyle.merge(textStyle).copy(color = contentColor)
    val caretColor by colors.caretFor(inputState)

    BasicTextField(
        value = value,
        modifier = modifier.then(backgroundModifier)
            .then(borderModifier)
            .thenIf(!undecorated && hasNoOutline) { focusOutline(inputState, shape) }
            .outline(inputState, outline, shape, Stroke.Alignment.Center),
        onValueChange = onValueChange,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = mergedTextStyle,
        cursorBrush = SolidColor(caretColor),
        visualTransformation = visualTransformation,
        onTextLayout = onTextLayout,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
        singleLine = singleLine,
        maxLines = maxLines,
        decorationBox = @Composable { innerTextField: @Composable () -> Unit ->
            decorationBox(innerTextField, inputState)
        },
    )
}

@Immutable
@JvmInline
value class InputFieldState(val state: ULong) : FocusableComponentState {

    @Stable
    override val isActive: Boolean
        get() = state and Active != 0UL

    @Stable
    override val isEnabled: Boolean
        get() = state and Enabled != 0UL

    @Stable
    override val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    override val isHovered: Boolean
        get() = state and Hovered != 0UL

    @Stable
    override val isPressed: Boolean
        get() = state and Pressed != 0UL

    fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        active: Boolean = isActive,
    ) = of(
        enabled = enabled,
        focused = focused,
        pressed = pressed,
        hovered = hovered,
        active = active,
    )

    override fun toString() =
        "${javaClass.simpleName}(isEnabled=$isEnabled, isFocused=$isFocused, " +
            "isHovered=$isHovered, isPressed=$isPressed, isActive=$isActive)"

    companion object {

        fun of(
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            active: Boolean = false,
        ) = InputFieldState(
            state = (if (enabled) Enabled else 0UL) or
                (if (focused) Focused else 0UL) or
                (if (hovered) Hovered else 0UL) or
                (if (pressed) Pressed else 0UL) or
                (if (active) Active else 0UL),
        )
    }
}