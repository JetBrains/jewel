package org.jetbrains.jewel.foundation.lazy.table.draggable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.toOffset
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.util.fastFirstOrNull
import org.jetbrains.jewel.foundation.lazy.draggable.LazyLayoutDraggableState
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemInfo
import org.jetbrains.jewel.foundation.lazy.table.LazyTableState
import org.jetbrains.jewel.foundation.lazy.table.rememberLazyTableState

@Composable
public fun rememberLazyTableRowDraggingState(
    tableState: LazyTableState = rememberLazyTableState(),
    onMove: (Any?, Any?) -> Unit,
): LazyTableRowDraggingState {
    return remember(tableState, onMove) {
        LazyTableRowDraggingState(tableState, onMove)
    }
}

@Composable
public fun rememberLazyTableColumnDraggingState(
    tableState: LazyTableState = rememberLazyTableState(),
    onMove: (Any?, Any?) -> Unit,
): LazyTableColumnDraggingState {
    return remember(tableState, onMove) {
        LazyTableColumnDraggingState(tableState, onMove)
    }
}

public abstract class LazyTableDraggableState(
    public val tableState: LazyTableState,
    public val onMove: (Any?, Any?) -> Unit,
) : LazyLayoutDraggableState<LazyTableItemInfo>() {

    protected fun getItemAt(offset: Offset): LazyTableItemInfo? {
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

    override fun moveItem(from: Any?, to: Any?) {
        onMove(from, to)
    }
}

public class LazyTableRowDraggingState(
    tableState: LazyTableState,
    onMove: (Any?, Any?) -> Unit,
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

    override fun getReplacingItem(draggingItem: LazyTableItemInfo): LazyTableItemInfo? {
        if (draggingItemOffsetTransformY > 0) {
            val bottomBorder = draggingItem.offset.y + draggingItem.size.height + draggingItemOffsetTransformY
            val replacingItem = getItemAt(initialOffset.copy(y = bottomBorder)) ?: return null
            val topBorder = replacingItem.offset.y + (replacingItem.size.height / 2)
            if (bottomBorder >= topBorder) return replacingItem
        } else {
            val topBorder = draggingItem.offset.y + draggingItemOffsetTransformY
            val replacingItem = getItemAt(initialOffset.copy(y = topBorder)) ?: return null
            val bottomBorder = replacingItem.offset.y + (replacingItem.size.height / 2)
            if (bottomBorder >= topBorder) return replacingItem
        }
        return null
    }
}

public class LazyTableColumnDraggingState(
    tableState: LazyTableState,
    onMove: (Any?, Any?) -> Unit,
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

    override fun getReplacingItem(draggingItem: LazyTableItemInfo): LazyTableItemInfo? {
        if (draggingItemOffsetTransformX > 0) {
            val rightBorder = draggingItem.offset.x + draggingItem.size.width + draggingItemOffsetTransformX
            val replacingItem = getItemAt(initialOffset.copy(x = rightBorder)) ?: return null
            val leftBorder = replacingItem.offset.x + (replacingItem.size.width / 2)
            if (rightBorder >= leftBorder) return replacingItem
        } else {
            val leftBorder = draggingItem.offset.x + draggingItemOffsetTransformX
            val replacingItem = getItemAt(initialOffset.copy(x = leftBorder)) ?: return null
            val rightBorder = replacingItem.offset.x + (replacingItem.size.width / 2)
            if (rightBorder >= leftBorder) return replacingItem
        }
        return null
    }
}
