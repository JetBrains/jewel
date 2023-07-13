package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Changes: IntellijIconData
    get() {
        if (_changes != null) {
            return _changes!!
        }
        _changes = IntellijIconData(name = "Changes",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ChangesComposable(it) })
        return _changes!!
    }

private var _changes: IntellijIconData? = null

private fun ChangesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Changes", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 5.0f)
        lineTo(8.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 5.5f)
        lineTo(9.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 6.0f)
        lineTo(2.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 5.5f)
        lineTo(2.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 8.0f)
        lineTo(6.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 8.5f)
        lineTo(7.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 9.0f)
        lineTo(2.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 8.5f)
        lineTo(2.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 2.0f)
        lineTo(13.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 2.5f)
        lineTo(14.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 3.0f)
        lineTo(2.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 2.5f)
        lineTo(2.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.1464f, 6.1465f)
        curveTo(12.3417f, 5.9512f, 12.6583f, 5.9512f, 12.8536f, 6.1465f)
        curveTo(13.0488f, 6.3417f, 13.0488f, 6.6583f, 12.8536f, 6.8535f)
        lineTo(11.7071f, 8.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 8.0f, 16.0f, 8.2239f, 16.0f, 8.5f)
        curveTo(16.0f, 8.7761f, 15.7761f, 9.0f, 15.5f, 9.0f)
        horizontalLineTo(11.7071f)
        lineTo(12.8536f, 10.1464f)
        curveTo(13.0488f, 10.3417f, 13.0488f, 10.6583f, 12.8536f, 10.8536f)
        curveTo(12.6583f, 11.0488f, 12.3417f, 11.0488f, 12.1464f, 10.8536f)
        lineTo(10.1464f, 8.8535f)
        lineTo(9.7929f, 8.5f)
        lineTo(10.1464f, 8.1465f)
        lineTo(12.1464f, 6.1465f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.8535f, 10.1464f)
        curveTo(8.6583f, 9.9512f, 8.3417f, 9.9512f, 8.1465f, 10.1464f)
        curveTo(7.9512f, 10.3417f, 7.9512f, 10.6583f, 8.1465f, 10.8536f)
        lineTo(9.2929f, 12.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 12.0f, 5.0f, 12.2239f, 5.0f, 12.5f)
        curveTo(5.0f, 12.7761f, 5.2239f, 13.0f, 5.5f, 13.0f)
        horizontalLineTo(9.2929f)
        lineTo(8.1465f, 14.1464f)
        curveTo(7.9512f, 14.3417f, 7.9512f, 14.6583f, 8.1465f, 14.8536f)
        curveTo(8.3417f, 15.0488f, 8.6583f, 15.0488f, 8.8535f, 14.8536f)
        lineTo(10.8536f, 12.8536f)
        lineTo(11.2071f, 12.5f)
        lineTo(10.8536f, 12.1464f)
        lineTo(8.8535f, 10.1464f)
        close()
    }
}
.build()
