package org.jetbrains.jewel.core.component.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Immutable
@GenerateDataFunctions
class DividerStyle(
    val color: Color,
    val metrics: DividerMetrics,
) {

    companion object
}

@Immutable
@GenerateDataFunctions
class DividerMetrics(
    val thickness: Dp,
    val startIndent: Dp,
) {

    companion object
}

val LocalDividerStyle = staticCompositionLocalOf<DividerStyle> {
    error("No DividerStyle provided")
}
