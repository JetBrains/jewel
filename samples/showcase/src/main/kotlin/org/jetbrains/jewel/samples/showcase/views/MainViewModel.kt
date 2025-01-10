package org.jetbrains.jewel.samples.showcase.views

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.markdown.rendering.MarkdownBlockRenderer
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling
import org.jetbrains.jewel.samples.showcase.FileChooser
import org.jetbrains.jewel.samples.showcase.IntUiThemes
import org.jetbrains.jewel.samples.showcase.components.StandaloneSampleIcons
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility

public class MainViewModel(
    alwaysVisibleScrollbarVisibility: ScrollbarVisibility.AlwaysVisible,
    whenScrollingScrollbarVisibility: ScrollbarVisibility.WhenScrolling,
    markdownStylingDark: MarkdownStyling,
    markdownDarkRenderer: MarkdownBlockRenderer,
    markdownStylingLight: MarkdownStyling,
    markdownLightRenderer: MarkdownBlockRenderer,
    fileChooser: FileChooser,
) {
    private val componentsViewModel: ComponentsViewModel =
        ComponentsViewModel(
            alwaysVisibleScrollbarVisibility = alwaysVisibleScrollbarVisibility,
            whenScrollingScrollbarVisibility = whenScrollingScrollbarVisibility,
        )

    public fun onNavigateTo(destination: String) {
        currentView = views.first { viewInfo -> viewInfo.title == destination }
    }

    public var theme: IntUiThemes by mutableStateOf(IntUiThemes.Light)

    public var swingCompat: Boolean by mutableStateOf(false)

    public var fileContent: String by mutableStateOf("")

    public val projectColor: Color
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
                content = { ComponentsView(componentsViewModel) },
            ),
            ViewInfo(
                title = "Markdown",
                iconKey = StandaloneSampleIcons.markdown,
                keyboardShortcut =
                    KeyBinding(macOs = setOf("⌥", "M"), windows = setOf("Alt", "M"), linux = setOf("Alt", "M")),
                content = {
                    MarkdownDemo(
                        darkStyling = markdownStylingDark,
                        darkRenderer = markdownDarkRenderer,
                        lightStyling = markdownStylingLight,
                        lightRenderer = markdownLightRenderer,
                        fileChooser = fileChooser,
                    )
                },
            ),
        )
    public val views: SnapshotStateList<ViewInfo> = mainMenuItems
    public var currentView: ViewInfo by mutableStateOf(views.first())
}
