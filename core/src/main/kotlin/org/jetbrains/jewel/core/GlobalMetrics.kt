package org.jetbrains.jewel.core

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Immutable
@GenerateDataFunctions
class GlobalMetrics(
    val outlineWidth: Dp,
    val rowHeight: Dp,
) {

    companion object
}

val LocalGlobalMetrics = staticCompositionLocalOf<GlobalMetrics> {
    error("No GlobalMetrics provided")
}
