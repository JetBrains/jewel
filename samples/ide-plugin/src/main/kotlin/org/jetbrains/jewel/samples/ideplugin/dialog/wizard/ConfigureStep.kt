package org.jetbrains.jewel.samples.ideplugin.dialog.wizard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
import org.jetbrains.jewel.ui.component.CheckboxRow
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.OutlinedButton
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.icons.AllIconsKeys

class ConfigureStepPage(override val templateData: Template) : WizardPage, TemplateWizardPage {
    override val canGoBackwards: StateFlow<Boolean> = MutableStateFlow(true)
    override val canGoForward: StateFlow<Boolean> = MutableStateFlow(true)

    @Composable
    override fun PageContent() {
        val projectName = rememberTextFieldState("")
        val packageName = rememberTextFieldState("")
        val saveLocation = rememberTextFieldState("")
        var minimumSdk by remember { mutableIntStateOf(34) }
        var buildConfigurationKts by remember { mutableStateOf(true) }
        var optionChecked by remember { mutableStateOf(false) }

        Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(vertical = 20.dp, horizontal = 64.dp)) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(templateData.name, style = Typography.h2TextStyle())
                templateData.description?.let {
                    Spacer(Modifier.height(4.dp))
                    Text(templateData.description)
                }
                Spacer(Modifier.height(12.dp))
                FormLayout(modifier = Modifier.fillMaxWidth()) {
                    Text("Name")
                    TextField(state = projectName)

                    Text("Package name")
                    Column {
                        TextField(state = packageName, modifier = Modifier.fillMaxWidth())
                        Spacer(Modifier.height(8.dp))
                        CheckboxRow(
                            text = "This is an option to click",
                            checked = optionChecked,
                            onCheckedChange = { optionChecked = it },
                            modifier = Modifier.offset(x = -3.dp),
                        )
                    }

                    Text("Icon")
                    Column {
                        OutlinedButton(onClick = {}) { Text("Is label aligned?") }
                        Icon(key = AllIconsKeys.Idea_logo_welcome, contentDescription = null)
                    }

                    Text("Save location")
                    TextField(state = saveLocation)
                }
                Spacer(Modifier.height(20.dp))
                Text("Help text")
            }
        }
    }
}

@Composable
fun FormLayout(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        val verticalSpacing = 20.dp.roundToPx()
        val labelSpacing = 8.dp.roundToPx()
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
