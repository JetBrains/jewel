package org.jetbrains.jewel.icons.allicons.actions

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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Filterdups: IntellijIconData
    get() {
        if (_filterdups != null) {
            return _filterdups!!
        }
        _filterdups = IntellijIconData(imageVector = { FilterdupsComposable(it) })
        return _filterdups!!
    }

private var _filterdups: IntellijIconData? = null

private fun FilterdupsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Filterdups", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(4.6465f, 7.8535f)
        curveTo(4.4512f, 7.6583f, 4.4512f, 7.3417f, 4.6465f, 7.1465f)
        curveTo(4.8417f, 6.9512f, 5.1583f, 6.9512f, 5.3535f, 7.1465f)
        lineTo(7.5f, 9.2929f)
        lineTo(7.5f, 2.5f)
        curveTo(7.5f, 2.2239f, 7.7239f, 2.0f, 8.0f, 2.0f)
        curveTo(8.2761f, 2.0f, 8.5f, 2.2239f, 8.5f, 2.5f)
        lineTo(8.5f, 9.2929f)
        lineTo(10.6464f, 7.1465f)
        curveTo(10.8417f, 6.9512f, 11.1583f, 6.9512f, 11.3536f, 7.1465f)
        curveTo(11.5488f, 7.3417f, 11.5488f, 7.6583f, 11.3536f, 7.8535f)
        lineTo(8.3535f, 10.8536f)
        lineTo(8.0f, 11.2071f)
        lineTo(7.6465f, 10.8536f)
        lineTo(4.6465f, 7.8535f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 2.0f)
        lineTo(5.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 2.5f)
        lineTo(6.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 3.0f)
        lineTo(1.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 2.5f)
        lineTo(1.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.5f, 2.0f)
        lineTo(14.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 2.5f)
        lineTo(15.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 3.0f)
        lineTo(10.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 2.5f)
        lineTo(10.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 4.0f)
        lineTo(5.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 4.5f)
        lineTo(6.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 5.0f)
        lineTo(1.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 4.5f)
        lineTo(1.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 4.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 13.0f)
        lineTo(14.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 13.5f)
        lineTo(15.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 14.0f)
        lineTo(1.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 13.5f)
        lineTo(1.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.5f, 4.0f)
        lineTo(14.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 4.5f)
        lineTo(15.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 5.0f)
        lineTo(10.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 4.5f)
        lineTo(10.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 4.0f)
        close()
    }
}
.build()
