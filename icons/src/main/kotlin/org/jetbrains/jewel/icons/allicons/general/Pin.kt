package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Pin: IntellijIconData
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = IntellijIconData(imageVector = { PinComposable(it) })
        return _pin!!
    }

private var _pin: IntellijIconData? = null

private fun PinComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Pin",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.4806f, 5.7071f)
        lineTo(6.2673f, 7.2002f)
        curveTo(6.1976f, 7.6877f, 5.9012f, 8.0721f, 5.5363f, 8.2929f)
        curveTo(4.7852f, 8.7475f, 4.3985f, 9.4144f, 4.1986f, 10.0f)
        horizontalLineTo(11.8015f)
        curveTo(11.6016f, 9.4143f, 11.2149f, 8.7475f, 10.4637f, 8.2928f)
        curveTo(10.0988f, 8.072f, 9.8024f, 7.6876f, 9.7327f, 7.2001f)
        lineTo(9.5194f, 5.7071f)
        curveTo(9.3907f, 4.8061f, 10.0899f, 4.0f, 11.0f, 4.0f)
        verticalLineTo(3.0f)
        lineTo(5.0f, 3.0f)
        verticalLineTo(4.0f)
        curveTo(5.9101f, 4.0f, 6.6093f, 4.8061f, 6.4806f, 5.7071f)
        close()
        moveTo(5.2773f, 7.0587f)
        curveTo(5.2546f, 7.2176f, 5.1558f, 7.3543f, 5.0186f, 7.4374f)
        curveTo(3.8497f, 8.1448f, 3.3577f, 9.2276f, 3.1506f, 10.0138f)
        curveTo(3.0099f, 10.5478f, 3.4478f, 11.0f, 4.0001f, 11.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 11.0f, 12.9902f, 10.5478f, 12.8495f, 10.0138f)
        curveTo(12.6424f, 9.2276f, 12.1504f, 8.1447f, 10.9814f, 7.4373f)
        curveTo(10.8442f, 7.3542f, 10.7454f, 7.2175f, 10.7227f, 7.0587f)
        lineTo(10.5094f, 5.5657f)
        curveTo(10.4667f, 5.2671f, 10.6984f, 5.0f, 11.0f, 5.0f)
        curveTo(11.5523f, 5.0f, 12.0f, 4.5523f, 12.0f, 4.0f)
        verticalLineTo(3.0f)
        curveTo(12.0f, 2.4477f, 11.5523f, 2.0f, 11.0f, 2.0f)
        horizontalLineTo(5.0f)
        curveTo(4.4477f, 2.0f, 4.0f, 2.4477f, 4.0f, 3.0f)
        verticalLineTo(4.0f)
        curveTo(4.0f, 4.5523f, 4.4477f, 5.0f, 5.0f, 5.0f)
        curveTo(5.3016f, 5.0f, 5.5333f, 5.2671f, 5.4906f, 5.5657f)
        lineTo(5.2773f, 7.0587f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.5f, 11.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(14.5f)
        curveTo(8.5f, 14.7761f, 8.2761f, 15.0f, 8.0f, 15.0f)
        verticalLineTo(15.0f)
        curveTo(7.7239f, 15.0f, 7.5f, 14.7761f, 7.5f, 14.5f)
        verticalLineTo(11.0f)
        close()
    }
}
.build()
