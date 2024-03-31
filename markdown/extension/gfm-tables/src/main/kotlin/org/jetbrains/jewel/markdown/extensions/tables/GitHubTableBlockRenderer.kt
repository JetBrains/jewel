package org.jetbrains.jewel.markdown.extensions.tables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.commonmark.ext.gfm.tables.TableBlock
import org.commonmark.ext.gfm.tables.TableBody
import org.commonmark.ext.gfm.tables.TableHead
import org.commonmark.node.Node
import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.MarkdownBlock.CustomBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownBlockRendererExtension
import org.jetbrains.jewel.markdown.rendering.InlineMarkdownRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.markdown.toInlineNode
import org.jetbrains.jewel.ui.component.Text

public class GitHubTableBlockRenderer(
    private val styling: TableStyling,
    private val rootStyling: MarkdownStyling,
) : MarkdownBlockRendererExtension {

    override fun canRender(block: CustomBlock): Boolean =
        block is CustomBlock.DefaultCustomBlock && block.nativeBlock is TableBlock

    @Composable
    private fun RowScope.TableCell(
        text: List<InlineMarkdown>,
        inlineRenderer: InlineMarkdownRenderer,
    ) {
        Text(
            text = inlineRenderer.renderAsAnnotatedString(text, rootStyling.paragraph.inlinesStyling),
            Modifier
                .border(1.dp, styling.borderColor)
                .weight(1.0f)
                .padding(8.dp),
        )
    }

    @Composable
    override fun render(
        block: CustomBlock,
        blockRenderer: MarkdownBlockRenderer,
        inlineRenderer: InlineMarkdownRenderer,
    ) {
        if (block !is CustomBlock.DefaultCustomBlock) return

        val head = block.nativeBlock.firstChild as TableHead
        val body = block.nativeBlock.lastChild as TableBody

        Column(Modifier.fillMaxSize().padding(16.dp)) {
            head.forEachChild { row ->
                Row(Modifier.background(styling.headColor)) {
                    row.forEachChild { cell ->
                        TableCell(text = cell.children().map { it.toInlineNode() }, inlineRenderer)
                    }
                }
            }
            body.forEachChild { row ->
                Row(Modifier.fillMaxWidth()) {
                    row.forEachChild { cell ->
                        TableCell(text = cell.children().map { it.toInlineNode() }, inlineRenderer)
                    }
                }
            }
        }
    }

    @Composable
    private fun Node.children(): List<Node> = buildList {
        var child = firstChild

        while (child != null) {
            add(child)
            child = child.next
        }
    }
}

@Composable
private fun Node.forEachChild(action: @Composable (Node) -> Unit) {
    var child = firstChild

    while (child != null) {
        action(child)
        child = child.next
    }
}
