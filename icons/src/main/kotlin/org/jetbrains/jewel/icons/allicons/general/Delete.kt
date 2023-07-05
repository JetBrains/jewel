package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Delete: IntellijIconData
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = IntellijIconData(imageVector = { DeleteComposable(it) })
        return _delete!!
    }

private var _delete: IntellijIconData? = null

private fun DeleteComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Delete", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0f, 2.0f)
        horizontalLineTo(9.0f)
        curveTo(9.5523f, 2.0f, 10.0f, 2.4477f, 10.0f, 3.0f)
        horizontalLineTo(6.0f)
        curveTo(6.0f, 2.4477f, 6.4477f, 2.0f, 7.0f, 2.0f)
        close()
        moveTo(5.0f, 3.0f)
        curveTo(5.0f, 1.8954f, 5.8954f, 1.0f, 7.0f, 1.0f)
        horizontalLineTo(9.0f)
        curveTo(10.1046f, 1.0f, 11.0f, 1.8954f, 11.0f, 3.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 3.0f, 14.0f, 3.4477f, 14.0f, 4.0f)
        verticalLineTo(5.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(13.0f)
        curveTo(13.0f, 14.1046f, 12.1046f, 15.0f, 11.0f, 15.0f)
        horizontalLineTo(5.0f)
        curveTo(3.8954f, 15.0f, 3.0f, 14.1046f, 3.0f, 13.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(2.0f)
        verticalLineTo(5.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
        horizontalLineTo(5.0f)
        close()
        moveTo(11.0f, 4.0f)
        horizontalLineTo(10.0f)
        horizontalLineTo(6.0f)
        horizontalLineTo(5.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(4.0f)
        horizontalLineTo(12.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(11.0f)
        close()
        moveTo(4.0f, 6.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(13.0f)
        curveTo(12.0f, 13.5523f, 11.5523f, 14.0f, 11.0f, 14.0f)
        horizontalLineTo(5.0f)
        curveTo(4.4477f, 14.0f, 4.0f, 13.5523f, 4.0f, 13.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(6.5f, 7.0f)
        curveTo(6.2239f, 7.0f, 6.0f, 7.2239f, 6.0f, 7.5f)
        verticalLineTo(11.5f)
        curveTo(6.0f, 11.7761f, 6.2239f, 12.0f, 6.5f, 12.0f)
        curveTo(6.7761f, 12.0f, 7.0f, 11.7761f, 7.0f, 11.5f)
        verticalLineTo(7.5f)
        curveTo(7.0f, 7.2239f, 6.7761f, 7.0f, 6.5f, 7.0f)
        close()
        moveTo(9.0f, 7.5f)
        curveTo(9.0f, 7.2239f, 9.2239f, 7.0f, 9.5f, 7.0f)
        curveTo(9.7761f, 7.0f, 10.0f, 7.2239f, 10.0f, 7.5f)
        verticalLineTo(11.5f)
        curveTo(10.0f, 11.7761f, 9.7761f, 12.0f, 9.5f, 12.0f)
        curveTo(9.2239f, 12.0f, 9.0f, 11.7761f, 9.0f, 11.5f)
        verticalLineTo(7.5f)
        close()
    }
}
.build()
