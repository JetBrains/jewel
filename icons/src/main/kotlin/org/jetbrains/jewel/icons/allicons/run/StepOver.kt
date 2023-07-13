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

public val RunGroup.StepOver: IntellijIconData
    get() {
        if (_stepOver != null) {
            return _stepOver!!
        }
        _stepOver = IntellijIconData(name = "StepOver",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { StepOverComposable(it) })
        return _stepOver!!
    }

private var _stepOver: IntellijIconData? = null

private fun StepOverComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "StepOver", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
        moveTo(13.9823f, 4.2267f)
        curveTo(13.9814f, 3.9506f, 13.7568f, 3.7274f, 13.4807f, 3.7283f)
        curveTo(13.2046f, 3.7292f, 12.9814f, 3.9538f, 12.9823f, 4.23f)
        lineTo(12.9957f, 8.3089f)
        lineTo(7.8358f, 3.6297f)
        lineTo(7.4831f, 3.3098f)
        lineTo(7.1464f, 3.6465f)
        lineTo(2.1464f, 8.6465f)
        curveTo(1.9512f, 8.8418f, 1.9512f, 9.1584f, 2.1464f, 9.3536f)
        curveTo(2.3417f, 9.5489f, 2.6583f, 9.5489f, 2.8535f, 9.3536f)
        lineTo(7.5168f, 4.6903f)
        lineTo(12.2417f, 8.9751f)
        lineTo(8.2553f, 8.9882f)
        curveTo(7.9792f, 8.9891f, 7.7561f, 9.2137f, 7.757f, 9.4898f)
        curveTo(7.7579f, 9.766f, 7.9825f, 9.9891f, 8.2586f, 9.9882f)
        lineTo(13.5012f, 9.9709f)
        lineTo(14.0012f, 9.9693f)
        lineTo(13.9996f, 9.4693f)
        lineTo(13.9823f, 4.2267f)
        close()
    }
}
.build()
