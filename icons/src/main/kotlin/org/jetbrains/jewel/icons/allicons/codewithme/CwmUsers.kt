package org.jetbrains.jewel.icons.allicons.codewithme

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
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.CwmUsers: IntellijIconData
    get() {
        if (_cwmUsers != null) {
            return _cwmUsers!!
        }
        _cwmUsers = IntellijIconData(imageVector = { CwmUsersComposable(it) })
        return _cwmUsers!!
    }

private var _cwmUsers: IntellijIconData? = null

private fun CwmUsersComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CwmUsers", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.5f, 4.5f)
        curveTo(8.5f, 5.8807f, 7.3807f, 7.0f, 6.0f, 7.0f)
        curveTo(4.6193f, 7.0f, 3.5f, 5.8807f, 3.5f, 4.5f)
        curveTo(3.5f, 3.1193f, 4.6193f, 2.0f, 6.0f, 2.0f)
        curveTo(7.3807f, 2.0f, 8.5f, 3.1193f, 8.5f, 4.5f)
        close()
        moveTo(7.5f, 4.5f)
        curveTo(7.5f, 5.3284f, 6.8284f, 6.0f, 6.0f, 6.0f)
        curveTo(5.1716f, 6.0f, 4.5f, 5.3284f, 4.5f, 4.5f)
        curveTo(4.5f, 3.6716f, 5.1716f, 3.0f, 6.0f, 3.0f)
        curveTo(6.8284f, 3.0f, 7.5f, 3.6716f, 7.5f, 4.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.901f, 13.0f)
        horizontalLineTo(10.099f)
        curveTo(10.6614f, 13.0f, 11.1039f, 12.5357f, 10.9786f, 11.9878f)
        curveTo(10.6448f, 10.5267f, 9.5533f, 8.0f, 5.9969f, 8.0f)
        curveTo(2.4394f, 8.0f, 1.3522f, 10.5282f, 1.021f, 11.9891f)
        curveTo(0.8969f, 12.5367f, 1.3392f, 13.0f, 1.901f, 13.0f)
        close()
        moveTo(9.9509f, 12.0f)
        horizontalLineTo(2.0487f)
        curveTo(2.2087f, 11.401f, 2.5032f, 10.696f, 3.0319f, 10.1276f)
        curveTo(3.5941f, 9.5232f, 4.4867f, 9.0f, 5.9969f, 9.0f)
        curveTo(7.5066f, 9.0f, 8.4004f, 9.523f, 8.9642f, 10.1277f)
        curveTo(9.494f, 10.696f, 9.7898f, 11.401f, 9.9509f, 12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.9999f, 7.0f)
        curveTo(9.5445f, 7.0f, 9.1175f, 6.8782f, 8.7498f, 6.6655f)
        curveTo(8.9556f, 6.4043f, 9.1251f, 6.1132f, 9.2506f, 5.7997f)
        curveTo(9.4711f, 5.9271f, 9.727f, 6.0f, 9.9999f, 6.0f)
        curveTo(10.8284f, 6.0f, 11.4999f, 5.3284f, 11.4999f, 4.5f)
        curveTo(11.4999f, 3.6716f, 10.8284f, 3.0f, 9.9999f, 3.0f)
        curveTo(9.727f, 3.0f, 9.4711f, 3.0729f, 9.2506f, 3.2003f)
        curveTo(9.1251f, 2.8868f, 8.9556f, 2.5956f, 8.7498f, 2.3345f)
        curveTo(9.1175f, 2.1218f, 9.5445f, 2.0f, 9.9999f, 2.0f)
        curveTo(11.3806f, 2.0f, 12.4999f, 3.1193f, 12.4999f, 4.5f)
        curveTo(12.4999f, 5.8807f, 11.3806f, 7.0f, 9.9999f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.9508f, 12.0f)
        horizontalLineTo(11.9927f)
        curveTo(12.0321f, 12.3731f, 11.9566f, 12.7117f, 11.8025f, 13.0f)
        horizontalLineTo(14.0989f)
        curveTo(14.6613f, 13.0f, 15.1038f, 12.5357f, 14.9786f, 11.9878f)
        curveTo(14.6447f, 10.5267f, 13.5532f, 8.0f, 9.9968f, 8.0f)
        curveTo(9.8463f, 8.0f, 9.7003f, 8.0045f, 9.5586f, 8.0133f)
        curveTo(9.8839f, 8.2375f, 10.1727f, 8.4907f, 10.4275f, 8.7641f)
        curveTo(10.5111f, 8.8537f, 10.5905f, 8.9449f, 10.6659f, 9.0372f)
        curveTo(11.7801f, 9.1669f, 12.4892f, 9.6183f, 12.9641f, 10.1277f)
        curveTo(13.4939f, 10.696f, 13.7897f, 11.401f, 13.9508f, 12.0f)
        close()
    }
}
.build()
