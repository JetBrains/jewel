package org.jetbrains.jewel.icons.allicons.toolwindow

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

public val ToolwindowGroup.Todo: IntellijIconData
    get() {
        if (_todo != null) {
            return _todo!!
        }
        _todo = IntellijIconData(name = "Todo",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TodoComposable(it) })
        return _todo!!
    }

private var _todo: IntellijIconData? = null

private fun TodoComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Todo",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 4.5f)
        arcToRelative(0.7f, 0.7f, 0.0f, true, false, 1.4f, 0.0f)
        arcToRelative(0.7f, 0.7f, 0.0f, true, false, -1.4f, 0.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 8.0f)
        arcToRelative(0.7f, 0.7f, 0.0f, true, false, 1.4f, 0.0f)
        arcToRelative(0.7f, 0.7f, 0.0f, true, false, -1.4f, 0.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 11.5f)
        arcToRelative(0.7f, 0.7f, 0.0f, true, false, 1.4f, 0.0f)
        arcToRelative(0.7f, 0.7f, 0.0f, true, false, -1.4f, 0.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 4.0f)
        curveTo(5.2239f, 4.0f, 5.0f, 4.2239f, 5.0f, 4.5f)
        curveTo(5.0f, 4.7761f, 5.2239f, 5.0f, 5.5f, 5.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(13.5f, 5.0f)
        curveTo(13.7761f, 5.0f, 14.0f, 4.7761f, 14.0f, 4.5f)
        curveTo(14.0f, 4.2239f, 13.7761f, 4.0f, 13.5f, 4.0f)
        verticalLineTo(5.0f)
        close()
        moveTo(5.5f, 5.0f)
        horizontalLineTo(13.5f)
        verticalLineTo(4.0f)
        horizontalLineTo(5.5f)
        verticalLineTo(5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 11.0f)
        curveTo(5.2239f, 11.0f, 5.0f, 11.2239f, 5.0f, 11.5f)
        curveTo(5.0f, 11.7761f, 5.2239f, 12.0f, 5.5f, 12.0f)
        verticalLineTo(11.0f)
        close()
        moveTo(13.5f, 12.0f)
        curveTo(13.7761f, 12.0f, 14.0f, 11.7761f, 14.0f, 11.5f)
        curveTo(14.0f, 11.2239f, 13.7761f, 11.0f, 13.5f, 11.0f)
        verticalLineTo(12.0f)
        close()
        moveTo(5.5f, 12.0f)
        horizontalLineTo(13.5f)
        verticalLineTo(11.0f)
        horizontalLineTo(5.5f)
        verticalLineTo(12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 7.5f)
        curveTo(5.2239f, 7.5f, 5.0f, 7.7239f, 5.0f, 8.0f)
        curveTo(5.0f, 8.2761f, 5.2239f, 8.5f, 5.5f, 8.5f)
        verticalLineTo(7.5f)
        close()
        moveTo(13.5f, 8.5f)
        curveTo(13.7761f, 8.5f, 14.0f, 8.2761f, 14.0f, 8.0f)
        curveTo(14.0f, 7.7239f, 13.7761f, 7.5f, 13.5f, 7.5f)
        verticalLineTo(8.5f)
        close()
        moveTo(5.5f, 8.5f)
        horizontalLineTo(13.5f)
        verticalLineTo(7.5f)
        horizontalLineTo(5.5f)
        verticalLineTo(8.5f)
        close()
    }
}
.build()
