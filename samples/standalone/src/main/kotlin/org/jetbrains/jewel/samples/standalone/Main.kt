package org.jetbrains.jewel.samples.standalone

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.res.loadSvgPainter
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.application
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.intui.standalone.theme.darkThemeDefinition
import org.jetbrains.jewel.intui.standalone.theme.lightThemeDefinition
import org.jetbrains.jewel.intui.window.decoratedWindow
import org.jetbrains.jewel.intui.window.styling.dark
import org.jetbrains.jewel.intui.window.styling.light
import org.jetbrains.jewel.intui.window.styling.lightWithLightHeader
import org.jetbrains.jewel.samples.standalone.view.TitleBarView
import org.jetbrains.jewel.samples.standalone.view.component.Borders
import org.jetbrains.jewel.samples.standalone.view.component.Buttons
import org.jetbrains.jewel.samples.standalone.view.component.Checkboxes
import org.jetbrains.jewel.samples.standalone.view.component.ChipsAndTree
import org.jetbrains.jewel.samples.standalone.view.component.Dropdowns
import org.jetbrains.jewel.samples.standalone.view.component.Icons
import org.jetbrains.jewel.samples.standalone.view.component.Links
import org.jetbrains.jewel.samples.standalone.view.component.ProgressBar
import org.jetbrains.jewel.samples.standalone.view.component.RadioButtons
import org.jetbrains.jewel.samples.standalone.view.component.Tabs
import org.jetbrains.jewel.samples.standalone.view.component.TextAreas
import org.jetbrains.jewel.samples.standalone.view.component.TextFields
import org.jetbrains.jewel.samples.standalone.view.component.Tooltips
import org.jetbrains.jewel.samples.standalone.viewmodel.MainViewModel
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.ui.component.VerticalScrollbar
import org.jetbrains.jewel.window.DecoratedWindow
import org.jetbrains.jewel.window.styling.TitleBarStyle
import java.io.InputStream

fun main() {
    val icon = svgResource("icons/jewel-logo.svg")
    application {
        val themeDefinition =
            if (MainViewModel.theme.isDark()) {
                JewelTheme.darkThemeDefinition()
            } else {
                JewelTheme.lightThemeDefinition()
            }

        IntUiTheme(
            themeDefinition,
            ComponentStyling.decoratedWindow(
                titleBarStyle = when (MainViewModel.theme) {
                    IntUiThemes.Light -> TitleBarStyle.light()
                    IntUiThemes.LightWithLightHeader -> TitleBarStyle.lightWithLightHeader()
                    IntUiThemes.Dark -> TitleBarStyle.dark()
                    IntUiThemes.SYSTEM -> if (MainViewModel.theme.isDark()) {
                        TitleBarStyle.dark()
                    } else {
                        TitleBarStyle.light()
                    }
                },
            ),
            MainViewModel.swingCompat,
        ) {
            DecoratedWindow(
                onCloseRequest = { exitApplication() },
                title = "Jewel component catalog",
                icon = icon,
            ) {
                TitleBarView()
                MainViewModel.currentView.content()

//                Column(Modifier.fillMaxSize().background(JewelTheme.globalColors.paneBackground)) {
//                    Row(
//                        modifier = Modifier.fillMaxWidth().padding(8.dp),
//                        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        CheckboxRow("Swing compat", MainViewModel.swingCompat, { MainViewModel.swingCompat = it })
//                    }
//
//                    Divider(Orientation.Horizontal, Modifier.fillMaxWidth())
//
//                    ComponentShowcase()
//                }
            }
        }
    }
}

@Composable
private fun ComponentShowcase() {
    val verticalScrollState = rememberScrollState()
    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier.width(IntrinsicSize.Max)
                .verticalScroll(verticalScrollState)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Borders()
            Buttons()
            Dropdowns()
            Checkboxes()
            RadioButtons()
            Links()
            Tooltips()
            TextFields()
            TextAreas()
            ProgressBar()
            ChipsAndTree()
            Tabs()
            Icons()
        }

        VerticalScrollbar(
            modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
            adapter = rememberScrollbarAdapter(verticalScrollState),
        )
    }
}

private fun svgResource(
    resourcePath: String,
    loader: ResourceLoader = ResourceLoader.Default,
): Painter =
    loader.load(resourcePath)
        .use { stream: InputStream ->
            loadSvgPainter(stream, Density(1f))
        }
