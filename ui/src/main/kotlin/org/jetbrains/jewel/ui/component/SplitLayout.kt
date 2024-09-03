@file:Suppress("DuplicatedCode") // It's similar, but not exactly the same

package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Orientation.Horizontal
import org.jetbrains.jewel.ui.Orientation.Vertical
import org.jetbrains.jewel.ui.component.styling.DividerStyle
import org.jetbrains.jewel.ui.theme.dividerStyle
import java.awt.Cursor
import kotlin.math.roundToInt

/**
 * A customizable horizontal split layout Composable function that allows you to divide the available space between two
 * components using a draggable divider. The divider can be dragged to resize the panes, but cannot be focused.
 *
 * @param first The Composable function representing the first component, that will be placed on one side of the
 *   divider, typically on the left or above.
 * @param second The Composable function representing the second component, that will be placed on the other side of the
 *   divider, typically on the right or below.
 * @param modifier The modifier to be applied to the layout.
 * @param draggableWidth The width of the draggable area around the divider. This is a invisible, wider area around the
 *   divider that can be dragged by the user to resize the panes.
 * @param firstPaneMinWidth The minimum size of the first component.
 * @param secondPaneMinWidth The minimum size of the second component.
 * @param dividerStyle The divider style to be applied to the layout.
 */
@Composable
public fun HorizontalSplitLayout(
    first: @Composable () -> Unit,
    second: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dividerStyle: DividerStyle = JewelTheme.dividerStyle,
    draggableWidth: Dp = 8.dp,
    firstPaneMinWidth: Dp = Dp.Unspecified,
    secondPaneMinWidth: Dp = Dp.Unspecified,
    state: SplitLayoutState = rememberSplitLayoutState(),
) {
    SplitLayoutImpl(
        first = first,
        second = second,
        modifier = modifier,
        dividerStyle = dividerStyle,
        draggableWidth = draggableWidth,
        minFirstPaneSize = firstPaneMinWidth,
        minSecondPaneSize = secondPaneMinWidth,
        strategy = horizontalTwoPaneStrategy(),
        state = state,
    )
}

/**
 * A customizable vertical split layout Composable function that allows you to divide the available space between two
 * components using a draggable divider. The divider can be dragged to resize the panes, but cannot be focused.
 *
 * @param first The Composable function representing the first component, that will be placed on one side of the
 *   divider, typically on the left or above.
 * @param second The Composable function representing the second component, that will be placed on the other side of the
 *   divider, typically on the right or below.
 * @param modifier The modifier to be applied to the layout.
 * @param draggableWidth The width of the draggable area around the divider. This is a invisible, wider area around the
 *   divider that can be dragged by the user to resize the panes.
 * @param firstPaneMinWidth The minimum size of the first component.
 * @param secondPaneMinWidth The minimum size of the second component.
 * @param dividerStyle The divider style to be applied to the layout.
 */
@Composable
public fun VerticalSplitLayout(
    first: @Composable () -> Unit,
    second: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dividerStyle: DividerStyle = JewelTheme.dividerStyle,
    draggableWidth: Dp = 8.dp,
    firstPaneMinWidth: Dp = Dp.Unspecified,
    secondPaneMinWidth: Dp = Dp.Unspecified,
    state: SplitLayoutState = rememberSplitLayoutState(),
) {
    SplitLayoutImpl(
        first = first,
        second = second,
        modifier = modifier,
        dividerStyle = dividerStyle,
        draggableWidth = draggableWidth,
        minFirstPaneSize = firstPaneMinWidth,
        minSecondPaneSize = secondPaneMinWidth,
        strategy = verticalTwoPaneStrategy(),
        state = state,
    )
}

public class SplitLayoutState(initialSplitFraction: Float) {
    public var dividerPosition: Float by mutableStateOf(initialSplitFraction.coerceIn(0f, 1f))
    public var layoutCoordinates: LayoutCoordinates? by mutableStateOf(null)
}

@Composable
public fun rememberSplitLayoutState(initialSplitFraction: Float = 0.5f): SplitLayoutState = remember {
    SplitLayoutState(initialSplitFraction)
}

