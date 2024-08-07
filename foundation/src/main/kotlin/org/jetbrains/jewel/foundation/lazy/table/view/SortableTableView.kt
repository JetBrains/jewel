package org.jetbrains.jewel.foundation.lazy.table.view

import androidx.compose.runtime.Composable

/**
 * A table view that provides the drag-and-drop to sort table content functionality.
 */
public interface SortableTableView : TableView {
    @Composable
    public fun supportColumnSorting(): Boolean

    @Composable
    public fun supportRowSorting(): Boolean

    /**
     * Check if the column with the given key can be moved.
     *
     * @param key the key of the column to check
     * @return `true` if the column can be moved, `false` otherwise
     */
    public fun canMoveColumn(key: Any?): Boolean

    /**
     * Check if the row with the given key can be moved.
     *
     * @param key the key of the row to check
     * @return `true` if the row can be moved, `false` otherwise
     */
    public fun canMoveRow(key: Any?): Boolean

    /**
     * Move the column with the given key to the new position.
     *
     * @param fromKey the key of the column to move
     * @param toKey the key of the column to move to
     * @return `true` if the column is moved successfully, `false` otherwise
     */
    public fun moveColumn(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean

    /**
     * Move the row with the given key to the new position.
     *
     * @param fromKey the key of the row to move
     * @param toKey the key of the row to move to
     * @return `true` if the row is moved successfully, `false` otherwise
     */
    public fun moveRow(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean
}
