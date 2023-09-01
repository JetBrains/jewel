package org.jetbrains.jewel

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.offset
import org.jetbrains.jewel.styling.TextFieldStyle
import kotlin.math.max

/**
 * @param placeholder the optional placeholder to be displayed over the
 *     component when the [value] is empty.
 */
@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    outline: Outline = Outline.None,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextFieldStyle = IntelliJTheme.textFieldStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)
    var lastTextValue by remember(value) { mutableStateOf(value) }

    TextField(
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
        trailingIcon = trailingIcon,
        undecorated = undecorated,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        onTextLayout = onTextLayout,
        style = style,
        interactionSource = interactionSource,
    )
}

/**
 * @param placeholder the optional placeholder to be displayed over the
 *     component when the [value] is empty.
 */
@Composable
fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    outline: Outline = Outline.None,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextFieldStyle = IntelliJTheme.textFieldStyle,
    textStyle: TextStyle = IntelliJTheme.defaultTextStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    InputField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        outline = outline,
        undecorated = undecorated,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = true,
        maxLines = 1,
        onTextLayout = onTextLayout,
        style = style,
        textStyle = textStyle,
        interactionSource = interactionSource,
    ) { innerTextField, _ ->
        val minSize = style.metrics.minSize

        TextFieldDecorationBox(
            modifier = Modifier.defaultMinSize(minWidth = minSize.width, minHeight = minSize.height)
                .padding(style.metrics.contentPadding),
            innerTextField = innerTextField,
            textStyle = textStyle,
            placeholderTextColor = style.colors.placeholder,
            placeholder = if (value.text.isEmpty()) placeholder else null,
            trailingIcon = trailingIcon,
        )
    }
}

@Composable
private fun TextFieldDecorationBox(
    modifier: Modifier = Modifier,
    innerTextField: @Composable () -> Unit,
    textStyle: TextStyle,
    placeholderTextColor: Color,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
) {
    Layout(
        modifier = modifier,
        content = {
            if (trailingIcon != null) {
                Box(modifier = Modifier.layoutId(TRAILING_ID), contentAlignment = Alignment.Center) {
                    trailingIcon()
                }
            }
            if (placeholder != null) {
                Box(modifier = Modifier.layoutId(PLACEHOLDER_ID), contentAlignment = Alignment.Center) {
                    CompositionLocalProvider(
                        LocalTextStyle provides textStyle.copy(color = placeholderTextColor),
                        LocalContentColor provides placeholderTextColor,
                        content = placeholder,
                    )
                }
            }

            Box(modifier = Modifier.layoutId(TEXT_FIELD_ID), propagateMinConstraints = true) {
                innerTextField()
            }
        },
    ) { measurables, incomingConstraints ->
        // used to calculate the constraints for measuring elements that will be placed in a row
        var occupiedSpaceHorizontally = 0
        val iconConstraints = incomingConstraints.copy(minWidth = 0, minHeight = 0)

        // measure trailing icon
        val trailingPlaceable = measurables.find { it.layoutId == TRAILING_ID }
            ?.measure(iconConstraints)
        occupiedSpaceHorizontally += trailingPlaceable?.width ?: 0

        val textFieldConstraints = incomingConstraints.offset(
            horizontal = -occupiedSpaceHorizontally,
        ).copy(minHeight = 0)
        val textFieldPlaceable = measurables.first { it.layoutId == TEXT_FIELD_ID }.measure(textFieldConstraints)

        // measure placeholder
        val placeholderConstraints = textFieldConstraints.copy(minWidth = 0)
        val placeholderPlaceable = measurables.find { it.layoutId == PLACEHOLDER_ID }?.measure(placeholderConstraints)

        val width = calculateWidth(
            trailingPlaceable,
            textFieldPlaceable,
            placeholderPlaceable,
            incomingConstraints,
        )
        val height = calculateHeight(
            trailingPlaceable,
            textFieldPlaceable,
            placeholderPlaceable,
            incomingConstraints,
        )

        layout(width, height) {
            place(
                height,
                width,
                trailingPlaceable,
                textFieldPlaceable,
                placeholderPlaceable,
            )
        }
    }
}

private fun calculateWidth(
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    constraints: Constraints,
): Int {
    val middleSection = maxOf(
        textFieldPlaceable.width,
        placeholderPlaceable?.width ?: 0,
    )
    val wrappedWidth = middleSection + (trailingPlaceable?.width ?: 0)
    return max(wrappedWidth, constraints.minWidth)
}

private fun calculateHeight(
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    constraints: Constraints,
): Int = maxOf(
    textFieldPlaceable.height,
    placeholderPlaceable?.height ?: 0,
    trailingPlaceable?.height ?: 0,
    constraints.minHeight,
)

private fun Placeable.PlacementScope.place(
    height: Int,
    width: Int,
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
) {
    // placed center vertically and to the end edge horizontally
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        Alignment.CenterVertically.align(trailingPlaceable.height, height),
    )

    // placed center vertically
    textFieldPlaceable.placeRelative(
        0,
        Alignment.CenterVertically.align(textFieldPlaceable.height, height),
    )

    // placed similar to the input text above
    placeholderPlaceable?.placeRelative(
        0,
        Alignment.CenterVertically.align(placeholderPlaceable.height, height),
    )
}

private const val PLACEHOLDER_ID = "Placeholder"
private const val TEXT_FIELD_ID = "TextField"
private const val TRAILING_ID = "Trailing"
