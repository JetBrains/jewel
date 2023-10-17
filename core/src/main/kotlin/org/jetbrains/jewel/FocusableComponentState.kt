package org.jetbrains.jewel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

interface FocusableComponentState : InteractiveComponentState {

    @Stable
    val isFocused: Boolean

    @Composable
    fun <T> chooseValue(
        normal: T,
        disabled: T,
        focused: T,
        pressed: T,
        hovered: T,
        active: T,
        isSwingCompatMode: Boolean = IntelliJTheme.isSwingCompatMode,
    ): T =
        when {
            !isEnabled -> disabled
            isPressed && !isSwingCompatMode -> pressed
            isHovered && !isSwingCompatMode -> hovered
            isFocused -> focused
            isActive -> active
            else -> normal
        }
}
