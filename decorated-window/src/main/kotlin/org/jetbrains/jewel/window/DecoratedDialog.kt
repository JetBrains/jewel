package org.jetbrains.jewel.window

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposeDialog
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.window.DialogState
import androidx.compose.ui.window.DialogWindow
import androidx.compose.ui.window.DialogWindowScope
import androidx.compose.ui.window.rememberDialogState
import com.jetbrains.JBR
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.modifier.trackWindowActivation
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.window.styling.DecoratedWindowStyle
import org.jetbrains.jewel.window.utils.DesktopPlatform
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent

@Composable
public fun DecoratedDialogWindow(
    onCloseRequest: () -> Unit,
    state: DialogState = rememberDialogState(),
    visible: Boolean = true,
    title: String = "",
    icon: Painter? = null,
    resizable: Boolean = true,
    enabled: Boolean = true,
    focusable: Boolean = true,
    alwaysOnTop: Boolean = false,
    onPreviewKeyEvent: (KeyEvent) -> Boolean = { false },
    onKeyEvent: (KeyEvent) -> Boolean = { false },
    style: DecoratedWindowStyle = JewelTheme.defaultDecoratedWindowStyle,
    content: @Composable DecoratedDialogWindowScope.() -> Unit,
) {
    remember {
        if (!JBR.isAvailable()) {
            error(
                "DecoratedWindow can only be used on JetBrainsRuntime(JBR) platform, " +
                    "please check the document https://github.com/JetBrains/jewel#int-ui-standalone-theme",
            )
        }
    }

    // Using undecorated window for linux
    val undecorated = DesktopPlatform.Linux == DesktopPlatform.Current

    DialogWindow(
        onCloseRequest,
        state,
        visible,
        title,
        icon,
        undecorated,
        transparent = false,
        resizable,
        enabled,
        focusable,
        alwaysOnTop,
        onPreviewKeyEvent,
        onKeyEvent,
    ) {
        var decoratedWindowState by remember { mutableStateOf(DecoratedWindowState.of(window)) }

        DisposableEffect(window) {
            val adapter =
                object : WindowAdapter() {
                    override fun windowActivated(e: WindowEvent?) {
                        decoratedWindowState = DecoratedWindowState.of(window)
                    }

                    override fun windowDeactivated(e: WindowEvent?) {
                        decoratedWindowState = DecoratedWindowState.of(window)
                    }
                }

            window.addWindowListener(adapter)

            onDispose {
                window.removeWindowListener(adapter)
            }
        }

        val undecoratedWindowBorder =
            if (undecorated) {
                Modifier
                    .border(
                        Stroke.Alignment.Inside,
                        style.metrics.borderWidth,
                        style.colors.borderFor(decoratedWindowState).value,
                        RectangleShape,
                    ).padding(style.metrics.borderWidth)
            } else {
                Modifier
            }

        CompositionLocalProvider(
            LocalTitleBarInfo provides TitleBarInfo(title, icon),
        ) {
            Layout(
                content = {
                    val scope =
                        object : DecoratedDialogWindowScope {
                            override val state: DecoratedWindowState
                                get() = decoratedWindowState

                            override val window: ComposeDialog
                                get() = this@DialogWindow.window
                        }
                    scope.content()
                },
                modifier = undecoratedWindowBorder.trackWindowActivation(window),
                measurePolicy = DecoratedWindowMeasurePolicy,
            )
        }
    }
}

@Stable
public interface DecoratedDialogWindowScope :
    DecoratedWindowScope,
    DialogWindowScope
