package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.layout.LazyLayout
import androidx.compose.foundation.overscroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.lazy.draggable.draggableLayout
import org.jetbrains.jewel.foundation.lazy.table.draggable.LazyTableColumnDraggingState
import org.jetbrains.jewel.foundation.lazy.table.draggable.LazyTableRowDraggingState
import org.jetbrains.jewel.foundation.lazy.table.draggable.ModifierLocalLazyTableColumnDraggingState
import org.jetbrains.jewel.foundation.lazy.table.draggable.ModifierLocalLazyTableRowDraggingState
import org.jetbrains.jewel.foundation.lazy.table.selectable.selectionManager
import org.jetbrains.jewel.foundation.lazy.table.view.LazyTableViewContent
import org.jetbrains.jewel.foundation.lazy.table.view.SortableTableView
import org.jetbrains.jewel.foundation.lazy.table.view.TableView
import org.jetbrains.jewel.foundation.lazy.table.view.TableViewKeyPositionMap

@Composable
public fun LazyTable(
    modifier: Modifier = Modifier,
    state: LazyTableState = rememberLazyTableState(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    userScrollEnabled: Boolean = true,
    beyondBoundsItemCount: Int = 0,
    horizontalArrangement: Arrangement.Horizontal? = null,
    verticalArrangement: Arrangement.Vertical? = null,
    style: LazyTableStyle = LazyTableStyle,
    view: TableView,
) {
    println("Recompose Table")
    val itemProviderLambda = rememberLazyTableItemProviderLambda(state, style, view)

    val measurePolicy =
        rememberLazyTabletMeasurePolicy(
            itemProviderLambda = itemProviderLambda,
            state = state,
            pinnedColumns = view.pinnedColumns(),
            pinnedRows = view.pinnedRows(),
            contentPadding = contentPadding,
            beyondBoundsItemCount = beyondBoundsItemCount,
            horizontalArrangement = horizontalArrangement,
            verticalArrangement = verticalArrangement,
        )

    val overscrollEffect = ScrollableDefaults.overscrollEffect()

    LazyLayout(
        modifier =
            modifier
                .draggableTable(state, view)
                .selectionManager(view)
                .then(state.remeasurementModifier)
                .then(state.awaitLayoutModifier)
                .overscroll(overscrollEffect)
                .scrollable(
                    orientation = Orientation.Vertical,
                    interactionSource = state.internalInteractionSource,
                    reverseDirection =
                        ScrollableDefaults.reverseDirection(
                            LocalLayoutDirection.current,
                            Orientation.Vertical,
                            false,
                        ),
                    flingBehavior = flingBehavior,
                    state = state.verticalScrollableState,
                    overscrollEffect = overscrollEffect,
                    enabled = userScrollEnabled,
                ).scrollable(
                    orientation = Orientation.Horizontal,
                    interactionSource = state.internalInteractionSource,
                    reverseDirection =
                        ScrollableDefaults.reverseDirection(
                            LocalLayoutDirection.current,
                            Orientation.Horizontal,
                            false,
                        ),
                    flingBehavior = flingBehavior,
                    state = state.horizontalScrollableState,
                    overscrollEffect = overscrollEffect,
                    enabled = userScrollEnabled,
                ).clip(RectangleShape),
        prefetchState = state.prefetchState,
        measurePolicy = measurePolicy,
        itemProvider = itemProviderLambda,
    )
}

@Composable
internal fun rememberLazyTableItemProviderLambda(
    state: LazyTableState,
    style: LazyTableStyle,
    view: TableView,
): () -> LazyTableItemProvider {
    val itemProvider =
        remember(state, style) {
            val scope = LazyTableItemScopeImpl()

            val intervalContent = LazyTableViewContent(state, style, view)

            val map = TableViewKeyPositionMap(view)

            LazyTableItemProviderImpl(
                state = state,
                content = intervalContent,
                itemScope = scope,
                keyPositionMap = map,
            )
        }

    return { itemProvider }
}

@Composable
private fun Modifier.draggableTable(
    state: LazyTableState,
    view: TableView,
) = composed {
    if (view !is SortableTableView) return@composed this
    if (!view.supportColumnSorting() && !view.supportRowSorting()) return@composed this

    val columnDraggingModifier =
        if (view.supportColumnSorting()) {
            val columnDraggingState =
                remember(state, view) {
                    LazyTableColumnDraggingState(state, { false }) { fromKey, toKey ->
                        view.moveColumn(fromKey, toKey)
                    }
                }

            Modifier.modifierLocalProvider(ModifierLocalLazyTableColumnDraggingState) {
                columnDraggingState
            }
        } else {
            Modifier
        }

    val rowDraggingModifier =
        if (view.supportRowSorting()) {
            val rowDraggingState =
                remember(state, view) {
                    LazyTableRowDraggingState(state, { false }) { fromKey, toKey ->
                        view.moveRow(fromKey, toKey)
                    }
                }

            Modifier.modifierLocalProvider(ModifierLocalLazyTableRowDraggingState) {
                rowDraggingState
            }
        } else {
            Modifier
        }

    this@composed.draggableLayout().then(columnDraggingModifier).then(rowDraggingModifier)
}
