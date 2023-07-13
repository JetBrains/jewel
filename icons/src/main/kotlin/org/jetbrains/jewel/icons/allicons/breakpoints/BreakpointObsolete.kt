package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointObsolete: IntellijIconData
    get() {
        if (_breakpointObsolete != null) {
            return _breakpointObsolete!!
        }
        _breakpointObsolete = IntellijIconData(name = "BreakpointObsolete",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { BreakpointObsoleteComposable(it) })
        return _breakpointObsolete!!
    }

private var _breakpointObsolete: IntellijIconData? = null

private fun BreakpointObsoleteComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointObsolete", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.0f, 14.0f)
        curveTo(10.866f, 14.0f, 14.0f, 10.866f, 14.0f, 7.0f)
        curveTo(14.0f, 3.134f, 10.866f, 0.0f, 7.0f, 0.0f)
        curveTo(3.134f, 0.0f, 0.0f, 3.134f, 0.0f, 7.0f)
        curveTo(0.0f, 10.866f, 3.134f, 14.0f, 7.0f, 14.0f)
        close()
        moveTo(7.9005f, 3.5f)
        curveTo(7.9005f, 3.0029f, 7.4975f, 2.6f, 7.0005f, 2.6f)
        curveTo(6.5034f, 2.6f, 6.1005f, 3.0029f, 6.1005f, 3.5f)
        lineTo(6.1005f, 7.0f)
        curveTo(6.1005f, 7.4971f, 6.5034f, 7.9f, 7.0005f, 7.9f)
        curveTo(7.4976f, 7.9f, 7.9005f, 7.4971f, 7.9005f, 7.0f)
        lineTo(7.9005f, 3.5f)
        close()
        moveTo(7.0004f, 11.2f)
        curveTo(7.6079f, 11.2f, 8.1004f, 10.7075f, 8.1004f, 10.1f)
        curveTo(8.1004f, 9.4925f, 7.6079f, 9.0f, 7.0004f, 9.0f)
        curveTo(6.3929f, 9.0f, 5.9004f, 9.4925f, 5.9004f, 10.1f)
        curveTo(5.9004f, 10.7075f, 6.3929f, 11.2f, 7.0004f, 11.2f)
        close()
    }
}
.build()
