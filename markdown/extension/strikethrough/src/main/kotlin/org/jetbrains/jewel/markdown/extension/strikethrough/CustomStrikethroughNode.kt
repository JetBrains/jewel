package org.jetbrains.jewel.markdown.extension.strikethrough

import org.commonmark.ext.gfm.strikethrough.Strikethrough
import org.commonmark.node.Node
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.WithInlineMarkdown
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.jetbrains.jewel.markdown.processing.toInlineMarkdownOrNull

@GenerateDataFunctions
public class CustomStrikethroughNode(
    public val openingDelimiter: String,
    public val closingDelimiter: String,
    public override val inlineContent: List<InlineMarkdown>,
) : InlineMarkdown.CustomNode, WithInlineMarkdown {
    public constructor(
        node: Strikethrough,
        processor: MarkdownProcessor,
    ) : this(
        node.openingDelimiter,
        node.closingDelimiter,
        node.children().mapNotNull { it.toInlineMarkdownOrNull(processor, emptyList()) },
    )
}

private fun Node.children() =
    buildList<Node> {
        var current = this@children.firstChild
        while (current != null) {
            this.add(current)
            current = current.next
        }
    }
