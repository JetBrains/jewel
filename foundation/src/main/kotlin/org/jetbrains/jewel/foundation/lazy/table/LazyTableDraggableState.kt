package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.toOffset
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.util.fastFirstOrNull
import org.jetbrains.jewel.foundation.lazy.draggable.LazyLayoutDraggableState

@Composable
public fun rememberLazyTableRowDraggingState(
    tableState: LazyTableState = rememberLazyTableState(),
    onMove: (Int, Int) -> Unit,
): LazyTableRowDraggingState {
    return remember(tableState, onMove) {
        LazyTableRowDraggingState(tableState, onMove)
    }
}

@Composable
public fun rememberLazyTableColumnDraggingState(
    tableState: LazyTableState = rememberLazyTableState(),
    onMove: (Int, Int) -> Unit,
): LazyTableColumnDraggingState {
    return remember(tableState, onMove) {
        LazyTableColumnDraggingState(tableState, onMove)
    }
}

public abstract class LazyTableDraggableState(
    public val tableState: LazyTableState,
    public val onMove: (Int, Int) -> Unit,
) : LazyLayoutDraggableState<LazyTableItemInfo>() {

    override fun getItemAt(offset: Offset): LazyTableItemInfo? {
        return tableState.layoutInfo.pinnedColumnsInfo.fastFirstOrNull {
            offset in Rect(it.offset.toOffset(), it.size.toSize())
        } ?: tableState.layoutInfo.pinnedRowsInfo.fastFirstOrNull {
            offset in Rect(it.offset.toOffset(), it.size.toSize())
        } ?: tableState.layoutInfo.pinnedItemsInfo.fastFirstOrNull {
            offset in Rect(it.offset.toOffset(), it.size.toSize())
        }
    }

    override val LazyTableItemInfo.size: Size
        get() = this.size.toSize()

    override val LazyTableItemInfo.offset: Offset
        get() = this.offset.toOffset()

    override fun moveItem(from: Int, to: Int) {
        onMove(from, to)
    }
}

public class LazyTableRowDraggingState(
    tableState: LazyTableState,
    onMove: (Int, Int) -> Unit,
) : LazyTableDraggableState(tableState, onMove) {

    override val LazyTableItemInfo.index: Int
        get() = this.row

    override val LazyTableItemInfo.key: Any?
        get() = (this.key as Pair<Any?, Any?>?)?.second

    override fun getItemWithKey(key: Any): LazyTableItemInfo? {
        return tableState.layoutInfo.pinnedColumnsInfo.fastFirstOrNull {
            (it.key as Pair<Any?, Any?>?)?.second == key
        } ?: tableState.layoutInfo.pinnedRowsInfo.fastFirstOrNull {
            (it.key as Pair<Any?, Any?>?)?.second == key
        } ?: tableState.layoutInfo.pinnedItemsInfo.fastFirstOrNull {
            (it.key as Pair<Any?, Any?>?)?.second == key
        }
    }
}

public class LazyTableColumnDraggingState(
    tableState: LazyTableState,
    onMove: (Int, Int) -> Unit,
) : LazyTableDraggableState(tableState, onMove) {

    override val LazyTableItemInfo.index: Int
        get() = this.column

    override val LazyTableItemInfo.key: Any?
        get() = (this.key as Pair<Any?, Any?>?)?.first

    override fun getItemWithKey(key: Any): LazyTableItemInfo? {
        return tableState.layoutInfo.pinnedColumnsInfo.fastFirstOrNull {
            (it.key as Pair<Any?, Any?>?)?.first == key
        } ?: tableState.layoutInfo.pinnedRowsInfo.fastFirstOrNull {
            (it.key as Pair<Any?, Any?>?)?.first == key
        } ?: tableState.layoutInfo.pinnedItemsInfo.fastFirstOrNull {
            (it.key as Pair<Any?, Any?>?)?.first == key
        }
    }
}
