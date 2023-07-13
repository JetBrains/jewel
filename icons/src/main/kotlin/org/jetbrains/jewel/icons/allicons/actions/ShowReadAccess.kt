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

public val ActionsGroup.ShowReadAccess: IntellijIconData
    get() {
        if (_showReadAccess != null) {
            return _showReadAccess!!
        }
        _showReadAccess = IntellijIconData(name = "ShowReadAccess",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ShowReadAccessComposable(it) })
        return _showReadAccess!!
    }

private var _showReadAccess: IntellijIconData? = null

private fun ShowReadAccessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ShowReadAccess", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(4.1465f, 4.6465f)
        curveTo(4.3417f, 4.4512f, 4.6583f, 4.4512f, 4.8536f, 4.6465f)
        curveTo(5.0489f, 4.8417f, 5.0489f, 5.1583f, 4.8536f, 5.3535f)
        lineTo(2.7071f, 7.5f)
        lineTo(8.7071f, 7.5f)
        curveTo(8.9832f, 7.5f, 9.2071f, 7.7239f, 9.2071f, 8.0f)
        curveTo(9.2071f, 8.2761f, 8.9832f, 8.5f, 8.7071f, 8.5f)
        lineTo(2.7071f, 8.5f)
        lineTo(4.8536f, 10.6464f)
        curveTo(5.0489f, 10.8417f, 5.0489f, 11.1583f, 4.8536f, 11.3536f)
        curveTo(4.6583f, 11.5488f, 4.3417f, 11.5488f, 4.1465f, 11.3536f)
        lineTo(1.1465f, 8.3535f)
        curveTo(1.0527f, 8.2598f, 1.0f, 8.1326f, 1.0f, 8.0f)
        curveTo(1.0f, 7.8674f, 1.0527f, 7.7402f, 1.1465f, 7.6465f)
        lineTo(4.1465f, 4.6465f)
        close()
    }
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.7063f, 6.5f)
        lineTo(10.5663f, 3.2522f)
        curveTo(10.7584f, 2.9168f, 11.2419f, 2.9168f, 11.4339f, 3.2522f)
        lineTo(13.8675f, 7.5014f)
        curveTo(14.0439f, 7.8095f, 14.044f, 8.1881f, 13.8676f, 8.4962f)
        lineTo(11.434f, 12.7477f)
        curveTo(11.2419f, 13.0833f, 10.7583f, 13.0833f, 10.5663f, 12.7477f)
        lineTo(8.7072f, 9.5f)
        horizontalLineTo(7.5548f)
        lineTo(9.6985f, 13.245f)
        curveTo(10.2747f, 14.2517f, 11.7256f, 14.2517f, 12.3017f, 13.245f)
        lineTo(14.7353f, 8.9936f)
        curveTo(15.0881f, 8.3773f, 15.088f, 7.6201f, 14.7351f, 7.0039f)
        lineTo(12.3016f, 2.7547f)
        curveTo(11.7253f, 1.7485f, 10.2749f, 1.7485f, 9.6987f, 2.7547f)
        lineTo(7.5537f, 6.5f)
        horizontalLineTo(8.7063f)
        close()
    }
}
.build()
