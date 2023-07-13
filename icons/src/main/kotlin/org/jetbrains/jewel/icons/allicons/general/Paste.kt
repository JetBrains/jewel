package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Paste: IntellijIconData
    get() {
        if (_paste != null) {
            return _paste!!
        }
        _paste = IntellijIconData(name = "Paste",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { PasteComposable(it) })
        return _paste!!
    }

private var _paste: IntellijIconData? = null

private fun PasteComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Paste",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 6.0f)
        curveTo(5.2239f, 6.0f, 5.0f, 6.2239f, 5.0f, 6.5f)
        curveTo(5.0f, 6.7761f, 5.2239f, 7.0f, 5.5f, 7.0f)
        horizontalLineTo(10.5f)
        curveTo(10.7761f, 7.0f, 11.0f, 6.7761f, 11.0f, 6.5f)
        curveTo(11.0f, 6.2239f, 10.7761f, 6.0f, 10.5f, 6.0f)
        horizontalLineTo(5.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.0f, 8.5f)
        curveTo(5.0f, 8.2239f, 5.2239f, 8.0f, 5.5f, 8.0f)
        horizontalLineTo(10.5f)
        curveTo(10.7761f, 8.0f, 11.0f, 8.2239f, 11.0f, 8.5f)
        curveTo(11.0f, 8.7761f, 10.7761f, 9.0f, 10.5f, 9.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 9.0f, 5.0f, 8.7761f, 5.0f, 8.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 10.0f)
        curveTo(5.2239f, 10.0f, 5.0f, 10.2239f, 5.0f, 10.5f)
        curveTo(5.0f, 10.7761f, 5.2239f, 11.0f, 5.5f, 11.0f)
        horizontalLineTo(10.5f)
        curveTo(10.7761f, 11.0f, 11.0f, 10.7761f, 11.0f, 10.5f)
        curveTo(11.0f, 10.2239f, 10.7761f, 10.0f, 10.5f, 10.0f)
        horizontalLineTo(5.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.0f, 2.0f)
        horizontalLineTo(10.9146f)
        curveTo(10.7087f, 1.4174f, 10.1531f, 1.0f, 9.5f, 1.0f)
        horizontalLineTo(6.5f)
        curveTo(5.8469f, 1.0f, 5.2913f, 1.4174f, 5.0854f, 2.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 2.0f, 2.0f, 2.8954f, 2.0f, 4.0f)
        verticalLineTo(13.0f)
        curveTo(2.0f, 14.1046f, 2.8954f, 15.0f, 4.0f, 15.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 15.0f, 14.0f, 14.1046f, 14.0f, 13.0f)
        verticalLineTo(4.0f)
        curveTo(14.0f, 2.8954f, 13.1046f, 2.0f, 12.0f, 2.0f)
        close()
        moveTo(4.0f, 3.0f)
        horizontalLineTo(5.0854f)
        curveTo(5.2913f, 3.5826f, 5.8469f, 4.0f, 6.5f, 4.0f)
        horizontalLineTo(9.5f)
        curveTo(10.1531f, 4.0f, 10.7087f, 3.5826f, 10.9146f, 3.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
        verticalLineTo(13.0f)
        curveTo(13.0f, 13.5523f, 12.5523f, 14.0f, 12.0f, 14.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 14.0f, 3.0f, 13.5523f, 3.0f, 13.0f)
        verticalLineTo(4.0f)
        curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
        close()
        moveTo(6.5f, 2.0f)
        curveTo(6.2239f, 2.0f, 6.0f, 2.2239f, 6.0f, 2.5f)
        curveTo(6.0f, 2.7761f, 6.2239f, 3.0f, 6.5f, 3.0f)
        horizontalLineTo(9.5f)
        curveTo(9.7761f, 3.0f, 10.0f, 2.7761f, 10.0f, 2.5f)
        curveTo(10.0f, 2.2239f, 9.7761f, 2.0f, 9.5f, 2.0f)
        horizontalLineTo(6.5f)
        close()
    }
}
.build()
