package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester.Companion.Cancel
import androidx.compose.ui.focus.FocusRequester.Companion.Default
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.onFocusEvent
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.state.CommonStateBitMask
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle
import org.jetbrains.jewel.ui.focusOutline
import org.jetbrains.jewel.ui.theme.segmentedControlStyle

@Composable
public fun SegmentedControl(
    buttons: List<SegmentedControlButtonData>,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    style: SegmentedControlStyle = JewelTheme.segmentedControlStyle,
) {
    var segmentedControlState: SegmentedControlState by remember {
        mutableStateOf(SegmentedControlState.of(enabled = enabled))
    }

    remember(enabled) { segmentedControlState = segmentedControlState.copy(enabled) }

    val borderColor by style.colors.borderFor(segmentedControlState)

    Row(
        modifier = modifier
            .focusProperties {
                canFocus = enabled

                exit = {
                    when (it) {
                        FocusDirection.Left -> Cancel
                        FocusDirection.Right -> Cancel
                        else -> Default
                    }
                }
            }
            .onFocusEvent { segmentedControlState = segmentedControlState.copy(focused = it.isFocused) }
            .selectableGroup()
            .focusGroup()
            .border(
                Stroke.Alignment.Center,
                style.metrics.borderWidth,
                borderColor,
                RoundedCornerShape(style.metrics.cornerSize),
            )
            .focusOutline(
                segmentedControlState,
                RoundedCornerShape(style.metrics.cornerSize),
            ),
        horizontalArrangement = Arrangement.aligned(Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        buttons.forEach { data ->
            SegmentedControlButton(
                isActive = segmentedControlState.isActive,
                enabled = enabled,
                segmentedControlButtonData = data
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
