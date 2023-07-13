package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.ShowWriteAccess: IntellijIconData
    get() {
        if (_showWriteAccess != null) {
            return _showWriteAccess!!
        }
        _showWriteAccess = IntellijIconData(name = "ShowWriteAccess",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ShowWriteAccessComposable(it) })
        return _showWriteAccess!!
    }

private var _showWriteAccess: IntellijIconData? = null

private fun ShowWriteAccessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ShowWriteAccess", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.8535f, 11.3536f)
        curveTo(5.6583f, 11.5488f, 5.3417f, 11.5488f, 5.1465f, 11.3536f)
        curveTo(4.9512f, 11.1583f, 4.9512f, 10.8417f, 5.1465f, 10.6464f)
        lineTo(7.2929f, 8.5f)
        horizontalLineTo(1.5f)
        curveTo(1.2239f, 8.5f, 1.0f, 8.2761f, 1.0f, 8.0f)
        curveTo(1.0f, 7.7239f, 1.2239f, 7.5f, 1.5f, 7.5f)
        lineTo(7.2929f, 7.5f)
        lineTo(5.1465f, 5.3535f)
        curveTo(4.9512f, 5.1583f, 4.9512f, 4.8417f, 5.1465f, 4.6465f)
        curveTo(5.3417f, 4.4512f, 5.6583f, 4.4512f, 5.8535f, 4.6465f)
        lineTo(8.8535f, 7.6465f)
        curveTo(9.0488f, 7.8417f, 9.0488f, 8.1583f, 8.8535f, 8.3535f)
        lineTo(5.8535f, 11.3536f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.8569f, 6.2358f)
        lineTo(10.5656f, 3.2522f)
        curveTo(10.7577f, 2.9168f, 11.2412f, 2.9168f, 11.4333f, 3.2522f)
        lineTo(13.8668f, 7.5014f)
        curveTo(14.0432f, 7.8095f, 14.0433f, 8.1881f, 13.8669f, 8.4962f)
        lineTo(11.4333f, 12.7477f)
        curveTo(11.2412f, 13.0833f, 10.7576f, 13.0833f, 10.5656f, 12.7477f)
        lineTo(8.8574f, 9.7636f)
        lineTo(8.1245f, 10.4965f)
        lineTo(9.6978f, 13.245f)
        curveTo(10.274f, 14.2517f, 11.7249f, 14.2517f, 12.3011f, 13.245f)
        lineTo(14.7346f, 8.9936f)
        curveTo(15.0874f, 8.3773f, 15.0873f, 7.6201f, 14.7344f, 7.0039f)
        lineTo(12.3009f, 2.7547f)
        curveTo(11.7246f, 1.7485f, 10.2743f, 1.7485f, 9.698f, 2.7547f)
        lineTo(8.124f, 5.503f)
        lineTo(8.8569f, 6.2358f)
        close()
    }
}
.build()
