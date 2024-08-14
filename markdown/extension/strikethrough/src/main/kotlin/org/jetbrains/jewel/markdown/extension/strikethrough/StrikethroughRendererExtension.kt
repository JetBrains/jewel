package org.jetbrains.jewel.markdown.extension.strikethrough

import androidx.compose.ui.text.AnnotatedString.Builder
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.WithInlineMarkdown
import org.jetbrains.jewel.markdown.extensions.MarkdownInlineRendererExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownRendererExtension
import org.jetbrains.jewel.markdown.rendering.InlineMarkdownRenderer
import org.jetbrains.jewel.markdown.rendering.InlinesStyling

public class StrikethroughRendererExtension(private val inlinesStyling: InlinesStyling) : MarkdownRendererExtension {
    override val inlineRenderer: MarkdownInlineRendererExtension
        get() =
            object : MarkdownInlineRendererExtension {
                override fun canRender(inline: InlineMarkdown.CustomNode): Boolean = inline is CustomStrikethroughNode

                override fun render(
                    builder: Builder,
                    inline: InlineMarkdown.CustomNode,
                    inlineRenderer: InlineMarkdownRenderer,
                    enabled: Boolean,
                ) {
                    val style = inlinesStyling.textStyle.copy(textDecoration = TextDecoration.LineThrough).toSpanStyle()
                    builder.withStyle(style) {
                        val inlineMarkdowns = (inline as? WithInlineMarkdown)?.inlineContent ?: emptyList()
                        for (markdown in inlineMarkdowns) {
                            append(
                                inlineRenderer.renderAsAnnotatedString(listOf(markdown), inlinesStyling, enabled = true)
                            )
                        }
                    }
                }
            }
}
