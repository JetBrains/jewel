package org.jetbrains.jewel.themes.darcula.idebridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.awt.ComposePanel
import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.wm.ToolWindow
import javax.swing.JLayeredPane

fun ToolWindow.addComposePanel(
    tabTitle: String,
    isLockable: Boolean = true,
    order: Int? = null,
    content: @Composable () -> Unit
) {
    val panel = DataProviderComposePanel()
    val swingContent = contentManager.factory.createContent(panel, tabTitle, isLockable)
    if (order != null) contentManager.addContent(swingContent, order) else contentManager.addContent(swingContent)
    panel.setContent(content)
}

private class DataProviderComposePanel(private val panel: ComposePanel = ComposePanel()) : JLayeredPane(), DataProvider {

    init {
        add(panel)
    }

    override fun setBounds(x: Int, y: Int, width: Int, height: Int) {
        super.setBounds(x, y, width, height)
        panel.setBounds(x, y, width, height)
    }

    private val dataProvidersMap = mutableMapOf<String, LinkedHashSet<DataHolder>>()

    /**
     * Sets Compose content of the ComposePanel.
     *
     * @param content Composable content of the ComposePanel.
     */
    fun setContent(content: @Composable () -> Unit) {
        panel.setContent {
            CompositionLocalProvider(
                LocalDataProviders provides dataProvidersMap,
            ) {
                content()
            }
        }
    }

    override fun getData(dataId: String) =
        dataProvidersMap[dataId]
            ?.lastOrNull { it.hasFocus }
            ?.dataProvider
            ?.invoke()

}
