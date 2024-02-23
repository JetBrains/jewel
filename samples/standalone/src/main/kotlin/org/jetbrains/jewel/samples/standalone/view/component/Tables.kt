package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.jetbrains.jewel.foundation.lazy.draggable.draggableItem
import org.jetbrains.jewel.foundation.lazy.draggable.draggableLayout
import org.jetbrains.jewel.foundation.lazy.table.LazyTable
import org.jetbrains.jewel.foundation.lazy.table.LazyTableCellSize
import org.jetbrains.jewel.foundation.lazy.table.fixedHeight
import org.jetbrains.jewel.foundation.lazy.table.rememberLazyTableColumnDraggingState
import org.jetbrains.jewel.foundation.lazy.table.rememberLazyTableRowDraggingState
import org.jetbrains.jewel.foundation.lazy.table.rememberLazyTableState
import org.jetbrains.jewel.foundation.lazy.table.rememberTableHorizontalScrollbarAdapter
import org.jetbrains.jewel.foundation.lazy.table.rememberTableVerticalScrollbarAdapter
import org.jetbrains.jewel.samples.standalone.viewmodel.View
import org.jetbrains.jewel.ui.component.HorizontalScrollbar
import org.jetbrains.jewel.ui.component.LazyTableCell
import org.jetbrains.jewel.ui.component.LazyTableHeader
import org.jetbrains.jewel.ui.component.OutlinedButton
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.VerticalScrollbar

data class RowKey(val row: Int) {

    override fun toString(): String {
        return row.toString()
    }

    override fun equals(other: Any?): Boolean {
        return other is RowKey && other.row == row
    }
}

data class ColumnKey(val column: Int) {

    override fun toString(): String {
        return column.toString()
    }

    override fun equals(other: Any?): Boolean {
        return other is ColumnKey && other.column == column
    }
}

@Composable
@View(title = "Tables", position = 12, icon = "icons/dataTables.svg")
fun Tables() {
    var columns = remember {
        mutableStateListOf<Int>().apply {
            repeat(1000) { add(it) }
        }
    }
    var rows = remember {
        mutableStateListOf<Int>().apply {
            repeat(1000) { add(it) }
        }
    }

    val state = rememberLazyTableState()
    val draggableColumnState = rememberLazyTableColumnDraggingState(
        state,
        onMove = { from, to ->
            columns.add(to, columns.removeAt(from))
        },
    )
    val draggableRowState = rememberLazyTableRowDraggingState(
        state,
        onMove = { from, to ->
            rows.add(to, rows.removeAt(from))
        },
    )

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = { columns.add(columns.size) }) {
            Text("Add column")
        }

        OutlinedButton(onClick = { if (columns.isNotEmpty()) columns.removeLast() }) {
            Text("Remove column")
        }

        OutlinedButton(onClick = { rows.add(rows.size) }) {
            Text("Add row")
        }

        OutlinedButton(onClick = { if (rows.isNotEmpty()) rows.removeLast() }) {
            Text("Remove row")
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = {
            rows.clear()
            columns.clear()
        }) {
            Text("Clear")
        }

        OutlinedButton(onClick = {
            rows.clear()
            columns.clear()
            repeat(1000) {
                rows.add(it)
                columns.add(it)
            }
        }) {
            Text("Init")
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var column by remember { mutableStateOf("") }
        var row by remember { mutableStateOf("") }

        TextField(column, {
            column = it
        })

        TextField(row, {
            row = it
        })

        val coroutine = rememberCoroutineScope()

        OutlinedButton(onClick = {
            coroutine.launch {
                state.scrollToColumn(column.toIntOrNull() ?: 0)
                state.scrollToRow(row.toIntOrNull() ?: 0)
            }
        }) {
            Text("Goto")
        }

        OutlinedButton(onClick = {
            coroutine.launch {
                state.animateScrollToColumn(column.toIntOrNull() ?: 0)
            }
            coroutine.launch {
                state.animateScrollToRow(row.toIntOrNull() ?: 0)
            }
        }) {
            Text("Goto with Animation")
        }
    }

    Box(Modifier.fillMaxSize()) {
        LazyTable(
            modifier = Modifier.draggableLayout(),
            state = state,
            cellSize = LazyTableCellSize.fixedHeight(24.dp, minWidth = 24.dp),
            verticalArrangement = Arrangement.spacedBy(1.dp),
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            pinnedColumns = 1,
            pinnedRows = 1,
        ) {
            columnDefinitions(columns.size) {
                ColumnKey(columns[it])
            }

            rowDefinitions(rows.size) {
                RowKey(rows[it])
            }

            cells { columnKey, rowKey ->
                val column = columnKey as? ColumnKey ?: return@cells
                val row = rowKey as? RowKey ?: return@cells

                if (column.column == columns.first() || row.row == rows.first()) {
                    if (column.column == columns.first() && row.row != rows.first()) {
                        LazyTableHeader(
                            modifier = Modifier.draggableItem(
                                state = draggableColumnState,
                                key = column,
                                draggable = false,
                                orientation = Orientation.Horizontal,
                            ).draggableItem(
                                state = draggableRowState,
                                key = row,
                                orientation = Orientation.Vertical,
                            ),
                        ) {
                            Text("$column, $row", Modifier.align(Alignment.CenterStart), maxLines = 1)
                        }
                    } else {
                        LazyTableHeader(
                            modifier = Modifier.draggableItem(
                                state = draggableColumnState,
                                key = column,
                                orientation = Orientation.Horizontal,
                            ).draggableItem(
                                state = draggableRowState,
                                key = row,
                                draggable = false,
                                orientation = Orientation.Vertical,
                            ),
                        ) {
                            Text("$column, $row", Modifier.align(Alignment.CenterStart), maxLines = 1)
                        }
                    }
                } else {
                    LazyTableCell(
                        modifier = Modifier.draggableItem(
                            state = draggableColumnState,
                            key = column,
                            draggable = false,
                            orientation = Orientation.Horizontal,
                        ).draggableItem(
                            state = draggableRowState,
                            key = row,
                            draggable = false,
                            orientation = Orientation.Vertical,
                        ),
                    ) {
                        Text("$column, $row", Modifier.align(Alignment.CenterStart), maxLines = 1)
                    }
                }
            }
        }

        HorizontalScrollbar(
            rememberTableHorizontalScrollbarAdapter(state),
            Modifier.fillMaxWidth().align(Alignment.BottomStart),
        )

        VerticalScrollbar(
            rememberTableVerticalScrollbarAdapter(state),
            Modifier.fillMaxHeight().align(Alignment.TopEnd),
        )
    }
}
