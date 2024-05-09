package org.jetbrains.jewel.samples.standalone.view.markdown

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.markdown.standalone.ProvideMarkdownStyling
import org.jetbrains.jewel.intui.markdown.standalone.dark
import org.jetbrains.jewel.intui.markdown.standalone.light
import org.jetbrains.jewel.intui.markdown.standalone.styling.dark
import org.jetbrains.jewel.intui.markdown.standalone.styling.extension.github.alerts.dark
import org.jetbrains.jewel.intui.markdown.standalone.styling.extension.github.alerts.light
import org.jetbrains.jewel.intui.markdown.standalone.styling.light
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extension.autolink.AutolinkProcessorExtension
import org.jetbrains.jewel.markdown.extensions.LazyMarkdown
import org.jetbrains.jewel.markdown.extensions.github.alerts.AlertStyling
import org.jetbrains.jewel.markdown.extensions.github.alerts.GitHubAlertProcessorExtension
import org.jetbrains.jewel.markdown.extensions.github.alerts.GitHubAlertRendererExtension
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.jetbrains.jewel.markdown.rendering.InlineMarkdownRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.ui.component.VerticalScrollbar
import java.awt.Desktop
import java.net.URI

@Composable
internal fun MarkdownPreview(
    rawMarkdown: String,
    modifier: Modifier = Modifier,
) {
    val isDark = JewelTheme.isDark

    val markdownStyling =
        remember(isDark) { if (isDark) MarkdownStyling.dark() else MarkdownStyling.light() }

    var markdownBlocks by remember { mutableStateOf(emptyList<MarkdownBlock>()) }
    val extensions = listOf(GitHubAlertProcessorExtension, AutolinkProcessorExtension)
    val processor = remember { MarkdownProcessor(extensions) }

    LaunchedEffect(rawMarkdown) {
        // TODO you may want to debounce or drop on backpressure, in real usages. You should also not do this
        //  in the UI to begin with.
        @Suppress("InjectDispatcher") // This should never go in the composable IRL
        markdownBlocks = withContext(Dispatchers.Default) { processor.processMarkdownDocument(rawMarkdown) }
    }

    val blockRenderer =
        remember(markdownStyling, extensions) {
            if (isDark) {
                MarkdownBlockRenderer.dark(
                    styling = markdownStyling,
                    rendererExtensions = listOf(GitHubAlertRendererExtension(AlertStyling.dark(), markdownStyling)),
                    inlineRenderer = InlineMarkdownRenderer.default(extensions),
                )
            } else {
                MarkdownBlockRenderer.light(
                    styling = markdownStyling,
                    rendererExtensions = listOf(GitHubAlertRendererExtension(AlertStyling.light(), markdownStyling)),
                    inlineRenderer = InlineMarkdownRenderer.default(extensions),
                )
            }
        }

    // Using the values from the GitHub rendering to ensure contrast
    val background = remember(isDark) { if (isDark) Color(0xff0d1117) else Color.White }

    ProvideMarkdownStyling(markdownStyling, blockRenderer) {
        Box(modifier.background(background)) {
            val lazyListState = rememberLazyListState()
            LazyMarkdown(
                markdownBlocks = markdownBlocks,
                modifier = modifier.background(background),
                contentPadding = PaddingValues(16.dp),
                state = lazyListState,
                selectable = true,
                onUrlClick = { url -> Desktop.getDesktop().browse(URI.create(url)) },
            )

            VerticalScrollbar(
                rememberScrollbarAdapter(lazyListState),
                Modifier.align(Alignment.TopEnd).fillMaxHeight().padding(2.dp),
            )
        }
    }
}
