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

public val GeneralGroup.Print: IntellijIconData
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = IntellijIconData(name = "Print",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { PrintComposable(it) })
        return _print!!
    }

private var _print: IntellijIconData? = null

private fun PrintComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Print",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 7.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(4.5f, 2.0f)
        curveTo(4.2239f, 2.0f, 4.0f, 2.2239f, 4.0f, 2.5f)
        verticalLineTo(5.0f)
        horizontalLineTo(3.5f)
        curveTo(2.1193f, 5.0f, 1.0f, 6.1193f, 1.0f, 7.5f)
        verticalLineTo(12.5f)
        curveTo(1.0f, 12.7761f, 1.2239f, 13.0f, 1.5f, 13.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(13.5f)
        curveTo(4.0f, 13.7761f, 4.2239f, 14.0f, 4.5f, 14.0f)
        horizontalLineTo(11.5f)
        curveTo(11.7761f, 14.0f, 12.0f, 13.7761f, 12.0f, 13.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(14.5f)
        curveTo(14.7761f, 13.0f, 15.0f, 12.7761f, 15.0f, 12.5f)
        verticalLineTo(7.5f)
        curveTo(15.0f, 6.1193f, 13.8807f, 5.0f, 12.5f, 5.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(2.5f)
        curveTo(12.0f, 2.2239f, 11.7761f, 2.0f, 11.5f, 2.0f)
        horizontalLineTo(4.5f)
        close()
        moveTo(11.0f, 5.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(3.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(5.0f)
        close()
        moveTo(11.0f, 13.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(13.0f)
        close()
        moveTo(12.0f, 9.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(7.5f)
        curveTo(14.0f, 6.6716f, 13.3284f, 6.0f, 12.5f, 6.0f)
        horizontalLineTo(3.5f)
        curveTo(2.6716f, 6.0f, 2.0f, 6.6716f, 2.0f, 7.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(12.0f)
        close()
    }
}
.build()
