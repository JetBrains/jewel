package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.Unshelve: IntellijIconData
    get() {
        if (_unshelve != null) {
            return _unshelve!!
        }
        _unshelve = IntellijIconData(imageVector = { UnshelveComposable(it) })
        return _unshelve!!
    }

private var _unshelve: IntellijIconData? = null

private fun UnshelveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Unshelve", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.3536f, 4.8535f)
        curveTo(11.5488f, 4.6583f, 11.5488f, 4.3417f, 11.3536f, 4.1465f)
        lineTo(8.3535f, 1.1465f)
        curveTo(8.1583f, 0.9512f, 7.8417f, 0.9512f, 7.6465f, 1.1465f)
        lineTo(4.6465f, 4.1465f)
        curveTo(4.4512f, 4.3417f, 4.4512f, 4.6583f, 4.6465f, 4.8535f)
        curveTo(4.8417f, 5.0488f, 5.1583f, 5.0488f, 5.3535f, 4.8535f)
        lineTo(7.5f, 2.7071f)
        lineTo(7.5f, 8.5f)
        curveTo(7.5f, 8.7761f, 7.7239f, 9.0f, 8.0f, 9.0f)
        curveTo(8.2761f, 9.0f, 8.5f, 8.7761f, 8.5f, 8.5f)
        verticalLineTo(2.7071f)
        lineTo(10.6464f, 4.8535f)
        curveTo(10.8417f, 5.0488f, 11.1583f, 5.0488f, 11.3536f, 4.8535f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(4.7764f, 8.5528f)
        lineTo(5.5f, 10.0f)
        horizontalLineTo(10.5f)
        lineTo(11.2236f, 8.5528f)
        curveTo(11.393f, 8.214f, 11.7393f, 8.0f, 12.118f, 8.0f)
        horizontalLineTo(14.0f)
        curveTo(14.5523f, 8.0f, 15.0f, 8.4477f, 15.0f, 9.0f)
        verticalLineTo(13.0f)
        curveTo(15.0f, 13.5523f, 14.5523f, 14.0f, 14.0f, 14.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 14.0f, 1.0f, 13.5523f, 1.0f, 13.0f)
        verticalLineTo(9.0f)
        curveTo(1.0f, 8.4477f, 1.4477f, 8.0f, 2.0f, 8.0f)
        horizontalLineTo(3.882f)
        curveTo(4.2607f, 8.0f, 4.607f, 8.214f, 4.7764f, 8.5528f)
        close()
        moveTo(4.6056f, 10.4472f)
        curveTo(4.775f, 10.786f, 5.1212f, 11.0f, 5.5f, 11.0f)
        horizontalLineTo(10.5f)
        curveTo(10.8788f, 11.0f, 11.225f, 10.786f, 11.3944f, 10.4472f)
        lineTo(12.118f, 9.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(3.882f)
        lineTo(4.6056f, 10.4472f)
        close()
    }
}
.build()
