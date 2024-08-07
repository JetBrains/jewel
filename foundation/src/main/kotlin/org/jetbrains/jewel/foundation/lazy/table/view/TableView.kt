package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope

/**
 * A table view that provides the abstraction of a table content.
 */
public interface TableView {
    /**
     * The number of rows in the table.
     */
    public fun rows(): Int

    /**
     * The number of pinned rows in the table.
     */
    public fun pinnedRows(): Int = 0

    /**
     * The number of columns in the table.
     */
    public fun columns(): Int

    /**
     * The number of pinned columns in the table.
     */
    public fun pinnedColumns(): Int = 0

    /**
     * The key of the row at the given index.
     *
     * @param row the index of the row
     * @return the key of the row
     */
    public fun rowKey(row: Int): Any?

    /**
     * The key of the column at the given index.
     *
     * @param column the index of the column
     * @return the key of the column
     */
    public fun columnKey(column: Int): Any?

    /**
     * The index of the row with the given key.
     *
     * @param key the key of the row
     * @return the index of the row
     */
    public fun rowIndex(key: Any?): Int

    /**
     * The index of the column with the given key.
     *
     * @param key the key of the column
     * @return the index of the column
     */
    public fun columnIndex(key: Any?): Int

    /**
     * The layout constraints of the row with the given key.
     *
     * @param rowKey the key of the row
     * @return the constraints of the row
     */
    public fun LazyTableLayoutScope.rowConstraints(rowKey: Any?): Constraints? = null

    /**
     * The layout constraints of the column with the given key.
     *
     * @param columnKey the key of the column
     * @return the constraints of the column
     */
    public fun LazyTableLayoutScope.columnConstraints(columnKey: Any?): Constraints? = null

    /**
     * The content of the cell at the given row and column.
     *
     * @param rowKey the key of the row
     * @param columnKey the key of the column
     */
    @Composable
    public fun LazyTableItemScope.cell(
        rowKey: Any?,
        columnKey: Any?,
    )

    /**
     * The content of the header cell at the given row and column.
     *
     * @param rowKey the key of the row
     * @param columnKey the key of the column
     */
    public fun cellContentType(
        rowKey: Any?,
        columnKey: Any?,
    ): Any?
}
