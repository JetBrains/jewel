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
import org.jetbrains.jewel.internal.DropdownLink
import org.jetbrains.jewel.internal.ExternalLink
import org.jetbrains.jewel.internal.GroupHeader
import org.jetbrains.jewel.internal.IntelliJTheme
import org.jetbrains.jewel.internal.LabelledTextField
import org.jetbrains.jewel.internal.Link
import org.jetbrains.jewel.internal.OutlinedButton
import org.jetbrains.jewel.internal.RadioButtonRow
import org.jetbrains.jewel.internal.Text
import org.jetbrains.jewel.internal.TextField
import org.jetbrains.jewel.internal.TriStateCheckboxRow
import org.jetbrains.jewel.themes.intui.standalone.internal.dark.DarkTheme
import org.jetbrains.jewel.themes.intui.standalone.internal.light.LightTheme

@Composable
fun JBTheme(isDark: Boolean, content: @Composable () -> Unit) =
    IntelliJTheme(
        if (isDark) DarkTheme else LightTheme,
        content
    )

@Suppress("MagicNumber")
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
                GroupHeader("Themes")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CheckboxRow("Dark", isDark, { isDark = it })
                }
                GroupHeader("Buttons")
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
                GroupHeader("Checkboxes")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var checked by remember { mutableStateOf(ToggleableState.On) }
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
                GroupHeader("RadioButtons")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var index by remember { mutableStateOf(0) }
                    RadioButtonRow(
                        text = "Default",
                        selected = index == 0,
                        onClick = { index = 0 }
                    )

                    RadioButtonRow(
                        text = "Error",
                        selected = index == 1,
                        onClick = { index = 1 },
                        isError = true
                    )

                    RadioButtonRow(
                        text = "Disabled",
                        selected = index == 2,
                        onClick = { index = 2 },
                        enabled = false
                    )

                    RadioButtonRow(
                        text = "Another",
                        selected = index == 3,
                        onClick = { index = 3 }
                    )
                }
                GroupHeader("Links")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Link("Link", {})

                    ExternalLink("ExternalLink", {})

                    DropdownLink("DropdownLink", {})
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Link("Link", {}, enabled = false)

                    ExternalLink("ExternalLink", {}, enabled = false)

                    DropdownLink("DropdownLink", {}, enabled = false)
                }
                GroupHeader("TextFields")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    var text1 by remember { mutableStateOf("TextField") }
                    TextField(text1, { text1 = it })

                    var text2 by remember { mutableStateOf("Error hinted") }
                    TextField(text2, { text2 = it }, isError = true)

                    var text3 by remember { mutableStateOf("Disabled") }
                    TextField(text3, { text3 = it }, enabled = false)

                    var text4 by remember { mutableStateOf("") }
                    TextField(text4, { text4 = it }, placeholder = {
                        Text("Placeholder")
                    })
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    var text1 by remember { mutableStateOf("Labelled TextField") }
                    LabelledTextField({
                        Text("Label:")
                    }, text1, { text1 = it })

                    var text2 by remember { mutableStateOf("Labelled TextField with hint") }
                    LabelledTextField({
                        Text("Label:")
                    }, text2, { text2 = it }, hint = {
                            Text("Attached hint text")
                        })
                }
            }
        }
    }
}
