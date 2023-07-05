package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Services: IntellijIconData
    get() {
        if (_services != null) {
            return _services!!
        }
        _services = IntellijIconData(imageVector = { ServicesComposable(it) })
        return _services!!
    }

private var _services: IntellijIconData? = null

private fun ServicesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Services", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(15.2117f, 7.5003f)
        curveTo(15.3901f, 7.8095f, 15.3901f, 8.1905f, 15.2117f, 8.4997f)
        lineTo(12.0386f, 13.9997f)
        curveTo(11.86f, 14.3093f, 11.5298f, 14.5f, 11.1724f, 14.5f)
        lineTo(4.8276f, 14.5f)
        curveTo(4.4702f, 14.5f, 4.14f, 14.3093f, 3.9614f, 13.9997f)
        lineTo(0.7883f, 8.4997f)
        curveTo(0.6099f, 8.1905f, 0.6099f, 7.8095f, 0.7883f, 7.5003f)
        lineTo(3.9614f, 2.0003f)
        curveTo(4.14f, 1.6907f, 4.4702f, 1.5f, 4.8276f, 1.5f)
        lineTo(11.1724f, 1.5f)
        curveTo(11.5298f, 1.5f, 11.86f, 1.6907f, 12.0386f, 2.0003f)
        lineTo(15.2117f, 7.5003f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 8.433f)
        lineTo(6.75f, 10.5981f)
        curveTo(6.4167f, 10.7905f, 6.0f, 10.55f, 6.0f, 10.1651f)
        lineTo(6.0f, 5.8349f)
        curveTo(6.0f, 5.45f, 6.4167f, 5.2095f, 6.75f, 5.4019f)
        lineTo(10.5f, 7.567f)
        curveTo(10.8333f, 7.7594f, 10.8333f, 8.2406f, 10.5f, 8.433f)
        close()
    }
}
.build()
