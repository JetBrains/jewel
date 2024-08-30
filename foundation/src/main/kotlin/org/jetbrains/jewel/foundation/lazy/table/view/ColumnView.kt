package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope

public interface ColumnView<T> {
    public fun columns(): Int

    public fun pinnedColumns(): Int

    public fun columnKey(column: Int): Any?

    public fun columnIndex(key: Any?): Int

    public fun LazyTableLayoutScope.columnConstraints(columnKey: Any?): Constraints?

    @Composable
    public fun LazyTableItemScope.cell(
        item: T,
        columnKey: Any?,
    )

    @Composable
    public fun LazyTableItemScope.header(
        rowKey: Any?,
        columnKey: Any?,
    ) {
    }

    @Composable
    public fun supportColumnSorting(): Boolean = false

    /**
     * Check if the column with the given key can be moved.
     *
     * @param key the key of the column to check
     * @return `true` if the column can be moved, `false` otherwise
     */
    public fun canMoveColumn(key: Any?): Boolean = false

    public fun moveColumn(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean = false

    public fun cellContentType(
        item: T,
        columnKey: Any?,
    ): Any?

    public fun headerContentType(
        rowKey: Any?,
        columnKey: Any?,
    ): Any? = null
}
