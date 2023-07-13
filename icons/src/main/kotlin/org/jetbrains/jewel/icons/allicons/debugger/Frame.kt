package org.jetbrains.jewel.icons.allicons.debugger

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
import org.jetbrains.jewel.icons.allicons.DebuggerGroup

public val DebuggerGroup.Frame: IntellijIconData
    get() {
        if (_frame != null) {
            return _frame!!
        }
        _frame = IntellijIconData(name = "Frame",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { FrameComposable(it) })
        return _frame!!
    }

private var _frame: IntellijIconData? = null

private fun FrameComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Frame",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(2.0f, 13.1046f, 2.8954f, 14.0f, 4.0f, 14.0f)
        horizontalLineTo(10.0f)
        curveTo(11.1046f, 14.0f, 12.0f, 13.1046f, 12.0f, 12.0f)
        verticalLineTo(6.0f)
        curveTo(12.0f, 4.8954f, 11.1046f, 4.0f, 10.0f, 4.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 4.0f, 2.0f, 4.8954f, 2.0f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.0f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(3.0f, 12.5523f, 3.4477f, 13.0f, 4.0f, 13.0f)
        horizontalLineTo(10.0f)
        curveTo(10.5523f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
        verticalLineTo(6.0f)
        curveTo(11.0f, 5.4477f, 10.5523f, 5.0f, 10.0f, 5.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 5.0f, 3.0f, 5.4477f, 3.0f, 6.0f)
        close()
        moveTo(2.0f, 12.0f)
        verticalLineTo(6.0f)
        curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
        horizontalLineTo(10.0f)
        curveTo(11.1046f, 4.0f, 12.0f, 4.8954f, 12.0f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(12.0f, 13.1046f, 11.1046f, 14.0f, 10.0f, 14.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 14.0f, 2.0f, 13.1046f, 2.0f, 12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.0f, 2.5f)
        curveTo(5.0f, 2.2239f, 5.2239f, 2.0f, 5.5f, 2.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(10.5f)
        curveTo(14.0f, 10.7761f, 13.7761f, 11.0f, 13.5f, 11.0f)
        curveTo(13.2239f, 11.0f, 13.0f, 10.7761f, 13.0f, 10.5f)
        verticalLineTo(4.0f)
        curveTo(13.0f, 3.4477f, 12.5523f, 3.0f, 12.0f, 3.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 3.0f, 5.0f, 2.7761f, 5.0f, 2.5f)
        close()
    }
}
.build()
