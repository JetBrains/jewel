package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointException: IntellijIconData
    get() {
        if (_breakpointException != null) {
            return _breakpointException!!
        }
        _breakpointException = IntellijIconData(name = "BreakpointException",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { BreakpointExceptionComposable(it) })
        return _breakpointException!!
    }

private var _breakpointException: IntellijIconData? = null

private fun BreakpointExceptionComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointException", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.6256f, 0.5139f)
        curveTo(8.6922f, 0.064f, 8.103f, -0.1855f, 7.8046f, 0.1662f)
        lineTo(1.1061f, 8.0624f)
        curveTo(0.8575f, 8.3555f, 1.0737f, 8.7955f, 1.4663f, 8.7955f)
        horizontalLineTo(6.0692f)
        lineTo(5.3744f, 13.4861f)
        curveTo(5.3078f, 13.936f, 5.897f, 14.1855f, 6.1954f, 13.8338f)
        lineTo(12.8939f, 5.9376f)
        curveTo(13.1425f, 5.6445f, 12.9263f, 5.2045f, 12.5337f, 5.2045f)
        horizontalLineTo(7.9308f)
        lineTo(8.6256f, 0.5139f)
        close()
    }
}
.build()
