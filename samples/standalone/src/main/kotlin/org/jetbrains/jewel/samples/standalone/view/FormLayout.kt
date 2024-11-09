package org.jetbrains.jewel.samples.standalone.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp

@Composable
fun FormLayout(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        // First measure all labels to find the widest
        val labelMeasurables = measurables.filterIndexed { idx, _ -> idx % 2 == 0 }
        val labelPlaceables = labelMeasurables.map { it.measure(Constraints()) }
        val maxLabelWidth = labelPlaceables.maxOf { it.width }

        // Calculate remaining width for inputs
        val remainingWidth = constraints.maxWidth - maxLabelWidth
        val inputConstraints = constraints.copy(maxWidth = remainingWidth, minWidth = 0)

        // Now measure inputs with updated constraints
        val inputMeasurables = measurables.filterIndexed { idx, _ -> idx % 2 == 1 }
        val inputPlaceables = inputMeasurables.map { it.measure(inputConstraints) }

        // Pair up the placeables
        val pairs = labelPlaceables.zip(inputPlaceables)

        val verticalSpacing = 20.dp.roundToPx()
        val horizontalPadding = 8.dp.roundToPx()
        val verticalOffset = 6.dp.roundToPx()

        // Calculate total height
        val height = pairs.sumOf { (label, input) -> maxOf(label.height, input.height) + verticalSpacing }

        layout(constraints.maxWidth, height) {
            var y = 0

            pairs.forEach { (label, input) ->
                label.placeRelative(
                    x = 0, // Left align
                    y = y + (input.height / 2 - label.height / 2),
                )
                input.placeRelative(x = maxLabelWidth + horizontalPadding, y = y)

                y += maxOf(label.height, input.height) + verticalSpacing
            }
        }
    }
}
