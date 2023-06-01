package org.jetbrains.jewel.internal

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isUnspecified
import androidx.compose.ui.unit.Dp

sealed class Stroke {
    @Immutable
    object None : Stroke() {

        override fun toString(): String {
            return "Stroke()"
        }
    }

    @Immutable
    data class Solid internal constructor(
        val width: Dp,
        val color: Color,
        val shape: Shape,
        val alignment: Alignment
    ) : Stroke() {

        override fun toString(): String {
            return "Stroke(width=$width, color=$color, shape=$shape, alignment=$alignment)"
        }
    }

    @Immutable
    data class Brush internal constructor(
        val width: Dp,
        val brush: androidx.compose.ui.graphics.Brush,
        val shape: Shape,
        val alignment: Alignment
    ) : Stroke() {

        override fun toString(): String {
            return "Stroke(width=$width, brush=$brush, shape=$shape, alignment=$alignment)"
        }
    }

    enum class Alignment {
        Inside, Center, Outside
    }
}

fun Stroke(width: Dp, color: Color, shape: Shape, alignment: Stroke.Alignment): Stroke {
    if (width.value == 0f) return Stroke.None
    if (color.isUnspecified) return Stroke.None

    return Stroke.Solid(width, color, shape, alignment)
}

fun Stroke(width: Dp, brush: androidx.compose.ui.graphics.Brush, shape: Shape, alignment: Stroke.Alignment): Stroke {
    if (width.value == 0f) return Stroke.None
    return when (brush) {
        is SolidColor -> {
            if (brush.value.isUnspecified) {
                Stroke.None
            } else {
                Stroke.Solid(width, brush.value, shape, alignment)
            }
        }

        else -> Stroke.Brush(width, brush, shape, alignment)
    }
}
