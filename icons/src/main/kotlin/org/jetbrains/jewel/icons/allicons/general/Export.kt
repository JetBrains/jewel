package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Export: IntellijIconData
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = IntellijIconData(name = "Export",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ExportComposable(it) })
        return _export!!
    }

private var _export: IntellijIconData? = null

private fun ExportComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Export", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.9621f, 2.3086f)
        curveTo(13.938f, 2.2505f, 13.9026f, 2.196f, 13.8557f, 2.1486f)
        curveTo(13.8543f, 2.1472f, 13.8528f, 2.1457f, 13.8514f, 2.1443f)
        curveTo(13.7611f, 2.0551f, 13.637f, 2.0f, 13.5f, 2.0f)
        horizontalLineTo(13.4999f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 2.0f, 9.0f, 2.2239f, 9.0f, 2.5f)
        curveTo(9.0f, 2.7761f, 9.2239f, 3.0f, 9.5f, 3.0f)
        horizontalLineTo(12.2929f)
        lineTo(7.1465f, 8.1465f)
        curveTo(6.9512f, 8.3417f, 6.9512f, 8.6583f, 7.1465f, 8.8535f)
        curveTo(7.3417f, 9.0488f, 7.6583f, 9.0488f, 7.8535f, 8.8535f)
        lineTo(13.0f, 3.7071f)
        verticalLineTo(6.5f)
        curveTo(13.0f, 6.7761f, 13.2239f, 7.0f, 13.5f, 7.0f)
        curveTo(13.7761f, 7.0f, 14.0f, 6.7761f, 14.0f, 6.5f)
        verticalLineTo(2.5003f)
        curveTo(14.0f, 2.4992f, 14.0f, 2.4981f, 14.0f, 2.497f)
        curveTo(13.9996f, 2.4329f, 13.987f, 2.3688f, 13.9621f, 2.3086f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 4.5f)
        verticalLineTo(12.0f)
        curveTo(2.5f, 12.8284f, 3.1716f, 13.5f, 4.0f, 13.5f)
        horizontalLineTo(11.5f)
    }
}
.build()
