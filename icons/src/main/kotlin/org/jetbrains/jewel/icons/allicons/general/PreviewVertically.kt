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

public val GeneralGroup.PreviewVertically: IntellijIconData
    get() {
        if (_previewVertically != null) {
            return _previewVertically!!
        }
        _previewVertically = IntellijIconData(name = "PreviewVertically",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { PreviewVerticallyComposable(it) })
        return _previewVertically!!
    }

private var _previewVertically: IntellijIconData? = null

private fun PreviewVerticallyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "PreviewVertically", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0f, 3.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(6.0f, 2.0f)
        horizontalLineTo(7.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
        horizontalLineTo(7.0f)
        horizontalLineTo(6.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 14.0f, 2.0f, 13.1046f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(6.0f)
        close()
        moveTo(6.0f, 13.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.5f, 5.0f)
        lineTo(11.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 5.5f)
        lineTo(12.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 6.0f)
        lineTo(8.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 5.5f)
        lineTo(8.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.5f, 7.5f)
        lineTo(11.5f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 8.0f)
        lineTo(12.0f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 8.5f)
        lineTo(8.5f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 8.0f)
        lineTo(8.0f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 7.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.5f, 10.0f)
        lineTo(11.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 10.5f)
        lineTo(12.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 11.0f)
        lineTo(8.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 10.5f)
        lineTo(8.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 10.0f)
        close()
    }
}
.build()
