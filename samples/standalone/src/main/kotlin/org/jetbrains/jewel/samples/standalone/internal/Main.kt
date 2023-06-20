package org.jetbrains.jewel.samples.standalone.internal

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.foundation.tree.buildTree
import org.jetbrains.jewel.internal.AnimatedDefiniteLinearProgressBar
import org.jetbrains.jewel.internal.BaseChip
import org.jetbrains.jewel.internal.CheckboxRow
import org.jetbrains.jewel.internal.GroupHeader
import org.jetbrains.jewel.internal.IndeterminateLinearProgressBar
import org.jetbrains.jewel.internal.IntelliJTheme
import org.jetbrains.jewel.internal.IntelliJTree
import org.jetbrains.jewel.internal.LinearProgressBar
import org.jetbrains.jewel.internal.Text
import org.jetbrains.jewel.internal.VerticalScrollbar
import org.jetbrains.jewel.samples.standalone.internal.components.Borders
import org.jetbrains.jewel.samples.standalone.internal.components.Buttons
import org.jetbrains.jewel.samples.standalone.internal.components.Checkboxes
import org.jetbrains.jewel.samples.standalone.internal.components.Dropdowns
import org.jetbrains.jewel.samples.standalone.internal.components.Links
import org.jetbrains.jewel.samples.standalone.internal.components.RadioButtons
import org.jetbrains.jewel.samples.standalone.internal.components.TextFields
import org.jetbrains.jewel.themes.intui.standalone.internal.dark.DarkTheme
import org.jetbrains.jewel.themes.intui.standalone.internal.light.LightTheme

@Composable
fun JetBrainsTheme(isDark: Boolean, content: @Composable () -> Unit) =
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

    val verticalScrollState = rememberScrollState(0)
    JetBrainsTheme(isDark = isDark) {
        Box(
            Modifier.fillMaxSize().background(IntelliJTheme.colors.background).verticalScroll(verticalScrollState),
            contentAlignment = Alignment.Center
        ) {
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
                Borders()
                Buttons()
                Dropdowns()
                Checkboxes()
                RadioButtons()
                Links()
                TextFields()
                GroupHeader("ProgressBars")
                ProgressBarSample()

                // take this at the end, because it's a bit taller
                Row {
                    Column(Modifier.fillMaxWidth().weight(1f)) {
                        GroupHeader("Chips")
                        ChipsRow()
                    }
                    Column(Modifier.fillMaxWidth().weight(1f)) {
                        GroupHeader("Tree")
                        TreeSample()
                    }
                }
            }
        }
        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(verticalScrollState)
        )
    }
}

@Composable
fun ChipsRow(modifier: Modifier = Modifier) {
    Row(modifier) {
        BaseChip(
            enabled = true,
            onChipClick = {}
        ) {
            Text("Enabled")
        }
        BaseChip(
            enabled = false,
            onChipClick = {}
        ) {
            Text("Disabled")
        }
    }
}

@Composable
fun TreeSample(modifier: Modifier = Modifier) {
    val tree = remember {
        buildTree {
            addNode("root 1", false) {
                addLeaf("leaf 1")
                addLeaf("leaf 2")
            }
            addNode("root 2", false) {
                addLeaf("leaf 1")
                addNode("node 1", false) {
                    addLeaf("leaf 1")
                    addLeaf("leaf 2")
                }
            }
            addNode("root 3", false) {
                addLeaf("leaf 1")
                addLeaf("leaf 2")
            }
        }
    }
    IntelliJTree(
        Modifier.size(200.dp, 200.dp).then(modifier),
        onElementClick = {},
        onElementDoubleClick = {},
        tree = tree
    ) { element ->
        Text(element.data, modifier.padding(2.dp))
    }
}

@Composable
fun ProgressBarSample() {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        val transition = rememberInfiniteTransition()
        val currentOffset by transition.animateFloat(
            0f, 1f,
            infiniteRepeatable(
                animation = keyframes {
                    durationMillis = 4000
                    0f at 1000
                    1f at 3000
                },
            )
        )
        LinearProgressBar(Modifier.width(500.dp), currentOffset)
        AnimatedDefiniteLinearProgressBar(Modifier.width(500.dp), currentOffset)
        IndeterminateLinearProgressBar(Modifier.width(500.dp))

    }
}
