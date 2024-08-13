package org.jetbrains.jewel.markdown.extensions.tables

import junit.framework.TestCase.assertTrue
import org.commonmark.ext.gfm.tables.TableBlock
import org.commonmark.node.BlockQuote
import org.commonmark.node.Document
import org.commonmark.node.Node
import org.commonmark.node.Paragraph
import org.commonmark.parser.Parser
import org.commonmark.renderer.text.TextContentRenderer
import org.junit.Test

class GitHubTableProcessorExtensionTest {

    private  val parser = Parser.builder().extensions(listOf(GitHubTableProcessorExtension.parserExtension)).build()

    private val renderer = TextContentRenderer.builder().extensions(listOf(GitHubTableProcessorExtension.textRendererExtension)).build()

  @Test
  fun test() {
      val rawMarkdown = """
          | Table Header |
          |:----:|
          | Table Body |
          
      """.trimIndent()
      val parsed = parser.parse(rawMarkdown)

      assertTrue(parsed is Document)

      val rendered = renderer.render(parsed)

      assertTrue(rendered.length > 0)
  }

}
