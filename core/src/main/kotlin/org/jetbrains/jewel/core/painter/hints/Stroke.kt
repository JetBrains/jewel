package org.jetbrains.jewel.core.painter.hints

import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.core.painter.PainterHint
import org.jetbrains.jewel.core.painter.PainterSuffixHint

@Immutable
private object StrokeImpl : PainterSuffixHint() {

    override fun suffix(): String = "_stroke"

    override fun toString(): String = "Stroke"
}

fun Stroke(stroked: Boolean = true): PainterHint = if (stroked) {
    StrokeImpl
} else {
    PainterHint.None
}
