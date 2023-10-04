package org.jetbrains.jewel.samples.ideplugin.swingsample

import com.intellij.ui.components.JBPanelWithEmptyText
import com.intellij.util.ImageLoader
import com.intellij.util.ui.ComponentWithEmptyText
import com.intellij.util.ui.ImageUtil
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.components.BorderLayoutPanel
import kotlinx.coroutines.CoroutineScope
import org.jetbrains.jewel.samples.ideplugin.ContentItem
import java.awt.BorderLayout
import java.awt.Color

internal class DetailsPanel(private val scope: CoroutineScope) : JBPanelWithEmptyText(BorderLayout()), ComponentWithEmptyText {

    fun display(contentItem: ContentItem?) {
        removeAll()

        val content = when (contentItem) {
            is ContentItem.AndroidRelease -> AndroidReleaseDetailsPanel(contentItem, scope)
            is ContentItem.AndroidStudio -> AndroidStudioDetailsPanel(contentItem, scope)
            null -> return
        }
        add(content, BorderLayout.CENTER)
    }
}

private abstract class ItemDetailsPanel(contentItem: ContentItem, scope: CoroutineScope) : BorderLayoutPanel() {

    private val imageContainer = ImageComponent(scope)

    init {
        val image = contentItem.imagePath
            ?.let { ImageLoader.loadFromResource(it, javaClass) }
            ?.let { ImageUtil.toBufferedImage(it) }
        imageContainer.image = image
        imageContainer.border = JBUI.Borders.customLine(Color.RED)

        addToTop(imageContainer)
    }
}

private class AndroidReleaseDetailsPanel(
    contentItem: ContentItem,
    scope: CoroutineScope
) : ItemDetailsPanel(contentItem, scope)

private class AndroidStudioDetailsPanel(
    contentItem: ContentItem,
    scope: CoroutineScope
) : ItemDetailsPanel(contentItem, scope)
