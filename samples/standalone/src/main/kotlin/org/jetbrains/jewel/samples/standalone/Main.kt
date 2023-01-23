package org.jetbrains.jewel.samples.standalone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.IntelliJMetrics
import org.jetbrains.jewel.IntelliJPainters
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.IntelliJTypography
import org.jetbrains.jewel.components.Button
import org.jetbrains.jewel.components.Checkbox
import org.jetbrains.jewel.components.CheckboxRow
import org.jetbrains.jewel.components.GroupHeader
import org.jetbrains.jewel.components.RadioButtonRow
import org.jetbrains.jewel.components.Text
import org.jetbrains.jewel.components.TextField
import org.jetbrains.jewel.components.rememberTabContainerState
import org.jetbrains.jewel.styles.IntelliJButtonStyleVariations
import org.jetbrains.jewel.styles.Styles
import org.jetbrains.jewel.styles.frame
import org.jetbrains.jewel.themes.darcula.standalone.darcula
import org.jetbrains.jewel.themes.expui.standalone.dark
import org.jetbrains.jewel.themes.expui.standalone.default
import org.jetbrains.jewel.themes.expui.standalone.light
import org.jetbrains.jewel.themes.darcula.standalone.default as defaultIj
import org.jetbrains.jewel.themes.darcula.standalone.light as lightIj

@Composable
fun JBTheme(isNewUi: Boolean, isDark: Boolean, content: @Composable () -> Unit) =
    IntelliJTheme(
        JBPalette(isNewUi, isDark),
        JBMetrics(isNewUi, isDark),
        JBPainters(isNewUi, isDark),
        JBTypography(isNewUi, isDark),
        content
    )

fun JBPalette(isNewUi: Boolean, isDark: Boolean): IntelliJPalette =
    when {
        isNewUi && isDark -> IntelliJPalette.dark
        isNewUi && !isDark -> IntelliJPalette.light
        !isNewUi && isDark -> IntelliJPalette.darcula
        else -> IntelliJPalette.lightIj
    }

fun JBPainters(isNewUi: Boolean, isDark: Boolean): IntelliJPainters =
    when {
        isNewUi && isDark -> IntelliJPainters.dark
        isNewUi && !isDark -> IntelliJPainters.light
        !isNewUi && isDark -> IntelliJPainters.darcula
        else -> IntelliJPainters.lightIj
    }

fun JBTypography(isNewUi: Boolean, isDark: Boolean): IntelliJTypography =
    when {
        isNewUi && isDark -> IntelliJTypography.dark
        isNewUi && !isDark -> IntelliJTypography.light
        !isNewUi && isDark -> IntelliJTypography.darcula
        else -> IntelliJTypography.lightIj
    }

fun JBMetrics(isNewUi: Boolean, isDark: Boolean): IntelliJMetrics =
    if (isNewUi) {
        IntelliJMetrics.default
    } else {
        IntelliJMetrics.defaultIj
    }

fun main() = singleWindowApplication(
    title = "TODO: sample app"
) {
    var isDark by remember { mutableStateOf(false) }
    var isNewUi by remember { mutableStateOf(true) }
    JBTheme(isNewUi = isNewUi, isDark = isDark) {
        Box(Modifier.fillMaxSize().background(Styles.frame.appearance(Unit).backgroundColor), contentAlignment = Alignment.Center) {
            Column(
                Modifier.width(IntrinsicSize.Max),
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GroupHeader("Theme Switch")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox("Dark", isDark, { isDark = !isDark })
                    Checkbox("New UI", isNewUi, { isNewUi = !isNewUi })
                }
                GroupHeader("Checkboxes")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var state by remember { mutableStateOf(ToggleableState.Indeterminate) }
                    CheckboxRow(state, {
                        state = when (state) {
                            ToggleableState.Off -> ToggleableState.On
                            ToggleableState.On -> ToggleableState.Off
                            ToggleableState.Indeterminate -> ToggleableState.On
                        }
                    }) {
                        Text("Checkbox")
                    }
                    Checkbox("Off", false, {})
                    Checkbox("On", true, {})
                    Checkbox("Disabled Off", false, {}, enabled = false)
                    Checkbox("Disabled On", true, {}, enabled = false)
                }
                GroupHeader("Buttons")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button({}) {
                        Text("Cancel")
                    }
                    Button({}) {
                        Text("Apply")
                    }
                    Button({}, enabled = false) {
                        Text("Disabled")
                    }
                    Button({}, variation = IntelliJButtonStyleVariations.DefaultButton) {
                        Text("OK")
                    }
                }
                GroupHeader("RadioButtons")
                Row(
                    modifier = Modifier.selectableGroup(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var selectedIndex by remember { mutableStateOf(0) }
                    val firstRadioButtonId = 0
                    RadioButtonRow(selectedIndex == firstRadioButtonId, {
                        selectedIndex = firstRadioButtonId
                    }) {
                        Text("First")
                    }
                    val secondRadioButtonId = 1
                    RadioButtonRow(selectedIndex == secondRadioButtonId, {
                        selectedIndex = secondRadioButtonId
                    }, enabled = false) {
                        Text("Second")
                    }
                    val thirdRadioButtonId = 2
                    RadioButtonRow(selectedIndex == thirdRadioButtonId, {
                        selectedIndex = thirdRadioButtonId
                    }) {
                        Text("Third")
                    }
                    val fourthRadioButtonId = 3
                    RadioButtonRow(selectedIndex == fourthRadioButtonId, {
                        selectedIndex = fourthRadioButtonId
                    }) {
                        Text("Fourth")
                    }
                }
                val tabState = rememberTabContainerState(0)
                TextField(Modifier.fillMaxWidth(), "Text Field", onValueChange = {})
            }
        }
    }
}
