package org.jetbrains.jewel.sample

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.isCtrlPressed
import androidx.compose.ui.input.pointer.isMetaPressed
import androidx.compose.ui.res.loadSvgPainter
import androidx.compose.ui.unit.Density
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import org.jetbrains.jewel.theme.intellij.IntelliJThemeLight
import org.jetbrains.jewel.theme.intellij.components.Text
import org.jetbrains.jewel.theme.intellij.components.Tree
import org.jetbrains.jewel.theme.intellij.components.TreeView
import org.jetbrains.jewel.theme.intellij.components.asTree
import org.jetbrains.skiko.hostOs
import java.io.File
import java.nio.file.Paths

@Suppress("EXPERIMENTAL_IS_NOT_ENABLED")
@OptIn(ExperimentalFoundationApi::class)
fun main() = singleWindowApplication {
    IntelliJThemeLight {
        val scope = rememberCoroutineScope()
        val treeChannel = remember { Channel<Tree<File>>(onBufferOverflow = BufferOverflow.DROP_OLDEST) }
        val tree by remember { treeChannel.consumeAsFlow() }
            .collectAsState(Paths.get(System.getProperty("user.dir")).asTree())
        TreeView(
            tree = tree,
            onTreeNodeToggle = {
                scope.launch {
                    treeChannel.send(tree.replaceElement(it, it.copy(isOpen = !it.isOpen)))
                }
            },
            onTreeElementClick = {
                scope.launch {
                    val isMultiSelectionKeyPressed = when {
                        hostOs.isWindows || hostOs.isLinux -> keyboardModifiers.isCtrlPressed
                        hostOs.isMacOS -> keyboardModifiers.isMetaPressed
                        else -> false
                    }
                    treeChannel.send(
                        when {
                            isMultiSelectionKeyPressed -> {
                                val elements =
                                    tree.flattenedTree.filter { it.treeElement.isSelected }.map { it.treeElement }.toSet()
                                tree.selectElements(if (it.isSelected) elements - it else elements + it)
                            }
                            else -> {
                                val selectOnly = tree.selectOnly(it)
                                selectOnly
                            }
                        }
                    )
                }

            },
            onTreeElementDoubleClick = {
                scope.launch {
                    when (it) {
                        is Tree.Element.Leaf -> println("CIAO ${it.data.absolutePath}")
                        is Tree.Element.Node -> treeChannel.send(tree.replaceElement(it, it.copy(isOpen = !it.isOpen)))
                    }
                }
            },
            arrowPainter = remember {
                loadSvgPainter(
                    File("/Users/lamberto.basti/IdeaProjects/jewel-github/themes/intellij/idea/src/main/resources/navigate_next.svg")
                        .inputStream(), Density(1f)
                )
            },
            nodeContent = { Text("[${it.data.name}]") },
            leafContent = { Text(it.data.name) },
            modifier = Modifier.fillMaxSize().background(Color.Green)
        )
    }
}
