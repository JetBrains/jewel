package org.jetbrains.jewel.icons.allicons.codewithme

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
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.CwmAccess: IntellijIconData
    get() {
        if (_cwmAccess != null) {
            return _cwmAccess!!
        }
        _cwmAccess = IntellijIconData(name = "CwmAccess",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CwmAccessComposable(it) })
        return _cwmAccess!!
    }

private var _cwmAccess: IntellijIconData? = null

private fun CwmAccessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CwmAccess", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.9995f, 7.0f)
        curveTo(9.6564f, 7.0f, 10.9995f, 5.6568f, 10.9995f, 4.0f)
        curveTo(10.9995f, 2.3431f, 9.6564f, 1.0f, 7.9995f, 1.0f)
        curveTo(6.3427f, 1.0f, 4.9995f, 2.3431f, 4.9995f, 4.0f)
        curveTo(4.9995f, 5.6568f, 6.3427f, 7.0f, 7.9995f, 7.0f)
        close()
        moveTo(7.9995f, 6.0f)
        curveTo(9.1041f, 6.0f, 9.9995f, 5.1046f, 9.9995f, 4.0f)
        curveTo(9.9995f, 2.8954f, 9.1041f, 2.0f, 7.9995f, 2.0f)
        curveTo(6.8949f, 2.0f, 5.9995f, 2.8954f, 5.9995f, 4.0f)
        curveTo(5.9995f, 5.1046f, 6.8949f, 6.0f, 7.9995f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.1027f, 13.008f)
        curveTo(2.3991f, 11.3034f, 3.5477f, 8.0f, 7.9997f, 8.0f)
        curveTo(9.2376f, 8.0f, 10.2202f, 8.2554f, 11.0f, 8.6609f)
        verticalLineTo(9.8287f)
        curveTo(10.3142f, 9.3448f, 9.3588f, 9.0f, 7.9997f, 9.0f)
        curveTo(6.058f, 9.0f, 4.9403f, 9.7037f, 4.2556f, 10.5114f)
        curveTo(3.5913f, 11.2951f, 3.2713f, 12.2552f, 3.1215f, 13.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.9997f)
        curveTo(2.4474f, 14.0f, 2.0081f, 13.5521f, 2.1027f, 13.008f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.5f, 9.0f)
        curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
        curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(15.5f)
        curveTo(13.0f, 15.7761f, 12.7761f, 16.0f, 12.5f, 16.0f)
        curveTo(12.2239f, 16.0f, 12.0f, 15.7761f, 12.0f, 15.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
        curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(9.5f)
        curveTo(12.0f, 9.2239f, 12.2239f, 9.0f, 12.5f, 9.0f)
        close()
    }
}
.build()
