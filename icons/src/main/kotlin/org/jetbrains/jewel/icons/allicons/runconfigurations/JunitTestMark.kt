package org.jetbrains.jewel.icons.allicons.runconfigurations

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
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.JunitTestMark: IntellijIconData
    get() {
        if (_junitTestMark != null) {
            return _junitTestMark!!
        }
        _junitTestMark = IntellijIconData(name = "JunitTestMark",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { JunitTestMarkComposable(it) })
        return _junitTestMark!!
    }

private var _junitTestMark: IntellijIconData? = null

private fun JunitTestMarkComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "JunitTestMark", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.greenSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(15.3798f, 2.7117f)
        curveTo(15.5435f, 2.8691f, 15.5436f, 3.131f, 15.3799f, 3.2884f)
        lineTo(12.6774f, 5.8876f)
        curveTo(12.4232f, 6.132f, 12.0f, 5.9519f, 12.0f, 5.5993f)
        lineTo(12.0f, 0.4038f)
        curveTo(12.0f, 0.0513f, 12.423f, -0.1288f, 12.6772f, 0.1154f)
        lineTo(15.3798f, 2.7117f)
        close()
    }
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.6226f, 3.2883f)
        curveTo(7.4591f, 3.1309f, 7.4592f, 2.8692f, 7.6227f, 2.7119f)
        lineTo(10.3216f, 0.1163f)
        curveTo(10.5757f, -0.1281f, 10.9989f, 0.0519f, 10.9989f, 0.4045f)
        verticalLineTo(5.5986f)
        curveTo(10.9989f, 5.9514f, 10.5755f, 6.1314f, 10.3214f, 5.8868f)
        lineTo(7.6226f, 3.2883f)
        close()
    }
}
.build()
