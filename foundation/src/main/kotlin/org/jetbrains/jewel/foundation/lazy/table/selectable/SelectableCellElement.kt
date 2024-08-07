package org.jetbrains.jewel.foundation.lazy.table.selectable

import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.modifier.ModifierLocalModifierNode
import androidx.compose.ui.node.DelegatingNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.PointerInputModifierNode
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.unit.IntSize
import org.jetbrains.jewel.foundation.lazy.selectable.ModifierLocalSelectionManager
import org.jetbrains.jewel.foundation.lazy.selectable.selectionType

public fun Modifier.selectableCell(
    columnKey: Any?,
    rowKey: Any?,
    selectionUnit: TableSelectionUnit = TableSelectionUnit.Cell,
): Modifier = then(SelectableCellElement(columnKey, rowKey, selectionUnit))

private class SelectableCellElement(
    private val columnKey: Any?,
    private val rowKey: Any?,
    private val selectionUnit: TableSelectionUnit,
) : ModifierNodeElement<SelectableCellNode>() {
    override fun create(): SelectableCellNode = SelectableCellNode(columnKey, rowKey, selectionUnit)

    override fun update(node: SelectableCellNode) {
        node.update(columnKey, rowKey, selectionUnit)
    }

    override fun InspectorInfo.inspectableProperties() {
        name = "SelectableCell"
        properties["columnKey"] = columnKey
        properties["rowKey"] = rowKey
        properties["selectionUnit"] = selectionUnit
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SelectableCellElement) return false

        if (columnKey != other.columnKey) return false
        if (rowKey != other.rowKey) return false
        if (selectionUnit != other.selectionUnit) return false

        return true
    }

    override fun hashCode(): Int {
        var result = columnKey?.hashCode() ?: 0
        result = 31 * result + (rowKey?.hashCode() ?: 0)
        result = 31 * result + selectionUnit.hashCode()
        return result
    }
}

internal class SelectableCellNode(
    private var columnKey: Any?,
    private var rowKey: Any?,
    private var selectionUnit: TableSelectionUnit,
) : DelegatingNode(),
    ModifierLocalModifierNode {
    private var pointerInputNode: SelectableCellPointerInputNode? = null

    fun update(
        columnKey: Any?,
        rowKey: Any?,
        selectionUnit: TableSelectionUnit,
    ) {
        this.columnKey = columnKey
        this.rowKey = rowKey
        this.selectionUnit = selectionUnit
        pointerInputNode?.update(columnKey, rowKey, selectionUnit)
    }

    override fun onAttach() {
        val selectionManager = ModifierLocalSelectionManager.current as? TableSelectionManager ?: return

        if (pointerInputNode == null) {
            pointerInputNode = SelectableCellPointerInputNode(columnKey, rowKey, selectionUnit)
        }

        val pointerInputNode = pointerInputNode ?: return

        pointerInputNode.selectionManager = selectionManager

        if (!pointerInputNode.isAttached) {
            delegate(pointerInputNode)
        }
    }
}

private class SelectableCellPointerInputNode(
    private var columnKey: Any?,
    private var rowKey: Any?,
    private var selectionUnit: TableSelectionUnit,
) : Modifier.Node(),
    PointerInputModifierNode {
    var selectionManager: TableSelectionManager? = null

    fun update(
        columnKey: Any?,
        rowKey: Any?,
        selectionUnit: TableSelectionUnit,
    ) {
        this.columnKey = columnKey
        this.rowKey = rowKey
        this.selectionUnit = selectionUnit
    }

    override fun onCancelPointerInput() {}

    override fun onPointerEvent(
        pointerEvent: PointerEvent,
        pass: PointerEventPass,
        bounds: IntSize,
    ) {
        val manager = selectionManager ?: return

        when (pointerEvent.type) {
            PointerEventType.Press -> {
                manager.handleEvent(
                    TableSelectionEvent(
                        columnKey,
                        rowKey,
                        selectionUnit,
                        pointerEvent.keyboardModifiers.selectionType(),
                    ),
                )
            }
        }
    }
}
