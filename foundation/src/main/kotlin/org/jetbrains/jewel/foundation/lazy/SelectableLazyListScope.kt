package org.jetbrains.jewel.foundation.lazy

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey.NotSelectable
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey.Selectable

/** Interface defining the scope for building a selectable lazy list. */
interface SelectableLazyListScope {

    /**
     * Represents an item in a selectable lazy list.
     * By default [selectionKey] = [itemKey], but you can assign [itemKey] if you need to
     * recompose the item while keeping the selection unchanged.
     *
     * @param selectionKey The unique identifier for the item used for selection.
     * @param itemKey The unique identifier for the item used for triggering recompositions.
     * @param contentType The type of content displayed in the item.
     * @param selectable Determines if the item is selectable. Default is
     *     `true`.
     * @param content The content of the item as a composable function.
     */
    fun item(
        selectionKey: Any,
        itemKey: Any = selectionKey,
        contentType: Any? = null,
        selectable: Boolean = true,
        content: @Composable SelectableLazyItemScope.() -> Unit,
    )

    /**
     * Represents a list of items based on the provided parameters.
     * By default [selectionKey] = [itemKey], but you can assign [itemKey] if you need to
     * recompose the item while keeping the selection unchanged.
     *
     * @param count The number of items in the list.
     * @param selectionKey A function that generates a unique key for each item based on
     *     its index. It is used for selection.
     * @param itemKey A function that generates a unique key for each item based on
     *    its index. It is used for triggering recompositions.
     * @param contentType A function that returns the content type of an item
     *     based on its index. Defaults to `null`.
     * @param selectable A function that determines if an item is selectable
     *     based on its index. Defaults to `true`.
     * @param itemContent The content of each individual item, specified as a
     *     composable function that takes the item's index as a parameter.
     */
    fun items(
        count: Int,
        selectionKey: (index: Int) -> Any,
        itemKey: (index: Int) -> Any = selectionKey,
        contentType: (index: Int) -> Any? = { null },
        selectable: (index: Int) -> Boolean = { true },
        itemContent: @Composable SelectableLazyItemScope.(index: Int) -> Unit,
    )

    /**
     * A method that enables sticky header behavior in a list or grid view.
     * By default [selectionKey] = [itemKey], but you can assign [itemKey] if you need to
     * recompose the item while keeping the selection unchanged.
     *
     * @param selectionKey The unique identifier for the sticky header used for selection.
     * @param itemKey The unique identifier for the sticky header used for triggering recompositions.
     * @param contentType The type of content in the sticky header.
     * @param selectable Specifies whether the sticky header is selectable.
     * @param content The content to be displayed in the sticky header,
     *     provided as a composable function
     */
    fun stickyHeader(
        selectionKey: Any,
        itemKey: Any = selectionKey,
        contentType: Any? = null,
        selectable: Boolean = false,
        content: @Composable SelectableLazyItemScope.() -> Unit,
    )
}

internal class SelectableLazyListScopeContainer : SelectableLazyListScope {

    private var entriesCount = 0

    private val selectionKeys = mutableListOf<SelectableLazyListKey>()
    private val entries = mutableListOf<Entry>()

    fun getEntries() = entries.toList()
    fun getSelectionKeys() = selectionKeys.toList()

    internal sealed interface Entry {
        data class Item(
            val selectionKey: Any,
            val uiKey: Any,
            val contentType: Any?,
            val content: @Composable (SelectableLazyItemScope.() -> Unit),
            val index: Int,
        ) : Entry

        data class Items(
            val count: Int,
            val selectionKey: (index: Int) -> Any,
            val uiKey: (index: Int) -> Any,
            val contentType: (index: Int) -> Any?,
            val itemContent: @Composable (SelectableLazyItemScope.(index: Int) -> Unit),
            val startIndex: Int,
        ) : Entry

        data class StickyHeader(
            val selectionKey: Any,
            val uiKey: Any,
            val contentType: Any?,
            val content: @Composable (SelectableLazyItemScope.() -> Unit),
            val index: Int,
        ) : Entry
    }

    override fun item(
        selectionKey: Any,
        itemKey: Any,
        contentType: Any?,
        selectable: Boolean,
        content: @Composable (SelectableLazyItemScope.() -> Unit),
    ) {
        selectionKeys.add(if (selectable) Selectable(selectionKey) else NotSelectable(selectionKey))
        entries.add(Entry.Item(selectionKey, itemKey, contentType, content, entriesCount))
        entriesCount++
    }

    override fun items(
        count: Int,
        selectionKey: (index: Int) -> Any,
        itemKey: (index: Int) -> Any,
        contentType: (index: Int) -> Any?,
        selectable: (index: Int) -> Boolean,
        itemContent: @Composable (SelectableLazyItemScope.(index: Int) -> Unit),
    ) {
        val selectableKeys: List<SelectableLazyListKey> = List(count) {
            if (selectable(it)) {
                Selectable(selectionKey(it))
            } else {
                NotSelectable(selectionKey(it))
            }
        }
        selectionKeys.addAll(selectableKeys)
        entries.add(Entry.Items(count, selectionKey, itemKey, contentType, itemContent, entriesCount))
        entriesCount += count
    }

    @ExperimentalFoundationApi
    override fun stickyHeader(
        selectionKey: Any,
        itemKey: Any,
        contentType: Any?,
        selectable: Boolean,
        content: @Composable (SelectableLazyItemScope.() -> Unit),
    ) {
        selectionKeys.add(if (selectable) Selectable(selectionKey) else NotSelectable(selectionKey))
        entries.add(Entry.StickyHeader(selectionKey, itemKey, contentType, content, entriesCount))
        entriesCount++
    }
}

fun <T : Any> SelectableLazyListScope.items(
    items: List<T>,
    selectionKey: (item: T) -> Any = { it },
    itemKey: (item: T) -> Any = selectionKey,
    contentType: (item: T) -> Any? = { it },
    selectable: (item: T) -> Boolean = { true },
    itemContent: @Composable SelectableLazyItemScope.(item: T) -> Unit,
) {
    items(
        count = items.size,
        selectionKey = { selectionKey(items[it]) },
        itemKey = { itemKey(items[it]) },
        contentType = { contentType(items[it]) },
        selectable = { selectable(items[it]) },
        itemContent = { itemContent(items[it]) },
    )
}

fun <T : Any> SelectableLazyListScope.itemsIndexed(
    items: List<T>,
    selectionKey: (index: Int, item: T) -> Any = { _, item -> item },
    itemKey: (index: Int, item: T) -> Any = selectionKey,
    contentType: (index: Int, item: T) -> Any? = { _, item -> item },
    selectable: (index: Int, item: T) -> Boolean = { _, _ -> true },
    itemContent: @Composable SelectableLazyItemScope.(index: Int, item: T) -> Unit,
) {
    items(
        count = items.size,
        selectionKey = { selectionKey(it, items[it]) },
        itemKey = { itemKey(it, items[it]) },
        contentType = { contentType(it, items[it]) },
        selectable = { selectable(it, items[it]) },
        itemContent = { itemContent(it, items[it]) },
    )
}

@Composable
fun LazyItemScope.SelectableLazyItemScope(
    isSelected: Boolean,
    isActive: Boolean,
): SelectableLazyItemScope =
    SelectableLazyItemScopeDelegate(this, isSelected, isActive)

internal class SelectableLazyItemScopeDelegate(
    private val delegate: LazyItemScope,
    override val isSelected: Boolean,
    override val isActive: Boolean,
) : SelectableLazyItemScope, LazyItemScope by delegate
