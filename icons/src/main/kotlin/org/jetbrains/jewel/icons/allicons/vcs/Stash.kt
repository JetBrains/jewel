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

public val VcsGroup.Stash: IntellijIconData
    get() {
        if (_stash != null) {
            return _stash!!
        }
        _stash = IntellijIconData(imageVector = { StashComposable(it) })
        return _stash!!
    }

private var _stash: IntellijIconData? = null

private fun StashComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Stash",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.6465f, 5.1465f)
        curveTo(4.4512f, 5.3417f, 4.4512f, 5.6583f, 4.6465f, 5.8535f)
        lineTo(7.6465f, 8.8535f)
        curveTo(7.8417f, 9.0488f, 8.1583f, 9.0488f, 8.3535f, 8.8535f)
        lineTo(11.3536f, 5.8535f)
        curveTo(11.5488f, 5.6583f, 11.5488f, 5.3417f, 11.3536f, 5.1465f)
        curveTo(11.1583f, 4.9512f, 10.8417f, 4.9512f, 10.6464f, 5.1465f)
        lineTo(8.5f, 7.2929f)
        verticalLineTo(1.5f)
        curveTo(8.5f, 1.2239f, 8.2761f, 1.0f, 8.0f, 1.0f)
        curveTo(7.7239f, 1.0f, 7.5f, 1.2239f, 7.5f, 1.5f)
        verticalLineTo(7.2929f)
        lineTo(5.3535f, 5.1465f)
        curveTo(5.1583f, 4.9512f, 4.8417f, 4.9512f, 4.6465f, 5.1465f)
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
        moveTo(3.882f, 9.0f)
        lineTo(4.882f, 11.0f)
        horizontalLineTo(11.118f)
        lineTo(12.118f, 9.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(3.882f)
        close()
    }
}
.build()
