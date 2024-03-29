package org.jetbrains.jewel.markdown.extension.autolink

import junit.framework.TestCase.assertEquals
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.junit.Test

class AutolinkProcessorExtensionTest {
    // testing a simple case to assure wiring up our AutolinkProcessorExtension works correctly
    @Test
    fun `one text node`() {
        val processor = MarkdownProcessor(listOf(AutolinkProcessorExtension()))
        val rawMarkDown = "https://commonmark.org"
        val processed = processor.processMarkdownDocument(rawMarkDown)
        val paragraph = processed[0] as MarkdownBlock.Paragraph
        assertEquals(paragraph.inlineContent.content, "[https://commonmark.org](https://commonmark.org)")
    }
}
