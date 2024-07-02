package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import kotlin.math.max

internal abstract class LazyTableMeasuredItemProvider(
    override val availableSize: IntSize,
    override val columns: Int,
    override val rows: Int,
    override val horizontalSpacing: Int,
    override val verticalSpacing: Int,
    private val itemProvider: LazyTableItemProvider,
    private val measureScope: LazyLayoutMeasureScope,
    density: Density,
) : LazyTableLayoutScope, Density by density {
    private val cachedColumnConstraints = HashMap<Int, Constraints>(100)
    private val cachedRowConstraints = HashMap<Int, Constraints>(100)

    private val measuredItems = HashMap<IntOffset, LazyTableMeasuredItem>(500)

    private fun getCellConstraints(column: Int, row: Int): Constraints = with(itemProvider) {
        val rowConstraints = if (column == 0) {
            cachedRowConstraints.getOrPut(row) {
                getRowConstraints(row) ?: Constraints()
            }
        } else {
            Constraints.fixedHeight(getRowHeight(row))
        }
        val columnConstraints = if (row == 0) {
            cachedColumnConstraints.getOrPut(column) {
                getColumnConstraints(column) ?: Constraints()
            }
        } else {
            Constraints.fixedWidth(getColumnWidth(column))
        }

        Constraints(
            minWidth = columnConstraints.minWidth,
            maxWidth = columnConstraints.maxWidth,
            minHeight = rowConstraints.minHeight,
            maxHeight = rowConstraints.maxHeight,
        )
    }

    private fun getOrMeasureColumnHeader(column: Int): Int = measuredItems.getOrPut(IntOffset(column, 0)) {
        getAndMeasure(column, 0, getCellConstraints(column, 0))
    }.size.width

    private fun getOrMeasureRowHeader(row: Int): Int = measuredItems.getOrPut(IntOffset(0, row)) {
        getAndMeasure(0, row, getCellConstraints(0, row))
    }.size.height

    private fun getAndMeasure(column: Int, row: Int, constraints: Constraints): LazyTableMeasuredItem {
        val coordinate = IntOffset(column, row)
        val index = itemProvider.getIndex(coordinate)
        val key = itemProvider.getKey(coordinate)
        val contentType = itemProvider.getContentType(coordinate)
        val placeables = measureScope.measure(index, constraints)

        var maxWidth = 0
        var maxHeight = 0

        for (placeable in placeables) {
            maxWidth = max(placeable.width, maxWidth)
            maxHeight = max(placeable.height, maxHeight)
        }

        return createItem(coordinate.x, coordinate.y, IntSize(maxWidth, maxHeight), key, contentType, placeables)
    }

    fun getAndMeasure(column: Int, row: Int): LazyTableMeasuredItem {
        val width = getOrMeasureColumnHeader(column)
        val height = getOrMeasureRowHeader(row)

        return measuredItems.getOrPut(IntOffset(column, row)) {
            getAndMeasure(column, row, Constraints.fixed(width, height))
        }
    }

    fun getAndMeasureOrNull(column: Int, row: Int): LazyTableMeasuredItem? {
        if (column >= columns - 1 || row >= rows - 1) {
            return null
        }

        return getAndMeasure(column, row)
    }

    fun getRowHeight(row: Int): Int = getAndMeasure(0, row).size.height

    fun getColumnWidth(column: Int): Int = getAndMeasure(column, 0).size.width

    val keyPositionMap: LazyTableItemKeyPositionMap get() = itemProvider.keyPositionMap

    abstract fun createItem(
        column: Int,
        row: Int,
        size: IntSize,
        key: Any,
        contentType: Any?,
        placeables: List<Placeable>,
    ): LazyTableMeasuredItem
}
