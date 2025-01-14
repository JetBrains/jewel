package org.jetbrains.jewel.markdown

import org.jetbrains.jewel.foundation.GenerateDataFunctions

/**
 * An inline Markdown node, usually found as content for [block-level elements][MarkdownBlock] or other inline nodes
 * annotated with the [WithInlineMarkdown] interface.
 */
public sealed interface InlineMarkdown {
    @GenerateDataFunctions public class Code(override val content: String) : InlineMarkdown, WithTextContent

    /**
     * An inline node that is delimited by a fixed delimiter, and can be rendered directly into an
     * [androidx.compose.ui.text.AnnotatedString].
     *
     * This type of node can be parsed by a
     * [org.jetbrains.jewel.markdown.extensions.MarkdownDelimitedInlineProcessorExtension] and rendered by a
     * [org.jetbrains.jewel.markdown.extensions.MarkdownDelimitedInlineRendererExtension].
     */
    public interface CustomDelimitedNode : InlineMarkdown, WithInlineMarkdown {
        /**
         * The string used to indicate the beginning of this type of inline node. Can be identical to the
         * [closingDelimiter].
         */
        public val openingDelimiter: String

        /**
         * The string used to indicate the end of this type of inline node. Can be identical to the [openingDelimiter].
         */
        public val closingDelimiter: String
            get() = openingDelimiter
    }

    @GenerateDataFunctions
    public class Emphasis(public val delimiter: String, override val inlineContent: List<InlineMarkdown>) :
        InlineMarkdown, WithInlineMarkdown {
        public constructor(
            delimiter: String,
            vararg inlineContent: InlineMarkdown,
        ) : this(delimiter, inlineContent.toList())
    }

    public data object HardLineBreak : InlineMarkdown

    @GenerateDataFunctions public class HtmlInline(override val content: String) : InlineMarkdown, WithTextContent

    @GenerateDataFunctions
    public class Image(
        public val source: String,
        public val alt: String,
        public val title: String?,
        override val inlineContent: List<InlineMarkdown>,
    ) : InlineMarkdown, WithInlineMarkdown {
        public constructor(
            source: String,
            alt: String,
            title: String?,
            vararg inlineContent: InlineMarkdown,
        ) : this(source, alt, title, inlineContent.toList())
    }

    @GenerateDataFunctions
    public class Link(
        public val destination: String,
        public val title: String?,
        override val inlineContent: List<InlineMarkdown>,
    ) : InlineMarkdown, WithInlineMarkdown {
        public constructor(
            destination: String,
            title: String?,
            vararg inlineContent: InlineMarkdown,
        ) : this(destination, title, inlineContent.toList())
    }

    public data object SoftLineBreak : InlineMarkdown

    @GenerateDataFunctions
    public class StrongEmphasis(public val delimiter: String, override val inlineContent: List<InlineMarkdown>) :
        InlineMarkdown, WithInlineMarkdown {
        public constructor(
            delimiter: String,
            vararg inlineContent: InlineMarkdown,
        ) : this(delimiter, inlineContent.toList())
    }

    @GenerateDataFunctions public class Text(override val content: String) : InlineMarkdown, WithTextContent
}
