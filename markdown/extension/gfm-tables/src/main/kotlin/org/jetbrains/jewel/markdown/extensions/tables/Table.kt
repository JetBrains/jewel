package org.jetbrains.jewel.markdown.extensions.tables

import org.jetbrains.jewel.markdown.MarkdownBlock

public sealed interface Table : MarkdownBlock.CustomBlock {

    public val content: List<MarkdownBlock>

    public data class TableBlock(override val content: List<MarkdownBlock>) : Table

    public data class TableHeader(override val content: List<MarkdownBlock>) : Table

    public data class TableRow(override val content: List<MarkdownBlock>) : Table

    public data class TableCell(override val content: List<MarkdownBlock>) : Table

    public data class TableBody(override val content: List<MarkdownBlock>) : Table

}