package org.jetbrains.jewel.samples.ideplugin

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.intellij.openapi.Disposable
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Disposer
import com.intellij.openapi.util.NlsContexts.TabTitle
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import org.jetbrains.jewel.bridge.addComposeTab
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.ideplugin.releasessample.ReleasesSampleCompose
import org.jetbrains.jewel.ui.component.HorizontalSplitLayout
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.rememberSplitLayoutState
import javax.swing.JComponent

@Suppress("unused")
@ExperimentalCoroutinesApi
internal class JewelDemoToolWindowFactory : ToolWindowFactory, DumbAware {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposeTab("Components") { ComponentShowcaseTab() }

        toolWindow.addComposeTab("Releases Demo") { ReleasesSampleCompose(project) }
        toolWindow.addComposeTab("SplitLayout Demo") {
            Column(Modifier.fillMaxSize()) {
                HorizontalSplitLayout(
                    state = rememberSplitLayoutState(0.3f),
                    first = {
                        Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
                            Text("Left Pane")
                        }
                    },
                    second = {
                        Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
                            Text("Right Pane")
                        }
                    },
                    modifier = Modifier.fillMaxWidth().weight(1f).border(1.dp, color = JewelTheme.globalColors.borders.normal),
                    firstPaneMinWidth = 300.dp,
                    secondPaneMinWidth = 200.dp,
                )
            }
        }

        toolWindow.addSwingTab(SwingComparisonTabPanel(), "Swing Comparison")

        toolWindow.addComposeTab("Scrollbars Sample") { ScrollbarsShowcaseTab() }
    }

    private fun ToolWindow.addSwingTab(component: JComponent, @TabTitle title: String) {
        val manager = contentManager
        val tabContent = manager.factory.createContent(component, title, true)
        tabContent.isCloseable = false
        manager.addContent(tabContent)
    }
}

@Suppress("InjectDispatcher") // This is likely wrong anyway, it's only for the demo
private fun Disposable.createCoroutineScope(): CoroutineScope {
    val job = SupervisorJob()
    val scopeDisposable = Disposable { job.cancel("Disposing") }
    Disposer.register(this, scopeDisposable)
    return CoroutineScope(job + Dispatchers.Default)
}
