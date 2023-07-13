package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.ScrollUp: IntellijIconData
    get() {
        if (_scrollUp != null) {
            return _scrollUp!!
        }
        _scrollUp = IntellijIconData(name = "ScrollUp",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ScrollUpComposable(it) })
        return _scrollUp!!
    }

private var _scrollUp: IntellijIconData? = null

private fun ScrollUpComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ScrollUp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 3.0f)
        curveTo(1.2239f, 3.0f, 1.0f, 3.2239f, 1.0f, 3.5f)
        curveTo(1.0f, 3.7761f, 1.2239f, 4.0f, 1.5f, 4.0f)
        horizontalLineTo(14.5f)
        curveTo(14.7761f, 4.0f, 15.0f, 3.7761f, 15.0f, 3.5f)
        curveTo(15.0f, 3.2239f, 14.7761f, 3.0f, 14.5f, 3.0f)
        horizontalLineTo(1.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 7.5f)
        curveTo(1.2239f, 7.5f, 1.0f, 7.7239f, 1.0f, 8.0f)
        curveTo(1.0f, 8.2761f, 1.2239f, 8.5f, 1.5f, 8.5f)
        horizontalLineTo(5.5f)
        curveTo(5.7761f, 8.5f, 6.0f, 8.2761f, 6.0f, 8.0f)
        curveTo(6.0f, 7.7239f, 5.7761f, 7.5f, 5.5f, 7.5f)
        horizontalLineTo(1.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 12.0f)
        curveTo(1.2239f, 12.0f, 1.0f, 12.2239f, 1.0f, 12.5f)
        curveTo(1.0f, 12.7761f, 1.2239f, 13.0f, 1.5f, 13.0f)
        horizontalLineTo(5.5f)
        curveTo(5.7761f, 13.0f, 6.0f, 12.7761f, 6.0f, 12.5f)
        curveTo(6.0f, 12.2239f, 5.7761f, 12.0f, 5.5f, 12.0f)
        horizontalLineTo(1.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 12.5f)
        curveTo(11.0f, 12.7761f, 11.2239f, 13.0f, 11.5f, 13.0f)
        curveTo(11.7762f, 13.0f, 12.0f, 12.7761f, 12.0f, 12.5f)
        verticalLineTo(6.7071f)
        lineTo(14.1464f, 8.8535f)
        curveTo(14.3417f, 9.0488f, 14.6583f, 9.0488f, 14.8536f, 8.8535f)
        curveTo(15.0488f, 8.6583f, 15.0488f, 8.3417f, 14.8536f, 8.1464f)
        lineTo(11.8536f, 5.1465f)
        curveTo(11.6583f, 4.9512f, 11.3417f, 4.9512f, 11.1465f, 5.1464f)
        lineTo(8.1465f, 8.1464f)
        curveTo(7.9512f, 8.3417f, 7.9512f, 8.6583f, 8.1464f, 8.8535f)
        curveTo(8.3417f, 9.0488f, 8.6583f, 9.0488f, 8.8535f, 8.8535f)
        lineTo(11.0f, 6.7071f)
        verticalLineTo(12.5f)
        close()
    }
}
.build()
