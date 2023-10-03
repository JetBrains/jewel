package org.jetbrains.jewel.samples.ideplugin

import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.jetbrains.jewel.bridge.addComposeTab

@ExperimentalCoroutinesApi
internal class JewelDemoToolWindowFactory : ToolWindowFactory, DumbAware {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposeTab("Components") {
            ComponentShowcaseTab()
        }

        addSwingTab(toolWindow)

        toolWindow.addComposeTab("Compose Sample") {

        }
    }

    private fun addSwingTab(toolWindow: ToolWindow) {
        val manager = toolWindow.contentManager
        val tabContent = manager.factory.createContent(SwingDemoPanel(), "Swing Sample", true)
        tabContent.isCloseable = false
        manager.addContent(tabContent)
    }
}
