package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import org.jetbrains.jewel.foundation.lazy.SelectionMode
import org.jetbrains.jewel.foundation.lazy.items
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.theme.comboBoxStyle

@Composable
public fun ListComboBox(
    items: List<String>,
    modifier: Modifier = Modifier,
    onSelectedItemChange: (String) -> Unit = {},
    listItemContent: @Composable (String, Boolean, Boolean) -> Unit,
) {
    val initialTextFieldContent = items.firstOrNull() ?: ""
    val inputTextFieldState = rememberTextFieldState(initialTextFieldContent)

    ComboBox(
        modifier = modifier,
        isEditable = true,
        isEnabled = true,
        inputTextFieldState = inputTextFieldState,
        outline = Outline.None,
        interactionSource = remember { MutableInteractionSource() },
        style = JewelTheme.comboBoxStyle,
        textStyle = JewelTheme.defaultTextStyle,
        onArrowUpPressed = {},
        onArrowDownPressed = {},
    ) {
        SelectableLazyColumn(
            selectionMode = SelectionMode.Single,
            onSelectedIndexesChanged = { selectedItems ->
                if (selectedItems.isEmpty()) return@SelectableLazyColumn

                inputTextFieldState.setTextAndPlaceCursorAtEnd(items[selectedItems.first()])
                onSelectedItemChange(items[selectedItems.first()])
            },
            content = { items(items = items, itemContent = { item -> listItemContent(item, isSelected, isActive) }) },
        )
    }
}
