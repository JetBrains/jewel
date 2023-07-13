package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.KillProcess: IntellijIconData
    get() {
        if (_killProcess != null) {
            return _killProcess!!
        }
        _killProcess = IntellijIconData(name = "KillProcess",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { KillProcessComposable(it) })
        return _killProcess!!
    }

private var _killProcess: IntellijIconData? = null

private fun KillProcessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "KillProcess", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.087f, 1.5f)
        lineTo(14.5f, 4.913f)
        lineTo(14.5f, 11.087f)
        lineTo(11.087f, 14.5f)
        lineTo(4.913f, 14.5f)
        lineTo(1.5f, 11.087f)
        lineTo(1.5f, 4.913f)
        lineTo(4.913f, 1.5f)
        lineTo(11.087f, 1.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.1717f, 5.1716f)
        curveTo(4.9764f, 5.3668f, 4.9764f, 5.6834f, 5.1717f, 5.8787f)
        lineTo(7.293f, 8.0f)
        lineTo(5.1717f, 10.1213f)
        curveTo(4.9764f, 10.3166f, 4.9764f, 10.6332f, 5.1717f, 10.8284f)
        curveTo(5.367f, 11.0237f, 5.6835f, 11.0237f, 5.8788f, 10.8284f)
        lineTo(8.0001f, 8.7071f)
        lineTo(10.1214f, 10.8284f)
        curveTo(10.3167f, 11.0237f, 10.6333f, 11.0237f, 10.8285f, 10.8284f)
        curveTo(11.0238f, 10.6332f, 11.0238f, 10.3166f, 10.8285f, 10.1213f)
        lineTo(8.7072f, 8.0f)
        lineTo(10.8285f, 5.8787f)
        curveTo(11.0238f, 5.6834f, 11.0238f, 5.3668f, 10.8285f, 5.1716f)
        curveTo(10.6333f, 4.9763f, 10.3167f, 4.9763f, 10.1214f, 5.1716f)
        lineTo(8.0001f, 7.2929f)
        lineTo(5.8788f, 5.1716f)
        curveTo(5.6835f, 4.9763f, 5.367f, 4.9763f, 5.1717f, 5.1716f)
        close()
    }
}
.build()
