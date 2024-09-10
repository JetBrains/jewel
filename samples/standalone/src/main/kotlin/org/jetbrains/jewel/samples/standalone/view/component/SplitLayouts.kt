import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.standalone.styling.light
import org.jetbrains.jewel.ui.component.HorizontalSplitLayout
import org.jetbrains.jewel.ui.component.SplitLayoutState
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.styling.DividerStyle

@Composable
fun SplitLayouts(outerSplitState: SplitLayoutState) {
    Column(Modifier.fillMaxSize()) {
        HorizontalSplitLayout(
            state = outerSplitState,
            first = {
                Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
                    Text("Left Pane")
                }
            },
            second = {
                Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
                    Text("Right Pane")
                }
            },
            modifier = Modifier.fillMaxWidth().weight(1f).border(1.dp, color = JewelTheme.globalColors.borders.normal),
            firstPaneMinWidth = 300.dp,
            secondPaneMinWidth = 200.dp,
            dividerStyle = DividerStyle.Companion.light(color = Red),
        )
    }
}
