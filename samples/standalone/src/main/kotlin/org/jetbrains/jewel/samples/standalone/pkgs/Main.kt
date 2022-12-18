package org.jetbrains.jewel.samples.standalone.expui.pkgs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.compose.splitpane.ExperimentalSplitPaneApi
import org.jetbrains.compose.splitpane.HorizontalSplitPane
import org.jetbrains.compose.splitpane.SplitPaneScope
import org.jetbrains.compose.splitpane.rememberSplitPaneState
import org.jetbrains.jewel.LocalPalette
import org.jetbrains.jewel.components.Icon
import org.jetbrains.jewel.components.Text
import org.jetbrains.jewel.foundation.tree.Tree
import org.jetbrains.jewel.foundation.tree.asTree
import org.jetbrains.jewel.modifiers.BorderAlignment
import org.jetbrains.jewel.modifiers.border
import org.jetbrains.jewel.samples.standalone.JBTheme
import org.jetbrains.jewel.themes.intui.standalone.control.IntelliJTree
import org.jetbrains.skiko.Cursor
import java.nio.file.Paths

@OptIn(ExperimentalSplitPaneApi::class)
fun main() = singleWindowApplication {
    var isDark by remember { mutableStateOf(false) }
    val tree = remember { Paths.get(System.getProperty("user.dir")).asTree() }
    val leafIconSet = remember { setOf("gradleIcon.svg", "nodejsIcon.svg") }
    val nodeIcon = remember { "folderIcon.svg" }

    JBTheme(isNewUi = true, isDark = isDark) {
        val pkgsViewModel = remember { PackageSearchViewModel() }
        val splitPanelState = rememberSplitPaneState(initialPositionPercentage = .12f)
        val palette = LocalPalette.current
        Column {
            HorizontalSplitPane(splitPaneState = splitPanelState) {
                first {
                    Column(Modifier.padding(end = 8.dp)) {
                        IntelliJTree(
                            tree = tree
                        ) {
                            Row {
                                val icon: String = remember { if (it is Tree.Element.Node) nodeIcon else leafIconSet.random() }
                                Icon(resource = "icons/" + icon)
                                Text(modifier = Modifier.fillMaxWidth(), text = it.data.name, softWrap = false, fontSize = 18.sp)
                            }
                        }
                    }
                }
                defaultPKGSSplitter(palette.controlStroke, PointerIcon(Cursor(Cursor.E_RESIZE_CURSOR)))
                second {
                    val innerSplitPaneState = rememberSplitPaneState(initialPositionPercentage = .80f)
                    HorizontalSplitPane(Modifier.padding(start = 8.dp), splitPaneState = innerSplitPaneState) {
                        first {
                            PackageSearchBox(
                                textSearchState = pkgsViewModel.inputText,
                                onTextValueChange = { pkgsViewModel.inputText = it },
                                availableFilters = pkgsViewModel.searchFilters,
                                searchResultsStateList = pkgsViewModel.searchResults,
                                onSearchResultClick = { pkgsViewModel.selectedResult.value = it },
                                selectedModule = pkgsViewModel.selectedModule,
                                addedModules = pkgsViewModel.addedModules.value
                            )
                        }
                        defaultPKGSSplitter(palette.controlStroke, PointerIcon(Cursor(Cursor.E_RESIZE_CURSOR)))
                        second {
                            Box(Modifier.padding(8.dp).border(BorderAlignment.Inside, 1.dp, palette.controlStroke).padding(8.dp)) {
                                Text("there is the last box to fit with others information about selected package")
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalSplitPaneApi::class)
fun SplitPaneScope.defaultPKGSSplitter(
    splitterColor: Color,
    cursor: PointerIcon
) {
    splitter {
        visiblePart {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(4.dp)
                    .background(splitterColor)
            )
        }
        handle {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(10.dp)
                    .markAsHandle()
                    .pointerHoverIcon(cursor)
            )
        }
    }
}
