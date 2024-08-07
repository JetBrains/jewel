package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope

/**
 * A wrapper of a table view that delegates all the methods to the given table view.
 */
public abstract class DelegatedTableView(
    public val delegate: TableView,
) : TableView {
    override fun rows(): Int = delegate.rows()

    override fun pinnedRows(): Int = delegate.pinnedRows()

    override fun columns(): Int = delegate.columns()

    override fun pinnedColumns(): Int = delegate.pinnedColumns()

    override fun rowKey(row: Int): Any? = delegate.rowKey(row)

    override fun columnKey(column: Int): Any? = delegate.columnKey(column)

    override fun rowIndex(key: Any?): Int = delegate.rowIndex(key)

    override fun columnIndex(key: Any?): Int = delegate.columnIndex(key)

    override fun LazyTableLayoutScope.rowConstraints(rowKey: Any?): Constraints? =
        with(delegate) {
            rowConstraints(rowKey)
        }

    override fun LazyTableLayoutScope.columnConstraints(columnKey: Any?): Constraints? =
        with(delegate) {
            columnConstraints(columnKey)
        }

    @Composable
    override fun LazyTableItemScope.cell(
        rowKey: Any?,
        columnKey: Any?,
    ) {
        with(delegate) {
            cell(rowKey, columnKey)
        }
    }

    override fun cellContentType(
        rowKey: Any?,
        columnKey: Any?,
    ): Any? = delegate.cellContentType(rowKey, columnKey)
}
