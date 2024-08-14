package org.jetbrains.jewel.markdown.extension.strikethrough

import org.commonmark.ext.gfm.strikethrough.Strikethrough
import org.commonmark.ext.gfm.strikethrough.StrikethroughExtension
import org.commonmark.node.CustomNode
import org.commonmark.parser.Parser.ParserExtension
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.extensions.MarkdownInlineProcessorExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor

public object StrikethroughProcessorExtension : MarkdownProcessorExtension {
    override val parserExtension: ParserExtension = StrikethroughExtension.create() as ParserExtension

    override val inlineProcessorExtension: MarkdownInlineProcessorExtension
        get() =
            object : MarkdownInlineProcessorExtension {
                override fun canProcess(node: CustomNode): Boolean = node is Strikethrough

                override fun processInlineMarkdown(
                    node: CustomNode,
                    markdownProcessor: MarkdownProcessor,
                    extensions: List<MarkdownProcessorExtension>,
                ): InlineMarkdown.CustomNode =
                    CustomStrikethroughNode(node as Strikethrough, markdownProcessor, extensions)
            }
}
