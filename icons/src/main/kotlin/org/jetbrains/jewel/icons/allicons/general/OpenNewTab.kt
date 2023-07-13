package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.OpenNewTab: IntellijIconData
    get() {
        if (_openNewTab != null) {
            return _openNewTab!!
        }
        _openNewTab = IntellijIconData(name = "OpenNewTab",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { OpenNewTabComposable(it) })
        return _openNewTab!!
    }

private var _openNewTab: IntellijIconData? = null

private fun OpenNewTabComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "OpenNewTab", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0f, 3.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 3.0f, 1.0f, 3.8954f, 1.0f, 5.0f)
        verticalLineTo(11.0f)
        curveTo(1.0f, 12.1046f, 1.8954f, 13.0f, 3.0f, 13.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 13.0f, 13.0f, 12.1046f, 13.0f, 11.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(11.0f)
        curveTo(12.0f, 11.5523f, 11.5523f, 12.0f, 11.0f, 12.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 12.0f, 2.0f, 11.5523f, 2.0f, 11.0f)
        verticalLineTo(5.0f)
        curveTo(2.0f, 4.4477f, 2.4477f, 4.0f, 3.0f, 4.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.5f, 0.0f)
        curveTo(12.2239f, 0.0f, 12.0f, 0.2239f, 12.0f, 0.5f)
        verticalLineTo(3.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 3.0f, 9.0f, 3.2239f, 9.0f, 3.5f)
        curveTo(9.0f, 3.7761f, 9.2239f, 4.0f, 9.5f, 4.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(6.5f)
        curveTo(12.0f, 6.7761f, 12.2239f, 7.0f, 12.5f, 7.0f)
        curveTo(12.7761f, 7.0f, 13.0f, 6.7761f, 13.0f, 6.5f)
        verticalLineTo(4.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 4.0f, 16.0f, 3.7761f, 16.0f, 3.5f)
        curveTo(16.0f, 3.2239f, 15.7761f, 3.0f, 15.5f, 3.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(0.5f)
        curveTo(13.0f, 0.2239f, 12.7761f, 0.0f, 12.5f, 0.0f)
        close()
    }
}
.build()
