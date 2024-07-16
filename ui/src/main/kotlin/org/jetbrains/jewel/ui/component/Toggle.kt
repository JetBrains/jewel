package org.jetbrains.jewel.ui.component

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Switch
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Active
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Enabled
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Focused
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Hovered
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Indeterminate
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Pressed
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Selected
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.state.ToggleableComponentState
import org.jetbrains.jewel.foundation.state.ToggleableComponentState.Companion.readToggleableState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.styling.ToggleStyle
import org.jetbrains.jewel.ui.theme.toggleStyle

@Composable
public fun Toggle(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    style: ToggleStyle = JewelTheme.toggleStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val state by remember(checked) { mutableStateOf(ToggleableState(checked)) }
    ToggleImpl(
        state = state,
        onClick = { onCheckedChange.invoke(!checked) },
        modifier = modifier,
        enabled = enabled,
        style = style,
        interactionSource = interactionSource,
    )
}

@Composable
private fun ToggleImpl(
    state: ToggleableState,
    onClick: () -> Unit,
    modifier: Modifier,
    style: ToggleStyle,
    interactionSource: MutableInteractionSource,
    enabled: Boolean,
) {
    var toggleState by remember(interactionSource) {
        mutableStateOf(ToggleState.of(toggleableState = state, enabled = enabled))
    }

    remember(state, enabled) { toggleState = toggleState.copy(toggleableState = state, enabled = enabled) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> toggleState = toggleState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release -> toggleState.copy(pressed = false)
                is HoverInteraction.Enter -> toggleState = toggleState.copy(hovered = true)
                is HoverInteraction.Exit -> toggleState = toggleState.copy(hovered = false)
                is FocusInteraction.Focus -> toggleState = toggleState.copy(focused = true)
                is FocusInteraction.Unfocus -> toggleState = toggleState.copy(focused = false)
            }
        }
    }

    val shape = RoundedCornerShape(style.metrics.cornerSize)

    val wrapperModifier =
        modifier
            .triStateToggleable(
                state = state,
                onClick = onClick,
                enabled = enabled,
                interactionSource = interactionSource,
                indication = null,
            )
            .width(60.dp)
            .clip(shape = shape)
            .background(
                Color.LightGray,
            ).padding(
                PaddingValues(
                    start = if (toggleState.toggleableState == ToggleableState.On) 1.dp else 16.dp,
                    end = if (toggleState.toggleableState == ToggleableState.On) 16.dp else 1.dp,
                    bottom = 1.dp,
                    top = 1.dp
                ),
            )

    val contentModifier =
        modifier
            .clip(shape = shape)
            .background(if (toggleState.toggleableState == ToggleableState.On) Color.Green else Color.Gray,)
            .padding(PaddingValues(
                horizontal = 4.dp,
                vertical = 2.dp
            ))
    Row(
        wrapperModifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if(toggleState.toggleableState == ToggleableState.Off) {
            Spacer(modifier = modifier.weight(1f))
        }
        Box(contentModifier) {
            Text(if (toggleState.toggleableState == ToggleableState.On) "ON" else "OFF")
        }
        if(toggleState.toggleableState == ToggleableState.On) {
            Spacer(modifier = modifier.weight(1f))
        }
    }
}

@Immutable
@JvmInline
public value class ToggleState(
    public val state: ULong,
) : FocusableComponentState,
    ToggleableComponentState {
    override val toggleableState: ToggleableState
        get() = state.readToggleableState()

    override val isActive: Boolean
        get() = state and Active != 0UL

    override val isEnabled: Boolean
        get() = state and Enabled != 0UL

    override val isFocused: Boolean
        get() = state and Focused != 0UL

    override val isSelected: Boolean
        get() = state and Selected != 0UL

    override val isHovered: Boolean
        get() = state and Hovered != 0UL

    override val isPressed: Boolean
        get() = state and Pressed != 0UL

    public fun copy(
        toggleableState: ToggleableState = this.toggleableState,
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        active: Boolean = isActive,
    ): ToggleState =
        of(
            toggleableState = toggleableState,
            enabled = enabled,
            focused = focused,
            pressed = pressed,
            hovered = hovered,
            active = active,
        )

    override fun toString(): String =
        "ChipState(isEnabled=$isEnabled, isFocused=$isFocused, isSelected=$isSelected, " +
            "isHovered=$isHovered, isPressed=$isPressed, isActive=$isActive)"

    public companion object {
        public fun of(
            toggleableState: ToggleableState,
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            active: Boolean = false,
        ): ToggleState =
            ToggleState(
                (if (enabled) Enabled else 0UL) or
                    (if (focused) Focused else 0UL) or
                    (if (toggleableState != ToggleableState.Off) Selected else 0UL) or
                    (if (toggleableState == ToggleableState.Indeterminate) Indeterminate else 0UL) or
                    (if (hovered) Hovered else 0UL) or
                    (if (pressed) Pressed else 0UL) or
                    (if (active) Active else 0UL),
            )
    }
}
