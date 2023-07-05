package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.StepOut: IntellijIconData
    get() {
        if (_stepOut != null) {
            return _stepOut!!
        }
        _stepOut = IntellijIconData(imageVector = { StepOutComposable(it) })
        return _stepOut!!
    }

private var _stepOut: IntellijIconData? = null

private fun StepOutComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "StepOut", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
        moveTo(12.3536f, 5.8535f)
        curveTo(12.5488f, 6.0488f, 12.5488f, 6.3654f, 12.3536f, 6.5606f)
        curveTo(12.1583f, 6.7559f, 11.8417f, 6.7559f, 11.6464f, 6.5606f)
        lineTo(8.5f, 3.4142f)
        lineTo(8.5f, 11.5071f)
        curveTo(8.5f, 11.7832f, 8.2761f, 12.0071f, 8.0f, 12.0071f)
        curveTo(7.7239f, 12.0071f, 7.5f, 11.7832f, 7.5f, 11.5071f)
        lineTo(7.5f, 3.4142f)
        lineTo(4.3535f, 6.5606f)
        curveTo(4.1583f, 6.7559f, 3.8417f, 6.7559f, 3.6465f, 6.5606f)
        curveTo(3.4512f, 6.3654f, 3.4512f, 6.0488f, 3.6465f, 5.8535f)
        lineTo(7.6465f, 1.8535f)
        lineTo(8.0f, 1.5f)
        lineTo(8.3535f, 1.8535f)
        lineTo(12.3536f, 5.8535f)
        close()
    }
}
.build()
