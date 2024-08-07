package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable

/**
 * A table view that provides table header functionality.
 */
public open class TableViewWithHeader(
    delegateView: TableView,
    protected val headerKey: Any,
) : DelegatedTableView(delegateView) {
    override fun rows(): Int = super.rows() + 1

    override fun pinnedRows(): Int = super.pinnedRows() + 1

    override fun rowKey(row: Int): Any? = if (row == 0) headerKey else super.rowKey(row - 1)

    override fun rowIndex(key: Any?): Int = if (key == headerKey) 0 else super.rowIndex(key) + 1
}

public class SortableTableViewWithHeader(
    delegateView: TableView,
    headerKey: Any,
) : TableViewWithHeader(delegateView, headerKey),
    SortableTableView {
    @Composable
    override fun supportColumnSorting(): Boolean {
        if (delegate !is SortableTableView) return false
        return delegate.supportColumnSorting()
    }

    @Composable
    override fun supportRowSorting(): Boolean {
        if (delegate !is SortableTableView) return false
        return delegate.supportRowSorting()
    }

    override fun canMoveColumn(key: Any?): Boolean {
        if (delegate !is SortableTableView) return false
        return key != headerKey && delegate.canMoveColumn(key)
    }

    override fun canMoveRow(key: Any?): Boolean {
        if (delegate !is SortableTableView) return false
        return key != headerKey && delegate.canMoveRow(key)
    }

    override fun moveColumn(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean {
        if (delegate !is SortableTableView) return false
        return fromKey != headerKey && toKey != headerKey && delegate.moveColumn(fromKey, toKey)
    }

    override fun moveRow(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean {
        if (delegate !is SortableTableView) return false
        return fromKey != headerKey && toKey != headerKey && delegate.moveRow(fromKey, toKey)
    }
}

public fun <T : TableView> T.withHeader(headerKey: Any): TableView =
    when (this) {
        is SortableTableView -> SortableTableViewWithHeader(this, headerKey)
        else -> TableViewWithHeader(this, headerKey)
    }