@Composable
private fun SplitLayoutImpl(
    first: @Composable () -> Unit,
    second: @Composable () -> Unit,
    strategy: SplitLayoutStrategy,
    modifier: Modifier,
    draggableWidth: Dp,
    minFirstPaneSize: Dp,
    minSecondPaneSize: Dp,
    dividerStyle: DividerStyle,
    state: SplitLayoutState,
) {
    val density = LocalDensity.current

    Layout(
        modifier = modifier.onGloballyPositioned { coordinates -> state.layoutCoordinates = coordinates },
        content = {
            Box(Modifier.layoutId("first")) { first() }
            Box(Modifier.layoutId("second")) { second() }

            val dividerInteractionSource = remember { MutableInteractionSource() }

            val dividerOrientation =
                when {
                    strategy.isHorizontal() -> Vertical
                    else -> Horizontal
                }
            val fillMaxDirection =
                when {
                    strategy.isHorizontal() -> Modifier.fillMaxHeight()
                    else -> Modifier.fillMaxWidth()
                }
            val orientation =
                when {
                    strategy.isHorizontal() -> Orientation.Horizontal
                    else -> Orientation.Vertical
                }
            val cursor =
                when {
                    strategy.isHorizontal() -> Cursor(Cursor.E_RESIZE_CURSOR)
                    else -> Cursor(Cursor.N_RESIZE_CURSOR)
                }

            Divider(
                orientation = dividerOrientation,
                modifier = Modifier.then(fillMaxDirection).layoutId("divider").focusable(false),
                color = dividerStyle.color,
                thickness = dividerStyle.metrics.thickness,
            )

            Box(
                Modifier.let { modifier ->
                        if (strategy.isHorizontal()) {
                            modifier.fillMaxHeight().width(draggableWidth)
                        } else {
                            modifier.fillMaxWidth().height(draggableWidth)
                        }
                    }
                    .draggable(
                        orientation = orientation,
                        state =
                            rememberDraggableState { delta ->
                                val layoutSize =
                                    when {
                                        strategy.isHorizontal() -> state.layoutCoordinates?.size?.width
                                        else -> state.layoutCoordinates?.size?.height
                                    }
                                layoutSize?.let { size ->
                                    state.dividerPosition = (state.dividerPosition + delta / size).coerceIn(0f, 1f)
                                }
                            },
                        interactionSource = dividerInteractionSource,
                    )
                    .pointerHoverIcon(PointerIcon(cursor))
                    .layoutId("divider-handle")
                    .focusable(false)
            )
        },
    ) { measurables, constraints ->
        val firstMeasurable = measurables.find { it.layoutId == "first" } ?: error("No first component found.")
        val secondMeasurable = measurables.find { it.layoutId == "second" } ?: error("No second component found.")
        val dividerMeasurable = measurables.find { it.layoutId == "divider" } ?: error("No divider component found.")
        val dividerHandleMeasurable =
            measurables.find { it.layoutId == "divider-handle" } ?: error("No divider-handle component found.")

        // The aesthetics of this block is meh but we can't use !! operator
        state.layoutCoordinates?.let {
            val splitResult =
                strategy.calculateSplitResult(density = density, layoutDirection = layoutDirection, state = state)

            val gapOrientation = splitResult.gapOrientation
            val gapBounds = splitResult.gapBounds

            val dividerWidth = with(density) { dividerStyle.metrics.thickness.roundToPx() }
            val handleWidth = with(density) { draggableWidth.roundToPx() }
            val minFirstPaneSizePx = with(density) { minFirstPaneSize.roundToPx() }
            val minSecondPaneSizePx = with(density) { minSecondPaneSize.roundToPx() }

            // The visual divider itself. It's a thin line that separates the two panes
            val dividerPlaceable =
                dividerMeasurable.measure(
                    when (gapOrientation) {
                        Orientation.Vertical -> {
                            constraints.copy(
                                minWidth = dividerWidth,
                                maxWidth = dividerWidth,
                                minHeight = constraints.minHeight,
                                maxHeight = constraints.maxHeight,
                            )
                        }

                        Orientation.Horizontal -> {
                            constraints.copy(
                                minWidth = constraints.minWidth,
                                maxWidth = constraints.maxWidth,
                                minHeight = dividerWidth,
                                maxHeight = dividerWidth,
                            )
                        }
                    }
                )

            // This is an invisible, wider area around the divider that can be dragged by the user
            // to resize the panes
            val dividerHandlePlaceable =
                dividerHandleMeasurable.measure(
                    when (gapOrientation) {
                        Orientation.Vertical -> {
                            constraints.copy(
                                minWidth = handleWidth,
                                maxWidth = handleWidth,
                                minHeight = constraints.minHeight,
                                maxHeight = constraints.maxHeight,
                            )
                        }

                        Orientation.Horizontal -> {
                            constraints.copy(
                                minWidth = constraints.minWidth,
                                maxWidth = constraints.maxWidth,
                                minHeight = handleWidth,
                                maxHeight = handleWidth,
                            )
                        }
                    }
                )

            val availableSpace =
                when (gapOrientation) {
                    Orientation.Vertical -> constraints.maxWidth - dividerWidth
                    else -> constraints.maxHeight - dividerWidth
                }

            val (adjustedFirstSize, adjustedSecondSize) =
                calculateAdjustedSizes(availableSpace, minFirstPaneSizePx, minSecondPaneSizePx)

            val firstGap =
                when (gapOrientation) {
                    Orientation.Vertical -> gapBounds.left
                    Orientation.Horizontal -> gapBounds.top
                }

            val firstSize: Int = firstGap.roundToInt().coerceIn(adjustedFirstSize, availableSpace - adjustedSecondSize)

            val secondSize = availableSpace - firstSize

            val firstConstraints =
                when (gapOrientation) {
                    Orientation.Vertical -> constraints.copy(minWidth = adjustedFirstSize, maxWidth = firstSize)
                    Orientation.Horizontal -> constraints.copy(minHeight = adjustedFirstSize, maxHeight = firstSize)
                }

            val secondConstraints =
                when (gapOrientation) {
                    Orientation.Vertical -> constraints.copy(minWidth = adjustedSecondSize, maxWidth = secondSize)
                    Orientation.Horizontal -> constraints.copy(minHeight = adjustedSecondSize, maxHeight = secondSize)
                }

            val firstPlaceable = firstMeasurable.measure(firstConstraints)
            val secondPlaceable = secondMeasurable.measure(secondConstraints)

            layout(constraints.maxWidth, constraints.maxHeight) {
                firstPlaceable.placeRelative(0, 0)
                when (gapOrientation) {
                    Orientation.Vertical -> {
                        dividerPlaceable.placeRelative(firstSize, 0)
                        dividerHandlePlaceable.placeRelative(firstSize - handleWidth / 2, 0)
                        secondPlaceable.placeRelative(firstSize + dividerWidth, 0)
                    }

                    Orientation.Horizontal -> {
                        dividerPlaceable.placeRelative(0, firstSize)
                        dividerHandlePlaceable.placeRelative(0, firstSize - handleWidth / 2)
                        secondPlaceable.placeRelative(0, firstSize + dividerWidth)
                    }
                }
            }
        } ?: layout(constraints.minWidth, constraints.minHeight) {}
    }
}

