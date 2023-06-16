package org.jetbrains.jewel.samples.standalone.internal.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.DropdownLink
import org.jetbrains.jewel.internal.ExternalLink
import org.jetbrains.jewel.internal.GroupHeader
import org.jetbrains.jewel.internal.Link

@Composable
fun ColumnScope.Links() {
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
}
