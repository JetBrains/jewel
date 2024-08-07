package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.ui.unit.IntOffset
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemKeyPositionMap

internal class TableViewKeyPositionMap(
    val view: TableView,
) : LazyTableItemKeyPositionMap {
    override fun getPosition(key: Any): IntOffset? {
        val (columnKey, rowKey) = key as Pair<*, *>
        val column = view.columnIndex(columnKey)
        val row = view.rowIndex(rowKey)
        return IntOffset(column, row)
    }

    override fun getKey(coordinate: IntOffset): Any? {
        val columnKey = view.columnKey(coordinate.x)
        val rowKey = view.rowKey(coordinate.y)
        return columnKey to rowKey
    }
}
