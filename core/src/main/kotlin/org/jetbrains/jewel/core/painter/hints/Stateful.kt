package org.jetbrains.jewel.core.painter.hints

import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.core.painter.PainterHint
import org.jetbrains.jewel.core.painter.PainterSuffixHint
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.state.InteractiveComponentState

@Immutable
private class StatefulImpl(private val state: InteractiveComponentState) : PainterSuffixHint() {

    override fun suffix(): String = buildString {
        if (state.isEnabled) {
            when {
                state is FocusableComponentState && state.isFocused -> append("Focused")
                state.isPressed -> append("Pressed")
                state.isHovered -> append("Hovered")
            }
        } else {
            append("Disabled")
        }
    }

    override fun toString(): String = "Stateful(state=$state)"

    override fun hashCode(): Int = state.hashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StatefulImpl) return false

        if (state != other.state) return false

        return true
    }
}

fun Stateful(state: InteractiveComponentState): PainterHint = StatefulImpl(state)
