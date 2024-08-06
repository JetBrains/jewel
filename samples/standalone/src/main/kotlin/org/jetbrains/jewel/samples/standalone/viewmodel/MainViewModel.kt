package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.samples.standalone.IntUiThemes
import org.jetbrains.jewel.samples.standalone.view.ComponentsView
import org.jetbrains.jewel.samples.standalone.view.MarkdownDemo
import org.jetbrains.jewel.samples.standalone.view.WelcomeView
import org.jetbrains.jewel.ui.icon.PathIconKey

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

    val views = mainMenuItems.toMutableStateList()

    var currentView by mutableStateOf(views.first())
}

private val mainMenuItems = listOf(
    ViewInfo(
        title = "Welcome",
        position = 0,
        PathIconKey("icons/meetNewUi.svg", View::class.java),
        content = { WelcomeView() }
    ),
    ViewInfo(
        title = "Components",
        position = 1,
        PathIconKey("icons/structure.svg", View::class.java),
        content = { ComponentsView() }
    ),
    ViewInfo(
        title = "Markdown",
        position = 2,
        PathIconKey("icons/markdown.svg", View::class.java),
        content = { MarkdownDemo() }
    )
)
