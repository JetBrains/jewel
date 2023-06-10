package org.jetbrains.jewel.samples.standalone.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
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
import org.jetbrains.jewel.internal.CheckboxRow
import org.jetbrains.jewel.internal.DefaultButton
import org.jetbrains.jewel.internal.IntelliJTheme
import org.jetbrains.jewel.internal.OutlinedButton
import org.jetbrains.jewel.internal.Text
import org.jetbrains.jewel.internal.TriStateCheckboxRow
import org.jetbrains.jewel.themes.intui.standalone.internal.dark.DarkTheme
import org.jetbrains.jewel.themes.intui.standalone.internal.light.LightTheme

@Composable
fun JBTheme(isDark: Boolean, content: @Composable () -> Unit) =
    IntelliJTheme(
        if (isDark) DarkTheme else LightTheme,
        content
    )

fun main() = singleWindowApplication(
    title = "TODO: sample app"
) {
    var isDark by remember { mutableStateOf(false) }
    var isNewUi by remember { mutableStateOf(true) }
    JBTheme(isDark = isDark) {
        Box(Modifier.fillMaxSize().background(IntelliJTheme.colors.background), contentAlignment = Alignment.Center) {
            Column(
                Modifier.width(IntrinsicSize.Max),
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CheckboxRow("Dark", isDark, { isDark = it })
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton({
                    }) {
                        Text("Cancel")
                    }
                    OutlinedButton({
                    }) {
                        Text("Apply")
                    }
                    OutlinedButton({}, enabled = false) {
                        Text("Disabled")
                    }
                    DefaultButton(
                        {
                        },
                        interactionSource = remember {
                            MutableInteractionSource()
                        }
                    ) {
                        Text("OK")
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var checked by remember { mutableStateOf(ToggleableState.Indeterminate) }
                    TriStateCheckboxRow("Checkbox", checked, {
                        checked = when (checked) {
                            ToggleableState.On -> ToggleableState.Off
                            ToggleableState.Off -> ToggleableState.Indeterminate
                            ToggleableState.Indeterminate -> ToggleableState.On
                        }
                    })
                    TriStateCheckboxRow("Error", checked, {
                        checked = when (checked) {
                            ToggleableState.On -> ToggleableState.Off
                            ToggleableState.Off -> ToggleableState.Indeterminate
                            ToggleableState.Indeterminate -> ToggleableState.On
                        }
                    }, isError = true)
                    TriStateCheckboxRow("Disabled", checked, {}, enabled = false)
                }
            }
        }
    }
}
