package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestError: IntellijIconData
    get() {
        if (_testError != null) {
            return _testError!!
        }
        _testError = IntellijIconData(name = "TestError",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TestErrorComposable(it) })
        return _testError!!
    }

private var _testError: IntellijIconData? = null

private fun TestErrorComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestError", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 15.0f)
        curveTo(11.866f, 15.0f, 15.0f, 11.866f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        close()
        moveTo(8.9005f, 4.5f)
        curveTo(8.9005f, 4.0029f, 8.4975f, 3.6f, 8.0005f, 3.6f)
        curveTo(7.5034f, 3.6f, 7.1005f, 4.0029f, 7.1005f, 4.5f)
        lineTo(7.1005f, 8.0f)
        curveTo(7.1005f, 8.4971f, 7.5034f, 8.9f, 8.0005f, 8.9f)
        curveTo(8.4976f, 8.9f, 8.9005f, 8.4971f, 8.9005f, 8.0f)
        lineTo(8.9005f, 4.5f)
        close()
        moveTo(8.0004f, 12.2f)
        curveTo(8.6079f, 12.2f, 9.1004f, 11.7075f, 9.1004f, 11.1f)
        curveTo(9.1004f, 10.4925f, 8.6079f, 10.0f, 8.0004f, 10.0f)
        curveTo(7.3929f, 10.0f, 6.9004f, 10.4925f, 6.9004f, 11.1f)
        curveTo(6.9004f, 11.7075f, 7.3929f, 12.2f, 8.0004f, 12.2f)
        close()
    }
}
.build()
