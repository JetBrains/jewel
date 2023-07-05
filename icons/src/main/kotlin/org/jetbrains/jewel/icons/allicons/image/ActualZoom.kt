package org.jetbrains.jewel.icons.allicons.image

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
import org.jetbrains.jewel.icons.allicons.ImageGroup

public val ImageGroup.ActualZoom: IntellijIconData
    get() {
        if (_actualZoom != null) {
            return _actualZoom!!
        }
        _actualZoom = IntellijIconData(imageVector = { ActualZoomComposable(it) })
        return _actualZoom!!
    }

private var _actualZoom: IntellijIconData? = null

private fun ActualZoomComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ActualZoom", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.346f, 12.0f)
        verticalLineTo(6.096f)
        horizontalLineTo(1.372f)
        verticalLineTo(4.872f)
        horizontalLineTo(2.488f)
        curveTo(2.732f, 4.872f, 2.946f, 4.82f, 3.13f, 4.716f)
        curveTo(3.318f, 4.612f, 3.462f, 4.464f, 3.562f, 4.272f)
        curveTo(3.662f, 4.08f, 3.712f, 3.856f, 3.712f, 3.6f)
        horizontalLineTo(3.718f)
        horizontalLineTo(4.816f)
        verticalLineTo(12.0f)
        horizontalLineTo(3.346f)
        close()
        moveTo(7.0691f, 10.398f)
        horizontalLineTo(8.6711f)
        verticalLineTo(12.0f)
        horizontalLineTo(7.0691f)
        verticalLineTo(10.398f)
        close()
        moveTo(7.0691f, 5.658f)
        horizontalLineTo(8.6711f)
        verticalLineTo(7.26f)
        horizontalLineTo(7.0691f)
        verticalLineTo(5.658f)
        close()
        moveTo(11.9621f, 12.0f)
        verticalLineTo(6.096f)
        horizontalLineTo(9.9881f)
        verticalLineTo(4.872f)
        horizontalLineTo(11.1041f)
        curveTo(11.3481f, 4.872f, 11.5621f, 4.82f, 11.7461f, 4.716f)
        curveTo(11.9341f, 4.612f, 12.0781f, 4.464f, 12.1781f, 4.272f)
        curveTo(12.2781f, 4.08f, 12.3281f, 3.856f, 12.3281f, 3.6f)
        horizontalLineTo(12.3341f)
        horizontalLineTo(13.4321f)
        verticalLineTo(12.0f)
        horizontalLineTo(11.9621f)
        close()
    }
}
.build()
