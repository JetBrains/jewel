package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.Icon
import org.jetbrains.jewel.LocalContentColor
import org.jetbrains.jewel.intui.standalone.ToolWindow
import org.jetbrains.jewel.intui.standalone.ToolWindowButton
import org.jetbrains.jewel.intui.standalone.ToolWindowButtonData
import org.jetbrains.jewel.intui.standalone.styling.LocalToolWindowButtonStyle
import org.jetbrains.jewel.intui.standalone.styling.ToolWindowButtonStyle
import org.jetbrains.jewel.samples.standalone.svgResource

@Composable
fun ToolWindowStrip(
    modifier: Modifier = Modifier,
    style: ToolWindowButtonStyle,
    firstGroup: List<ToolWindowButtonData> = listOf(),
    secondGroup: List<ToolWindowButtonData> = listOf(),
    activeToolWindow: ToolWindow,
    onButtonClick: (ToolWindow) -> Unit
) {
    var selectedFirstGroupToolWindowIndex by remember { mutableStateOf(0) }
    var selectedSecondGroupToolWindowIndex by remember { mutableStateOf(0) }

    CompositionLocalProvider(LocalToolWindowButtonStyle provides style) {
        Column(
            modifier = modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            ToolWindowGroup(
                selectedToolWindowIndex = selectedFirstGroupToolWindowIndex,
                groupData = firstGroup
            ) {
                selectedFirstGroupToolWindowIndex = it
            }
            ToolWindowGroup(
                selectedToolWindowIndex = selectedSecondGroupToolWindowIndex,
                groupData = secondGroup
            ) {
                selectedSecondGroupToolWindowIndex = it
            }
        }
    }
}

@Composable
fun ToolWindowGroup(
    modifier: Modifier = Modifier,
    selectedToolWindowIndex: Int,
    groupData: List<ToolWindowButtonData>,
    onToolWindowButtonClick: (Int) -> Unit
) {
    Column(
        modifier = modifier
    ) {
        groupData.mapIndexed { index, toolWindow ->
            ToolWindowButton(
                style = LocalToolWindowButtonStyle.current,
                active = selectedToolWindowIndex == index,
                onClick = { onToolWindowButtonClick(index) }
            ) {
                Icon(
                    painter = svgResource(toolWindow.iconResource),
                    contentDescription = toolWindow.label,
                    modifier = Modifier.size(20.dp),
                    tint = LocalContentColor.current
                )
            }
        }
    }
}