package org.jetbrains.jewel.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.border

@Composable
internal fun BaseTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    readOnly: Boolean,
    isError: Boolean,
    undecorated: Boolean,
    visualTransformation: VisualTransformation,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    onTextLayout: (TextLayoutResult) -> Unit,
    interactionSource: MutableInteractionSource,
    defaults: BaseTextFieldDefaults,
    colors: BaseTextFieldColors,
    textStyle: TextStyle,
    decorationBox: @Composable (innerTextField: @Composable () -> Unit, state: TextFieldState) -> Unit
) {
    var inputState by remember(interactionSource) {
        mutableStateOf(TextFieldState.of(enabled = enabled, error = isError))
    }
    remember(isError, enabled) {
        inputState = inputState.copy(error = isError, enabled = enabled)
    }
    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is FocusInteraction.Focus -> inputState = inputState.copy(focused = true)

                is FocusInteraction.Unfocus -> inputState = inputState.copy(focused = false)
            }
        }
    }

    val backgroundModifier = colors.background(inputState).value.takeIf {
        !undecorated && it.isSpecified
    }?.let {
        Modifier.background(it, defaults.shape())
    } ?: Modifier

    val borderModifier = colors.borderStroke(inputState).value.takeIf { !undecorated }?.let {
        Modifier.border(it, defaults.shape())
    } ?: Modifier

    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.then(backgroundModifier)
            .then(borderModifier),
        enabled = enabled,
        readOnly = readOnly,
        textStyle = defaults.textStyle().merge(textStyle).copy(color = colors.foreground(inputState).value),
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = true,
        maxLines = 1,
        visualTransformation = visualTransformation,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        cursorBrush = colors.cursorBrush(inputState).value,
        decorationBox = {
            decorationBox(it, inputState)
        }
    )
}

@Immutable
@JvmInline
value class TextFieldState(val state: ULong) {

    @Stable
    val isEnabled: Boolean
        get() = state and Enabled != 0UL

    @Stable
    val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    val isError: Boolean
        get() = state and Error != 0UL

    fun copy(enabled: Boolean = isEnabled, focused: Boolean = isFocused, error: Boolean = isError): TextFieldState =
        of(enabled, focused, error)

    override fun toString(): String = "TextFieldState(enabled=$isEnabled, focused=$isFocused, error=$isError)"

    companion object {

        private val Enabled = 1UL shl 0
        private val Focused = 1UL shl 1
        private val Error = 1UL shl 2

        fun of(enabled: Boolean, focused: Boolean = false, error: Boolean): TextFieldState {
            var state = 0UL
            if (enabled) state = state or Enabled
            if (focused) state = state or Focused
            if (error) state = state or Error
            return TextFieldState(state)
        }
    }
}

@Stable
interface BaseTextFieldColors {

    @Composable
    fun foreground(state: TextFieldState): State<Color>

    @Composable
    fun background(state: TextFieldState): State<Color>

    @Composable
    fun borderStroke(state: TextFieldState): State<Stroke>

    @Composable
    fun cursorBrush(state: TextFieldState): State<Brush>
}

@Stable
interface BaseTextFieldDefaults {

    @Composable
    fun colors(): BaseTextFieldColors

    @Composable
    fun shape(): Shape

    @Composable
    fun textStyle(): TextStyle

    @Composable
    fun contentPadding(): PaddingValues

    @Composable
    fun minWidth(): Dp

    @Composable
    fun minHeight(): Dp
}
