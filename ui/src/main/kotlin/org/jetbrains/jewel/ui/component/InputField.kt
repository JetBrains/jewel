package org.jetbrains.jewel.ui.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits.MultiLine
import androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
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
import kotlin.time.Duration.Companion.seconds

@Composable
internal fun InputField(
    state: TextFieldState,
    enabled: Boolean,
    readOnly: Boolean,
    outline: Outline,
    undecorated: Boolean,
    keyboardOptions: KeyboardOptions,
    singleLine: Boolean,
    maxLines: Int,
    interactionSource: MutableInteractionSource,
    style: InputFieldStyle,
    textStyle: TextStyle,
    modifier: Modifier = Modifier,
    decorationBox: @Composable (innerTextField: @Composable () -> Unit, state: InputFieldState) -> Unit,
) {
    var inputState by remember(interactionSource) {
        mutableStateOf(InputFieldState.of(enabled = enabled))
    }
    remember(enabled) { inputState = inputState.copy(enabled = enabled) }

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

    val backgroundModifier =
        Modifier.thenIf(!undecorated && backgroundColor.isSpecified) {
            background(backgroundColor, shape)
        }

    val borderColor by style.colors.borderFor(inputState)
    val hasNoOutline = outline == Outline.None
    val borderModifier =
        Modifier.thenIf(!undecorated && borderColor.isSpecified && hasNoOutline) {
            border(
                alignment = Stroke.Alignment.Center,
                width = style.metrics.borderWidth,
                color = borderColor,
                shape = shape,
            )
        }

    val contentColor by colors.contentFor(inputState)
    val mergedTextStyle = style.textStyle.merge(textStyle).copy(color = contentColor)
    val caretColor by colors.caretFor(inputState)

    val lineLimits =
        when {
            singleLine -> SingleLine
            else -> MultiLine(maxLines)
        }

    val scrollState = rememberScrollState()
    val canScroll by remember {
        derivedStateOf {
            scrollState.canScrollBackward || scrollState.canScrollForward
        }
    }

    var visible by remember { mutableStateOf(scrollState.value > 0) }
    val hovered = interactionSource.collectIsHoveredAsState().value
    var trackIsVisible by remember { mutableStateOf(false) }
    val fadeOutDuration = 2.seconds

    val animatedAlpha by animateFloatAsState(
        targetValue = if (visible) 1.0f else 0f,
        label = "alpha",
    )

    LaunchedEffect(scrollState.isScrollInProgress, hovered) {
        when {
            scrollState.isScrollInProgress -> visible = true
            hovered -> {
                visible = true
                trackIsVisible = true
            }

            !hovered -> {
                delay(fadeOutDuration)
                trackIsVisible = false
                visible = false
            }

            !scrollState.isScrollInProgress && !hovered -> {
                delay(fadeOutDuration)
                visible = false
            }
        }
    }

    Box(
        modifier =
            modifier
                .then(backgroundModifier)
                .then(borderModifier)
                .thenIf(!undecorated && hasNoOutline) { focusOutline(inputState, shape) }
                .outline(inputState, outline, shape, Stroke.Alignment.Center),
    ) {
        BasicTextField(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterStart)
                    .thenIf(canScroll) { padding(end = 12.dp) }, // TODO Hardcoded values suck
            state = state,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(caretColor),
            keyboardOptions = keyboardOptions,
            lineLimits = lineLimits,
            interactionSource = interactionSource,
            decorator = { innerTextField: @Composable () -> Unit -> decorationBox(innerTextField, inputState) },
            scrollState = scrollState,
        )

        if (visible) {
            val adapter = rememberScrollbarAdapter(scrollState = scrollState)

            VerticalScrollbar(
                modifier =
                    Modifier
                        .align(Alignment.CenterEnd)
                        .graphicsLayer { alpha = animatedAlpha }
                        .thenIf(trackIsVisible) {
                            width(16.dp) // TODO Hardcoded values suck
                                .background(Color(0xFFcfd2e1)) // TODO Hardcoded values suck
                        }.scrollable(
                            scrollState,
                            orientation = Orientation.Vertical,
                            reverseDirection = true,
                        ),
                interactionSource = interactionSource,
                adapter = adapter,
            )
        }
    }
}

@Composable
internal fun InputField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
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
    modifier: Modifier = Modifier,
    decorationBox: @Composable (innerTextField: @Composable () -> Unit, state: InputFieldState) -> Unit,
) {
    var inputState by remember(interactionSource) { mutableStateOf(InputFieldState.of(enabled = enabled)) }
    remember(enabled) { inputState = inputState.copy(enabled = enabled) }

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

    val backgroundModifier =
        Modifier.thenIf(!undecorated && backgroundColor.isSpecified) {
            background(backgroundColor, shape)
        }

    val borderColor by style.colors.borderFor(inputState)
    val hasNoOutline = outline == Outline.None
    val borderModifier =
        Modifier.thenIf(!undecorated && borderColor.isSpecified && hasNoOutline) {
            border(
                alignment = Stroke.Alignment.Center,
                width = style.metrics.borderWidth,
                color = borderColor,
                shape = shape,
            )
        }

    val contentColor by colors.contentFor(inputState)
    val mergedTextStyle = textStyle.copy(color = contentColor)
    val caretColor by colors.caretFor(inputState)

    BasicTextField(
        value = value,
        modifier =
            modifier
                .then(backgroundModifier)
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
public value class InputFieldState(
    public val state: ULong,
) : FocusableComponentState {
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
    ): InputFieldState =
        of(
            enabled = enabled,
            focused = focused,
            pressed = pressed,
            hovered = hovered,
            active = active,
        )

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
        ): InputFieldState =
            InputFieldState(
                state =
                    (if (enabled) Enabled else 0UL) or
                        (if (focused) Focused else 0UL) or
                        (if (hovered) Hovered else 0UL) or
                        (if (pressed) Pressed else 0UL) or
                        (if (active) Active else 0UL),
            )
    }
}
