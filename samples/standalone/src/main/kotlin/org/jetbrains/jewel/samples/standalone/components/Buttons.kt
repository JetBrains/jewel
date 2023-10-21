package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.GroupHeader
import org.jetbrains.jewel.core.component.DefaultButton
import org.jetbrains.jewel.core.component.Icon
import org.jetbrains.jewel.core.component.IconButton
import org.jetbrains.jewel.core.component.OutlinedButton
import org.jetbrains.jewel.core.component.Text
import org.jetbrains.jewel.samples.standalone.StandaloneSampleIcons

@Composable
fun Buttons() {
    GroupHeader("Buttons")
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedButton(onClick = { }) {
            Text("Outlined")
        }

        OutlinedButton(onClick = {}, enabled = false) {
            Text("Outlined Disabled")
        }

        DefaultButton(onClick = {}) {
            Text("Default")
        }

        DefaultButton(onClick = {}, enabled = false) {
            Text("Default disabled")
        }

        IconButton(onClick = {}) {
            Icon(
                resource = "icons/close.svg",
                "icon",
                StandaloneSampleIcons::class.java,
            )
        }
    }
}
