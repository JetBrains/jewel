package org.jetbrains.jewel.internal

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isUnspecified

fun backgroundBrush(areaColor: AreaColor): Brush {
    return backgroundBrush(areaColor.background, areaColor.endBackground)
}

fun backgroundBrush(start: Color, end: Color): Brush {
    if (start == end) return SolidColor(start)
    if (end.isUnspecified) return SolidColor(start)

    return Brush.verticalGradient(
        listOf(start, end)
    )
}
