package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.jewel.samples.standalone.viewmodel.View
import org.jetbrains.jewel.ui.component.SegmentedControlButtonData
import org.jetbrains.jewel.ui.component.SegmentedControl

@Composable
@View(title = "Segmented Controls", position = 14)
fun SegmentedControls() {
    SegmentedControlShowcase()
}

@Composable
private fun SegmentedControlShowcase() {
    var selectedButtonIndex by remember { mutableStateOf(0) }

    val buttonIds by remember { mutableStateOf((1 .. 4).toList()) }

    val buttons = remember(buttonIds, selectedButtonIndex) {
        buttonIds.mapIndexed { index, _ ->
            SegmentedControlButtonData(
                selected = index == selectedButtonIndex,
                content = { _ ->
                    Text("Hello")
                },
                onClick = { selectedButtonIndex = index }
            )
        }
    }

    SegmentedControl(
        buttons = buttons,
        enabled = true,
    )
}