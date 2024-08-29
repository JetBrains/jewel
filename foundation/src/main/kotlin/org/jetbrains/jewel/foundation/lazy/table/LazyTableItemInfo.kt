package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize

public interface LazyTableItemInfo {
    public val index: Int

    public val key: Any

    public val row: Int

    public val column: Int

    public val offset: IntOffset

    public val size: IntSize

    public val contentType: Any? get() = null
}
