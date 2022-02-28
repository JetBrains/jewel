package org.jetbrains.jewel.theme.idea

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposePanel
import androidx.compose.ui.res.painterResource
import com.intellij.openapi.Disposable
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import org.jetbrains.jewel.theme.intellij.components.LazyTreeElement
import org.jetbrains.jewel.theme.intellij.components.LazyTreeView
import org.jetbrains.jewel.theme.intellij.components.Text
import java.nio.file.Paths

internal class ProjectLifecycle : Disposable, CoroutineScope {

    override val coroutineContext = SupervisorJob()

    override fun dispose() = cancel()
}

@ExperimentalCoroutinesApi
internal class PKGSDemo : ToolWindowFactory, DumbAware {

    @OptIn(ExperimentalComposeUiApi::class)
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposeTab("Packages") {
            IntelliJTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Row {
                        Column {
                            LazyTreeView(
                                data = Paths.get(project.basePath ?: System.getProperty("user.dir")).toFile(),
                                isOpen = true,
                                pointer = painterResource("img_206683.png"),
                                childGenerator = { file ->
                                    when {
                                        file.isFile -> emptyList()
                                        file.isDirectory -> file.listFiles()?.map { LazyTreeElement(it, false) } ?: emptyList()
                                        else -> emptyList()
                                    }
                                },
                                elementContent = { file ->
                                    Text(file.name)
                                }
                            )
                        }
                    }
                }
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
