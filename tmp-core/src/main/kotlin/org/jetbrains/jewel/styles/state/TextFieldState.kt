package org.jetbrains.jewel.components.state

import org.jetbrains.jewel.styles.state.ButtonMouseState

data class TextFieldState(
    val enabled: Boolean = true,
    val mouseState: ButtonMouseState = ButtonMouseState.None,
)
