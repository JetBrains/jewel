import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.standalone.viewmodel.ComponentsViewModel
import org.jetbrains.jewel.ui.component.HorizontalSplitLayout
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField

@Composable
fun SplitLayouts(viewModel: ComponentsViewModel = remember { ComponentsViewModel }) {
    Box(
        Modifier.fillMaxSize().border(1.dp, Color.Red),
    ) {
        HorizontalSplitLayout(
            state = viewModel.outerSplitState,
            first = {
                Box(
                    modifier =
                        Modifier
                            .fillMaxSize()
                            .background(JewelTheme.globalColors.panelBackground)
                            .padding(16.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    val state by remember { mutableStateOf(TextFieldState()) }
                    TextField(state, placeholder = { Text("Placeholder") })
                }
            },
            second = {
                HorizontalSplitLayout(
                    state = viewModel.innerSplitState,
                    first = {
                        Box(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(JewelTheme.globalColors.panelBackground)
                                    .padding(16.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            val state by remember { mutableStateOf(TextFieldState()) }
                            TextField(state, placeholder = { Text("Nested - Left Panel Content") })
                        }
                    },
                    second = {
                        Box(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(JewelTheme.globalColors.panelBackground)
                                    .padding(16.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            val state by remember { mutableStateOf(TextFieldState()) }
                            TextField(state, placeholder = { Text("Nested - Right Panel Content") })
                        }
                    },
                    modifier = Modifier.fillMaxSize(),
                    firstPaneMinWidth = 200.dp,
                    secondPaneMinWidth = 100.dp,
                )
            },
            modifier = Modifier.fillMaxSize(),
            firstPaneMinWidth = 100.dp,
            secondPaneMinWidth = 302.dp,
        )
    }
}
