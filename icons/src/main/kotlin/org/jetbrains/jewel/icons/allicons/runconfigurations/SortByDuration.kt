package org.jetbrains.jewel.icons.allicons.runconfigurations

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
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.SortByDuration: IntellijIconData
    get() {
        if (_sortByDuration != null) {
            return _sortByDuration!!
        }
        _sortByDuration = IntellijIconData(name = "SortByDuration",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { SortByDurationComposable(it) })
        return _sortByDuration!!
    }

private var _sortByDuration: IntellijIconData? = null

private fun SortByDurationComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SortByDuration", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 3.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 8.0f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 12.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.8535f, 9.8535f)
        curveTo(8.0488f, 9.6583f, 8.0488f, 9.3417f, 7.8535f, 9.1465f)
        curveTo(7.6583f, 8.9512f, 7.3417f, 8.9512f, 7.1465f, 9.1465f)
        lineTo(5.0f, 11.2929f)
        lineTo(5.0f, 3.5f)
        curveTo(5.0f, 3.2239f, 4.7762f, 3.0f, 4.5f, 3.0f)
        curveTo(4.2239f, 3.0f, 4.0f, 3.2239f, 4.0f, 3.5f)
        lineTo(4.0f, 11.2929f)
        lineTo(1.8535f, 9.1465f)
        curveTo(1.6583f, 8.9512f, 1.3417f, 8.9512f, 1.1465f, 9.1465f)
        curveTo(0.9512f, 9.3417f, 0.9512f, 9.6583f, 1.1465f, 9.8535f)
        lineTo(4.1464f, 12.8536f)
        curveTo(4.2369f, 12.944f, 4.3619f, 13.0f, 4.5f, 13.0f)
        curveTo(4.6389f, 13.0f, 4.7645f, 12.9434f, 4.8551f, 12.852f)
        lineTo(7.8535f, 9.8535f)
        close()
    }
}
.build()
