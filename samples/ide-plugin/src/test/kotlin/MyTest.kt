import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.ui.component.CircularProgressIndicatorBig
import org.jetbrains.jewel.ui.component.Text
import org.junit.Rule
import org.junit.Test

class MyTest {
    @get:Rule val rule = createComposeRule()

    @Test
    fun `should not hang`() {
        rule.setContent {
            IntUiTheme {
                LoadingIndicator(Modifier.fillMaxSize())
            }
        }

        rule.onNodeWithTag("banana")
            .assertTextEquals("Reproducing")
    }
}

@Composable
private fun LoadingIndicator(modifier: Modifier = Modifier) {
    Box(modifier, contentAlignment = Alignment.Center) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CircularProgressIndicatorBig()

            var target by remember { mutableFloatStateOf(0f) }
            val alpha by animateFloatAsState(target, tween(100))
            LaunchedEffect(Unit) {
                launch {
                    while (true) {
                        delay(100)
                        target = if (target == 1f) 0f else 1f
                    }
                }
            }
            Text("Reproducing", Modifier.testTag("banana").alpha(alpha))
        }
    }
}
