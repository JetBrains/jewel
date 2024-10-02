package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState
import org.jetbrains.jewel.foundation.lazy.SelectionMode
import org.jetbrains.jewel.foundation.lazy.items
import org.jetbrains.jewel.foundation.lazy.rememberSelectableLazyListState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle
import org.jetbrains.jewel.ui.component.styling.SelectableLazyColumnStyle
import org.jetbrains.jewel.ui.theme.comboBoxStyle
import org.jetbrains.jewel.ui.theme.selectableLazyColumnStyle

@Composable
public fun <T : Any> ListComboBox(
    items: List<T>,
    modifier: Modifier = Modifier,
    menuModifier: Modifier = Modifier,
    isEditable: Boolean = true,
    isEnabled: Boolean = true,
    inputTextFieldState: TextFieldState = rememberTextFieldState(),
    selectableLazyListState: SelectableLazyListState = rememberSelectableLazyListState(),
    outline: Outline = Outline.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ComboBoxStyle = JewelTheme.comboBoxStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    listStyle: SelectableLazyColumnStyle = JewelTheme.selectableLazyColumnStyle,
    onSelectedItemIndexChange: (Int) -> Unit = {},
    listItemContent: @Composable (T, Boolean, Boolean) -> Unit,
) {
    var selectedItemIndex by remember { mutableStateOf(selectableLazyListState.lastActiveItemIndex) }

    ComboBox(
        modifier = modifier,
        menuModifier = menuModifier,
        isEditable = isEditable,
        isEnabled = isEnabled,
        inputTextFieldState = inputTextFieldState,
        outline = outline,
        interactionSource = interactionSource,
        style = style,
        textStyle = textStyle,
        onArrowUpPressed = {
            selectedItemIndex = selectedItemIndex?.minus(1)?.coerceAtLeast(0)
            onSelectedItemIndexChange(selectedItemIndex ?: 0)
        },
        onArrowDownPressed = {
            selectedItemIndex = selectedItemIndex?.plus(1)
            onSelectedItemIndexChange(selectedItemIndex ?: 0)
        },
    ) {
        VerticallyScrollableContainer(scrollState = selectableLazyListState.lazyListState) {
            SelectableLazyColumn(
                selectionMode = SelectionMode.Single,
                onSelectedIndexesChanged = {
                    it.firstOrNull()?.run {
                        selectedItemIndex = this
                        onSelectedItemIndexChange(this)
                    }
                },
                content = { items(items = items, itemContent = { listItemContent(it, isSelected, isActive) }) },
            )
        }
    }
}
