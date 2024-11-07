package org.jetbrains.jewel.markdown.processing

import org.commonmark.node.Block
import org.commonmark.node.Document
import org.commonmark.node.Node
import org.commonmark.parser.IncludeSourceSpans
import org.commonmark.parser.Parser
import org.commonmark.renderer.html.HtmlRenderer
import org.intellij.lang.annotations.Language
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotSame
import org.junit.Assert.assertSame
import org.junit.Test

private val rawMarkdown =
    """
    Paragraph 0
    continue p0
    # Header 1
    Paragraph 2
    * list item 3-1
    * list item 3-2
    * list item 3-3
    ## Header 4
    Paragraph 5
    continue paragraph 5
    
    
    ```
    line 6-1
    line 6-2
    ```
    Paragraph 7
    
    Paragraph 8
    continue p8
    """
        .trimIndent()

@Suppress(
    "LargeClass" // Detekt triggers on files > 600 lines
)
class MarkdownProcessorOptimizeEditsTest {
    private val htmlRenderer = HtmlRenderer.builder().build()

    @Test
    fun `first blocks stay the same`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph 2
                
                * list item 3-1
                * list item 3-2
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertSame(firstRun[0], secondRun[0])
        assertSame(firstRun[1], secondRun[1])
        assertNotSame(firstRun[2], secondRun[2])
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            </ul>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `first block edited`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p*CHANGE*
                # Header 1
                Paragraph 2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ## Header 4
                Paragraph 5
                continue paragraph 5
                
                
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph 8
                continue p8
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p<em>CHANGE</em></p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertNotSame(firstRun[0], secondRun[0])
        assertSame(firstRun[1], secondRun[1])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `last block edited`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph 2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ## Header 4
                Paragraph 5
                continue paragraph 5
                
                
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph *CHANGE*
                continue p8
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph <em>CHANGE</em>
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[5], secondRun[5])
        assertSame(firstRun[6], secondRun[6])
        assertSame(firstRun[7], secondRun[7])
        assertNotSame(firstRun[8], secondRun[8])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `middle block edited`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph 2
                * list item 3-1
                * list item *CHANGE*
                * list item 3-3
                ## Header 4
                Paragraph 5
                continue paragraph 5
                

                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph 8
                continue p8
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item <em>CHANGE</em></li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[0], secondRun[0])
        assertSame(firstRun[1], secondRun[1])
        assertSame(firstRun[2], secondRun[2])
        assertNotSame(firstRun[3], secondRun[3])
        assertSame(firstRun[4], secondRun[4])
        assertSame(firstRun[5], secondRun[5])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `blocks merged`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits("$rawMarkdown\n\nParagraph 9")
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph 2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ## Header 4
                Paragraph 5
                continue paragraph 5
                
                
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                Paragraph 8
                continue p8
                
                Paragraph 9
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7
            Paragraph 8
            continue p8</p>
            <p>Paragraph 9</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[5], secondRun[5])
        assertSame(firstRun[6], secondRun[6])
        assertNotSame(firstRun[7], secondRun[7])
        assertSame(firstRun[9], secondRun[8])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `blocks split`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph 2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ## Header 4
                Paragraph 5
                
                continue paragraph 5
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph 8
                continue p8
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5</p>
            <p>continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[4], secondRun[4])
        assertNotSame(firstRun[5], secondRun[5])
        assertSame(firstRun[6], secondRun[7])
        assertSame(firstRun[7], secondRun[8])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `blocks deleted`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph 2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph 8
                continue p8
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[2], secondRun[2])
        assertNotSame(firstRun[3], secondRun[3])
        assertNotSame(firstRun[4], secondRun[4])
        assertNotSame(firstRun[6], secondRun[4])
        assertSame(firstRun[7], secondRun[5])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `paragraphs merge after header block gets deleted`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                Paragraph 2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ## Header 4
                Paragraph 5
                continue paragraph 5
                
                
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph 8
                continue p8
                """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0
            Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>

            """
                .trimIndent(),
            secondRun,
        )
        assertNotSame(firstRun[0], secondRun[0])
        assertNotSame(firstRun[2], secondRun[1])
        assertSame(firstRun[3], secondRun[1])
        assertSame(firstRun[4], secondRun[2])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `blocks added`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
            Paragraph 0
            continue p0
            # Header 1
            Paragraph 2
            * list item 3-1
            * list item 3-2
            * list item 3-3
            ## Header 4
            
                        
            *CHANGE*
                        
            Paragraph 5
            continue paragraph 5
            
            
            ```
            line 6-1
            line 6-2
            ```
            Paragraph 7
            
            Paragraph 8
            continue p8
            """
                .trimIndent()
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p><em>CHANGE</em></p>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[2], secondRun[2])
        assertSame(firstRun[3], secondRun[3])
        assertNotSame(firstRun[4], secondRun[4])
        assertNotSame(firstRun[5], secondRun[6])
        assertSame(firstRun[6], secondRun[7])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `no changes`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val secondRun = processor.processWithQuickEdits(rawMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[0], secondRun[0])
        assertIndexesEqual(rawMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `empty line added before`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown = "\n" + rawMarkdown
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertNotSame(firstRun[0], secondRun[0])
        assertSame(firstRun[1], secondRun[1])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `empty line added after`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown = rawMarkdown + "\n"
        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[7], secondRun[7])
        assertNotSame(firstRun[8], secondRun[8])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `one char changed`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
                Paragraph 0
                continue p0
                # Header 1
                Paragraph!2
                * list item 3-1
                * list item 3-2
                * list item 3-3
                ## Header 4
                Paragraph 5
                continue paragraph 5
                
                
                ```
                line 6-1
                line 6-2
                ```
                Paragraph 7
                
                Paragraph 8
                continue p8
            """
                .trimIndent()

        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph!2</p>
            <ul>
            <li>list item 3-1</li>
            <li>list item 3-2</li>
            <li>list item 3-3</li>
            </ul>
            <h2>Header 4</h2>
            <p>Paragraph 5
            continue paragraph 5</p>
            <pre><code>line 6-1
            line 6-2
            </code></pre>
            <p>Paragraph 7</p>
            <p>Paragraph 8
            continue p8</p>
            
            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[0], secondRun[0])
        assertSame(firstRun[1], secondRun[1])
        assertNotSame(firstRun[2], secondRun[2])
        assertSame(firstRun[3], secondRun[3])
        assertIndexesEqual(updatedMarkdown, processor.getCurrentIndexesInTest())
    }

    /** Regression for https://github.com/commonmark/commonmark-java/issues/315 */
    @Test
    fun `link reference spans`() {
        val processor = MarkdownProcessor(editorMode = true)
        val firstRun = processor.processWithQuickEdits(rawMarkdown)
        val updatedMarkdown =
            """
            Paragraph 0
            continue p0
            # Header 1
            Paragraph 2

            [Foo*bar\]]:my_(url) 'title (with parens)'
            Paragraph 3

            [Foo*bar\]]
            """
                .trimIndent()

        val secondRun = processor.processWithQuickEdits(updatedMarkdown)
        assertHtmlEquals(
            """
            <p>Paragraph 0
            continue p0</p>
            <h1>Header 1</h1>
            <p>Paragraph 2</p>
            <p>Paragraph 3</p>
            <p><a href="my_(url)" title="title (with parens)">Foo*bar]</a></p>

            """
                .trimIndent(),
            secondRun,
        )
        assertSame(firstRun[0], secondRun[0])
        assertSame(firstRun[1], secondRun[1])
        assertNotSame(firstRun[2], secondRun[2])
        // it shouldn't have empty indexes even for link references
        assertEquals(listOf(0, 24, 35, 48, 91, 104), processor.getCurrentIndexesInTest())
    }

    /** Regression https://github.com/JetBrains/jewel/issues/344 */
    @Test
    fun `content if empty`() {
        val processor = MarkdownProcessor(editorMode = true)
        processor.processWithQuickEdits(rawMarkdown)
        val secondRun = processor.processWithQuickEdits("")
        assertHtmlEquals(
            """
            """
                .trimIndent(),
            secondRun,
        )
        assertIndexesEqual("", processor.getCurrentIndexesInTest())
        processor.processWithQuickEdits(rawMarkdown)
        assertIndexesEqual(rawMarkdown, processor.getCurrentIndexesInTest())
    }

    @Test
    fun `chained changes`() {
        val processor = MarkdownProcessor(editorMode = true)
        processor.processWithQuickEdits(
            """
            # Header 0
            # Header 1
            # Header 2
            
            
            
            
            # Header 3
            # Header 4
            # Header 5
            # Header 6
            # Header 7
            # Header 8
            # Header 9

            """
                .trimIndent()
        )
        val second =
            """
            # Header 0
            # Header 1
            
            
            paragraph
            
            # Header 2
            # Header 3
            # Header 7
            # Header 8
            # Header 9

            """
                .trimIndent()
        processor.processWithQuickEdits(second)
        assertIndexesEqual(second, processor.getCurrentIndexesInTest())

        val third =
            """
            # Header 0
            # Header 1
            Some paragraph
            
            
            
            
            # Header 2
            # Header 3
            # Header 7
            # Header 8
            # Header 9

            """
                .trimIndent()
        processor.processWithQuickEdits(third)
        assertIndexesEqual(third, processor.getCurrentIndexesInTest())

        val forth =
            """
                # Header 0
                # Header 1
                
                
                some paragraph
                # Header 2
                # Header 7
                # Header 8
                # Header 9

                """
                .trimIndent()

        val forthRun = processor.processWithQuickEdits(forth)
        assertIndexesEqual(forth, processor.getCurrentIndexesInTest())
        val fifthDocument =
            """
            # Header 0
            # Header 1
            
            
            some paragraph
            # Header 2
            # Header 7
                        
                        
            - list item 1
            - list item 2
            # Header 8
            # Header 9

            """
                .trimIndent()
        val fifthRun = processor.processWithQuickEdits(fifthDocument)
        assertIndexesEqual(fifthDocument, processor.getCurrentIndexesInTest())

        assertSame(forthRun[0], fifthRun[0])
        assertSame(forthRun[1], fifthRun[1])
        assertSame(forthRun[2], fifthRun[2])
        assertSame(forthRun[3], fifthRun[3])
        assertNotSame(forthRun[4], fifthRun[4])
        assertSame(forthRun[6], fifthRun[7])
        assertHtmlEquals(
            """
            <h1>Header 0</h1>
            <h1>Header 1</h1>
            <p>some paragraph</p>
            <h1>Header 2</h1>
            <h1>Header 7</h1>
            <ul>
            <li>list item 1</li>
            <li>list item 2</li>
            </ul>
            <h1>Header 8</h1>
            <h1>Header 9</h1>
            
            """
                .trimIndent(),
            fifthRun,
        )
    }

    private fun assertHtmlEquals(@Language("html") text: String, actual: List<Block>) {
        assertEquals(text, actual.joinToString("") { htmlRenderer.render(it) })
    }
}

private fun Node.children(): List<Node> {
    var child = firstChild
    return buildList {
        while (child != null) {
            add(child)
            child = child.next
        }
    }
}

private fun assertIndexesEqual(lastProcessedDocument: String, currentIndexes: List<Int>) {
    val commonmarkDocument =
        Parser.builder().includeSourceSpans(IncludeSourceSpans.BLOCKS).build().parse(lastProcessedDocument) as Document
    val expected = commonmarkDocument.children().map { it.sourceSpans.first().inputIndex }
    assertEquals(expected, currentIndexes)
}
