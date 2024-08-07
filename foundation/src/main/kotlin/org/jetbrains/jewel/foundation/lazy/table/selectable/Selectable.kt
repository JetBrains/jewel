package org.jetbrains.jewel.foundation.lazy.table.selectable

import androidx.compose.ui.Modifier
import org.jetbrains.jewel.foundation.lazy.selectable.selectionManager
import org.jetbrains.jewel.foundation.lazy.table.view.DelegatedTableView
import org.jetbrains.jewel.foundation.lazy.table.view.TableView

internal fun Modifier.selectionManager(view: TableView): Modifier =
    then(
        when (view) {
            is TableSelectionManager -> Modifier.selectionManager(view as TableSelectionManager)
            is DelegatedTableView -> Modifier.selectionManager(view.delegate)
            else -> Modifier
        },
    )
