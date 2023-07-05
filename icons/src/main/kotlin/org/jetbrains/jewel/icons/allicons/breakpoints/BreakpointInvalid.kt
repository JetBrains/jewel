package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointInvalid: IntellijIconData
    get() {
        if (_breakpointInvalid != null) {
            return _breakpointInvalid!!
        }
        _breakpointInvalid = IntellijIconData(imageVector = { BreakpointInvalidComposable(it) })
        return _breakpointInvalid!!
    }

private var _breakpointInvalid: IntellijIconData? = null

private fun BreakpointInvalidComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "BreakpointInvalid", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth =
        14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.0f, 7.0f)
        curveTo(14.0f, 10.866f, 10.866f, 14.0f, 7.0f, 14.0f)
        curveTo(3.134f, 14.0f, 0.0f, 10.866f, 0.0f, 7.0f)
        curveTo(0.0f, 3.134f, 3.134f, 0.0f, 7.0f, 0.0f)
        curveTo(10.866f, 0.0f, 14.0f, 3.134f, 14.0f, 7.0f)
        close()
        moveTo(12.5f, 7.0f)
        curveTo(12.5f, 10.0376f, 10.0376f, 12.5f, 7.0f, 12.5f)
        curveTo(5.7517f, 12.5f, 4.6005f, 12.0841f, 3.6774f, 11.3834f)
        lineTo(11.3834f, 3.6774f)
        curveTo(12.0841f, 4.6005f, 12.5f, 5.7517f, 12.5f, 7.0f)
        close()
        moveTo(2.6168f, 10.3227f)
        lineTo(10.3227f, 2.6168f)
        curveTo(9.3996f, 1.9159f, 8.2484f, 1.5f, 7.0f, 1.5f)
        curveTo(3.9624f, 1.5f, 1.5f, 3.9624f, 1.5f, 7.0f)
        curveTo(1.5f, 8.2484f, 1.9159f, 9.3996f, 2.6168f, 10.3227f)
        close()
    }
}
.build()
