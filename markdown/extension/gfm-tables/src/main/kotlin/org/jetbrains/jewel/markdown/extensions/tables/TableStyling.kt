package org.jetbrains.jewel.markdown.extensions.tables

import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@GenerateDataFunctions
public class TableStyling(
    public val headColor: Color,
    public val borderColor: Color,
) {

    public companion object
}
