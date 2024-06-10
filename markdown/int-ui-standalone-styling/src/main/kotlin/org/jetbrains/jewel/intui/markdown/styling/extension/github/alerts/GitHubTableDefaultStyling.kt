package org.jetbrains.jewel.intui.markdown.styling.extension.github.alerts

import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.markdown.extensions.tables.TableStyling

public fun TableStyling.Companion.dark(
    headColor: Color = Color.DarkGray,
    borderColor: Color = Color.Gray,
): TableStyling = TableStyling(
    headColor,
    borderColor,
)

public fun TableStyling.Companion.light(
    headColor: Color = Color.LightGray,
    borderColor: Color = Color.Gray,
): TableStyling = TableStyling(
    headColor,
    borderColor,
)
