package org.jetbrains.jewel.window

import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerButton
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.unit.dp
import com.jetbrains.JBR
import org.jetbrains.jewel.Icon
import org.jetbrains.jewel.IconButton
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.LocalResourceLoader
import org.jetbrains.jewel.styling.IconButtonStyle
import org.jetbrains.jewel.styling.PainterProvider
import org.jetbrains.jewel.window.styling.TitleBarStyle
import java.awt.Frame
import java.awt.event.MouseEvent
import java.awt.event.WindowEvent

@Composable internal fun DecoratedWindowScope.TitleBarOnLinux(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    content: @Composable TitleBarScope.(TitleBarState) -> Unit,
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
    ) { state ->
        CloseButton({
            window.dispatchEvent(WindowEvent(window, WindowEvent.WINDOW_CLOSING))
        }, state, style)

        if (state.isMaximized) {
            ControlButton({
                window.extendedState = Frame.NORMAL
            }, state, style.icons.restoreButton, "Restore")
        } else {
            ControlButton({
                window.extendedState = Frame.MAXIMIZED_BOTH
            }, state, style.icons.maximizeButton, "Maximize")
        }
        ControlButton({
            window.extendedState = Frame.ICONIFIED
        }, state, style.icons.minimizeButton, "Minimize")
        content(state)
    }
}

@Composable private fun TitleBarScope.CloseButton(
    onClick: () -> Unit,
    state: TitleBarState,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
) {
    ControlButton(onClick, state, style.icons.closeButton, "Close", style, style.paneCloseButtonStyle())
}

@Composable private fun TitleBarScope.ControlButton(
    onClick: () -> Unit,
    state: TitleBarState,
    painterProvider: PainterProvider<TitleBarState>,
    description: String,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    iconButtonStyle: IconButtonStyle = style.paneButtonStyle(),
) {
    IconButton(
        onClick,
        Modifier.focusProperties { canFocus = false }
            .align(Alignment.End)
            .focusable(false)
            .size(style.metrics.titlePaneButtonSize),
        style = iconButtonStyle,
    ) {
        Icon(painterProvider.getPainter(LocalResourceLoader.current, state).value, description)
    }
}
