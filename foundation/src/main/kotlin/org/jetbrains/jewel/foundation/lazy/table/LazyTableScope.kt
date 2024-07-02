package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Constraints

public interface LazyTableScope {

    public fun columnDefinitions(
        count: Int,
        key: ((index: Int) -> Any)?,
        constraints: (LazyTableLayoutScope.(index: Int) -> Constraints)? = null,
    )

    public fun columnDefinition(key: Any?, constraints: (LazyTableLayoutScope.() -> Constraints)? = null)

    public fun rowDefinitions(
        count: Int,
        key: ((index: Int) -> Any)?,
        constraints: (LazyTableLayoutScope.(index: Int) -> Constraints)? = null,
    )

    public fun rowDefinition(key: Any?, constraints: (LazyTableLayoutScope.() -> Constraints)? = null)

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

@OptIn(ExperimentalFoundationApi::class)
internal class LazyTableDimensionInterval(
    override val key: ((index: Int) -> Any)?,
    val constraints: (LazyTableLayoutScope.(index: Int) -> Constraints)?,
) : LazyLayoutIntervalContent.Interval {

    override val type: (index: Int) -> Any? = { null }
}
