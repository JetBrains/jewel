package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
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

public val BreakpointsGroup.BreakpointMethodMutedDisabled: IntellijIconData
    get() {
        if (_breakpointMethodMutedDisabled != null) {
            return _breakpointMethodMutedDisabled!!
        }
        _breakpointMethodMutedDisabled = IntellijIconData(name =
                "BreakpointMethodMutedDisabled",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { BreakpointMethodMutedDisabledComposable(it) })
        return _breakpointMethodMutedDisabled!!
    }

private var _breakpointMethodMutedDisabled: IntellijIconData? = null

private fun BreakpointMethodMutedDisabledComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointMethodMutedDisabled", defaultWidth = 14.0.dp, defaultHeight =
        14.0.dp, viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.8231f, 1.2374f)
        curveTo(6.9207f, 1.1398f, 7.079f, 1.1398f, 7.1766f, 1.2374f)
        lineTo(12.7624f, 6.8232f)
        curveTo(12.86f, 6.9208f, 12.86f, 7.0791f, 12.7624f, 7.1768f)
        lineTo(7.1766f, 12.7625f)
        curveTo(7.079f, 12.8602f, 6.9207f, 12.8602f, 6.8231f, 12.7625f)
        lineTo(1.2373f, 7.1768f)
        curveTo(1.1397f, 7.0791f, 1.1396f, 6.9208f, 1.2373f, 6.8232f)
        lineTo(6.8231f, 1.2374f)
        close()
    }
}
.build()
