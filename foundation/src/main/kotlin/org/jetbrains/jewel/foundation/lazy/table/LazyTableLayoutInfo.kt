package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize

public interface LazyTableLayoutInfo {

    public val floatingItemsInfo: List<LazyTableItemInfo>

    public val pinnedColumnsInfo: List<LazyTableItemInfo>

    public val pinnedRowsInfo: List<LazyTableItemInfo>

    public val pinnedItemsInfo: List<LazyTableItemInfo>

    public val viewportStartOffset: IntOffset

    public val viewportEndOffset: IntOffset

    public val viewportSize: IntSize get() = IntSize.Zero

    public val viewportCellSize: IntSize get() = IntSize.Zero

    public val columns: Int

    public val rows: Int

    public val pinnedColumns: Int

    public val pinnedRows: Int

    public val pinnedColumnsWidth: Int

    public val pinnedRowsHeight: Int

    public val totalItemsCount: Int get() = columns * rows

    public val horizontalSpacing: Int get() = 0

    public val verticalSpacing: Int get() = 0
}

internal object EmptyLazyTableLayoutInfo : LazyTableLayoutInfo {

    override val floatingItemsInfo: List<LazyTableItemInfo> = emptyList()
    override val pinnedColumnsInfo: List<LazyTableItemInfo> = emptyList()
    override val pinnedRowsInfo: List<LazyTableItemInfo> = emptyList()
    override val pinnedItemsInfo: List<LazyTableItemInfo> = emptyList()
    override val viewportStartOffset: IntOffset = IntOffset.Zero
    override val viewportEndOffset: IntOffset = IntOffset.Zero
    override val columns: Int = 0
    override val rows: Int = 0
    override val pinnedColumns: Int = 0
    override val pinnedRows: Int = 0
    override val pinnedColumnsWidth: Int = 0
    override val pinnedRowsHeight: Int = 0
}
