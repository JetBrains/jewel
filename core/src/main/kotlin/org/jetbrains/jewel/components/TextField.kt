package org.jetbrains.jewel.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.offset
import org.jetbrains.jewel.components.state.TextFieldState
import org.jetbrains.jewel.modifiers.BorderAlignment
import org.jetbrains.jewel.modifiers.border
import org.jetbrains.jewel.styles.LocalTextFieldStyle
import org.jetbrains.jewel.styles.LocalTextStyle
import org.jetbrains.jewel.styles.TextFieldStyle
import kotlin.math.max

@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    hintState: TextFieldHintState = TextFieldHintState.Normal,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: TextFieldStyle = LocalTextFieldStyle.current
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
        textStyle = textStyle,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        undecorated = undecorated,
        hintState = hintState,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        style = style
    )
}

@Composable
fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    undecorated: Boolean = false,
    hintState: TextFieldHintState = TextFieldHintState.Normal,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: TextFieldStyle = LocalTextFieldStyle.current
) {
    var inputState by remember(interactionSource, enabled) {
        mutableStateOf(TextFieldState(enabled, hintState = hintState))
    }
    remember(hintState) {
        inputState = inputState.copy(hintState = hintState)
    }
    LaunchedEffect(interactionSource) {
        val focusInteractions = mutableListOf<FocusInteraction.Focus>()
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is HoverInteraction.Enter -> inputState = inputState.copy(hovered = true)

                is HoverInteraction.Exit -> inputState = inputState.copy(hovered = false)

                is FocusInteraction.Focus -> {
                    focusInteractions.add(interaction)
                    inputState = inputState.copy(focused = focusInteractions.isNotEmpty())
                }

                is FocusInteraction.Unfocus -> {
                    focusInteractions.remove(interaction.focus)
                    inputState = inputState.copy(focused = focusInteractions.isNotEmpty())
                }
            }
        }
    }

    val appearance = style.appearance(inputState, null)

    val backgroundModifier = if (!undecorated) {
        Modifier.background(appearance.backgroundColor, appearance.shape)
    } else {
        Modifier
    }

    val borderModifier = appearance.borderStroke?.takeIf { !undecorated }?.let {
        Modifier.border(BorderAlignment.Inside, it.width, it.brush, appearance.shape)
    } ?: Modifier

    val haloModifier = appearance.haloStroke?.takeIf { !undecorated }?.let {
        Modifier.border(BorderAlignment.Outside, it.width, it.brush, appearance.shape)
    } ?: Modifier

    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.composed {
            then(backgroundModifier)
                .then(borderModifier)
                .then(haloModifier)
        },
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle.merge(appearance.textStyle),
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = true,
        maxLines = 1,
        visualTransformation = visualTransformation,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        cursorBrush = appearance.cursorBrush
    ) {
        TextFieldDecorationBox(
            modifier = Modifier.padding(appearance.contentPadding),
            innerTextField = it,
            placeholder = if (value.text.isEmpty()) placeholder else null,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon
        )
    }
}

enum class TextFieldHintState {
    Normal,
    Error,
    Warning
}

