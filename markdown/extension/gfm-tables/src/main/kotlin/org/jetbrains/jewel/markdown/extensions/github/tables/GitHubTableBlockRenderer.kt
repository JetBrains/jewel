package org.jetbrains.jewel.markdown.extensions.github.tables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.MarkdownBlock.CustomBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownBlockRendererExtension
import org.jetbrains.jewel.markdown.rendering.InlineMarkdownRenderer
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

        val rows =
            remember(block, blockRenderer, inlineRenderer) {
                //            tableBlock.header.cells.map<TableCell, @Composable () -> Unit> { {
                // HeaderCell(it, blockRenderer, inlineRenderer) } } +
                tableBlock.rows.map<TableRow, List<@Composable () -> Unit>> { row ->
                    row.cells.map<TableCell, @Composable () -> Unit> {
                        { Cell(it, blockRenderer, inlineRenderer, enabled, onUrlClick, onTextClick) }
                    }
                }
            }

        SimpleTableLayout(
            columns = tableBlock.columns,
            rows = rows,
            drawDecorations = { tableLayoutResult -> Modifier },
            cellSpacing = 0f,
            modifier = Modifier.fillMaxWidth().heightIn(max = 200.dp).background(Color.Red),
        )
    }

    @Composable
    private fun HeaderCell(
        cell: TableCell,
        blockRenderer: MarkdownBlockRenderer,
        inlineRenderer: InlineMarkdownRenderer,
        enabled: Boolean,
        onUrlClick: (String) -> Unit,
        onTextClick: () -> Unit,
    ) {
        // Box
    }

    @Composable
    private fun Cell(
        cell: TableCell,
        blockRenderer: MarkdownBlockRenderer,
        inlineRenderer: InlineMarkdownRenderer,
        enabled: Boolean,
        onUrlClick: (String) -> Unit,
        onTextClick: () -> Unit,
    ) {
        Box(contentAlignment = Alignment.TopStart) {
            blockRenderer.render(
                MarkdownBlock.Paragraph(cell.content),
                rootStyling.paragraph,
                enabled,
                onUrlClick,
                onTextClick,
            )
        }
    }
}
