package org.jetbrains.jewel.foundation.lazy.table.selectable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionManager

public interface TableSelectionManager : SelectionManager {
    public fun isSelectable(
        columnKey: Any?,
        rowKey: Any?,
    ): Boolean

    override fun isSelectable(itemKey: Any?): Boolean {
        if (itemKey is Pair<*, *>) {
            return isSelectable(itemKey.first, itemKey.second)
        }

        return true
    }

    public fun isSelected(
        columnKey: Any?,
        rowKey: Any?,
    ): Boolean

    override fun isSelected(itemKey: Any?): Boolean {
        if (itemKey is Pair<*, *>) {
            return isSelected(itemKey.first, itemKey.second)
        }

        return false
    }
}

@Composable
public fun rememberSingleCellSelectionManager(
    initialColumnKey: Any? = null,
    initialRowKey: Any? = null,
): TableSelectionManager =
    remember {
        SingleCellSelectionManager(initialColumnKey, initialRowKey)
    }

@Composable
public fun rememberSingleRowSelectionManager(initialRowKey: Any? = null): TableSelectionManager =
    remember {
        SingleRowSelectionManager(initialRowKey)
    }
