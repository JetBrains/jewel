package org.jetbrains.jewel.icons.allicons.nodes

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

public val NodesGroup.Library: IntellijIconData
    get() {
        if (_library != null) {
            return _library!!
        }
        _library = IntellijIconData(imageVector = { LibraryComposable(it) })
        return _library!!
    }

private var _library: IntellijIconData? = null

private fun LibraryComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Library", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0f, 6.0f)
        horizontalLineTo(14.0f)
        curveTo(14.5523f, 6.0f, 15.0f, 6.4477f, 15.0f, 7.0f)
        verticalLineTo(13.0f)
        curveTo(15.0f, 13.5523f, 14.5523f, 14.0f, 14.0f, 14.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 14.0f, 2.0f, 13.5523f, 2.0f, 13.0f)
        verticalLineTo(5.0f)
        curveTo(2.0f, 4.4477f, 2.4477f, 4.0f, 3.0f, 4.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(3.0f)
        curveTo(6.0f, 2.4477f, 6.4477f, 2.0f, 7.0f, 2.0f)
        horizontalLineTo(10.0f)
        curveTo(10.5523f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(10.0f, 3.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(11.0f, 7.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(11.0f)
        close()
        moveTo(6.0f, 5.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(3.0f)
        lineTo(3.0f, 5.0f)
        horizontalLineTo(6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.0f, 3.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 13.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(11.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.0f, 13.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(6.0f)
        close()
    }
}
.build()
