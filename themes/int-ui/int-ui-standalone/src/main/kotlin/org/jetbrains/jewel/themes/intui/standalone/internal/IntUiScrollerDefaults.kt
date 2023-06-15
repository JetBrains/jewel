package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.ScrollerDefaults

abstract class IntUiScrollerDefaults : ScrollerDefaults {
    @Composable
    override fun shape(): Shape = RoundedCornerShape(4.dp)

    @Composable
    override fun minHeight(): Dp = 16.dp

    @Composable
    override fun thickness(): Dp = 8.dp

    @Composable
    override fun hoverDurationMillis(): Int = 300
}
