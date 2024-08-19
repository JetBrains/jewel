package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility.AlwaysVisible
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility.WhenScrolling
import org.jetbrains.jewel.ui.theme.scrollbarStyle
import kotlin.time.Duration.Companion.milliseconds

private const val ID_CONTENT = "VerticallyScrollableContainer_content"
private const val ID_VERTICAL_SCROLLBAR = "VerticallyScrollableContainer_verticalScrollbar"
private const val ID_HORIZONTAL_SCROLLBAR = "VerticallyScrollableContainer_horizontalScrollbar"

@Composable
public fun VerticallyScrollableContainer(
    modifier: Modifier = Modifier,
    scrollbarModifier: Modifier = Modifier,
    scrollState: ScrollState = rememberScrollState(),
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    var keepVisible by remember { mutableStateOf(false) }
    ScrollableContainerImpl(
        verticalScrollbar = {
            VerticalScrollbar(
                scrollState,
                scrollbarModifier,
                style = style,
                keepVisible = keepVisible,
            )
        },
        horizontalScrollbar = null,
        modifier = modifier.onHover { keepVisible = it },
        scrollbarStyle = style,
    ) {
        Box(modifier.layoutId(ID_CONTENT).verticalScroll(scrollState)) { content() }
    }
}

@Composable
public fun VerticallyScrollableContainer(
    scrollState: LazyListState,
    modifier: Modifier = Modifier,
    scrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    var keepVisible by remember { mutableStateOf(false) }
    var delayJob by remember { mutableStateOf<Job?>(null) }
    val scope = rememberCoroutineScope()

    ScrollableContainerImpl(
        verticalScrollbar = {
            VerticalScrollbar(
                scrollState,
                scrollbarModifier,
                style = style,
                keepVisible = keepVisible,
            )
        },
        horizontalScrollbar = null,
        modifier = modifier.pointerInput(scrollState) {
            awaitEachGesture {
                val event = awaitPointerEvent()
                if (event.type == PointerEventType.Move) {
                    delayJob?.cancel()
                    keepVisible = true
                    delayJob = scope.launch {
                        delay(50.milliseconds)
                        keepVisible = false
                    }
                }
            }
        },
        scrollbarStyle = style,
    ) {
        Box(Modifier.layoutId(ID_CONTENT)) { content() }
    }
}

@Composable
public fun VerticallyScrollableContainer(
    scrollState: LazyGridState,
    modifier: Modifier = Modifier,
    scrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = { VerticalScrollbar(scrollState, scrollbarModifier, style = style) },
        horizontalScrollbar = null,
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(Modifier.layoutId(ID_CONTENT)) { content() }
    }
}

@Composable
public fun HorizontallyScrollableContainer(
    modifier: Modifier = Modifier,
    scrollbarModifier: Modifier = Modifier,
    scrollState: ScrollState = rememberScrollState(),
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = null,
        horizontalScrollbar = { HorizontalScrollbar(scrollState, scrollbarModifier, style = style) },
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(Modifier.layoutId(ID_CONTENT).verticalScroll(scrollState)) { content() }
    }
}

@Composable
public fun HorizontallyScrollableContainer(
    scrollState: LazyListState,
    modifier: Modifier = Modifier,
    scrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = null,
        horizontalScrollbar = { HorizontalScrollbar(scrollState, scrollbarModifier, style = style) },
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(Modifier.layoutId(ID_CONTENT)) { content() }
    }
}

@Composable
public fun HorizontallyScrollableContainer(
    scrollState: LazyGridState,
    modifier: Modifier = Modifier,
    scrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = null,
        horizontalScrollbar = { HorizontalScrollbar(scrollState, scrollbarModifier, style = style) },
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(Modifier.layoutId(ID_CONTENT)) { content() }
    }
}

@Composable
public fun ScrollableContainer(
    modifier: Modifier = Modifier,
    verticalScrollState: ScrollState = rememberScrollState(),
    horizontalScrollState: ScrollState = rememberScrollState(),
    verticalScrollbarModifier: Modifier = Modifier,
    horizontalScrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = { VerticalScrollbar(verticalScrollState, verticalScrollbarModifier, style = style) },
        horizontalScrollbar = {
            HorizontalScrollbar(
                horizontalScrollState,
                horizontalScrollbarModifier,
                style = style
            )
        },
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(
            Modifier.layoutId(ID_CONTENT)
                .verticalScroll(verticalScrollState)
                .horizontalScroll(horizontalScrollState)
        ) { content() }
    }
}

@Composable
public fun ScrollableContainer(
    verticalScrollState: LazyListState,
    horizontalScrollState: LazyListState,
    modifier: Modifier = Modifier,
    verticalScrollbarModifier: Modifier = Modifier,
    horizontalScrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = { VerticalScrollbar(verticalScrollState, verticalScrollbarModifier, style = style) },
        horizontalScrollbar = {
            HorizontalScrollbar(
                horizontalScrollState,
                horizontalScrollbarModifier,
                style = style
            )
        },
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(Modifier.layoutId(ID_CONTENT)) { content() }
    }
}

