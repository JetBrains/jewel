package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.KeyboardActionHandler
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldDecorator
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.foundation.theme.LocalTextStyle
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.TextAreaStyle
import org.jetbrains.jewel.ui.theme.scrollbarStyle
import org.jetbrains.jewel.ui.theme.textAreaStyle

@Composable
public fun TextArea(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    inputTransformation: InputTransformation? = null,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onKeyboardAction: KeyboardActionHandler? = null,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.MultiLine(),
    onTextLayout: (Density.(getResult: () -> TextLayoutResult?) -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: TextAreaStyle = JewelTheme.textAreaStyle,
    outline: Outline = Outline.None,
    placeholder: @Composable (() -> Unit)? = null,
    decorationBoxModifier: Modifier = Modifier,
    outputTransformation: OutputTransformation? = null,
    undecorated: Boolean = false,
    scrollState: ScrollState = rememberScrollState(),
    scrollbarStyle: ScrollbarStyle? = JewelTheme.scrollbarStyle,
) {
    val minSize = style.metrics.minSize
    InputField(
        state = state,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        inputTransformation = inputTransformation,
        textStyle = textStyle,
        keyboardOptions = keyboardOptions,
        onKeyboardAction = onKeyboardAction,
        lineLimits = lineLimits,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        style = style,
        outline = outline,
        outputTransformation = outputTransformation,
        decorator =
            if (undecorated) {
                null
            } else {
                TextAreaDecorator(
                    style,
                    state,
                    placeholder,
                    textStyle,
                    decorationBoxModifier,
                    minSize,
                    scrollbarStyle,
                    scrollState,
                )
            },
        scrollState = scrollState,
    )
}

@Composable
private fun TextAreaDecorator(
    style: TextAreaStyle,
    state: TextFieldState,
    placeholder: @Composable (() -> Unit)?,
    textStyle: TextStyle,
    decorationBoxModifier: Modifier,
    minSize: DpSize,
    scrollbarStyle: ScrollbarStyle?,
    scrollState: ScrollState,
) = TextFieldDecorator { innerTextField ->
    val (contentPadding, innerEndPadding) =
        if (scrollbarStyle != null) {
            with(style.metrics.contentPadding) {
                val direction = LocalLayoutDirection.current
                val paddingValues =
                    PaddingValues(
                        calculateStartPadding(direction),
                        calculateTopPadding(),
                        0.dp,
                        calculateBottomPadding(),
                    )
                paddingValues to calculateEndPadding(direction)
            }
        } else {
            style.metrics.contentPadding to 0.dp
        }

    TextAreaDecorationBox(
        innerTextField = {
            if (scrollbarStyle != null) {
                TextAreaScrollableContainer(
                    scrollState = scrollState,
                    style = scrollbarStyle,
                    contentModifier = Modifier.padding(end = innerEndPadding),
                    content = innerTextField,
                )
            } else {
                innerTextField()
            }
        },
        contentPadding = contentPadding,
        placeholderTextColor = style.colors.placeholder,
        placeholder = if (state.text.isEmpty()) placeholder else null,
        textStyle = textStyle,
        modifier = decorationBoxModifier.defaultMinSize(minWidth = minSize.width, minHeight = minSize.height),
    )
}

@ScheduledForRemoval(inVersion = "Before 1.0")
@Deprecated("Please use TextArea(state) instead. If you want to observe text changes, use snapshotFlow { state.text }")
@Composable
public fun TextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    outline: Outline = Outline.None,
    placeholder: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextAreaStyle = JewelTheme.textAreaStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    decorationBoxModifier: Modifier = Modifier,
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)
    var lastTextValue by remember(value) { mutableStateOf(value) }

    @Suppress("DEPRECATION")
    TextArea(
        value = textFieldValue,
        onValueChange = { newTextFieldValueState ->
            textFieldValueState = newTextFieldValueState

            val stringChangedSinceLastInvocation = lastTextValue != newTextFieldValueState.text
            lastTextValue = newTextFieldValueState.text

            if (stringChangedSinceLastInvocation) {
                onValueChange(newTextFieldValueState.text)
            }
        },
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        outline = outline,
        placeholder = placeholder,
        undecorated = undecorated,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
        style = style,
        textStyle = textStyle,
        interactionSource = interactionSource,
        decorationBoxModifier = decorationBoxModifier,
    )
}

