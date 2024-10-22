package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import kotlinx.coroutines.launch
import org.jetbrains.jewel.foundation.lazy.SelectionMode
import org.jetbrains.jewel.foundation.lazy.items
import org.jetbrains.jewel.foundation.lazy.rememberSelectableLazyListState
import org.jetbrains.jewel.foundation.lazy.visibleItemsRange
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.styling.PopupContainerStyle
import org.jetbrains.jewel.ui.theme.comboBoxStyle
import org.jetbrains.jewel.ui.theme.popupContainerStyle

@Composable
public fun ListComboBox(
    items: List<String>,
    modifier: Modifier = Modifier,
    isEditable: Boolean = true,
    isEnabled: Boolean = true,
    maxPopupHeight: Dp = Dp.Unspecified,
    popupStyle: PopupContainerStyle = JewelTheme.popupContainerStyle,
    onSelectedItemChange: (String) -> Unit = {},
    onHoverItemChange: (String) -> Unit = {},
    onListHoverChange: (Boolean) -> Unit = {},
    listItemContent: @Composable (String, Boolean, Boolean, Boolean, Boolean) -> Unit,
) {
    val initialTextFieldContent = items.firstOrNull() ?: ""
    val inputTextFieldState = rememberTextFieldState(initialTextFieldContent)
    val scrollState = rememberSelectableLazyListState()
    var selectedItem by remember { mutableIntStateOf(0) }
    var isListHovered by remember { mutableStateOf(false) }
    var hoverItemIndex by remember { mutableStateOf(-1) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(selectedItem) { scrollState.selectedKeys = setOf(items[selectedItem]) }

    val popupMaxHeight =
        if (maxPopupHeight == Dp.Unspecified) {
            JewelTheme.comboBoxStyle.metrics.maxPopupHeight
        } else {
            maxPopupHeight
        }

    val onArrowDownPress: () -> Unit = {
        if (hoverItemIndex != -1) {
            selectedItem = hoverItemIndex
            hoverItemIndex = -1
        }
        selectedItem = selectedItem.plus(1).coerceAtMost(items.lastIndex)
        scope.launch { scrollState.lazyListState.scrollToIndex(selectedItem) }
    }
    val onArrowUpPress: () -> Unit = {
        if (hoverItemIndex != -1) {
            selectedItem = hoverItemIndex
            hoverItemIndex = -1
        }
        selectedItem = selectedItem.minus(1).coerceAtLeast(0)
        scope.launch { scrollState.lazyListState.scrollToIndex(selectedItem) }
    }

    if (isEditable) {
        EditableComboBox(
            modifier = modifier,
            isEnabled = isEnabled,
            inputTextFieldState = inputTextFieldState,
            outline = Outline.None,
            interactionSource = remember { MutableInteractionSource() },
            style = JewelTheme.comboBoxStyle,
            textStyle = JewelTheme.defaultTextStyle,
            popupStyle = popupStyle,
            onArrowDownPress = onArrowDownPress,
            onArrowUpPress = onArrowUpPress,
            onEnterPress = {
                val indexOfSelected = items.indexOf(inputTextFieldState.text)
                if (indexOfSelected != -1) {
                    selectedItem = indexOfSelected
                }
            },
            onPopupStateChange = {},
        ) {
            VerticallyScrollableContainer(
                scrollState = scrollState.lazyListState,
                modifier =
                    Modifier.heightIn(max = popupMaxHeight).onHover {
                        isListHovered = it
                        if (!isListHovered) hoverItemIndex = -1
                        onListHoverChange(it)
                    },
            ) {
                SelectableLazyColumn(
                    modifier = Modifier.fillMaxWidth().heightIn(max = popupMaxHeight),
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
                        items(
                            items = items,
                            itemContent = { item ->
                                var isItemHovered by remember { mutableStateOf(false) }
                                Box(
                                    modifier =
                                        Modifier.onHover {
                                            isItemHovered = it
                                            if (isItemHovered) {
                                                hoverItemIndex = items.indexOf(item)
                                                onHoverItemChange(item)
                                            }
                                        }
                                ) {
                                    listItemContent(
                                        item,
                                        isSelected,
                                        isActive,
                                        isItemHovered && hoverItemIndex != -1,
                                        isListHovered,
                                    )
                                }
                            },
                        )
                    },
                )
            }
        }
    } else {
        ComboBox(
            modifier = modifier,
            isEnabled = isEnabled,
            labelText = items[selectedItem],
            outline = Outline.None,
            maxPopupHeight = popupMaxHeight,
            interactionSource = remember { MutableInteractionSource() },
            style = JewelTheme.comboBoxStyle,
            textStyle = JewelTheme.defaultTextStyle,
            popupStyle = popupStyle,
            onArrowDownPress = onArrowDownPress,
            onArrowUpPress = onArrowUpPress,
        ) {
            VerticallyScrollableContainer(
                scrollState = scrollState.lazyListState,
                modifier =
                    Modifier.heightIn(max = popupMaxHeight).onHover {
                        isListHovered = it
                        if (!isListHovered) hoverItemIndex = -1
                        onListHoverChange(it)
                    },
            ) {
                SelectableLazyColumn(
                    modifier = Modifier.fillMaxWidth().heightIn(max = popupMaxHeight),
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
                        items(
                            items = items,
                            itemContent = { item ->
                                var isHovered by remember { mutableStateOf(false) }
                                Box(
                                    modifier =
                                        Modifier.onHover {
                                            isHovered = it
                                            if (isHovered) {
                                                hoverItemIndex = items.indexOf(item)
                                                onHoverItemChange(item)
                                            }
                                        }
                                ) {
                                    listItemContent(item, isSelected, isActive, isHovered, isListHovered)
                                }
                            },
                        )
                    },
                )
            }
        }
    }
}

private suspend fun LazyListState.scrollToIndex(itemIndex: Int) {
    val isFirstItemFullyVisible = firstVisibleItemScrollOffset == 0

    val lastItemInfo = layoutInfo.visibleItemsInfo.lastOrNull()
    val isLastItemFullyVisible =
        if (lastItemInfo != null) {
            layoutInfo.viewportEndOffset - lastItemInfo.offset >= lastItemInfo.size
        } else {
            false
        }

    val lastItemInfoSize = lastItemInfo?.size ?: 0
    when {
        itemIndex < visibleItemsRange.first -> scrollToItem((itemIndex - 1).coerceAtLeast(0))
        itemIndex == visibleItemsRange.first && !isFirstItemFullyVisible -> scrollToItem(itemIndex)
        itemIndex == visibleItemsRange.last && !isLastItemFullyVisible -> {
            scrollToItem(itemIndex, layoutInfo.viewportEndOffset - lastItemInfoSize)
        }
        itemIndex > visibleItemsRange.last -> {
            // First scroll assuming the new item has the same height as the current last item
            scrollToItem(itemIndex, layoutInfo.viewportEndOffset - lastItemInfoSize)

            // After scrolling, check if we need to adjust due to different item sizes
            val newLastItemInfo = layoutInfo.visibleItemsInfo.lastOrNull() ?: return
            if (newLastItemInfo.size != lastItemInfoSize) {
                scrollToItem(itemIndex, layoutInfo.viewportEndOffset - newLastItemInfo.size)
            }
        }
    }
}
