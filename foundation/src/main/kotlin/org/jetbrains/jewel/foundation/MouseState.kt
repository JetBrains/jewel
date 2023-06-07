package org.jetbrains.jewel.foundation

import androidx.compose.runtime.Immutable

@Immutable
@JvmInline
value class MouseState private constructor(val state: ULong) {

    override fun toString(): String {
        return when (state) {
            None.state -> "None"
            Pressed.state -> "Pressed"
            Hovered.state -> "Hovered"
            else -> "Unknown"
        }
    }

    companion object {

        operator fun invoke(state: ULong): MouseState {
            when (state and 0b11UL) {
                None.state -> return None
                Hovered.state -> return Hovered
                Pressed.state -> return Pressed
                else -> throw IllegalArgumentException("Unknown mouse state: $state")
            }
        }

        val None = MouseState(0UL)
        val Hovered = MouseState(1UL)
        val Pressed = MouseState(2UL)
    }
}
