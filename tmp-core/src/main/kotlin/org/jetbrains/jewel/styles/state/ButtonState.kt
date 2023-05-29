package org.jetbrains.jewel.components.state

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Brush
import org.jetbrains.jewel.ShapeStroke

data class ButtonState(
    val mouseClick: Boolean = true,
    val mouseOver: Boolean = true,
    val enabled: Boolean = true,
    val focused: Boolean = false
)

class ButtonAppearanceTransitionState(
    background: State<Brush?>,
    shapeStroke: State<ShapeStroke<*>?>,
    haloStroke: State<ShapeStroke<*>?>
) {

    val background by background
    val shapeStroke by shapeStroke
    val haloStroke by haloStroke
}
