package org.jetbrains.jewel.components.state

import org.jetbrains.jewel.styles.state.ButtonMouseState

enum class TextFieldValidationState {
    Default, Warning, Error, Ok
}

data class TextFieldState(
    val focused: Boolean = false,
    val enabled: Boolean = true,
    val mouseState: ButtonMouseState = ButtonMouseState.None,
    val textFieldValidationState: TextFieldValidationState = TextFieldValidationState.Default,
)
