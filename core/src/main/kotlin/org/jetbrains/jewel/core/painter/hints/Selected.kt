package org.jetbrains.jewel.core.painter.hints

import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.core.painter.PainterHint
import org.jetbrains.jewel.core.painter.PainterSuffixHint
import org.jetbrains.jewel.foundation.state.SelectableComponentState

@Immutable
private object SelectedImpl : PainterSuffixHint() {

    override fun suffix(): String = "Selected"

    override fun toString(): String = "Selected"
}

fun Selected(selected: Boolean = true): PainterHint = if (selected) {
    SelectedImpl
} else {
    PainterHint.None
}

fun Selected(state: SelectableComponentState): PainterHint = Selected(state.isSelected)
