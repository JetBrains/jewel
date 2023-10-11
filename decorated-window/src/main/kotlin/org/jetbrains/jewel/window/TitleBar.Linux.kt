package org.jetbrains.jewel.window

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerButton
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.unit.dp
import com.jetbrains.JBR
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.OutlinedButton
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.window.styling.TitleBarStyle
import java.awt.Frame
import java.awt.event.MouseEvent
import java.awt.event.WindowEvent

@Composable internal fun DecoratedWindowScope.TitleBarOnLinux(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    content: @Composable TitleBarScope.() -> Unit,
) {
    TitleBarImpl(
        modifier.onPointerEvent(PointerEventType.Press, PointerEventPass.Main) {
            if (this.currentEvent.button == PointerButton.Primary) {
                if (this.currentEvent.changes.any { !it.isConsumed }) {
                    JBR.getWindowMove().startMovingTogetherWithMouse(window, MouseEvent.BUTTON1)
                }
            }
        },
        gradientStartColor,
        style,
        { size, state ->
            PaddingValues(0.dp)
        },
    ) {
        OutlinedButton({
            window.dispatchEvent(WindowEvent(window, WindowEvent.WINDOW_CLOSING))
        }, Modifier.align(Alignment.End)) {
            Text("X")
        }
        OutlinedButton({
            if (window.extendedState == Frame.NORMAL) {
                window.extendedState = Frame.MAXIMIZED_BOTH
            } else {
                window.extendedState = Frame.NORMAL
            }
        }, Modifier.align(Alignment.End)) {
            Text("▢")
        }
        OutlinedButton({
            window.state = Frame.ICONIFIED
        }, Modifier.align(Alignment.End)) {
            Text("—")
        }
        content()
    }
}
