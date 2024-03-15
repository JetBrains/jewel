package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
import androidx.compose.runtime.Composable

public interface LazyTableScope {

    public fun columnDefinitions(count: Int, key: ((index: Int) -> Any)?)

    public fun rowDefinitions(count: Int, key: ((index: Int) -> Any)?)

    public fun cells(
        type: (columnKey: Any, rowKey: Any) -> Any? = { _, _ -> null },
        content: @Composable LazyTableItemScope.(columnKey: Any, rowKey: Any) -> Unit,
    ): LazyTableCells
}

public interface LazyTableCells {

    public fun type(columnKey: Any, rowKey: Any): Any?

    @Composable
    public fun LazyTableItemScope.content(columnKey: Any, rowKey: Any)
}

public fun LazyTableScope.columnDefinition(key: Any) {
    columnDefinitions(1) { key }
}

public fun LazyTableScope.rowDefinition(key: Any) {
    rowDefinitions(1) { key }
}

@OptIn(ExperimentalFoundationApi::class)
internal class LazyTableLineInterval(
    override val key: ((index: Int) -> Any)?,
) : LazyLayoutIntervalContent.Interval {

    override val type: (index: Int) -> Any? = { null }
}
