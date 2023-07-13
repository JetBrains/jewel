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

public val BreakpointsGroup.BreakpointValid: IntellijIconData
    get() {
        if (_breakpointValid != null) {
            return _breakpointValid!!
        }
        _breakpointValid = IntellijIconData(name = "BreakpointValid",size = DpSize(height = 14.0.dp,
                width = 14.0.dp),imageVector = { BreakpointValidComposable(it) })
        return _breakpointValid!!
    }

private var _breakpointValid: IntellijIconData? = null

private fun BreakpointValidComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "BreakpointValid", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.827f, 0.1757f)
        curveTo(14.0613f, 0.4101f, 14.0613f, 0.79f, 13.827f, 1.0243f)
        lineTo(10.0301f, 4.8211f)
        curveTo(9.7958f, 5.0554f, 9.4159f, 5.0554f, 9.1816f, 4.8211f)
        lineTo(7.1757f, 2.8153f)
        curveTo(6.9414f, 2.581f, 6.9414f, 2.2011f, 7.1757f, 1.9668f)
        curveTo(7.41f, 1.7324f, 7.7899f, 1.7324f, 8.0243f, 1.9668f)
        lineTo(9.6059f, 3.5484f)
        lineTo(12.9785f, 0.1757f)
        curveTo(13.2128f, -0.0586f, 13.5927f, -0.0586f, 13.827f, 0.1757f)
        close()
    }
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.4721f, 1.2612f)
        curveTo(5.8472f, 1.8861f, 5.8472f, 2.8991f, 6.4721f, 3.524f)
        lineTo(8.4779f, 5.5298f)
        curveTo(9.1027f, 6.1547f, 10.1158f, 6.1547f, 10.7406f, 5.5298f)
        lineTo(12.9537f, 3.3167f)
        curveTo(13.617f, 4.3867f, 14.0f, 5.6486f, 14.0f, 7.0f)
        curveTo(14.0f, 10.866f, 10.866f, 14.0f, 7.0f, 14.0f)
        curveTo(3.134f, 14.0f, 0.0f, 10.866f, 0.0f, 7.0f)
        curveTo(0.0f, 3.134f, 3.134f, 0.0f, 7.0f, 0.0f)
        curveTo(8.3554f, 0.0f, 9.6209f, 0.3852f, 10.6928f, 1.0522f)
        lineTo(9.6093f, 2.1357f)
        lineTo(8.7348f, 1.2612f)
        curveTo(8.11f, 0.6364f, 7.0969f, 0.6364f, 6.4721f, 1.2612f)
        close()
    }
}
.build()
