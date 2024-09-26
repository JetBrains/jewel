package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.onClick
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
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
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
    isEditable: Boolean = true,
    isEnabled: Boolean = true,
    inputTextFieldState: TextFieldState = rememberTextFieldState(),
    outline: Outline = Outline.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ComboBoxStyle = JewelTheme.comboBoxStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    menuContent: MenuScope.() -> Unit,
) {
    var popupExpanded by remember { mutableStateOf(false) }
    var comboBoxState by remember { mutableStateOf(ComboBoxState.of(enabled = isEnabled)) }
    var isFocused by remember { mutableStateOf(false) }

    val textFieldInteractionSource = remember { MutableInteractionSource() }
    val textFieldFocusRequester = remember { FocusRequester() }
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
    var initialTextFieldWidth by remember { mutableStateOf<Int?>(null) }
    Box(
        modifier =
            modifier
                .thenIf(!isEditable) {
                    focusable(isEnabled, interactionSource)
                        .onFocusChanged { focusState -> isFocused = focusState.isFocused }
                        .onKeyEvent { keyEvent ->
                            if (
                                keyEvent.type == KeyEventType.KeyDown &&
                                    (keyEvent.key == Key.Spacebar || keyEvent.key == Key.Enter)
                            ) {
                                popupExpanded = !popupExpanded
                                true
                            } else {
                                false
                            }
                        }
                }
                .background(style.colors.backgroundFor(comboBoxState, isEditable).value, shape)
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
                .defaultMinSize(style.metrics.minSize.width, style.metrics.minSize.height)
                .onSizeChanged { comboBoxWidth = it.width }
                .thenIf(isEditable) { focusProperties { canFocus = false } }
                .thenIf(isEnabled) {
                    clickable(
                        interactionSource = interactionSource,
                        indication = null,
                        enabled = isEnabled,
                        onClick = {
                            if (isEnabled) {
                                popupExpanded = !popupExpanded
                                if (popupExpanded && isEditable) {
                                    textFieldFocusRequester.requestFocus()
                                }
                            }
                        },
                    )
                },
        contentAlignment = Alignment.CenterStart,
    ) {
        CompositionLocalProvider(LocalContentColor provides style.colors.contentFor(comboBoxState).value) {
            Box(
                modifier =
                    Modifier.padding(end = style.metrics.arrowMinSize.width).onFocusChanged {
                        comboBoxState = comboBoxState.copy(focused = it.isFocused)
                    },
                contentAlignment = Alignment.CenterStart,
            ) {
                if (isEnabled && isEditable) {
                    BasicTextField(
                        state = inputTextFieldState,
                        modifier =
                            Modifier.testTag("Jewel.ComboBox.TextField")
                                .padding(style.metrics.contentPadding)
                                .onSizeChanged { size ->
                                    if (initialTextFieldWidth == null) {
                                        initialTextFieldWidth = size.width
                                    }
                                }
                                .then(initialTextFieldWidth?.let { Modifier.width(it.dp) } ?: Modifier)
                                .onFocusChanged { isFocused = it.isFocused }
                                .focusRequester(textFieldFocusRequester),
                        lineLimits = TextFieldLineLimits.SingleLine,
                        textStyle = textStyle.copy(color = style.colors.content),
                        cursorBrush = SolidColor(style.colors.content),
                        interactionSource = textFieldInteractionSource,
                    )
                } else {
                    Text(
                        text = inputTextFieldState.text.toString(),
                        style = textStyle,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier =
                            Modifier.testTag("Jewel.ComboBox.NonEditableText")
                                .fillMaxWidth()
                                .padding(style.metrics.contentPadding),
                    )
                }
            }

            Box(
                modifier =
                    Modifier.testTag("Jewel.ComboBox.ChevronContainer")
                        .height(IntrinsicSize.Min)
                        .defaultMinSize(style.metrics.arrowMinSize.width, style.metrics.arrowMinSize.height)
                        .align(Alignment.CenterEnd)
                        .focusProperties { canFocus = false }
                        .thenIf(isEnabled) {
                            onClick {
                                popupExpanded = !popupExpanded
                                if (popupExpanded && isEditable) {
                                    textFieldFocusRequester.requestFocus()
                                }
                            }
                        },
                contentAlignment = Alignment.Center,
            ) {
                if (isEditable) {
                    Divider(
                        orientation = Orientation.Vertical,
                        thickness = style.metrics.borderWidth,
                        color = style.colors.border,
                        modifier =
                            Modifier.testTag("Jewel.ComboBox.Divider")
                                .semantics { contentDescription = "Jewel.ComboBox.Divider" }
                                .align(Alignment.CenterStart),
                    )
                }
                Icon(key = style.icons.chevronDown, contentDescription = null, tint = style.colors.iconTint)
            }
        }

        if (popupExpanded) {
            val density = LocalDensity.current
            PopupMenu(
                onDismissRequest = {
                    popupExpanded = false
                    true
                },
                modifier =
                    menuModifier
                        .testTag("Jewel.ComboBox.PopupMenu")
                        .defaultMinSize(minWidth = with(density) { comboBoxWidth.toDp() }),
                style = style.menuStyle,
                horizontalAlignment = Alignment.Start,
                content = menuContent,
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
