package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.lazy.layout.IntervalList
import androidx.compose.foundation.lazy.layout.MutableIntervalList
import androidx.compose.foundation.lazy.layout.getDefaultLazyLayoutKey
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.IntOffset

internal class LazyTableIntervalContent(content: LazyTableScope.() -> LazyTableCells) : LazyTableScope, LazyTableContent {

    private val columnIntervals: MutableIntervalList<LazyTableLineInterval> = MutableIntervalList()

    private val rowIntervals: MutableIntervalList<LazyTableLineInterval> = MutableIntervalList()

    private val cells: LazyTableCells = content()

    override val columnCount: Int
        get() = columnIntervals.size

    override val rowCount: Int
        get() = rowIntervals.size

    override fun columnDefinitions(count: Int, key: ((index: Int) -> Any)?) {
        columnIntervals.addInterval(count, LazyTableLineInterval(key))
    }

    override fun rowDefinitions(count: Int, key: ((index: Int) -> Any)?) {
        rowIntervals.addInterval(count, LazyTableLineInterval(key))
    }

    private inline fun <T, R> IntervalList<T>.withInterval(
        globalIndex: Int,
        block: (localIntervalIndex: Int, content: IntervalList.Interval<T>) -> R,
    ): R {
        val interval = this[globalIndex]
        val localIntervalIndex = globalIndex - interval.startIndex
        return block(localIntervalIndex, interval)
    }

    override fun cells(
        type: (columnKey: Any, rowKey: Any) -> Any?,
        content: @Composable LazyTableItemScope.(columnKey: Any, rowKey: Any) -> Unit,
    ): LazyTableCells {
        return object : LazyTableCells {
            override fun type(columnKey: Any, rowKey: Any): Any? = type(columnKey, rowKey)

            @Composable
            override fun LazyTableItemScope.content(columnKey: Any, rowKey: Any) {
                content(columnKey, rowKey)
            }
        }
    }

    override fun getKey(position: IntOffset): Pair<Any, Any> {
        val columnKey = columnIntervals.withInterval(position.x) { localIntervalIndex, content ->
            content.value.key?.invoke(localIntervalIndex) ?: getDefaultLazyLayoutKey(position.x)
        }
        val rowKey = rowIntervals.withInterval(position.y) { localIntervalIndex, content ->
            content.value.key?.invoke(localIntervalIndex) ?: getDefaultLazyLayoutKey(position.y)
        }

        return columnKey to rowKey
    }

    override fun getKey(index: Int): Pair<Any, Any> = getKey(getPosition(index))

    override fun getContentType(position: IntOffset): Any? {
        val (columnKey, rowKey) = getKey(position)

        return cells.type(columnKey, rowKey)
    }

    override fun getContentType(index: Int): Any? {
        val (columnKey, rowKey) = getKey(index)

        return cells.type(columnKey, rowKey)
    }

    override fun getPosition(index: Int): IntOffset {
        val row = index / columnIntervals.size
        val column = index % columnIntervals.size
        return IntOffset(column, row)
    }

    override fun getIndex(position: IntOffset): Int = position.y * columnIntervals.size + position.x

    @Composable
    override fun Item(scope: LazyTableItemScope, index: Int) {
        val (columnKey, rowKey) = getKey(index)
        with(cells) {
            scope.content(columnKey, rowKey)
        }
    }
}
