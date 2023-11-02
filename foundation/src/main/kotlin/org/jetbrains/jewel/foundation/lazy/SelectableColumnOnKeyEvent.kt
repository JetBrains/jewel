package org.jetbrains.jewel.foundation.lazy

import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey.Selectable
import kotlin.math.max
import kotlin.math.min

interface SelectableColumnOnKeyEvent {

    val keybindings: SelectableColumnKeybindings

    /**
     * Select First Node
     */
    fun onSelectFirstItem(allKeys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        for (index in allKeys.indices) {
            val key = allKeys[index]
            if (key is Selectable) {
                state.selectedKeys = listOf(key.key)
                state.lastActiveItemIndex = index
                return
            }
        }
    }

    /**
     * Extend Selection to First Node inherited from Move Caret to Text Start with Selection
     */
    fun onExtendSelectionToFirst(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val initialIndex = state.lastActiveItemIndex ?: return
        val newSelection = ArrayList<Any>(max(initialIndex, state.selectedKeys.size)).apply {
            addAll(state.selectedKeys)
        }
        for (index in initialIndex - 1 downTo 0) {
            val key = keys[index]
            if (key is Selectable) {
                newSelection.add(key.key)
                state.lastActiveItemIndex = index
            }
        }
        state.selectedKeys = newSelection
    }

    /**
     * Select Last Node inherited from Move Caret to Text End
     */
    fun onSelectLastItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        for (index in keys.lastIndex downTo 0) {
            val key = keys[index]
            if (key is Selectable) {
                state.selectedKeys = listOf(key.key)
                state.lastActiveItemIndex = index
                return
            }
        }
    }

    /**
     * Extend Selection to Last Node inherited from Move Caret to Text End with Selection
     */
    fun onExtendSelectionToLastItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val initialIndex = state.lastActiveItemIndex ?: return
        val newSelection = ArrayList<Any>(max(keys.size - initialIndex, state.selectedKeys.size)).apply {
            addAll(state.selectedKeys)
        }
        for (index in initialIndex + 1..keys.lastIndex) {
            val key = keys[index]
            if (key is Selectable) {
                newSelection.add(key.key)
                state.lastActiveItemIndex = index
            }
        }
        state.selectedKeys = newSelection
    }

    /**
     * Select Previous Node inherited from Up
     */
    fun onSelectPreviousItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val initialIndex = state.lastActiveItemIndex ?: return
        for (index in initialIndex - 1 downTo 0) {
            val key = keys[index]
            if (key is Selectable) {
                state.selectedKeys = listOf(key.key)
                state.lastActiveItemIndex = index
                return
            }
        }
    }

    /**
     * Extend Selection with Previous Node inherited from Up with Selection
     */
    fun onExtendSelectionWithPreviousItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        // todo we need deselect if we are changing direction
        val initialIndex = state.lastActiveItemIndex ?: return
        for (index in initialIndex - 1 downTo 0) {
            val key = keys[index]
            if (key is Selectable) {
                state.selectedKeys += key.key
                state.lastActiveItemIndex = index
                return
            }
        }
    }

    /**
     * Select Next Node inherited from Down
     */
    fun onSelectNextItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val initialIndex = state.lastActiveItemIndex ?: return
        for (index in initialIndex + 1..keys.lastIndex) {
            val key = keys[index]
            if (key is Selectable) {
                state.selectedKeys = listOf(key.key)
                state.lastActiveItemIndex = index
                return
            }
        }
    }

    /**
     * Extend Selection with Next Node inherited from Down with Selection
     */
    fun onExtendSelectionWithNextItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        // todo we need deselect if we are changing direction
        val initialIndex = state.lastActiveItemIndex ?: return
        for (index in initialIndex + 1..keys.lastIndex) {
            val key = keys[index]
            if (key is Selectable) {
                state.selectedKeys += key.key
                state.lastActiveItemIndex = index
                return
            }
        }
    }

    /**
     * Scroll Page Up and Select Node inherited from Page Up
     */
    fun onScrollPageUpAndSelectItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val visibleSize = state.layoutInfo.visibleItemsInfo.size
        val targetIndex = max((state.lastActiveItemIndex ?: 0) - visibleSize, 0)
        state.selectedKeys = listOf(keys[targetIndex].key)
        state.lastActiveItemIndex = targetIndex
    }

    /**
     * Scroll Page Up and Extend Selection inherited from Page Up with Selection
     */
    fun onScrollPageUpAndExtendSelection(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val visibleSize = state.layoutInfo.visibleItemsInfo.size
        val targetIndex = max((state.lastActiveItemIndex ?: 0) - visibleSize, 0)
        val newSelectionList =
            keys.subList(targetIndex, (state.lastActiveItemIndex ?: 0))
                .withIndex()
                .filter { it.value is Selectable }
                .let {
                    state.selectedKeys + it.map { selectableKey -> selectableKey.value.key }
                }
        state.selectedKeys = newSelectionList
        state.lastActiveItemIndex = targetIndex
    }

    /**
     * Scroll Page Down and Select Node inherited from Page Down
     */
    fun onScrollPageDownAndSelectItem(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val visibleSize = state.layoutInfo.visibleItemsInfo.size
        val targetIndex = min((state.lastActiveItemIndex ?: 0) + visibleSize, keys.lastIndex)
        state.selectedKeys = listOf(keys[targetIndex].key)
        state.lastActiveItemIndex = targetIndex
    }

    /**
     * Scroll Page Down and Extend Selection inherited from Page Down with Selection
     */
    fun onScrollPageDownAndExtendSelection(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val visibleSize = state.layoutInfo.visibleItemsInfo.size
        val targetIndex = min((state.lastActiveItemIndex ?: 0) + visibleSize, keys.lastIndex)
        val newSelectionList =
            keys.subList(state.lastActiveItemIndex ?: 0, targetIndex)
                .filterIsInstance<Selectable>()
                .let {
                    state.selectedKeys + it.map { selectableKey -> selectableKey.key }
                }
        state.selectedKeys = newSelectionList
        state.lastActiveItemIndex = targetIndex
    }

    /**
     * Edit In Item
     */
    fun onEdit() {
        // ij with this shortcut just focus the first element with issue
        // unavailable here
    }

    /**
     * Select All
     */
    fun onSelectAll(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        state.selectedKeys = keys.filterIsInstance<Selectable>().map { it.key }
    }
}

open class DefaultSelectableOnKeyEvent(
    override val keybindings: SelectableColumnKeybindings,
) : SelectableColumnOnKeyEvent {

    companion object : DefaultSelectableOnKeyEvent(DefaultSelectableColumnKeybindings)
}
