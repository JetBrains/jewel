package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.SmartStepInto: IntellijIconData
    get() {
        if (_smartStepInto != null) {
            return _smartStepInto!!
        }
        _smartStepInto = IntellijIconData(imageVector = { SmartStepIntoComposable(it) })
        return _smartStepInto!!
    }

private var _smartStepInto: IntellijIconData? = null

private fun SmartStepIntoComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SmartStepInto", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.5f, 12.0f)
        lineTo(14.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 12.5f)
        lineTo(15.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 13.0f)
        lineTo(9.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 12.5f)
        lineTo(9.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.5f, 9.0f)
        lineTo(14.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 9.5f)
        lineTo(15.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 10.0f)
        lineTo(9.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 9.5f)
        lineTo(9.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.5f, 6.0f)
        lineTo(14.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 6.5f)
        lineTo(15.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 7.0f)
        lineTo(9.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 6.5f)
        lineTo(9.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.5f, 3.0f)
        lineTo(14.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 3.5f)
        lineTo(15.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 4.0f)
        lineTo(9.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 3.5f)
        lineTo(9.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.6536f, 5.6465f)
        curveTo(5.4583f, 5.4512f, 5.1417f, 5.4512f, 4.9465f, 5.6465f)
        curveTo(4.7512f, 5.8417f, 4.7512f, 6.1583f, 4.9465f, 6.3535f)
        lineTo(6.0929f, 7.5f)
        lineTo(1.5f, 7.5f)
        curveTo(1.2239f, 7.5f, 1.0f, 7.7239f, 1.0f, 8.0f)
        curveTo(1.0f, 8.2761f, 1.2239f, 8.5f, 1.5f, 8.5f)
        lineTo(6.0929f, 8.5f)
        lineTo(4.9465f, 9.6465f)
        curveTo(4.7512f, 9.8417f, 4.7512f, 10.1583f, 4.9465f, 10.3536f)
        curveTo(5.1417f, 10.5488f, 5.4583f, 10.5488f, 5.6536f, 10.3536f)
        lineTo(7.6536f, 8.3535f)
        lineTo(8.0071f, 8.0f)
        lineTo(7.6536f, 7.6465f)
        lineTo(5.6536f, 5.6465f)
        close()
    }
}
.build()
