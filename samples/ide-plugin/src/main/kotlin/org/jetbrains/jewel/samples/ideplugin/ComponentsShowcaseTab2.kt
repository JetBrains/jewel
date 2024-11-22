package org.jetbrains.jewel.samples.ideplugin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.intellij.ui.components.JBScrollPane
import com.intellij.util.ui.components.BorderLayoutPanel
import java.awt.Component
import java.awt.Dimension
import javax.swing.BoxLayout
import javax.swing.JPanel
import org.jetbrains.jewel.bridge.JewelComposePanel
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.InformationBanner
import org.jetbrains.jewel.ui.component.Text

internal class ComponentsShowcaseTab2 : BorderLayoutPanel() {
    private val mainContent =
        JPanel().apply {
            layout = BoxLayout(this, BoxLayout.Y_AXIS)
            alignmentX = Component.LEFT_ALIGNMENT

            val composePanel =
                JewelComposePanel {
                        Column(Modifier.background(Color.White).padding(16.dp)) {
                            Text("Banners", style = JewelTheme.defaultTextStyle.copy(fontSize = 20.sp))
                            Spacer(modifier = Modifier.height(8.dp))
                            InformationBanner("This is an information banner in Compose")
                        }
                    }
                    .apply {
                        alignmentX = Component.LEFT_ALIGNMENT
                        preferredSize = Dimension(400, 100)
                        maximumSize = Dimension(Short.MAX_VALUE.toInt(), Short.MAX_VALUE.toInt())
                    }

            add(composePanel)
        }

    private val scrollingContainer =
        JBScrollPane(
            mainContent,
            JBScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JBScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED,
        )

    init {
        addToCenter(scrollingContainer)
        scrollingContainer.border = null
        scrollingContainer.isOpaque = false
        isOpaque = false
    }
}
