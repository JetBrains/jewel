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

public val GutterGroup.WriteAccess: IntellijIconData
    get() {
        if (_writeAccess != null) {
            return _writeAccess!!
        }
        _writeAccess = IntellijIconData(name = "WriteAccess",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { WriteAccessComposable(it) })
        return _writeAccess!!
    }

private var _writeAccess: IntellijIconData? = null

private fun WriteAccessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "WriteAccess", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(4.8534f, 10.3536f)
        curveTo(4.6582f, 10.5488f, 4.3416f, 10.5488f, 4.1463f, 10.3536f)
        curveTo(3.9511f, 10.1583f, 3.9511f, 9.8417f, 4.1463f, 9.6465f)
        lineTo(6.2928f, 7.5f)
        lineTo(0.4999f, 7.5f)
        curveTo(0.2237f, 7.5f, -1.0E-4f, 7.2761f, -1.0E-4f, 7.0f)
        curveTo(-1.0E-4f, 6.7239f, 0.2237f, 6.5f, 0.4999f, 6.5f)
        lineTo(6.2928f, 6.5f)
        lineTo(4.1463f, 4.3535f)
        curveTo(3.9511f, 4.1583f, 3.9511f, 3.8417f, 4.1463f, 3.6465f)
        curveTo(4.3416f, 3.4512f, 4.6582f, 3.4512f, 4.8534f, 3.6465f)
        lineTo(7.8534f, 6.6465f)
        curveTo(8.0487f, 6.8417f, 8.0487f, 7.1583f, 7.8534f, 7.3535f)
        lineTo(4.8534f, 10.3536f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.8571f, 5.2358f)
        lineTo(9.5659f, 2.2522f)
        curveTo(9.7579f, 1.9168f, 10.2414f, 1.9168f, 10.4335f, 2.2522f)
        lineTo(12.867f, 6.5014f)
        curveTo(13.0435f, 6.8095f, 13.0435f, 7.1881f, 12.8671f, 7.4962f)
        lineTo(10.4336f, 11.7477f)
        curveTo(10.2415f, 12.0833f, 9.7579f, 12.0833f, 9.5658f, 11.7477f)
        lineTo(7.8577f, 8.7636f)
        lineTo(7.1248f, 9.4965f)
        lineTo(8.6981f, 12.245f)
        curveTo(9.2743f, 13.2517f, 10.7251f, 13.2517f, 11.3013f, 12.245f)
        lineTo(13.7349f, 7.9935f)
        curveTo(14.0876f, 7.3773f, 14.0876f, 6.6201f, 13.7347f, 6.0039f)
        lineTo(11.3011f, 1.7547f)
        curveTo(10.7249f, 0.7484f, 9.2745f, 0.7484f, 8.6982f, 1.7547f)
        lineTo(7.1243f, 4.503f)
        lineTo(7.8571f, 5.2358f)
        close()
    }
}
.build()
