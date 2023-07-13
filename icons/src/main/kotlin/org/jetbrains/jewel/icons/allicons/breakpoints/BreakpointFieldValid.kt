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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointFieldValid: IntellijIconData
    get() {
        if (_breakpointFieldValid != null) {
            return _breakpointFieldValid!!
        }
        _breakpointFieldValid = IntellijIconData(name = "BreakpointFieldValid",size = DpSize(height
                = 14.0.dp, width = 14.0.dp),imageVector = { BreakpointFieldValidComposable(it) })
        return _breakpointFieldValid!!
    }

private var _breakpointFieldValid: IntellijIconData? = null

private fun BreakpointFieldValidComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointFieldValid", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
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
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.0374f, 2.0638f)
        curveTo(3.1001f, 2.4548f, 0.6773f, 4.5873f, 0.0f, 7.0f)
        curveTo(0.75f, 9.6717f, 3.6406f, 12.0f, 7.0f, 12.0f)
        curveTo(10.3594f, 12.0f, 13.25f, 9.6717f, 14.0f, 7.0f)
        curveTo(13.7003f, 5.9323f, 13.0588f, 4.9195f, 12.1822f, 4.0883f)
        lineTo(10.7406f, 5.5298f)
        curveTo(10.6096f, 5.6609f, 10.4614f, 5.7644f, 10.3034f, 5.8405f)
        curveTo(10.4307f, 6.2034f, 10.5f, 6.5936f, 10.5f, 6.9999f)
        curveTo(10.5f, 8.9329f, 8.933f, 10.4999f, 7.0f, 10.4999f)
        curveTo(5.067f, 10.4999f, 3.5f, 8.9329f, 3.5f, 6.9999f)
        curveTo(3.5f, 5.2417f, 4.7965f, 3.7863f, 6.4856f, 3.5375f)
        lineTo(6.4721f, 3.5239f)
        curveTo(6.0755f, 3.1274f, 5.9307f, 2.5746f, 6.0374f, 2.0638f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.0f, 6.9999f)
        curveTo(9.0f, 8.1045f, 8.1046f, 8.9999f, 7.0f, 8.9999f)
        curveTo(5.8954f, 8.9999f, 5.0f, 8.1045f, 5.0f, 6.9999f)
        curveTo(5.0f, 5.8954f, 5.8954f, 4.9999f, 7.0f, 4.9999f)
        curveTo(8.1046f, 4.9999f, 9.0f, 5.8954f, 9.0f, 6.9999f)
        close()
    }
}
.build()
