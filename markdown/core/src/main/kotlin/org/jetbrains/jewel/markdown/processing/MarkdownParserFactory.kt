package org.jetbrains.jewel.markdown.processing

import org.commonmark.parser.IncludeSourceSpans
import org.commonmark.parser.Parser
import org.jetbrains.jewel.markdown.extensions.MarkdownProcessorExtension

/**
 * Simplifies creating a [CommonMark `Parser`][Parser] while also supporting Jewel's [MarkdownProcessorExtension]s and
 * the `optimizeEdits` flag.
 */
public object MarkdownParserFactory {
    /**
     * Create a [CommonMark `Parser`][Parser] with the provided [extensions]. The parser's [Builder][Parser.Builder] can
     * be customized by providing a non-null [customizeBuilder] lambda.
     *
     * Make sure to provide the right value for [editorMode], matching the one provided to the [MarkdownProcessor], or
     * this parser will not be set up correctly.
     *
     * @param editorMode If true, sets up the [Parser] to allow for edits optimization in the [MarkdownProcessor].
     * @param extensions A list of [MarkdownProcessorExtension] to attach.
     * @param customizeBuilder Allows customizing the [Parser.Builder] before its [build()][Parser.Builder.build] method
     *   is called. Make sure not to change the [org.commonmark.parser.Parser.Builder.includeSourceSpans] value if
     *   [editorMode] is true.
     */
    public fun create(
        editorMode: Boolean,
        extensions: List<MarkdownProcessorExtension> = emptyList(),
        customizeBuilder: (Parser.Builder.() -> Parser.Builder)? = null,
    ): Parser =
        Parser.builder()
            .extensions(extensions.mapNotNull(MarkdownProcessorExtension::parserExtension))
            .run {
                // If editorMode is enabled, we need to have block-level source spans info
                if (editorMode) {
                    includeSourceSpans(IncludeSourceSpans.BLOCKS)
                } else {
                    this
                }
            }
            .run {
                if (customizeBuilder != null) {
                    customizeBuilder()
                } else {
                    this
                }
            }
            .build()
}
