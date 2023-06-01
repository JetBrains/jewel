package org.jetbrains.jewel.styles.state

data class TextLinkState(
    val visited: Boolean = false,
    val focused: Boolean = false,
    val mouseState: ButtonMouseState = ButtonMouseState.None
)

