package org.jetbrains.jewel.samples.ideplugin.dialog

import com.intellij.openapi.ui.DialogWrapper
import java.awt.Dimension
import javax.swing.JComponent
import org.jetbrains.jewel.bridge.JewelComposePanel
import org.jetbrains.jewel.bridge.theme.default
import org.jetbrains.jewel.bridge.theme.macOs
import org.jetbrains.jewel.samples.showcase.views.ComponentsView
import org.jetbrains.jewel.samples.showcase.views.ComponentsViewModel
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility

internal class ComponentShowcaseDialog : DialogWrapper(true) {
    init {
        title = "Component Showcase"
        init()
    }

    override fun createCenterPanel(): JComponent {
        val dialogPanel = JewelComposePanel {
            val viewModel =
                ComponentsViewModel(
                    alwaysVisibleScrollbarVisibility = ScrollbarVisibility.AlwaysVisible.default(),
                    whenScrollingScrollbarVisibility = ScrollbarVisibility.WhenScrolling.macOs(),
                )
            ComponentsView(viewModel)
        }
        dialogPanel.preferredSize = Dimension(800, 600)
        return dialogPanel
    }
}
