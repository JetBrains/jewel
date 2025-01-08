package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.samples.showcase.components.StandaloneSampleIcons
import org.jetbrains.jewel.samples.showcase.views.MarkdownDemo
import org.jetbrains.jewel.samples.standalone.IntUiThemes
import org.jetbrains.jewel.samples.standalone.view.ComponentsView
import org.jetbrains.jewel.samples.standalone.view.WelcomeView

object MainViewModel {
    fun onNavigateTo(destination: String) {
        currentView = views.first { viewInfo -> viewInfo.title == destination }
    }

    var theme: IntUiThemes by mutableStateOf(IntUiThemes.Light)

    var swingCompat: Boolean by mutableStateOf(false)

    val projectColor
        get() =
            if (theme.isLightHeader()) {
                Color(0xFFF5D4C1)
            } else {
                Color(0xFF654B40)
            }

    val views = mainMenuItems

    var currentView by mutableStateOf(views.first())
}

private val mainMenuItems =
    mutableStateListOf(
        ViewInfo(
            title = "Welcome",
            iconKey = StandaloneSampleIcons.welcome,
            keyboardShortcut = KeyBinding(macOs = setOf("⌥", "W"), windows = setOf("Alt", "W")),
            content = { WelcomeView() },
        ),
        ViewInfo(
            title = "Components",
            iconKey = StandaloneSampleIcons.componentsMenu,
            keyboardShortcut = KeyBinding(macOs = setOf("⌥", "C"), windows = setOf("Alt", "C")),
            content = { ComponentsView() },
        ),
        ViewInfo(
            title = "Markdown",
            iconKey = StandaloneSampleIcons.markdown,
            keyboardShortcut =
                KeyBinding(macOs = setOf("⌥", "M"), windows = setOf("Alt", "M"), linux = setOf("Alt", "M")),
            content = {
                MarkdownDemo(
                    darkStyling = MarkdownStyling.dark(),
                    darkRenderer =
                        MarkdownBlockRenderer.dark(
                            styling = MarkdownStyling.dark(),
                            rendererExtensions =
                                listOf(GitHubAlertRendererExtension(AlertStyling.dark(), MarkdownStyling.dark())),
                        ),
                    lightStyling = MarkdownStyling.light(),
                    lightRenderer =
                        MarkdownBlockRenderer.light(
                            styling = MarkdownStyling.light(),
                            rendererExtensions =
                                listOf(GitHubAlertRendererExtension(AlertStyling.light(), MarkdownStyling.light())),
                        ),
                )
            },
        ),
    )
