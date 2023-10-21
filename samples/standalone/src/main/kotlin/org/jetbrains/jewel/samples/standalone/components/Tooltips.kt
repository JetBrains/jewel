package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.core.GroupHeader
import org.jetbrains.jewel.core.JewelTheme
import org.jetbrains.jewel.core.component.Text
import org.jetbrains.jewel.core.component.Tooltip

@Composable
fun Tooltips() {
    GroupHeader("Tooltips")
    Tooltip(tooltip = {
        Text("This is a tooltip")
    }) {
        Text(modifier = Modifier.border(1.dp, JewelTheme.globalColors.borders.normal).padding(4.dp), text = "Hover Me!")
    }
}
