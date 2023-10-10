package org.jetbrains.jewel.foundation.lazy

import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScopeContainer.Entry
import org.jetbrains.jewel.foundation.tree.DefaultSelectableLazyColumnEventAction
import org.jetbrains.jewel.foundation.tree.DefaultSelectableLazyColumnKeyActions
import org.jetbrains.jewel.foundation.tree.KeyBindingActions
import org.jetbrains.jewel.foundation.tree.PointerEventActions

/**
 * A composable that displays a scrollable and selectable list of items in
 * a column arrangement.
 */
@Composable
fun SelectableLazyColumn(
    modifier: Modifier = Modifier,
    selectionMode: SelectionMode = SelectionMode.Multiple,
    state: SelectableLazyListState = rememberSelectableLazyListState(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    reverseLayout: Boolean = false,
    onSelectedIndexesChanged: (List<Int>) -> Unit = {},
    verticalArrangement: Arrangement.Vertical = if (!reverseLayout) Arrangement.Top else Arrangement.Bottom,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    keyActions: KeyBindingActions = DefaultSelectableLazyColumnKeyActions(),
    pointerEventActions: PointerEventActions = DefaultSelectableLazyColumnEventAction(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: SelectableLazyListScope.() -> Unit,
) {
    val container = SelectableLazyListScopeContainer()
        .apply(content)

    val keys = remember(container) {
        container.getKeys()
    }
    var isFocused by remember { mutableStateOf(false) }

    fun evaluateIndexes(): List<Int> {
        val keyToIndexMap = keys.withIndex().associateBy({ it.value.key }, { it.index })
        return state.selectedKeys
            .mapNotNull { selected -> keyToIndexMap[selected] }
            .sorted()
    }

    remember(state.selectedKeys) {
        onSelectedIndexesChanged(evaluateIndexes())
    }
    val focusRequester = remember { FocusRequester() }
    LazyColumn(
        modifier = modifier
            .onFocusChanged { isFocused = it.hasFocus }
            .focusRequester(focusRequester)
            .focusable(interactionSource = interactionSource)
            .onPreviewKeyEvent { event ->
                if (state.lastActiveItemIndex != null) {
                    keyActions.handleOnKeyEvent(event, keys, state, selectionMode).invoke(event)
                }
                true
            },
        state = state.lazyListState,
        contentPadding = contentPadding,
        reverseLayout = reverseLayout,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        flingBehavior = flingBehavior,
    ) {
        container.getEntries().forEach { entry ->
            when (entry) {
                is Entry.Item -> item(entry.key, entry.contentType) {
                    val itemScope = SelectableLazyItemScope(
                        isSelected = entry.key in state.selectedKeys,
                        isActive = isFocused,
                    )
                    if (keys.any { it.key == entry.key && it is SelectableLazyListKey.Selectable }) {
                        Box(
                            modifier = Modifier.selectable(
                                requester = focusRequester,
                                keybindings = keyActions.keybindings,
                                actionHandler = pointerEventActions,
                                selectionMode = selectionMode,
                                selectableState = state,
                                allKeys = keys,
                                itemKey = entry.key,
                            ),
                        ) {
                            entry.content.invoke(itemScope)
                        }
                    } else {
                        entry.content.invoke(itemScope)
                    }
                }

                is Entry.Items -> items(
                    count = entry.count,
                    key = { entry.key(entry.startIndex + it) },
                    contentType = { entry.contentType(it) },
                ) { index ->
                    val itemScope = SelectableLazyItemScope(entry.key(index) in state.selectedKeys, isFocused)
                    if (keys.any { it.key == entry.key(index) && it is SelectableLazyListKey.Selectable }) {
                        Box(
                            modifier = Modifier.selectable(
                                requester = focusRequester,
                                keybindings = keyActions.keybindings,
                                actionHandler = pointerEventActions,
                                selectionMode = selectionMode,
                                selectableState = state,
                                allKeys = keys,
                                itemKey = entry.key(index),
                            ),
                        ) {
                            entry.itemContent.invoke(itemScope, index)
                        }
                    } else {
                        entry.itemContent.invoke(itemScope, index)
                    }
                }

                is Entry.StickyHeader -> stickyHeader(entry.key, entry.contentType) {
                    val itemScope = SelectableLazyItemScope(entry.key in state.selectedKeys, isFocused)
                    if (keys.any { it.key == entry.key && it is SelectableLazyListKey.Selectable }) {
                        Box(
                            modifier = Modifier.selectable(
                                keybindings = keyActions.keybindings,
                                actionHandler = pointerEventActions,
                                selectionMode = selectionMode,
                                selectableState = state,
                                allKeys = keys,
                                itemKey = entry.key,
                            ),
                        ) {
                            entry.content.invoke(itemScope)
                        }
                    } else {
                        SelectableLazyItemScope(entry.key in state.selectedKeys, isFocused).apply {
                            entry.content.invoke(itemScope)
                        }
                    }
                }
            }
        }
    }
}

private fun Modifier.selectable(
    requester: FocusRequester? = null,
    keybindings: SelectableColumnKeybindings,
    actionHandler: PointerEventActions,
    selectionMode: SelectionMode,
    selectableState: SelectableLazyListState,
    allKeys: List<SelectableLazyListKey>,
    itemKey: Any,
) = this.pointerInput(allKeys, itemKey) {
    awaitPointerEventScope {
        while (true) {
            val event = awaitPointerEvent()
            when (event.type) {
                PointerEventType.Press -> {
                    requester?.requestFocus()
                    actionHandler.handlePointerEventPress(
                        pointerEvent = event,
                        keyBindings = keybindings,
                        selectableLazyListState = selectableState,
                        selectionMode = selectionMode,
                        allKeys = allKeys,
                        key = itemKey,
                    )
                }
            }
        }
    }
}
