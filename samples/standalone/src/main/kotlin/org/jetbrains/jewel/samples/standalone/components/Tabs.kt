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
            tabNameString = "Default Tab 1",
            closable = true
        )
        tab(
            selected = false,
            tabNameString = "Default Tab 2",
            closable = true
        )
        editorTab(
            selected = true,
            tabNameString = "Editor Tab 1",
            closable = true
        )
        editorTab(
            selected = false,
            tabNameString = "Editor Tab 2",
            closable = true
        )
    }
}
