package org.jetbrains.jewel.foundation.lazy.selectable

import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers
import androidx.compose.ui.input.pointer.isCtrlPressed
import androidx.compose.ui.input.pointer.isMetaPressed
import androidx.compose.ui.input.pointer.isShiftPressed
import androidx.compose.ui.modifier.ModifierLocalConsumer
import androidx.compose.ui.modifier.ModifierLocalModifierNode
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.node.DelegatingNode

public interface SelectionManager {
    public val interactionSource: MutableInteractionSource

    public fun isSelectable(itemKey: Any?): Boolean

    public fun isSelected(itemKey: Any?): Boolean

    public fun handleEvent(event: SelectionEvent)

    public fun clearSelection()
}

internal val ModifierLocalSelectionManager = modifierLocalOf<SelectionManager?> { null }

public fun Modifier.selectionManager(manager: SelectionManager): Modifier =
    focusable(interactionSource = manager.interactionSource)
        .focusGroup()
        .modifierLocalProvider(ModifierLocalSelectionManager) {
            manager
        }

public fun Modifier.selectionManagerConsumer(factory: @Composable (SelectionManager) -> Modifier): Modifier =
    composed {
        var manager by remember { mutableStateOf<SelectionManager?>(null) }

        this
            .modifierLocalConsumer {
                manager = ModifierLocalSelectionManager.current
            }.then(if (manager != null) factory(manager!!) else Modifier)
    }

internal fun PointerKeyboardModifiers.selectionType(): SelectionType =
    when {
        this.isCtrlPressed || this.isMetaPressed -> SelectionType.Multi
        this.isShiftPressed -> SelectionType.Contiguous
        else -> SelectionType.Normal
    }
