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

public val RunGroup.ForceStepInto: IntellijIconData
    get() {
        if (_forceStepInto != null) {
            return _forceStepInto!!
        }
        _forceStepInto = IntellijIconData(name = "ForceStepInto",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ForceStepIntoComposable(it) })
        return _forceStepInto!!
    }

private var _forceStepInto: IntellijIconData? = null

private fun ForceStepIntoComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ForceStepInto", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 14.0f)
        lineTo(13.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 14.5f)
        lineTo(14.0f, 14.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 15.0f)
        lineTo(2.5f, 15.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 14.5f)
        lineTo(2.0f, 14.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.3536f, 6.9464f)
        curveTo(12.5488f, 7.1417f, 12.5488f, 7.4583f, 12.3536f, 7.6535f)
        lineTo(8.3536f, 11.6535f)
        lineTo(8.0f, 12.0071f)
        lineTo(7.6465f, 11.6535f)
        lineTo(3.6465f, 7.6535f)
        curveTo(3.4512f, 7.4583f, 3.4512f, 7.1417f, 3.6465f, 6.9464f)
        curveTo(3.8417f, 6.7512f, 4.1583f, 6.7512f, 4.3536f, 6.9464f)
        lineTo(6.0f, 8.5928f)
        lineTo(6.0f, 2.0f)
        curveTo(6.0f, 1.7239f, 6.2239f, 1.5f, 6.5f, 1.5f)
        curveTo(6.7761f, 1.5f, 7.0f, 1.7239f, 7.0f, 2.0f)
        lineTo(7.0f, 9.4996f)
        curveTo(7.0f, 9.5289f, 6.9975f, 9.5576f, 6.9926f, 9.5855f)
        lineTo(8.0f, 10.5929f)
        lineTo(9.0f, 9.5929f)
        lineTo(9.0f, 2.0f)
        curveTo(9.0f, 1.7239f, 9.2239f, 1.5f, 9.5f, 1.5f)
        curveTo(9.7761f, 1.5f, 10.0f, 1.7239f, 10.0f, 2.0f)
        lineTo(10.0f, 8.5929f)
        lineTo(11.6465f, 6.9464f)
        curveTo(11.8417f, 6.7512f, 12.1583f, 6.7512f, 12.3536f, 6.9464f)
        close()
    }
}
.build()
