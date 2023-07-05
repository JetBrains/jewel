package org.jetbrains.jewel.icons.allicons.objectbrowser

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
import org.jetbrains.jewel.icons.allicons.ObjectbrowserGroup

public val ObjectbrowserGroup.FlattenModules: IntellijIconData
    get() {
        if (_flattenModules != null) {
            return _flattenModules!!
        }
        _flattenModules = IntellijIconData(imageVector = { FlattenModulesComposable(it) })
        return _flattenModules!!
    }

private var _flattenModules: IntellijIconData? = null

private fun FlattenModulesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "FlattenModules", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 5.0f)
        lineTo(13.0f, 5.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 6.0f)
        lineTo(14.0f, 7.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 8.0f)
        lineTo(12.0f, 8.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 7.0f)
        lineTo(11.0f, 6.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 14.0f)
        curveTo(11.0f, 13.4477f, 11.4477f, 13.0f, 12.0f, 13.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 13.0f, 14.0f, 13.4477f, 14.0f, 14.0f)
        verticalLineTo(15.0f)
        curveTo(14.0f, 15.5523f, 13.5523f, 16.0f, 13.0f, 16.0f)
        horizontalLineTo(12.0f)
        curveTo(11.4477f, 16.0f, 11.0f, 15.5523f, 11.0f, 15.0f)
        verticalLineTo(14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.0f, 14.0f)
        verticalLineTo(10.0f)
        curveTo(5.0f, 9.4477f, 5.4477f, 9.0f, 6.0f, 9.0f)
        horizontalLineTo(8.5f)
        lineTo(9.5f, 10.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 10.0f, 13.0f, 10.4477f, 13.0f, 11.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(12.0f)
        curveTo(10.8954f, 12.0f, 10.0f, 12.8954f, 10.0f, 14.0f)
        verticalLineTo(15.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 15.0f, 5.0f, 14.5523f, 5.0f, 14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.0f, 6.0f)
        verticalLineTo(2.0f)
        curveTo(5.0f, 1.4477f, 5.4477f, 1.0f, 6.0f, 1.0f)
        horizontalLineTo(8.5f)
        lineTo(9.5f, 2.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(12.0f)
        curveTo(10.8954f, 4.0f, 10.0f, 4.8954f, 10.0f, 6.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 7.0f, 5.0f, 6.5523f, 5.0f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 1.5f)
        curveTo(3.0f, 1.2239f, 2.7761f, 1.0f, 2.5f, 1.0f)
        curveTo(2.2239f, 1.0f, 2.0f, 1.2239f, 2.0f, 1.5f)
        verticalLineTo(14.5f)
        curveTo(2.0f, 14.7761f, 2.2239f, 15.0f, 2.5f, 15.0f)
        curveTo(2.7761f, 15.0f, 3.0f, 14.7761f, 3.0f, 14.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(14.0f)
        curveTo(5.0f, 14.5523f, 5.4477f, 15.0f, 6.0f, 15.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(8.0858f)
        lineTo(9.0858f, 11.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(11.0f)
        curveTo(13.0f, 10.4477f, 12.5523f, 10.0f, 12.0f, 10.0f)
        horizontalLineTo(9.5f)
        lineTo(8.5f, 9.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 9.0f, 5.0f, 9.4477f, 5.0f, 10.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(6.0f)
        curveTo(5.0f, 6.5523f, 5.4477f, 7.0f, 6.0f, 7.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(2.0f)
        lineTo(8.0858f, 2.0f)
        lineTo(9.0858f, 3.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(3.0f)
        curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
        horizontalLineTo(9.5f)
        lineTo(8.5f, 1.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 1.0f, 5.0f, 1.4477f, 5.0f, 2.0f)
        verticalLineTo(3.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(1.5f)
        close()
    }
}
.build()
