package org.jetbrains.jewel.markdown.extensions.github.alerts

import org.commonmark.node.BlockQuote
import org.commonmark.node.Document
import org.commonmark.node.Node
import org.commonmark.node.Paragraph
import org.commonmark.parser.Parser
import org.commonmark.renderer.text.TextContentRenderer
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class GitHubAlertBlockExtensionTest {

    private val parser =
        Parser.builder()
            .extensions(listOf(GitHubAlertProcessorExtension.parserExtension))
            .build()

    private val renderer =
        TextContentRenderer.builder()
            .extensions(listOf(GitHubAlertProcessorExtension.textRendererExtension))
            .build()

    @Test
    fun `should parse note alert`() {
        val rawMarkdown =
            """
        |> [!NOTE]  
        |> Highlights information that users should take into account, even when skimming.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Note node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Note,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        (firstContent as Paragraph)
        assertEquals(
            "Content text should be parsed correctly\n",
            "Highlights information that users should take into account, even when skimming.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse tip alert`() {
        val rawMarkdown =
            """
        |> [!TIP]  
        |> Optional information to help a user be more successful.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Tip node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Tip,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Optional information to help a user be more successful.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse important alert`() {
        val rawMarkdown =
            """
        |> [!IMPORTANT]  
        |> Crucial information necessary for users to succeed.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Important node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Important,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Crucial information necessary for users to succeed.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse warning alert`() {
        val rawMarkdown =
            """
        |> [!WARNING]  
        |> Critical content demanding immediate user attention due to potential risks.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Warning node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Warning,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Critical content demanding immediate user attention due to potential risks.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse caution alert`() {
        val rawMarkdown =
            """
        |> [!CAUTION]  
        |> Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Caution node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Caution,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Negative potential consequences of an action.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse lowercase note alert`() {
        val rawMarkdown =
            """
        |> [!note]  
        |> Highlights information that users should take into account, even when skimming.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Note node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Note,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly\n",
            "Highlights information that users should take into account, even when skimming.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse lowercase tip alert`() {
        val rawMarkdown =
            """
        |> [!tip]  
        |> Optional information to help a user be more successful.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Tip node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Tip,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Optional information to help a user be more successful.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse lowercase important alert`() {
        val rawMarkdown =
            """
        |> [!important]  
        |> Crucial information necessary for users to succeed.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Important node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Important,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Crucial information necessary for users to succeed.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse lowercase warning alert`() {
        val rawMarkdown =
            """
        |> [!warning]  
        |> Critical content demanding immediate user attention due to potential risks.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Warning node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Warning,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Critical content demanding immediate user attention due to potential risks.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse lowercase caution alert`() {
        val rawMarkdown =
            """
        |> [!caution]  
        |> Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Caution node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Caution,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was ${firstContent.javaClass.name}",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Negative potential consequences of an action.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should trim trailing and leading empty lines`() {
        val rawMarkdown =
            """
        |> [!CAUTION] 
        |>
        |> Negative potential consequences of an action.
        |>
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a Caution node, but was $firstChild",
            firstChild is AlertBlock && firstChild.kind == AlertBlock.Kind.Caution,
        )

        val contents = firstChild.children
        assertEquals("Parsed node should only have one direct child", 1, contents.size)

        val firstContent = contents.first()
        assertTrue(
            "Parsed content should be a Paragraph, but was $firstContent",
            firstContent is Paragraph,
        )
        assertEquals(
            "Content text should be parsed correctly.\n",
            "Negative potential consequences of an action.",
            renderer.render(firstContent),
        )
    }

    @Test
    fun `should parse malformed entry as blockquote - space after exclamation mark`() {
        val rawMarkdown =
            """
        |> [! CAUTION]  
        |> Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a BlockQuote node, but was $firstChild",
            firstChild is BlockQuote,
        )
    }

    @Test
    fun `should parse malformed entry as blockquote - type not on first line`() {
        val rawMarkdown =
            """
        |>
        |> [! CAUTION]  
        |> Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a BlockQuote node, but was $firstChild",
            firstChild is BlockQuote,
        )
    }

    @Test
    fun `should parse malformed entry as blockquote - space before exclamation mark`() {
        val rawMarkdown =
            """
        |> [ !CAUTION]  
        |> Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a BlockQuote node, but was $firstChild",
            firstChild is BlockQuote,
        )
    }

    @Test
    fun `should parse malformed entry as blockquote - space after type`() {
        val rawMarkdown =
            """
        |> [!CAUTION ]  
        |> Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a BlockQuote node, but was $firstChild",
            firstChild is BlockQuote,
        )
    }

    @Test
    fun `should parse malformed entry as blockquote - missing newline`() {
        val rawMarkdown =
            """
        |> [!CAUTION] Negative potential consequences of an action.
        """
                .trimMargin()
        val parsed = parser.parse(rawMarkdown)

        assertTrue("Parse result is not a document", parsed is Document)

        val children = parsed.children
        assertEquals("Parsed document should only have one direct child", 1, children.size)

        val firstChild = children.first()
        assertTrue(
            "Parsed node should be a BlockQuote node, but was $firstChild",
            firstChild is BlockQuote,
        )
    }
}

private val Node.children: List<Node>
    get() = buildList {
        var nextChild = firstChild
        while (nextChild != null) {
            add(nextChild)
            nextChild = nextChild.next
        }
    }
