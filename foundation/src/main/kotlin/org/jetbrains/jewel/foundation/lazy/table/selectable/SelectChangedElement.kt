package org.jetbrains.jewel.foundation.lazy.table.selectable

import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.ModifierLocalModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.ObserverModifierNode
import androidx.compose.ui.node.observeReads
import org.jetbrains.jewel.foundation.lazy.selectable.ModifierLocalSelectionManager

public fun Modifier.onSelectChanged(
    columnKey: Any?,
    rowKey: Any?,
    onSelectChanged: (Boolean) -> Unit,
): Modifier = then(SelectChangedElement(columnKey, rowKey, onSelectChanged))

internal class SelectChangedElement(
    private var columnKey: Any?,
    private var rowKey: Any?,
    private var onSelectChanged: (Boolean) -> Unit,
) : ModifierNodeElement<SelectChangedNode>() {
    override fun create(): SelectChangedNode = SelectChangedNode(columnKey, rowKey, onSelectChanged)

    override fun update(node: SelectChangedNode) {
        node.update(columnKey, rowKey, onSelectChanged)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SelectChangedElement) return false

        if (columnKey != other.columnKey) return false
        if (rowKey != other.rowKey) return false
        if (onSelectChanged != other.onSelectChanged) return false

        return true
    }

    override fun hashCode(): Int {
        var result = columnKey?.hashCode() ?: 0
        result = 31 * result + (rowKey?.hashCode() ?: 0)
        result = 31 * result + onSelectChanged.hashCode()
        return result
    }
}

internal class SelectChangedNode(
    private var columnKey: Any?,
    private var rowKey: Any?,
    private var onSelectChanged: (Boolean) -> Unit,
) : Modifier.Node(),
    ModifierLocalModifierNode,
    ObserverModifierNode {
    var isSelected: Boolean = false

    fun update(
        columnKey: Any?,
        rowKey: Any?,
        onSelectChanged: (Boolean) -> Unit,
    ) {
        this.columnKey = columnKey
        this.rowKey = rowKey
        this.onSelectChanged = onSelectChanged
        this.isSelected = false
        onObservedReadsChanged()
    }

    override fun onAttach() {
        onObservedReadsChanged()
    }

    override fun onObservedReadsChanged() {
        observeReads {
            val manager = ModifierLocalSelectionManager.current as? TableSelectionManager ?: return@observeReads
            val newValue = manager.isSelected(columnKey, rowKey)
            if (newValue != isSelected) {
                isSelected = newValue
                onSelectChanged(newValue)
            }
        }
    }
}
