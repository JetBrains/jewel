package org.jetbrains.jewel.markdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import coil3.ImageLoader
import coil3.PlatformContext
import coil3.compose.setSingletonImageLoaderFactory
import coil3.memory.MemoryCache
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.intellij.lang.annotations.Language
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.markdown.extensions.markdownBlockRenderer
import org.jetbrains.jewel.markdown.extensions.markdownProcessor
import org.jetbrains.jewel.markdown.extensions.markdownStyling
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.jetbrains.jewel.markdown.rendering.DefaultMarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling

@ExperimentalJewelApi
@Composable
public fun Markdown(
    @Language("Markdown") markdown: String,
    modifier: Modifier = Modifier,
    selectable: Boolean = false,
    enabled: Boolean = true,
    renderingDispatcher: CoroutineDispatcher = Dispatchers.Default,
    onUrlClick: (String) -> Unit = {},
    onTextClick: () -> Unit = {},
    markdownStyling: MarkdownStyling = JewelTheme.markdownStyling,
    processor: MarkdownProcessor = JewelTheme.markdownProcessor,
    blockRenderer: MarkdownBlockRenderer = DefaultMarkdownBlockRenderer(markdownStyling),
) {
    var markdownBlocks by remember { mutableStateOf(emptyList<MarkdownBlock>()) }
    LaunchedEffect(markdown, processor) {
        markdownBlocks = withContext(renderingDispatcher) { processor.processMarkdownDocument(markdown) }
    }

    Markdown(
        markdownBlocks = markdownBlocks,
        markdown = markdown,
        modifier = modifier,
        selectable = selectable,
        enabled = enabled,
        onUrlClick = onUrlClick,
        onTextClick = onTextClick,
        markdownStyling = markdownStyling,
        blockRenderer = blockRenderer,
    )
}

@ExperimentalJewelApi
@Composable
public fun Markdown(
    markdownBlocks: List<MarkdownBlock>,
    markdown: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selectable: Boolean = false,
    onUrlClick: (String) -> Unit = {},
    onTextClick: () -> Unit = {},
    markdownStyling: MarkdownStyling = JewelTheme.markdownStyling,
    blockRenderer: MarkdownBlockRenderer = DefaultMarkdownBlockRenderer(markdownStyling),
) {
    // TODO: delete this once Jewel is moved to intellij-community repo
    setSingletonImageLoaderFactory(::createImageLoader)
    if (selectable) {
        SelectionContainer(modifier.semantics { rawMarkdown = markdown }) {
            Column(verticalArrangement = Arrangement.spacedBy(markdownStyling.blockVerticalSpacing)) {
                for (block in markdownBlocks) {
                    blockRenderer.render(block, enabled, onUrlClick, onTextClick)
                }
            }
        }
    } else {
        Column(
            modifier = modifier.semantics { rawMarkdown = markdown },
            verticalArrangement = Arrangement.spacedBy(markdownStyling.blockVerticalSpacing),
        ) {
            for (block in markdownBlocks) {
                blockRenderer.render(block, enabled, onUrlClick, onTextClick)
            }
        }
    }
}

@ExperimentalJewelApi
@Composable
public fun LazyMarkdown(
    markdownBlocks: List<MarkdownBlock>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    state: LazyListState = rememberLazyListState(),
    enabled: Boolean = true,
    selectable: Boolean = false,
    onUrlClick: (String) -> Unit = {},
    onTextClick: () -> Unit = {},
    markdownStyling: MarkdownStyling = JewelTheme.markdownStyling,
    blockRenderer: MarkdownBlockRenderer = JewelTheme.markdownBlockRenderer,
) {
    // TODO: delete this once Jewel is moved to intellij-community repo
    setSingletonImageLoaderFactory(::createImageLoader)
    if (selectable) {
        SelectionContainer(modifier) {
            LazyColumn(
                state = state,
                contentPadding = contentPadding,
                verticalArrangement = Arrangement.spacedBy(markdownStyling.blockVerticalSpacing),
            ) {
                items(markdownBlocks) { block -> blockRenderer.render(block, enabled, onUrlClick, onTextClick) }
            }
        }
    } else {
        LazyColumn(
            modifier = modifier,
            state = state,
            contentPadding = contentPadding,
            verticalArrangement = Arrangement.spacedBy(markdownStyling.blockVerticalSpacing),
        ) {
            items(markdownBlocks) { block -> blockRenderer.render(block, enabled, onUrlClick, onTextClick) }
        }
    }
}

private const val IMAGES_MEMORY_CACHE_SIZE = 24L * 1024 * 1024 // 24mb

/**
 * This method sets up an image loader with a memory cache but disables the disk cache. Disabling the disk cache is
 * necessary because Coil crashes when attempting to use the file system cache with IDEA platform.
 *
 * Otherwise Coil3 will throw java.lang.NoSuchMethodError: kotlinx.coroutines.CoroutineDispatcher.limitedParallelism
 */
private fun createImageLoader(context: PlatformContext) =
    ImageLoader.Builder(context)
        .memoryCache { MemoryCache.Builder().maxSizeBytes(IMAGES_MEMORY_CACHE_SIZE).build() }
        .diskCache(null)
        .build()
