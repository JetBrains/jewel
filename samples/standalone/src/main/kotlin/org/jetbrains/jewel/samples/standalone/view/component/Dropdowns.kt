package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.random.Random
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.Dropdown
import org.jetbrains.jewel.ui.component.ListComboBox
import org.jetbrains.jewel.ui.component.SimpleListItem
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.component.separator
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.theme.comboBoxStyle

@Composable
fun Dropdowns() {
    Column {
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp), verticalAlignment = Alignment.CenterVertically) {
            val items = remember { listOf("Light", "Dark", "---", "High Contrast", "Darcula", "IntelliJ Light") }
            var selected by remember { mutableStateOf(items.first()) }

            Dropdown(enabled = false, menuContent = {}) { Text("Disabled") }
            Dropdown(
                menuContent = {
                    items.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(selected = selected == it, onClick = { selected = it }) { Text(it) }
                        }
                    }
                    separator()
                    submenu(
                        submenu = {
                            items.forEach {
                                if (it == "---") {
                                    separator()
                                } else {
                                    selectableItem(selected = selected == it, onClick = { selected = it }) { Text(it) }
                                }
                            }
                            separator()
                            submenu(
                                submenu = {
                                    items.forEach {
                                        if (it == "---") {
                                            separator()
                                        } else {
                                            selectableItem(selected = selected == it, onClick = { selected = it }) {
                                                Text(it)
                                            }
                                        }
                                    }
                                }
                            ) {
                                Text("Submenu2")
                            }
                        }
                    ) {
                        Text("Submenu")
                    }
                }
            ) {
                Text(selected)
            }
            Dropdown(
                outline = Outline.Error,
                menuContent = {
                    items.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(selected = selected == it, onClick = { selected = it }) { Text(it) }
                        }
                    }
                },
            ) {
                Text(selected)
            }
            Dropdown(
                menuContent = {
                    items.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(
                                iconKey = dropdownIconsSample.random(),
                                keybinding =
                                    if (Random.nextBoolean()) {
                                        null
                                    } else {
                                        dropdownKeybindingsSample.shuffled().take(2).toSet()
                                    },
                                selected = false,
                                onClick = {},
                            ) {
                                Text(it)
                            }
                        }
                    }
                    submenu(
                        submenu = {
                            items.forEach {
                                if (it == "---") {
                                    separator()
                                } else {
                                    selectableItem(
                                        iconKey = dropdownIconsSample.random(),
                                        keybinding =
                                            if (Random.nextBoolean()) {
                                                null
                                            } else {
                                                dropdownKeybindingsSample.shuffled().take(2).toSet()
                                            },
                                        selected = false,
                                        onClick = {},
                                    ) {
                                        Text(it)
                                    }
                                }
                            }
                            separator()
                            submenu(
                                submenu = {
                                    items.forEach {
                                        if (it == "---") {
                                            separator()
                                        } else {
                                            selectableItem(
                                                iconKey = dropdownIconsSample.random(),
                                                selected = false,
                                                onClick = {},
                                            ) {
                                                Text(it)
                                            }
                                        }
                                    }
                                }
                            ) {
                                Text("Submenu2")
                            }
                        }
                    ) {
                        Text("Submenu")
                    }
                }
            ) {
                Text("With icons")
            }
        }
    }

    val comboBoxItems = remember {
        listOf(
            "Cat",
            "Elephant",
            "Sun",
            "Book",
            "Laughter",
            "Whisper",
            "Ocean",
            "Serendipity lorem ipsum",
            "Umbrella",
            "Joy",
        )
    }
    var selectedComboBox: String? by remember { mutableStateOf(comboBoxItems.first()) }
    val inputTextFieldState = rememberTextFieldState(comboBoxItems.random())

    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "ComboBoxes", style = Typography.h1TextStyle())
        Text(text = "Selected item: $selectedComboBox")
        Text(text = "Input text: ${inputTextFieldState.text}")

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Column {
                Text("Enabled and Editable")
                ListComboBox(
                    items = comboBoxItems,
                    modifier = Modifier.width(200.dp),
                    onSelectedItemChange = { selectedComboBox = it },
                    listItemContent = { item, isSelected, isFocused ->
                        SimpleListItem(
                            text = item,
                            isSelected = isSelected,
                            style = JewelTheme.comboBoxStyle.itemStyle,
                            contentDescription = item,
                        )
                    },
                )
            }

            Column {
                Text("Enabled")
                ListComboBox(
                    items = comboBoxItems,
                    modifier = Modifier.width(200.dp),
                    isEditable = false,
                    onSelectedItemChange = { selectedComboBox = it },
                    listItemContent = { item, isSelected, isFocused ->
                        SimpleListItem(
                            text = item,
                            isSelected = isSelected,
                            style = JewelTheme.comboBoxStyle.itemStyle,
                            contentDescription = item,
                        )
                    },
                )
            }
            Column {
                Text("Disabled")
                ListComboBox(
                    items = comboBoxItems,
                    modifier = Modifier.width(200.dp),
                    isEditable = false,
                    isEnabled = false,
                    onSelectedItemChange = { selectedComboBox = it },
                    listItemContent = { item, isSelected, isFocused ->
                        SimpleListItem(
                            text = item,
                            isSelected = isSelected,
                            style = JewelTheme.comboBoxStyle.itemStyle,
                            contentDescription = item,
                        )
                    },
                )
            }
        }
    }
}

private val dropdownIconsSample = listOf(AllIconsKeys.Actions.Find, AllIconsKeys.Actions.Close, null)
private val dropdownKeybindingsSample = setOf("A", "B", "?", "?", "?")
