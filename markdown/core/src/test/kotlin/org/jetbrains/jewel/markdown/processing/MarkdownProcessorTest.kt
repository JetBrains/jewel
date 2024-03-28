package org.jetbrains.jewel.markdown.processing

class MarkdownProcessorTest {

    fun `test my processor`() {
        val pp = MarkdownProcessor()

        val firstProcess = pp.processMarkdownDocument(
            """
            |Paragraph 1
            |
            |Second paragraph
            |not very important
            |
            |* m1
            |* m2
        """.trimMargin()
        )
        val secondProcess = pp.processMarkdownDocument(
            """
            |Paragraph 1
            |
            |Not a paragraph
            |not very important
            |
            |* m1
            |* m2
        """.trimMargin()
        )
    }
}