package org.jetbrains.jewel.samples.standalone

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.components.Text
import org.jetbrains.jewel.foundation.tree.DefaultTreeViewKeyActions
import org.jetbrains.jewel.foundation.tree.TreeView
import org.jetbrains.jewel.foundation.tree.asTree
import org.jetbrains.jewel.foundation.tree.rememberTreeState
import java.io.File
import java.nio.file.Paths

fun main() = singleWindowApplication {
    var isDark by remember { mutableStateOf(false) }
    val tree = Paths.get(System.getProperty("user.dir")).asTree()
    JetBrainsTheme(isNewUi = true, isDark = isDark) {
        val treeState = rememberTreeState()
        Column {
            println(treeState.selectedItemIndexes)
            Text(text = treeState.selectedItemIndexes.joinToString("-"))
            Text(text = treeState.selectedElements.joinToString { (it.data as? File)?.name.toString() + "\n" })
            TreeView(
                tree = tree,
                treeState = treeState,
                arrowContent = {
                    Text(text = if (it) "x" else "--")
                },
                keyActions = DefaultTreeViewKeyActions(treeState),
                selectionBackgroundColor = Color.Cyan,
                focusedBackgroundColor = Color.LightGray,
                selectionFocusedBackgroundColor = Color.Red
            ) {
                Text(it.data.name)
            }
        }
    }
}
