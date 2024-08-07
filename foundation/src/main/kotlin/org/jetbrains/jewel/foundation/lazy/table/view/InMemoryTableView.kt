package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope
import org.jetbrains.jewel.foundation.lazy.table.selectable.SingleCellSelectionManager
import org.jetbrains.jewel.foundation.lazy.table.selectable.SingleRowSelectionManager
import org.jetbrains.jewel.foundation.lazy.table.selectable.TableSelectionManager

/**
 * A table view that stores its content in memory.
 *
 * @param T the type of the content
 * @param initContent the initial content of the table
 * @param columnAccessor the column accessor for the table
 * @param constraints the constraints for the rows
 */
public open class InMemoryTableView<T>(
    initContent: Iterable<T> = listOf(),
    private val columnAccessor: ColumnAccessor<T>,
    private val constraints: LazyTableLayoutScope.(Any?) -> Constraints?,
    private val selectionManager: TableSelectionManager = SingleRowSelectionManager(),
) : SortableTableView,
    TableSelectionManager by selectionManager,
    MutableList<T> {
    /**
     * The content of the table, the key is the id of the content, it will be wrapped in [RowKey] when used as a key.
     */
    private val contentMap = initContent.withIndex().associate { it.index to it.value }.toMutableMap()

    /**
     * Auto-incremented Id for the content, when new content is added, the id will be incremented.
     * When the content is removed, the id will not be reused except the all content be cleared.
     */
    private var lastId = contentMap.size

    /**
     * The index-id mapping of the content, it is used to keep the order of the content.
     * It is a state list to make the table recompose when the content is changed.
     */
    private val idMapping = contentMap.keys.toMutableStateList()

    override val size: Int get() = idMapping.size

    override fun clear() {
        idMapping.clear()
        contentMap.clear()
        lastId = 0
    }

    override fun get(index: Int): T = contentMap[idMapping[index]] ?: throw IndexOutOfBoundsException()

    override fun isEmpty(): Boolean = idMapping.isEmpty()

    override fun iterator(): MutableIterator<T> =
        object : MutableIterator<T> {
            private var index = 0

            override fun hasNext(): Boolean = index < idMapping.size

            override fun next(): T = get(index++)

            override fun remove() {
                removeAt(index)
            }
        }

    override fun listIterator(): MutableListIterator<T> = listIterator(0)

    override fun listIterator(index: Int): MutableListIterator<T> =
        object : MutableListIterator<T> {
            private var currentIndex = index

            override fun hasNext(): Boolean = currentIndex < idMapping.size

            override fun next(): T = get(currentIndex++)

            override fun hasPrevious(): Boolean = currentIndex > 0

            override fun previous(): T = get(--currentIndex)

            override fun nextIndex(): Int = currentIndex + 1

            override fun previousIndex(): Int = currentIndex - 1

            override fun remove() {
                removeAt(currentIndex)
            }

            override fun set(element: T) {
                set(currentIndex, element)
            }

            override fun add(element: T) {
                add(currentIndex, element)
            }
        }

    override fun removeAt(index: Int): T {
        val key = idMapping.removeAt(index)
        return contentMap.remove(key) ?: throw IndexOutOfBoundsException()
    }

    override fun subList(
        fromIndex: Int,
        toIndex: Int,
    ): MutableList<T> = idMapping.subList(fromIndex, toIndex).map { contentMap[it]!! }.toMutableList()

    override fun set(
        index: Int,
        element: T,
    ): T {
        val key = idMapping[index]
        contentMap[key] = element
        return element
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        val keys = contentMap.keys.filter { key -> contentMap[key] in elements }
        val newContentMap = keys.associateWith { key -> contentMap[key]!! }
        idMapping.clear()
        contentMap.clear()
        contentMap.putAll(newContentMap)
        idMapping.addAll(keys)
        return true
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        val keys = contentMap.keys.filter { key -> contentMap[key] in elements }
        keys.forEach { key ->
            idMapping.remove(key)
            contentMap.remove(key)
        }
        return true
    }

    override fun remove(element: T): Boolean {
        val key = contentMap.entries.find { it.value == element }?.key ?: return false
        idMapping.remove(key)
        contentMap.remove(key)
        return true
    }

    override fun lastIndexOf(element: T): Int = idMapping.indexOfLast { key -> contentMap[key] == element }

    override fun indexOf(element: T): Int = idMapping.indexOfFirst { key -> contentMap[key] == element }

    override fun containsAll(elements: Collection<T>): Boolean = elements.all { element -> contentMap.values.contains(element) }

    override fun contains(element: T): Boolean = contentMap.values.contains(element)

    override fun addAll(elements: Collection<T>): Boolean {
        elements.forEach { add(it) }
        return true
    }

    override fun addAll(
        index: Int,
        elements: Collection<T>,
    ): Boolean {
        elements.forEachIndexed { i, element -> add(index + i, element) }
        return true
    }

    override fun add(
        index: Int,
        element: T,
    ) {
        contentMap[lastId] = element
        idMapping.add(index, lastId)
        lastId++
    }

    override fun add(element: T): Boolean {
        contentMap[lastId] = element
        idMapping.add(lastId)
        lastId++
        return true
    }

    override fun rows(): Int = idMapping.size

    override fun columns(): Int = columnAccessor.columns()

    override fun pinnedColumns(): Int = columnAccessor.pinnedColumns()

    override fun rowKey(row: Int): Any? = RowKey(idMapping[row])

    override fun columnKey(column: Int): Any? = columnAccessor.columnKey(column)

    override fun rowIndex(key: Any?): Int = idMapping.indexOf((key as RowKey).index)

    override fun columnIndex(key: Any?): Int = columnAccessor.columnIndex(key)

    override fun LazyTableLayoutScope.rowConstraints(rowKey: Any?): Constraints? = this.constraints(rowKey)

    override fun LazyTableLayoutScope.columnConstraints(columnKey: Any?): Constraints? =
        with(columnAccessor) {
            columnConstraints(columnKey)
        }

    @Composable
    override fun LazyTableItemScope.cell(
        rowKey: Any?,
        columnKey: Any?,
    ) {
        with(columnAccessor) {
            if (rowKey is RowKey) {
                cell(contentMap[rowKey.index]!!, columnKey)
            } else {
                header(rowKey, columnKey)
            }
        }
    }

    override fun cellContentType(
        rowKey: Any?,
        columnKey: Any?,
    ): Any? {
        if (rowKey is RowKey) {
            return columnAccessor.cellContentType(contentMap[rowKey.index]!!, columnKey)
        }
        return columnAccessor.headerContentType(rowKey, columnKey)
    }

    @Composable
    override fun supportColumnSorting(): Boolean = columnAccessor.supportColumnSorting()

    @Composable
    override fun supportRowSorting(): Boolean = true

    override fun canMoveColumn(key: Any?): Boolean = columnAccessor.canMoveColumn(key)

    override fun canMoveRow(key: Any?): Boolean = true

    override fun moveColumn(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean = columnAccessor.moveColumn(fromKey, toKey)

    override fun moveRow(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean {
        if (fromKey !is RowKey || toKey !is RowKey) return false
        val fromIndex = idMapping.indexOf(fromKey.index)
        val toIndex = idMapping.indexOf(toKey.index)

        idMapping.add(toIndex, idMapping.removeAt(fromIndex))
        return true
    }

    @GenerateDataFunctions
    private class RowKey(
        val index: Int,
    )
}

public fun <T> Iterable<T>.toTableView(
    columnAccessor: ColumnAccessor<T>,
    rowConstraints: LazyTableLayoutScope.(Any?) -> Constraints? = { null },
): InMemoryTableView<T> = InMemoryTableView(this, columnAccessor, rowConstraints)
