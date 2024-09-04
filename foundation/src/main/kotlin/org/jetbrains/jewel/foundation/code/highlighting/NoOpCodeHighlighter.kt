package org.jetbrains.jewel.foundation.code.highlighting

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.jetbrains.jewel.foundation.code.MimeType

public object NoOpCodeHighlighter : CodeHighlighter {
    override fun highlight(code: String, mimeType: MimeType): Flow<AnnotatedString> =
        flowOf(buildAnnotatedString { withStyle(TextStyle.Default.toSpanStyle()) { append(code) } })
}
