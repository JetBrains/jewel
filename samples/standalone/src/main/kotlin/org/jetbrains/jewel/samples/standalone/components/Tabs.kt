@file:Suppress("MagicNumber")

package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.GroupHeader
import org.jetbrains.jewel.TabStrip

@Composable
fun Tabs() {
    GroupHeader("Tabs")
    TabStrip {
        tab(
            selected = true,
            label = "Default Tab 1",
            closable = true
        )
        tab(
            selected = false,
            label = "Default Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            label = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            label = "Editor Tab 2",
            closable = true
        )
    }
}
