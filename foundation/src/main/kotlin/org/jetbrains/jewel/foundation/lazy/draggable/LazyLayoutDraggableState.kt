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
        draggingOffset = Offset.Zero
        draggingItemOffsetTransformX = 0f
        draggingItemOffsetTransformY = 0f

        println("Drag start with '$key' at '$offset'")
    }

    public fun onDrag(offset: Offset) {
        draggingItemOffsetTransformX += offset.x
        draggingItemOffsetTransformY += offset.y
        draggingOffset += offset

        val draggingItem = getItemWithKey(draggingItemKey ?: return) ?: return
        val hoverItem = getReplacingItem(draggingItem)

        if (hoverItem != null && draggingItem.key != hoverItem.key) {
            val targetOffset = if (draggingItem.index < hoverItem.index) {
                val maxOffset = hoverItem.offset + Offset(hoverItem.size.width, hoverItem.size.height)
                maxOffset - Offset(draggingItem.size.width, draggingItem.size.height)
            } else {
                hoverItem.offset
            }

            val changedOffset = draggingItem.offset - targetOffset

            println("Drag '${draggingItem.key}(${draggingItem.size})' at ${draggingItem.offset}")
            println("Over '${hoverItem.key}(${hoverItem.size})' at ${hoverItem.offset}")
            println("Into $targetOffset With $changedOffset")

            moveItem(draggingItem.key, hoverItem.key)

            draggingItemOffsetTransformX += changedOffset.x
            draggingItemOffsetTransformY += changedOffset.y
        }
    }

    public fun onDragInterrupted() {
        println("Drag end")

        draggingItemKey = null
        initialOffset = Offset.Zero
        draggingOffset = Offset.Zero
        draggingItemOffsetTransformX = 0f
        draggingItemOffsetTransformY = 0f
    }

    public abstract fun moveItem(from: Any?, to: Any?)

    public abstract fun getReplacingItem(draggingItem: T): T?

    public abstract fun getItemWithKey(key: Any): T?

    public abstract val T.offset: Offset

    public abstract val T.size: Size

    public abstract val T.index: Int

    public abstract val T.key: Any?
}
