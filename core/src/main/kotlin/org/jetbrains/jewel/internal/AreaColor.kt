package org.jetbrains.jewel.internal

import androidx.compose.ui.graphics.Color

data class AreaColor(
    val background: Color = Color.Unspecified,
    val endBackground: Color = Color.Unspecified,
    val foreground: Color = Color.Unspecified,
    val stroke: Color = Color.Unspecified
)
