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
import org.jetbrains.jewel.internal.MenuItem
import org.jetbrains.jewel.internal.Text

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
                "High Contrast",
                "Darcula",
                "IntelliJ Light"
            )
        }
        var selected by remember { mutableStateOf(items.first()) }

        Dropdown(selected, items, content = {
            Text(it)
        }) {
            MenuItem(onClick = {
                selected = it
                true
            }) {
                Text(it)
            }
        }

        Dropdown(selected, items, error = true, content = {
            Text(it)
        }) {
            MenuItem(onClick = {
                selected = it
                true
            }) {
                Text(it)
            }
        }

        Dropdown(selected, items, enabled = false, content = {
            Text(it)
        }) {
            MenuItem(onClick = {
                selected = it
                true
            }) {
                Text(it)
            }
        }
    }
}
