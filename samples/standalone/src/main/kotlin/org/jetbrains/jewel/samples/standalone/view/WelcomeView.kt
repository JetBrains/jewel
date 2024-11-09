package org.jetbrains.jewel.samples.standalone.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt
import org.jetbrains.jewel.foundation.modifier.trackActivation
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.standalone.IntUiThemes
import org.jetbrains.jewel.samples.standalone.StandaloneSampleIcons
import org.jetbrains.jewel.samples.standalone.viewmodel.MainViewModel
import org.jetbrains.jewel.ui.component.CheckboxRow
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.OutlinedButton
import org.jetbrains.jewel.ui.component.RadioButtonChip
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.component.styling.LocalCheckboxStyle
import org.jetbrains.jewel.ui.icon.IconKey
import org.jetbrains.jewel.ui.painter.hints.Selected

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WelcomeView() {
    Column(
        modifier =
            Modifier.trackActivation().fillMaxSize().background(JewelTheme.globalColors.panelBackground).padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
        Icon(key = StandaloneSampleIcons.jewelLogo, contentDescription = null, modifier = Modifier.size(200.dp))

        Text("Meet Jewel", style = Typography.h1TextStyle())

        AnimatedToggleButton()

        val projectName = rememberTextFieldState("")
        val packageName = rememberTextFieldState("")
        val saveLocation = rememberTextFieldState("")

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            FormLayout(modifier = Modifier) {
                Text("Name")
                TextField(state = projectName)

                Text("Package name")
                TextField(state = packageName, modifier = Modifier.fillMaxWidth())

                Text("Save location")
                TextField(state = saveLocation)

                Text("Random image")
                Icon(key = StandaloneSampleIcons.jewelLogo, contentDescription = null, modifier = Modifier.size(200.dp))
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Theme:")

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                ThemeSelectionChip(IntUiThemes.Dark, "Dark", StandaloneSampleIcons.themeDark)

                ThemeSelectionChip(IntUiThemes.Light, "Light", StandaloneSampleIcons.themeLight)

                ThemeSelectionChip(
                    IntUiThemes.LightWithLightHeader,
                    "Light with Light Header",
                    StandaloneSampleIcons.themeLightWithLightHeader,
                )

                ThemeSelectionChip(IntUiThemes.System, "System", StandaloneSampleIcons.themeSystem)
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            CheckboxRow(
                text = "Swing compatibility",
                checked = MainViewModel.swingCompat,
                onCheckedChange = { MainViewModel.swingCompat = it },
                colors = LocalCheckboxStyle.current.colors,
                metrics = LocalCheckboxStyle.current.metrics,
                icons = LocalCheckboxStyle.current.icons,
            )
        }
    }
}

@Composable
private fun AnimatedToggleButton(modifier: Modifier = Modifier) {
    var enabled by remember { mutableStateOf(false) }
    val density = LocalDensity.current
    OutlinedButton(onClick = { enabled = !enabled }, modifier = modifier) {
        AnimatedVisibility(
            visible = enabled,
            enter =
                fadeIn() +
                    expandHorizontally(clip = false, initialWidth = { with(density) { 16.dp.toPx().roundToInt() } }) +
                    slideInHorizontally(
                        animationSpec = spring(dampingRatio = 0.4f, stiffness = 800f),
                        initialOffsetX = { -it / 4 },
                    ),
            exit = fadeOut() + shrinkHorizontally(clip = false),
        ) {
            Icon(
                key = StandaloneSampleIcons.Components.success,
                contentDescription = null,
                modifier = Modifier.padding(end = 4.dp),
            )
        }
        Text(if (enabled) "Enabled" else "Enable")
    }
}

@Composable
fun ThemeSelectionChip(theme: IntUiThemes, name: String, iconKey: IconKey) {
    RadioButtonChip(
        selected = MainViewModel.theme == theme,
        onClick = { MainViewModel.theme = theme },
        enabled = true,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
        ) {
            Icon(iconKey, name, hint = Selected(MainViewModel.theme == theme))
            Text(name)
        }
    }
}
