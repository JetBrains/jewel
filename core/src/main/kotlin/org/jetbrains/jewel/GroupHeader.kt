package org.jetbrains.jewel

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.core.component.Divider
import org.jetbrains.jewel.core.component.Text
import org.jetbrains.jewel.core.component.styling.GroupHeaderStyle
import org.jetbrains.jewel.core.component.styling.LocalGroupHeaderStyle

@Composable
fun GroupHeader(
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color.Unspecified,
    style: GroupHeaderStyle = LocalGroupHeaderStyle.current,
) {
    Row(modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(text, color = textColor)
        Divider(
            orientation = Orientation.Horizontal,
            color = style.colors.divider,
            thickness = style.metrics.dividerThickness,
            startIndent = style.metrics.indent,
        )
    }
}
