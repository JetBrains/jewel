package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.RunToCursor: IntellijIconData
    get() {
        if (_runToCursor != null) {
            return _runToCursor!!
        }
        _runToCursor = IntellijIconData(imageVector = { RunToCursorComposable(it) })
        return _runToCursor!!
    }

private var _runToCursor: IntellijIconData? = null

private fun RunToCursorComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RunToCursor", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.2613f, 9.0039f)
        curveTo(2.9852f, 9.0039f, 2.7613f, 8.78f, 2.7613f, 8.5039f)
        curveTo(2.7613f, 8.2277f, 2.9852f, 8.0039f, 3.2613f, 8.0039f)
        horizontalLineTo(6.2969f)
        lineTo(1.635f, 3.342f)
        curveTo(1.4397f, 3.1467f, 1.4397f, 2.8301f, 1.635f, 2.6349f)
        curveTo(1.8303f, 2.4396f, 2.1468f, 2.4396f, 2.3421f, 2.6349f)
        lineTo(7.004f, 7.2968f)
        lineTo(7.004f, 4.2612f)
        curveTo(7.004f, 3.9851f, 7.2278f, 3.7612f, 7.504f, 3.7612f)
        curveTo(7.7801f, 3.7612f, 8.004f, 3.9851f, 8.004f, 4.2612f)
        lineTo(8.004f, 8.5039f)
        lineTo(8.004f, 9.0039f)
        lineTo(7.504f, 9.0039f)
        horizontalLineTo(3.2613f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.1465f, 2.1465f)
        curveTo(1.3417f, 1.9512f, 1.6583f, 1.9512f, 1.8535f, 2.1465f)
        lineTo(7.0f, 7.2929f)
        verticalLineTo(3.5f)
        curveTo(7.0f, 3.2239f, 7.2239f, 3.0f, 7.5f, 3.0f)
        curveTo(7.7761f, 3.0f, 8.0f, 3.2239f, 8.0f, 3.5f)
        verticalLineTo(9.0f)
        horizontalLineTo(2.5f)
        curveTo(2.2239f, 9.0f, 2.0f, 8.7761f, 2.0f, 8.5f)
        curveTo(2.0f, 8.2239f, 2.2239f, 8.0f, 2.5f, 8.0f)
        horizontalLineTo(6.2929f)
        lineTo(1.1465f, 2.8535f)
        curveTo(0.9512f, 2.6583f, 0.9512f, 2.3417f, 1.1465f, 2.1465f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 14.0f)
        lineTo(14.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 14.5f)
        lineTo(15.0f, 14.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 15.0f)
        lineTo(13.5f, 15.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 14.5f)
        lineTo(13.0f, 14.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 14.0f)
        lineTo(11.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 14.5f)
        lineTo(12.0f, 14.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 15.0f)
        lineTo(10.5f, 15.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 14.5f)
        lineTo(10.0f, 14.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 7.0f)
        lineTo(14.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 7.5f)
        lineTo(15.0f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 8.0f)
        lineTo(13.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 7.5f)
        lineTo(13.0f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 7.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 7.0f)
        lineTo(11.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 7.5f)
        lineTo(12.0f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 8.0f)
        lineTo(10.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 7.5f)
        lineTo(10.0f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 7.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.0f, 8.5f)
        curveTo(12.0f, 8.2239f, 12.2239f, 8.0f, 12.5f, 8.0f)
        curveTo(12.7761f, 8.0f, 13.0f, 8.2239f, 13.0f, 8.5f)
        verticalLineTo(13.5f)
        curveTo(13.0f, 13.7761f, 12.7761f, 14.0f, 12.5f, 14.0f)
        curveTo(12.2239f, 14.0f, 12.0f, 13.7761f, 12.0f, 13.5f)
        verticalLineTo(8.5f)
        close()
    }
}
.build()
