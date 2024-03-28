package org.jetbrains.jewel.markdown.processing

import org.jetbrains.jewel.markdown.BlockWithInlineMarkdown
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class MarkdownProcessorTest {

    @Test
    fun `test my processor`() {
        val pp = MarkdownProcessor()
        pp.processMarkdownDocument(
            """
            |Paragraph 1
            |
            |Paragraph 2
            |
            |Second paragraph
            |not very important
            |
            |* m1
            |* m2
            """.trimMargin(),
        )
        val secondProcess = pp.processMarkdownDocument(
            """
            |Paragraph 1
            |
            |Paragraph 2
            |
            |Not a paragraph
            |not very important
            |
            |* m1
            |* m2
            """.trimMargin(),
        )
        // TODO: update after changing the underlying model, to check the first elements are the same
        assertEquals("Paragraph 1", (secondProcess[0] as BlockWithInlineMarkdown).inlineContent.content)
        assertEquals("Paragraph 2", (secondProcess[1] as BlockWithInlineMarkdown).inlineContent.content)
        assertEquals(
            "Not a paragraph not very important",
            (secondProcess[2] as BlockWithInlineMarkdown).inlineContent.content,
        )
        assertArrayEquals(
            arrayOf(
                "Paragraph(inlineContent=InlineMarkdown(content=m1))",
                "Paragraph(inlineContent=InlineMarkdown(content=m2))",
            ),
            (secondProcess[3] as MarkdownBlock.ListBlock).items.flatMap { it.content.map(MarkdownBlock::toString) }.toTypedArray(),
        )
    }
}
