package org.jetbrains.jewel.icons.allicons.vcs

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val VcsGroup.Diff: IntellijIconData
    get() {
        if (_diff != null) {
            return _diff!!
        }
        _diff = IntellijIconData(imageVector = { DiffComposable(it) })
        return _diff!!
    }

private var _diff: IntellijIconData? = null

private fun DiffComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Diff",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.8535f, 8.1465f)
        curveTo(5.6583f, 7.9512f, 5.3417f, 7.9512f, 5.1465f, 8.1465f)
        curveTo(4.9512f, 8.3417f, 4.9512f, 8.6583f, 5.1465f, 8.8535f)
        lineTo(7.2929f, 11.0f)
        horizontalLineTo(0.5f)
        curveTo(0.2239f, 11.0f, 0.0f, 11.2239f, 0.0f, 11.5f)
        curveTo(0.0f, 11.7761f, 0.2239f, 12.0f, 0.5f, 12.0f)
        horizontalLineTo(7.2929f)
        lineTo(5.1465f, 14.1464f)
        curveTo(4.9512f, 14.3417f, 4.9512f, 14.6583f, 5.1465f, 14.8536f)
        curveTo(5.3417f, 15.0488f, 5.6583f, 15.0488f, 5.8535f, 14.8536f)
        lineTo(8.8535f, 11.8536f)
        lineTo(9.2071f, 11.5f)
        lineTo(8.8535f, 11.1464f)
        lineTo(5.8535f, 8.1465f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.1464f, 1.1465f)
        curveTo(10.3417f, 0.9512f, 10.6583f, 0.9512f, 10.8536f, 1.1465f)
        curveTo(11.0488f, 1.3417f, 11.0488f, 1.6583f, 10.8536f, 1.8535f)
        lineTo(8.7071f, 4.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 4.0f, 16.0f, 4.2239f, 16.0f, 4.5f)
        curveTo(16.0f, 4.7761f, 15.7761f, 5.0f, 15.5f, 5.0f)
        horizontalLineTo(8.7071f)
        lineTo(10.8536f, 7.1465f)
        curveTo(11.0488f, 7.3417f, 11.0488f, 7.6583f, 10.8536f, 7.8535f)
        curveTo(10.6583f, 8.0488f, 10.3417f, 8.0488f, 10.1464f, 7.8535f)
        lineTo(7.1465f, 4.8535f)
        lineTo(6.7929f, 4.5f)
        lineTo(7.1465f, 4.1465f)
        lineTo(10.1464f, 1.1465f)
        close()
    }
}
.build()
