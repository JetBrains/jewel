package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.Remeasurement
import androidx.compose.ui.layout.RemeasurementModifier
import androidx.compose.ui.unit.Density
import kotlin.math.abs

@Composable
public fun rememberLazyTableState(
    firstVisibleRowIndex: Int = 0,
    firstVisibleColumnIndex: Int = 0,
    firstVisibleRowScrollOffset: Int = 0,
    firstVisibleColumnScrollOffset: Int = 0,
): LazyTableState {
    return rememberSaveable(saver = LazyTableState.Saver) {
        LazyTableState(
            firstVisibleRowIndex = firstVisibleRowIndex,
            firstVisibleColumnIndex = firstVisibleColumnIndex,
            firstVisibleRowScrollOffset = firstVisibleRowScrollOffset,
            firstVisibleColumnScrollOffset = firstVisibleColumnScrollOffset,
        )
    }
}

public class LazyTableState(
    firstVisibleRowIndex: Int = 0,
    firstVisibleColumnIndex: Int = 0,
    firstVisibleRowScrollOffset: Int = 0,
    firstVisibleColumnScrollOffset: Int = 0,
) {

    private val scrollPosition = LazyTableScrollPosition(
        firstVisibleRowIndex,
        firstVisibleColumnIndex,
        firstVisibleRowScrollOffset,
        firstVisibleColumnScrollOffset,
    )

    public val firstVisibleRowIndex: Int
        get() = scrollPosition.row

    public val firstVisibleColumnIndex: Int
        get() = scrollPosition.column

    public val firstVisibleItemVerticalScrollOffset: Int
        get() = scrollPosition.verticalScrollOffset

    public val firstVisibleItemHorizontalScrollOffset: Int
        get() = scrollPosition.horizontalScrollOffset

    internal val pinnedItems = LazyLayoutPinnedItemList()

    internal val awaitLayoutModifier = AwaitFirstLayoutModifier()

    internal val nearestRowRange: IntRange by scrollPosition.nearestRowRange

    internal val nearestColumnRange: IntRange by scrollPosition.nearestColumnRange

    internal var prefetchingEnabled: Boolean = true

    internal val prefetchState = LazyLayoutPrefetchState()

    internal val internalInteractionSource: MutableInteractionSource = MutableInteractionSource()

    internal var remeasurement: Remeasurement? = null
        private set

    private val layoutInfoState = mutableStateOf<LazyTableLayoutInfo>(EmptyLazyTableLayoutInfo)

    internal var numMeasurePasses: Int = 0
        private set

    internal val remeasurementModifier = object : RemeasurementModifier {
        override fun onRemeasurementAvailable(remeasurement: Remeasurement) {
            this@LazyTableState.remeasurement = remeasurement
        }
    }

    internal fun applyMeasureResult(result: LazyTableMeasureResult) {
        scrollPosition.updateFromMeasureResult(result)
        scrollToBeConsumedHorizontal -= result.consumedHorizontalScroll
        scrollToBeConsumedVertical -= result.consumedVerticalScroll

        layoutInfoState.value = result

        canHorizontalScrollBackward = result.canHorizontalScrollBackward
        canHorizontalScrollForward = result.canHorizontalScrollForward
        canVerticalScrollBackward = result.canVerticalScrollBackward
        canVerticalScrollForward = result.canVerticalScrollForward

        numMeasurePasses++
    }

    public val isScrollInProgress: Boolean
        get() = horizontalScrollableState.isScrollInProgress || verticalScrollableState.isScrollInProgress

    /*
     * Horizontal scroll
     */

    internal var scrollToBeConsumedHorizontal = 0f
        private set

    public val horizontalScrollableState: ScrollableState = ScrollableState {
        -onHorizontalScroll(-it)
    }

    public suspend fun horizontalScroll(
        scrollPriority: MutatePriority = MutatePriority.Default,
        block: suspend ScrollScope.() -> Unit,
    ) {
        awaitLayoutModifier.waitForFirstLayout()
        horizontalScrollableState.scroll(scrollPriority, block)
    }

    internal fun onHorizontalScroll(distance: Float): Float {
        if (distance < 0 && !canHorizontalScrollForward || distance > 0 && !canHorizontalScrollBackward) {
            return 0f
        }
        check(abs(scrollToBeConsumedHorizontal) <= 0.5f) {
            "entered drag with non-zero pending scroll: $scrollToBeConsumedHorizontal"
        }
        scrollToBeConsumedHorizontal += distance

        // scrollToBeConsumed will be consumed synchronously during the forceRemeasure invocation
        // inside measuring we do scrollToBeConsumed.roundToInt() so there will be no scroll if
        // we have less than 0.5 pixels
        if (abs(scrollToBeConsumedHorizontal) > 0.5f) {
            val preScrollToBeConsumed = scrollToBeConsumedHorizontal
            remeasurement?.forceRemeasure()
        }

        // here scrollToBeConsumed is already consumed during the forceRemeasure invocation
        if (abs(scrollToBeConsumedHorizontal) <= 0.5f) {
            // We consumed all of it - we'll hold onto the fractional scroll for later, so report
            // that we consumed the whole thing
            return distance
        } else {
            val scrollConsumed = distance - scrollToBeConsumedHorizontal
            // We did not consume all of it - return the rest to be consumed elsewhere (e.g.,
            // nested scrolling)
            scrollToBeConsumedHorizontal = 0f // We're not consuming the rest, give it back
            return scrollConsumed
        }
    }

    public var canHorizontalScrollForward: Boolean by mutableStateOf(false)
        private set

    public var canHorizontalScrollBackward: Boolean by mutableStateOf(false)
        private set

    /*
     * Vertical scroll
     */

    internal var scrollToBeConsumedVertical = 0f
        private set

    public val verticalScrollableState: ScrollableState = ScrollableState {
        -onVerticalScroll(-it)
    }

    public suspend fun verticalScroll(
        scrollPriority: MutatePriority = MutatePriority.Default,
        block: suspend ScrollScope.() -> Unit,
    ) {
        awaitLayoutModifier.waitForFirstLayout()
        verticalScrollableState.scroll(scrollPriority, block)
    }

    internal fun onVerticalScroll(distance: Float): Float {
        if (distance < 0 && !canVerticalScrollForward || distance > 0 && !canVerticalScrollBackward) {
            return 0f
        }
        check(abs(scrollToBeConsumedVertical) <= 0.5f) {
            "entered drag with non-zero pending scroll: $scrollToBeConsumedVertical"
        }
        scrollToBeConsumedVertical += distance

        // scrollToBeConsumed will be consumed synchronously during the forceRemeasure invocation
        // inside measuring we do scrollToBeConsumed.roundToInt() so there will be no scroll if
        // we have less than 0.5 pixels
        if (abs(scrollToBeConsumedVertical) > 0.5f) {
            val preScrollToBeConsumed = scrollToBeConsumedVertical
            remeasurement?.forceRemeasure()
            if (prefetchingEnabled) {
                // notifyPrefetch(preScrollToBeConsumed - scrollToBeConsumedVertical)
            }
        }

        // here scrollToBeConsumed is already consumed during the forceRemeasure invocation
        if (abs(scrollToBeConsumedVertical) <= 0.5f) {
            // We consumed all of it - we'll hold onto the fractional scroll for later, so report
            // that we consumed the whole thing
            return distance
        } else {
            val scrollConsumed = distance - scrollToBeConsumedVertical
            // We did not consume all of it - return the rest to be consumed elsewhere (e.g.,
            // nested scrolling)
            scrollToBeConsumedVertical = 0f // We're not consuming the rest, give it back
            return scrollConsumed
        }
    }

    public var canVerticalScrollForward: Boolean by mutableStateOf(false)
        private set

    public var canVerticalScrollBackward: Boolean by mutableStateOf(false)
        private set

    public val layoutInfo: LazyTableLayoutInfo get() = layoutInfoState.value

    public suspend fun scrollToColumn(
        column: Int,
        scrollOffset: Int = 0,
    ) {
        horizontalScroll {
            snapToColumnInternal(column, scrollOffset)
        }
    }

    internal fun snapToColumnInternal(column: Int, scrollOffset: Int) {
        scrollPosition.requestColumn(column, scrollOffset)
        // placement animation is not needed because we snap into a new position.
        // placementAnimator.reset()
        remeasurement?.forceRemeasure()
    }

    public suspend fun scrollToRow(
        row: Int,
        scrollOffset: Int = 0,
    ) {
        verticalScroll {
            snapToRowInternal(row, scrollOffset)
        }
    }

    internal fun snapToRowInternal(row: Int, scrollOffset: Int) {
        scrollPosition.requestRow(row, scrollOffset)
        // placement animation is not needed because we snap into a new position.
        // placementAnimator.reset()
        remeasurement?.forceRemeasure()
    }

    internal var density: Density = Density(1f, 1f)

    private val animateHorizontalScrollScope = LazyTableAnimateHorizontalScrollScope(this)
    private val animateVerticalScrollScope = LazyTableAnimateVerticalScrollScope(this)

    public suspend fun animateScrollToRow(
        row: Int,
        scrollOffset: Int = 0,
    ) {
        animateVerticalScrollScope.animateScrollToItem(row, scrollOffset)
    }

    public suspend fun animateScrollToColumn(
        column: Int,
        scrollOffset: Int = 0,
    ) {
        animateHorizontalScrollScope.animateScrollToItem(column, scrollOffset)
    }

    public companion object {

        public val Saver: Saver<LazyTableState, *> = listSaver(
            save = {
                listOf(
                    it.firstVisibleRowIndex,
                    it.firstVisibleColumnIndex,
                    it.firstVisibleItemVerticalScrollOffset,
                    it.firstVisibleItemHorizontalScrollOffset,
                )
            },
            restore = {
                LazyTableState(
                    firstVisibleRowIndex = it[0],
                    firstVisibleColumnIndex = it[1],
                    firstVisibleRowScrollOffset = it[2],
                    firstVisibleColumnScrollOffset = it[3],
                )
            },
        )
    }
}

public interface TableScrollScope {

    public fun scrollBy(pixels: Size): Size
}
