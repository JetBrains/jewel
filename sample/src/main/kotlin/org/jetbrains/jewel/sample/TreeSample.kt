@file:OptIn(ExperimentalTime::class, ExperimentalComposeUiApi::class)

package org.jetbrains.jewel.sample

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.isCtrlPressed
import androidx.compose.ui.input.pointer.isMetaPressed
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.launch
import org.jetbrains.jewel.theme.intellij.IntelliJTheme
import org.jetbrains.jewel.theme.intellij.LocalPalette
import org.jetbrains.jewel.theme.intellij.components.Checkbox
import org.jetbrains.jewel.theme.intellij.components.Text
import org.jetbrains.jewel.theme.intellij.components.Tree
import org.jetbrains.jewel.theme.intellij.components.TreeView
import org.jetbrains.jewel.theme.intellij.components.asTree
import org.jetbrains.skiko.hostOs
import java.io.File
import java.nio.file.Paths
import kotlin.math.min
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
                val focusManager = LocalFocusManager.current
                val listState = rememberLazyListState()
                val scope = rememberCoroutineScope()

                val onTreeNodeToggle: (Tree.Element.Node<File>) -> Unit = { tree = tree.replaceElement(it, it.copy(isOpen = !it.isOpen)) }

                TreeView(
                    tree = tree,
                    onTreeNodeToggle = onTreeNodeToggle,
                    state = listState,
                    onTreeElementClick = {
                        val isMultiSelectionKeyPressed = when {
                            hostOs.isWindows || hostOs.isLinux -> keyboardModifiers.isCtrlPressed
                            hostOs.isMacOS -> keyboardModifiers.isMetaPressed
                            else -> false
                        }
                        tree = when {
                            isMultiSelectionKeyPressed -> {
                                val elements =
                                    tree.flattenedTree.filter { it.treeElement.isSelected }.map { it.treeElement }.toSet()
                                tree.selectElements(if (it.isSelected) elements - it else elements + it)
                            }
                            else -> tree.selectOnly(it)
                        }
                    },
                    onTreeElementDoubleClick = {
                        when (it) {
                            is Tree.Element.Leaf -> println("CIAO ${it.data.absolutePath}")
                            is Tree.Element.Node -> tree = tree.replaceElement(it, it.copy(isOpen = !it.isOpen))
                        }
                    },
                    onKeyPressed = { keyEvent, index, (element, depth) ->

                        fun moveFocusDown(): Boolean {
                            scope.launch {
                                val newIndex = index + 1
                                if (newIndex + 3 !in listState.visibleItemsRange) {
                                    val fistVisibleItemIndex = listState.layoutInfo.visibleItemsInfo.first().index
                                    listState.scrollToItem(fistVisibleItemIndex + 1, 1)
                                }
                                focusManager.moveFocus(FocusDirection.Down)
                                tree = tree.selectOnly(tree.flattenedTree[newIndex].treeElement)
                            }
                            return true
                        }

                        fun moveFocusUp(): Boolean {
                            scope.launch {
                                val newIndex = index - 1
                                if (newIndex - 2 >= 0 && newIndex - 3 !in listState.visibleItemsRange) {
                                    listState.scrollToItem(newIndex - 2)
                                }
                                focusManager.moveFocus(FocusDirection.Up)
                                tree = tree.selectOnly(tree.flattenedTree[newIndex].treeElement)
                            }
                            return true
                        }

                        when {
                            keyEvent.type != KeyEventType.KeyUp -> false
                            index > 0 && keyEvent.key == Key.DirectionUp -> moveFocusUp()
                            index < tree.flattenedTree.lastIndex && keyEvent.key == Key.DirectionDown -> moveFocusDown()
                            keyEvent.key == Key.DirectionRight -> when {
                                element is Tree.Element.Node<File> && !element.isOpen -> {
                                    onTreeNodeToggle(element)
                                    true
                                }
                                index < tree.flattenedTree.lastIndex -> moveFocusDown()
                                else -> false
                            }
                            keyEvent.key == Key.DirectionLeft -> when {
                                element is Tree.Element.Node<File> && element.isOpen -> {
                                    onTreeNodeToggle(element)
                                    true
                                }
                                index > 0 -> when (element) {
                                    !in tree.heads -> {
                                        var parentDistance = -1
                                        var currentIndex = index
                                        val parentDepth = depth - 1
                                        if (parentDepth == 0) {
                                            parentDistance = currentIndex
                                            currentIndex = 0
                                        } else {
                                            while (currentIndex > 0) {
                                                currentIndex--
                                                if (tree.flattenedTree[currentIndex].depth == parentDepth) {
                                                    parentDistance = index - currentIndex
                                                    break
                                                }
                                            }
                                        }
                                        check(parentDistance >= 0) { "Cannot find parent of $element" }
                                        scope.launch {
                                            repeat(min(listState.layoutInfo.visibleItemsInfo.size, parentDistance)) {
                                                focusManager.moveFocus(FocusDirection.Up)
                                            }
                                            val newSelection = tree.flattenedTree[currentIndex].treeElement
                                            tree = tree.selectOnly(newSelection)
                                            if (currentIndex - 1 !in listState.visibleItemsRange) {
                                                listState.animateScrollToItem(currentIndex)
                                            }
                                        }
                                        true
                                    }
                                    else -> {
                                        true
                                    }
                                }
                                else -> false
                            }
                            else -> false
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
