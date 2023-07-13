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

public val BreakpointsGroup.BreakpointFieldDependent: IntellijIconData
    get() {
        if (_breakpointFieldDependent != null) {
            return _breakpointFieldDependent!!
        }
        _breakpointFieldDependent = IntellijIconData(name = "BreakpointFieldDependent",size =
                DpSize(height = 14.0.dp, width = 14.0.dp),imageVector = {
                BreakpointFieldDependentComposable(it) })
        return _breakpointFieldDependent!!
    }

private var _breakpointFieldDependent: IntellijIconData? = null

private fun BreakpointFieldDependentComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointFieldDependent", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
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
        moveTo(3.7176f, 5.7824f)
        curveTo(3.3384f, 5.9231f, 2.9282f, 6.0f, 2.5f, 6.0f)
        curveTo(1.8306f, 6.0f, 1.2052f, 5.8121f, 0.6735f, 5.4862f)
        curveTo(0.3754f, 5.9677f, 0.1467f, 6.4773f, 0.0f, 7.0f)
        curveTo(0.75f, 9.6718f, 3.6406f, 12.0f, 7.0f, 12.0f)
        curveTo(10.3594f, 12.0f, 13.25f, 9.6718f, 14.0f, 7.0f)
        curveTo(13.25f, 4.3282f, 10.3594f, 2.0f, 7.0f, 2.0f)
        curveTo(6.6524f, 2.0f, 6.3099f, 2.0249f, 5.9742f, 2.0726f)
        curveTo(5.9912f, 2.2127f, 6.0f, 2.3553f, 6.0f, 2.5f)
        curveTo(6.0f, 2.9282f, 5.9231f, 3.3384f, 5.7824f, 3.7176f)
        curveTo(6.1616f, 3.5769f, 6.5718f, 3.5f, 7.0f, 3.5f)
        curveTo(8.933f, 3.5f, 10.5f, 5.067f, 10.5f, 7.0f)
        curveTo(10.5f, 8.933f, 8.933f, 10.5f, 7.0f, 10.5f)
        curveTo(5.067f, 10.5f, 3.5f, 8.933f, 3.5f, 7.0f)
        curveTo(3.5f, 6.5718f, 3.5769f, 6.1616f, 3.7176f, 5.7824f)
        close()
    }
}
.build()
