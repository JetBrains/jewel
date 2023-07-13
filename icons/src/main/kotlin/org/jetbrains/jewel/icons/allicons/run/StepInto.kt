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

public val RunGroup.StepInto: IntellijIconData
    get() {
        if (_stepInto != null) {
            return _stepInto!!
        }
        _stepInto = IntellijIconData(name = "StepInto",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { StepIntoComposable(it) })
        return _stepInto!!
    }

private var _stepInto: IntellijIconData? = null

private fun StepIntoComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "StepInto", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.3536f, 7.6535f)
        curveTo(12.5488f, 7.4583f, 12.5488f, 7.1417f, 12.3536f, 6.9464f)
        curveTo(12.1583f, 6.7512f, 11.8417f, 6.7512f, 11.6464f, 6.9464f)
        lineTo(8.5f, 10.0929f)
        lineTo(8.5f, 2.0f)
        curveTo(8.5f, 1.7239f, 8.2761f, 1.5f, 8.0f, 1.5f)
        curveTo(7.7239f, 1.5f, 7.5f, 1.7239f, 7.5f, 2.0f)
        lineTo(7.5f, 10.0929f)
        lineTo(4.3535f, 6.9464f)
        curveTo(4.1583f, 6.7512f, 3.8417f, 6.7512f, 3.6465f, 6.9464f)
        curveTo(3.4512f, 7.1417f, 3.4512f, 7.4583f, 3.6465f, 7.6535f)
        lineTo(7.6465f, 11.6535f)
        lineTo(8.0f, 12.0071f)
        lineTo(8.3535f, 11.6535f)
        lineTo(12.3536f, 7.6535f)
        close()
    }
}
.build()
