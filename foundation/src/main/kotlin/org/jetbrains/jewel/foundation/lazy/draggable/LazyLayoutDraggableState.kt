package org.jetbrains.jewel.foundation.lazy.draggable

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size

public abstract class LazyLayoutDraggableState<T> {

    public var draggingItemOffsetTransformX: Float by mutableStateOf(0f)

    public var draggingItemOffsetTransformY: Float by mutableStateOf(0f)

    public var draggingItemKey: Any? by mutableStateOf(null)

    public var initialOffset: Offset = Offset.Zero

    public var draggingOffset: Offset = Offset.Zero

    internal val interactionSource: MutableInteractionSource = MutableInteractionSource()

    public fun onDragStart(key: Any?, offset: Offset) {
        draggingItemKey = key
        initialOffset = offset
    }

    public fun onDrag(offset: Offset) {
        draggingItemOffsetTransformX += offset.x
        draggingItemOffsetTransformY += offset.y
        draggingOffset += offset

        val draggingItem = getItemWithKey(draggingItemKey ?: return) ?: return
        val hoverItem = getItemAt(initialOffset + draggingOffset)

        if (hoverItem != null && draggingItem != hoverItem) {
            val changedOffset = draggingItem.offset - hoverItem.offset

            draggingItemOffsetTransformX += changedOffset.x
            draggingItemOffsetTransformY += changedOffset.y

            moveItem(draggingItem.index, hoverItem.index)
        }
    }

    public fun onDragInterrupted() {
        draggingItemKey = null
        initialOffset = Offset.Zero
        draggingOffset = Offset.Zero
        draggingItemOffsetTransformX = 0f
        draggingItemOffsetTransformY = 0f
    }

    public abstract fun moveItem(from: Int, to: Int)

    public abstract fun getItemAt(offset: Offset): T?

    public abstract fun getItemWithKey(key: Any): T?

    public abstract val T.offset: Offset

    public abstract val T.size: Size

    public abstract val T.index: Int

    public abstract val T.key: Any?
}
