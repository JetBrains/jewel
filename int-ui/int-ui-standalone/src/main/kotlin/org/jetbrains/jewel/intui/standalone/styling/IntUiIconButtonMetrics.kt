package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styling.IconButtonMetrics

@Stable
data class IntUiIconButtonMetrics(
    override val cornerSize: CornerSize = CornerSize(4.dp),
    override val padding: PaddingValues = PaddingValues(horizontal = 0.dp, vertical = 0.dp),
    override val minSize: DpSize = DpSize(16.dp, 16.dp),
) : IconButtonMetrics
