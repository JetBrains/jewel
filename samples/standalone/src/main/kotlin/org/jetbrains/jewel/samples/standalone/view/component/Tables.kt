package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import io.github.serpro69.kfaker.faker
import kotlinx.coroutines.launch
import org.jetbrains.jewel.foundation.lazy.draggable.draggableItem
import org.jetbrains.jewel.foundation.lazy.draggable.draggableLayout
import org.jetbrains.jewel.foundation.lazy.table.LazyTable
import org.jetbrains.jewel.foundation.lazy.table.draggable.rememberLazyTableColumnDraggingState
import org.jetbrains.jewel.foundation.lazy.table.draggable.rememberLazyTableRowDraggingState
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
import kotlin.reflect.KProperty
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotations

data class RowKey(val row: Int)

data class ColumnKey(val column: Int)

@Target(AnnotationTarget.PROPERTY)
annotation class ColumnInfo(
    val name: String = "",
    val minWidth: Int = -1,
    val maxWidth: Int = -1,
    val order: Int = 0,
)

data class Order(
    @ColumnInfo(
        name = "ID",
        minWidth = 50,
        order = 0,
    )
    val id: Int,
    @ColumnInfo(
        name = "Transaction ID",
        minWidth = 120,
        order = 1,
    )
    val transactionId: String,
    @ColumnInfo(
        name = "User ID",
        minWidth = 120,
        order = 2,
    )
    val uid: String,
    @ColumnInfo(
        name = "User Name",
        minWidth = 120,
        order = 3,
    )
    val userName: String,
    @ColumnInfo(
        name = "Product ID",
        minWidth = 80,
        order = 4,
    )
    val productId: Int,
    @ColumnInfo(
        name = "Product Name",
        minWidth = 300,
        order = 5,
    )
    val productName: String,
    @ColumnInfo(
        name = "Price",
        minWidth = 80,
        order = 6,
    )
    val price: String,
    @ColumnInfo(
        name = "Shipping Address",
        minWidth = 400,
        order = 8,
    )
    val shippingAddress: String,
    @ColumnInfo(
        name = "Postal Code",
        minWidth = 120,
        order = 7,
    )
    val postalCode: String,
    @ColumnInfo(
        name = "Create Time",
        minWidth = 50,
        order = 9,
    )
    val createTime: Int,
    @ColumnInfo(
        name = "Update Time",
        minWidth = 50,
        order = 10,
    )
    val updateTime: Int,
) {

    companion object {

        private val faker = faker {}
        fun fake(id: Int): Order {
            return Order(
                id = id,
                transactionId = faker.string.letterify("T?????????"),
                uid = faker.string.letterify("U?????????"),
                userName = faker.name.name(),
                productId = faker.random.nextInt(65535),
                productName = faker.book.title(),
                price = faker.money.amount(10..1999),
                shippingAddress = faker.address.fullAddress(),
                postalCode = faker.code.asin(),
                createTime = 0,
                updateTime = 0,
            )
        }
    }
}

@Composable
@View(title = "Tables", position = 12, icon = "icons/dataTables.svg")
fun Tables() {
    val data = remember {
        mutableMapOf<Int, Order>().apply {
            repeat(1000) {
                put(it, Order.fake(it))
            }
        }
    }

    val rows = remember {
        data.keys.toMutableStateList()
    }
    val columns = remember {
        Order::class.declaredMemberProperties.sortedBy {
            it.findAnnotations<ColumnInfo>().firstOrNull()?.order
        }.toMutableStateList()
    }

    val state = rememberLazyTableState()
    val draggableColumnState = rememberLazyTableColumnDraggingState(
        state,
        onMove = { from, to ->
            val fromIndex = columns.indexOf(from).takeIf { it >= 0 } ?: return@rememberLazyTableColumnDraggingState
            val toIndex = columns.indexOf(to).takeIf { it >= 0 } ?: return@rememberLazyTableColumnDraggingState

            columns.add(toIndex, columns.removeAt(fromIndex))
        },
    )
    val draggableRowState = rememberLazyTableRowDraggingState(
        state,
        onMove = { from, to ->
            val fromIndex = rows.indexOf(from).takeIf { it >= 0 } ?: return@rememberLazyTableRowDraggingState
            val toIndex = rows.indexOf(to).takeIf { it >= 0 } ?: return@rememberLazyTableRowDraggingState

            rows.add(toIndex, rows.removeAt(fromIndex))
        },
    )

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = {
            val id = data.size
            data[id] = Order.fake(id)
            rows += id
        }) {
            Text("Add row")
        }

        OutlinedButton(onClick = {
            if (rows.isNotEmpty()) {
                data.remove(rows.removeLast())
            }
        }) {
            Text("Remove row")
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = {
            data.clear()
            rows.clear()
        }) {
            Text("Clear")
        }

        OutlinedButton(onClick = {
            data.clear()
            rows.clear()
            repeat(1000) {
                data[it] = Order.fake(it)
            }
            rows += data.keys
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
            verticalArrangement = Arrangement.spacedBy(1.dp),
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            pinnedColumns = 1,
            pinnedRows = 1,
        ) {
            columnDefinitions(columns.size, {
                columns[it]
            }) {
                val info = columns[it].findAnnotations<ColumnInfo>().firstOrNull()
                Constraints(
                    minWidth = info?.minWidth?.takeIf { it >= 0 }?.dp?.roundToPx() ?: 0,
                    maxWidth = info?.maxWidth?.takeIf { it >= 0 }?.dp?.roundToPx() ?: Constraints.Infinity,
                )
            }

            rowDefinition("Header") {
                Constraints(minHeight = 24.dp.roundToPx())
            }

            rowDefinitions(rows.size, {
                rows[it]
            }) {
                Constraints(minHeight = 24.dp.roundToPx())
            }

            cells { columnKey, rowKey ->
                val column = columnKey as KProperty<*>
                if (rowKey == "Header") {
                    val draggable = if (column.name == "id") {
                        Modifier
                    } else {
                        Modifier.draggableItem(
                            state = draggableColumnState,
                            key = columnKey,
                            orientation = Orientation.Horizontal,
                        ).draggableItem(
                            state = draggableRowState,
                            key = rowKey,
                            draggable = false,
                            orientation = Orientation.Vertical,
                        )
                    }
                    LazyTableHeader(
                        modifier = draggable,
                        contentAlignment = Alignment.CenterStart,
                    ) {
                        val info = column.findAnnotations<ColumnInfo>().firstOrNull()
                        Text(info?.name ?: column.name, Modifier.padding(horizontal = 4.dp), maxLines = 1)
                    }
                } else {
                    val draggable = if (column.name == "id") {
                        Modifier.draggableItem(
                            state = draggableRowState,
                            key = rowKey,
                            orientation = Orientation.Vertical,
                        )
                    } else {
                        Modifier.draggableItem(
                            state = draggableColumnState,
                            key = columnKey,
                            draggable = false,
                            orientation = Orientation.Horizontal,
                        ).draggableItem(
                            state = draggableRowState,
                            key = rowKey,
                            draggable = false,
                            orientation = Orientation.Vertical,
                        )
                    }

                    LazyTableCell(
                        modifier = draggable,
                        contentAlignment = Alignment.CenterEnd,
                    ) {
                        Text(
                            column.getter.call(data[rowKey as Int]).toString(),
                            Modifier.padding(horizontal = 4.dp),
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1,
                        )
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
