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

public val ToolwindowGroup.Coverage: IntellijIconData
    get() {
        if (_coverage != null) {
            return _coverage!!
        }
        _coverage = IntellijIconData(name = "Coverage",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CoverageComposable(it) })
        return _coverage!!
    }

private var _coverage: IntellijIconData? = null

private fun CoverageComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Coverage", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 0.4568f)
        lineTo(14.0f, 3.0022f)
        verticalLineTo(8.7777f)
        curveTo(14.0f, 10.5436f, 13.1076f, 11.835f, 11.9676f, 12.8566f)
        curveTo(11.1292f, 13.608f, 10.1082f, 14.2524f, 9.1714f, 14.8436f)
        curveTo(8.8602f, 15.04f, 8.5583f, 15.2306f, 8.2754f, 15.4172f)
        lineTo(8.0f, 15.599f)
        lineTo(7.7246f, 15.4172f)
        curveTo(7.4417f, 15.2306f, 7.1398f, 15.04f, 6.8286f, 14.8436f)
        curveTo(5.8918f, 14.2524f, 4.8708f, 13.608f, 4.0324f, 12.8566f)
        curveTo(2.8925f, 11.835f, 2.0f, 10.5436f, 2.0f, 8.7777f)
        verticalLineTo(3.0022f)
        lineTo(8.0f, 0.4568f)
        close()
        moveTo(3.0f, 3.6643f)
        verticalLineTo(8.7777f)
        curveTo(3.0f, 10.1552f, 3.679f, 11.1971f, 4.6998f, 12.1119f)
        curveTo(5.4699f, 12.802f, 6.3845f, 13.3795f, 7.3023f, 13.959f)
        curveTo(7.5354f, 14.1062f, 7.7688f, 14.2536f, 8.0f, 14.4029f)
        curveTo(8.2312f, 14.2536f, 8.4646f, 14.1062f, 8.6977f, 13.959f)
        curveTo(9.6155f, 13.3795f, 10.5301f, 12.802f, 11.3002f, 12.1119f)
        curveTo(12.321f, 11.1971f, 13.0f, 10.1552f, 13.0f, 8.7777f)
        verticalLineTo(3.6643f)
        lineTo(8.0f, 1.5431f)
        lineTo(3.0f, 3.6643f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.8536f, 5.7246f)
        curveTo(11.0488f, 5.9198f, 11.0488f, 6.2364f, 10.8536f, 6.4317f)
        lineTo(7.3535f, 9.9317f)
        curveTo(7.1583f, 10.1269f, 6.8417f, 10.1269f, 6.6465f, 9.9317f)
        lineTo(5.1465f, 8.4317f)
        curveTo(4.9512f, 8.2364f, 4.9512f, 7.9198f, 5.1465f, 7.7246f)
        curveTo(5.3417f, 7.5293f, 5.6583f, 7.5293f, 5.8535f, 7.7246f)
        lineTo(7.0f, 8.871f)
        lineTo(10.1464f, 5.7246f)
        curveTo(10.3417f, 5.5293f, 10.6583f, 5.5293f, 10.8536f, 5.7246f)
        close()
    }
}
.build()
