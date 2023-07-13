package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.ViewBreakpoints: IntellijIconData
    get() {
        if (_viewBreakpoints != null) {
            return _viewBreakpoints!!
        }
        _viewBreakpoints = IntellijIconData(name = "ViewBreakpoints",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ViewBreakpointsComposable(it) })
        return _viewBreakpoints!!
    }

private var _viewBreakpoints: IntellijIconData? = null

private fun ViewBreakpointsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ViewBreakpoints", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redFill), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 9.5f)
        curveTo(11.0f, 11.9853f, 8.9853f, 14.0f, 6.5f, 14.0f)
        curveTo(4.0147f, 14.0f, 2.0f, 11.9853f, 2.0f, 9.5f)
        curveTo(2.0f, 7.0147f, 4.0147f, 5.0f, 6.5f, 5.0f)
        curveTo(8.9853f, 5.0f, 11.0f, 7.0147f, 11.0f, 9.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.redFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.4381f, 10.3664f)
        curveTo(13.9668f, 9.5111f, 15.0002f, 7.8762f, 15.0002f, 6.0f)
        curveTo(15.0002f, 3.2386f, 12.7616f, 1.0f, 10.0002f, 1.0f)
        curveTo(8.124f, 1.0f, 6.4891f, 2.0334f, 5.6338f, 3.5621f)
        curveTo(5.9167f, 3.5212f, 6.2059f, 3.5f, 6.5002f, 3.5f)
        curveTo(9.8139f, 3.5f, 12.5002f, 6.1863f, 12.5002f, 9.5f)
        curveTo(12.5002f, 9.7942f, 12.479f, 10.0835f, 12.4381f, 10.3664f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.4891f, 9.1316f)
        curveTo(13.4099f, 8.3988f, 14.0002f, 7.2683f, 14.0002f, 6.0f)
        curveTo(14.0002f, 3.7909f, 12.2093f, 2.0f, 10.0002f, 2.0f)
        curveTo(8.7319f, 2.0f, 7.6015f, 2.5903f, 6.8686f, 3.5111f)
        curveTo(6.7468f, 3.5038f, 6.6239f, 3.5f, 6.5002f, 3.5f)
        curveTo(6.2059f, 3.5f, 5.9167f, 3.5212f, 5.6338f, 3.5621f)
        curveTo(6.4891f, 2.0334f, 8.124f, 1.0f, 10.0002f, 1.0f)
        curveTo(12.7616f, 1.0f, 15.0002f, 3.2386f, 15.0002f, 6.0f)
        curveTo(15.0002f, 7.8762f, 13.9668f, 9.5111f, 12.4381f, 10.3664f)
        curveTo(12.479f, 10.0835f, 12.5002f, 9.7942f, 12.5002f, 9.5f)
        curveTo(12.5002f, 9.3763f, 12.4964f, 9.2535f, 12.4891f, 9.1316f)
        close()
    }
}
.build()
