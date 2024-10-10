package org.jetbrains.jewel.markdown.extension.strikethrough

import androidx.compose.ui.text.AnnotatedString.Builder
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextDecoration
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
                    with(builder) {
                        val popTo =
                            pushStyle(
                                inlinesStyling.textStyle
                                    .copy(textDecoration = TextDecoration.LineThrough)
                                    .toSpanStyle()
                                    .copy()
                            )
                        val inlineMarkdowns = (inline as? WithInlineMarkdown)?.inlineContent ?: emptyList()
                        for (markdown in inlineMarkdowns) {
                            append(
                                inlineRenderer.renderAsAnnotatedString(listOf(markdown), inlinesStyling, enabled = true)
                            )
                        }
                        pop(popTo)
                    }
                }
            }
}

private inline fun Builder.withStyles(spanStyle: SpanStyle, action: Builder.() -> Unit) {
    val popTo = pushStyle(spanStyle)
    action()
    pop(popTo)
}
