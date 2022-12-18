package org.jetbrains.jewel.components.state

import org.jetbrains.jewel.components.TextFieldHintState

data class TextFieldState(
    val enabled: Boolean = true,
    val hovered: Boolean = false,
    val focused: Boolean = false,
    val hintState: TextFieldHintState = TextFieldHintState.Normal
) {

    companion object {

        val Default = TextFieldState()
    }
}
