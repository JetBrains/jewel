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

public val GeneralGroup.Left: IntellijIconData
    get() {
        if (_left != null) {
            return _left!!
        }
        _left = IntellijIconData(imageVector = { LeftComposable(it) })
        return _left!!
    }

private var _left: IntellijIconData? = null

private fun LeftComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Left",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.3464f, 3.6465f)
        curveTo(6.5417f, 3.4512f, 6.8582f, 3.4512f, 7.0535f, 3.6465f)
        curveTo(7.2488f, 3.8417f, 7.2488f, 4.1583f, 7.0535f, 4.3535f)
        lineTo(3.9035f, 7.5035f)
        lineTo(13.5035f, 7.5035f)
        curveTo(13.7797f, 7.5035f, 14.0035f, 7.7274f, 14.0035f, 8.0035f)
        curveTo(14.0035f, 8.2797f, 13.7797f, 8.5035f, 13.5035f, 8.5035f)
        lineTo(3.9106f, 8.5035f)
        lineTo(7.0535f, 11.6464f)
        curveTo(7.2488f, 11.8417f, 7.2488f, 12.1583f, 7.0535f, 12.3536f)
        curveTo(6.8582f, 12.5488f, 6.5417f, 12.5488f, 6.3464f, 12.3536f)
        lineTo(2.3464f, 8.3535f)
        lineTo(1.9928f, 8.0f)
        lineTo(2.3464f, 7.6465f)
        lineTo(6.3464f, 3.6465f)
        close()
    }
}
.build()
