package org.jetbrains.jewel.samples.standalone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.isAltPressed
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.type
import androidx.compose.ui.unit.Density
import androidx.compose.ui.window.application
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.decodeToSvgPainter
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.util.JewelLogger
import org.jetbrains.jewel.intui.markdown.standalone.dark
import org.jetbrains.jewel.intui.markdown.standalone.light
import org.jetbrains.jewel.intui.markdown.standalone.styling.dark
import org.jetbrains.jewel.intui.markdown.standalone.styling.extensions.github.alerts.dark
import org.jetbrains.jewel.intui.markdown.standalone.styling.extensions.github.alerts.light
import org.jetbrains.jewel.intui.markdown.standalone.styling.light
import org.jetbrains.jewel.intui.standalone.styling.dark
import org.jetbrains.jewel.intui.standalone.styling.default
import org.jetbrains.jewel.intui.standalone.styling.defaults
import org.jetbrains.jewel.intui.standalone.styling.light
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.intui.standalone.theme.createDefaultTextStyle
import org.jetbrains.jewel.intui.standalone.theme.createEditorTextStyle
import org.jetbrains.jewel.intui.standalone.theme.darkThemeDefinition
import org.jetbrains.jewel.intui.standalone.theme.default
import org.jetbrains.jewel.intui.standalone.theme.lightThemeDefinition
import org.jetbrains.jewel.intui.window.decoratedWindow
import org.jetbrains.jewel.intui.window.styling.dark
import org.jetbrains.jewel.intui.window.styling.light
import org.jetbrains.jewel.intui.window.styling.lightWithLightHeader
import org.jetbrains.jewel.markdown.extensions.github.alerts.AlertStyling
import org.jetbrains.jewel.markdown.extensions.github.alerts.GitHubAlertRendererExtension
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.samples.showcase.IntUiThemes
import org.jetbrains.jewel.samples.showcase.views.MainViewModel
import org.jetbrains.jewel.samples.standalone.view.TitleBarView
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.ui.component.styling.IconButtonColors
import org.jetbrains.jewel.ui.component.styling.IconButtonMetrics
import org.jetbrains.jewel.ui.component.styling.LinkStyle
import org.jetbrains.jewel.ui.component.styling.LinkUnderlineBehavior
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility
import org.jetbrains.jewel.window.DecoratedWindow
import org.jetbrains.jewel.window.styling.TitleBarStyle

fun main() {
    JewelLogger.getInstance("StandaloneSample").info("Starting Jewel Standalone sample")

    val icon = svgResource("icons/jewel-logo.svg")
    val mainViewModel =
        MainViewModel(
            scrollbarDark = ScrollbarStyle.dark(),
            scrollbarLight = ScrollbarStyle.light(),
            alwaysVisibleScrollbarVisibility = ScrollbarVisibility.AlwaysVisible.default(),
            whenScrollingScrollbarVisibility = ScrollbarVisibility.WhenScrolling.default(),
            textFieldIconColorsDark =
                IconButtonColors.dark(
                    background = Color.Unspecified,
                    backgroundDisabled = Color.Unspecified,
                    backgroundSelected = Color.Unspecified,
                    backgroundSelectedActivated = Color.Unspecified,
                    backgroundFocused = Color.Unspecified,
                    backgroundPressed = Color.Unspecified,
                    backgroundHovered = Color.Unspecified,
                ),
            textFieldIconColorsLight =
                IconButtonColors.light(
                    background = Color.Unspecified,
                    backgroundDisabled = Color.Unspecified,
                    backgroundSelected = Color.Unspecified,
                    backgroundSelectedActivated = Color.Unspecified,
                    backgroundFocused = Color.Unspecified,
                    backgroundPressed = Color.Unspecified,
                    backgroundHovered = Color.Unspecified,
                ),
            darkLinkStyle = LinkStyle.dark(underlineBehavior = LinkUnderlineBehavior.ShowAlways),
            linkStyleLight = LinkStyle.light(underlineBehavior = LinkUnderlineBehavior.ShowAlways),
            iconButtonMetrics = IconButtonMetrics.defaults(),
            markdownStylingDark = MarkdownStyling.dark(),
            markdownDarkRenderer = MarkdownBlockRenderer.dark(
                styling = MarkdownStyling.dark(),
                rendererExtensions =
                listOf(GitHubAlertRendererExtension(AlertStyling.dark(), MarkdownStyling.dark())),
            ),
            markdownStylingLight = MarkdownStyling.light(),
            markdownLightRenderer = MarkdownBlockRenderer.light(
                styling = MarkdownStyling.light(),
                rendererExtensions =
                listOf(GitHubAlertRendererExtension(AlertStyling.light(), MarkdownStyling.light())),
            )
        )

    application {
        val textStyle = JewelTheme.createDefaultTextStyle()
        val editorStyle = JewelTheme.createEditorTextStyle()

        val themeDefinition =
            if (mainViewModel.theme.isDark()) {
                JewelTheme.darkThemeDefinition(defaultTextStyle = textStyle, editorTextStyle = editorStyle)
            } else {
                JewelTheme.lightThemeDefinition(defaultTextStyle = textStyle, editorTextStyle = editorStyle)
            }

        IntUiTheme(
            theme = themeDefinition,
            styling =
                ComponentStyling.default()
                    .decoratedWindow(
                        titleBarStyle =
                            when (mainViewModel.theme) {
                                IntUiThemes.Light -> TitleBarStyle.light()
                                IntUiThemes.LightWithLightHeader -> TitleBarStyle.lightWithLightHeader()
                                IntUiThemes.Dark -> TitleBarStyle.dark()
                                IntUiThemes.System ->
                                    if (mainViewModel.theme.isDark()) {
                                        TitleBarStyle.dark()
                                    } else {
                                        TitleBarStyle.light()
                                    }
                            }
                    ),
            swingCompatMode = mainViewModel.swingCompat,
        ) {
            DecoratedWindow(
                onCloseRequest = { exitApplication() },
                title = "Jewel standalone sample",
                icon = icon,
                onKeyEvent = { keyEvent ->
                    processKeyShortcuts(keyEvent = keyEvent, onNavigateTo = mainViewModel::onNavigateTo)
                },
                content = {
                    TitleBarView(mainViewModel)
                    mainViewModel.currentView.content()
                },
            )
        }
    }
}

/*
   Alt + W -> Welcome
   Alt + M -> Markdown
   Alt + C -> Components
*/
private fun processKeyShortcuts(keyEvent: KeyEvent, onNavigateTo: (String) -> Unit): Boolean {
    if (!keyEvent.isAltPressed || keyEvent.type != KeyEventType.KeyDown) return false
    return when (keyEvent.key) {
        Key.W -> {
            onNavigateTo("Welcome")
            true
        }

        Key.M -> {
            onNavigateTo("Markdown")
            true
        }

        Key.C -> {
            onNavigateTo("Components")
            true
        }

        else -> false
    }
}

@Suppress("SameParameterValue")
@OptIn(ExperimentalResourceApi::class)
private fun svgResource(resourcePath: String): Painter =
    checkNotNull(ResourceLoader.javaClass.classLoader.getResourceAsStream(resourcePath)) {
            "Could not load resource $resourcePath: it does not exist or can't be read."
        }
        .readAllBytes()
        .decodeToSvgPainter(Density(1f))

private object ResourceLoader
