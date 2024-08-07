package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import kotlinx.coroutines.launch
import org.jetbrains.jewel.foundation.lazy.table.LazyTable
import org.jetbrains.jewel.foundation.lazy.table.LazyTableItemScope
import org.jetbrains.jewel.foundation.lazy.table.LazyTableLayoutScope
import org.jetbrains.jewel.foundation.lazy.table.rememberLazyTableState
import org.jetbrains.jewel.foundation.lazy.table.rememberTableHorizontalScrollbarAdapter
import org.jetbrains.jewel.foundation.lazy.table.rememberTableVerticalScrollbarAdapter
import org.jetbrains.jewel.foundation.lazy.table.view.ColumnAccessor
import org.jetbrains.jewel.foundation.lazy.table.view.toTableView
import org.jetbrains.jewel.foundation.lazy.table.view.withHeader
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.HorizontalScrollbar
import org.jetbrains.jewel.ui.component.OutlinedButton
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.VerticalScrollbar
import org.jetbrains.jewel.ui.theme.defaultTableStyle
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotations

@Composable
fun TableView() {
    var id by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        val view =
            remember {
                buildList {
                    repeat(1000) {
                        add(Order.fake(id))
                        id++
                    }
                }.toTableView(OrderColumnAccessor) {
                    Constraints(minHeight = 24.dp.roundToPx())
                }
            }

        val viewWithHeader =
            remember(view) {
                view.withHeader("Header")
            }

        val state = rememberLazyTableState()

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OutlinedButton(onClick = {
                view.add(Order.fake(id))
                id++
            }) {
                Text("Add row")
            }

            OutlinedButton(onClick = {
                if (view.isNotEmpty()) {
                    view.removeLast()
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
                view.clear()
            }) {
                Text("Clear")
            }

            OutlinedButton(onClick = {
                view.clear()
                id = 0
                repeat(1000) {
                    view.add(Order.fake(id))
                    id++
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

            val scope = rememberCoroutineScope()

            OutlinedButton(onClick = {
                scope.launch {
                    state.scrollToColumn(column.toIntOrNull() ?: 0)
                    state.scrollToRow(row.toIntOrNull() ?: 0)
                }
            }) {
                Text("Goto")
            }

            OutlinedButton(onClick = {
                scope.launch {
                    state.animateScrollToColumn(column.toIntOrNull() ?: 0)
                }
                scope.launch {
                    state.animateScrollToRow(row.toIntOrNull() ?: 0)
                }
            }) {
                Text("Goto with Animation")
            }
        }

        Box(Modifier.weight(1f).fillMaxWidth().border(1.dp, JewelTheme.globalColors.borders.normal)) {
            LazyTable(
                modifier = Modifier,
                state = state,
                verticalArrangement = Arrangement.spacedBy(1.dp),
                horizontalArrangement = Arrangement.spacedBy(1.dp),
                view = viewWithHeader,
                style = JewelTheme.defaultTableStyle,
            )

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
}

object OrderColumnAccessor : ColumnAccessor<Order> {
    val columns =
        Order::class
            .declaredMemberProperties
            .sortedBy {
                it.findAnnotations<ColumnInfo>().firstOrNull()?.order
            }.toMutableStateList()

    override fun columns(): Int = columns.size

    override fun pinnedColumns(): Int = 1

    override fun LazyTableLayoutScope.columnConstraints(columnKey: Any?): Constraints {
        val info = (columnKey as KProperty<*>).findAnnotations<ColumnInfo>().firstOrNull()

        return Constraints(
            minWidth =
                info
                    ?.minWidth
                    ?.takeIf { it >= 0 }
                    ?.dp
                    ?.roundToPx() ?: 0,
            maxWidth =
                info
                    ?.maxWidth
                    ?.takeIf { it >= 0 }
                    ?.dp
                    ?.roundToPx() ?: Constraints.Infinity,
        )
    }

    override fun columnIndex(key: Any?): Int = columns.indexOf(key)

    override fun columnKey(column: Int): Any = columns[column]

    @Composable
    override fun LazyTableItemScope.cell(
        item: Order,
        columnKey: Any?,
    ) {
        @Suppress("UNCHECKED_CAST")
        val property = columnKey as KProperty1<Order, *>

        Text(
            property.get(item).toString(),
            Modifier.padding(horizontal = 4.dp),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
    }

    @Composable
    override fun LazyTableItemScope.header(
        rowKey: Any?,
        columnKey: Any?,
    ) {
        @Suppress("UNCHECKED_CAST")
        val property = columnKey as KProperty1<Order, *>

        Text(
            property.name,
            Modifier.padding(horizontal = 4.dp),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
    }

    override fun cellContentType(
        item: Order,
        columnKey: Any?,
    ): Any? = columnKey

    @Composable
    override fun supportColumnSorting(): Boolean = true

    override fun canMoveColumn(key: Any?): Boolean = true

    override fun moveColumn(
        fromKey: Any?,
        toKey: Any?,
    ): Boolean {
        val fromIndex = columns.indexOf(fromKey)
        val toIndex = columns.indexOf(toKey)

        if (fromIndex <= 0 || toIndex <= 0) return false

        columns.add(toIndex, columns.removeAt(fromIndex))
        return true
    }
}
