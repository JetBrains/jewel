package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import org.jetbrains.jewel.foundation.lazy.table.LazyTableContent
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableState
import org.jetbrains.jewel.foundation.lazy.table.LazyTableStyle

internal class LazyTableViewContent(
    private val state: LazyTableState,
    private val style: LazyTableStyle,
    private val tableView: TableView,
) : LazyTableContent {
    override val columnCount: Int
        get() = tableView.columns()

    override val rowCount: Int
        get() = tableView.rows()

    override fun getKey(position: IntOffset): Pair<Any, Any> {
        val columnKey = tableView.columnKey(position.x)!!
        val rowKey = tableView.rowKey(position.y)!!

        return columnKey to rowKey
    }

    override fun getKey(index: Int): Pair<Any, Any> = getKey(getPosition(index))

    override fun LazyTableLayoutScope.getColumnConstraints(column: Int): Constraints? =
        with(tableView) {
            columnConstraints(tableView.columnKey(column))
        }

    override fun LazyTableLayoutScope.getRowConstraints(row: Int): Constraints? =
        with(tableView) {
            rowConstraints(tableView.rowKey(row))
        }

    override fun getContentType(position: IntOffset): Any? {
        val (columnKey, rowKey) = getKey(position)
        return tableView.cellContentType(rowKey, columnKey)
    }

    override fun getContentType(index: Int): Any? {
        val (columnKey, rowKey) = getKey(index)

        return tableView.cellContentType(rowKey, columnKey)
    }

    override fun getPosition(index: Int): IntOffset {
        val row = index / columnCount
        val column = index % columnCount
        return IntOffset(column, row)
    }

    override fun getIndex(position: IntOffset): Int = position.y * columnCount + position.x

    @Composable
    override fun Item(
        scope: LazyTableItemScope,
        index: Int,
    ) {
        val position = getPosition(index)
        val (columnKey, rowKey) = getKey(position)
        with(style) {
            state.container(position.x, position.y, columnKey, rowKey) {
                with(tableView) {
                    scope.cell(rowKey, columnKey)
                }
            }
        }
    }
}
