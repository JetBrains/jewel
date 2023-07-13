package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.ImplementingMethod: IntellijIconData
    get() {
        if (_implementingMethod != null) {
            return _implementingMethod!!
        }
        _implementingMethod = IntellijIconData(name = "ImplementingMethod",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { ImplementingMethodComposable(it) })
        return _implementingMethod!!
    }

private var _implementingMethod: IntellijIconData? = null

private fun ImplementingMethodComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ImplementingMethod", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.greenFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 7.0f)
        curveTo(10.0f, 4.5147f, 7.9853f, 2.5f, 5.5f, 2.5f)
        curveTo(3.0147f, 2.5f, 1.0f, 4.5147f, 1.0f, 7.0f)
        curveTo(1.0f, 9.4853f, 3.0147f, 11.5f, 5.5f, 11.5f)
        curveTo(7.9853f, 11.5f, 10.0f, 9.4853f, 10.0f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.0f, 5.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.5f, 8.0f)
        curveTo(11.2239f, 8.0f, 11.0f, 7.7761f, 11.0f, 7.5f)
        lineTo(11.0f, 1.7071f)
        lineTo(9.8535f, 2.8535f)
        curveTo(9.6583f, 3.0488f, 9.3417f, 3.0488f, 9.1465f, 2.8535f)
        curveTo(8.9512f, 2.6583f, 8.9512f, 2.3417f, 9.1465f, 2.1465f)
        lineTo(11.1464f, 0.1464f)
        curveTo(11.3417f, -0.0488f, 11.6583f, -0.0488f, 11.8536f, 0.1464f)
        lineTo(13.8536f, 2.1465f)
        curveTo(14.0488f, 2.3417f, 14.0488f, 2.6583f, 13.8536f, 2.8535f)
        curveTo(13.6583f, 3.0488f, 13.3417f, 3.0488f, 13.1464f, 2.8535f)
        lineTo(12.0f, 1.7071f)
        lineTo(12.0f, 7.5f)
        curveTo(12.0f, 7.7761f, 11.7761f, 8.0f, 11.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 7.0f)
        curveTo(10.0f, 9.4853f, 7.9853f, 11.5f, 5.5f, 11.5f)
        curveTo(3.0147f, 11.5f, 1.0f, 9.4853f, 1.0f, 7.0f)
        curveTo(1.0f, 4.5147f, 3.0147f, 2.5f, 5.5f, 2.5f)
        curveTo(6.6154f, 2.5f, 7.636f, 2.9058f, 8.4222f, 3.5778f)
        lineTo(8.4393f, 3.5607f)
        curveTo(8.0501f, 3.1714f, 7.9195f, 2.6214f, 8.0476f, 2.1243f)
        curveTo(7.2859f, 1.7255f, 6.4193f, 1.5f, 5.5f, 1.5f)
        curveTo(2.4624f, 1.5f, 0.0f, 3.9624f, 0.0f, 7.0f)
        curveTo(0.0f, 10.0376f, 2.4624f, 12.5f, 5.5f, 12.5f)
        curveTo(7.9169f, 12.5f, 9.9697f, 10.9411f, 10.7077f, 8.7739f)
        curveTo(10.2828f, 8.5091f, 10.0f, 8.0375f, 10.0f, 7.5f)
        verticalLineTo(7.0f)
        close()
    }
}
.build()
