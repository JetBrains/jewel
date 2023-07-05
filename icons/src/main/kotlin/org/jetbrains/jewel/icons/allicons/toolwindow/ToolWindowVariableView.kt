package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.ToolWindowVariableView: IntellijIconData
    get() {
        if (_toolWindowVariableView != null) {
            return _toolWindowVariableView!!
        }
        _toolWindowVariableView = IntellijIconData(imageVector = {
                ToolWindowVariableViewComposable(it) })
        return _toolWindowVariableView!!
    }

private var _toolWindowVariableView: IntellijIconData? = null

private fun ToolWindowVariableViewComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ToolWindowVariableView", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.0f, 3.0f)
        verticalLineTo(6.0f)
        curveTo(2.0f, 6.5523f, 2.4477f, 7.0f, 3.0f, 7.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 7.0f, 14.0f, 6.5523f, 14.0f, 6.0f)
        verticalLineTo(3.0f)
        curveTo(14.0f, 2.4477f, 13.5523f, 2.0f, 13.0f, 2.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 2.0f, 2.0f, 2.4477f, 2.0f, 3.0f)
        close()
        moveTo(3.0f, 6.0f)
        verticalLineTo(3.0f)
        horizontalLineTo(13.0f)
        lineTo(13.0f, 6.0f)
        horizontalLineTo(3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.0f, 10.0f)
        verticalLineTo(13.0f)
        curveTo(2.0f, 13.5523f, 2.4477f, 14.0f, 3.0f, 14.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 14.0f, 14.0f, 13.5523f, 14.0f, 13.0f)
        verticalLineTo(10.0f)
        curveTo(14.0f, 9.4477f, 13.5523f, 9.0f, 13.0f, 9.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 9.0f, 2.0f, 9.4477f, 2.0f, 10.0f)
        close()
        moveTo(3.0f, 13.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(13.0f)
        lineTo(13.0f, 13.0f)
        horizontalLineTo(3.0f)
        close()
    }
}
.build()
