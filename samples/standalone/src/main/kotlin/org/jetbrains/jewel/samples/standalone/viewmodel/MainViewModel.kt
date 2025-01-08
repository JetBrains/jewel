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
import org.jetbrains.jewel.intui.standalone.styling.defaults
import org.jetbrains.jewel.markdown.extensions.github.alerts.AlertStyling
import org.jetbrains.jewel.markdown.extensions.github.alerts.GitHubAlertRendererExtension
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.samples.showcase.IntUiThemes
import org.jetbrains.jewel.samples.showcase.components.StandaloneSampleIcons
import org.jetbrains.jewel.samples.showcase.views.ComponentsView
import org.jetbrains.jewel.samples.showcase.views.ComponentsViewModel
import org.jetbrains.jewel.samples.showcase.views.KeyBinding
import org.jetbrains.jewel.samples.showcase.views.MarkdownDemo
import org.jetbrains.jewel.samples.showcase.views.ViewInfo
import org.jetbrains.jewel.samples.showcase.views.WelcomeView
import org.jetbrains.jewel.ui.component.styling.IconButtonColors
import org.jetbrains.jewel.ui.component.styling.IconButtonMetrics
import org.jetbrains.jewel.ui.component.styling.LinkStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility

class MainViewModel(
    scrollbarDark: ScrollbarStyle,
    scrollbarLight: ScrollbarStyle,
    alwaysVisibleScrollbarVisibility: ScrollbarVisibility.AlwaysVisible,
    whenScrollingScrollbarVisibility: ScrollbarVisibility.WhenScrolling,
    textFieldIconColorsDark: IconButtonColors,
    textFieldIconColorsLight: IconButtonColors,
    darkLinkStyle: LinkStyle,
    linkStyleLight: LinkStyle,
) {
    private val componentsViewModel: ComponentsViewModel =
        ComponentsViewModel(
            darkLinkStyle = darkLinkStyle,
            linkStyleLight = linkStyleLight,
            iconButtonMetrics = IconButtonMetrics.defaults(),
            scrollbarDark = scrollbarDark,
            scrollbarLight = scrollbarLight,
            alwaysVisibleScrollbarVisibility = alwaysVisibleScrollbarVisibility,
            whenScrollingScrollbarVisibility = whenScrollingScrollbarVisibility,
            textFieldIconColorsDark = textFieldIconColorsDark,
            textFieldIconColorsLight = textFieldIconColorsLight,
        )

    fun onNavigateTo(destination: String) {
        currentView = views.first { viewInfo -> viewInfo.title == destination }
    }

    var theme: IntUiThemes by mutableStateOf(IntUiThemes.Light)

    var swingCompat: Boolean by mutableStateOf(false)

    val projectColor
        get() = if (theme.isLightHeader()) Color(0xFFF5D4C1) else Color(0xFF654B40)

    private val mainMenuItems =
        mutableStateListOf(
            ViewInfo(
                title = "Welcome",
                iconKey = StandaloneSampleIcons.welcome,
                keyboardShortcut = KeyBinding(macOs = setOf("⌥", "W"), windows = setOf("Alt", "W")),
                content = {
                    WelcomeView(
                        isSwingCompat = swingCompat,
                        swingCompatChecked = { swingCompat = it },
                        mainTheme = theme,
                        onThemeChange = { theme = it },
                    )
                },
            ),
            ViewInfo(
                title = "Components",
                iconKey = StandaloneSampleIcons.componentsMenu,
                keyboardShortcut = KeyBinding(macOs = setOf("⌥", "C"), windows = setOf("Alt", "C")),
                content = { ComponentsView(viewModel = componentsViewModel) },
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
    val views = mainMenuItems
    var currentView by mutableStateOf(views.first())
}
