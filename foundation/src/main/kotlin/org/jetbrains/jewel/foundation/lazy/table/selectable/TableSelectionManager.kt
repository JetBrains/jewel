package org.jetbrains.jewel.foundation.lazy.table.selectable

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
