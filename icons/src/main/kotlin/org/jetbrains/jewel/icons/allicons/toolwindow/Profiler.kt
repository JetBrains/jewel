package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Profiler: IntellijIconData
    get() {
        if (_profiler != null) {
            return _profiler!!
        }
        _profiler = IntellijIconData(name = "Profiler",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ProfilerComposable(it) })
        return _profiler!!
    }

private var _profiler: IntellijIconData? = null

private fun ProfilerComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Profiler", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.157f, 7.2021f)
        curveTo(12.4154f, 6.9946f, 12.4566f, 6.617f, 12.249f, 6.3586f)
        curveTo(12.0415f, 6.1003f, 11.6638f, 6.0591f, 11.4055f, 6.2666f)
        lineTo(8.9277f, 8.2572f)
        curveTo(8.6568f, 8.0939f, 8.3394f, 8.0f, 8.0f, 8.0f)
        curveTo(7.0059f, 8.0f, 6.2f, 8.8059f, 6.2f, 9.8f)
        curveTo(6.2f, 10.7941f, 7.0059f, 11.6f, 8.0f, 11.6f)
        curveTo(8.9941f, 11.6f, 9.8f, 10.7941f, 9.8f, 9.8f)
        curveTo(9.8f, 9.5832f, 9.7617f, 9.3754f, 9.6914f, 9.1829f)
        lineTo(12.157f, 7.2021f)
        close()
        moveTo(8.8f, 9.8f)
        curveTo(8.8f, 10.2418f, 8.4418f, 10.6f, 8.0f, 10.6f)
        curveTo(7.5582f, 10.6f, 7.2f, 10.2418f, 7.2f, 9.8f)
        curveTo(7.2f, 9.3582f, 7.5582f, 9.0f, 8.0f, 9.0f)
        curveTo(8.4418f, 9.0f, 8.8f, 9.3582f, 8.8f, 9.8f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 3.5f)
        curveTo(4.4102f, 3.5f, 1.5f, 6.4102f, 1.5f, 10.0f)
        curveTo(1.5f, 10.8909f, 1.7697f, 12.0874f, 2.1392f, 13.0f)
        horizontalLineTo(13.8608f)
        curveTo(14.2303f, 12.0874f, 14.5f, 10.8909f, 14.5f, 10.0f)
        curveTo(14.5f, 6.4102f, 11.5899f, 3.5f, 8.0f, 3.5f)
        close()
        moveTo(0.5f, 10.0f)
        curveTo(0.5f, 5.8579f, 3.8579f, 2.5f, 8.0f, 2.5f)
        curveTo(12.1421f, 2.5f, 15.5f, 5.8579f, 15.5f, 10.0f)
        curveTo(15.5f, 11.1604f, 15.1228f, 12.6805f, 14.6336f, 13.7304f)
        curveTo(14.5554f, 13.8984f, 14.3841f, 14.0f, 14.1987f, 14.0f)
        horizontalLineTo(1.8013f)
        curveTo(1.6159f, 14.0f, 1.4446f, 13.8984f, 1.3664f, 13.7304f)
        curveTo(0.8772f, 12.6805f, 0.5f, 11.1604f, 0.5f, 10.0f)
        close()
    }
}
.build()
