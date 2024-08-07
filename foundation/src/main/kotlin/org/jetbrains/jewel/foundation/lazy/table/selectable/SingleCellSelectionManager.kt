package org.jetbrains.jewel.foundation.lazy.table.selectable

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionEvent
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionType

/**
 * A [SelectionManager] that support single cell selection.
 */
public open class SingleCellSelectionManager : TableSelectionManager {
    private var selectedRowKey: Any? by mutableStateOf(null)
    private var selectedColumnKey: Any? by mutableStateOf(null)

    override val interactionSource: MutableInteractionSource = MutableInteractionSource()

    override fun isSelectable(
        columnKey: Any?,
        rowKey: Any?,
    ): Boolean = true

    override fun isSelected(
        columnKey: Any?,
        rowKey: Any?,
    ): Boolean = selectedRowKey == rowKey && selectedColumnKey == columnKey

    override fun handleEvent(event: SelectionEvent) {
        if (event !is TableSelectionEvent) {
            clearSelection()
            return
        }

        if (event.rowKey == null || event.columnKey == null) {
            clearSelection()
            return
        }

        if (event.type == SelectionType.Multi && isSelected(event.columnKey, event.rowKey)) {
            clearSelection()
            return
        }
        select(event.columnKey, event.rowKey)
    }

    private fun select(
        columnKey: Any?,
        rowKey: Any?,
    ) {
        if (isSelected(columnKey, rowKey)) {
            return
        }

        selectedRowKey = rowKey
        selectedColumnKey = columnKey
    }

    override fun clearSelection() {
        if (selectedRowKey == null && selectedColumnKey == null) {
            return
        }

        selectedRowKey = null
        selectedColumnKey = null
    }
}