@ScheduledForRemoval(inVersion = "Before 1.0")
@Deprecated("Please use TextArea(state) instead. If you want to observe text changes, use snapshotFlow { state.text }")
@Composable
public fun TextArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholder: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    outline: Outline = Outline.None,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextAreaStyle = JewelTheme.textAreaStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    decorationBoxModifier: Modifier = Modifier,
) {
    val minSize = style.metrics.minSize
    @Suppress("DEPRECATION")
    InputField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.defaultMinSize(minWidth = minSize.width, minHeight = minSize.height),
        enabled = enabled,
        readOnly = readOnly,
        outline = outline,
        undecorated = undecorated,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = false,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
        style = style,
        textStyle = textStyle,
        interactionSource = interactionSource,
    ) { innerTextField, _ ->
        TextAreaDecorationBox(
            innerTextField = innerTextField,
            contentPadding = style.metrics.contentPadding,
            placeholderTextColor = style.colors.placeholder,
            placeholder = if (value.text.isEmpty()) placeholder else null,
            textStyle = textStyle,
            modifier = decorationBoxModifier,
        )
    }
}

@Composable
private fun TextAreaDecorationBox(
    innerTextField: @Composable () -> Unit,
    contentPadding: PaddingValues,
    textStyle: TextStyle,
    modifier: Modifier,
    placeholderTextColor: Color,
    placeholder: @Composable (() -> Unit)?,
) {
    Layout(
        content = {
            if (placeholder != null) {
                Box(modifier = Modifier.layoutId(PLACEHOLDER_ID), contentAlignment = Alignment.TopStart) {
                    CompositionLocalProvider(
                        LocalTextStyle provides textStyle.copy(color = placeholderTextColor),
                        LocalContentColor provides placeholderTextColor,
                        content = placeholder,
                    )
                }
            }

            Box(
                modifier = Modifier.layoutId(TEXT_AREA_ID),
                contentAlignment = Alignment.TopStart,
                propagateMinConstraints = true,
            ) {
                innerTextField()
            }
        },
        modifier,
    ) { measurables, incomingConstraints ->
        val leftPadding = contentPadding.calculateLeftPadding(layoutDirection)
        val rightPadding = contentPadding.calculateRightPadding(layoutDirection)
        val horizontalPadding = (leftPadding + rightPadding).roundToPx()
        val verticalPadding =
            (contentPadding.calculateTopPadding() + contentPadding.calculateBottomPadding()).roundToPx()

        val textAreaConstraints =
            incomingConstraints.offset(horizontal = -horizontalPadding, vertical = -verticalPadding).copy(minHeight = 0)

        val textAreaPlaceable = measurables.single { it.layoutId == TEXT_AREA_ID }.measure(textAreaConstraints)

        // Measure placeholder
        val placeholderConstraints = textAreaConstraints.copy(minWidth = 0, minHeight = 0)
        val placeholderPlaceable = measurables.find { it.layoutId == PLACEHOLDER_ID }?.measure(placeholderConstraints)

        val width = calculateWidth(textAreaPlaceable, placeholderPlaceable, incomingConstraints)
        val height = calculateHeight(textAreaPlaceable, placeholderPlaceable, verticalPadding, incomingConstraints)

        layout(width, height) {
            val startPadding = contentPadding.calculateStartPadding(layoutDirection).roundToPx()
            val topPadding = contentPadding.calculateTopPadding().roundToPx()

            // Placed top-start
            textAreaPlaceable.placeRelative(startPadding, topPadding)

            // Placed similar to the input text above
            placeholderPlaceable?.placeRelative(startPadding, topPadding)
        }
    }
}

private fun calculateWidth(
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    incomingConstraints: Constraints,
): Int = maxOf(textFieldPlaceable.width, placeholderPlaceable?.width ?: 0).coerceAtLeast(incomingConstraints.minWidth)

private fun calculateHeight(
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    verticalPadding: Int,
    incomingConstraints: Constraints,
): Int {
    val textAreaHeight = maxOf(textFieldPlaceable.height, placeholderPlaceable?.height ?: 0)
    return (textAreaHeight + verticalPadding).coerceAtLeast(incomingConstraints.minHeight)
}

private const val PLACEHOLDER_ID = "Placeholder"
private const val TEXT_AREA_ID = "TextField"
