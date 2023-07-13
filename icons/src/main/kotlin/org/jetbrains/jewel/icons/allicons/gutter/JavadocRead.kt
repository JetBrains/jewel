package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.JavadocRead: IntellijIconData
    get() {
        if (_javadocRead != null) {
            return _javadocRead!!
        }
        _javadocRead = IntellijIconData(name = "JavadocRead",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { JavadocReadComposable(it) })
        return _javadocRead!!
    }

private var _javadocRead: IntellijIconData? = null

private fun JavadocReadComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "JavadocRead", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 2.5f)
        curveTo(1.0f, 2.2239f, 1.2239f, 2.0f, 1.5f, 2.0f)
        curveTo(1.7761f, 2.0f, 2.0f, 2.2239f, 2.0f, 2.5f)
        verticalLineTo(11.5f)
        curveTo(2.0f, 11.7761f, 1.7761f, 12.0f, 1.5f, 12.0f)
        curveTo(1.2239f, 12.0f, 1.0f, 11.7761f, 1.0f, 11.5f)
        verticalLineTo(2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 3.5f)
        curveTo(3.0f, 3.2239f, 3.2239f, 3.0f, 3.5f, 3.0f)
        horizontalLineTo(12.5f)
        curveTo(12.7761f, 3.0f, 13.0f, 3.2239f, 13.0f, 3.5f)
        curveTo(13.0f, 3.7761f, 12.7761f, 4.0f, 12.5f, 4.0f)
        horizontalLineTo(3.5f)
        curveTo(3.2239f, 4.0f, 3.0f, 3.7761f, 3.0f, 3.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 6.5f)
        curveTo(3.0f, 6.2239f, 3.2239f, 6.0f, 3.5f, 6.0f)
        horizontalLineTo(12.5f)
        curveTo(12.7761f, 6.0f, 13.0f, 6.2239f, 13.0f, 6.5f)
        curveTo(13.0f, 6.7761f, 12.7761f, 7.0f, 12.5f, 7.0f)
        horizontalLineTo(3.5f)
        curveTo(3.2239f, 7.0f, 3.0f, 6.7761f, 3.0f, 6.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 9.5f)
        curveTo(3.0f, 9.2239f, 3.2239f, 9.0f, 3.5f, 9.0f)
        horizontalLineTo(8.5f)
        curveTo(8.7761f, 9.0f, 9.0f, 9.2239f, 9.0f, 9.5f)
        curveTo(9.0f, 9.7761f, 8.7761f, 10.0f, 8.5f, 10.0f)
        horizontalLineTo(3.5f)
        curveTo(3.2239f, 10.0f, 3.0f, 9.7761f, 3.0f, 9.5f)
        close()
    }
}
.build()
