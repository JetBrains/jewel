package org.jetbrains.jewel.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.InteractiveComponentState

@Immutable
abstract class ResourcePainterProvider<T : InteractiveComponentState> : BaseResourcePainterProvider<T>() {

    @Composable
    override fun selectVariant(state: T): String =
        state.chooseValue(normal, disabled, focused, pressed, hovered)
}
