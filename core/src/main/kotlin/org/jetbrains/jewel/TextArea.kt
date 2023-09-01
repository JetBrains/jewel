package org.jetbrains.jewel

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.offset
import org.jetbrains.jewel.styling.TextAreaStyle

/**
 * @param placeholder the optional placeholder to be displayed over the
 *     component when the [value] is empty.
 * @param hint the optional hint to be displayed underneath the component.
 *     By default it will have a greyed out appearance and smaller text.
 */
@Composable
fun TextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    outline: Outline = Outline.None,
    placeholder: @Composable (() -> Unit)? = null,
    hint: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextAreaStyle = IntelliJTheme.textAreaStyle,
    textStyle: TextStyle = IntelliJTheme.defaultTextStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)
    var lastTextValue by remember(value) { mutableStateOf(value) }

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
        hint = hint,
        undecorated = undecorated,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
        style = style,
        textStyle = textStyle,
        interactionSource = interactionSource,
    )
}

/**
 * @param placeholder the optional placeholder to be displayed over the
 *     component when the [value] is empty.
 * @param hint the optional hint to be displayed underneath the component.
 *     By default it will have a greyed out appearance and smaller text.
 */
@Composable
fun TextArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholder: @Composable (() -> Unit)? = null,
    hint: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    outline: Outline = Outline.None,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextAreaStyle = IntelliJTheme.textAreaStyle,
    textStyle: TextStyle = IntelliJTheme.defaultTextStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val minSize = style.metrics.minSize
    InputField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .defaultMinSize(minWidth = minSize.width, minHeight = minSize.height),
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
    ) { innerTextField, state ->
        TextAreaDecorationBox(
            innerTextField = innerTextField,
            contentPadding = style.metrics.contentPadding,
            placeholderTextColor = style.colors.placeholder,
            placeholder = if (value.text.isEmpty()) placeholder else null,
            hintTextStyle = style.hintTextStyle,
            hintContentColor = style.colors.hintContentFor(state).value,
            hint = hint,
        )
    }
}

@Composable
private fun TextAreaDecorationBox(
    innerTextField: @Composable () -> Unit,
    contentPadding: PaddingValues,
    placeholderTextColor: Color,
    placeholder: @Composable (() -> Unit)?,
    hintTextStyle: TextStyle,
    hintContentColor: Color,
    hint: @Composable (() -> Unit)?,
) {
    val layoutDirection = LocalLayoutDirection.current
    Layout(
        content = {
            if (placeholder != null) {
                Box(
                    modifier = Modifier.layoutId(PLACEHOLDER_ID),
                    contentAlignment = Alignment.Center
                ) {
                    CompositionLocalProvider(
                        LocalContentColor provides placeholderTextColor,
                        content = placeholder,
                    )
                }
            }

            Box(modifier = Modifier.layoutId(TEXT_AREA_ID), propagateMinConstraints = true) {
                innerTextField()
            }

            if (hint != null) {
                Box(Modifier.layoutId(HINT_ID).fillMaxWidth()) {
                    CompositionLocalProvider(
                        LocalTextStyle provides hintTextStyle,
                        LocalContentColor provides hintContentColor,
                        content = hint,
                    )
                }
            }
        },
    ) { measurables, incomingConstraints ->
        val horizontalPadding =
            (contentPadding.calculateLeftPadding(layoutDirection) +
                contentPadding.calculateRightPadding(layoutDirection)).roundToPx()
        val verticalPadding =
            (contentPadding.calculateTopPadding() +
                contentPadding.calculateBottomPadding()).roundToPx()

        // measure hint
        val hintConstraints = incomingConstraints.copy(minHeight = 0)
        val hintPlaceable = measurables.find { it.layoutId == HINT_ID }?.measure(hintConstraints)
        val hintHeight = hintPlaceable?.height ?: 0

        val textAreaConstraints = incomingConstraints.offset(
            horizontal = -horizontalPadding,
            vertical = -verticalPadding - hintHeight,
        )

        val textAreaPlaceable = measurables.first { it.layoutId == TEXT_AREA_ID }.measure(textAreaConstraints)

        // measure placeholder
        val placeholderConstraints = textAreaConstraints.copy(minWidth = 0, minHeight = 0)
        val placeholderPlaceable = measurables.find { it.layoutId == PLACEHOLDER_ID }?.measure(placeholderConstraints)

        val width = calculateWidth(
            textAreaPlaceable,
            placeholderPlaceable,
            hintPlaceable,
            textAreaConstraints,
        )
        val height = calculateHeight(
            textAreaPlaceable,
            placeholderPlaceable,
            verticalPadding,
            hintPlaceable,
            textAreaConstraints,
        )

        layout(width, height) {
            place(
                height,
                contentPadding,
                hintPlaceable,
                textAreaPlaceable,
                placeholderPlaceable,
                layoutDirection,
                this@Layout,
            )
        }
    }
}

private fun calculateWidth(
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    hintPlaceable: Placeable?,
    constraints: Constraints,
): Int =
    maxOf(
        textFieldPlaceable.width,
        placeholderPlaceable?.width ?: 0,
        hintPlaceable?.width ?: 0
    )
        .coerceAtLeast(constraints.minWidth)

private fun calculateHeight(
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    verticalPadding: Int,
    hintPlaceable: Placeable?,
    constraints: Constraints,
): Int {
    val textAreaHeight = maxOf(
        textFieldPlaceable.height,
        placeholderPlaceable?.height ?: 0,
    )
    val totalHeight = textAreaHeight + (hintPlaceable?.height ?: 0)
    return (totalHeight + verticalPadding).coerceAtLeast(constraints.minHeight)
}

private fun Placeable.PlacementScope.place(
    height: Int,
    contentPadding: PaddingValues,
    hintPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    layoutDirection: LayoutDirection,
    density: Density,
) = with(density) {
    val top = contentPadding.calculateTopPadding().roundToPx()
    val left = contentPadding.calculateLeftPadding(layoutDirection).roundToPx()

    textFieldPlaceable.placeRelative(0, 0)
    placeholderPlaceable?.placeRelative(left, top)

    val bottom = contentPadding.calculateBottomPadding().roundToPx()
    hintPlaceable?.placeRelative(x = left, y = height - hintPlaceable.height - bottom)
}

private const val PLACEHOLDER_ID = "Placeholder"
private const val TEXT_AREA_ID = "TextField"
private const val HINT_ID = "Hint"
