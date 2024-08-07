package org.jetbrains.jewel.foundation.lazy.table.draggable

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.modifier.modifierLocalProvider
import org.jetbrains.jewel.foundation.lazy.draggable.LazyLayoutDraggingState
import org.jetbrains.jewel.foundation.lazy.draggable.draggableLayout
import org.jetbrains.jewel.foundation.lazy.draggable.draggingGestures
import org.jetbrains.jewel.foundation.lazy.draggable.draggingOffset

internal val ModifierLocalLazyTableRowDraggingState = modifierLocalOf<LazyTableRowDraggingState?> { null }

internal val ModifierLocalLazyTableColumnDraggingState = modifierLocalOf<LazyTableColumnDraggingState?> { null }

public fun Modifier.lazyTableDraggable(
    rowDraggingState: LazyTableRowDraggingState?,
    columnDraggingState: LazyTableColumnDraggingState?,
): Modifier =
    draggableLayout()
        .modifierLocalProvider(ModifierLocalLazyTableRowDraggingState) {
            rowDraggingState
        }.modifierLocalProvider(ModifierLocalLazyTableColumnDraggingState) {
            columnDraggingState
        }

public fun Modifier.lazyTableCellDraggingOffset(
    columnKey: Any?,
    rowKey: Any?,
): Modifier =
    draggingOffset(
        ModifierLocalLazyTableRowDraggingState as ModifierLocal<LazyLayoutDraggingState<*>>,
        rowKey,
        Orientation.Vertical,
    ).draggingOffset(
        ModifierLocalLazyTableColumnDraggingState as ModifierLocal<LazyLayoutDraggingState<*>>,
        columnKey,
        Orientation.Horizontal,
    )

public fun Modifier.lazyTableDraggableRowHeader(key: Any?): Modifier =
    draggingGestures(
        ModifierLocalLazyTableRowDraggingState as ModifierLocal<LazyLayoutDraggingState<*>>,
        key,
    ).draggingOffset(
        ModifierLocalLazyTableRowDraggingState as ModifierLocal<LazyLayoutDraggingState<*>>,
        key,
        Orientation.Vertical,
    )

public fun Modifier.lazyTableDraggableColumnHeader(key: Any?): Modifier =
    draggingGestures(
        ModifierLocalLazyTableColumnDraggingState as ModifierLocal<LazyLayoutDraggingState<*>>,
        key,
    ).draggingOffset(
        ModifierLocalLazyTableColumnDraggingState as ModifierLocal<LazyLayoutDraggingState<*>>,
        key,
        Orientation.Horizontal,
    )
