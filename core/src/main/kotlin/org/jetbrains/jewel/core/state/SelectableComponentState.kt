package org.jetbrains.jewel.core.state

import androidx.compose.runtime.Stable

interface SelectableComponentState : FocusableComponentState {

    @Stable
    val isSelected: Boolean
}
