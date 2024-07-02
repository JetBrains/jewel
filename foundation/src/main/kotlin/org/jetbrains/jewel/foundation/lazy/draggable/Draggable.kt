package org.jetbrains.jewel.foundation.lazy.draggable

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.zIndex

internal val ModifierLocalDraggableLayoutOffset = modifierLocalOf { Offset.Zero }

public fun Modifier.draggableLayout(): Modifier = composed {
    var offset by remember { mutableStateOf(Offset.Zero) }

    this.onGloballyPositioned {
        offset = it.positionInRoot()
    }.modifierLocalProvider(ModifierLocalDraggableLayoutOffset) {
        offset
    }
}

public fun Modifier.draggableItem(
    state: LazyLayoutDraggableState<*>,
    key: Any,
    draggable: Boolean = true,
    orientation: Orientation? = null,
): Modifier {
    return if (draggable) {
        this.draggingItem(state, key, orientation).draggableItemHandle(state, key)
    } else {
        this.draggingItem(state, key, orientation)
    }
}

private fun Modifier.draggableItemHandle(
    state: LazyLayoutDraggableState<*>,
    key: Any,
): Modifier = composed {
    var itemOffset by remember { mutableStateOf(Offset.Zero) }
    var layoutOffset by remember { mutableStateOf(Offset.Zero) }

    onGloballyPositioned {
        itemOffset = it.positionInRoot()
    }.modifierLocalConsumer {
        layoutOffset = ModifierLocalDraggableLayoutOffset.current
    }.pointerInput(Unit) {
        detectDragGestures(onDrag = { change, offset ->
            change.consume()
            state.onDrag(offset)
        }, onDragStart = {
            state.onDragStart(key, it + itemOffset - layoutOffset)
        }, onDragEnd = {
            state.onDragInterrupted()
        }, onDragCancel = {
            state.onDragInterrupted()
        })
    }
}

private fun Modifier.draggingItem(
    state: LazyLayoutDraggableState<*>,
    key: Any,
    orientation: Orientation? = null,
): Modifier = composed {
    val dragging = state.draggingItemKey == key
    if (dragging) {
        this.then(
            Modifier.zIndex(2f).graphicsLayer(
                translationX = if (orientation == Orientation.Vertical) 0f else state.draggingItemOffsetTransformX,
                translationY = if (orientation == Orientation.Horizontal) 0f else state.draggingItemOffsetTransformY,
            ),
        )
    } else {
        this
    }
}
