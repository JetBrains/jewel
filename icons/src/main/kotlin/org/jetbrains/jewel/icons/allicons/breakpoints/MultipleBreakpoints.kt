package org.jetbrains.jewel.icons.allicons.breakpoints

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

public val BreakpointsGroup.MultipleBreakpoints: IntellijIconData
    get() {
        if (_multipleBreakpoints != null) {
            return _multipleBreakpoints!!
        }
        _multipleBreakpoints = IntellijIconData(name = "MultipleBreakpoints",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { MultipleBreakpointsComposable(it) })
        return _multipleBreakpoints!!
    }

private var _multipleBreakpoints: IntellijIconData? = null

private fun MultipleBreakpointsComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "MultipleBreakpoints", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.9754f, 8.9752f)
        curveTo(9.7275f, 6.3565f, 7.6436f, 4.2726f, 5.0249f, 4.0247f)
        curveTo(5.2623f, 1.7629f, 7.1754f, 0.0f, 9.5001f, 0.0f)
        curveTo(11.9854f, 0.0f, 14.0001f, 2.0147f, 14.0001f, 4.5f)
        curveTo(14.0001f, 6.8247f, 12.2372f, 8.7378f, 9.9754f, 8.9752f)
        close()
    }
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.0f, 9.5f)
        curveTo(9.0f, 11.9853f, 6.9853f, 14.0f, 4.5f, 14.0f)
        curveTo(2.0147f, 14.0f, 0.0f, 11.9853f, 0.0f, 9.5f)
        curveTo(0.0f, 7.0147f, 2.0147f, 5.0f, 4.5f, 5.0f)
        curveTo(6.9853f, 5.0f, 9.0f, 7.0147f, 9.0f, 9.5f)
        close()
    }
}
.build()
