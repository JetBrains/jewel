package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectableGroup
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
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.state.CommonStateBitMask
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle
import org.jetbrains.jewel.ui.theme.segmentedControlStyle

@Composable
public fun SegmentedControl(
    buttons: List<SegmentedControlButtonData>,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: SegmentedControlStyle = JewelTheme.segmentedControlStyle,
) {
    var segmentedControlState: SegmentedControlState by remember {
        mutableStateOf(SegmentedControlState.of(enabled = enabled))
    }

    remember(enabled) { segmentedControlState = segmentedControlState.copy(enabled) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> segmentedControlState = segmentedControlState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release ->
                    segmentedControlState = segmentedControlState.copy(pressed = false)

                is HoverInteraction.Enter -> segmentedControlState = segmentedControlState.copy(hovered = true)
                is HoverInteraction.Exit -> segmentedControlState = segmentedControlState.copy(hovered = false)

                is FocusInteraction.Focus -> segmentedControlState = segmentedControlState.copy(focused = true)
                is FocusInteraction.Unfocus -> segmentedControlState = segmentedControlState.copy(focused = false)
            }
        }
    }

    val borderColor by style.colors.borderFor(segmentedControlState)

    Row(
        modifier = modifier
            .focusable(true, interactionSource)
            .selectableGroup()
            .border(
                Stroke.Alignment.Center,
                style.metrics.borderWidth,
                borderColor,
                RoundedCornerShape(style.metrics.cornerSize)),
        horizontalArrangement = Arrangement.aligned(Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        buttons.forEach {
            SegmentedControlButton(
                isActive = segmentedControlState.isActive,
                enabled = enabled,
                segmentedControlButtonData = it
            )
        }
    }
}

@Immutable
@GenerateDataFunctions
public class SegmentedControlButtonData(
    public val selected: Boolean,
    public val content: @Composable SegmentedControlButtonScope.(segmentedControlButtonState: SegmentedControlButtonState) -> Unit,
    public val onClick: () -> Unit
)

@Immutable
@JvmInline
public value class SegmentedControlState(public val state: ULong) : FocusableComponentState {

    override val isActive: Boolean
        get() = state and CommonStateBitMask.Active != 0UL

    override val isEnabled: Boolean
        get() = state and CommonStateBitMask.Enabled != 0UL

    override val isFocused: Boolean
        get() = state and CommonStateBitMask.Focused != 0UL

    override val isHovered: Boolean
        get() = state and CommonStateBitMask.Hovered != 0UL

    override val isPressed: Boolean
        get() = state and CommonStateBitMask.Pressed != 0UL

    public fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        active: Boolean = isActive,
    ): SegmentedControlState = of(
        enabled = enabled,
        focused = focused,
        pressed = pressed,
        hovered = hovered,
        active = active,
    )

    override fun toString(): String =
        "${javaClass.simpleName}(isEnabled=$isEnabled, isFocused=$isFocused, isHovered=$isHovered, " +
            "isPressed=$isPressed, isActive=$isActive)"

    public companion object {

        public fun of(
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            active: Boolean = false,
        ): SegmentedControlState =
            SegmentedControlState(
                (if (enabled) CommonStateBitMask.Enabled else 0UL) or
                    (if (focused) CommonStateBitMask.Focused else 0UL) or
                    (if (hovered) CommonStateBitMask.Hovered else 0UL) or
                    (if (pressed) CommonStateBitMask.Pressed else 0UL) or
                    (if (active) CommonStateBitMask.Active else 0UL),
            )
    }
}