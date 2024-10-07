package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.lazy.SelectionMode
import org.jetbrains.jewel.foundation.lazy.items
import org.jetbrains.jewel.foundation.lazy.rememberSelectableLazyListState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.theme.comboBoxStyle

@Composable
public fun ListComboBox(
    items: List<String>,
    modifier: Modifier = Modifier,
    isEditable: Boolean = true,
    isEnabled: Boolean = true,
    maxPopupHeight: Dp = Dp.Unspecified,
    onSelectedItemChange: (String) -> Unit = {},
    listItemContent: @Composable (String, Boolean, Boolean) -> Unit,
) {
    val initialTextFieldContent = items.firstOrNull() ?: ""
    val inputTextFieldState = rememberTextFieldState(initialTextFieldContent)
    val scrollState = rememberSelectableLazyListState()
    var selectedItem by remember { mutableIntStateOf(0) }

    LaunchedEffect(selectedItem) { scrollState.selectedKeys = setOf(items[selectedItem]) }

    val mph =
        if (maxPopupHeight == Dp.Unspecified) {
            JewelTheme.comboBoxStyle.metrics.maxPopupHeight
        } else {
            maxPopupHeight
        }

    ComboBox(
        modifier = modifier,
        isEditable = isEditable,
        isEnabled = isEnabled,
        inputTextFieldState = inputTextFieldState,
        outline = Outline.None,
        maxPopupHeight = mph,
        interactionSource = remember { MutableInteractionSource() },
        style = JewelTheme.comboBoxStyle,
        textStyle = JewelTheme.defaultTextStyle,
        onArrowDownPress = { selectedItem = selectedItem.plus(1).coerceAtMost(items.lastIndex) },
        onArrowUpPress = { selectedItem = selectedItem.minus(1).coerceAtLeast(0) },
    ) {
        VerticallyScrollableContainer(
            scrollState = scrollState.lazyListState,
            modifier = Modifier.heightIn(max = mph),
        ) {
            SelectableLazyColumn(
                modifier = Modifier.fillMaxWidth().heightIn(max = mph),
                selectionMode = SelectionMode.Single,
                state = scrollState,
                onSelectedIndexesChange = { selectedItems ->
                    if (selectedItems.isEmpty()) return@SelectableLazyColumn

                    val selectedItemIndex = selectedItems.first()
                    selectedItem = selectedItemIndex
                    inputTextFieldState.setTextAndPlaceCursorAtEnd(items[selectedItemIndex])
                    onSelectedItemChange(items[selectedItemIndex])
                },
                content = {
                    items(items = items, itemContent = { item -> listItemContent(item, isSelected, isActive) })
                },
            )
        }
    }
}
