package org.jetbrains.jewel.markdown.extension.autolink

import org.jetbrains.jewel.markdown.InlineMarkdown
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extension.strikethrough.StrikethroughProcessorExtension
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.junit.Assert.assertTrue
import org.junit.Test

class StrikethroughProcessorExtensionTest {
    // testing a simple case to assure wiring up our AutolinkProcessorExtension works correctly
    @Test
    fun `https text gets processed into a link`() {
        val processor = MarkdownProcessor(listOf(StrikethroughProcessorExtension))
        val rawMarkDown = "~~fdsa~~"
        val processed = processor.processMarkdownDocument(rawMarkDown)
        val paragraph = processed.first() as MarkdownBlock.Paragraph

        assertTrue(paragraph.inlineContent.first() is InlineMarkdown.Link)
    }
}
