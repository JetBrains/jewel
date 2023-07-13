package org.jetbrains.jewel.icons.allicons.image

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
import org.jetbrains.jewel.icons.allicons.ImageGroup

public val ImageGroup.Grid: IntellijIconData
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = IntellijIconData(name = "Grid",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { GridComposable(it) })
        return _grid!!
    }

private var _grid: IntellijIconData? = null

private fun GridComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Grid",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.5f, 2.0f)
        lineTo(11.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 2.5f)
        lineTo(12.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 14.0f)
        lineTo(11.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 13.5f)
        lineTo(11.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 11.5f)
        lineTo(14.0f, 11.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 12.0f)
        lineTo(2.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 11.5f)
        lineTo(2.0f, 11.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 11.0f)
        lineTo(13.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 11.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.5f, 2.0f)
        lineTo(4.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 2.5f)
        lineTo(5.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 14.0f)
        lineTo(4.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 13.5f)
        lineTo(4.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 4.5f)
        lineTo(14.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 5.0f)
        lineTo(2.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 4.5f)
        lineTo(2.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 4.0f)
        lineTo(13.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 4.5f)
        close()
    }
}
.build()
