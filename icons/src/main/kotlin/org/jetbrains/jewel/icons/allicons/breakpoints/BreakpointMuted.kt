package org.jetbrains.jewel.icons.allicons.breakpoints

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

public val BreakpointsGroup.BreakpointMuted: IntellijIconData
    get() {
        if (_breakpointMuted != null) {
            return _breakpointMuted!!
        }
        _breakpointMuted = IntellijIconData(name = "BreakpointMuted",size = DpSize(height = 14.0.dp,
                width = 14.0.dp),imageVector = { BreakpointMutedComposable(it) })
        return _breakpointMuted!!
    }

private var _breakpointMuted: IntellijIconData? = null

private fun BreakpointMutedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "BreakpointMuted", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0f, 14.0f)
        curveTo(10.866f, 14.0f, 14.0f, 10.866f, 14.0f, 7.0f)
        curveTo(14.0f, 3.134f, 10.866f, 0.0f, 7.0f, 0.0f)
        curveTo(3.134f, 0.0f, 0.0f, 3.134f, 0.0f, 7.0f)
        curveTo(0.0f, 10.866f, 3.134f, 14.0f, 7.0f, 14.0f)
        close()
    }
}
.build()
