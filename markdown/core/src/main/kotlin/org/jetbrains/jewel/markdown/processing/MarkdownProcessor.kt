package org.jetbrains.jewel.markdown.processing

import org.commonmark.node.Code
import org.commonmark.node.Document
import org.commonmark.node.Emphasis
import org.commonmark.node.HardLineBreak
import org.commonmark.node.HtmlInline
import org.commonmark.node.Image
import org.commonmark.node.Link
import org.commonmark.node.Node
import org.commonmark.node.SoftLineBreak
import org.commonmark.node.StrongEmphasis
import org.commonmark.node.Text
import org.commonmark.parser.Parser
import org.commonmark.renderer.text.TextContentRenderer
import org.intellij.lang.annotations.Language
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension
import org.jetbrains.jewel.markdown.rendering.DefaultInlineMarkdownRenderer
import org.jetbrains.jewel.markdown.toMarkdownBlock

@ExperimentalJewelApi
public class MarkdownProcessor(private val extensions: List<MarkdownProcessorExtension> = emptyList()) {

    public constructor(vararg extensions: MarkdownProcessorExtension) : this(extensions.toList())

    private val commonMarkParser =
        Parser.builder().extensions(extensions.map { it.parserExtension }).build()

    private val textContentRenderer =
        TextContentRenderer.builder()
            .extensions(extensions.map { it.textRendererExtension })
            .build()

    /**
     * Parses a Markdown document, translating from CommonMark 0.31.2
     * to a list of [MarkdownBlock]. Inline Markdown in leaf nodes
     * is contained in [InlineMarkdown], which can be rendered
     * to an [androidx.compose.ui.text.AnnotatedString] by using
     * [DefaultInlineMarkdownRenderer.renderAsAnnotatedString].
     *
     * The contents of [InlineMarkdown] is equivalent to the original, but
     * normalized and simplified, and cleaned up as follows:
     * * Replace HTML entities with the corresponding character (escaped, if it
     *   is necessary)
     * * Inline link and image references and omit the reference blocks
     * * Use the destination as text for links when no text is set (escaped, if
     *   it is necessary)
     * * Normalize link titles to always use double quotes as enclosing
     *   character
     * * Normalize backticks in inline code runs
     * * Convert links in image descriptions to plain text
     * * Drop empty nodes with no visual representation (e.g., links with no
     *   text and destination)
     * * Remove unnecessary escapes
     * * Escape non-formatting instances of ``*_`~<>[]()!`` for clarity
     *
     * The contents of code blocks aren't transformed in any way. HTML blocks
     * get their outer whitespace trimmed, and so does inline HTML.
     *
     * @see DefaultInlineMarkdownRenderer
     */
    public fun processMarkdownDocument(@Language("Markdown") rawMarkdown: String): List<MarkdownBlock> {
        val document =
            commonMarkParser.parse(rawMarkdown) as? Document
                ?: error("This doesn't look like a Markdown document")
        return buildList {
            document.forEachChild { child ->
                add(child.toMarkdownBlock())
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

    private fun StringBuilder.appendInlineMarkdownFrom(
        node: Node,
        allowLinks: Boolean = true,
        ignoreNestedEmphasis: Boolean = false,
    ) {
        var child = node.firstChild

        while (child != null) {
            when (child) {
                is Text -> append(child.literal.escapeInlineMarkdownChars())
                is Image -> appendImage(child)

                is Emphasis -> {
                    append(child.openingDelimiter)
                    appendInlineMarkdownFrom(child, !ignoreNestedEmphasis)
                    append(child.closingDelimiter)
                }

                is StrongEmphasis -> {
                    append(child.openingDelimiter)
                    appendInlineMarkdownFrom(child)
                    append(child.closingDelimiter)
                }

                is Code -> append(child.literal.asInlineCodeString())
                is Link -> appendLink(child, allowLinks)

                is HardLineBreak -> appendLine()
                is SoftLineBreak -> append(' ')
                is HtmlInline -> append(child.literal.trim())
            }
            child = child.next
        }
    }

    private fun StringBuilder.appendImage(child: Image) {
        append("![")
        appendInlineMarkdownFrom(child, allowLinks = false)

        // Escape dangling backslashes at the end of the text
        val backSlashCount = takeLastWhile { it == '\\' }.length
        if (backSlashCount % 2 != 0) append('\\')

        append("](")
        append(child.destination.escapeLinkDestination())

        if (!child.title.isNullOrBlank()) {
            append(" \"")
            append(child.title.replace("\"", "\\\"").trim())
            append('"')
        }
        append(')')
    }

    private fun StringBuilder.appendLink(child: Link, allowLinks: Boolean) {
        val hasText = child.firstChild != null
        if (child.destination.isNullOrBlank() && !hasText) {
            // Ignore links with no destination and no text
            return
        }

        if (allowLinks) {
            append('[')

            if (hasText) {
                // Link text cannot contain links — just in case...
                appendInlineMarkdownFrom(child, allowLinks = false)

                // Escape dangling backslashes at the end of the text
                val backSlashCount = takeLastWhile { it == '\\' }.length
                if (backSlashCount % 2 != 0) append('\\')
            } else {
                // No text: use the destination
                append(child.destination.escapeLinkDestinationForUseInText())
            }

            append("](")
            append(child.destination.escapeLinkDestination())

            if (!child.title.isNullOrBlank()) {
                append(" \"")
                append(child.title.replace("\"", "\\\"").trim())
                append('"')
            }
            append(')')
        } else {
            append(plainTextContents(child))
        }
    }

    private fun String.escapeLinkDestinationForUseInText() =
        replace("[", "&#91;").replace("]", "&#93;")

    private fun String.escapeLinkDestination(): String {
        val escaped = replace(">", "//>").replace("(", "\\(").replace(")", "\\)")
        return if (any { it.isWhitespace() && it != '\n' }) "<$escaped>" else escaped
    }

    private fun String.escapeInlineMarkdownChars() =
        buildString(length) {
            var precedingBackslashesCount = 0
            var isNewLine = true

            for (char in this@escapeInlineMarkdownChars) {
                when (char) {
                    '\\' -> precedingBackslashesCount++
                    '\n' -> isNewLine = true
                    else -> {
                        val isUnescaped = (precedingBackslashesCount % 2) == 0
                        if (char in "*_~`<>[]()!" && (isNewLine || isUnescaped)) {
                            append('\\')
                        }

                        isNewLine = false
                        precedingBackslashesCount = 0
                    }
                }
                append(char)
            }
        }

    private fun String.asInlineCodeString(): String {
        // Base case: doesn't contain backticks
        if (!contains("`")) {
            return "`$this`"
        }

        var currentCount = 0
        var longestCount = 0

        // First, count the longest run of backticks in the string
        for (char in this) {
            if (char == '`') {
                currentCount++
            } else {
                if (currentCount > longestCount) {
                    longestCount = currentCount
                }
                currentCount = 0
            }
        }

        if (currentCount > longestCount) longestCount = currentCount

        // Then wrap it in n + 1 backticks to avoid early termination
        val backticks = "`".repeat(longestCount + 1)
        return "$backticks$this$backticks"
    }

    private fun plainTextContents(node: Node): String = textContentRenderer.render(node)
}
