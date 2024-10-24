package org.jetbrains.jewel.markdown.extension.autolink

import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extension.strikethrough.CustomStrikethroughNode
import org.jetbrains.jewel.markdown.extension.strikethrough.StrikethroughProcessorExtension
import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.junit.Assert.assertTrue
import org.junit.Test

class StrikethroughProcessorExtensionTest {
    // testing a simple case to assure wiring up our StrikethroughProcessorExtension works correctly
    @Test
    fun `~text~ processed into strikethrough`() {
        val processor = MarkdownProcessor(listOf(StrikethroughProcessorExtension))
        val rawMarkDown = "~~text~~"
        val processed = processor.processMarkdownDocument(rawMarkDown)
        val paragraph = processed.first() as MarkdownBlock.Paragraph
        assertTrue(paragraph.inlineContent.first() is CustomStrikethroughNode)
    }
}
