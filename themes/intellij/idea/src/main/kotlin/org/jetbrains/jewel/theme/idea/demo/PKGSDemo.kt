@file:OptIn(ExperimentalFoundationApi::class)

package org.jetbrains.jewel.theme.idea.demo

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.jetbrains.jewel.theme.idea.IntelliJTheme
import org.jetbrains.jewel.theme.idea.addComposePanel
import org.jetbrains.jewel.theme.intellij.LocalPalette
import org.jetbrains.jewel.theme.intellij.components.NavigableTreeView
import org.jetbrains.jewel.theme.intellij.components.Text
import org.jetbrains.jewel.theme.intellij.components.Tree
import org.jetbrains.jewel.theme.intellij.components.asTree
import java.nio.file.Paths

val LazyListState.visibleItemsRange
    get() = firstVisibleItemIndex..firstVisibleItemIndex + layoutInfo.visibleItemsInfo.size

@ExperimentalCoroutinesApi
internal class PKGSDemo : ToolWindowFactory, DumbAware {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposePanel("Packages") {
            IntelliJTheme(this) {
                Box(modifier = Modifier.background(LocalPalette.current.background).fillMaxSize()) {

                    val treeMutableState = remember { mutableStateOf(Paths.get(project.basePath ?: System.getProperty("user.dir")).asTree(true)) }
                    var tree by treeMutableState

                    NavigableTreeView(
                        treeMutableState = treeMutableState,
                        onTreeElementDoubleClick = {
                            when (it) {
                                is Tree.Element.Leaf -> println("CIAO ${it.data.absolutePath}")
                                is Tree.Element.Node -> tree = tree.replaceElement(it, it.copy(isOpen = !it.isOpen))
                            }
                        },
                        content = {
                            when (it) {
                                is Tree.Element.Leaf -> Text(it.data.name)
                                is Tree.Element.Node -> Text("[${it.data.name}]")
                            }
                        },
                    )
                }
            }
        }
    }
}
