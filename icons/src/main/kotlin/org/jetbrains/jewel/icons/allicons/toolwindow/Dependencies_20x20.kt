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

public val ToolwindowGroup.Dependencies_20x20: IntellijIconData
    get() {
        if (_dependencies_20x20 != null) {
            return _dependencies_20x20!!
        }
        _dependencies_20x20 = IntellijIconData(name = "Dependencies_20x20",size = DpSize(height =
                20.0.dp, width = 20.0.dp),imageVector = { Dependencies_20x20Composable(it) })
        return _dependencies_20x20!!
    }

private var _dependencies_20x20: IntellijIconData? = null

private fun Dependencies_20x20Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "Dependencies_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.1098f, 2.3884f)
        lineTo(17.6102f, 6.0536f)
        curveTo(17.7972f, 6.1449f, 17.7972f, 6.4114f, 17.6102f, 6.5028f)
        lineTo(10.1098f, 10.168f)
        curveTo(10.0405f, 10.2018f, 9.9595f, 10.2018f, 9.8902f, 10.168f)
        lineTo(2.3898f, 6.5028f)
        curveTo(2.2028f, 6.4114f, 2.2028f, 6.1449f, 2.3898f, 6.0536f)
        lineTo(9.8902f, 2.3884f)
        curveTo(9.9595f, 2.3545f, 10.0405f, 2.3545f, 10.1098f, 2.3884f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(17.7782f, 10.2782f)
        lineTo(10.4369f, 13.8441f)
        curveTo(10.1611f, 13.9781f, 9.839f, 13.9781f, 9.5631f, 13.8441f)
        lineTo(2.2218f, 10.2782f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(17.7782f, 14.2782f)
        lineTo(10.4369f, 17.8441f)
        curveTo(10.1611f, 17.9781f, 9.839f, 17.9781f, 9.5631f, 17.8441f)
        lineTo(2.2218f, 14.2782f)
    }
}
.build()
