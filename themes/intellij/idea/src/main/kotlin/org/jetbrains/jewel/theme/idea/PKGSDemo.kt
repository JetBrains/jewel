package org.jetbrains.jewel.theme.idea

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.awt.ComposePanel
import androidx.compose.ui.res.loadSvgPainter
import androidx.compose.ui.unit.Density
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.jetbrains.jewel.theme.intellij.components.Text
import org.jetbrains.jewel.theme.intellij.components.TreeView
import org.jetbrains.jewel.theme.intellij.components.asTree
import java.io.File
import java.nio.file.Paths

@ExperimentalCoroutinesApi
internal class PKGSDemo : ToolWindowFactory, DumbAware {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposeTab("Packages") {
            IntelliJTheme {
                var tree by remember { mutableStateOf(Paths.get(project.basePath ?: System.getProperty("user.dir")).asTree()) }
                TreeView(
                    tree = tree,
                    onArrowClicked = {
                        tree = tree.replaceElement(it, it.copy(isOpen = !it.isOpen))
                    },
                    arrowPainter = remember {
                        loadSvgPainter(
                            File("D:\\projects\\jewel\\themes\\intellij\\idea\\src\\main\\resources\\navigate_next.svg")
                                .inputStream(), Density(1f)
                        )
                    },
                    nodeContent = { Text("[${it.data.name}]") },
                    leafContent = { Text(it.data.name) }
                )
            }
        }
    }
}

internal fun ToolWindow.addComposeTab(
    displayName: String,
    isLockable: Boolean = true,
    content: @Composable () -> Unit
) = ComposePanel(content = content)
    .also { contentManager.addContent(contentManager.factory.createContent(it, displayName, isLockable)) }

internal fun ComposePanel(
    height: Int = 800,
    width: Int = 800,
    y: Int = 0,
    x: Int = 0,
    content: @Composable () -> Unit
): ComposePanel {
    val panel = ComposePanel()
    panel.setBounds(x, y, width, height)
    panel.setContent(content)
    return panel
}
