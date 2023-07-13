package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.DiffWithClipboard: IntellijIconData
    get() {
        if (_diffWithClipboard != null) {
            return _diffWithClipboard!!
        }
        _diffWithClipboard = IntellijIconData(name = "DiffWithClipboard",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { DiffWithClipboardComposable(it) })
        return _diffWithClipboard!!
    }

private var _diffWithClipboard: IntellijIconData? = null

private fun DiffWithClipboardComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "DiffWithClipboard", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 15.5f)
        lineTo(10.5f, 13.5f)
        lineTo(8.5f, 11.5f)
        moveTo(5.5f, 13.5f)
        horizontalLineTo(10.0f)
        moveTo(12.5f, 11.5f)
        lineTo(10.5f, 9.5f)
        lineTo(12.5f, 7.5f)
        moveTo(15.5f, 9.5f)
        horizontalLineTo(11.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.9146f, 2.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(7.4889f)
        curveTo(13.9972f, 7.1087f, 13.8508f, 6.7294f, 13.5607f, 6.4393f)
        curveTo(13.3969f, 6.2756f, 13.2047f, 6.1576f, 13.0f, 6.0854f)
        verticalLineTo(4.0f)
        curveTo(13.0f, 3.4477f, 12.5523f, 3.0f, 12.0f, 3.0f)
        horizontalLineTo(10.9146f)
        curveTo(10.7087f, 3.5826f, 10.1531f, 4.0f, 9.5f, 4.0f)
        horizontalLineTo(6.5f)
        curveTo(5.8469f, 4.0f, 5.2913f, 3.5826f, 5.0854f, 3.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
        verticalLineTo(13.0f)
        curveTo(3.0f, 13.5523f, 3.4477f, 14.0f, 4.0f, 14.0f)
        verticalLineTo(15.0f)
        curveTo(2.8954f, 15.0f, 2.0f, 14.1046f, 2.0f, 13.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(5.0854f)
        curveTo(5.2913f, 1.4174f, 5.8469f, 1.0f, 6.5f, 1.0f)
        horizontalLineTo(9.5f)
        curveTo(10.1531f, 1.0f, 10.7087f, 1.4174f, 10.9146f, 2.0f)
        close()
        moveTo(6.0f, 2.5f)
        curveTo(6.0f, 2.2239f, 6.2239f, 2.0f, 6.5f, 2.0f)
        horizontalLineTo(9.5f)
        curveTo(9.7761f, 2.0f, 10.0f, 2.2239f, 10.0f, 2.5f)
        curveTo(10.0f, 2.7761f, 9.7761f, 3.0f, 9.5f, 3.0f)
        horizontalLineTo(6.5f)
        curveTo(6.2239f, 3.0f, 6.0f, 2.7761f, 6.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.8787f, 10.0f)
        lineTo(7.4394f, 10.4393f)
        curveTo(7.2756f, 10.6031f, 7.1577f, 10.7953f, 7.0855f, 11.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 11.0f, 5.0f, 10.7761f, 5.0f, 10.5f)
        curveTo(5.0f, 10.2239f, 5.2239f, 10.0f, 5.5f, 10.0f)
        horizontalLineTo(7.8787f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.8787f, 8.0f)
        lineTo(8.8787f, 9.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 9.0f, 5.0f, 8.7761f, 5.0f, 8.5f)
        curveTo(5.0f, 8.2239f, 5.2239f, 8.0f, 5.5f, 8.0f)
        horizontalLineTo(9.8787f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.0f, 6.5f)
        curveTo(5.0f, 6.2239f, 5.2239f, 6.0f, 5.5f, 6.0f)
        horizontalLineTo(10.5f)
        curveTo(10.7761f, 6.0f, 11.0f, 6.2239f, 11.0f, 6.5f)
        curveTo(11.0f, 6.7761f, 10.7761f, 7.0f, 10.5f, 7.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 7.0f, 5.0f, 6.7761f, 5.0f, 6.5f)
        close()
    }
}
.build()
