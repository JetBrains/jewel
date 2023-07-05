package org.jetbrains.jewel.icons.allicons.objectbrowser

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

public val ObjectbrowserGroup.SortByVisibility: IntellijIconData
    get() {
        if (_sortByVisibility != null) {
            return _sortByVisibility!!
        }
        _sortByVisibility = IntellijIconData(imageVector = { SortByVisibilityComposable(it) })
        return _sortByVisibility!!
    }

private var _sortByVisibility: IntellijIconData? = null

private fun SortByVisibilityComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "SortByVisibility", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
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
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 6.0f)
        horizontalLineToRelative(4.0f)
        verticalLineToRelative(3.0f)
        horizontalLineToRelative(-4.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.0f, 5.0f)
        verticalLineTo(4.0f)
        curveTo(14.0f, 2.8954f, 13.1046f, 2.0f, 12.0f, 2.0f)
        curveTo(10.8954f, 2.0f, 10.0f, 2.8954f, 10.0f, 4.0f)
        verticalLineTo(5.0f)
        curveTo(9.4477f, 5.0f, 9.0f, 5.4477f, 9.0f, 6.0f)
        verticalLineTo(9.0f)
        curveTo(9.0f, 9.5523f, 9.4477f, 10.0f, 10.0f, 10.0f)
        horizontalLineTo(14.0f)
        curveTo(14.5523f, 10.0f, 15.0f, 9.5523f, 15.0f, 9.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 5.4477f, 14.5523f, 5.0f, 14.0f, 5.0f)
        close()
        moveTo(11.0f, 4.0f)
        curveTo(11.0f, 3.4477f, 11.4477f, 3.0f, 12.0f, 3.0f)
        curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(10.0f, 9.0f)
        lineTo(10.0f, 6.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(10.0f)
        close()
    }
}
.build()
