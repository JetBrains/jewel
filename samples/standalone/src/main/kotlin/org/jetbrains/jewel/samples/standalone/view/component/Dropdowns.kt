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
import org.jetbrains.jewel.ui.Outline
import org.jetbrains.jewel.ui.component.ComboBox
import org.jetbrains.jewel.ui.component.Dropdown
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.component.separator
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import kotlin.random.Random

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

    val itemsComboBox = remember {
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
    var selectedComboBox: String? by remember { mutableStateOf(itemsComboBox.first()) }
    val inputTextFieldState = rememberTextFieldState(itemsComboBox.random())
    val inputTextFieldState2 = rememberTextFieldState(itemsComboBox.random())
    val inputTextFieldState3 = rememberTextFieldState(itemsComboBox.random())
    val inputTextFieldState4 = rememberTextFieldState(itemsComboBox.random())
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "ComboBoxes", style = Typography.h1TextStyle())
        Text(text = "Selected item: $selectedComboBox")
        Text(text = "Input text: ${inputTextFieldState.text}")

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            ComboBox(
                modifier = Modifier.width(140.dp),
                isEditable = false,
                inputTextFieldState = inputTextFieldState,
                menuContent = {
                    itemsComboBox.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(
                                selected = selectedComboBox == it,
                                onClick = {
                                    selectedComboBox = it
                                    inputTextFieldState.edit { replace(0, length, it) }
                                },
                            ) {
                                Text(it)
                            }
                        }
                    }
                },
            )

            ComboBox(
                modifier = Modifier.width(140.dp),
                inputTextFieldState = inputTextFieldState2,
                menuContent = {
                    itemsComboBox.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(
                                selected = selectedComboBox == it,
                                onClick = {
                                    selectedComboBox = it
                                    inputTextFieldState.edit { replace(0, length, it) }
                                },
                            ) {
                                Text(it)
                            }
                        }
                    }
                },
            )
            ComboBox(
                modifier = Modifier.width(140.dp),
                inputTextFieldState = inputTextFieldState3,
                outline = Outline.Warning,
                menuContent = {
                    itemsComboBox.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(
                                selected = selectedComboBox == it,
                                onClick = {
                                    selectedComboBox = it
                                    inputTextFieldState.edit { replace(0, length, it) }
                                },
                            ) {
                                Text(it)
                            }
                        }
                    }
                },
            )

            ComboBox(
                inputTextFieldState = inputTextFieldState4,
                outline = Outline.Error,
                menuContent = {
                    itemsComboBox.forEach {
                        if (it == "---") {
                            separator()
                        } else {
                            selectableItem(
                                selected = selectedComboBox == it,
                                onClick = {
                                    selectedComboBox = it
                                    inputTextFieldState.edit { replace(0, length, it) }
                                },
                            ) {
                                Text(it)
                            }
                        }
                    }
                },
            )
        }
    }
}

private val dropdownIconsSample = listOf(AllIconsKeys.Actions.Find, AllIconsKeys.Actions.Close, null)
private val dropdownKeybindingsSample = setOf("A", "B", "?", "?", "?")
