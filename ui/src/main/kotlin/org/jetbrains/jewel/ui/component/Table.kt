package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.lazy.table.LazyTableCellContainer
import org.jetbrains.jewel.foundation.lazy.table.LazyTableState
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Active
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Enabled
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Focused
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Hovered
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Pressed
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Selected
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.state.SelectableComponentState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.component.styling.TableStyle
import org.jetbrains.jewel.ui.theme.tableStyle

@ExperimentalJewelApi
@Composable
public fun LazyTableState.TableCellContainer(
    columnIndex: Int,
    rowIndex: Int,
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    style: TableStyle = JewelTheme.tableStyle,
    content: @Composable () -> Unit,
) {
    LazyTableCellContainer(
        modifier =
            modifier
                .background(style.colors.headerBackground)
                .border(
                    alignment = Stroke.Alignment.Outside,
                    width = 1.dp,
                    color = style.colors.headerSeparatorColor,
                ),
        contentAlignment = contentAlignment,
    ) {
        CompositionLocalProvider(
            LocalContentColor provides style.colors.headerForeground,
        ) {
            content()
        }
    }
}

@Immutable
@JvmInline
public value class TableCellState(
    public val state: ULong,
) : SelectableComponentState, FocusableComponentState {
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

    override val isSelected: Boolean
        get() = state and Selected != 0UL

    public fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        selected: Boolean = isSelected,
        active: Boolean = isActive,
    ): TableCellState =
        of(
            enabled = enabled,
            focused = focused,
            pressed = pressed,
            hovered = hovered,
            selected = selected,
            active = active,
        )

    override fun toString(): String =
        "${javaClass.simpleName}(isEnabled=$isEnabled, isFocused=$isFocused, isHovered=$isHovered, " +
            "isPressed=$isPressed, isSelected=$isSelected, isActive=$isActive)"

    public companion object {
        public fun of(
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            selected: Boolean = false,
            active: Boolean = true,
        ): TableCellState =
            TableCellState(
                (if (enabled) Enabled else 0UL) or
                    (if (focused) Focused else 0UL) or
                    (if (hovered) Hovered else 0UL) or
                    (if (pressed) Pressed else 0UL) or
                    (if (selected) Selected else 0UL) or
                    (if (active) Active else 0UL),
            )
    }
}
