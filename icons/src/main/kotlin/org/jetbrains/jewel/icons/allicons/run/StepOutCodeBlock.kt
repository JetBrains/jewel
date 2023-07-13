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

public val RunGroup.StepOutCodeBlock: IntellijIconData
    get() {
        if (_stepOutCodeBlock != null) {
            return _stepOutCodeBlock!!
        }
        _stepOutCodeBlock = IntellijIconData(name = "StepOutCodeBlock",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { StepOutCodeBlockComposable(it) })
        return _stepOutCodeBlock!!
    }

private var _stepOutCodeBlock: IntellijIconData? = null

private fun StepOutCodeBlockComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "StepOutCodeBlock", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 13.0f)
        lineTo(6.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 13.5f)
        lineTo(7.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 14.0f)
        lineTo(2.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.8535f, 5.3536f)
        curveTo(9.0488f, 5.5488f, 9.0488f, 5.8654f, 8.8535f, 6.0607f)
        curveTo(8.6583f, 6.2559f, 8.3417f, 6.2559f, 8.1465f, 6.0607f)
        lineTo(6.0f, 3.9142f)
        lineTo(6.0f, 10.5071f)
        curveTo(6.0f, 10.7833f, 5.7761f, 11.0071f, 5.5f, 11.0071f)
        curveTo(5.2239f, 11.0071f, 5.0f, 10.7833f, 5.0f, 10.5071f)
        lineTo(5.0f, 3.9142f)
        lineTo(2.8535f, 6.0607f)
        curveTo(2.6583f, 6.2559f, 2.3417f, 6.2559f, 2.1465f, 6.0607f)
        curveTo(1.9512f, 5.8654f, 1.9512f, 5.5488f, 2.1465f, 5.3536f)
        lineTo(5.1465f, 2.3536f)
        lineTo(5.5f, 2.0f)
        lineTo(5.8535f, 2.3536f)
        lineTo(8.8535f, 5.3536f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 16.0f)
        curveTo(10.7761f, 16.0f, 11.0f, 15.7761f, 11.0f, 15.5f)
        curveTo(11.0f, 15.2239f, 10.7761f, 15.0f, 10.5f, 15.0f)
        curveTo(10.2239f, 15.0f, 10.0f, 14.7761f, 10.0f, 14.5f)
        lineTo(10.0f, 12.8604f)
        curveTo(10.0f, 12.5021f, 9.8092f, 12.1773f, 9.5098f, 12.0f)
        curveTo(9.8092f, 11.8227f, 10.0f, 11.4979f, 10.0f, 11.1396f)
        verticalLineTo(9.5f)
        curveTo(10.0f, 9.2239f, 10.2239f, 9.0f, 10.5f, 9.0f)
        curveTo(10.7761f, 9.0f, 11.0f, 8.7761f, 11.0f, 8.5f)
        curveTo(11.0f, 8.2239f, 10.7761f, 8.0f, 10.5f, 8.0f)
        curveTo(9.6716f, 8.0f, 9.0f, 8.6716f, 9.0f, 9.5f)
        lineTo(9.0f, 11.1396f)
        lineTo(7.8419f, 11.5257f)
        curveTo(7.6377f, 11.5937f, 7.5f, 11.7848f, 7.5f, 12.0f)
        curveTo(7.5f, 12.2152f, 7.6377f, 12.4063f, 7.8419f, 12.4743f)
        lineTo(9.0f, 12.8604f)
        lineTo(9.0f, 14.5f)
        curveTo(9.0f, 15.3284f, 9.6716f, 16.0f, 10.5f, 16.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 8.0f)
        curveTo(12.2239f, 8.0f, 12.0f, 8.2239f, 12.0f, 8.5f)
        curveTo(12.0f, 8.7761f, 12.2239f, 9.0f, 12.5f, 9.0f)
        curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
        verticalLineTo(11.1396f)
        curveTo(13.0f, 11.4979f, 13.1908f, 11.8227f, 13.4902f, 12.0f)
        curveTo(13.1908f, 12.1773f, 13.0f, 12.5021f, 13.0f, 12.8604f)
        verticalLineTo(14.5f)
        curveTo(13.0f, 14.7761f, 12.7761f, 15.0f, 12.5f, 15.0f)
        curveTo(12.2239f, 15.0f, 12.0f, 15.2239f, 12.0f, 15.5f)
        curveTo(12.0f, 15.7761f, 12.2239f, 16.0f, 12.5f, 16.0f)
        curveTo(13.3284f, 16.0f, 14.0f, 15.3284f, 14.0f, 14.5f)
        verticalLineTo(12.8604f)
        lineTo(15.1581f, 12.4743f)
        curveTo(15.3623f, 12.4063f, 15.5f, 12.2152f, 15.5f, 12.0f)
        curveTo(15.5f, 11.7848f, 15.3623f, 11.5937f, 15.1581f, 11.5257f)
        lineTo(14.0f, 11.1396f)
        verticalLineTo(9.5f)
        curveTo(14.0f, 8.6716f, 13.3284f, 8.0f, 12.5f, 8.0f)
        close()
    }
}
.build()
