package org.jetbrains.jewel.samples.standalone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.BaseChip
import org.jetbrains.jewel.CheckboxRow
import org.jetbrains.jewel.GroupHeader
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.IntelliJTree
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.VerticalScrollbar
import org.jetbrains.jewel.foundation.tree.buildTree
import org.jetbrains.jewel.samples.standalone.components.Borders
import org.jetbrains.jewel.samples.standalone.components.Buttons
import org.jetbrains.jewel.samples.standalone.components.Checkboxes
import org.jetbrains.jewel.samples.standalone.components.Dropdowns
import org.jetbrains.jewel.samples.standalone.components.Links
import org.jetbrains.jewel.samples.standalone.components.RadioButtons
import org.jetbrains.jewel.samples.standalone.components.TextAreas
import org.jetbrains.jewel.samples.standalone.components.TextFields
import org.jetbrains.jewel.themes.intui.standalone.dark.DarkTheme
import org.jetbrains.jewel.themes.intui.standalone.light.LightTheme

@Composable
fun JetBrainsTheme(isDark: Boolean, content: @Composable () -> Unit) =
    IntelliJTheme(
        if (isDark) DarkTheme else LightTheme,
        content
    )

@Suppress("MagicNumber")
fun main() = singleWindowApplication(
    title = "TODO: sample app"
) {
    var isDark by remember { mutableStateOf(false) }
    var isNewUi by remember { mutableStateOf(true) }

    val verticalScrollState = rememberScrollState(0)
    JetBrainsTheme(isDark = isDark) {
        Box(
            Modifier.fillMaxSize().background(IntelliJTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            Column(
                Modifier.width(IntrinsicSize.Max).padding(24.dp).verticalScroll(verticalScrollState),
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GroupHeader("Themes")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CheckboxRow("Dark", isDark, { isDark = it })
                }
                Borders()
                Buttons()
                Dropdowns()
                Checkboxes()
                RadioButtons()
                Links()
                TextAreas()
                TextFields()
                // take this at the end, because it's a bit taller
                Row {
                    Column(Modifier.fillMaxWidth().weight(1f)) {
                        GroupHeader("Chips")
                        ChipsRow()
                    }
                    Column(Modifier.fillMaxWidth().weight(1f)) {
                        GroupHeader("Tree")
                        TreeSample()
                    }
                }
            }
            VerticalScrollbar(
                modifier = Modifier.align(Alignment.CenterEnd),
                adapter = rememberScrollbarAdapter(verticalScrollState)
            )
        }
    }
}

@Composable
fun ChipsRow(modifier: Modifier = Modifier) {
    Row(modifier) {
        BaseChip(
            enabled = true,
            onChipClick = {}
        ) {
            Text("Enabled")
        }
        BaseChip(
            enabled = false,
            onChipClick = {}
        ) {
            Text("Disabled")
        }
    }
}

@Composable
fun TreeSample(modifier: Modifier = Modifier) {
    val tree = remember {
        buildTree {
            addNode("root 1", false) {
                addLeaf("leaf 1")
                addLeaf("leaf 2")
            }
            addNode("root 2", false) {
                addLeaf("leaf 1")
                addNode("node 1", false) {
                    addLeaf("leaf 1")
                    addLeaf("leaf 2")
                }
            }
            addNode("root 3", false) {
                addLeaf("leaf 1")
                addLeaf("leaf 2")
            }
        }
    }
    IntelliJTree(
        Modifier.size(200.dp, 200.dp).then(modifier),
        onElementClick = {},
        onElementDoubleClick = {},
        tree = tree
    ) { element ->
        Text(element.data, modifier.padding(2.dp))
    }
}
