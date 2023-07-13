package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Find_20x20: IntellijIconData
    get() {
        if (_find_20x20 != null) {
            return _find_20x20!!
        }
        _find_20x20 = IntellijIconData(name = "Find_20x20",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { Find_20x20Composable(it) })
        return _find_20x20!!
    }

private var _find_20x20: IntellijIconData? = null

private fun Find_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Find_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.5f, 9.0f)
        curveTo(14.5f, 12.0376f, 12.0376f, 14.5f, 9.0f, 14.5f)
        curveTo(5.9624f, 14.5f, 3.5f, 12.0376f, 3.5f, 9.0f)
        curveTo(3.5f, 5.9624f, 5.9624f, 3.5f, 9.0f, 3.5f)
        curveTo(12.0376f, 3.5f, 14.5f, 5.9624f, 14.5f, 9.0f)
        close()
        moveTo(13.3584f, 14.478f)
        curveTo(12.1625f, 15.4307f, 10.6478f, 16.0f, 9.0f, 16.0f)
        curveTo(5.134f, 16.0f, 2.0f, 12.866f, 2.0f, 9.0f)
        curveTo(2.0f, 5.134f, 5.134f, 2.0f, 9.0f, 2.0f)
        curveTo(12.866f, 2.0f, 16.0f, 5.134f, 16.0f, 9.0f)
        curveTo(16.0f, 10.6478f, 15.4307f, 12.1625f, 14.478f, 13.3584f)
        curveTo(14.5086f, 13.3812f, 14.5379f, 13.4065f, 14.5657f, 13.4343f)
        lineTo(18.5657f, 17.4343f)
        curveTo(18.8781f, 17.7467f, 18.8781f, 18.2533f, 18.5657f, 18.5657f)
        curveTo(18.2533f, 18.8781f, 17.7467f, 18.8781f, 17.4343f, 18.5657f)
        lineTo(13.4343f, 14.5657f)
        curveTo(13.4065f, 14.5379f, 13.3812f, 14.5086f, 13.3584f, 14.478f)
        close()
    }
}
.build()
