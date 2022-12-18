package org.jetbrains.jewel.samples.standalone

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.components.Button
import org.jetbrains.jewel.components.Checkbox
import org.jetbrains.jewel.components.CheckboxRow
import org.jetbrains.jewel.components.RadioButtonRow
import org.jetbrains.jewel.components.Text
import org.jetbrains.jewel.styles.IntelliJButtonStyleVariations
import org.jetbrains.jewel.themes.expui.standalone.ExpUiTheme

fun main() = singleWindowApplication(
    title = "TODO: sample app"
) {
    ExpUiTheme(isDark = false) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
            }
        }
    }
}
