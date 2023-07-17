package org.jetbrains.jewel.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.StateWithOutline
import org.jetbrains.jewel.SvgLoader

@Deprecated("Switch to a ResourcePathPainterProvider")
@Immutable
abstract class OutlineResourcePainterProvider<T : StateWithOutline> internal constructor(
    svgLoader: SvgLoader,
) : BaseResourcePainterProvider<T>(svgLoader) {

    abstract val warning: String
    abstract val error: String

    @Composable
    override fun selectVariant(state: T): String =
        state.chooseValueWithOutline(normal, disabled, focused, pressed, hovered, warning, error)

    companion object {

        @Composable
        fun <T : StateWithOutline> create(
            normal: String,
            disabled: String,
            focused: String,
            pressed: String,
            hovered: String,
            warning: String,
            error: String,
            svgLoader: SvgLoader,
        ) = object : OutlineResourcePainterProvider<T>(svgLoader) {
            override val normal = normal
            override val disabled = disabled
            override val focused = focused
            override val pressed = pressed
            override val hovered = hovered
            override val warning = warning
            override val error = error
        }
    }
}
