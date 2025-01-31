package org.jetbrains.jewel.markdown.processing

import org.commonmark.node.Block
import org.commonmark.node.BlockQuote
import org.commonmark.node.BulletList
import org.commonmark.node.CustomBlock
import org.commonmark.node.Document
import org.commonmark.node.FencedCodeBlock
import org.commonmark.node.Heading
import org.commonmark.node.HtmlBlock
import org.commonmark.node.IndentedCodeBlock
import org.commonmark.node.ListBlock as CMListBlock
import org.commonmark.node.ListItem
import org.commonmark.node.Node
import org.commonmark.node.OrderedList
import org.commonmark.node.Paragraph
import org.commonmark.node.ThematicBreak
import org.commonmark.parser.Parser
import org.intellij.lang.annotations.Language
import org.jetbrains.annotations.TestOnly
import org.jetbrains.annotations.VisibleForTesting
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.InternalJewelApi
import org.jetbrains.jewel.foundation.code.MimeType
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.MarkdownBlock.CodeBlock
import org.jetbrains.jewel.markdown.MarkdownBlock.ListBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension
import org.jetbrains.jewel.markdown.rendering.DefaultInlineMarkdownRenderer

/**
 * Reads raw Markdown strings and processes them into a list of [MarkdownBlock].
 *
 * @param extensions Extensions to use when processing the Markdown (e.g., to support parsing custom block-level
 *   Markdown).
 * @param editorMode Indicates whether the processor should be optimized for an editor/preview scenario, where it
 *   assumes small incremental changes as performed by a user typing. This means it will only update the changed blocks
 *   by keeping state in memory.
 *
 *   Default is `false`; set this to `true` if this parser will be used in an editor scenario, where the raw Markdown is
 *   only ever going to change slightly but frequently (e.g., as the user types).
 *
 *   **Attention:** do **not** reuse or share an instance of [MarkdownProcessor] that is in [editorMode]. Processing
 *   entirely different Markdown strings will defeat the purpose of the optimization. When in editor mode, the instance
 *   of [MarkdownProcessor] is **not** thread-safe!
 *
 * @param commonMarkParser The CommonMark [Parser] used to parse the Markdown. By default it's a vanilla instance
 *   provided by the [MarkdownParserFactory], but you can provide your own if you need to customize the parser — e.g.,
 *   to ignore certain tags. If [optimizeEdits] is `true`, make sure you set
 *   `includeSourceSpans(IncludeSourceSpans.BLOCKS)` on the parser.
 */
