package org.jetbrains.jewel.icons.allicons.build

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
import org.jetbrains.jewel.icons.allicons.BuildGroup

public val BuildGroup.DependencyAnalyzer: IntellijIconData
    get() {
        if (_dependencyAnalyzer != null) {
            return _dependencyAnalyzer!!
        }
        _dependencyAnalyzer = IntellijIconData(name = "DependencyAnalyzer",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { DependencyAnalyzerComposable(it) })
        return _dependencyAnalyzer!!
    }

private var _dependencyAnalyzer: IntellijIconData? = null

private fun DependencyAnalyzerComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "DependencyAnalyzer", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 15.0f)
        curveTo(3.2239f, 15.0f, 3.0f, 14.7761f, 3.0f, 14.5f)
        lineTo(3.0f, 9.5f)
        curveTo(3.0f, 9.2239f, 3.2239f, 9.0f, 3.5f, 9.0f)
        curveTo(3.7761f, 9.0f, 4.0f, 9.2239f, 4.0f, 9.5f)
        lineTo(4.0f, 14.5f)
        curveTo(4.0f, 14.7761f, 3.7761f, 15.0f, 3.5f, 15.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 15.0f)
        curveTo(5.2239f, 15.0f, 5.0f, 14.7761f, 5.0f, 14.5f)
        lineTo(5.0f, 11.5f)
        curveTo(5.0f, 11.2239f, 5.2239f, 11.0f, 5.5f, 11.0f)
        curveTo(5.7761f, 11.0f, 6.0f, 11.2239f, 6.0f, 11.5f)
        verticalLineTo(14.5f)
        curveTo(6.0f, 14.7761f, 5.7761f, 15.0f, 5.5f, 15.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 14.5f)
        curveTo(1.0f, 14.7761f, 1.2239f, 15.0f, 1.5f, 15.0f)
        curveTo(1.7761f, 15.0f, 2.0f, 14.7761f, 2.0f, 14.5f)
        lineTo(2.0f, 10.5f)
        curveTo(2.0f, 10.2239f, 1.7761f, 10.0f, 1.5f, 10.0f)
        curveTo(1.2239f, 10.0f, 1.0f, 10.2239f, 1.0f, 10.5f)
        verticalLineTo(14.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.1642f, 10.8716f)
        curveTo(9.3023f, 11.5769f, 8.2006f, 12.0f, 7.0f, 12.0f)
        verticalLineTo(11.0f)
        curveTo(9.2091f, 11.0f, 11.0f, 9.2091f, 11.0f, 7.0f)
        curveTo(11.0f, 4.7909f, 9.2091f, 3.0f, 7.0f, 3.0f)
        curveTo(4.7909f, 3.0f, 3.0f, 4.7909f, 3.0f, 7.0f)
        curveTo(3.0f, 7.3612f, 3.0479f, 7.7112f, 3.1376f, 8.0441f)
        curveTo(2.7831f, 8.132f, 2.4783f, 8.3461f, 2.2738f, 8.6359f)
        curveTo(2.0964f, 8.1233f, 2.0f, 7.5729f, 2.0f, 7.0f)
        curveTo(2.0f, 4.2386f, 4.2386f, 2.0f, 7.0f, 2.0f)
        curveTo(9.7614f, 2.0f, 12.0f, 4.2386f, 12.0f, 7.0f)
        curveTo(12.0f, 8.2007f, 11.5768f, 9.3026f, 10.8713f, 10.1646f)
        lineTo(13.8526f, 13.1421f)
        curveTo(14.0479f, 13.3373f, 14.0481f, 13.6538f, 13.853f, 13.8492f)
        curveTo(13.6578f, 14.0446f, 13.3413f, 14.0448f, 13.1459f, 13.8497f)
        lineTo(10.1642f, 10.8716f)
        close()
    }
}
.build()