private interface SplitLayoutStrategy {
    fun calculateSplitResult(density: Density, layoutDirection: LayoutDirection, state: SplitLayoutState): SplitResult

    fun isHorizontal(): Boolean
}

private fun horizontalTwoPaneStrategy(gapWidth: Dp = 0.dp): SplitLayoutStrategy =
    object : SplitLayoutStrategy {
        override fun calculateSplitResult(
            density: Density,
            layoutDirection: LayoutDirection,
            state: SplitLayoutState,
        ): SplitResult {
            val layoutCoordinates = state.layoutCoordinates ?: return SplitResult(Orientation.Vertical, Rect.Zero)
            val availableWidth = layoutCoordinates.size.width
            val splitWidthPixel = with(density) { gapWidth.toPx() }

            val splitX = (availableWidth * state.dividerPosition).coerceIn(0f, availableWidth.toFloat())

            return SplitResult(
                gapOrientation = Orientation.Vertical,
                gapBounds =
                    Rect(
                        left = splitX - splitWidthPixel / 2f,
                        top = 0f,
                        right = (splitX + splitWidthPixel / 2f).coerceAtMost(availableWidth.toFloat()),
                        bottom = layoutCoordinates.size.height.toFloat(),
                    ),
            )
        }

        override fun isHorizontal(): Boolean = true
    }

private fun verticalTwoPaneStrategy(gapHeight: Dp = 0.dp): SplitLayoutStrategy =
    object : SplitLayoutStrategy {
        override fun calculateSplitResult(
            density: Density,
            layoutDirection: LayoutDirection,
            state: SplitLayoutState,
        ): SplitResult {
            val layoutCoordinates = state.layoutCoordinates ?: return SplitResult(Orientation.Horizontal, Rect.Zero)
            val availableHeight = layoutCoordinates.size.height
            val splitHeightPixel = with(density) { gapHeight.toPx() }

            val splitY = (availableHeight * state.dividerPosition).coerceIn(0f, availableHeight.toFloat())

            return SplitResult(
                gapOrientation = Orientation.Horizontal,
                gapBounds =
                    Rect(
                        left = 0f,
                        top = splitY - splitHeightPixel / 2f,
                        right = layoutCoordinates.size.width.toFloat(),
                        bottom = (splitY + splitHeightPixel / 2f).coerceAtMost(availableHeight.toFloat()),
                    ),
            )
        }

        override fun isHorizontal(): Boolean = false
    }

private fun calculateAdjustedSizes(availableSpace: Int, minFirstPaneSize: Int, minSecondPaneSize: Int): Pair<Int, Int> {
    val totalMinSize = minFirstPaneSize + minSecondPaneSize
    if (availableSpace >= totalMinSize) {
        return minFirstPaneSize to minSecondPaneSize
    }

    val ratio = minFirstPaneSize.toFloat() / totalMinSize
    val adjustedFirstSize = (availableSpace * ratio).roundToInt()
    return adjustedFirstSize to availableSpace - adjustedFirstSize
}

private class SplitResult(val gapOrientation: Orientation, val gapBounds: Rect)
