package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.DpSize

interface IconButtonMetrics {

    val cornerSize: CornerSize
    val padding: PaddingValues
    val minSize: DpSize
}

val LocalIconButtonMetrics = staticCompositionLocalOf<IconButtonMetrics> {
    error("No outlined ButtonStyle provided")
}
