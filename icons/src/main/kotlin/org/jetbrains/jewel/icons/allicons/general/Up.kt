package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val GeneralGroup.Up: IntellijIconData
    get() {
        if (_up != null) {
            return _up!!
        }
        _up = IntellijIconData(imageVector = { UpComposable(it) })
        return _up!!
    }

private var _up: IntellijIconData? = null

private fun UpComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Up",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.3536f, 6.3464f)
        curveTo(12.5488f, 6.5417f, 12.5488f, 6.8583f, 12.3536f, 7.0535f)
        curveTo(12.1583f, 7.2488f, 11.8417f, 7.2488f, 11.6464f, 7.0535f)
        lineTo(8.5f, 3.9071f)
        lineTo(8.5f, 13.5071f)
        curveTo(8.5f, 13.7832f, 8.2761f, 14.0071f, 8.0f, 14.0071f)
        curveTo(7.7239f, 14.0071f, 7.5f, 13.7832f, 7.5f, 13.5071f)
        lineTo(7.5f, 3.9071f)
        lineTo(4.3535f, 7.0535f)
        curveTo(4.1583f, 7.2488f, 3.8417f, 7.2488f, 3.6465f, 7.0535f)
        curveTo(3.4512f, 6.8583f, 3.4512f, 6.5417f, 3.6465f, 6.3464f)
        lineTo(7.6465f, 2.3464f)
        lineTo(8.0f, 1.9929f)
        lineTo(8.3535f, 2.3464f)
        lineTo(12.3536f, 6.3464f)
        close()
    }
}
.build()
