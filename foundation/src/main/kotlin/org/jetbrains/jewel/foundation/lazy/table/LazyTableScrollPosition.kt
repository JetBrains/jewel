package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize

internal class LazyTableScrollPosition(
    initialRowIndex: Int = 0,
    initialColumnIndex: Int = 0,
    initialVerticalScrollOffset: Int = 0,
    initialHorizontalScrollOffset: Int = 0,
) {

    var row by mutableIntStateOf(initialRowIndex)

    var column by mutableIntStateOf(initialColumnIndex)

    var verticalScrollOffset by mutableIntStateOf(initialVerticalScrollOffset)
        private set

    var horizontalScrollOffset by mutableIntStateOf(initialHorizontalScrollOffset)
        private set

    private var hadFirstNotEmptyLayout = false

    private var lastKnownFirstItemKey: Any? = null

    val nearestRowRange = LazyTableNearestRangeState(
        initialRowIndex,
        initialRowIndex + 30,
        100,
    )

    val nearestColumnRange = LazyTableNearestRangeState(
        initialColumnIndex,
        initialColumnIndex + 30,
        100,
    )

    fun updateFromMeasureResult(measureResult: LazyTableMeasureResult) {
        lastKnownFirstItemKey = measureResult.firstFloatingCell?.key
        // we ignore the index and offset from measureResult until we get at least one
        // measurement with real items. otherwise the initial index and scroll passed to the
        // state would be lost and overridden with zeros.
        if (hadFirstNotEmptyLayout || measureResult.totalItemsCount > 0) {
            hadFirstNotEmptyLayout = true
            val scrollOffset = measureResult.firstFloatingCellScrollOffset
            check(scrollOffset.x >= 0f && scrollOffset.y >= 0f) { "scrollOffset should be non-negative ($scrollOffset)" }

            val firstRowIndex = measureResult.firstFloatingCell?.row ?: 0
            val firstColumnIndex = measureResult.firstFloatingCell?.column ?: 0
            update(firstColumnIndex, firstRowIndex, measureResult.viewportCellSize, scrollOffset)
        }
    }

    private fun update(column: Int, row: Int, visibleCellSize: IntSize, scrollOffset: IntOffset) {
        require(row >= 0f && column >= 0f) { "Coordinate should be non-negative ($row, $column)" }
        this.row = row
        this.column = column
        nearestColumnRange.update(column, column + visibleCellSize.width)
        nearestRowRange.update(row, row + visibleCellSize.height)
        this.horizontalScrollOffset = scrollOffset.x
        this.verticalScrollOffset = scrollOffset.y
    }

    fun requestColumn(column: Int, scrollOffset: Int) {
        update(column, row, IntSize(50, 50), IntOffset(scrollOffset, verticalScrollOffset))
    }

    fun requestRow(row: Int, scrollOffset: Int) {
        update(column, row, IntSize(50, 50), IntOffset(horizontalScrollOffset, scrollOffset))
    }
}
