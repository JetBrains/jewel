package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.OverflowBox
import org.jetbrains.jewel.samples.standalone.viewmodel.View
import org.jetbrains.jewel.ui.component.Text

@Composable
@View(title = "Debug", position = 13, icon = "icons/debug.svg")
fun Debug() {
    Row(Modifier.fillMaxWidth().background(Color.Red)) {
        Box(Modifier.size(24.dp, 24.dp).background(Color.Green)) {
            OverflowBox(Modifier.fillMaxSize().background(Color.Blue.copy(alpha = 0.5f))) {
                Text("Foo bar baz qux quux corge grault garply waldo fred plugh xyzzy thud", color = Color.White)
            }
        }
    }
}
