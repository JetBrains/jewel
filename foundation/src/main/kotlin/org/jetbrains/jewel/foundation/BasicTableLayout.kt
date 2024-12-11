package org.jetbrains.jewel.foundation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A simple table that sizes columns to take as much room as they need. If the horizontal space available is less than
 * what the cells would take, all columns are sized proportionally to their intrinsic width so that they still can fit
 * the available width.
 *
 * Cells **must** only contain one top-level component. If you need your cells to contain more than one, wrap your cell
 * content in a [`Box`][androidx.compose.foundation.layout.Box], [`Column`][androidx.compose.foundation.layout.Column],
 * [`Row`][androidx.compose.foundation.layout.Row], etc.
 *
 * Incoming height constraints are ignored. The table will always take up as much vertical room as it needs. If you want
 * to constrain the table height consider wrapping it in a
 * [`VerticallyScrollableContainer`][org.jetbrains.jewel.ui.component.VerticallyScrollableContainer].
 *
 * @param rowCount The number of rows this table has.
 * @param columnCount The number of columns this table has.
 * @param cellBorderColor The color of the cell borders. Set to
 *   [`Color.Unspecified`][androidx.compose.ui.graphics.Color.Companion.Unspecified] to avoid drawing the borders — in
 *   which case, the [cellBorderWidth] acts as a padding.
 * @param modifier Modifier to apply to the table.
 * @param cellBorderWidth The width of the table's borders.
 * @param rows The rows that make up the table. Each row is a list of composables, one per row cell.
 */
@Suppress("KDocUnresolvedReference")
@Composable
public fun BasicTableLayout(
    rowCount: Int,
    columnCount: Int,
    cellBorderColor: Color,
    modifier: Modifier = Modifier.Companion,
    cellBorderWidth: Dp = 1.dp,
    rows: List<List<@Composable () -> Unit>>,
) {
    SubcomposeLayout(modifier = modifier) { incomingConstraints ->
        require(rows.size == rowCount) { "Found ${rows.size} rows, but expected $rowCount." }

        var intrinsicColumnWidths = IntArray(columnCount)
        val measurables =
            rows.mapIndexed { rowIndex, row ->
                require(row.size == columnCount) {
                    "Row $rowIndex contains ${row.size} cells, but it should have $columnCount cells."
                }

                row.mapIndexed { columnIndex, cell ->
                    // Subcompose each cell individually
                    val measurable =
                        subcompose(CellCoordinates(rowIndex, columnIndex)) { cell() }.singleOrNull()
                            ?: error(
                                "Cells can only contain one component, " +
                                    "but cell ($rowIndex, $columnIndex) had zero or more than one"
                            )

                    // Store the intrinsic width for each column, assuming we have infinite
                    // vertical space available to display each cell (which we do)
                    val intrinsicCellWidth = measurable.maxIntrinsicWidth(Int.MAX_VALUE)
                    intrinsicColumnWidths[columnIndex] =
                        intrinsicColumnWidths[columnIndex].coerceAtLeast(intrinsicCellWidth)

                    measurable
                }
            }

        // The available width we can assign to cells is equal to the max width from the incoming
        // constraints, minus the vertical borders applied between columns and to the sides of the table
        val cellBorderWidthPx = cellBorderWidth.roundToPx()
        val totalHorizontalBordersWidth = cellBorderWidthPx * (columnCount + 1)
        val minTableIntrinsicWidth = intrinsicColumnWidths.sum() + totalHorizontalBordersWidth
        val availableWidth = incomingConstraints.maxWidth

        // We want to size the columns as a ratio of their intrinsic size to the available width
        // if there is not enough room to show them all, or as their intrinsic width if they all fit
        val columnWidths = IntArray(columnCount)
        var tableWidth = 0
        if (minTableIntrinsicWidth <= availableWidth) {
            // We have enough room for all columns, use intrinsic column sizes
            intrinsicColumnWidths.copyInto(columnWidths)
            tableWidth = minTableIntrinsicWidth
        } else {
            // We can't fit all columns in the available width; set their size proportionally
            // to the intrinsic width, so they all fit within the available horizontal space
            val scaleRatio = availableWidth.toFloat() / minTableIntrinsicWidth
            for (i in 0 until columnCount) {
                // By truncating the decimal side, we may end up a few pixels short than the
                // available width, but at least we're never exceeding it.
                columnWidths[i] = (intrinsicColumnWidths[i] * scaleRatio).toInt()
                tableWidth += columnWidths[i]
            }
            tableWidth += totalHorizontalBordersWidth
        }

        // The height of each row is the maximum intrinsic height of their cells, calculated from
        // the (possibly scaled) intrinsic column widths we just computed
        var tableHeight = 0
        val rowHeights =
            measurables.map { rowMeasurables ->
                val rowHeight =
                    rowMeasurables
                        .mapIndexed { columnIndex, cellMeasurable ->
                            val columnWidth = columnWidths[columnIndex]
                            cellMeasurable.maxIntrinsicHeight(columnWidth)
                        }
                        .max()

                tableHeight += rowHeight
                rowHeight
            }

        // Add the horizontal borders drawn between rows and on top and bottom of the table
        tableHeight += cellBorderWidthPx * (rowCount + 1)

        // Measure all cells, using the fixed constraints we calculated for each row and column
        val placeables =
            measurables.mapIndexed { rowIndex, cellMeasurables ->
                cellMeasurables.mapIndexed { columnIndex, cellMeasurable ->
                    val cellConstraints = Constraints.Companion.fixed(columnWidths[columnIndex], rowHeights[rowIndex])
                    cellMeasurable.measure(cellConstraints)
                }
            }

        layout(tableWidth, tableHeight) {
            // Place cells. We start by leaving space for the top and start-side borders
            var y = cellBorderWidthPx

            placeables.forEachIndexed { rowIndex, cellPlaceables ->
                var x = cellBorderWidthPx

                var rowHeight = 0
                cellPlaceables.forEach { cellPlaceable ->
                    cellPlaceable.placeRelative(x, y)
                    x += cellBorderWidthPx
                    x += cellPlaceable.width
                    rowHeight = cellPlaceable.height.coerceAtLeast(rowHeight)
                }

                y += cellBorderWidthPx
                y += rowHeight
            }

            // Compose and draw the borders.
            subcompose("table borders") { TableBorders(cellBorderColor, cellBorderWidth, rowHeights, columnWidths) }
                .single()
                .measure(Constraints.Companion.fixed(tableWidth, tableHeight))
                .placeRelative(0, 0)
        }
    }
}

