package org.jetbrains.jewel.icons.allicons.runconfigurations

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.Compound: IntellijIconData
    get() {
        if (_compound != null) {
            return _compound!!
        }
        _compound = IntellijIconData(name = "Compound",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CompoundComposable(it) })
        return _compound!!
    }

private var _compound: IntellijIconData? = null

private fun CompoundComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Compound", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(1.0f, 3.8667f)
            curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
            horizontalLineTo(6.0382f)
            curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
            lineTo(8.5f, 4.0f)
            lineTo(13.0f, 4.0f)
            curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
            verticalLineTo(9.3657f)
            lineTo(11.8237f, 7.3832f)
            curveTo(10.1585f, 6.3439f, 8.0f, 7.5411f, 8.0f, 9.504f)
            verticalLineTo(14.0f)
            horizontalLineTo(2.75f)
            curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
            verticalLineTo(3.8667f)
            close()
        }
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
            moveTo(6.0382f, 3.0f)
            lineTo(8.0938f, 5.0f)
            horizontalLineTo(13.0f)
            curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
            verticalLineTo(8.7415f)
            lineTo(15.0f, 9.3657f)
            verticalLineTo(6.0f)
            curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
            lineTo(8.5f, 4.0f)
            lineTo(6.7356f, 2.2833f)
            curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
            horizontalLineTo(2.75f)
            curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
            verticalLineTo(12.1333f)
            curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
            horizontalLineTo(8.0f)
            verticalLineTo(13.0f)
            horizontalLineTo(2.75f)
            curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
            verticalLineTo(3.8667f)
            curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
            horizontalLineTo(6.0382f)
            close()
        }
    }
}
.build()
