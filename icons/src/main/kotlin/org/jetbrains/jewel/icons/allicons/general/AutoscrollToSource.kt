package org.jetbrains.jewel.icons.allicons.general

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

public val GeneralGroup.AutoscrollToSource: IntellijIconData
    get() {
        if (_autoscrollToSource != null) {
            return _autoscrollToSource!!
        }
        _autoscrollToSource = IntellijIconData(imageVector = { AutoscrollToSourceComposable(it) })
        return _autoscrollToSource!!
    }

private var _autoscrollToSource: IntellijIconData? = null

private fun AutoscrollToSourceComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "AutoscrollToSource", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.5f, 6.0f)
        curveTo(13.7761f, 6.0f, 14.0f, 5.7761f, 14.0f, 5.5f)
        verticalLineTo(2.5f)
        curveTo(14.0f, 2.2239f, 13.7761f, 2.0f, 13.5f, 2.0f)
        horizontalLineTo(2.5f)
        curveTo(2.2239f, 2.0f, 2.0f, 2.2239f, 2.0f, 2.5f)
        verticalLineTo(5.5f)
        curveTo(2.0f, 5.7761f, 2.2239f, 6.0f, 2.5f, 6.0f)
        curveTo(2.7761f, 6.0f, 3.0f, 5.7761f, 3.0f, 5.5f)
        lineTo(3.0f, 3.0f)
        lineTo(13.0f, 3.0f)
        verticalLineTo(5.5f)
        curveTo(13.0f, 5.7761f, 13.2239f, 6.0f, 13.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.1464f, 8.3534f)
        curveTo(4.9512f, 8.1582f, 4.9512f, 7.8416f, 5.1465f, 7.6463f)
        lineTo(7.6465f, 5.1464f)
        curveTo(7.8418f, 4.9512f, 8.1583f, 4.9512f, 8.3536f, 5.1464f)
        lineTo(10.8537f, 7.6465f)
        curveTo(11.0489f, 7.8418f, 11.0489f, 8.1583f, 10.8537f, 8.3536f)
        curveTo(10.6584f, 8.5489f, 10.3418f, 8.5489f, 10.1466f, 8.3536f)
        lineTo(8.5003f, 6.7073f)
        lineTo(8.5003f, 13.5f)
        curveTo(8.5003f, 13.7762f, 8.2764f, 14.0f, 8.0003f, 14.0f)
        curveTo(7.7241f, 14.0f, 7.5003f, 13.7762f, 7.5003f, 13.5f)
        lineTo(7.5003f, 6.7068f)
        lineTo(5.8535f, 8.3535f)
        curveTo(5.6583f, 8.5487f, 5.3417f, 8.5487f, 5.1464f, 8.3534f)
        close()
    }
}
.build()
