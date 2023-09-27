package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.Icon
import org.jetbrains.jewel.LocalContentColor
import org.jetbrains.jewel.intui.standalone.ToolWindow
import org.jetbrains.jewel.intui.standalone.ToolWindowButton
import org.jetbrains.jewel.intui.standalone.styling.ToolWindowButtonStyle
import org.jetbrains.jewel.samples.standalone.svgResource

@Composable
fun ToolWindowStrip(
    style: ToolWindowButtonStyle,
    activeToolWindow: ToolWindow,
    onButtonClick: (ToolWindow) -> Unit
) {
    Column {
        ToolWindowButton(
            style = style,
            active = activeToolWindow == ToolWindow.Project,
            onClick = { onButtonClick(ToolWindow.Project) }
        ) {
            Icon(
                painter = svgResource("expui/icons/toolwindow/project@20x20.svg"),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = LocalContentColor.current
            )
        }
        ToolWindowButton(
            style = style,
            active = activeToolWindow == ToolWindow.Vcs,
            onClick = { onButtonClick(ToolWindow.Vcs) }
        ) {
            Icon(
                painter = svgResource("expui/icons/toolwindow/vcs@20x20.svg"),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = LocalContentColor.current
            )
        }
    }
}