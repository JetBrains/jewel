package org.jetbrains.jewel.samples.showcase.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.modifier.trackActivation
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.showcase.IntUiThemes
import org.jetbrains.jewel.samples.showcase.components.StandaloneSampleIcons
import org.jetbrains.jewel.ui.component.CheckboxRow
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.RadioButtonChip
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.component.styling.LocalCheckboxStyle
import org.jetbrains.jewel.ui.icon.IconKey
import org.jetbrains.jewel.ui.painter.hints.Selected

@OptIn(ExperimentalLayoutApi::class)
@Composable
public fun WelcomeView(
    isSwingCompat: Boolean,
    swingCompatChecked: (Boolean) -> Unit,
    mainTheme: IntUiThemes,
    onThemeChange: (IntUiThemes) -> Unit,
) {
    Column(
        modifier =
            Modifier.trackActivation().fillMaxSize().background(JewelTheme.globalColors.panelBackground).padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
        Icon(key = StandaloneSampleIcons.jewelLogo, contentDescription = null, modifier = Modifier.size(200.dp))

        Text("Meet Jewel", style = Typography.h1TextStyle())

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Theme:")

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                ThemeSelectionChip(
                    mainTheme = mainTheme,
                    theme = IntUiThemes.Dark,
                    name = "Dark",
                    iconKey = StandaloneSampleIcons.themeDark,
                    onThemeChange = onThemeChange
                )

                ThemeSelectionChip(
                    mainTheme,
                    IntUiThemes.Light,
                    "Light",
                    StandaloneSampleIcons.themeLight,
                    onThemeChange,
                )

                ThemeSelectionChip(
                    mainTheme = mainTheme,
                    theme = IntUiThemes.LightWithLightHeader,
                    name = "Light with Light Header",
                    iconKey = StandaloneSampleIcons.themeLightWithLightHeader,
                    onThemeChange = { onThemeChange(it) },
                )

                ThemeSelectionChip(
                    mainTheme = mainTheme,
                    theme = IntUiThemes.System,
                    name = "System",
                    iconKey = StandaloneSampleIcons.themeSystem,
                    onThemeChange = onThemeChange,
                )
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            CheckboxRow(
                text = "Swing compatibility",
                checked = isSwingCompat,
                onCheckedChange = { swingCompatChecked(it) },
                colors = LocalCheckboxStyle.current.colors,
                metrics = LocalCheckboxStyle.current.metrics,
                icons = LocalCheckboxStyle.current.icons,
            )
        }
    }
}

@Composable
public fun ThemeSelectionChip(
    mainTheme: IntUiThemes,
    theme: IntUiThemes,
    name: String,
    iconKey: IconKey,
    onThemeChange: (IntUiThemes) -> Unit,
) {
    RadioButtonChip(selected = mainTheme == theme, onClick = { onThemeChange(theme) }, enabled = true) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
        ) {
            Icon(iconKey, name, hint = Selected(mainTheme == theme))
            Text(name)
        }
    }
}
