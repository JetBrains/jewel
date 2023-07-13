package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
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

public val RunGroup.TestTerminated: IntellijIconData
    get() {
        if (_testTerminated != null) {
            return _testTerminated!!
        }
        _testTerminated = IntellijIconData(name = "TestTerminated",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { TestTerminatedComposable(it) })
        return _testTerminated!!
    }

private var _testTerminated: IntellijIconData? = null

private fun TestTerminatedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestTerminated", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(13.1368f, 11.8637f)
        curveTo(13.4883f, 12.2152f, 13.4883f, 12.785f, 13.1368f, 13.1365f)
        curveTo(12.7853f, 13.488f, 12.2155f, 13.488f, 11.864f, 13.1365f)
        lineTo(8.0f, 9.2725f)
        lineTo(4.136f, 13.1365f)
        curveTo(3.7845f, 13.488f, 3.2147f, 13.488f, 2.8632f, 13.1365f)
        curveTo(2.5117f, 12.785f, 2.5117f, 12.2152f, 2.8632f, 11.8637f)
        lineTo(6.7272f, 7.9997f)
        lineTo(2.864f, 4.1365f)
        curveTo(2.5125f, 3.785f, 2.5125f, 3.2152f, 2.864f, 2.8637f)
        curveTo(3.2155f, 2.5122f, 3.7853f, 2.5122f, 4.1368f, 2.8637f)
        lineTo(8.0f, 6.7269f)
        lineTo(11.8632f, 2.8637f)
        curveTo(12.2147f, 2.5122f, 12.7845f, 2.5122f, 13.136f, 2.8637f)
        curveTo(13.4875f, 3.2152f, 13.4875f, 3.785f, 13.136f, 4.1365f)
        lineTo(9.2728f, 7.9997f)
        lineTo(13.1368f, 11.8637f)
        close()
    }
}
.build()
