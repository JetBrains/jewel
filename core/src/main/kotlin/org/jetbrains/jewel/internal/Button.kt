package org.jetbrains.jewel.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.border
import org.jetbrains.jewel.styles.localNotProvided

@Composable
fun DefaultButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    defaults: ButtonDefaults = IntelliJTheme.buttonDefaults,
    colors: ButtonColors = defaults.primaryButtonColors(),
    shape: Shape = defaults.shape(),
    content: @Composable RowScope.() -> Unit
) {
    ButtonImpl(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        defaults = defaults,
        colors = colors,
        shape = shape,
        content = content
    )
}

@Composable
fun OutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    defaults: ButtonDefaults = IntelliJTheme.buttonDefaults,
    colors: ButtonColors = defaults.outlinedButtonColors(),
    shape: Shape = defaults.shape(),
    content: @Composable RowScope.() -> Unit
) {
    ButtonImpl(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        defaults = defaults,
        colors = colors,
        shape = shape,
        content = content
    )
}

@Composable
private fun ButtonImpl(
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    interactionSource: MutableInteractionSource,
    defaults: ButtonDefaults,
    colors: ButtonColors,
    shape: Shape,
    content: @Composable RowScope.() -> Unit
) {
    var buttonState by remember(interactionSource, enabled) {
        mutableStateOf(ButtonState.of(enabled = enabled))
    }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> buttonState = buttonState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release -> buttonState = buttonState.copy(pressed = false)
                is HoverInteraction.Enter -> buttonState = buttonState.copy(hovered = true)
                is HoverInteraction.Exit -> buttonState = buttonState.copy(hovered = false)
                is FocusInteraction.Focus -> buttonState = buttonState.copy(focused = true)
                is FocusInteraction.Unfocus -> buttonState = buttonState.copy(focused = false)
            }
        }
    }

    Box(
        modifier.clickable(
            onClick = onClick,
            enabled = enabled,
            role = Role.Button,
            interactionSource = interactionSource,
            indication = null
        ).background(colors.backgroundBrush(buttonState).value, shape)
            .border(colors.borderStroke(buttonState).value, shape)
            .border(colors.haloStroke(buttonState).value, shape),
        propagateMinConstraints = true
    ) {
        CompositionLocalProvider(
            LocalTextColor provides colors.contentColor(buttonState).value
        ) {
            Row(
                Modifier
                    .defaultMinSize(defaults.minWidth(), defaults.minHeight())
                    .padding(defaults.contentPadding()),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

@Stable
interface ButtonColors {

    @Composable
    fun backgroundBrush(state: ButtonState): State<Brush>

    @Composable
    fun contentColor(state: ButtonState): State<Color>

    @Composable
    fun borderStroke(state: ButtonState): State<Stroke>

    @Composable
    fun haloStroke(state: ButtonState): State<Stroke>
}

@Stable
interface ButtonDefaults {

    @Composable
    fun shape(): Shape

    @Composable
    fun contentPadding(): PaddingValues

    @Composable
    fun minWidth(): Dp

    @Composable
    fun minHeight(): Dp

    @Composable
    fun primaryButtonColors(): ButtonColors

    @Composable
    fun outlinedButtonColors(): ButtonColors
}

@Immutable
@JvmInline
value class ButtonState(val state: ULong) {

    @Stable
    val isEnabled: Boolean
        get() = state and Enabled != 0UL

    @Stable
    val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    val isHovered: Boolean
        get() = state and Hovered != 0UL

    @Stable
    val isPressed: Boolean
        get() = state and Pressed != 0UL

    fun copy(enabled: Boolean = isEnabled, focused: Boolean = isFocused, pressed: Boolean = isPressed, hovered: Boolean = isHovered) =
        of(enabled, focused, pressed, hovered)

    override fun toString(): String = "ButtonState(enabled=$isEnabled, focused=$isFocused, pressed=$isPressed, hovered=$isHovered)"

    companion object {

        private val Enabled = 1UL shl 0
        private val Focused = 1UL shl 1
        private val Hovered = 1UL shl 2
        private val Pressed = 1UL shl 3

        fun of(enabled: Boolean = true, focused: Boolean = false, pressed: Boolean = false, hovered: Boolean = false): ButtonState {
            var state = 0UL
            if (enabled) state = state or Enabled
            if (focused) state = state or Focused
            if (pressed) state = state or Pressed
            if (hovered) state = state or Hovered
            return ButtonState(state)
        }
    }
}

fun buttonColors(
    normalArea: AreaColor,
    normalStroke: Stroke,
    disabledArea: AreaColor,
    disabledStroke: Stroke,
    hoverArea: AreaColor,
    hoverStroke: Stroke,
    pressedArea: AreaColor,
    pressedStroke: Stroke,
    focusedArea: AreaColor,
    focusedStroke: Stroke,
    focusHaloStroke: Stroke
): ButtonColors = DefaultButtonColors(
    normalArea = normalArea,
    normalStroke = normalStroke,
    disabledArea = disabledArea,
    disabledStroke = disabledStroke,
    hoverArea = hoverArea,
    hoverStroke = hoverStroke,
    pressedArea = pressedArea,
    pressedStroke = pressedStroke,
    focusedArea = focusedArea,
    focusedStroke = focusedStroke,
    focusHaloStroke = focusHaloStroke
)

@Immutable
private data class DefaultButtonColors(
    private val normalArea: AreaColor,
    private val normalStroke: Stroke,
    private val disabledArea: AreaColor,
    private val disabledStroke: Stroke,
    private val hoverArea: AreaColor,
    private val hoverStroke: Stroke,
    private val pressedArea: AreaColor,
    private val pressedStroke: Stroke,
    private val focusedArea: AreaColor,
    private val focusedStroke: Stroke,
    private val focusHaloStroke: Stroke
) : ButtonColors {

    @Composable
    override fun backgroundBrush(state: ButtonState): State<Brush> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> backgroundBrush(disabledArea)
                state.isFocused -> backgroundBrush(focusedArea)
                state.isPressed -> backgroundBrush(pressedArea)
                state.isHovered -> backgroundBrush(hoverArea)
                else -> backgroundBrush(normalArea)
            }
        )
    }

    @Composable
    override fun contentColor(state: ButtonState): State<Color> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> disabledArea.foreground
                state.isFocused -> focusedArea.foreground
                state.isPressed -> pressedArea.foreground
                state.isHovered -> hoverArea.foreground
                else -> normalArea.foreground
            }
        )
    }

    @Composable
    override fun borderStroke(state: ButtonState): State<Stroke> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> disabledStroke
                state.isFocused -> focusedStroke
                state.isPressed -> pressedStroke
                state.isHovered -> hoverStroke
                else -> normalStroke
            }
        )
    }

    @Composable
    override fun haloStroke(state: ButtonState): State<Stroke> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> Stroke.None
                state.isFocused -> focusHaloStroke
                else -> Stroke.None
            }
        )
    }
}

internal val LocalButtonDefaults = staticCompositionLocalOf<ButtonDefaults> {
    localNotProvided()
}
