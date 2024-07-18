package org.jetbrains.jewel.markdown

import org.commonmark.node.Block
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.InternalJewelApi

public sealed interface MarkdownBlock {

    @GenerateDataFunctions
    public class BlockQuote(public val children: List<MarkdownBlock>) : MarkdownBlock

    public sealed interface CodeBlock : MarkdownBlock {
        public val content: String

        @GenerateDataFunctions
        public class IndentedCodeBlock(override val content: String) : CodeBlock

        @GenerateDataFunctions
        public class FencedCodeBlock(
            override val content: String,
            public val mimeType: MimeType?,
        ) : CodeBlock
    }

    public interface CustomBlock : MarkdownBlock

    @GenerateDataFunctions
    public class Heading(
        override val inlineContent: List<InlineMarkdown>,
        public val level: Int,
    ) : MarkdownBlock, BlockWithInlineMarkdown

    @GenerateDataFunctions
    public class HtmlBlock(public val content: String) : MarkdownBlock

    public sealed interface ListBlock : MarkdownBlock {
        public val children: List<ListItem>
        public val isTight: Boolean

        @GenerateDataFunctions
        public class OrderedList(
            override val children: List<ListItem>,
            override val isTight: Boolean,
            public val startFrom: Int,
            public val delimiter: String,
        ) : ListBlock

        @GenerateDataFunctions
        public class UnorderedList(
            override val children: List<ListItem>,
            override val isTight: Boolean,
            public val marker: String,
        ) : ListBlock
    }

    @GenerateDataFunctions
    public class ListItem(public val children: List<MarkdownBlock>) : MarkdownBlock

    public data object ThematicBreak : MarkdownBlock

    @GenerateDataFunctions
    public class Paragraph(
        override val inlineContent: List<InlineMarkdown>,
    ) : MarkdownBlock, BlockWithInlineMarkdown
}

public interface BlockWithInlineMarkdown {
    public val inlineContent: Iterable<InlineMarkdown>
}

@InternalJewelApi
public fun Block.readInlineContent(): Iterable<InlineMarkdown> =
    object : Iterable<InlineMarkdown> {
        override fun iterator(): Iterator<InlineMarkdown> =
            object : Iterator<InlineMarkdown> {
                var current = this@readInlineContent.firstChild

                override fun hasNext(): Boolean = current != null

                override fun next(): InlineMarkdown =
                    if (hasNext()) {
                        current.toInlineNode().also {
                            current = current.next
                        }
                    } else {
                        throw NoSuchElementException()
                    }
            }
    }
