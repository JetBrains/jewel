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

public val ActionsGroup.MoveToBottomRight: IntellijIconData
    get() {
        if (_moveToBottomRight != null) {
            return _moveToBottomRight!!
        }
        _moveToBottomRight = IntellijIconData(name = "MoveToBottomRight",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { MoveToBottomRightComposable(it) })
        return _moveToBottomRight!!
    }

private var _moveToBottomRight: IntellijIconData? = null

private fun MoveToBottomRightComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "MoveToBottomRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
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
        verticalLineTo(9.0f)
        horizontalLineTo(8.0f)
        curveTo(7.4477f, 9.0f, 7.0f, 9.4477f, 7.0f, 10.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
        close()
        moveTo(8.0f, 13.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(13.0f)
        close()
    }
}
.build()
