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

public val ActionsGroup.InSelection: IntellijIconData
    get() {
        if (_inSelection != null) {
            return _inSelection!!
        }
        _inSelection = IntellijIconData(imageVector = { InSelectionComposable(it) })
        return _inSelection!!
    }

private var _inSelection: IntellijIconData? = null

private fun InSelectionComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "InSelection", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.5f, 3.0f)
        curveTo(2.2239f, 3.0f, 2.0f, 3.2239f, 2.0f, 3.5f)
        curveTo(2.0f, 3.7761f, 2.2239f, 4.0f, 2.5f, 4.0f)
        horizontalLineTo(13.5f)
        curveTo(13.7761f, 4.0f, 14.0f, 3.7761f, 14.0f, 3.5f)
        curveTo(14.0f, 3.2239f, 13.7761f, 3.0f, 13.5f, 3.0f)
        horizontalLineTo(2.5f)
        close()
        moveTo(2.5f, 6.0f)
        curveTo(2.2239f, 6.0f, 2.0f, 6.2239f, 2.0f, 6.5f)
        curveTo(2.0f, 6.7761f, 2.2239f, 7.0f, 2.5f, 7.0f)
        horizontalLineTo(9.5f)
        curveTo(9.7761f, 7.0f, 10.0f, 6.7761f, 10.0f, 6.5f)
        curveTo(10.0f, 6.2239f, 9.7761f, 6.0f, 9.5f, 6.0f)
        horizontalLineTo(2.5f)
        close()
        moveTo(2.5f, 12.0f)
        curveTo(2.2239f, 12.0f, 2.0f, 12.2239f, 2.0f, 12.5f)
        curveTo(2.0f, 12.7761f, 2.2239f, 13.0f, 2.5f, 13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.7761f, 13.0f, 10.0f, 12.7761f, 10.0f, 12.5f)
        curveTo(10.0f, 12.2239f, 9.7761f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(2.5f)
        close()
        moveTo(2.0f, 9.5f)
        curveTo(2.0f, 9.2239f, 2.2239f, 9.0f, 2.5f, 9.0f)
        horizontalLineTo(9.5f)
        curveTo(9.7761f, 9.0f, 10.0f, 9.2239f, 10.0f, 9.5f)
        curveTo(10.0f, 9.7761f, 9.7761f, 10.0f, 9.5f, 10.0f)
        horizontalLineTo(2.5f)
        curveTo(2.2239f, 10.0f, 2.0f, 9.7761f, 2.0f, 9.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.5f, 15.0f)
        lineTo(15.5f, 15.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 15.5f)
        lineTo(16.0f, 15.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 16.0f)
        lineTo(14.5f, 16.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 15.5f)
        lineTo(14.0f, 15.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 15.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.5f, 15.0f)
        lineTo(12.5f, 15.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 15.5f)
        lineTo(13.0f, 15.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 16.0f)
        lineTo(11.5f, 16.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 15.5f)
        lineTo(11.0f, 15.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 15.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.5f, 8.0f)
        lineTo(15.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 8.5f)
        lineTo(16.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 9.0f)
        lineTo(14.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 8.5f)
        lineTo(14.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.5f, 8.0f)
        lineTo(12.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 8.5f)
        lineTo(13.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 9.0f)
        lineTo(11.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 8.5f)
        lineTo(11.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.0f, 9.5f)
        curveTo(13.0f, 9.2239f, 13.2239f, 9.0f, 13.5f, 9.0f)
        verticalLineTo(9.0f)
        curveTo(13.7761f, 9.0f, 14.0f, 9.2239f, 14.0f, 9.5f)
        verticalLineTo(14.5f)
        curveTo(14.0f, 14.7761f, 13.7761f, 15.0f, 13.5f, 15.0f)
        verticalLineTo(15.0f)
        curveTo(13.2239f, 15.0f, 13.0f, 14.7761f, 13.0f, 14.5f)
        verticalLineTo(9.5f)
        close()
    }
}
.build()
