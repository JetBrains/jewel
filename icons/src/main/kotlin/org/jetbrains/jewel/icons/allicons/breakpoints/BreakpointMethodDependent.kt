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

public val BreakpointsGroup.BreakpointMethodDependent: IntellijIconData
    get() {
        if (_breakpointMethodDependent != null) {
            return _breakpointMethodDependent!!
        }
        _breakpointMethodDependent = IntellijIconData(imageVector = {
                BreakpointMethodDependentComposable(it) })
        return _breakpointMethodDependent!!
    }

private var _breakpointMethodDependent: IntellijIconData? = null

private fun BreakpointMethodDependentComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointMethodDependent", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.5f, 5.0f)
        curveTo(3.8807f, 5.0f, 5.0f, 3.8807f, 5.0f, 2.5f)
        curveTo(5.0f, 1.1193f, 3.8807f, 0.0f, 2.5f, 0.0f)
        curveTo(1.1193f, 0.0f, 0.0f, 1.1193f, 0.0f, 2.5f)
        curveTo(0.0f, 3.8807f, 1.1193f, 5.0f, 2.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.189f, 5.9321f)
        curveTo(2.9662f, 5.9766f, 2.7357f, 6.0f, 2.4999f, 6.0f)
        curveTo(2.0539f, 6.0f, 1.6275f, 5.9166f, 1.2353f, 5.7645f)
        lineTo(0.707f, 6.2929f)
        curveTo(0.3164f, 6.6834f, 0.3164f, 7.3165f, 0.707f, 7.7071f)
        lineTo(6.2927f, 13.2929f)
        curveTo(6.6833f, 13.6834f, 7.3164f, 13.6834f, 7.707f, 13.2929f)
        lineTo(13.2927f, 7.7071f)
        curveTo(13.6833f, 7.3165f, 13.6833f, 6.6834f, 13.2927f, 6.2929f)
        lineTo(7.707f, 0.7071f)
        curveTo(7.3164f, 0.3166f, 6.6833f, 0.3166f, 6.2927f, 0.7071f)
        lineTo(5.7644f, 1.2354f)
        curveTo(5.9165f, 1.6276f, 5.9998f, 2.0541f, 5.9998f, 2.5f)
        curveTo(5.9998f, 2.7359f, 5.9765f, 2.9663f, 5.932f, 3.1891f)
        lineTo(6.9998f, 2.1213f)
        lineTo(11.8785f, 7.0f)
        lineTo(6.9998f, 11.8787f)
        lineTo(2.1212f, 7.0f)
        lineTo(3.189f, 5.9321f)
        close()
    }
}
.build()
