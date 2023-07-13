package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val BreakpointsGroup.BreakpointDependent: IntellijIconData
    get() {
        if (_breakpointDependent != null) {
            return _breakpointDependent!!
        }
        _breakpointDependent = IntellijIconData(name = "BreakpointDependent",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { BreakpointDependentComposable(it) })
        return _breakpointDependent!!
    }

private var _breakpointDependent: IntellijIconData? = null

private fun BreakpointDependentComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointDependent", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.5f, 5.0f)
        curveTo(3.8807f, 5.0f, 5.0f, 3.8807f, 5.0f, 2.5f)
        curveTo(5.0f, 1.1193f, 3.8807f, 0.0f, 2.5f, 0.0f)
        curveTo(1.1193f, 0.0f, 0.0f, 1.1193f, 0.0f, 2.5f)
        curveTo(0.0f, 3.8807f, 1.1193f, 5.0f, 2.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.1733f, 0.2408f)
        curveTo(5.5054f, 0.6334f, 5.7526f, 1.1002f, 5.8866f, 1.6128f)
        curveTo(6.2462f, 1.5388f, 6.6185f, 1.5f, 7.0f, 1.5f)
        curveTo(10.0376f, 1.5f, 12.5f, 3.9624f, 12.5f, 7.0f)
        curveTo(12.5f, 10.0376f, 10.0376f, 12.5f, 7.0f, 12.5f)
        curveTo(3.9624f, 12.5f, 1.5f, 10.0376f, 1.5f, 7.0f)
        curveTo(1.5f, 6.6185f, 1.5388f, 6.2462f, 1.6128f, 5.8866f)
        curveTo(1.1002f, 5.7526f, 0.6334f, 5.5054f, 0.2408f, 5.1733f)
        curveTo(0.0837f, 5.7556f, 0.0f, 6.368f, 0.0f, 7.0f)
        curveTo(0.0f, 10.866f, 3.134f, 14.0f, 7.0f, 14.0f)
        curveTo(10.866f, 14.0f, 14.0f, 10.866f, 14.0f, 7.0f)
        curveTo(14.0f, 3.134f, 10.866f, 0.0f, 7.0f, 0.0f)
        curveTo(6.368f, 0.0f, 5.7556f, 0.0837f, 5.1733f, 0.2408f)
        close()
    }
}
.build()