@Composable
private fun TextFieldDecorationBox(
    modifier: Modifier = Modifier,
    innerTextField: @Composable () -> Unit,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null
) {
    Layout(
        modifier = modifier,
        content = {
            if (leadingIcon != null) {
                Box(modifier = Modifier.layoutId(LEADING_ID), contentAlignment = Alignment.Center) {
                    leadingIcon()
                }
            }
            if (trailingIcon != null) {
                Box(modifier = Modifier.layoutId(TRAILING_ID), contentAlignment = Alignment.Center) {
                    trailingIcon()
                }
            }
            if (placeholder != null) {
                Box(modifier = Modifier.layoutId(PLACEHOLDER_ID), contentAlignment = Alignment.Center) {
                    placeholder()
                }
            }

            Box(modifier = Modifier.layoutId(TEXT_FIELD_ID), propagateMinConstraints = true) {
                innerTextField()
            }
        }
    ) { measurables, incomingConstraints ->
        // used to calculate the constraints for measuring elements that will be placed in a row
        var occupiedSpaceHorizontally = 0

        val constraintsWithoutPadding = incomingConstraints

        val iconsConstraints = constraintsWithoutPadding.copy(minWidth = 0, minHeight = 0)

        // measure leading icon
        val leadingPlaceable = measurables.find { it.layoutId == LEADING_ID }?.measure(iconsConstraints)
        occupiedSpaceHorizontally += leadingPlaceable?.width ?: 0

        // measure trailing icon
        val trailingPlaceable = measurables.find { it.layoutId == TRAILING_ID }
            ?.measure(iconsConstraints.offset(horizontal = -occupiedSpaceHorizontally))
        occupiedSpaceHorizontally += trailingPlaceable?.width ?: 0

        val textConstraints = constraintsWithoutPadding.offset(
            horizontal = -occupiedSpaceHorizontally
        ).copy(minHeight = 0)
        val textFieldPlaceable = measurables.first { it.layoutId == TEXT_FIELD_ID }.measure(textConstraints)

        // measure placeholder
        val placeholderConstraints = textConstraints.copy(minWidth = 0)
        val placeholderPlaceable = measurables.find { it.layoutId == PLACEHOLDER_ID }?.measure(placeholderConstraints)

        val width = calculateWidth(
            leadingPlaceable,
            trailingPlaceable,
            textFieldPlaceable,
            placeholderPlaceable,
            incomingConstraints
        )
        val height = calculateHeight(
            leadingPlaceable,
            trailingPlaceable,
            textFieldPlaceable,
            placeholderPlaceable,
            incomingConstraints
        )

        layout(width, height) {
            place(
                height,
                width,
                leadingPlaceable,
                trailingPlaceable,
                textFieldPlaceable,
                placeholderPlaceable,
                this@Layout
            )
        }
    }
}

private fun calculateWidth(
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    constraints: Constraints
): Int {
    val middleSection = maxOf(
        textFieldPlaceable.width,
        placeholderPlaceable?.width ?: 0
    )
    val wrappedWidth = (leadingPlaceable?.width ?: 0) + middleSection + (trailingPlaceable?.width ?: 0)
    return max(wrappedWidth, constraints.minWidth)
}

private fun calculateHeight(
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    constraints: Constraints
): Int {
    return maxOf(
        leadingPlaceable?.height ?: 0,
        textFieldPlaceable.height,
        placeholderPlaceable?.height ?: 0,
        trailingPlaceable?.height ?: 0,
        constraints.minHeight
    )
}

private fun Placeable.PlacementScope.place(
    height: Int,
    width: Int,
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    placeholderPlaceable: Placeable?,
    density: Density
) = with(density) {
    // placed center vertically and to the start edge horizontally
    leadingPlaceable?.placeRelative(
        0,
        Alignment.CenterVertically.align(leadingPlaceable.height, height)
    )

    // placed center vertically and to the end edge horizontally
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        Alignment.CenterVertically.align(trailingPlaceable.height, height)
    )

    // placed center vertically and after the leading icon horizontally if single line text field
    // placed to the top with padding for multi line text field
    textFieldPlaceable.placeRelative(
        leadingPlaceable?.width ?: 0,
        Alignment.CenterVertically.align(textFieldPlaceable.height, height)
    )

    // placed similar to the input text above
    placeholderPlaceable?.let {
        it.placeRelative(
            leadingPlaceable?.width ?: 0,
            Alignment.CenterVertically.align(it.height, height)
        )
    }
}

private const val PLACEHOLDER_ID = "Placeholder"
private const val TEXT_FIELD_ID = "TextField"
private const val LEADING_ID = "Leading"
private const val TRAILING_ID = "Trailing"
