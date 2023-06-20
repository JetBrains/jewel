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
import org.jetbrains.jewel.IntelliJTypography
import org.jetbrains.jewel.components.Button
import org.jetbrains.jewel.components.Checkbox
import org.jetbrains.jewel.components.CheckboxRow
import org.jetbrains.jewel.components.GroupHeader
import org.jetbrains.jewel.components.Icon
import org.jetbrains.jewel.components.RadioButtonRow
import org.jetbrains.jewel.components.Text
import org.jetbrains.jewel.components.TextField
import org.jetbrains.jewel.components.TextFieldHintState
import org.jetbrains.jewel.styles.IntelliJButtonStyleVariations
import org.jetbrains.jewel.styles.Styles
import org.jetbrains.jewel.styles.frame
import org.jetbrains.jewel.themes.darcula.standalone.darcula
import org.jetbrains.jewel.themes.intui.standalone.dark
import org.jetbrains.jewel.themes.intui.standalone.default
import org.jetbrains.jewel.themes.intui.standalone.light
import java.io.InputStream
import org.jetbrains.jewel.themes.darcula.standalone.default as defaultIj
import org.jetbrains.jewel.themes.darcula.standalone.light as lightIj
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
                    Button({}, enabled = false) {
                        Text("Disabled")
                    }
                    Button({}, variation = IntelliJButtonStyleVariations.DefaultButton) {
                        Text("OK")
                    }
                }
                GroupHeader("RadioButtons")
                Row(
                    modifier = Modifier.selectableGroup(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var selectedIndex by remember { mutableStateOf(0) }
                    val firstRadioButtonId = 0
                    RadioButtonRow(selectedIndex == firstRadioButtonId, {
                        selectedIndex = firstRadioButtonId
                    }) {
                        Text("First")
                    }
                    val secondRadioButtonId = 1
                    RadioButtonRow(selectedIndex == secondRadioButtonId, {
                        selectedIndex = secondRadioButtonId
                    }, enabled = false) {
                        Text("Second")
                    }
                    val thirdRadioButtonId = 2
                    RadioButtonRow(selectedIndex == thirdRadioButtonId, {
                        selectedIndex = thirdRadioButtonId
                    }) {
                        Text("Third")
                    }
                    val fourthRadioButtonId = 3
                    RadioButtonRow(selectedIndex == fourthRadioButtonId, {
                        selectedIndex = fourthRadioButtonId
                    }) {
                        Text("Fourth")
                    }
                }
                GroupHeader("TextFields")
                Row(
                    modifier = Modifier.selectableGroup(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var text1 by remember { mutableStateOf("Text Field") }
                    TextField(text1, onValueChange = { text1 = it })
                    var text2 by remember { mutableStateOf("Error Field") }
                    TextField(text2, onValueChange = { text2 = it }, hintState = TextFieldHintState.Error)
                    var text3 by remember { mutableStateOf("Warning Field") }
                    TextField(text3, onValueChange = { text3 = it }, hintState = TextFieldHintState.Warning)
                }
                Row(
                    modifier = Modifier.selectableGroup(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextField("Disabled", onValueChange = { }, enabled = false)
                    var text1 by remember { mutableStateOf("With Icons") }
                    TextField(
                        text1,
                        onValueChange = { text1 = it },
                        placeholder = {
                            Text("Placeholder")
                        },
                        leadingIcon = {
                            Icon("icons/search.svg")
                        },
                        trailingIcon = {
                            Icon("icons/close.svg")
                        }
                    )
                }
                GroupHeader("Progress Bar")
//                LoadingProgressBar()
            }
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
