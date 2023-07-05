package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Refresh: IntellijIconData
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = IntellijIconData(imageVector = { RefreshComposable(it) })
        return _refresh!!
    }

private var _refresh: IntellijIconData? = null

private fun RefreshComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Refresh", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 9.0f)
        verticalLineTo(8.0f)
        curveTo(2.5f, 4.9624f, 4.9624f, 2.5f, 8.0f, 2.5f)
        curveTo(9.1068f, 2.5f, 10.1372f, 2.8269f, 11.0f, 3.3895f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 12.6105f)
        curveTo(5.8628f, 13.1731f, 6.8932f, 13.5f, 8.0f, 13.5f)
        curveTo(11.0376f, 13.5f, 13.5f, 11.0376f, 13.5f, 8.0f)
        verticalLineTo(7.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(0.5f, 7.5003f)
        lineTo(2.5f, 9.5f)
        lineTo(4.5f, 7.5002f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 8.4998f)
        lineTo(13.5f, 6.5f)
        lineTo(15.5f, 8.4998f)
    }
}
.build()
