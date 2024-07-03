package org.jetbrains.jewel.markdown

import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.junit.Assert
import org.junit.Test

class InlineMarkdownTest {
    private val processor = MarkdownProcessor()

    @Test
    fun `paragraph equals and hashCode`() {
        val parsed = processor.processMarkdownDocument("<MAILTO:FOO@BAR.BAZ>").single()
        val other = paragraph("[MAILTO:FOO@BAR.BAZ](MAILTO:FOO@BAR.BAZ)")
        Assert.assertEquals(parsed, other)
        Assert.assertEquals(parsed.hashCode(), other.hashCode())
    }

    @Test
    fun `heading equals and hashCode`() {
        val parsed = processor.processMarkdownDocument("## My *heading*").single()
        val other = heading(2, "My *heading*")
        Assert.assertEquals(parsed, other)
        Assert.assertEquals(parsed.hashCode(), other.hashCode())
    }
}
