package org.jetbrains.jewel.internal

import androidx.compose.ui.graphics.Color

@Deprecated("AreaColor is deprecated. Use separate colors instead.")
data class AreaColor(
    val background: Color = Color.Unspecified,
    val endBackground: Color = Color.Unspecified,
    val foreground: Color = Color.Unspecified,
    val stroke: Color = Color.Unspecified
)
