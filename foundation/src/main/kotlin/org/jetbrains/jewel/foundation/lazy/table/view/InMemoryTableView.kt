package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope
import kotlin.math.abs

/**
 * A table view that stores its content in memory.
 *
 * @param T the type of the content
 * @param initContent the initial content of the table
 * @param columnView the column accessor for the table
 * @param constraints the constraints for the rows
 */
public open class InMemoryTableView<T : Any>(
    initContent: Collection<T> = listOf(),
    private val columnView: ColumnView<T>,
    private val rowKey: (T) -> Any = { it },
    private val constraints: LazyTableLayoutScope.(Any?) -> Constraints?,
) : SortableTableView {
    private val items = initContent.toMutableStateList()

    private val reversedKeyMapping = mutableMapOf<Any, T>()

    private val reversedIndexMapping = mutableMapOf<Any, Int>()

    protected fun generateRowKey(index: Int): Any {
        val item = items[index]
        val key = rowKey(item)
        reversedKeyMapping[key] = item
        reversedIndexMapping[key] = index
        return key
    }

    public val size: Int get() = items.size

    public fun clear() {
        reversedKeyMapping.clear()
        reversedIndexMapping.clear()
        items.clear()
    }

    public operator fun get(index: Int): T = items[index]

    public operator fun set(
        index: Int,
        element: T,
    ): T {
        val item = items[index]
        val oldKey = rowKey(item)
        reversedKeyMapping.remove(oldKey)
        reversedIndexMapping.remove(oldKey)

        items[index] = element
        return element
    }

    public fun isEmpty(): Boolean = items.isEmpty()

    public fun iterator(): MutableIterator<T> =
        object : MutableIterator<T> {
            private var index = 0

            override fun hasNext(): Boolean = index < items.size

            override fun next(): T = get(index++)

            override fun remove() {
                removeAt(index)
            }
        }

    public fun removeAt(index: Int): T {
        val key = rowKey(items[index])
        reversedIndexMapping.remove(key)
        reversedKeyMapping.remove(key)

        return items.removeAt(index)
    }

    public fun remove(element: T): Boolean {
        val key = rowKey(element)
        reversedIndexMapping.remove(key)
        reversedKeyMapping.remove(key)

        return items.remove(element)
    }

    public fun contains(element: T): Boolean = items.contains(element)

    public fun add(
        index: Int,
        element: T,
    ) {
        items.add(index, element)
    }

    public fun add(element: T): Boolean = items.add(element)

    override fun rows(): Int = items.size

    override fun columns(): Int = columnView.columns()

    override fun pinnedColumns(): Int = columnView.pinnedColumns()

    override fun rowKey(row: Int): Any? = generateRowKey(row)

    override fun columnKey(column: Int): Any? = columnView.columnKey(column)

    override fun rowIndex(key: Any?): Int = reversedIndexMapping[key] ?: -1

    override fun columnIndex(key: Any?): Int = columnView.columnIndex(key)

    override fun LazyTableLayoutScope.rowConstraints(rowKey: Any?): Constraints? = this.constraints(rowKey)

    override fun LazyTableLayoutScope.columnConstraints(columnKey: Any?): Constraints? =
        with(columnView) {
            columnConstraints(columnKey)
        }

    @Composable
    override fun LazyTableItemScope.cell(
        rowKey: Any?,
        columnKey: Any?,
    ) {
        with(columnView) {
            val item = reversedKeyMapping[rowKey]
            if (item != null) {
                cell(item, columnKey)
            } else {
                header(rowKey, columnKey)
            }
        }
    }

    override fun cellContentType(
        rowKey: Any?,
        columnKey: Any?,
    ): Any? {
        val item = reversedKeyMapping[rowKey]
        return if (item != null) {
            columnView.cellContentType(item, columnKey)
        } else {
            columnView.headerContentType(rowKey, columnKey)
        }
    }

    @Composable
    override fun supportColumnSorting(): Boolean = columnView.supportColumnSorting()

    @Composable
    override fun supportRowSorting(): Boolean = true

    override fun canMoveColumn(key: Any?): Boolean = columnView.canMoveColumn(key)

    override fun canMoveRow(key: Any?): Boolean = true

    override fun moveColumn(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean = columnView.moveColumn(fromKey, toKey)

    override fun moveRow(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean {
        val fromIndex = reversedIndexMapping[fromKey] ?: return false
        val toIndex = reversedIndexMapping[toKey] ?: return false

        items.add(toIndex, items.removeAt(fromIndex))

        if (abs(fromIndex - toIndex) == 1) {
            reversedIndexMapping.swap(fromKey!!, toKey!!)
        } else {
            val step = if (fromIndex > toIndex) -1 else 1

            var from = fromIndex

            while (from != toIndex) {
                val key = rowKey(items[from])
                reversedIndexMapping[key] = from
                from += step
            }
        }

        return true
    }
}

private fun <K, V> MutableMap<K, V>.swap(
    key1: K,
    key2: K,
) {
    val value1 = this[key1] ?: return
    val value2 = this[key2] ?: return

    this[key1] = value2
    this[key2] = value1
}

private fun <T> MutableList<T>.swap(
    index1: Int,
    index2: Int,
) {
    val value1 = this[index2]
    val value2 = this[index2]

    this[index1] = value2
    this[index2] = value1
}

public fun <T : Any> Collection<T>.toTableView(
    columnView: ColumnView<T>,
    rowConstraints: LazyTableLayoutScope.(Any?) -> Constraints? = { null },
): InMemoryTableView<T> = InMemoryTableView(this, columnView, { it }, rowConstraints)
