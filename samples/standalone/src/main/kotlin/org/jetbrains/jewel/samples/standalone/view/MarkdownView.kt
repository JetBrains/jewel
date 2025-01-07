package org.jetbrains.jewel.samples.standalone.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.jewel.foundation.modifier.trackActivation
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.markdown.standalone.dark
import org.jetbrains.jewel.intui.markdown.standalone.light
import org.jetbrains.jewel.intui.markdown.standalone.styling.dark
import org.jetbrains.jewel.intui.markdown.standalone.styling.extensions.github.alerts.dark
import org.jetbrains.jewel.intui.markdown.standalone.styling.extensions.github.alerts.light
import org.jetbrains.jewel.intui.markdown.standalone.styling.light
import org.jetbrains.jewel.markdown.extensions.github.alerts.AlertStyling
import org.jetbrains.jewel.markdown.extensions.github.alerts.GitHubAlertRendererExtension
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.samples.showcase.markdown.JewelReadme
import org.jetbrains.jewel.samples.showcase.markdown.MarkdownEditor
import org.jetbrains.jewel.samples.showcase.markdown.MarkdownPreview
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.Divider

@Composable
fun MarkdownDemo() {
    Row(Modifier.trackActivation().fillMaxSize().background(JewelTheme.globalColors.panelBackground)) {
        val editorState = rememberTextFieldState(JewelReadme)
        MarkdownEditor(state = editorState, modifier = Modifier.fillMaxHeight().weight(1f))

        Divider(Orientation.Vertical, Modifier.fillMaxHeight())

        MarkdownPreview(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f),
            rawMarkdown = editorState.text,
            darkStyling = MarkdownStyling.dark(),
            darkRenderer = MarkdownBlockRenderer.dark(
                styling = MarkdownStyling.dark(),
                rendererExtensions = listOf(GitHubAlertRendererExtension(AlertStyling.dark(), MarkdownStyling.dark())),
            ),
            lightStyling = MarkdownStyling.light(),
            lightRenderer = MarkdownBlockRenderer.light(
                styling = MarkdownStyling.light(),
                rendererExtensions = listOf(GitHubAlertRendererExtension(AlertStyling.light(), MarkdownStyling.light())),
            )
        )
    }
}
