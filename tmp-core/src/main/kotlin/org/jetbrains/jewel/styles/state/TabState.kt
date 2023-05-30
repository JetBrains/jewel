package org.jetbrains.jewel.components.state

import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.styles.state.ButtonMouseState

data class TabState(
    val mouseState: ButtonMouseState = ButtonMouseState.None,
    val selected: Boolean = false,
    val enabled: Boolean = true,
    val tabType: Orientation = Orientation.Horizontal
)