@Composable
public fun ScrollableContainer(
    verticalScrollState: LazyGridState,
    horizontalScrollState: LazyGridState,
    modifier: Modifier = Modifier,
    verticalScrollbarModifier: Modifier = Modifier,
    horizontalScrollbarModifier: Modifier = Modifier,
    style: ScrollbarStyle = JewelTheme.scrollbarStyle,
    content: @Composable () -> Unit,
) {
    ScrollableContainerImpl(
        verticalScrollbar = { VerticalScrollbar(verticalScrollState, verticalScrollbarModifier, style = style) },
        horizontalScrollbar = {
            HorizontalScrollbar(
                horizontalScrollState,
                horizontalScrollbarModifier,
                style = style
            )
        },
        modifier = modifier,
        scrollbarStyle = style
    ) {
        Box(Modifier.layoutId(ID_CONTENT)) { content() }
    }
}

@Composable
private fun ScrollableContainerImpl(
    verticalScrollbar: (@Composable () -> Unit)?,
    horizontalScrollbar: (@Composable () -> Unit)?,
    modifier: Modifier,
    scrollbarStyle: ScrollbarStyle,
    content: @Composable () -> Unit,
) {
    Layout(
        content = {
            content()

            if (verticalScrollbar != null) {
                Box(Modifier.layoutId(ID_VERTICAL_SCROLLBAR)) { verticalScrollbar() }
            }

            if (horizontalScrollbar != null) {
                Box(Modifier.layoutId(ID_HORIZONTAL_SCROLLBAR)) { horizontalScrollbar() }
            }
        },
        modifier,
    ) { measurables, incomingConstraints ->
        val verticalScrollbarMeasurable = measurables.find { it.layoutId == ID_VERTICAL_SCROLLBAR }
        val horizontalScrollbarMeasurable = measurables.find { it.layoutId == ID_HORIZONTAL_SCROLLBAR }

        // Leaving the bottom-end corner empty when both scrollbars visible at the same time
        val sizeOffsetWhenBothVisible =
            if (verticalScrollbarMeasurable != null && horizontalScrollbarMeasurable != null) {
                scrollbarStyle.scrollbarVisibility.trackThicknessExpanded.roundToPx()
            } else 0

        val verticalScrollbarPlaceable = if (verticalScrollbarMeasurable != null) {
            val verticalScrollbarConstraints =
                Constraints.fixedHeight(incomingConstraints.maxHeight - sizeOffsetWhenBothVisible)
            verticalScrollbarMeasurable.measure(verticalScrollbarConstraints)
        } else null

        val horizontalScrollbarPlaceable = if (horizontalScrollbarMeasurable != null) {
            val horizontalScrollbarConstraints =
                Constraints.fixedWidth(incomingConstraints.maxWidth - sizeOffsetWhenBothVisible)
            horizontalScrollbarMeasurable.measure(horizontalScrollbarConstraints)
        } else null

        val contentConstraints = Constraints.fixed(
            width = when (scrollbarStyle.scrollbarVisibility) {
                is AlwaysVisible -> incomingConstraints.maxWidth - (verticalScrollbarPlaceable?.width ?: 0)
                is WhenScrolling -> incomingConstraints.maxWidth
            },
            height = when (scrollbarStyle.scrollbarVisibility) {
                is AlwaysVisible -> incomingConstraints.maxHeight - (horizontalScrollbarPlaceable?.height ?: 0)
                is WhenScrolling -> incomingConstraints.maxHeight
            },
        )
        val contentMeasurable = measurables.find { it.layoutId == ID_CONTENT }
            ?: error("Content not provided")
        val contentPlaceable = contentMeasurable.measure(contentConstraints)

        layout(incomingConstraints.maxWidth, incomingConstraints.maxHeight) {
            contentPlaceable.placeRelative(x = 0, y = 0, zIndex = 0f)
            verticalScrollbarPlaceable?.placeRelative(
                x = incomingConstraints.maxWidth - verticalScrollbarPlaceable.width,
                y = 0,
                zIndex = 1f
            )
            horizontalScrollbarPlaceable?.placeRelative(
                x = 0,
                y = incomingConstraints.maxHeight - horizontalScrollbarPlaceable.height,
                zIndex = 1f
            )
        }
    }
}

/**
 * A content padding to apply when you want to ensure the content is not
 * overlapped by scrollbars. This value can be used for both vertical and
 * horizontal scrollbars.
 *
 * When the [style] is [AlwaysVisible], this value is zero, since the
 * various `ScrollableContainer`s will prevent overlapping anyway. If it
 * is [WhenScrolling], this value will be the maximum thickness of the
 * scrollbar.
 */
@Composable
public fun scrollbarContentSafePadding(style: ScrollbarStyle = JewelTheme.scrollbarStyle): Dp =
    when (style.scrollbarVisibility) {
        is AlwaysVisible -> 0.dp
        is WhenScrolling -> style.scrollbarVisibility.trackThicknessExpanded
    }
