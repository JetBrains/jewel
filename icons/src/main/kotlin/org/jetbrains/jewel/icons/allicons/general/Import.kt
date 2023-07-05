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
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Import: IntellijIconData
    get() {
        if (_import != null) {
            return _import!!
        }
        _import = IntellijIconData(imageVector = { ImportComposable(it) })
        return _import!!
    }

private var _import: IntellijIconData? = null

private fun ImportComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Import", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0379f, 8.6914f)
        curveTo(7.062f, 8.7495f, 7.0974f, 8.804f, 7.1443f, 8.8514f)
        curveTo(7.1457f, 8.8528f, 7.1472f, 8.8543f, 7.1486f, 8.8557f)
        curveTo(7.2389f, 8.9449f, 7.363f, 9.0f, 7.5f, 9.0f)
        horizontalLineTo(7.5001f)
        horizontalLineTo(11.5f)
        curveTo(11.7761f, 9.0f, 12.0f, 8.7761f, 12.0f, 8.5f)
        curveTo(12.0f, 8.2239f, 11.7761f, 8.0f, 11.5f, 8.0f)
        horizontalLineTo(8.7071f)
        lineTo(13.8536f, 2.8535f)
        curveTo(14.0488f, 2.6583f, 14.0488f, 2.3417f, 13.8536f, 2.1465f)
        curveTo(13.6583f, 1.9512f, 13.3417f, 1.9512f, 13.1464f, 2.1465f)
        lineTo(8.0f, 7.2929f)
        verticalLineTo(4.5f)
        curveTo(8.0f, 4.2239f, 7.7761f, 4.0f, 7.5f, 4.0f)
        curveTo(7.2239f, 4.0f, 7.0f, 4.2239f, 7.0f, 4.5f)
        verticalLineTo(8.4997f)
        curveTo(7.0f, 8.5008f, 7.0f, 8.5019f, 7.0f, 8.503f)
        curveTo(7.0004f, 8.5671f, 7.013f, 8.6312f, 7.0379f, 8.6914f)
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
