package org.jetbrains.jewel.ui.painter.hints

import androidx.compose.runtime.Immutable
import org.jetbrains.jewel.ui.painter.BitmapPainterHint
import org.jetbrains.jewel.ui.painter.PainterHint
import org.jetbrains.jewel.ui.painter.PainterProviderScope
import org.jetbrains.jewel.ui.painter.PainterSuffixHint

@Immutable
private object HiDpiImpl : PainterSuffixHint(), BitmapPainterHint {

    override fun PainterProviderScope.suffix(): String = "@2x"

    override fun PainterProviderScope.canApply(): Boolean = density > 1f

    override fun toString(): String = "HiDpi"
}

fun HiDpi(): PainterHint = HiDpiImpl
