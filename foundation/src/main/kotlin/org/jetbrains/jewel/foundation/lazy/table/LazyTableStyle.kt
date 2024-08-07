package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.jewel.foundation.lazy.table.draggable.lazyTableCellDraggingOffset
import org.jetbrains.jewel.foundation.lazy.table.draggable.lazyTableDraggableColumnHeader
import org.jetbrains.jewel.foundation.lazy.table.draggable.lazyTableDraggableRowHeader
import org.jetbrains.jewel.foundation.lazy.table.selectable.TableSelectionUnit
import org.jetbrains.jewel.foundation.lazy.table.selectable.selectableCell

public interface LazyTableStyle {
    @Composable
    public fun LazyTableState.container(
        columnIndex: Int,
        rowIndex: Int,
        columnKey: Any?,
        rowKey: Any?,
        content: @Composable () -> Unit,
    )

    public companion object Default : LazyTableStyle {
        @Composable
        override fun LazyTableState.container(
            columnIndex: Int,
            rowIndex: Int,
            columnKey: Any?,
            rowKey: Any?,
            content: @Composable () -> Unit,
        ) {
            val isPinnedColumn = columnIndex < layoutInfo.pinnedColumns
            val isPinnedRow = rowIndex < layoutInfo.pinnedRows

            val modifier =
                when {
                    (isPinnedColumn == isPinnedRow) && isPinnedRow -> {
                        Modifier.selectableCell(columnKey, rowKey, TableSelectionUnit.All)
                    }

                    (isPinnedColumn == isPinnedRow) && !isPinnedRow -> {
                        Modifier.lazyTableCellDraggingOffset(columnKey, rowKey).selectableCell(columnKey, rowKey)
                    }

                    isPinnedColumn -> {
                        Modifier
                            .lazyTableDraggableRowHeader(rowKey)
                            .selectableCell(columnKey, rowKey, TableSelectionUnit.Row)
                    }

                    else -> {
                        Modifier
                            .lazyTableDraggableColumnHeader(columnKey)
                            .selectableCell(columnKey, rowKey, TableSelectionUnit.Column)
                    }
                }

            LazyTableCellContainer(modifier, content = content)
        }
    }
}
