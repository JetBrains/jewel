package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.MoveToLeftBottom: IntellijIconData
    get() {
        if (_moveToLeftBottom != null) {
            return _moveToLeftBottom!!
        }
        _moveToLeftBottom = IntellijIconData(name = "MoveToLeftBottom",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { MoveToLeftBottomComposable(it) })
        return _moveToLeftBottom!!
    }

private var _moveToLeftBottom: IntellijIconData? = null

private fun MoveToLeftBottomComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "MoveToLeftBottom", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.0f, 4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 14.0f, 2.0f, 13.1046f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(4.0f, 3.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(8.0f)
        curveTo(7.0f, 7.4477f, 6.5523f, 7.0f, 6.0f, 7.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(4.0f)
        curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
        close()
        moveTo(3.0f, 8.0f)
        verticalLineTo(12.0f)
        curveTo(3.0f, 12.5178f, 3.3935f, 12.9436f, 3.8978f, 12.9948f)
        curveTo(3.9293f, 12.998f, 3.9612f, 12.9998f, 3.9935f, 13.0f)
        curveTo(3.9957f, 13.0f, 3.9978f, 13.0f, 4.0f, 13.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(3.0f)
        close()
    }
}
.build()
