package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public interface LazyTableCellSize {

    public fun Density.columnConstraints(
        position: Int,
        tableWidth: Int,
        columns: Int,
        spacing: Int,
    ): Constraints

    public fun Density.rowConstraints(
        position: Int,
        tableHeight: Int,
        rows: Int,
        spacing: Int,
    ): Constraints

    public companion object
}

public fun LazyTableCellSize.Companion.responsive(
    minWidth: Dp = 0.dp,
    maxWidth: Dp = Dp.Infinity,
    minHeight: Dp = 0.dp,
    maxHeight: Dp = Dp.Infinity,
): LazyTableCellSize = ConstraintsCellSize {
    Constraints(
        minWidth = minWidth.roundToPx(),
        maxWidth = maxWidth.roundToPx(),
        minHeight = minHeight.roundToPx(),
        maxHeight = maxHeight.roundToPx(),
    )
}

@Composable
public fun LazyTableCellSize.Companion.fixed(
    width: Dp,
    height: Dp,
): LazyTableCellSize = ConstraintsCellSize {
    Constraints(
        minWidth = width.roundToPx(),
        maxWidth = width.roundToPx(),
        minHeight = height.roundToPx(),
        maxHeight = height.roundToPx(),
    )
}

@Composable
public fun LazyTableCellSize.Companion.fixedHeight(
    height: Dp,
    minWidth: Dp = 0.dp,
    maxWidth: Dp = Dp.Infinity,
): LazyTableCellSize = ConstraintsCellSize {
    Constraints(
        minWidth = minWidth.roundToPx(),
        maxWidth = maxWidth.roundToPx(),
        minHeight = height.roundToPx(),
        maxHeight = height.roundToPx(),
    )
}

private class ConstraintsCellSize(
    val constraints: Density.() -> Constraints,
) : LazyTableCellSize {

    override fun Density.columnConstraints(
        position: Int,
        tableWidth: Int,
        columns: Int,
        spacing: Int,
    ): Constraints = constraints()

    override fun Density.rowConstraints(
        position: Int,
        tableHeight: Int,
        rows: Int,
        spacing: Int,
    ): Constraints = constraints()
}
