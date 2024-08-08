package org.jetbrains.jewel.ui.component.styling

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.lazy.table.LazyTableCellContainer
import org.jetbrains.jewel.foundation.lazy.table.LazyTableState
import org.jetbrains.jewel.foundation.lazy.table.LazyTableStyle
import org.jetbrains.jewel.foundation.lazy.table.draggable.lazyTableCellDraggingOffset
import org.jetbrains.jewel.foundation.lazy.table.draggable.lazyTableDraggableColumnHeader
import org.jetbrains.jewel.foundation.lazy.table.draggable.lazyTableDraggableRowHeader
import org.jetbrains.jewel.foundation.lazy.table.selectable.TableSelectionUnit
import org.jetbrains.jewel.foundation.lazy.table.selectable.onSelectChanged
import org.jetbrains.jewel.foundation.lazy.table.selectable.selectableCell
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.component.TableCellState

@Stable
@GenerateDataFunctions
public class TableStyle(
    public val colors: TableColors,
    public val metrics: TableMetrics,
) : LazyTableStyle {
    @Composable
    override fun LazyTableState.container(
        columnIndex: Int,
        rowIndex: Int,
        columnKey: Any?,
        rowKey: Any?,
        content: @Composable () -> Unit,
    ) {
        var cellState by remember(content) {
            mutableStateOf(TableCellState.of())
        }

        val isPinnedColumn = columnIndex < tableInfo.pinnedColumns
        val isPinnedRow = rowIndex < tableInfo.pinnedRows
        val isHeader = isPinnedRow || isPinnedColumn
        val isStripe = (rowIndex - tableInfo.pinnedRows) % 2 == 1

        val modifier =
            when {
                (isPinnedColumn == isPinnedRow) && isPinnedRow -> {
                    Modifier.selectableCell(columnKey, rowKey, TableSelectionUnit.All)
                }

                (isPinnedColumn == isPinnedRow) && !isPinnedRow -> {
                    Modifier.lazyTableCellDraggingOffset(columnKey, rowKey).selectableCell(columnKey, rowKey)
                }

                isPinnedColumn -> {
                    Modifier
                        .lazyTableDraggableRowHeader(rowKey)
                        .selectableCell(columnKey, rowKey, TableSelectionUnit.Row)
                }

                else -> {
                    Modifier
                        .lazyTableDraggableColumnHeader(columnKey)
                        .selectableCell(columnKey, rowKey, TableSelectionUnit.Column)
                }
            }

        LazyTableCellContainer(
            modifier
                .onFocusChanged {
                    cellState = cellState.copy(focused = it.hasFocus)
                }.onSelectChanged(columnKey, rowKey) {
                    cellState = cellState.copy(selected = it)
                }.background(colors.backgroundFor(cellState, isHeader, isStripe).value)
                .border(Stroke.Alignment.Outside, 1.dp, colors.borderFor(cellState, isHeader, isStripe).value),
            contentAlignment = if (isHeader) Alignment.Center else Alignment.CenterStart,
        ) {
            val contentColor by colors.contentFor(cellState, isHeader, isStripe)

            CompositionLocalProvider(
                LocalContentColor provides contentColor,
                content = content,
            )
        }
    }

    public companion object
}

@Immutable
@GenerateDataFunctions
public class TableColors(
    public val background: Brush,
    public val backgroundSelected: Brush,
    public val backgroundInactiveSelected: Brush,
    public val foreground: Color,
    public val foregroundSelected: Color,
    public val foregroundInactiveSelected: Color,
    public val gridColor: Color,
    public val stripeBackground: Brush,
    public val headerBackground: Brush,
    public val headerForeground: Color,
    public val headerSeparatorColor: Color,
) {
    @Composable
    public fun backgroundFor(
        state: TableCellState,
        isHeader: Boolean,
        isStripe: Boolean,
    ): State<Brush> =
        rememberUpdatedState(
            when {
                state.isSelected && !state.isActive -> backgroundInactiveSelected
                state.isSelected -> backgroundSelected
                isHeader -> headerBackground
                isStripe -> stripeBackground
                else -> background
            },
        )

    @Composable
    public fun contentFor(
        state: TableCellState,
        isHeader: Boolean,
        isStripe: Boolean,
    ): State<Color> =
        rememberUpdatedState(
            when {
                state.isSelected && !state.isActive -> foregroundInactiveSelected
                state.isSelected -> foregroundSelected
                isHeader -> headerForeground
                else -> foreground
            },
        )

    @Composable
    public fun borderFor(
        state: TableCellState,
        isHeader: Boolean,
        isStripe: Boolean,
    ): State<Color> =
        rememberUpdatedState(
            when {
                isHeader -> headerSeparatorColor
                else -> gridColor
            },
        )

    public companion object
}

@Immutable
public class TableMetrics {
    public companion object
}

internal val LocalTableStyle: ProvidableCompositionLocal<TableStyle> =
    staticCompositionLocalOf {
        error("No LazyTableStyle provided. Have you forgotten the theme?")
    }
