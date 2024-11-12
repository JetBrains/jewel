package org.jetbrains.jewel.samples.ideplugin.dialog.wizard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.jewel.samples.ideplugin.dialog.WizardPage
import org.jetbrains.jewel.ui.component.Dropdown
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.Link
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.icons.AllIconsKeys

class ConfigureStepPage(override val templateData: Template) : WizardPage, TemplateWizardPage {
    override val canGoBackwards: StateFlow<Boolean> = MutableStateFlow(true)
    override val canGoForward: StateFlow<Boolean> = MutableStateFlow(true)

    @Composable
    override fun PageContent() {
        val projectName = rememberTextFieldState("My Application")
        val packageName = rememberTextFieldState("com.example.myapplication")
        val saveLocation = rememberTextFieldState("/Users/csinco/AndroidStudioProjects/MyApplication")
        var minimumSdk by remember { mutableIntStateOf(28) }
        var useCompose by remember { mutableStateOf(true) }
        var buildConfigurationKts by remember { mutableStateOf(true) }

        Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(vertical = 20.dp, horizontal = 64.dp)) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(templateData.name, style = Typography.h2TextStyle())
                templateData.description?.let {
                    Spacer(Modifier.height(8.dp))
                    Text(templateData.description)
                }
                Spacer(Modifier.height(20.dp))
                FormLayout(modifier = Modifier.fillMaxWidth()) {
                    Text("Name")
                    TextField(state = projectName, modifier = Modifier.fillMaxWidth())

                    Text("Package name")
                    TextField(state = packageName, modifier = Modifier.fillMaxWidth())

                    Text("Save location")
                    TextField(
                        state = saveLocation,
                        trailingIcon = { Icon(key = AllIconsKeys.General.OpenDisk, contentDescription = null) },
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Text("UI framework")
                    Dropdown(
                        menuContent = {
                            selectableItem(selected = useCompose, onClick = { useCompose = true }) {
                                Text("Compose (Recommended)")
                            }
                            selectableItem(selected = !useCompose, onClick = { useCompose = false }) { Text("Views") }
                        },
                        modifier = Modifier.fillMaxWidth(0.7f),
                    ) {
                        Text(if (useCompose) "Compose (Recommended)" else "Views")
                    }

                    Text("Minimum SDK")
                    Column {
                        Dropdown(
                            menuContent = {
                                androidVersions.forEach { (api, name) ->
                                    selectableItem(selected = api == minimumSdk, onClick = { minimumSdk = api }) {
                                        Text(name)
                                    }
                                }
                            },
                            modifier = Modifier.fillMaxWidth(0.7f),
                        ) {
                            Text(androidVersions.first { it.first == minimumSdk }.second)
                        }
                        Spacer(Modifier.height(12.dp))
                        Row {
                            Icon(key = AllIconsKeys.General.Information, contentDescription = null)
                            Spacer(Modifier.width(4.dp))
                            Column {
                                Text("Your app will run on approximately 89.5% of devices.")
                                Spacer(Modifier.height(4.dp))
                                Link(text = "Help me choose", onClick = {})
                            }
                        }
                    }

                    Row {
                        Text("Build configuration language")
                        Spacer(Modifier.width(4.dp))
                        Icon(key = AllIconsKeys.General.ContextHelp, contentDescription = null)
                    }
                    Dropdown(
                        menuContent = {
                            selectableItem(
                                selected = buildConfigurationKts,
                                onClick = { buildConfigurationKts = true },
                            ) {
                                Text("Kotlin DSL [build.gradle.kts] (Recommended)")
                            }
                            selectableItem(
                                selected = !buildConfigurationKts,
                                onClick = { buildConfigurationKts = false },
                            ) {
                                Text("Groovy DSL [build.gradle] (Legacy)")
                            }
                        },
                        modifier = Modifier.fillMaxWidth(0.7f),
                    ) {
                        Text(
                            if (buildConfigurationKts) "Kotlin DSL [build.gradle.kts] (Recommended)"
                            else "Groovy DSL [build.gradle] (Legacy)"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FormLayout(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        val verticalSpacing = 16.dp.roundToPx()
        val labelSpacing = 16.dp.roundToPx()
        val minimumLabelWidth = 100.dp.roundToPx()

        // First measure all labels to find the widest
        val labelMeasurables = measurables.filterIndexed { idx, _ -> idx % 2 == 0 }
        val labelPlaceables = labelMeasurables.map { it.measure(Constraints()) }
        val maxLabelWidth = maxOf(labelPlaceables.maxOf { it.width }, minimumLabelWidth)

        // Calculate remaining width for inputs
        val remainingWidth = constraints.maxWidth - maxLabelWidth
        val inputConstraints = constraints.copy(maxWidth = remainingWidth, minWidth = 0)

        // Now measure inputs with updated constraints
        val inputMeasurables = measurables.filterIndexed { idx, _ -> idx % 2 == 1 }
        val inputPlaceables = inputMeasurables.map { it.measure(inputConstraints) }

        // Pair up the placeables
        val pairs = labelPlaceables.zip(inputPlaceables)

        // Calculate total height
        val height =
            pairs.sumOf { (label, input) -> maxOf(label.height, input.height) } + verticalSpacing * (pairs.size - 1)

        layout(width = constraints.maxWidth, height = height) {
            var y = 0

            pairs.forEachIndexed { idx, (label, input) ->
                var baselineDelta = 0
                if (
                    label[FirstBaseline] != AlignmentLine.Unspecified &&
                        input[FirstBaseline] != AlignmentLine.Unspecified
                ) {
                    baselineDelta = input[FirstBaseline] - label[FirstBaseline]
                }

                label.placeRelative(
                    x = 0, // Left align
                    y = y + baselineDelta,
                )
                input.placeRelative(x = maxLabelWidth + labelSpacing, y = y)

                y += maxOf(label.height, input.height)
                if (idx < pairs.lastIndex) {
                    y += verticalSpacing
                }
            }
        }
    }
}

val androidVersions =
    listOf(
        21 to "API 21 (Lollipop - Android 5.0)",
        22 to "API 22 (Lollipop - Android 5.1)",
        23 to "API 23 (Marshmallow - Android 6)",
        24 to "API 24 (Nougat - Android 7.0)",
        25 to "API 25 (Nougat - Android 7.1.1)",
        26 to "API 26 (Oreo - Android 8.0)",
        27 to "API 27 (Oreo - Android 8.1)",
        28 to "API 28 (Pie - Android 9)",
        29 to "API 29 (Q - Android 10)",
        30 to "API 30 (R - Android 11)",
        31 to "API 31 (S - Android 12)",
        32 to "API 32 (T - Android 13)",
        33 to "API 33 (U - Android 14)",
        34 to "API 34 (V - Android 15)",
    )
