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

public val GeneralGroup.Right: IntellijIconData
    get() {
        if (_right != null) {
            return _right!!
        }
        _right = IntellijIconData(name = "Right",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { RightComposable(it) })
        return _right!!
    }

private var _right: IntellijIconData? = null

private fun RightComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Right",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(9.6536f, 12.3536f)
        curveTo(9.4583f, 12.5488f, 9.1417f, 12.5488f, 8.9465f, 12.3536f)
        curveTo(8.7512f, 12.1583f, 8.7512f, 11.8417f, 8.9465f, 11.6464f)
        lineTo(12.0894f, 8.5035f)
        lineTo(2.4965f, 8.5035f)
        curveTo(2.2203f, 8.5035f, 1.9965f, 8.2797f, 1.9965f, 8.0035f)
        curveTo(1.9965f, 7.7274f, 2.2203f, 7.5035f, 2.4965f, 7.5035f)
        lineTo(12.0964f, 7.5035f)
        lineTo(8.9465f, 4.3535f)
        curveTo(8.7512f, 4.1583f, 8.7512f, 3.8417f, 8.9465f, 3.6465f)
        curveTo(9.1417f, 3.4512f, 9.4583f, 3.4512f, 9.6536f, 3.6465f)
        lineTo(13.6536f, 7.6465f)
        lineTo(14.0071f, 8.0f)
        lineTo(13.6536f, 8.3535f)
        lineTo(9.6536f, 12.3536f)
        close()
    }
}
.build()
