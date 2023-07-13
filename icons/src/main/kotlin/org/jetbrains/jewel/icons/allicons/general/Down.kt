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

public val GeneralGroup.Down: IntellijIconData
    get() {
        if (_down != null) {
            return _down!!
        }
        _down = IntellijIconData(name = "Down",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { DownComposable(it) })
        return _down!!
    }

private var _down: IntellijIconData? = null

private fun DownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Down",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.3536f, 9.6536f)
        curveTo(12.5488f, 9.4583f, 12.5488f, 9.1417f, 12.3536f, 8.9465f)
        curveTo(12.1583f, 8.7512f, 11.8417f, 8.7512f, 11.6464f, 8.9465f)
        lineTo(8.5f, 12.0929f)
        lineTo(8.5f, 2.5f)
        curveTo(8.5f, 2.2239f, 8.2761f, 2.0f, 8.0f, 2.0f)
        curveTo(7.7239f, 2.0f, 7.5f, 2.2239f, 7.5f, 2.5f)
        lineTo(7.5f, 12.0929f)
        lineTo(4.3535f, 8.9465f)
        curveTo(4.1583f, 8.7512f, 3.8417f, 8.7512f, 3.6465f, 8.9465f)
        curveTo(3.4512f, 9.1417f, 3.4512f, 9.4583f, 3.6465f, 9.6536f)
        lineTo(7.6465f, 13.6536f)
        lineTo(8.0f, 14.0071f)
        lineTo(8.3535f, 13.6536f)
        lineTo(12.3536f, 9.6536f)
        close()
    }
}
.build()
