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
import org.jetbrains.jewel.styles.localNotProvided

@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    defaults: ButtonDefaults = LocalButtonDefaults.current,
    colors: ButtonColors = defaults.buttonColors(),
    shape: Shape = defaults.shape().value,
    content: @Composable RowScope.() -> Unit
) {
    var buttonState by remember(interactionSource, enabled) {
        mutableStateOf(ButtonState.of(enabled = true))
    }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> buttonState = buttonState.copy(mouseState = MouseState.Pressed)
                is PressInteraction.Cancel, is PressInteraction.Release -> buttonState = buttonState.copy(mouseState = MouseState.None)
                is HoverInteraction.Enter -> if (buttonState.mouseState == MouseState.None) {
                    buttonState = buttonState.copy(mouseState = MouseState.Hovered)
                }

                is HoverInteraction.Exit -> if (buttonState.mouseState == MouseState.Hovered) {
                    buttonState = buttonState.copy(mouseState = MouseState.None)
                }

                is FocusInteraction.Focus -> buttonState = buttonState.copy(focused = true)
                is FocusInteraction.Unfocus -> buttonState = buttonState.copy(focused = false)
            }
        }
    }

    Box(
        modifier.background(colors.backgroundBrush(buttonState).value, shape)
            .border(colors.holoStroke(buttonState).value)
            .border(colors.borderStroke(buttonState).value)
            .clickable(
                onClick = onClick,
                enabled = enabled,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = null
            ),
        propagateMinConstraints = true
    ) {
        Row(
            Modifier
                .padding(defaults.contentPadding().value)
                .defaultMinSize(defaults.minWidth().value, defaults.minHeight().value),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
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
    fun holoStroke(state: ButtonState): State<Stroke>
}

@Stable
interface ButtonDefaults {

    @Composable
    fun shape(): State<Shape>

    @Composable
    fun contentPadding(): State<PaddingValues>

    @Composable
    fun minWidth(): State<Dp>

    @Composable
    fun minHeight(): State<Dp>

    @Composable
    fun buttonColors(): ButtonColors

    @Composable
    fun outlineButtonColors(): ButtonColors
}

@Immutable
@JvmInline
value class MouseState internal constructor(val state: ULong) {

    override fun toString(): String {
        return when (state) {
            None.state -> "None"
            Pressed.state -> "Pressed"
            Hovered.state -> "Hovered"
            else -> "Unknown"
        }
    }

    companion object {

        val None = MouseState(0UL)
        val Hovered = MouseState(1UL)
        val Pressed = MouseState(2UL)
    }
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
    val mouseState: MouseState
        get() = MouseState(state shr mouseStateBitOffset)

    fun copy(enabled: Boolean = isEnabled, focused: Boolean = isFocused, mouseState: MouseState = this.mouseState): ButtonState {
        return of(enabled, focused, mouseState)
    }

    override fun toString(): String {
        return "ButtonState(enabled=$isEnabled, focused=$isFocused, mouseState=$mouseState)"
    }

    companion object {

        private val Enabled = 1UL shl 0
        private val Focused = 1UL shl 1
        private val mouseStateBitOffset = 60

        fun of(enabled: Boolean = true, focused: Boolean = false, mouseState: MouseState = MouseState.None): ButtonState {
            return ButtonState(
                state = (if (enabled) Enabled else 0UL) or
                    (if (focused) Focused else 0UL) or
                    (mouseState.state shl mouseStateBitOffset)
            )
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
    focusHoloStroke: Stroke
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
    focusHoloStroke = focusHoloStroke
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
    private val focusHoloStroke: Stroke
) : ButtonColors {

    @Composable
    override fun backgroundBrush(state: ButtonState): State<Brush> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> backgroundBrush(disabledArea)
                state.isFocused -> backgroundBrush(focusedArea)
                state.mouseState == MouseState.Pressed -> backgroundBrush(pressedArea)
                state.mouseState == MouseState.Hovered -> backgroundBrush(hoverArea)
                else -> backgroundBrush(normalArea)
            }
        )
    }

    override fun contentColor(state: ButtonState): State<Color> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> disabledArea.foreground
                state.isFocused -> focusedArea.foreground
                state.mouseState == MouseState.Pressed -> pressedArea.foreground
                state.mouseState == MouseState.Hovered -> hoverArea.foreground
                else -> normalArea.foreground
            }
        )
    }

    override fun borderStroke(state: ButtonState): State<Stroke> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> disabledStroke
                state.isFocused -> focusedStroke
                state.mouseState == MouseState.Pressed -> pressedStroke
                state.mouseState == MouseState.Hovered -> hoverStroke
                else -> normalStroke
            }
        )
    }

    override fun holoStroke(state: ButtonState): State<Stroke> {
        return rememberUpdatedState(
            when {
                !state.isEnabled -> Stroke.None
                state.isFocused -> focusHoloStroke
                else -> Stroke.None
            }
        )
    }
}

internal val LocalButtonDefaults = staticCompositionLocalOf<ButtonDefaults> {
    localNotProvided()
}
