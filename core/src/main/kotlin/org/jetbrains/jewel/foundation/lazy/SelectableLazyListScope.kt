package org.jetbrains.jewel.foundation.lazy

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.focusable
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey.NotSelectable
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey.Selectable

/**
 * Interface defining the scope for building a selectable lazy list.
 */
interface SelectableLazyListScope {

    /**
     * Adds an item to the selectable lazy list.
     *
     * @param key The key that uniquely identifies the item.
     * @param contentType The content type of the item.
     * @param focusable Whether the item is focusable or not.
     * @param selectable Whether the item is selectable or not.
     * @param content The content of the item, specified as a lambda function with a [SelectableLazyItemScope] receiver.
     */
    fun item(
        key: Any,
        contentType: Any? = null,
        selectable: Boolean = true,
        content: @Composable SelectableLazyItemScope.() -> Unit,
    )

    /**
     * Adds multiple items to the selectable lazy list.
     *
     * @param count The number of items to add.
     * @param key A lambda function that provides the key for each item based on the index.
     * @param contentType A lambda function that provides the content type for each item based on the index.
     * @param focusable A lambda function that determines whether each item is focusable based on the index.
     * @param selectable A lambda function that determines whether each item is selectable based on the index.
     * @param itemContent The content of each item, specified as a lambda function with a [SelectableLazyItemScope] receiver and an index parameter.
     */
    fun items(
        count: Int,
        key: (index: Int) -> Any,
        contentType: (index: Int) -> Any? = { null },
        selectable: (index: Int) -> Boolean = { true },
        itemContent: @Composable SelectableLazyItemScope.(index: Int) -> Unit,
    )

    /**
     * Adds a sticky header to the selectable lazy list.
     *
     * @param key The key that uniquely identifies the sticky header.
     * @param contentType The content type of the sticky header.
     * @param focusable Whether the sticky header is focusable or not.
     * @param selectable Whether the sticky header is selectable or not.
     * @param content The content of the sticky header, specified as a lambda function with a [SelectableLazyItemScope] receiver.
     */
    fun stickyHeader(
        key: Any,
        contentType: Any? = null,
        selectable: Boolean = false,
        content: @Composable SelectableLazyItemScope.() -> Unit,
    )
}

internal class SelectableLazyListScopeContainer : SelectableLazyListScope {

    private var entriesCount = 0

    private val keys = mutableListOf<SelectableLazyListKey>()
    private val entries = mutableListOf<Entry>()

    fun getEntries() = entries.toList()
    fun getKeys() = keys.toList()

    internal sealed interface Entry {
        data class Item(
            val key: Any,
            val contentType: Any?,
            val content: @Composable (SelectableLazyItemScope.() -> Unit),
            val index: Int
        ) : Entry
        data class Items(
            val count: Int,
            val key: (index: Int) -> Any,
            val contentType: (index: Int) -> Any?,
            val itemContent: @Composable (SelectableLazyItemScope.(index: Int) -> Unit),
            val startIndex: Int
        ) : Entry
        data class StickyHeader(
            val key: Any,
            val contentType: Any?,
            val content: @Composable (SelectableLazyItemScope.() -> Unit),
            val index: Int
        ) : Entry
    }

//    @Composable
//    private fun Modifier.selectable(selectableKey: SelectableLazyListKey, scope: CoroutineScope = rememberCoroutineScope()) =
//        onPointerEvent(PointerEventType.Press) {
//            pointerEventScopedActions.handlePointerEventPress(it, state.keybindings, scope, selectableKey.key)
//        }

    override fun item(
        key: Any,
        contentType: Any?,
        selectable: Boolean,
        content: @Composable() (SelectableLazyItemScope.() -> Unit),
    ) {
        keys.add(if (selectable) Selectable(key) else NotSelectable(key))
        entries.add(Entry.Item(key, contentType, content, entriesCount))
        entriesCount++
//        val selectableKey = if (selectable) {
//            SelectableLazyListKey.Selectable(key)
//        } else {
//            SelectableLazyListKey.NotSelectable(key)
//        }
////        state.attachKey(selectableKey)
//        delegate.item(selectableKey, contentType) {
//            singleItem(selectableKey, selectable, content)
//        }
    }

//    @Composable
//    private fun LazyItemScope.singleItem(
//        selectableKey: SelectableLazyListKey,
//        selectable: Boolean,
//        content: @Composable (SelectableLazyItemScope.() -> Unit),
//    ) {
//        val isActive = state.isSelectableLazyColumnActive.value
//        val isSelected = selectableKey.key in state.selectedChildren
//        val scope = rememberCoroutineScope()
//        Box(
//            Modifier
//                .then(if (selectable) Modifier.selectable(selectableKey, scope) else Modifier)
//        ) {
//            content(SelectableLazyItemScope(isSelected, isActive))
//        }
//    }

    override fun items(
        count: Int,
        key: (index: Int) -> Any,
        contentType: (index: Int) -> Any?,
        selectable: (index: Int) -> Boolean,
        itemContent: @Composable() (SelectableLazyItemScope.(index: Int) -> Unit),
    ) {
        val selectableKeys: List<SelectableLazyListKey> = List(count) {
            if (selectable(it)) {
                Selectable(key(it))
            } else {
                NotSelectable(key(it))
            }
        }
        keys.addAll(selectableKeys)
        entries.add(Entry.Items(count, key, contentType, itemContent, entriesCount))
        entriesCount = entriesCount + count
//        state.attachKeys(selectableKeys)
//        Log.w("there are ${state.keys.size} keys")
//        Log.w(state.keys.joinToString("\n"))
//        delegate.items(
//            count = count,
//            key = { selectableKeys[it] },
//            itemContent = { index ->
//                if (selectableKeys[index] in state.selectedIdsMap) Log.e("i'm the element with index $index and i'm selected! ")
//                val isActive = state.isSelectableLazyColumnActive.value
//                val isSelected = selectableKeys[index].key in state.selectedIdsMap
//                Box(
//                    Modifier
//                        .then(if (selectable(index)) Modifier.selectable(selectableKeys[index]) else Modifier)
//                ) {
//                    itemContent(SelectableLazyItemScope(isSelected, isActive), index)
//                }
//            }
//        )
    }

    @ExperimentalFoundationApi
    override fun stickyHeader(
        key: Any,
        contentType: Any?,
        selectable: Boolean,
        content: @Composable() (SelectableLazyItemScope.() -> Unit),
    ) {
        keys.add(if (selectable) Selectable(key) else NotSelectable(key))
        entries.add(Entry.StickyHeader(key, contentType, content, entriesCount))
        entriesCount++
//        state.attachKey(selectableKey)
//        delegate.stickyHeader(selectableKey, contentType) {
//            singleItem(selectableKey, selectable, content)
//        }
    }
}

@Composable
fun LazyItemScope.SelectableLazyItemScope(
    isSelected: Boolean = false,
    isActive: Boolean = false
): SelectableLazyItemScope =
    SelectableLazyItemScopeDelegate(this, isSelected, isActive)

internal class SelectableLazyItemScopeDelegate(
    private val delegate: LazyItemScope,
    override val isSelected: Boolean,
    override val isActive: Boolean
) : SelectableLazyItemScope, LazyItemScope by delegate
