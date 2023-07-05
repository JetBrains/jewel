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
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.ApplicationRemote: IntellijIconData
    get() {
        if (_applicationRemote != null) {
            return _applicationRemote!!
        }
        _applicationRemote = IntellijIconData(imageVector = { ApplicationRemoteComposable(it) })
        return _applicationRemote!!
    }

private var _applicationRemote: IntellijIconData? = null

private fun ApplicationRemoteComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ApplicationRemote", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 2.0f)
        curveTo(1.8954f, 2.0f, 1.0f, 2.8954f, 1.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(1.0f, 13.1046f, 1.8954f, 14.0f, 3.0f, 14.0f)
        horizontalLineTo(10.8787f)
        lineTo(11.9736f, 12.905f)
        curveTo(11.4048f, 12.6919f, 11.0f, 12.1432f, 11.0f, 11.5f)
        curveTo(11.0f, 10.6716f, 11.6716f, 10.0f, 12.5f, 10.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(4.0f)
        curveTo(15.0f, 2.8954f, 14.1046f, 2.0f, 13.0f, 2.0f)
        horizontalLineTo(3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 3.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 3.0f, 14.0f, 3.4477f, 14.0f, 4.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(4.0f)
        curveTo(15.0f, 2.8954f, 14.1046f, 2.0f, 13.0f, 2.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 2.0f, 1.0f, 2.8954f, 1.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(1.0f, 13.1046f, 1.8954f, 14.0f, 3.0f, 14.0f)
        horizontalLineTo(10.8787f)
        lineTo(11.8787f, 13.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
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
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.5f, 11.0f)
        curveTo(12.2239f, 11.0f, 12.0f, 11.2239f, 12.0f, 11.5f)
        curveTo(12.0f, 11.7761f, 12.2239f, 12.0f, 12.5f, 12.0f)
        horizontalLineTo(14.2929f)
        lineTo(11.1464f, 15.1464f)
        curveTo(10.9512f, 15.3417f, 10.9512f, 15.6583f, 11.1464f, 15.8535f)
        curveTo(11.3417f, 16.0488f, 11.6583f, 16.0488f, 11.8536f, 15.8535f)
        lineTo(15.0f, 12.7071f)
        verticalLineTo(14.5f)
        curveTo(15.0f, 14.7761f, 15.2239f, 15.0f, 15.5f, 15.0f)
        curveTo(15.7761f, 15.0f, 16.0f, 14.7761f, 16.0f, 14.5f)
        verticalLineTo(11.5f)
        curveTo(16.0f, 11.2239f, 15.7761f, 11.0f, 15.5f, 11.0f)
        horizontalLineTo(12.5f)
        close()
    }
}
.build()
