package org.jetbrains.jewel.markdown

import org.commonmark.node.Block
import org.commonmark.node.Node
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.commonmark.node.Heading as CMHeading
import org.commonmark.node.Paragraph as CMParagraph

public sealed interface MarkdownBlock {
    @GenerateDataFunctions
    public class BlockQuote(public val children: List<MarkdownBlock>) : MarkdownBlock

    public sealed interface CodeBlock : MarkdownBlock {
        public val content: String

        @GenerateDataFunctions
        public class IndentedCodeBlock(
            override val content: String,
        ) : CodeBlock

        @GenerateDataFunctions
        public class FencedCodeBlock(
            override val content: String,
            public val mimeType: MimeType?,
        ) : CodeBlock
    }

    public interface CustomBlock : MarkdownBlock

    @GenerateDataFunctions
    public class Heading(
        nativeBlock: CMHeading,
        override val inlineContent: List<InlineMarkdown> = nativeBlock.inlineContent(),
        public val level: Int = nativeBlock.level,
    ) : MarkdownBlock, BlockWithInlineMarkdown {
        private val nativeHeading = nativeBlock

        public fun renderToHtml(renderer: (Node) -> String): String =
            buildString {
                var current = nativeHeading.firstChild
                while (current != null) {
                    append(renderer(current).replace("\n", " "))
                    current = current.next
                }
            }
    }

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
    public class ListItem(
        public val children: List<MarkdownBlock>,
    ) : MarkdownBlock

    public object ThematicBreak : MarkdownBlock {
        override fun equals(other: Any?): Boolean = this === other

        override fun hashCode(): Int = javaClass.hashCode()
    }

    @GenerateDataFunctions
    public class Paragraph(
        nativeBlock: CMParagraph,
        override val inlineContent: List<InlineMarkdown> = nativeBlock.inlineContent(),
    ) : MarkdownBlock, BlockWithInlineMarkdown {
        private val nativeHeading = nativeBlock

        public fun renderToHtml(renderer: (Node) -> String): String =
            buildString {
                var current = nativeHeading.firstChild
                while (current != null) {
                    append(renderer(current).replace("\n", " "))
                    current = current.next
                }
            }
    }
}

public interface BlockWithInlineMarkdown {
    public val inlineContent: Iterable<InlineMarkdown>
}

private fun Block.inlineContent(): List<InlineMarkdown> =
    buildList {
        var current = firstChild
        while (current != null) {
            add(current.toInlineNode())
            current = current.next
        }
    }
