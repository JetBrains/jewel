package org.jetbrains.jewel.markdown.extensions.github.tables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.BasicTableLayout
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.MarkdownBlock.CustomBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownBlockRendererExtension
import org.jetbrains.jewel.markdown.rendering.InlineMarkdownRenderer
import org.jetbrains.jewel.markdown.rendering.InlinesStyling
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling

@OptIn(ExperimentalJewelApi::class)
public class GitHubTableBlockRenderer(private val rootStyling: MarkdownStyling) : MarkdownBlockRendererExtension {
    override fun canRender(block: CustomBlock): Boolean = block is TableBlock

    @Composable
    override fun render(
        block: CustomBlock,
        blockRenderer: MarkdownBlockRenderer,
        inlineRenderer: InlineMarkdownRenderer,
        enabled: Boolean,
        onUrlClick: (String) -> Unit,
        onTextClick: () -> Unit,
    ) {
        val tableBlock = block as TableBlock

        // Headers have a semibold font weight applied throughout; we need a copy of the block
        // renderer
        // with a tweaked root styling, using semibold everywhere (except strong emphasis, which is
        // >= 600)
        val headerRootStyling =
            remember(JewelTheme.name, blockRenderer) {
                val rootStyling = blockRenderer.rootStyling
                val semiboldInlinesStyling = rootStyling.paragraph.inlinesStyling.withFontWeight(FontWeight.Bold)

                // Given cells can only contain inlines, and not block-level nodes, we are ok with
                // only
                // overriding the Paragraph styling.
                MarkdownStyling(
                    rootStyling.blockVerticalSpacing,
                    MarkdownStyling.Paragraph(semiboldInlinesStyling),
                    rootStyling.heading,
                    rootStyling.blockQuote,
                    rootStyling.code,
                    rootStyling.list,
                    rootStyling.image,
                    rootStyling.thematicBreak,
                    rootStyling.htmlBlock,
                )
            }

        // TODO figure out why this is not making header text bold
        val headerRenderer = remember(headerRootStyling) { blockRenderer.copy(rootStyling = headerRootStyling) }

        val rows =
            remember(block, blockRenderer, inlineRenderer) {
                val headerCells =
                    tableBlock.header.cells.map<TableCell, @Composable () -> Unit> {
                        { HeaderCell(it, headerRenderer, enabled, onUrlClick, onTextClick) }
                    }

                val rowsCells =
                    tableBlock.rows.map<TableRow, List<@Composable () -> Unit>> { row ->
                        row.cells.map<TableCell, @Composable () -> Unit> {
                            { Cell(it, blockRenderer, enabled, onUrlClick, onTextClick) }
                        }
                    }

                listOf(headerCells) + rowsCells
            }

        BasicTableLayout(
            rowCount = tableBlock.rowCount,
            columnCount = tableBlock.columnCount,
            cellBorderColor = JewelTheme.globalColors.borders.normal,
            rows = rows,
        )
    }

    private fun InlinesStyling.withFontWeight(newFontWeight: FontWeight) =
        InlinesStyling(
            textStyle = textStyle.copy(fontWeight = newFontWeight),
            inlineCode = inlineCode.copy(fontWeight = newFontWeight),
            link = link.copy(fontWeight = newFontWeight),
            linkDisabled = linkDisabled.copy(fontWeight = newFontWeight),
            linkHovered = linkHovered.copy(fontWeight = newFontWeight),
            linkFocused = linkFocused.copy(fontWeight = newFontWeight),
            linkPressed = linkPressed.copy(fontWeight = newFontWeight),
            linkVisited = linkVisited.copy(fontWeight = newFontWeight),
            emphasis = emphasis.copy(fontWeight = newFontWeight),
            strongEmphasis = strongEmphasis,
            inlineHtml = inlineHtml.copy(fontWeight = newFontWeight),
            renderInlineHtml = renderInlineHtml,
        )

    @Composable
    private fun HeaderCell(
        cell: TableCell,
        blockRenderer: MarkdownBlockRenderer,
        enabled: Boolean,
        onUrlClick: (String) -> Unit,
        onTextClick: () -> Unit,
    ) {
        Box(
            modifier = Modifier.padding(horizontal = 13.dp, vertical = 6.dp),
            contentAlignment = cell.alignment.asContentAlignment(),
        ) {
            blockRenderer.render(
                MarkdownBlock.Paragraph(cell.content),
                rootStyling.paragraph,
                enabled,
                onUrlClick,
                onTextClick,
            )
        }
    }

    @Composable
    private fun Cell(
        cell: TableCell,
        blockRenderer: MarkdownBlockRenderer,
        enabled: Boolean,
        onUrlClick: (String) -> Unit,
        onTextClick: () -> Unit,
    ) {
        // TODO striped rows, extract padding
        Box(
            modifier = Modifier.padding(horizontal = 13.dp, vertical = 6.dp),
            contentAlignment = cell.alignment.asContentAlignment(),
        ) {
            blockRenderer.render(
                MarkdownBlock.Paragraph(cell.content),
                rootStyling.paragraph,
                enabled,
                onUrlClick,
                onTextClick,
            )
        }
    }

    private fun Alignment.Horizontal.asContentAlignment() =
        when {
            this == Alignment.Start -> Alignment.TopStart
            this == Alignment.CenterHorizontally -> Alignment.TopCenter
            this == Alignment.End -> Alignment.TopEnd
            else -> error("Unsupported alignment: $this")
        }
}
