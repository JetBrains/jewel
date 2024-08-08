package org.jetbrains.jewel.foundation.lazy.table.selectable

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionEvent
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionType

public class SingleRowSelectionManager : TableSelectionManager {
    private var selectedRowKey: Any? by mutableStateOf(null)

    override val interactionSource: MutableInteractionSource = MutableInteractionSource()

    override fun isSelectable(
        columnKey: Any?,
        rowKey: Any?,
    ): Boolean = true

    override fun isSelected(
        columnKey: Any?,
        rowKey: Any?,
    ): Boolean = rowKey == selectedRowKey

    override fun handleEvent(event: SelectionEvent) {
        if (event !is TableSelectionEvent) {
            clearSelection()
            return
        }

        if (event.rowKey == null) {
            clearSelection()
            return
        }

        if (event.type == SelectionType.Multi && isSelected(null, event.rowKey)) {
            clearSelection()
            return
        }
        select(event.rowKey)
    }

    private fun select(rowKey: Any?) {
        if (selectedRowKey == rowKey) {
            return
        }

        selectedRowKey = rowKey
    }

    override fun clearSelection() {
        selectedRowKey = null
    }
}
