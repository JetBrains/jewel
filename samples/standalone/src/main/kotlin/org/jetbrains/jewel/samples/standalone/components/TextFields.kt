package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.GroupHeader
import org.jetbrains.jewel.LabelledTextField
import org.jetbrains.jewel.Outline
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.TextField

@Composable
fun TextFields() {
    GroupHeader("TextFields")
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var text1 by remember { mutableStateOf("TextField") }
        TextField(text1, { text1 = it })

        var text2 by remember { mutableStateOf("Error hinted") }
        TextField(text2, { text2 = it }, outline = Outline.Error)

        var text3 by remember { mutableStateOf("Warning hinted") }
        TextField(text3, { text3 = it }, outline = Outline.Warning)

        var text4 by remember { mutableStateOf("Disabled") }
        TextField(text4, { text4 = it }, enabled = false)

        var text5 by remember { mutableStateOf("") }
        TextField(text5, { text5 = it }, placeholder = {
            Text("Placeholder")
        })
    }
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var text1 by remember { mutableStateOf("Labelled TextField") }
        LabelledTextField(text1, { text1 = it }, {
            Text("Label:")
        })

        var text2 by remember { mutableStateOf("Labelled TextField with hint") }
        LabelledTextField(text2, { text2 = it }, {
            Text("Label:")
        }, hint = { Text("Attached hint text") })
    }
}
