package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.lazy.layout.LazyLayout
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
import androidx.compose.foundation.overscroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset

@Composable
public fun LazyTable(
    modifier: Modifier = Modifier,
    state: LazyTableState = rememberLazyTableState(),
    pinnedColumns: Int = 0,
    pinnedRows: Int = 0,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    userScrollEnabled: Boolean = true,
    beyondBoundsItemCount: Int = 0,
    horizontalArrangement: Arrangement.Horizontal? = null,
    verticalArrangement: Arrangement.Vertical? = null,
    content: LazyTableScope.() -> LazyTableCells,
) {
    val itemProviderLambda = rememberLazyTableItemProviderLambda(state, pinnedColumns, pinnedRows, content)

    val measurePolicy = rememberLazyTabletMeasurePolicy(
        itemProviderLambda = itemProviderLambda,
        state = state,
        pinnedColumns = pinnedColumns,
        pinnedRows = pinnedRows,
        contentPadding = contentPadding,
        beyondBoundsItemCount = beyondBoundsItemCount,
        horizontalArrangement = horizontalArrangement,
        verticalArrangement = verticalArrangement,
    )

    val overscrollEffect = ScrollableDefaults.overscrollEffect()

    LazyLayout(
        modifier = modifier.then(state.remeasurementModifier)
            .then(state.awaitLayoutModifier)
            .overscroll(overscrollEffect)
            .scrollable(
                orientation = Orientation.Vertical,
                interactionSource = state.internalInteractionSource,
                reverseDirection = ScrollableDefaults.reverseDirection(
                    LocalLayoutDirection.current,
                    Orientation.Vertical,
                    false,
                ),
                flingBehavior = flingBehavior,
                state = state.verticalScrollableState,
                overscrollEffect = overscrollEffect,
                enabled = userScrollEnabled,
            )
            .scrollable(
                orientation = Orientation.Horizontal,
                interactionSource = state.internalInteractionSource,
                reverseDirection = ScrollableDefaults.reverseDirection(
                    LocalLayoutDirection.current,
                    Orientation.Horizontal,
                    false,
                ),
                flingBehavior = flingBehavior,
                state = state.horizontalScrollableState,
                overscrollEffect = overscrollEffect,
                enabled = userScrollEnabled,
            )
            .clip(RectangleShape),
        prefetchState = state.prefetchState,
        measurePolicy = measurePolicy,
        itemProvider = itemProviderLambda,
    )
}

@Composable
private fun rememberLazyTabletMeasurePolicy(
    itemProviderLambda: () -> LazyTableItemProvider,
    state: LazyTableState,
    pinnedColumns: Int,
    pinnedRows: Int,
    contentPadding: PaddingValues,
    beyondBoundsItemCount: Int,
    horizontalArrangement: Arrangement.Horizontal? = null,
    verticalArrangement: Arrangement.Vertical? = null,
): LazyLayoutMeasureScope.(Constraints) -> MeasureResult =
    remember<LazyLayoutMeasureScope.(Constraints) -> MeasureResult>(
        state,
        pinnedColumns,
        pinnedRows,
        contentPadding,
        beyondBoundsItemCount,
    ) {
        {
                containerConstraints ->
            check(containerConstraints.maxHeight != Constraints.Infinity && containerConstraints.maxWidth != Constraints.Infinity) {
                "LazyTable does not support infinite constraints."
            }

            state.density = this

            val startPadding = contentPadding.calculateStartPadding(layoutDirection).roundToPx()
            val endPadding = contentPadding.calculateEndPadding(layoutDirection).roundToPx()
            val topPadding = contentPadding.calculateTopPadding().roundToPx()
            val bottomPadding = contentPadding.calculateBottomPadding().roundToPx()

            val totalVerticalPadding = topPadding + bottomPadding
            val totalHorizontalPadding = startPadding + endPadding

            val contentConstraints = containerConstraints.offset(-totalHorizontalPadding, -totalVerticalPadding)

            val availableSize = IntSize(
                containerConstraints.maxWidth - totalHorizontalPadding,
                containerConstraints.maxHeight - totalVerticalPadding,
            )

            val visualItemOffset = IntOffset(startPadding, topPadding)

            val horizontalSpacing = horizontalArrangement?.spacing?.roundToPx() ?: 0
            val verticalSpacing = verticalArrangement?.spacing?.roundToPx() ?: 0

            val itemProvider = itemProviderLambda()
            val measuredItemProvider = object : LazyTableMeasuredItemProvider(
                availableSize = availableSize,
                rows = itemProvider.rowCount,
                columns = itemProvider.columnCount,
                horizontalSpacing = horizontalSpacing,
                verticalSpacing = verticalSpacing,
                itemProvider = itemProvider,
                measureScope = this,
                density = this,
            ) {
                override fun createItem(
                    column: Int,
                    row: Int,
                    size: IntSize,
                    key: Any,
                    contentType: Any?,
                    placeables: List<Placeable>,
                ): LazyTableMeasuredItem {
                    // we add spaceBetweenItems as an extra spacing for all items apart from the last one so
                    // the lazy list measuring logic will take it into account.
                    val coordinate = IntOffset(column, row)
                    val index = itemProvider.getIndex(coordinate)
                    return LazyTableMeasuredItem(
                        index = index,
                        row = row,
                        column = column,
                        size = size,
                        placeables = placeables,
                        alignment = Alignment.TopStart,
                        layoutDirection = layoutDirection,
                        visualOffset = visualItemOffset,
                        key = key,
                        contentType = contentType,
                    )
                }
            }

            val firstVisibleItemCoordinate: IntOffset
            val firstVisibleScrollOffset: IntOffset

            Snapshot.withoutReadObservation {
                firstVisibleItemCoordinate = IntOffset(
                    state.firstVisibleColumnIndex,
                    state.firstVisibleRowIndex,
                )
                firstVisibleScrollOffset = IntOffset(
                    state.firstVisibleItemHorizontalScrollOffset,
                    state.firstVisibleItemVerticalScrollOffset,
                )
            }

            measureLazyTable(
                constraints = contentConstraints,
                availableSize = availableSize,
                rows = itemProvider.rowCount,
                columns = itemProvider.columnCount,
                pinnedColumns = minOf(pinnedColumns, itemProvider.columnCount),
                pinnedRows = minOf(pinnedRows, itemProvider.rowCount),
                measuredItemProvider = measuredItemProvider,
                horizontalSpacing = horizontalSpacing,
                verticalSpacing = verticalSpacing,
                firstVisibleCellPosition = firstVisibleItemCoordinate,
                firstVisibleCellScrollOffset = firstVisibleScrollOffset,
                scrollToBeConsumed = Offset(state.scrollToBeConsumedHorizontal, state.scrollToBeConsumedVertical),
                density = this,
                beyondBoundsItemCount = beyondBoundsItemCount,
                layout = { width, height, placement ->
                    layout(
                        containerConstraints.constrainWidth(width + totalHorizontalPadding),
                        containerConstraints.constrainHeight(height + totalVerticalPadding),
                        emptyMap(),
                        placement,
                    )
                },
            ).also {
                state.applyMeasureResult(it)
            }
        }
    }

public interface LazyTableRowScope {

    public fun column(column: Int, content: @Composable (LazyTableCellState) -> Unit)
}

public interface LazyTableColumnScope {

    public fun row(row: Int, content: @Composable (LazyTableCellState) -> Unit)
}

public interface LazyTableCellState {

    public val row: Int

    public val column: Int

    public val selected: Boolean
}
