package org.jetbrains.jewel.samples.standalone.internal.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.Dropdown
import org.jetbrains.jewel.internal.GroupHeader
import org.jetbrains.jewel.internal.Text
import org.jetbrains.jewel.internal.divider

@Composable
fun ColumnScope.Dropdowns() {
    GroupHeader("Dropdowns")
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val items = remember {
            listOf(
                "Light",
                "Dark",
                "---",
                "High Contrast",
                "Darcula",
                "IntelliJ Light"
            )
        }
        var selected by remember { mutableStateOf(items.first()) }

        Dropdown(
            content = {
                Text(selected)
            }
        ) {
            items.forEach {
                if (it == "---") {
                    divider()
                } else {
                    selectableItem(selected == it, {
                        selected = it
                    }) {
                        Text(it)
                    }
                }
            }
            divider()
            submenu(submenu = {
                items.forEach {
                    if (it == "---") {
                        divider()
                    } else {
                        selectableItem(selected == it, {
                            selected = it
                        }) {
                            Text(it)
                        }
                    }
                }
            }) {
                Text("Submenu")
            }
        }
    }
}
