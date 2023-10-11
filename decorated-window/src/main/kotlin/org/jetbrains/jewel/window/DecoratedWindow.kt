package org.jetbrains.jewel.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.awt.ComposeWindow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.offset
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.rememberWindowState
import javax.swing.JFrame

@Composable fun DecoratedWindow(
    onCloseRequest: () -> Unit,
    state: WindowState = rememberWindowState(),
    visible: Boolean = true,
    title: String = "",
    icon: Painter? = null,
    resizable: Boolean = true,
    enabled: Boolean = true,
    focusable: Boolean = true,
    alwaysOnTop: Boolean = false,
    onPreviewKeyEvent: (KeyEvent) -> Boolean = { false },
    onKeyEvent: (KeyEvent) -> Boolean = { false },
    content: @Composable DecoratedWindowScope.() -> Unit,
) {
    Window(
        onCloseRequest,
        state,
        visible,
        title,
        icon,
        false,
        false,
        resizable,
        enabled,
        focusable,
        alwaysOnTop,
        onPreviewKeyEvent,
        onKeyEvent,
    ) {
        CompositionLocalProvider(
            LocalWindow provides window,
            LocalTitleBarInfo provides TitleBarInfo(title, icon),
        ) {
            Layout({
                val scope = object : DecoratedWindowScope {
                    override val window: ComposeWindow get() = this@Window.window
                }
                scope.content()
            }, measurePolicy = DecoratedWindowMeasurePolicy)
        }
    }
}

@Stable interface DecoratedWindowScope : FrameWindowScope {

    override val window: ComposeWindow
}

private object DecoratedWindowMeasurePolicy : MeasurePolicy {

    override fun MeasureScope.measure(measurables: List<Measurable>, constraints: Constraints): MeasureResult {
        if (measurables.isEmpty()) {
            return layout(
                constraints.minWidth,
                constraints.minHeight,
            ) {}
        }

        val titleBars = measurables.filter { it.layoutId == TITLE_BAR_LAYOUT_ID }
        if (titleBars.size > 1) {
            error("Window just can have only one title bar")
        }
        val titleBar = titleBars.firstOrNull()
        val titleBarBorder = measurables.firstOrNull { it.layoutId == TITLE_BAR_BORDER_LAYOUT_ID }

        val contentConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        val titleBarPlaceable = titleBar?.measure(contentConstraints)
        val titleBarHeight = titleBarPlaceable?.height ?: 0

        val titleBarBorderPlaceable = titleBarBorder?.measure(contentConstraints)
        val titleBarBorderHeight = titleBarBorderPlaceable?.height ?: 0

        val measuredPlaceable = mutableListOf<Placeable>()

        for (it in measurables) {
            if (it.layoutId.toString().startsWith(TITLE_BAR_COMPONENT_LAYOUT_ID_PREFIX)) continue
            val placeable = it.measure(contentConstraints.offset(vertical = -titleBarHeight - titleBarBorderHeight))
            measuredPlaceable += placeable
        }

        return layout(constraints.maxWidth, constraints.maxHeight) {
            titleBarPlaceable?.placeRelative(0, 0)
            titleBarBorderPlaceable?.placeRelative(0, titleBarHeight)

            measuredPlaceable.forEach {
                it.placeRelative(0, titleBarHeight + titleBarBorderHeight)
            }
        }
    }
}

internal data class TitleBarInfo(
    val title: String,
    val icon: Painter?,
)

internal val LocalTitleBarInfo = compositionLocalOf<TitleBarInfo> {
    error("CompositionLocal LocalTitleBarInfo not provided, TitleBar must be used in DecoratedWindow")
}

val LocalWindow = compositionLocalOf<JFrame> {
    error("CompositionLocal LocalWindow not provided")
}
