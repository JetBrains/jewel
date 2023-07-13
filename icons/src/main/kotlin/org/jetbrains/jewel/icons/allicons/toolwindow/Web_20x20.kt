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

public val ToolwindowGroup.Web_20x20: IntellijIconData
    get() {
        if (_web_20x20 != null) {
            return _web_20x20!!
        }
        _web_20x20 = IntellijIconData(name = "Web_20x20",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { Web_20x20Composable(it) })
        return _web_20x20!!
    }

private var _web_20x20: IntellijIconData? = null

private fun Web_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Web_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 10.0f)
        moveToRelative(-8.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.25f, 10.0f)
        curveTo(13.25f, 12.3255f, 12.7844f, 14.4013f, 12.0974f, 15.8693f)
        curveTo(11.7533f, 16.6043f, 11.3679f, 17.1568f, 10.9857f, 17.5153f)
        curveTo(10.6037f, 17.8736f, 10.2693f, 18.0f, 10.0f, 18.0f)
        curveTo(9.7307f, 18.0f, 9.3963f, 17.8736f, 9.0143f, 17.5153f)
        curveTo(8.6321f, 17.1568f, 8.2467f, 16.6043f, 7.9026f, 15.8693f)
        curveTo(7.2156f, 14.4013f, 6.75f, 12.3255f, 6.75f, 10.0f)
        curveTo(6.75f, 7.6745f, 7.2156f, 5.5987f, 7.9026f, 4.1308f)
        curveTo(8.2467f, 3.3957f, 8.6321f, 2.8432f, 9.0143f, 2.4847f)
        curveTo(9.3963f, 2.1264f, 9.7307f, 2.0f, 10.0f, 2.0f)
        curveTo(10.2693f, 2.0f, 10.6037f, 2.1264f, 10.9857f, 2.4847f)
        curveTo(11.3679f, 2.8432f, 11.7533f, 3.3957f, 12.0974f, 4.1308f)
        curveTo(12.7844f, 5.5987f, 13.25f, 7.6745f, 13.25f, 10.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(17.5f, 7.25f)
        horizontalLineTo(2.4444f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(17.5f, 12.75f)
        horizontalLineTo(2.5f)
    }
}
.build()
