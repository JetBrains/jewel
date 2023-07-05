package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointMethodUnsuspendentValid: IntellijIconData
    get() {
        if (_breakpointMethodUnsuspendentValid != null) {
            return _breakpointMethodUnsuspendentValid!!
        }
        _breakpointMethodUnsuspendentValid = IntellijIconData(imageVector = {
                BreakpointMethodUnsuspendentValidComposable(it) })
        return _breakpointMethodUnsuspendentValid!!
    }

private var _breakpointMethodUnsuspendentValid: IntellijIconData? = null

private fun BreakpointMethodUnsuspendentValidComposable(colorScheme: IntelliJIconColors):
        ImageVector = Builder(name = "BreakpointMethodUnsuspendentValid", defaultWidth = 14.0.dp,
        defaultHeight = 14.0.dp, viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.827f, 0.1757f)
        curveTo(14.0613f, 0.4101f, 14.0613f, 0.79f, 13.827f, 1.0243f)
        lineTo(10.0301f, 4.8211f)
        curveTo(9.7958f, 5.0554f, 9.4159f, 5.0554f, 9.1816f, 4.8211f)
        lineTo(7.1757f, 2.8153f)
        curveTo(6.9414f, 2.581f, 6.9414f, 2.2011f, 7.1757f, 1.9668f)
        curveTo(7.41f, 1.7324f, 7.7899f, 1.7324f, 8.0243f, 1.9668f)
        lineTo(9.6059f, 3.5484f)
        lineTo(12.9785f, 0.1757f)
        curveTo(13.2128f, -0.0586f, 13.5927f, -0.0586f, 13.827f, 0.1757f)
        close()
    }
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.4721f, 3.524f)
        curveTo(5.8472f, 2.8991f, 5.8472f, 1.8861f, 6.4721f, 1.2612f)
        curveTo(6.8359f, 0.8974f, 7.3314f, 0.7454f, 7.8052f, 0.8053f)
        lineTo(7.707f, 0.7071f)
        curveTo(7.3164f, 0.3166f, 6.6833f, 0.3166f, 6.2927f, 0.7071f)
        lineTo(0.707f, 6.2929f)
        curveTo(0.3164f, 6.6834f, 0.3164f, 7.3165f, 0.707f, 7.7071f)
        lineTo(6.2927f, 13.2929f)
        curveTo(6.6833f, 13.6834f, 7.3164f, 13.6834f, 7.707f, 13.2929f)
        lineTo(13.2927f, 7.7071f)
        curveTo(13.6833f, 7.3165f, 13.6833f, 6.6834f, 13.2927f, 6.2929f)
        lineTo(11.6352f, 4.6353f)
        lineTo(10.7406f, 5.5298f)
        curveTo(10.1158f, 6.1547f, 9.1027f, 6.1547f, 8.4779f, 5.5298f)
        lineTo(6.4721f, 3.524f)
        close()
    }
}
.build()
