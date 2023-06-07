package org.jetbrains.jewel.components.state

import androidx.compose.ui.state.ToggleableState

data class CheckboxState(
    val toggle: ToggleableState,
    val mouseClick: Boolean = false,
    val mouseOver: Boolean = false,
    val enabled: Boolean = true,
    val focused: Boolean = false
)
