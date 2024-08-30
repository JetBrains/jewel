package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.lazy.SelectableLazyColumn
import org.jetbrains.jewel.foundation.lazy.rememberSelectableLazyListState
import org.jetbrains.jewel.foundation.lazy.table.LazyTableCellContainer
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.VerticalScrollbar
import org.jetbrains.jewel.ui.theme.tableStyle
import org.jetbrains.jewel.ui.theme.treeStyle

@Composable
fun LongList() {
    val data =
        remember {
            (1 until 1000).map {
                Order.fake(it)
            }
        }

    Box(Modifier.fillMaxSize()) {
        val listState = rememberSelectableLazyListState()
        SelectableLazyColumn(
            Modifier.fillMaxSize().border(1.dp, JewelTheme.globalColors.borders.normal),
            state = listState,
        ) {
            items(data.size, key = { data[it].id }, selectable = { true }) { orderId ->
                val order = data[orderId]
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Cell(isSelected, order.id.toString(), Modifier.weight(1f))
                    Cell(isSelected, order.transactionId, Modifier.weight(1f))
                    Cell(isSelected, order.uid, Modifier.weight(1f))
                    Cell(isSelected, order.userName, Modifier.weight(1f))
                    Cell(isSelected, order.productId.toString(), Modifier.weight(1f))
                    Cell(isSelected, order.productName, Modifier.weight(1f))
                    Cell(isSelected, order.price, Modifier.weight(1f))
                    Cell(isSelected, order.postalCode, Modifier.weight(1f))
                    Cell(isSelected, order.shippingAddress, Modifier.weight(1f))
                    Cell(isSelected, order.createTime.toString(), Modifier.weight(1f))
                    Cell(isSelected, order.updateTime.toString(), Modifier.weight(1f))
                }
            }
        }

        VerticalScrollbar(
            rememberScrollbarAdapter(listState.lazyListState),
            Modifier.align(Alignment.TopEnd).fillMaxHeight(),
        )
    }
}

@Composable
private fun Cell(
    isSelected: Boolean,
    text: String,
    modifier: Modifier = Modifier,
) {
    LazyTableCellContainer(
        modifier
            .border(1.dp, JewelTheme.tableStyle.colors.gridColor)
            .background(if (isSelected) JewelTheme.tableStyle.colors.backgroundSelected else JewelTheme.tableStyle.colors.background)
            .height(JewelTheme.treeStyle.metrics.elementMinHeight)
            .padding(horizontal = 4.dp),
        contentAlignment = Alignment.CenterStart,
    ) {
        Text(text, overflow = TextOverflow.Ellipsis, maxLines = 1)
    }
}
