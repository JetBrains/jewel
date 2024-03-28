package org.jetbrains.jewel.markdown

import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.junit.Test

class MarkdownProcessorDocumentParsingExtraTest {

    private val processor = MarkdownProcessor()
    @Test
    fun `should parse spec sample 62 correctly (ATX headings)`() {
        val parsed =
            processor.processMarkdownDocument(
                """
            |# foo
            |- foo1
            |- foo2
            |- foo3
            |
            |foo fdasfdsa
            |fdafasdf
            """
                    .trimMargin(),
            )

        /*
         * Expected HTML:
         * <h1>foo</h1>
         * <h2>foo</h2>
         * <h3>foo</h3>
         * <h4>foo</h4>
         * <h5>foo</h5>
         * <h6>foo</h6>
         */
        parsed.assertEquals(
            heading(1, "foo"),
            heading(2, "foo"),
            heading(3, "foo"),
            heading(4, "foo"),
            heading(5, "foo"),
            heading(6, "foo"),
        )
    }

    @Test
    fun `should parse spec sample 461b correctly (Emphasis and strong emphasis)`() {
        val parsed = processor.processMarkdownDocument("*_foo *bar*_*")

        /*
         * Expected HTML:
         * <p><em><em>foo <em>bar</em></em></em></p>
         */
        parsed.assertEquals(paragraph("*_foo *bar*_*"))
    }

    @Test
    fun `should parse spec sample 461c correctly (Emphasis and strong emphasis)`() {
        val parsed = processor.processMarkdownDocument("**foo *bar***")

        /*
         * Expected HTML:
         * <p><strong>foo <em>bar</em></strong></p>
         */
        parsed.assertEquals(paragraph("**foo *bar***"))
    }

    @Test
    fun `should parse spec sample 461d correctly (Emphasis and strong emphasis)`() {
        val parsed = processor.processMarkdownDocument("*_foo *bar* a_*")

        /*
         * Expected HTML:
         * <p><em><em>foo <em>bar</em> a</em></em></p>
         */
        parsed.assertEquals(paragraph("*_foo *bar* a_*"))
    }

    @Test
    fun `should parse spec sample 461e correctly (Emphasis and strong emphasis)`() {
        val parsed = processor.processMarkdownDocument("**foo *bar* a**")

        /*
         * Expected HTML:
         * <p><strong>foo <em>bar</em> a</strong></p>
         */
        parsed.assertEquals(paragraph("**foo *bar* a**"))
    }

    @Test
    fun `should parse spec sample 461f correctly (Emphasis and strong emphasis)`() {
        val parsed = processor.processMarkdownDocument("*_*foo *bar* a*_*")

        /*
         * Expected HTML:
         * <p><strong>foo <em>bar</em> a</strong></p>
         */
        parsed.assertEquals(paragraph("*_*foo *bar* a*_*"))
    }
}