@Composable
private fun TableBorders(cellBorderColor: Color, cellBorderWidth: Dp, rowHeights: List<Int>, columnWidths: IntArray) {
    Box(
        modifier =
            Modifier.Companion.drawBehind {
                val borderWidthPx = cellBorderWidth.toPx()
                val halfBorderWidthPx = borderWidthPx / 2f

                // First, draw the outer border
                drawRect(
                    color = cellBorderColor,
                    topLeft = Offset(halfBorderWidthPx, halfBorderWidthPx),
                    size = Size(size.width - borderWidthPx, size.height - borderWidthPx),
                    style = Stroke(width = borderWidthPx),
                )

                // Then, draw all horizontal borders below rows.
                // No need to draw the last horizontal border as it's covered by the border rect
                var y = halfBorderWidthPx
                val endX = size.width - borderWidthPx

                for (i in 0 until rowHeights.lastIndex) {
                    y += rowHeights[i].toFloat() + borderWidthPx
                    drawLine(
                        color = cellBorderColor,
                        start = Offset(halfBorderWidthPx, y),
                        end = Offset(endX, y),
                        strokeWidth = borderWidthPx,
                    )
                }

                // Lastly, draw all vertical borders to the end of columns
                // (minus the last one, as before)
                var x = halfBorderWidthPx
                val endY = size.height - borderWidthPx

                for (i in 0 until columnWidths.lastIndex) {
                    x += columnWidths[i].toFloat() + borderWidthPx
                    drawLine(
                        color = cellBorderColor,
                        start = Offset(x, halfBorderWidthPx),
                        end = Offset(x, endY),
                        strokeWidth = borderWidthPx,
                    )
                }
            }
    )
}

internal data class CellCoordinates(val rowIndex: Int, val columnIndex: Int)
