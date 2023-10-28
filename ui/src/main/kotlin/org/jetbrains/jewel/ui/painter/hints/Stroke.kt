package org.jetbrains.jewel.ui.painter.hints

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.ui.painter.PainterHint
import org.jetbrains.jewel.ui.painter.PainterProviderScope
import org.jetbrains.jewel.ui.painter.PainterSuffixHint
import org.jetbrains.jewel.ui.painter.PainterSvgPatchHint
import org.w3c.dom.Element

@Immutable
private object StrokeImpl : PainterSuffixHint(), PainterSvgPatchHint {

    override fun PainterProviderScope.suffix(): String = "_stroke"

    override fun PainterProviderScope.patch(element: Element) {
        if (path.contains(suffix())) return
        element.patchPalette(
            fill = backgroundPalette.associateWith { Color.Transparent },
            stroke = strokeColors.associateWith { Color.White },
        )
    }

    override fun PainterProviderScope.canApply(): Boolean = true

    override fun toString(): String = "Stroke"

    private val backgroundPalette = listOf(
        Color(0xFFEBECF0),
        Color(0xFFE7EFFD),
        Color(0xFFDFF2E0),
        Color(0xFFF2FCF3),
        Color(0xFFFFE8E8),
        Color(0xFFFFF5F5),
        Color(0xFFFFF8E3),
        Color(0xFFFFF4EB),
        Color(0xFFEEE0FF),
    )

    private val strokeColors = listOf(
        Color(0xFF000000),
        Color(0xFFFFFFFF),
        Color(0xFF818594),
        Color(0xFF6C707E),
        Color(0xFF3574F0),
        Color(0xFF5FB865),
        Color(0xFFE35252),
        Color(0xFFEB7171),
        Color(0xFFE3AE4D),
        Color(0xFFFCC75B),
        Color(0xFFF28C35),
        Color(0xFF955AE0),
    )
}

fun Stroke(stroked: Boolean = true): PainterHint = if (stroked) {
    StrokeImpl
} else {
    PainterHint.None
}
