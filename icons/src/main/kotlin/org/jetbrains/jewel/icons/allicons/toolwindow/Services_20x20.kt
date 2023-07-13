package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Services_20x20: IntellijIconData
    get() {
        if (_services_20x20 != null) {
            return _services_20x20!!
        }
        _services_20x20 = IntellijIconData(name = "Services_20x20",size = DpSize(height = 20.0.dp,
                width = 20.0.dp),imageVector = { Services_20x20Composable(it) })
        return _services_20x20!!
    }

private var _services_20x20: IntellijIconData? = null

private fun Services_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Services_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(18.6913f, 9.4855f)
        curveTo(18.8813f, 9.8022f, 18.8813f, 10.1978f, 18.6913f, 10.5145f)
        lineTo(14.7913f, 17.0145f)
        curveTo(14.6106f, 17.3157f, 14.2851f, 17.5f, 13.9338f, 17.5f)
        lineTo(6.0662f, 17.5f)
        curveTo(5.7149f, 17.5f, 5.3894f, 17.3157f, 5.2087f, 17.0145f)
        lineTo(1.3087f, 10.5145f)
        curveTo(1.1187f, 10.1978f, 1.1187f, 9.8022f, 1.3087f, 9.4855f)
        lineTo(5.2087f, 2.9855f)
        curveTo(5.3894f, 2.6843f, 5.7149f, 2.5f, 6.0662f, 2.5f)
        lineTo(13.9338f, 2.5f)
        curveTo(14.2851f, 2.5f, 14.6106f, 2.6843f, 14.7913f, 2.9855f)
        lineTo(18.6913f, 9.4855f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.125f, 10.2165f)
        lineTo(8.125f, 13.6806f)
        curveTo(7.9583f, 13.7768f, 7.75f, 13.6566f, 7.75f, 13.4641f)
        lineTo(7.75f, 6.5359f)
        curveTo(7.75f, 6.3435f, 7.9583f, 6.2232f, 8.125f, 6.3194f)
        lineTo(14.125f, 9.7835f)
        curveTo(14.2917f, 9.8797f, 14.2917f, 10.1203f, 14.125f, 10.2165f)
        close()
    }
}
.build()
