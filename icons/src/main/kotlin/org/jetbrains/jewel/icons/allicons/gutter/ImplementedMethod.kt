package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.ImplementedMethod: IntellijIconData
    get() {
        if (_implementedMethod != null) {
            return _implementedMethod!!
        }
        _implementedMethod = IntellijIconData(imageVector = { ImplementedMethodComposable(it) })
        return _implementedMethod!!
    }

private var _implementedMethod: IntellijIconData? = null

private fun ImplementedMethodComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ImplementedMethod", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth =
        14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 11.5f)
        curveTo(7.9853f, 11.5f, 10.0f, 9.4853f, 10.0f, 7.0f)
        curveTo(10.0f, 4.5147f, 7.9853f, 2.5f, 5.5f, 2.5f)
        curveTo(3.0147f, 2.5f, 1.0f, 4.5147f, 1.0f, 7.0f)
        curveTo(1.0f, 9.4853f, 3.0147f, 11.5f, 5.5f, 11.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
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
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.5f, 6.0f)
        curveTo(11.7761f, 6.0f, 12.0f, 6.2239f, 12.0f, 6.5f)
        verticalLineTo(12.2929f)
        lineTo(13.1464f, 11.1464f)
        curveTo(13.3417f, 10.9512f, 13.6583f, 10.9512f, 13.8536f, 11.1464f)
        curveTo(14.0488f, 11.3417f, 14.0488f, 11.6583f, 13.8536f, 11.8536f)
        lineTo(11.8536f, 13.8536f)
        curveTo(11.6583f, 14.0488f, 11.3417f, 14.0488f, 11.1464f, 13.8536f)
        lineTo(9.1465f, 11.8536f)
        curveTo(8.9512f, 11.6583f, 8.9512f, 11.3417f, 9.1465f, 11.1464f)
        curveTo(9.3417f, 10.9512f, 9.6583f, 10.9512f, 9.8535f, 11.1464f)
        lineTo(11.0f, 12.2929f)
        verticalLineTo(6.5f)
        curveTo(11.0f, 6.2239f, 11.2239f, 6.0f, 11.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 1.5f)
        curveTo(7.9169f, 1.5f, 9.9697f, 3.0589f, 10.7077f, 5.2261f)
        curveTo(10.2828f, 5.491f, 10.0f, 5.9625f, 10.0f, 6.5f)
        verticalLineTo(7.0f)
        curveTo(10.0f, 4.5147f, 7.9853f, 2.5f, 5.5f, 2.5f)
        curveTo(3.0147f, 2.5f, 1.0f, 4.5147f, 1.0f, 7.0f)
        curveTo(1.0f, 9.4853f, 3.0147f, 11.5f, 5.5f, 11.5f)
        curveTo(6.6154f, 11.5f, 7.636f, 11.0942f, 8.4222f, 10.4222f)
        lineTo(8.4393f, 10.4393f)
        curveTo(8.0501f, 10.8286f, 7.9195f, 11.3786f, 8.0476f, 11.8757f)
        curveTo(7.2859f, 12.2745f, 6.4193f, 12.5f, 5.5f, 12.5f)
        curveTo(2.4624f, 12.5f, 0.0f, 10.0376f, 0.0f, 7.0f)
        curveTo(0.0f, 3.9624f, 2.4624f, 1.5f, 5.5f, 1.5f)
        close()
    }
}
.build()
