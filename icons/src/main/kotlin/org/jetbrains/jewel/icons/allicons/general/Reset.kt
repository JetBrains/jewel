package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val GeneralGroup.Reset: IntellijIconData
    get() {
        if (_reset != null) {
            return _reset!!
        }
        _reset = IntellijIconData(name = "Reset",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ResetComposable(it) })
        return _reset!!
    }

private var _reset: IntellijIconData? = null

private fun ResetComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Reset",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.8536f, 2.3535f)
        curveTo(6.0489f, 2.1583f, 6.0489f, 1.8417f, 5.8536f, 1.6465f)
        curveTo(5.6584f, 1.4512f, 5.3418f, 1.4512f, 5.1465f, 1.6465f)
        lineTo(1.6465f, 5.1465f)
        lineTo(1.293f, 5.5f)
        lineTo(1.6465f, 5.8535f)
        lineTo(5.1465f, 9.3535f)
        curveTo(5.3418f, 9.5488f, 5.6584f, 9.5488f, 5.8536f, 9.3535f)
        curveTo(6.0489f, 9.1583f, 6.0489f, 8.8417f, 5.8536f, 8.6465f)
        lineTo(3.2072f, 6.0f)
        horizontalLineTo(10.5001f)
        curveTo(12.4331f, 6.0f, 14.0001f, 7.567f, 14.0001f, 9.5f)
        curveTo(14.0001f, 11.433f, 12.4331f, 13.0f, 10.5001f, 13.0f)
        horizontalLineTo(5.5001f)
        curveTo(5.2239f, 13.0f, 5.0001f, 13.2239f, 5.0001f, 13.5f)
        curveTo(5.0001f, 13.7761f, 5.2239f, 14.0f, 5.5001f, 14.0f)
        horizontalLineTo(10.5001f)
        curveTo(12.9854f, 14.0f, 15.0001f, 11.9853f, 15.0001f, 9.5f)
        curveTo(15.0001f, 7.0147f, 12.9854f, 5.0f, 10.5001f, 5.0f)
        horizontalLineTo(3.2072f)
        lineTo(5.8536f, 2.3535f)
        close()
    }
}
.build()
