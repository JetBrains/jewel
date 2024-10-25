package org.jetbrains.jewel.samples.ideplugin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ui.component.HorizontalSplitLayout
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.rememberSplitLayoutState

@Composable
internal fun SplitLayoutSandbox() {
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HorizontalSplitLayout(
            firstPaneMinWidth = 200.dp,
            secondPaneMinWidth = 250.dp,
            first = { Text("First Pane") },
            second = { Text("Second Pane") },
            state = rememberSplitLayoutState(.3f),
        )
    }
}
