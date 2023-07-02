package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.2441f, 6.6552f)
                curveTo(8.0541f, 6.4362f, 7.9686f, 6.1455f, 8.0096f, 5.8585f)
                lineTo(8.5024f, 2.409f)
                lineTo(3.1098f, 9.0f)
                horizontalLineTo(6.9995f)
                curveTo(7.2894f, 9.0f, 7.5651f, 9.1258f, 7.755f, 9.3448f)
                curveTo(7.9449f, 9.5638f, 8.0305f, 9.8544f, 7.9895f, 10.1414f)
                lineTo(7.4967f, 13.5909f)
                lineTo(12.8893f, 7.0f)
                horizontalLineTo(8.9995f)
                curveTo(8.7097f, 7.0f, 8.434f, 6.8742f, 8.2441f, 6.6552f)
                close()
                moveTo(9.7459f, 0.7752f)
                curveTo(9.8175f, 0.2741f, 9.1845f, -0.0039f, 8.864f, 0.3879f)
                lineTo(1.6677f, 9.1833f)
                curveTo(1.4006f, 9.5098f, 1.6329f, 10.0f, 2.0547f, 10.0f)
                horizontalLineTo(6.9995f)
                lineTo(6.2531f, 15.2247f)
                curveTo(6.1816f, 15.7259f, 6.8145f, 16.0038f, 7.1351f, 15.6121f)
                lineTo(14.3314f, 6.8166f)
                curveTo(14.5985f, 6.4901f, 14.3662f, 6.0f, 13.9444f, 6.0f)
                horizontalLineTo(8.9995f)
                lineTo(9.7459f, 0.7752f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
