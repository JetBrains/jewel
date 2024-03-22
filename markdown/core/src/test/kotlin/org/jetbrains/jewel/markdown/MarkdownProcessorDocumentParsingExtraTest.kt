package org.jetbrains.jewel.markdown

import org.jetbrains.jewel.markdown.processing.MarkdownProcessor
import org.junit.Test

class MarkdownProcessorDocumentParsingExtraTest {

    private val processor = MarkdownProcessor()

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

    @Test
    fun `should parse gfm spec example 491 correctly (Strikethrough)`() {
        val parsed = processor.processMarkdownDocument("~~Hi~~ Hello, ~~there~~ world!")

        /*
         * Expected HTML:
         * <p><del>Hi</del> Hello, <del>there</del> world!</p>
         */
        parsed.assertEquals(paragraph("~~Hi~~ Hello, ~~there~~ world\\!"))
    }

    @org.junit.Ignore("Strikethrough is any text wrapped in a pair of one tildes, but our implementation assumes two")
    @Test
    fun `should parse gfm spec example 491b correctly (Strikethrough)`() {
        val parsed = processor.processMarkdownDocument("~there~ world!")

        parsed.assertEquals(paragraph("~there~ world\\!"))
    }

    /** As with regular emphasis delimiters, a new paragraph will cause strikethrough parsing to cease */
    @Test
    fun `should parse gfm spec example 492 correctly (Strikethrough)`() {
        val parsed = processor.processMarkdownDocument(
            """
            |This ~~has a
            |
            |new paragraph~~.
            """.trimMargin(),
        )

        /*
         * Expected HTML:
         * <p>This ~~has a</p>
         * <p>new paragraph~~.</p>
         */
        parsed.assertEquals(
            paragraph("This \\~\\~has a"),
            paragraph("new paragraph\\~\\~."),
        )
    }

    @Test
    fun `should parse gfm spec example 493 correctly (Strikethrough)`() {
        val parsed = processor.processMarkdownDocument("This will ~~~not~~~ strike.")

        /*
         * Expected HTML:
         * <p>This will ~~~not~~~ strike.</p>
         */
        parsed.assertEquals(paragraph("This will \\~\\~\\~not\\~\\~\\~ strike."))
    }
}
