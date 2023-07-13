package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val GeneralGroup.MoveDown: IntellijIconData
    get() {
        if (_moveDown != null) {
            return _moveDown!!
        }
        _moveDown = IntellijIconData(name = "MoveDown",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { MoveDownComposable(it) })
        return _moveDown!!
    }

private var _moveDown: IntellijIconData? = null

private fun MoveDownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MoveDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 2.0f)
        lineTo(13.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 2.5f)
        lineTo(14.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 3.0f)
        lineTo(2.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 2.5f)
        lineTo(2.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.8536f, 10.1535f)
        curveTo(12.0488f, 9.9583f, 12.0488f, 9.6417f, 11.8536f, 9.4464f)
        curveTo(11.6583f, 9.2512f, 11.3417f, 9.2512f, 11.1464f, 9.4464f)
        lineTo(8.5f, 12.0929f)
        lineTo(8.5f, 4.5f)
        curveTo(8.5f, 4.2239f, 8.2761f, 4.0f, 8.0f, 4.0f)
        curveTo(7.7239f, 4.0f, 7.5f, 4.2239f, 7.5f, 4.5f)
        lineTo(7.5f, 12.0929f)
        lineTo(4.8535f, 9.4464f)
        curveTo(4.6583f, 9.2512f, 4.3417f, 9.2512f, 4.1465f, 9.4464f)
        curveTo(3.9512f, 9.6417f, 3.9512f, 9.9583f, 4.1465f, 10.1535f)
        lineTo(7.6465f, 13.6535f)
        lineTo(8.0f, 14.0071f)
        lineTo(8.3535f, 13.6535f)
        lineTo(11.8536f, 10.1535f)
        close()
    }
}
.build()
