package org.jetbrains.jewel.bridge.code.highlighting

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.intellij.lang.Language
import com.intellij.lang.LanguageUtil
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.service
import com.intellij.openapi.editor.colors.EditorColorsManager
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.testFramework.LightVirtualFile
import java.awt.Font
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.jetbrains.jewel.bridge.toComposeColorOrUnspecified
import org.jetbrains.jewel.foundation.code.MimeType
import org.jetbrains.jewel.foundation.code.highlighting.CodeHighlighter

@Service(Service.Level.PROJECT)
public class LexerBasedCodeHighlighter(private val project: Project) : CodeHighlighter {

    override fun highlight(code: String, mimeType: MimeType): Flow<AnnotatedString> {
        val language = mimeType.toLanguageOrNull() ?: return flowOf(AnnotatedString(code))
        val virtualFile =
            LightVirtualFile(
                "markdown_code_block_${code.hashCode()}.${language.associatedFileType?.defaultExtension ?: "txt"}",
                language,
                code,
            )
        val colorScheme = EditorColorsManager.getInstance().globalScheme
        val highlighter = SyntaxHighlighterFactory.getSyntaxHighlighter(language, project, virtualFile)

        return flowOf(
            buildAnnotatedString {
                with(highlighter.highlightingLexer) {
                    start(code)

                    while (tokenType != null) {
                        val attributes: TextAttributes? = run {
                            val attrKey = highlighter.getTokenHighlights(tokenType).lastOrNull() ?: return@run null
                            colorScheme.getAttributes(attrKey) ?: attrKey.defaultAttributes
                        }
                        withTextAttributes(attributes) { append(tokenText) }
                        advance()
                    }
                }
            }
        )
    }

    private fun MimeType.toLanguageOrNull(): Language? {
        return LanguageUtil.findRegisteredLanguage(displayName().lowercase())
    }

    private fun AnnotatedString.Builder.withTextAttributes(
        textAttributes: TextAttributes?,
        block: AnnotatedString.Builder.() -> Unit,
    ) {
        if (textAttributes == null) {
            return block()
        }
        withStyle(textAttributes.toSpanStyle(), block)
    }

    private fun TextAttributes.toSpanStyle() =
        SpanStyle(
            color = foregroundColor.toComposeColorOrUnspecified(),
            fontWeight = if (fontType and Font.BOLD != 0) FontWeight.Bold else null,
            fontStyle = if (fontType and Font.ITALIC != 0) FontStyle.Italic else null,
        )

    public companion object {
        public fun getInstance(project: Project): LexerBasedCodeHighlighter = project.service()
    }
}
