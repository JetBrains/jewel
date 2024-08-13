package org.jetbrains.jewel.markdown.extensions.tables

import org.commonmark.ext.gfm.tables.TableBlock
import org.commonmark.ext.gfm.tables.TableBody
import org.commonmark.ext.gfm.tables.TableCell
import org.commonmark.ext.gfm.tables.TableHead
import org.commonmark.ext.gfm.tables.TableRow
import org.commonmark.ext.gfm.tables.TablesExtension
import org.commonmark.node.CustomBlock
import org.commonmark.parser.Parser.ParserExtension
import org.commonmark.renderer.text.TextContentRenderer.TextContentRendererExtension
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extensions.MarkdownBlockProcessorExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor

public object GitHubTableProcessorExtension : MarkdownProcessorExtension {

    private val tableExtension = TablesExtension.create()

    override val parserExtension: ParserExtension = tableExtension as ParserExtension
    override val textRendererExtension: TextContentRendererExtension = tableExtension as TextContentRendererExtension
    override val blockProcessorExtension: MarkdownBlockProcessorExtension = GitHubTableBlockProcessor

    private object GitHubTableBlockProcessor : MarkdownBlockProcessorExtension {
        override fun canProcess(block: CustomBlock): Boolean =
            block is TableBlock


        override fun processMarkdownBlock(
            block: CustomBlock,
            processor: MarkdownProcessor,
        ): MarkdownBlock.CustomBlock? {
            val children = processor.processChildren(block)
            when (block) {
                is TableBlock -> Table.TableBlock(children)
                is TableRow -> Table.TableRow(children)
            }

            return null
        }
    }


}
