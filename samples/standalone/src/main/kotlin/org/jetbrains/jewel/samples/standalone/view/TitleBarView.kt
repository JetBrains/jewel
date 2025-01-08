package org.jetbrains.jewel.samples.standalone.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.samples.showcase.IntUiThemes
import org.jetbrains.jewel.samples.showcase.components.StandaloneSampleIcons
import org.jetbrains.jewel.samples.showcase.views.MainViewModel
import org.jetbrains.jewel.samples.showcase.views.forCurrentOs
import org.jetbrains.jewel.ui.component.Dropdown
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.IconButton
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.Tooltip
import org.jetbrains.jewel.ui.painter.hints.Size
import org.jetbrains.jewel.window.DecoratedWindowScope
import org.jetbrains.jewel.window.TitleBar
import org.jetbrains.jewel.window.newFullscreenControls
import java.awt.Desktop
import java.net.URI

@Composable
fun DecoratedWindowScope.TitleBarView(mainViewModel: MainViewModel) {
    TitleBar(Modifier.newFullscreenControls(), gradientStartColor = mainViewModel.projectColor) {
        Row(Modifier.align(Alignment.Start)) {
            Dropdown(
                Modifier.height(30.dp),
                menuContent = {
                    mainViewModel.views.forEach {
                        selectableItem(
                            selected = mainViewModel.currentView == it,
                            onClick = { mainViewModel.currentView = it },
                            keybinding = it.keyboardShortcut?.forCurrentOs(),
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Icon(it.iconKey, null, modifier = Modifier.size(20.dp), hint = Size(20))
                                Text(it.title)
                            }
                        }
                    }
                },
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(3.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(mainViewModel.currentView.iconKey, null, hint = Size(20))
                        Text(mainViewModel.currentView.title)
                    }
                }
            }
        }

        Text(title)

        Row(Modifier.align(Alignment.End)) {
            Tooltip({ Text("Open Jewel Github repository") }) {
                IconButton(
                    { Desktop.getDesktop().browse(URI.create("https://github.com/JetBrains/jewel")) },
                    Modifier.size(40.dp).padding(5.dp),
                ) {
                    Icon(StandaloneSampleIcons.gitHub, "Github")
                }
            }

            Tooltip({
                when (mainViewModel.theme) {
                    IntUiThemes.Light -> Text("Switch to light theme with light header")
                    IntUiThemes.LightWithLightHeader -> Text("Switch to dark theme")
                    IntUiThemes.Dark,
                    IntUiThemes.System -> Text("Switch to light theme")
                }
            }) {
                IconButton(
                    {
                        mainViewModel.theme =
                            when (mainViewModel.theme) {
                                IntUiThemes.Light -> IntUiThemes.LightWithLightHeader
                                IntUiThemes.LightWithLightHeader -> IntUiThemes.Dark
                                IntUiThemes.Dark,
                                IntUiThemes.System -> IntUiThemes.Light
                            }
                    },
                    Modifier.size(40.dp).padding(5.dp),
                ) {
                    when (mainViewModel.theme) {
                        IntUiThemes.Light ->
                            Icon(
                                key = StandaloneSampleIcons.themeLight,
                                contentDescription = "Light",
                                hints = arrayOf(Size(20)),
                            )

                        IntUiThemes.LightWithLightHeader ->
                            Icon(
                                key = StandaloneSampleIcons.themeLightWithLightHeader,
                                contentDescription = "Light with light header",
                                hints = arrayOf(Size(20)),
                            )

                        IntUiThemes.Dark ->
                            Icon(
                                key = StandaloneSampleIcons.themeDark,
                                contentDescription = "Dark",
                                hints = arrayOf(Size(20)),
                            )

                        IntUiThemes.System ->
                            Icon(
                                key = StandaloneSampleIcons.themeSystem,
                                contentDescription = "System",
                                hints = arrayOf(Size(20)),
                            )
                    }
                }
            }
        }
    }
}
