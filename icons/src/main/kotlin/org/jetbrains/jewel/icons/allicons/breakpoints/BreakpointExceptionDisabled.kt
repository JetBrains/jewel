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

public val BreakpointsGroup.BreakpointExceptionDisabled: IntellijIconData
    get() {
        if (_breakpointExceptionDisabled != null) {
            return _breakpointExceptionDisabled!!
        }
        _breakpointExceptionDisabled = IntellijIconData(name = "BreakpointExceptionDisabled",size =
                DpSize(height = 14.0.dp, width = 14.0.dp),imageVector = {
                BreakpointExceptionDisabledComposable(it) })
        return _breakpointExceptionDisabled!!
    }

private var _breakpointExceptionDisabled: IntellijIconData? = null

private fun BreakpointExceptionDisabledComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointExceptionDisabled", defaultWidth = 14.0.dp, defaultHeight =
        14.0.dp, viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.0156f, 7.979f)
        curveTo(7.253f, 8.2542f, 7.3589f, 8.6191f, 7.3057f, 8.9787f)
        lineTo(7.016f, 10.9341f)
        lineTo(10.8162f, 6.4545f)
        horizontalLineTo(7.9308f)
        curveTo(7.5673f, 6.4545f, 7.2219f, 6.2963f, 6.9844f, 6.021f)
        curveTo(6.747f, 5.7458f, 6.6411f, 5.3809f, 6.6943f, 5.0213f)
        lineTo(6.984f, 3.0659f)
        lineTo(3.1838f, 7.5455f)
        horizontalLineTo(6.0692f)
        curveTo(6.4327f, 7.5455f, 6.7781f, 7.7037f, 7.0156f, 7.979f)
        close()
        moveTo(1.5446f, 7.5455f)
        lineTo(7.3307f, 0.7248f)
        lineTo(7.4024f, 0.6403f)
        lineTo(7.6342f, 0.3671f)
        lineTo(7.8046f, 0.1662f)
        curveTo(8.103f, -0.1855f, 8.6922f, 0.064f, 8.6256f, 0.5139f)
        lineTo(8.5797f, 0.8237f)
        lineTo(8.5301f, 1.1589f)
        lineTo(8.5149f, 1.2612f)
        lineTo(8.116f, 3.9545f)
        lineTo(7.9308f, 5.2045f)
        horizontalLineTo(9.1945f)
        horizontalLineTo(11.8766f)
        horizontalLineTo(11.8826f)
        horizontalLineTo(12.0297f)
        horizontalLineTo(12.5337f)
        curveTo(12.9263f, 5.2045f, 13.1425f, 5.6445f, 12.8939f, 5.9376f)
        lineTo(12.5337f, 6.3622f)
        lineTo(12.4589f, 6.4504f)
        lineTo(12.4554f, 6.4545f)
        lineTo(6.6693f, 13.2752f)
        lineTo(6.5976f, 13.3597f)
        lineTo(6.3658f, 13.6329f)
        lineTo(6.1954f, 13.8338f)
        curveTo(5.897f, 14.1855f, 5.3078f, 13.936f, 5.3744f, 13.4861f)
        lineTo(5.4203f, 13.1763f)
        lineTo(5.4699f, 12.841f)
        lineTo(5.4851f, 12.7388f)
        lineTo(5.884f, 10.0455f)
        lineTo(6.0692f, 8.7955f)
        horizontalLineTo(4.8055f)
        horizontalLineTo(2.1233f)
        horizontalLineTo(2.1174f)
        horizontalLineTo(1.9703f)
        horizontalLineTo(1.4663f)
        curveTo(1.0737f, 8.7955f, 0.8575f, 8.3555f, 1.1061f, 8.0624f)
        lineTo(1.4663f, 7.6378f)
        lineTo(1.5411f, 7.5496f)
        lineTo(1.5446f, 7.5455f)
        close()
    }
}
.build()
