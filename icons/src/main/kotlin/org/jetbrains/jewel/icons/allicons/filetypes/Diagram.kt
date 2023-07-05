package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Diagram: IntellijIconData
    get() {
        if (_diagram != null) {
            return _diagram!!
        }
        _diagram = IntellijIconData(imageVector = { DiagramComposable(it) })
        return _diagram!!
    }

private var _diagram: IntellijIconData? = null

private fun DiagramComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Diagram", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 13.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 2.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(2.1465f, 6.3535f)
        curveTo(1.9512f, 6.5488f, 1.9512f, 6.8654f, 2.1465f, 7.0607f)
        curveTo(2.3417f, 7.2559f, 2.6583f, 7.2559f, 2.8535f, 7.0607f)
        lineTo(4.0f, 5.9142f)
        verticalLineTo(11.7071f)
        curveTo(4.0f, 11.9832f, 4.2239f, 12.2071f, 4.5f, 12.2071f)
        curveTo(4.7761f, 12.2071f, 5.0f, 11.9832f, 5.0f, 11.7071f)
        verticalLineTo(5.9142f)
        lineTo(6.1465f, 7.0607f)
        curveTo(6.3417f, 7.2559f, 6.6583f, 7.2559f, 6.8535f, 7.0607f)
        curveTo(7.0488f, 6.8654f, 7.0488f, 6.5488f, 6.8535f, 6.3535f)
        lineTo(4.8535f, 4.3535f)
        lineTo(4.5f, 4.0f)
        lineTo(4.1465f, 4.3535f)
        lineTo(4.1462f, 4.3538f)
        lineTo(2.1465f, 6.3535f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(9.1465f, 6.3535f)
        curveTo(8.9512f, 6.5488f, 8.9512f, 6.8654f, 9.1465f, 7.0607f)
        curveTo(9.3417f, 7.2559f, 9.6583f, 7.2559f, 9.8535f, 7.0607f)
        lineTo(11.0f, 5.9142f)
        verticalLineTo(6.3037f)
        verticalLineTo(6.8037f)
        horizontalLineTo(12.0f)
        verticalLineTo(6.3037f)
        verticalLineTo(5.9142f)
        lineTo(13.1464f, 7.0607f)
        curveTo(13.3417f, 7.2559f, 13.6583f, 7.2559f, 13.8536f, 7.0607f)
        curveTo(14.0488f, 6.8654f, 14.0488f, 6.5488f, 13.8536f, 6.3535f)
        lineTo(11.8536f, 4.3535f)
        lineTo(11.5f, 4.0f)
        lineTo(11.1464f, 4.3535f)
        lineTo(9.1465f, 6.3535f)
        close()
        moveTo(11.0f, 11.2159f)
        verticalLineTo(11.7071f)
        curveTo(11.0f, 11.9833f, 11.2239f, 12.2071f, 11.5f, 12.2071f)
        curveTo(11.7761f, 12.2071f, 12.0f, 11.9833f, 12.0f, 11.7071f)
        verticalLineTo(11.2159f)
        verticalLineTo(10.7159f)
        horizontalLineTo(11.0f)
        verticalLineTo(11.2159f)
        close()
        moveTo(11.0f, 9.251f)
        verticalLineTo(9.751f)
        horizontalLineTo(12.0f)
        verticalLineTo(9.251f)
        lineTo(12.0f, 8.2686f)
        verticalLineTo(7.7686f)
        horizontalLineTo(11.0f)
        verticalLineTo(8.2686f)
        verticalLineTo(9.251f)
        close()
    }
}
.build()
