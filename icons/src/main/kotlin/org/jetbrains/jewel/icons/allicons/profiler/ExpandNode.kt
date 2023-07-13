package org.jetbrains.jewel.icons.allicons.profiler

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.ProfilerGroup

public val ProfilerGroup.ExpandNode: IntellijIconData
    get() {
        if (_expandNode != null) {
            return _expandNode!!
        }
        _expandNode = IntellijIconData(name = "ExpandNode",size = DpSize(height = 9.0.dp, width =
                9.0.dp),imageVector = { ExpandNodeComposable(it) })
        return _expandNode!!
    }

private var _expandNode: IntellijIconData? = null

private fun ExpandNodeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ExpandNode", defaultWidth = 9.0.dp, defaultHeight = 9.0.dp, viewportWidth = 9.0f,
        viewportHeight = 9.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 2.5f)
        curveTo(5.0f, 2.22386f, 4.77614f, 2.0f, 4.5f, 2.0f)
        curveTo(4.22386f, 2.0f, 4.0f, 2.22386f, 4.0f, 2.5f)
        verticalLineTo(4.0f)
        horizontalLineTo(2.5f)
        curveTo(2.22386f, 4.0f, 2.0f, 4.22386f, 2.0f, 4.5f)
        curveTo(2.0f, 4.77614f, 2.22386f, 5.0f, 2.5f, 5.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(6.5f)
        curveTo(4.0f, 6.77614f, 4.22386f, 7.0f, 4.5f, 7.0f)
        curveTo(4.77614f, 7.0f, 5.0f, 6.77614f, 5.0f, 6.5f)
        verticalLineTo(5.0f)
        horizontalLineTo(6.5f)
        curveTo(6.77614f, 5.0f, 7.0f, 4.77614f, 7.0f, 4.5f)
        curveTo(7.0f, 4.22386f, 6.77614f, 4.0f, 6.5f, 4.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(2.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.0f, 0.0f)
        horizontalLineTo(2.0f)
        curveTo(0.89543f, 0.0f, 0.0f, 0.89543f, 0.0f, 2.0f)
        verticalLineTo(7.0f)
        curveTo(0.0f, 8.10457f, 0.89543f, 9.0f, 2.0f, 9.0f)
        horizontalLineTo(7.0f)
        curveTo(8.10457f, 9.0f, 9.0f, 8.10457f, 9.0f, 7.0f)
        verticalLineTo(2.0f)
        curveTo(9.0f, 0.89543f, 8.10457f, 0.0f, 7.0f, 0.0f)
        close()
        moveTo(2.0f, 1.0f)
        horizontalLineTo(7.0f)
        curveTo(7.55228f, 1.0f, 8.0f, 1.44772f, 8.0f, 2.0f)
        verticalLineTo(7.0f)
        curveTo(8.0f, 7.55228f, 7.55228f, 8.0f, 7.0f, 8.0f)
        horizontalLineTo(2.0f)
        curveTo(1.44772f, 8.0f, 1.0f, 7.55228f, 1.0f, 7.0f)
        verticalLineTo(2.0f)
        curveTo(1.0f, 1.44772f, 1.44772f, 1.0f, 2.0f, 1.0f)
        close()
    }
}
.build()
