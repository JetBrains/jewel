package org.jetbrains.jewel.markdown.extensions.tables

import org.commonmark.ext.gfm.tables.TablesExtension
import org.commonmark.parser.Parser.ParserExtension
import org.commonmark.renderer.text.TextContentRenderer.TextContentRendererExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension

public object GitHubTableProcessorExtension : MarkdownProcessorExtension {

    override val parserExtension: ParserExtension = TablesExtension.create() as ParserExtension
    override val textRendererExtension: TextContentRendererExtension = TablesExtension.create() as TextContentRendererExtension
}
