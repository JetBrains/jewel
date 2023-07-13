package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Repositories_20x20: IntellijIconData
    get() {
        if (_repositories_20x20 != null) {
            return _repositories_20x20!!
        }
        _repositories_20x20 = IntellijIconData(name = "Repositories_20x20",size = DpSize(height =
                20.0.dp, width = 20.0.dp),imageVector = { Repositories_20x20Composable(it) })
        return _repositories_20x20!!
    }

private var _repositories_20x20: IntellijIconData? = null

private fun Repositories_20x20Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "Repositories_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.0f, 18.25f)
        curveTo(13.8284f, 18.25f, 14.5f, 17.5784f, 14.5f, 16.75f)
        curveTo(14.5f, 15.9216f, 13.8284f, 15.25f, 13.0f, 15.25f)
        curveTo(12.1716f, 15.25f, 11.5f, 15.9216f, 11.5f, 16.75f)
        curveTo(11.5f, 17.5784f, 12.1716f, 18.25f, 13.0f, 18.25f)
        close()
        moveTo(15.9055f, 17.5f)
        curveTo(15.5725f, 18.7939f, 14.3979f, 19.75f, 13.0f, 19.75f)
        curveTo(11.6021f, 19.75f, 10.4275f, 18.7939f, 10.0945f, 17.5f)
        horizontalLineTo(6.75f)
        curveTo(6.3358f, 17.5f, 6.0f, 17.1642f, 6.0f, 16.75f)
        curveTo(6.0f, 16.3358f, 6.3358f, 16.0f, 6.75f, 16.0f)
        horizontalLineTo(10.0945f)
        curveTo(10.4275f, 14.7061f, 11.6021f, 13.75f, 13.0f, 13.75f)
        curveTo(14.3979f, 13.75f, 15.5725f, 14.7061f, 15.9055f, 16.0f)
        horizontalLineTo(19.25f)
        curveTo(19.6642f, 16.0f, 20.0f, 16.3358f, 20.0f, 16.75f)
        curveTo(20.0f, 17.1642f, 19.6642f, 17.5f, 19.25f, 17.5f)
        horizontalLineTo(15.9055f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0397f, 6.1523f)
        lineTo(10.4569f, 6.5f)
        horizontalLineTo(11.0f)
        horizontalLineTo(17.0f)
        curveTo(17.2761f, 6.5f, 17.5f, 6.7239f, 17.5f, 7.0f)
        verticalLineTo(14.0232f)
        horizontalLineTo(19.0f)
        verticalLineTo(7.0f)
        curveTo(19.0f, 5.8954f, 18.1046f, 5.0f, 17.0f, 5.0f)
        horizontalLineTo(11.0f)
        lineTo(8.2781f, 2.7318f)
        curveTo(8.0984f, 2.582f, 7.8719f, 2.5f, 7.6379f, 2.5f)
        horizontalLineTo(3.25f)
        curveTo(2.0074f, 2.5f, 1.0f, 3.5447f, 1.0f, 4.8333f)
        verticalLineTo(15.1667f)
        curveTo(1.0f, 16.4553f, 2.0074f, 17.5f, 3.25f, 17.5f)
        horizontalLineTo(3.9275f)
        verticalLineTo(16.0f)
        horizontalLineTo(3.25f)
        curveTo(2.8867f, 16.0f, 2.5f, 15.6788f, 2.5f, 15.1667f)
        verticalLineTo(4.8333f)
        curveTo(2.5f, 4.3212f, 2.8867f, 4.0f, 3.25f, 4.0f)
        horizontalLineTo(7.4569f)
        lineTo(10.0397f, 6.1523f)
        close()
    }
}
.build()
