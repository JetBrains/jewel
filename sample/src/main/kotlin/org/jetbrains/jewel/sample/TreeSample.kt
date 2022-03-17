@file:OptIn(ExperimentalTime::class, ExperimentalComposeUiApi::class)

package org.jetbrains.jewel.sample

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.theme.intellij.IntelliJTheme
import org.jetbrains.jewel.theme.intellij.LocalPalette
import org.jetbrains.jewel.theme.intellij.components.Checkbox
import org.jetbrains.jewel.theme.intellij.components.Text
import org.jetbrains.jewel.theme.intellij.components.Tree
import org.jetbrains.jewel.theme.intellij.components.TreeLayout
import org.jetbrains.jewel.theme.intellij.components.asTree
import java.nio.file.Paths
import kotlin.time.ExperimentalTime

val LazyListState.visibleItemsRange
    get() = firstVisibleItemIndex..firstVisibleItemIndex + layoutInfo.visibleItemsInfo.size

@Suppress("EXPERIMENTAL_IS_NOT_ENABLED")
@OptIn(ExperimentalFoundationApi::class)
fun main() = singleWindowApplication {
    var isDarkTheme by remember { mutableStateOf(true) }
    var tree by remember { mutableStateOf(Paths.get(System.getProperty("user.dir")).asTree(true)) }
    IntelliJTheme(isDarkTheme) {
        Column(Modifier.background(LocalPalette.current.background).fillMaxSize()) {
            Row(Modifier.focusable()) {
                Text("Dark theme:")
                Checkbox(checked = isDarkTheme, onCheckedChange = { isDarkTheme = it })
            }
            Row(Modifier.focusable()) {
                TreeLayout(
                    tree = tree,
                    onTreeChanged = { tree = it },
                    onTreeElementDoubleClick = {
                        when (it) {
                            is Tree.Element.Leaf -> println("CIAO ${it.data.absolutePath}")
                            is Tree.Element.Node -> tree = tree.replaceElement(it, it.copy(isOpen = !it.isOpen))
                        }
                    },
                    content = {
                        when (it) {
                            is Tree.Element.Leaf -> Text(it.data.name, overflow = TextOverflow.Visible, maxLines = 1)
                            is Tree.Element.Node -> Text("[${it.data.name}]", overflow = TextOverflow.Visible, maxLines = 1)
                        }
                    },
                )
            }
        }
    }
}
