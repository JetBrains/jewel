package org.jetbrains.jewel.markdown.extensions.github.tables

import androidx.compose.ui.Alignment
import org.commonmark.ext.gfm.tables.TableCell.Alignment.CENTER
import org.commonmark.ext.gfm.tables.TableCell.Alignment.LEFT
import org.commonmark.ext.gfm.tables.TableCell.Alignment.RIGHT
import org.commonmark.ext.gfm.tables.TablesExtension
import org.commonmark.node.CustomBlock
import org.commonmark.node.CustomNode
import org.commonmark.node.Node
import org.commonmark.parser.Parser.Builder
import org.commonmark.parser.Parser.ParserExtension
import org.commonmark.renderer.text.TextContentRenderer
import org.commonmark.renderer.text.TextContentRenderer.TextContentRendererExtension
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownBlockProcessorExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownBlockRendererExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownRendererExtension
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.jetbrains.jewel.markdown.processing.readInlineContent
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.commonmark.ext.gfm.tables.TableBlock as CommonMarkTableBlock
import org.commonmark.ext.gfm.tables.TableBody as CommonMarkTableBody
import org.commonmark.ext.gfm.tables.TableCell as CommonMarkTableCell
import org.commonmark.ext.gfm.tables.TableHead as CommonMarkTableHeader
import org.commonmark.ext.gfm.tables.TableRow as CommonMarkTableRow

@OptIn(ExperimentalJewelApi::class)
public class GitHubTableProcessorExtension(
    markdownProcessor: MarkdownProcessor,
    extensions: List<MarkdownProcessorExtension>,
) : MarkdownProcessorExtension {
    override val parserExtension: ParserExtension = GitHubTablesCommonMarkExtension
    override val textRendererExtension: TextContentRendererExtension = GitHubTablesCommonMarkExtension

    override val blockProcessorExtension: MarkdownBlockProcessorExtension =
        GitHubTablesProcessorExtension(markdownProcessor, extensions)

    private class GitHubTablesProcessorExtension(
        private val markdownProcessor: MarkdownProcessor,
        private val extensions: List<MarkdownProcessorExtension>,
    ) : MarkdownBlockProcessorExtension {
        override fun canProcess(block: CustomBlock): Boolean = processMarkdownBlock(block, markdownProcessor) != null

        override fun processMarkdownBlock(
            block: CustomBlock,
            processor: MarkdownProcessor,
        ): MarkdownBlock.CustomBlock? {
            val tableBlock = block as CommonMarkTableBlock
            val header = tableBlock.findChild<CommonMarkTableHeader>() ?: return null

            val body = tableBlock.findChild<CommonMarkTableBody>()

            return try {
                TableBlock(
                    header =
                        TableHeader(
                            header.mapCells { cell ->
                                TableCell(
                                    cell.readInlineContent(markdownProcessor, extensions),
                                    alignment = getAlignment(cell),
                                )
                            }
                        ),
                    rows =
                        body
                            ?.mapRows {
                                TableRow(
                                    it.mapCells { cell ->
                                        TableCell(
                                            cell.readInlineContent(markdownProcessor, extensions),
                                            alignment = getAlignment(cell),
                                        )
                                    }
                                )
                            }
                            .orEmpty(),
                )
            } catch (_: IllegalArgumentException) {
                null
            }
        }

        private fun getAlignment(cell: CommonMarkTableCell) =
            when (cell.alignment) {
                LEFT -> Alignment.Start
                CENTER -> Alignment.CenterHorizontally
                RIGHT -> Alignment.End
                null -> Alignment.CenterHorizontally
            }

        private inline fun <reified T : CustomNode> CommonMarkTableBlock.findChild(): T? {
            forEachChild { child -> if (child is T) return child }
            return null
        }

        private inline fun Node.mapCells(mapper: (CommonMarkTableCell) -> TableCell): List<TableCell> = buildList {
            forEachChild { child -> if (child is CommonMarkTableCell) add(mapper(child)) }
        }

        private inline fun Node.mapRows(mapper: (CommonMarkTableRow) -> TableRow): List<TableRow> = buildList {
            forEachChild { child -> if (child is CommonMarkTableRow) add(mapper(child)) }
        }

        private inline fun Node.forEachChild(action: (Node) -> Unit) {
            var child = firstChild

            while (child != null) {
                action(child)
                child = child.next
            }
        }
    }
}

private object GitHubTablesCommonMarkExtension : ParserExtension, TextContentRendererExtension {
    override fun extend(parserBuilder: Builder) {
        parserBuilder.extensions(listOf(TablesExtension.create()))
    }

    override fun extend(rendererBuilder: TextContentRenderer.Builder) {
        rendererBuilder.extensions(listOf(TablesExtension.create()))
    }
}

@OptIn(ExperimentalJewelApi::class)
public class GitHubTableRendererExtension(rootStyling: MarkdownStyling) : MarkdownRendererExtension {
    override val blockRenderer: MarkdownBlockRendererExtension = GitHubTableBlockRenderer(rootStyling)
}

internal data class TableBlock(val header: TableHeader, val rows: List<TableRow>) : MarkdownBlock.CustomBlock {

    val columns: Int

    init {
        require(header.cells.isNotEmpty()) { "Header cannot be empty" }
        val headerColumns = header.cells.size

        if (rows.isNotEmpty()) {
            val bodyColumns = rows.first().cells.size
            require(rows.all { it.cells.size == bodyColumns }) { "Inconsistent cell count in table body" }
            require(headerColumns == bodyColumns) { "Inconsistent cell count between table body and header" }
        }

        columns = headerColumns
    }
}

internal data class TableHeader(val cells: List<TableCell>) : CustomBlock()

internal data class TableRow(val cells: List<TableCell>) : CustomBlock()

internal data class TableCell(val content: List<InlineMarkdown>, val alignment: Alignment.Horizontal) : CustomBlock()
