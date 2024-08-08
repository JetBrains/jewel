package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntSize

public interface LazyTableLayoutScope : Density {

    public val availableSize: IntSize

    public val columns: Int

    public val rows: Int

    public val horizontalSpacing: Int

    public val verticalSpacing: Int
}
