package org.jetbrains.jewel.icons.allicons.runconfigurations

import androidx.compose.ui.graphics.Color
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

public val RunconfigurationsGroup.Application: IntellijIconData
    get() {
        if (_application != null) {
            return _application!!
        }
        _application = IntellijIconData(name = "Application",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ApplicationComposable(it) })
        return _application!!
    }

private var _application: IntellijIconData? = null

private fun ApplicationComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Application", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 2.5f)
        lineTo(13.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 4.0f)
        lineTo(14.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 13.5f)
        lineTo(3.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 12.0f)
        lineTo(1.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 5.5f)
        horizontalLineTo(5.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.0f, 5.5f)
        horizontalLineTo(8.0f)
    }
}
.build()
