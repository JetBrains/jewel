package org.jetbrains.jewel.samples.showcase.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.jewel.foundation.modifier.trackActivation
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.samples.showcase.FileChooser
import org.jetbrains.jewel.samples.showcase.markdown.JewelReadme
import org.jetbrains.jewel.samples.showcase.markdown.MarkdownEditor
import org.jetbrains.jewel.samples.showcase.markdown.MarkdownPreview
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.Divider

@Composable
public fun MarkdownDemo(
    darkStyling: MarkdownStyling,
    darkRenderer: MarkdownBlockRenderer,
    lightStyling: MarkdownStyling,
    lightRenderer: MarkdownBlockRenderer,
    fileChooser: FileChooser,
) {
    Row(Modifier.trackActivation().fillMaxSize().background(JewelTheme.globalColors.panelBackground)) {
        val editorState = rememberTextFieldState(JewelReadme)
        MarkdownEditor(
            state = editorState,
            modifier = Modifier.fillMaxHeight().weight(1f),
            fileChooser = fileChooser,
        )

        Divider(Orientation.Vertical, Modifier.fillMaxHeight())

        MarkdownPreview(
            modifier = Modifier.fillMaxHeight().weight(1f),
            rawMarkdown = editorState.text,
            darkStyling = darkStyling,
            darkRenderer = darkRenderer,
            lightStyling = lightStyling,
            lightRenderer = lightRenderer,
        )
    }
}
