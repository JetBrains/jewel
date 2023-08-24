package org.jetbrains.jewel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

@Deprecated("The outline doesn't belong into the state", ReplaceWith("FocusableComponentState"))
interface StateWithOutline : FocusableComponentState {

    @Stable
    val isError: Boolean

    @Stable
    val isWarning: Boolean

    @Stable
    val hasOutline: Boolean
        get() = outline != Outline.None

    @Stable
    val outline: Outline
        get() = when {
            isError -> Outline.Error
            isWarning -> Outline.Warning
            else -> Outline.None
        }

    @Composable
    fun <T> chooseValueWithOutline(
        normal: T,
        disabled: T,
        focused: T,
        pressed: T,
        hovered: T,
        warning: T,
        error: T,
        active: T,
    ): T =
        when {
            !isEnabled -> disabled
            isPressed && !IntelliJTheme.isSwingCompatMode -> pressed
            isHovered && !IntelliJTheme.isSwingCompatMode -> hovered
            isFocused -> focused
            isError -> error
            isWarning -> warning
            isActive -> active
            else -> normal
        }
}