@ExperimentalJewelApi
public class MarkdownProcessor(
    private val extensions: List<MarkdownProcessorExtension> = emptyList(),
    private val editorMode: Boolean = false,
    private val commonMarkParser: Parser = MarkdownParserFactory.create(editorMode, extensions),
) {
    private var currentState = State("", emptyList(), emptyList())

    @TestOnly internal fun getCurrentIndexesInTest() = currentState.indexes

    /**
     * Parses a Markdown document, translating from CommonMark 0.31.2 to a list of [MarkdownBlock]. Inline Markdown in
     * leaf nodes is contained in [InlineMarkdown], which can be rendered to an
     * [androidx.compose.ui.text.AnnotatedString] by using [DefaultInlineMarkdownRenderer.renderAsAnnotatedString].
     *
     * @param rawMarkdown the raw Markdown string to process.
     * @see DefaultInlineMarkdownRenderer
     */
    public fun processMarkdownDocument(@Language("Markdown") rawMarkdown: String): List<MarkdownBlock> {
        val blocks =
            if (editorMode) {
                processWithQuickEdits(rawMarkdown)
            } else {
                parseRawMarkdown(rawMarkdown)
            }

        return blocks.mapNotNull { child -> child.tryProcessMarkdownBlock() }
    }

    @VisibleForTesting
    internal fun processWithQuickEdits(@Language("Markdown") rawMarkdown: String): List<Block> {
        val (previousText, previousBlocks, previousIndexes) = currentState
        if (previousText == rawMarkdown) return previousBlocks
        // make sure we have at least one element
        if (previousIndexes.isEmpty()) {
            val newBlocks = parseRawMarkdown(rawMarkdown)
            currentState = State(rawMarkdown, newBlocks, newBlocks.map { it.sourceSpans.first().inputIndex })
            return newBlocks
        }
        val nCharsDelta = rawMarkdown.length - previousText.length
        val commonPrefix = previousText.commonPrefixWith(rawMarkdown)
        val prefixPos = commonPrefix.length
        // remove prefixes to avoid overlap
        val commonSuffix =
            previousText.removePrefix(commonPrefix).commonSuffixWith(rawMarkdown.removePrefix(commonPrefix))
        val suffixPos = previousText.length - commonSuffix.length
        // if modification starts at the edge, include previous by using less instead of less equal
        val firstBlock = previousIndexes.indexOfLast { it < prefixPos }.takeIf { it != -1 } ?: 0
        val blockAfterLast = previousIndexes.indexOfFirst { it > suffixPos }
        val updatedText =
            rawMarkdown.substring(
                previousIndexes[firstBlock],
                if (blockAfterLast == -1) rawMarkdown.length else previousIndexes[blockAfterLast] - 1 + nCharsDelta,
            )
        val updatedBlocks = parseRawMarkdown(updatedText)
        val updatedIndexes = updatedBlocks.map { it.sourceSpans.first().inputIndex + previousIndexes[firstBlock] }

        val suffixIndexes =
            if (blockAfterLast == -1) {
                emptyList()
            } else {
                previousIndexes.subList(blockAfterLast, previousIndexes.size).map { it + nCharsDelta }
            }
        val suffixBlocks =
            if (blockAfterLast == -1) emptyList() else previousBlocks.subList(blockAfterLast, previousBlocks.size)

        val newBlocks = previousBlocks.subList(0, firstBlock) + updatedBlocks + suffixBlocks
        val newIndexes = previousIndexes.subList(0, firstBlock) + updatedIndexes + suffixIndexes
        currentState = State(rawMarkdown, newBlocks, newIndexes)
        return newBlocks
    }

    private fun parseRawMarkdown(@Language("Markdown") rawMarkdown: String): List<Block> {
        val document =
            commonMarkParser.parse(rawMarkdown) as? Document ?: error("This doesn't look like a Markdown document")

        return buildList { document.forEachChild { child -> if (child is Block) add(child) } }
    }

    private fun Node.tryProcessMarkdownBlock(): MarkdownBlock? =
        // Non-Block children are ignored
        when (this) {
            is Paragraph -> toMarkdownParagraph()
            is Heading -> toMarkdownHeadingOrNull()
            is BulletList -> toMarkdownListOrNull()
            is OrderedList -> toMarkdownListOrNull()
            is BlockQuote -> toMarkdownBlockQuote()
            is FencedCodeBlock -> toMarkdownCodeBlockOrNull()
            is IndentedCodeBlock -> toMarkdownCodeBlockOrNull()
            is ThematicBreak -> MarkdownBlock.ThematicBreak
            is HtmlBlock -> toMarkdownHtmlBlockOrNull()
            is CustomBlock -> {
                extensions
                    .find { it.blockProcessorExtension?.canProcess(this) == true }
                    ?.blockProcessorExtension
                    ?.processMarkdownBlock(this, this@MarkdownProcessor)
            }

            else -> null
        }

    private fun Paragraph.toMarkdownParagraph(): MarkdownBlock.Paragraph =
        MarkdownBlock.Paragraph(readInlineContent().toList())

    private fun BlockQuote.toMarkdownBlockQuote(): MarkdownBlock.BlockQuote =
        MarkdownBlock.BlockQuote(processChildren(this))

    private fun Heading.toMarkdownHeadingOrNull(): MarkdownBlock.Heading? {
        if (level < 1 || level > 6) return null
        return MarkdownBlock.Heading(inlineContent = readInlineContent().toList(), level = level)
    }

    private fun FencedCodeBlock.toMarkdownCodeBlockOrNull(): CodeBlock.FencedCodeBlock =
        CodeBlock.FencedCodeBlock(
            content = literal.removeSuffix("\n"),
            mimeType = MimeType.Known.fromMarkdownLanguageName(info),
        )

    private fun IndentedCodeBlock.toMarkdownCodeBlockOrNull(): CodeBlock.IndentedCodeBlock =
        CodeBlock.IndentedCodeBlock(literal.trimEnd('\n'))

    private fun BulletList.toMarkdownListOrNull(): ListBlock.UnorderedList? {
        val children = processListItems()
        if (children.isEmpty()) return null

        return ListBlock.UnorderedList(children = children, isTight = isTight, marker = marker)
    }

    private fun OrderedList.toMarkdownListOrNull(): ListBlock.OrderedList? {
        val children = processListItems()
        if (children.isEmpty()) return null

        return ListBlock.OrderedList(
            children = children,
            isTight = isTight,
            startFrom = markerStartNumber,
            delimiter = markerDelimiter,
        )
    }

    private fun CMListBlock.processListItems() = buildList {
        forEachChild { child ->
            if (child !is ListItem) return@forEachChild
            add(MarkdownBlock.ListItem(processChildren(child)))
        }
    }

    /**
     * Processes the children of a CommonMark [Node]. This function is public so that it can be accessed from
     * [MarkdownProcessorExtension]s, but should not be used in other scenarios.
     */
    @InternalJewelApi
    public fun processChildren(node: Node): List<MarkdownBlock> = buildList {
        node.forEachChild { child ->
            val parsedBlock = child.tryProcessMarkdownBlock()
            if (parsedBlock != null) {
                add(parsedBlock)
            }
        }
    }

    private fun Node.forEachChild(action: (Node) -> Unit) {
        var child = firstChild

        while (child != null) {
            action(child)
            child = child.next
        }
    }

    private fun HtmlBlock.toMarkdownHtmlBlockOrNull(): MarkdownBlock.HtmlBlock? {
        if (literal.isBlank()) return null
        return MarkdownBlock.HtmlBlock(literal.trimEnd('\n'))
    }

    private fun Block.readInlineContent() = readInlineContent(this@MarkdownProcessor, extensions)

    /** Store parsed blocks and first char indexes for each block */
    private data class State(val text: String, val blocks: List<Block>, val indexes: List<Int>)
}
