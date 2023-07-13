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

public val RunGroup.Rerun: IntellijIconData
    get() {
        if (_rerun != null) {
            return _rerun!!
        }
        _rerun = IntellijIconData(name = "Rerun",size = DpSize(height = 16.0.dp, width =
                17.0.dp),imageVector = { RerunComposable(it) })
        return _rerun!!
    }

private var _rerun: IntellijIconData? = null

private fun RerunComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Rerun",
        defaultWidth = 17.0.dp, defaultHeight = 16.0.dp, viewportWidth = 17.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(9.0f, 9.5021f)
        curveTo(9.0f, 8.3244f, 10.2951f, 7.6061f, 11.2942f, 8.2297f)
        lineTo(15.2962f, 10.7275f)
        curveTo(16.2372f, 11.3149f, 16.2372f, 12.6851f, 15.2962f, 13.2725f)
        lineTo(11.2942f, 15.7703f)
        curveTo(10.2951f, 16.3939f, 9.0f, 15.6756f, 9.0f, 14.4978f)
        verticalLineTo(9.5021f)
        close()
        moveTo(10.7647f, 9.078f)
        curveTo(10.4317f, 8.8701f, 10.0f, 9.1096f, 10.0f, 9.5021f)
        verticalLineTo(14.4978f)
        curveTo(10.0f, 14.8904f, 10.4317f, 15.1298f, 10.7647f, 14.922f)
        lineTo(14.7667f, 12.4241f)
        curveTo(15.0804f, 12.2284f, 15.0804f, 11.7716f, 14.7667f, 11.5758f)
        lineTo(10.7647f, 9.078f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 9.5022f)
        curveTo(10.0f, 9.1096f, 10.4317f, 8.8701f, 10.7647f, 9.078f)
        lineTo(14.7667f, 11.5758f)
        curveTo(15.0804f, 11.7716f, 15.0804f, 12.2284f, 14.7667f, 12.4242f)
        lineTo(10.7647f, 14.922f)
        curveTo(10.4317f, 15.1299f, 10.0f, 14.8904f, 10.0f, 14.4978f)
        verticalLineTo(9.5022f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 1.5f)
        curveTo(14.0f, 1.2239f, 13.7761f, 1.0f, 13.5f, 1.0f)
        curveTo(13.2239f, 1.0f, 13.0f, 1.2239f, 13.0f, 1.5f)
        verticalLineTo(4.6824f)
        curveTo(11.9256f, 3.0663f, 10.0877f, 2.0f, 8.0f, 2.0f)
        curveTo(4.6863f, 2.0f, 2.0f, 4.6863f, 2.0f, 8.0f)
        curveTo(2.0f, 11.3137f, 4.6863f, 14.0f, 8.0f, 14.0f)
        verticalLineTo(13.0f)
        curveTo(5.2386f, 13.0f, 3.0f, 10.7614f, 3.0f, 8.0f)
        curveTo(3.0f, 5.2386f, 5.2386f, 3.0f, 8.0f, 3.0f)
        curveTo(9.6353f, 3.0f, 11.0878f, 3.785f, 12.0005f, 5.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 5.0f, 9.0f, 5.2239f, 9.0f, 5.5f)
        curveTo(9.0f, 5.7761f, 9.2239f, 6.0f, 9.5f, 6.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(1.5f)
        close()
    }
}
.build()
