package org.jetbrains.jewel.icons.allicons.objectbrowser

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
import org.jetbrains.jewel.icons.allicons.ObjectbrowserGroup

public val ObjectbrowserGroup.SortByType: IntellijIconData
    get() {
        if (_sortByType != null) {
            return _sortByType!!
        }
        _sortByType = IntellijIconData(imageVector = { SortByTypeComposable(it) })
        return _sortByType!!
    }

private var _sortByType: IntellijIconData? = null

private fun SortByTypeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SortByType", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.8536f, 10.8536f)
        curveTo(8.0488f, 10.6583f, 8.0488f, 10.3417f, 7.8536f, 10.1464f)
        curveTo(7.6583f, 9.9512f, 7.3417f, 9.9512f, 7.1465f, 10.1464f)
        lineTo(5.0f, 12.2929f)
        lineTo(5.0f, 2.5f)
        curveTo(5.0f, 2.2239f, 4.7761f, 2.0f, 4.5f, 2.0f)
        curveTo(4.2239f, 2.0f, 4.0f, 2.2239f, 4.0f, 2.5f)
        lineTo(4.0f, 12.2929f)
        lineTo(1.8536f, 10.1464f)
        curveTo(1.6583f, 9.9512f, 1.3417f, 9.9512f, 1.1465f, 10.1464f)
        curveTo(0.9512f, 10.3417f, 0.9512f, 10.6583f, 1.1465f, 10.8536f)
        lineTo(4.1465f, 13.8536f)
        curveTo(4.3417f, 14.0488f, 4.6583f, 14.0488f, 4.8536f, 13.8536f)
        lineTo(7.8536f, 10.8536f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 2.5f)
        horizontalLineTo(14.0f)
        curveTo(14.2761f, 2.5f, 14.5f, 2.7239f, 14.5f, 3.0f)
        verticalLineTo(5.0f)
        curveTo(14.5f, 5.2761f, 14.2761f, 5.5f, 14.0f, 5.5f)
        horizontalLineTo(11.0f)
        curveTo(10.7239f, 5.5f, 10.5f, 5.2761f, 10.5f, 5.0f)
        verticalLineTo(3.0f)
        curveTo(10.5f, 2.7239f, 10.7239f, 2.5f, 11.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 7.5f)
        horizontalLineTo(14.0f)
        curveTo(14.2761f, 7.5f, 14.5f, 7.7239f, 14.5f, 8.0f)
        verticalLineTo(10.0f)
        curveTo(14.5f, 10.2761f, 14.2761f, 10.5f, 14.0f, 10.5f)
        horizontalLineTo(11.0f)
        curveTo(10.7239f, 10.5f, 10.5f, 10.2761f, 10.5f, 10.0f)
        verticalLineTo(8.0f)
        curveTo(10.5f, 7.7239f, 10.7239f, 7.5f, 11.0f, 7.5f)
        close()
    }
}
.build()
