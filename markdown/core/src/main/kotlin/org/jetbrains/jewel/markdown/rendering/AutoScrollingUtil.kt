package org.jetbrains.jewel.markdown.rendering

import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import kotlin.math.abs
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.markdown.MarkdownBlock
import org.jetbrains.jewel.markdown.extensions.LocalMarkdownMode
import org.jetbrains.jewel.markdown.extensions.markdownMode
import org.jetbrains.jewel.ui.component.Text

/**
 * Use this composable as a wrapper to an actual block composable to enable scrolling to the block in an editor+preview
 * combined mode with scrolling synchronization.
 *
 * @see [DefaultMarkdownBlockRenderer]
 */
@ExperimentalJewelApi
@Composable
public fun AutoScrollableBlock(
    block: MarkdownBlock,
    modifier: Modifier = Modifier,
    content: @Composable (Modifier) -> Unit,
) {
    val synchronizer = JewelTheme.markdownMode.scrollingSynchronizer
    if (synchronizer == null) {
        return content(modifier)
    }

    var previousPosition by remember { mutableStateOf(Offset.Zero) }

    content(
        modifier.onGloballyPositioned { coordinates ->
            val newPosition = coordinates.positionInRoot()
            if (abs(previousPosition.y - newPosition.y) > 1.0) {
                previousPosition = newPosition
                synchronizer.acceptGlobalPosition(block, coordinates)
            }
        }
    )
}

/**
 * Use this composable if you want to have auto-scrolling within atomic text blocks (such as code blocks) in an
 * editor+preview combined mode with scrolling synchronization.
 *
 * @see [DefaultMarkdownBlockRenderer.CodeText]
 */
@ExperimentalJewelApi
@Composable
public fun AutoScrollableText(
    block: MarkdownBlock,
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign = TextAlign.Unspecified,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    inlineContent: Map<String, InlineTextContent> = emptyMap(),
    style: TextStyle = JewelTheme.defaultTextStyle,
) {
    with(LocalMarkdownMode.current) {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            textAlign = textAlign,
            lineHeight = lineHeight,
            overflow = overflow,
            softWrap = softWrap,
            maxLines = maxLines,
            inlineContent = inlineContent,
            onTextLayout = { layout -> scrollingSynchronizer?.acceptTextLayout(block, layout) },
            style = style,
        )
    }
}
