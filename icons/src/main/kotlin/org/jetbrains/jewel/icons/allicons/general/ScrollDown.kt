package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.ScrollDown: IntellijIconData
    get() {
        if (_scrollDown != null) {
            return _scrollDown!!
        }
        _scrollDown = IntellijIconData(name = "ScrollDown",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ScrollDownComposable(it) })
        return _scrollDown!!
    }

private var _scrollDown: IntellijIconData? = null

private fun ScrollDownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ScrollDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 3.5f)
        horizontalLineTo(5.5f)
        moveTo(1.5f, 8.0f)
        horizontalLineTo(5.5f)
        moveTo(1.5f, 12.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.5f, 3.0f)
        curveTo(11.7761f, 3.0f, 12.0f, 3.2239f, 12.0f, 3.5f)
        lineTo(12.0f, 9.2929f)
        lineTo(14.1465f, 7.1465f)
        curveTo(14.3417f, 6.9512f, 14.6583f, 6.9512f, 14.8536f, 7.1465f)
        curveTo(15.0488f, 7.3417f, 15.0488f, 7.6583f, 14.8536f, 7.8536f)
        lineTo(11.8536f, 10.8536f)
        curveTo(11.6583f, 11.0488f, 11.3417f, 11.0488f, 11.1464f, 10.8536f)
        lineTo(8.1465f, 7.8536f)
        curveTo(7.9512f, 7.6583f, 7.9512f, 7.3417f, 8.1465f, 7.1465f)
        curveTo(8.3417f, 6.9512f, 8.6583f, 6.9512f, 8.8536f, 7.1465f)
        lineTo(11.0f, 9.2929f)
        lineTo(11.0f, 3.5f)
        curveTo(11.0f, 3.2239f, 11.2239f, 3.0f, 11.5f, 3.0f)
        close()
    }
}
.build()
