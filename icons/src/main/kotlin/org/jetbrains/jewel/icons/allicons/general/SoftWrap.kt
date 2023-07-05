package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.SoftWrap: IntellijIconData
    get() {
        if (_softWrap != null) {
            return _softWrap!!
        }
        _softWrap = IntellijIconData(imageVector = { SoftWrapComposable(it) })
        return _softWrap!!
    }

private var _softWrap: IntellijIconData? = null

private fun SoftWrapComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SoftWrap", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 3.0f)
        curveTo(1.2239f, 3.0f, 1.0f, 3.2239f, 1.0f, 3.5f)
        curveTo(1.0f, 3.7761f, 1.2239f, 4.0f, 1.5f, 4.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(14.5f, 4.0f)
        curveTo(14.7761f, 4.0f, 15.0f, 3.7761f, 15.0f, 3.5f)
        curveTo(15.0f, 3.2239f, 14.7761f, 3.0f, 14.5f, 3.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(1.5f, 7.5f)
        curveTo(1.2239f, 7.5f, 1.0f, 7.7239f, 1.0f, 8.0f)
        curveTo(1.0f, 8.2761f, 1.2239f, 8.5f, 1.5f, 8.5f)
        verticalLineTo(7.5f)
        close()
        moveTo(8.5f, 12.5f)
        lineTo(8.1465f, 12.1464f)
        lineTo(7.7929f, 12.5f)
        lineTo(8.1465f, 12.8536f)
        lineTo(8.5f, 12.5f)
        close()
        moveTo(10.8536f, 10.8536f)
        curveTo(11.0488f, 10.6583f, 11.0488f, 10.3417f, 10.8536f, 10.1464f)
        curveTo(10.6583f, 9.9512f, 10.3417f, 9.9512f, 10.1464f, 10.1464f)
        lineTo(10.8536f, 10.8536f)
        close()
        moveTo(10.1464f, 14.8536f)
        curveTo(10.3417f, 15.0488f, 10.6583f, 15.0488f, 10.8536f, 14.8536f)
        curveTo(11.0488f, 14.6583f, 11.0488f, 14.3417f, 10.8536f, 14.1464f)
        lineTo(10.1464f, 14.8536f)
        close()
        moveTo(1.5f, 12.0f)
        curveTo(1.2239f, 12.0f, 1.0f, 12.2239f, 1.0f, 12.5f)
        curveTo(1.0f, 12.7761f, 1.2239f, 13.0f, 1.5f, 13.0f)
        verticalLineTo(12.0f)
        close()
        moveTo(5.5f, 13.0f)
        curveTo(5.7761f, 13.0f, 6.0f, 12.7761f, 6.0f, 12.5f)
        curveTo(6.0f, 12.2239f, 5.7761f, 12.0f, 5.5f, 12.0f)
        verticalLineTo(13.0f)
        close()
        moveTo(1.5f, 4.0f)
        horizontalLineTo(14.5f)
        verticalLineTo(3.0f)
        horizontalLineTo(1.5f)
        verticalLineTo(4.0f)
        close()
        moveTo(1.5f, 8.5f)
        horizontalLineTo(12.25f)
        verticalLineTo(7.5f)
        horizontalLineTo(1.5f)
        verticalLineTo(8.5f)
        close()
        moveTo(12.25f, 12.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(12.25f)
        verticalLineTo(12.0f)
        close()
        moveTo(8.8535f, 12.8536f)
        lineTo(10.8536f, 10.8536f)
        lineTo(10.1464f, 10.1464f)
        lineTo(8.1465f, 12.1464f)
        lineTo(8.8535f, 12.8536f)
        close()
        moveTo(8.1465f, 12.8536f)
        lineTo(10.1464f, 14.8536f)
        lineTo(10.8536f, 14.1464f)
        lineTo(8.8535f, 12.1464f)
        lineTo(8.1465f, 12.8536f)
        close()
        moveTo(1.5f, 13.0f)
        horizontalLineTo(5.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(1.5f)
        verticalLineTo(13.0f)
        close()
        moveTo(12.25f, 13.0f)
        curveTo(13.7688f, 13.0f, 15.0f, 11.7688f, 15.0f, 10.25f)
        horizontalLineTo(14.0f)
        curveTo(14.0f, 11.2165f, 13.2165f, 12.0f, 12.25f, 12.0f)
        verticalLineTo(13.0f)
        close()
        moveTo(12.25f, 8.5f)
        curveTo(13.2165f, 8.5f, 14.0f, 9.2835f, 14.0f, 10.25f)
        horizontalLineTo(15.0f)
        curveTo(15.0f, 8.7312f, 13.7688f, 7.5f, 12.25f, 7.5f)
        verticalLineTo(8.5f)
        close()
    }
}
.build()
