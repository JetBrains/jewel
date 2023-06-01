package org.jetbrains.jewel.styles.state

data class ComboBoxState(
    val mouseState: ButtonMouseState = ButtonMouseState.None,
    val isOpen: Boolean = false,
    val enabled: Boolean = true,
    val focused: Boolean = false,

    )

data class DropDownItemState(
    val mouseState: ButtonMouseState = ButtonMouseState.None,
    val enabled: Boolean = true,
    val focused: Boolean = false,
)
