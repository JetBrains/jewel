package org.jetbrains.jewel.foundation.lazy.table.selectable

import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionEvent
import org.jetbrains.jewel.foundation.lazy.selectable.SelectionType

@GenerateDataFunctions
public class TableSelectionEvent(
    public val columnKey: Any? = null,
    public val rowKey: Any? = null,
    public val selectionUnit: TableSelectionUnit = TableSelectionUnit.Cell,
    public val type: SelectionType = SelectionType.Normal,
) : SelectionEvent
