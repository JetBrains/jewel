package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.AutoscrollFromSource: IntellijIconData
    get() {
        if (_autoscrollFromSource != null) {
            return _autoscrollFromSource!!
        }
        _autoscrollFromSource = IntellijIconData(name = "AutoscrollFromSource",size = DpSize(height
                = 16.0.dp, width = 16.0.dp),imageVector = { AutoscrollFromSourceComposable(it) })
        return _autoscrollFromSource!!
    }

private var _autoscrollFromSource: IntellijIconData? = null

private fun AutoscrollFromSourceComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "AutoscrollFromSource", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 5.5f)
        curveTo(14.0f, 5.7761f, 13.7761f, 6.0f, 13.5f, 6.0f)
        curveTo(13.2239f, 6.0f, 13.0f, 5.7761f, 13.0f, 5.5f)
        verticalLineTo(3.0f)
        lineTo(3.0f, 3.0f)
        lineTo(3.0f, 5.5f)
        curveTo(3.0f, 5.7761f, 2.7761f, 6.0f, 2.5f, 6.0f)
        curveTo(2.2239f, 6.0f, 2.0f, 5.7761f, 2.0f, 5.5f)
        verticalLineTo(2.5f)
        curveTo(2.0f, 2.2239f, 2.2239f, 2.0f, 2.5f, 2.0f)
        horizontalLineTo(13.5f)
        curveTo(13.7761f, 2.0f, 14.0f, 2.2239f, 14.0f, 2.5f)
        verticalLineTo(5.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.1463f, 11.3537f)
        curveTo(4.9511f, 11.1584f, 4.9511f, 10.8418f, 5.1463f, 10.6465f)
        curveTo(5.3416f, 10.4513f, 5.6582f, 10.4513f, 5.8534f, 10.6465f)
        lineTo(7.5002f, 12.2932f)
        lineTo(7.5002f, 5.5f)
        curveTo(7.5002f, 5.2238f, 7.724f, 5.0f, 8.0002f, 5.0f)
        curveTo(8.2763f, 5.0f, 8.5002f, 5.2238f, 8.5002f, 5.5f)
        lineTo(8.5002f, 12.2927f)
        lineTo(10.1464f, 10.6464f)
        curveTo(10.3417f, 10.4511f, 10.6583f, 10.4511f, 10.8536f, 10.6464f)
        curveTo(11.0488f, 10.8417f, 11.0488f, 11.1583f, 10.8535f, 11.3535f)
        lineTo(8.3535f, 13.8536f)
        curveTo(8.1582f, 14.0488f, 7.8416f, 14.0488f, 7.6464f, 13.8536f)
        lineTo(5.1463f, 11.3537f)
        close()
    }
}
.build()
