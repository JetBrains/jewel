package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Jdk: IntellijIconData
    get() {
        if (_jdk != null) {
            return _jdk!!
        }
        _jdk = IntellijIconData(imageVector = { JdkComposable(it) })
        return _jdk!!
    }

private var _jdk: IntellijIconData? = null

private fun JdkComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Jdk",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
        lineTo(8.5f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 8.0f, 5.0f, 8.4477f, 5.0f, 9.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.8026f, 4.7167f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(8.5f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(7.8026f, 4.7167f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE7EFFD)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.5f, 10.0f)
        curveTo(6.5f, 9.7239f, 6.7239f, 9.5f, 7.0f, 9.5f)
        horizontalLineTo(12.5f)
        curveTo(12.7761f, 9.5f, 13.0f, 9.7239f, 13.0f, 10.0f)
        verticalLineTo(12.25f)
        curveTo(13.0f, 14.0449f, 11.5449f, 15.5f, 9.75f, 15.5f)
        curveTo(7.9551f, 15.5f, 6.5f, 14.0449f, 6.5f, 12.25f)
        verticalLineTo(10.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.0f, 9.5f)
        horizontalLineTo(14.0f)
        curveTo(14.8284f, 9.5f, 15.5f, 10.1716f, 15.5f, 11.0f)
        curveTo(15.5f, 11.8284f, 14.8284f, 12.5f, 14.0f, 12.5f)
        horizontalLineTo(13.0f)
        verticalLineTo(9.5f)
        close()
    }
}
.build()
