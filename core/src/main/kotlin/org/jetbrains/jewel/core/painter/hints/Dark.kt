package org.jetbrains.jewel.core.painter.hints

import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.core.painter.PainterHint
import org.jetbrains.jewel.core.painter.PainterSuffixHint

@Immutable
private object DarkImpl : PainterSuffixHint() {

    override fun suffix(): String = "_dark"

    override fun toString(): String = "Dark"
}

fun Dark(isDark: Boolean = true): PainterHint = if (isDark) {
    DarkImpl
} else {
    PainterHint.None
}
