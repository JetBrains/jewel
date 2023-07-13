package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.ReadAccess: IntellijIconData
    get() {
        if (_readAccess != null) {
            return _readAccess!!
        }
        _readAccess = IntellijIconData(name = "ReadAccess",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { ReadAccessComposable(it) })
        return _readAccess!!
    }

private var _readAccess: IntellijIconData? = null

private fun ReadAccessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ReadAccess", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.1463f, 3.6465f)
        curveTo(3.3416f, 3.4512f, 3.6582f, 3.4512f, 3.8535f, 3.6465f)
        curveTo(4.0487f, 3.8417f, 4.0487f, 4.1583f, 3.8535f, 4.3535f)
        lineTo(1.707f, 6.5f)
        lineTo(7.707f, 6.5f)
        curveTo(7.9831f, 6.5f, 8.207f, 6.7239f, 8.207f, 7.0f)
        curveTo(8.207f, 7.2761f, 7.9831f, 7.5f, 7.707f, 7.5f)
        lineTo(1.707f, 7.5f)
        lineTo(3.8535f, 9.6465f)
        curveTo(4.0487f, 9.8417f, 4.0487f, 10.1583f, 3.8535f, 10.3536f)
        curveTo(3.6582f, 10.5488f, 3.3416f, 10.5488f, 3.1463f, 10.3536f)
        lineTo(0.1463f, 7.3535f)
        curveTo(0.0526f, 7.2598f, -1.0E-4f, 7.1326f, -1.0E-4f, 7.0f)
        curveTo(-1.0E-4f, 6.8674f, 0.0526f, 6.7402f, 0.1463f, 6.6465f)
        lineTo(3.1463f, 3.6465f)
        close()
    }
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.7059f, 5.5f)
        lineTo(9.5659f, 2.2522f)
        curveTo(9.758f, 1.9168f, 10.2415f, 1.9168f, 10.4336f, 2.2522f)
        lineTo(12.8671f, 6.5014f)
        curveTo(13.0436f, 6.8095f, 13.0436f, 7.1881f, 12.8672f, 7.4962f)
        lineTo(10.4336f, 11.7477f)
        curveTo(10.2416f, 12.0833f, 9.7579f, 12.0833f, 9.5659f, 11.7477f)
        lineTo(7.7069f, 8.5f)
        horizontalLineTo(6.5545f)
        lineTo(8.6981f, 12.245f)
        curveTo(9.2743f, 13.2517f, 10.7252f, 13.2517f, 11.3014f, 12.245f)
        lineTo(13.735f, 7.9935f)
        curveTo(14.0877f, 7.3773f, 14.0876f, 6.6201f, 13.7347f, 6.0039f)
        lineTo(11.3012f, 1.7547f)
        curveTo(10.7249f, 0.7484f, 9.2746f, 0.7484f, 8.6983f, 1.7547f)
        lineTo(6.5533f, 5.5f)
        horizontalLineTo(7.7059f)
        close()
    }
}
.build()
