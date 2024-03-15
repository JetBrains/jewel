package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.IntOffset

public interface LazyTableContent {

    public val columnCount: Int

    public val rowCount: Int

    public fun getKey(position: IntOffset): Pair<Any, Any>

    public fun getKey(index: Int): Pair<Any, Any>

    public fun getContentType(position: IntOffset): Any?

    public fun getContentType(index: Int): Any?

    public fun getPosition(index: Int): IntOffset

    public fun getIndex(position: IntOffset): Int

    @Composable
    public fun Item(scope: LazyTableItemScope, index: Int)
}
