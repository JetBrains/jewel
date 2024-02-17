package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.jetbrains.jewel.foundation.lazy.table.LazyTable
import org.jetbrains.jewel.foundation.lazy.table.LazyTableCellSize
import org.jetbrains.jewel.foundation.lazy.table.fixedHeight
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

@Composable
@View(title = "Tables", position = 12, icon = "icons/dataTables.svg")
fun Tables() {
    var columns by remember { mutableStateOf(1000) }
    var rows by remember { mutableStateOf(1000) }
    val state = rememberLazyTableState()

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = { columns++ }) {
            Text("Add column")
        }

        OutlinedButton(onClick = { if (columns > 0) columns-- }) {
            Text("Remove column")
        }

        OutlinedButton(onClick = { rows++ }) {
            Text("Add row")
        }

        OutlinedButton(onClick = { if (rows > 0) rows-- }) {
            Text("Remove row")
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = {
            rows = 0
            columns = 0
        }) {
            Text("Clear")
        }

        OutlinedButton(onClick = {
            rows = 1000
            columns = 1000
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
            modifier = Modifier,
            state = state,
            cellSize = LazyTableCellSize.fixedHeight(24.dp, minWidth = 24.dp),
            verticalArrangement = Arrangement.spacedBy(1.dp),
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            pinnedColumns = 1,
            pinnedRows = 1,
        ) {
            columnDefinitions(columns) {
                it
            }

            rowDefinitions(rows) {
                it
            }

            cells { columnKey, rowKey ->
                val column = columnKey as? Int ?: return@cells
                val row = rowKey as? Int ?: return@cells

                if (column == 1 || row == 1) {
                    LazyTableHeader {
                        Text("$column, $row", Modifier.align(Alignment.CenterStart), maxLines = 1)
                    }
                } else {
                    LazyTableCell {
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
