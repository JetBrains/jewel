package org.jetbrains.jewel.samples.showcase.markdown

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.showcase.FileChooser
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.Divider
import org.jetbrains.jewel.ui.component.ListComboBox
import org.jetbrains.jewel.ui.component.ListItemState
import org.jetbrains.jewel.ui.component.OutlinedButton
import org.jetbrains.jewel.ui.component.SimpleListItem
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextArea
import org.jetbrains.jewel.ui.theme.simpleListItemStyle

@Composable
public fun MarkdownEditor(state: TextFieldState, modifier: Modifier = Modifier, fileChooser: FileChooser) {
    Column(modifier) {
        ControlsRow(
            modifier = Modifier.fillMaxWidth().background(JewelTheme.globalColors.panelBackground).padding(8.dp),
            onLoadMarkdown = { state.edit { replace(0, length, it) } },
            fileChooser = fileChooser,
        )
        Divider(orientation = Orientation.Horizontal, Modifier.fillMaxWidth())
        Editor(state = state, modifier = Modifier.fillMaxWidth().weight(1f))
    }
}

@Composable
private fun ControlsRow(fileChooser: FileChooser, modifier: Modifier = Modifier, onLoadMarkdown: (String) -> Unit) {
    Row(
        modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(
            onClick = { onLoadMarkdown(fileChooser.readFileAsText()) },
            modifier = Modifier.padding(start = 2.dp),
        ) {
            Text("Load file...")
        }

        OutlinedButton(onClick = { onLoadMarkdown("") }) { Text("Clear") }

        Spacer(Modifier.weight(1f))

        val comboBoxItems = remember { listOf("Jewel readme", "Markdown catalog") }
        var selected by remember { mutableStateOf("Jewel readme") }
        ListComboBox(
            items = comboBoxItems,
            modifier = Modifier.width(170.dp).padding(end = 2.dp),
            isEditable = false,
            maxPopupHeight = 150.dp,
            onSelectedItemChange = {
                selected = it
                onLoadMarkdown(if (selected == "Jewel readme") JewelReadme else MarkdownCatalog)
            },
            listItemContent = { item, isSelected, _, isItemHovered, isPreviewSelection ->
                SimpleListItem(
                    text = item,
                    state = ListItemState(isSelected, isItemHovered, isPreviewSelection),
                    modifier = Modifier,
                    style = JewelTheme.simpleListItemStyle,
                    contentDescription = item,
                )
            },
        )
    }
}

@Composable
private fun Editor(state: TextFieldState, modifier: Modifier = Modifier) {
    Box(modifier) {
        TextArea(
            state = state,
            modifier = Modifier.align(Alignment.TopStart).fillMaxWidth(),
            undecorated = true,
            textStyle = JewelTheme.editorTextStyle,
            decorationBoxModifier = Modifier.padding(horizontal = 8.dp),
        )
    }
}
