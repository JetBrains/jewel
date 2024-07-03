package org.jetbrains.jewel.markdown

import org.commonmark.node.Node
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.markdown.InlineMarkdown.Code
import org.jetbrains.jewel.markdown.InlineMarkdown.CustomNode
import org.jetbrains.jewel.markdown.InlineMarkdown.Emphasis
import org.jetbrains.jewel.markdown.InlineMarkdown.HardLineBreak
import org.jetbrains.jewel.markdown.InlineMarkdown.HtmlInline
import org.jetbrains.jewel.markdown.InlineMarkdown.Image
import org.jetbrains.jewel.markdown.InlineMarkdown.Link
import org.jetbrains.jewel.markdown.InlineMarkdown.SoftLineBreak
import org.jetbrains.jewel.markdown.InlineMarkdown.StrongEmphasis
import org.jetbrains.jewel.markdown.InlineMarkdown.Text
import org.commonmark.node.Code as CMCode
import org.commonmark.node.CustomNode as CMCustomNode
import org.commonmark.node.Emphasis as CMEmphasis
import org.commonmark.node.HardLineBreak as CMHardLineBreak
import org.commonmark.node.HtmlInline as CMHtmlInline
import org.commonmark.node.Image as CMImage
import org.commonmark.node.Link as CMLink
import org.commonmark.node.SoftLineBreak as CMSoftLineBreak
import org.commonmark.node.StrongEmphasis as CMStrongEmphasis
import org.commonmark.node.Text as CMText

/**
 * A run of inline Markdown used as content for
 * [block-level elements][MarkdownBlock].
 */
public sealed interface InlineMarkdown {
    @GenerateDataFunctions
    public class Code(
        public val literal: String,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMCode) : this(
            literal = nativeNode.literal.orEmpty(),
        )
    }

    public class CustomNode(private val nativeNode: CMCustomNode) : InlineMarkdown {
        //        TODO: implement for each child
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false
            if (!super.equals(other)) return false
            other as CustomNode
            return nativeNode == other.nativeNode
        }

        override fun hashCode(): Int = nativeNode.hashCode()
    }

    @GenerateDataFunctions
    public class Emphasis(
        public val children: List<InlineMarkdown>,
        public val delimiter: String?,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMEmphasis) : this(
            children = nativeNode.firstChild.children(),
            delimiter = nativeNode.openingDelimiter,
        )
    }

    public object HardLineBreak : InlineMarkdown {
        override fun equals(other: Any?): Boolean = this === other

        override fun hashCode(): Int = javaClass.hashCode()
    }

    @GenerateDataFunctions
    public class HtmlInline(
        public val literal: String,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMHtmlInline) : this(
            literal = nativeNode.literal.orEmpty(),
        )
    }

    @GenerateDataFunctions
    public class Image(
        public val destination: String,
        public val title: String,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMImage) : this(
            destination = nativeNode.destination.orEmpty(),
            title = nativeNode.title.orEmpty(),
        )
    }

    @GenerateDataFunctions
    public class Link(
        public val children: List<InlineMarkdown>,
        public val destination: String,
        public val title: String,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMLink) : this(
            children = nativeNode.children(),
            destination = nativeNode.destination.orEmpty(),
            title = nativeNode.title.orEmpty(),
        )
    }

    public object SoftLineBreak : InlineMarkdown {
        override fun equals(other: Any?): Boolean = this === other

        override fun hashCode(): Int = javaClass.hashCode()
    }

    @GenerateDataFunctions
    public class StrongEmphasis(
        public val children: List<InlineMarkdown>,
        public val delimiter: String?,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMStrongEmphasis) : this(
            children = nativeNode.children(),
            delimiter = nativeNode.openingDelimiter,
        )
    }

    @GenerateDataFunctions
    public class Text(
        public val children: List<InlineMarkdown>,
        public val literal: String,
    ) : InlineMarkdown {
        public constructor(nativeNode: CMText) : this(
            children = nativeNode.children(),
            literal = nativeNode.literal.orEmpty(),
        )
    }
}

public fun Node.toInlineNode(): InlineMarkdown =
    when (this) {
        is CMText -> Text(this)
        is CMLink -> Link(this)
        is CMEmphasis -> Emphasis(this)
        is CMStrongEmphasis -> StrongEmphasis(this)
        is CMCode -> Code(this)
        is CMHtmlInline -> HtmlInline(this)
        is CMImage -> Image(this)
        is CMHardLineBreak -> HardLineBreak
        is CMSoftLineBreak -> SoftLineBreak
        is CMCustomNode -> CustomNode(this)
        else -> error("Unexpected block $this")
    }

private fun Node.children(): List<InlineMarkdown> =
    buildList {
        var current = firstChild
        while (current != null) {
            add(current.toInlineNode())
            current = current.next
        }
    }
