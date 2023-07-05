package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Include: IntellijIconData
    get() {
        if (_include != null) {
            return _include!!
        }
        _include = IntellijIconData(imageVector = { IncludeComposable(it) })
        return _include!!
    }

private var _include: IntellijIconData? = null

private fun IncludeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Include", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.5f, 9.0f)
        curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
        curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(15.5f)
        curveTo(13.0f, 15.7761f, 12.7761f, 16.0f, 12.5f, 16.0f)
        curveTo(12.2239f, 16.0f, 12.0f, 15.7761f, 12.0f, 15.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
        curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(9.5f)
        curveTo(12.0f, 9.2239f, 12.2239f, 9.0f, 12.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.5f, 9.0f)
        curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
        curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(15.5f)
        curveTo(13.0f, 15.7761f, 12.7761f, 16.0f, 12.5f, 16.0f)
        curveTo(12.2239f, 16.0f, 12.0f, 15.7761f, 12.0f, 15.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
        curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(9.5f)
        curveTo(12.0f, 9.2239f, 12.2239f, 9.0f, 12.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.0f, 8.0f)
        horizontalLineTo(12.5f)
        curveTo(11.6716f, 8.0f, 11.0f, 8.6716f, 11.0f, 9.5f)
        verticalLineTo(11.0f)
        horizontalLineTo(9.5f)
        curveTo(8.6716f, 11.0f, 8.0f, 11.6716f, 8.0f, 12.5f)
        verticalLineTo(15.0f)
        curveTo(4.134f, 15.0f, 1.0f, 11.866f, 1.0f, 8.0f)
        curveTo(1.0f, 4.134f, 4.134f, 1.0f, 8.0f, 1.0f)
        curveTo(11.866f, 1.0f, 15.0f, 4.134f, 15.0f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 14.0f)
        curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.3137f, 2.0f, 14.0f, 4.6863f, 14.0f, 8.0f)
        horizontalLineTo(15.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        verticalLineTo(14.0f)
        close()
    }
}
.build()
