package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.styling.SimpleListItemStyle
import org.jetbrains.jewel.ui.icon.IconKey

@Composable
public fun SimpleListItem(
    text: String,
    isSelected: Boolean,
    style: SimpleListItemStyle,
    modifier: Modifier = Modifier,
    height: Dp = JewelTheme.globalMetrics.rowHeight,
    icon: IconKey? = null,
    contentDescription: String? = null,
) {
    val color = if (isSelected) style.colors.backgroundSelectedFocused else Color.Transparent

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier =
            modifier
                .fillMaxWidth()
                .height(height)
                .padding(style.metrics.outerPadding)
                .background(color, RoundedCornerShape(style.metrics.selectionBackgroundCornerSize))
                .padding(style.metrics.innerPadding),
    ) {
        if (icon != null) {
            Icon(modifier = Modifier.size(16.dp), key = icon, contentDescription = contentDescription)
        }
        Text(text = text, maxLines = 1, overflow = TextOverflow.Ellipsis, style = JewelTheme.defaultTextStyle)
    }
}