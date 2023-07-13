package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Problems_20x20: IntellijIconData
    get() {
        if (_problems_20x20 != null) {
            return _problems_20x20!!
        }
        _problems_20x20 = IntellijIconData(name = "Problems_20x20",size = DpSize(height = 20.0.dp,
                width = 20.0.dp),imageVector = { Problems_20x20Composable(it) })
        return _problems_20x20!!
    }

private var _problems_20x20: IntellijIconData? = null

private fun Problems_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Problems_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 18.25f)
        curveTo(14.5563f, 18.25f, 18.25f, 14.5563f, 18.25f, 10.0f)
        curveTo(18.25f, 5.4436f, 14.5563f, 1.75f, 10.0f, 1.75f)
        curveTo(5.4436f, 1.75f, 1.75f, 5.4436f, 1.75f, 10.0f)
        curveTo(1.75f, 14.5563f, 5.4436f, 18.25f, 10.0f, 18.25f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 6.0f)
        verticalLineTo(10.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 15.2f)
        curveTo(10.6627f, 15.2f, 11.2f, 14.6627f, 11.2f, 14.0f)
        curveTo(11.2f, 13.3372f, 10.6627f, 12.8f, 10.0f, 12.8f)
        curveTo(9.3372f, 12.8f, 8.8f, 13.3372f, 8.8f, 14.0f)
        curveTo(8.8f, 14.6627f, 9.3372f, 15.2f, 10.0f, 15.2f)
        close()
    }
}
.build()
