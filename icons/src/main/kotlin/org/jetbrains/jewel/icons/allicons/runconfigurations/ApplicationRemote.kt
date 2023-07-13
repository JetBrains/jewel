package org.jetbrains.jewel.icons.allicons.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.ApplicationRemote: IntellijIconData
    get() {
        if (_applicationRemote != null) {
            return _applicationRemote!!
        }
        _applicationRemote = IntellijIconData(name = "ApplicationRemote",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { ApplicationRemoteComposable(it) })
        return _applicationRemote!!
    }

private var _applicationRemote: IntellijIconData? = null

private fun ApplicationRemoteComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ApplicationRemote", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0f, 10.5f)
        curveTo(11.0f, 10.2239f, 11.2239f, 10.0f, 11.5f, 10.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 10.0f, 16.0f, 10.2239f, 16.0f, 10.5f)
        verticalLineTo(14.5f)
        curveTo(16.0f, 14.7761f, 15.7761f, 15.0f, 15.5f, 15.0f)
        curveTo(15.2239f, 15.0f, 15.0f, 14.7761f, 15.0f, 14.5f)
        verticalLineTo(11.7071f)
        lineTo(10.8536f, 15.8536f)
        curveTo(10.6583f, 16.0488f, 10.3417f, 16.0488f, 10.1464f, 15.8536f)
        curveTo(9.9512f, 15.6583f, 9.9512f, 15.3417f, 10.1464f, 15.1464f)
        lineTo(14.2929f, 11.0f)
        horizontalLineTo(11.5f)
        curveTo(11.2239f, 11.0f, 11.0f, 10.7761f, 11.0f, 10.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 4.0f)
        curveTo(1.0f, 2.8954f, 1.8954f, 2.0f, 3.0f, 2.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 2.0f, 15.0f, 2.8954f, 15.0f, 4.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(11.5f)
        curveTo(10.6716f, 9.0f, 10.0f, 9.6716f, 10.0f, 10.5f)
        curveTo(10.0f, 11.3284f, 10.6716f, 12.0f, 11.5f, 12.0f)
        horizontalLineTo(11.8789f)
        lineTo(9.8789f, 14.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 14.0f, 1.0f, 13.1046f, 1.0f, 12.0f)
        verticalLineTo(4.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 5.5f)
        horizontalLineTo(5.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.0f, 5.5f)
        horizontalLineTo(8.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 3.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
        horizontalLineTo(10.8789f)
        lineTo(9.8789f, 14.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 14.0f, 1.0f, 13.1046f, 1.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(1.0f, 2.8954f, 1.8954f, 2.0f, 3.0f, 2.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 2.0f, 15.0f, 2.8954f, 15.0f, 4.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(4.0f)
        curveTo(14.0f, 3.4477f, 13.5523f, 3.0f, 13.0f, 3.0f)
        close()
    }
}
.build()
