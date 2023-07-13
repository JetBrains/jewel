package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Notifications_20x20: IntellijIconData
    get() {
        if (_notifications_20x20 != null) {
            return _notifications_20x20!!
        }
        _notifications_20x20 = IntellijIconData(name = "Notifications_20x20",size = DpSize(height =
                20.0.dp, width = 20.0.dp),imageVector = { Notifications_20x20Composable(it) })
        return _notifications_20x20!!
    }

private var _notifications_20x20: IntellijIconData? = null

private fun Notifications_20x20Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "Notifications_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.12498f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.6772f, 17.5625f)
        horizontalLineTo(11.3229f)
        curveTo(11.2515f, 17.7305f, 11.148f, 17.8849f, 11.0165f, 18.0164f)
        curveTo(10.7469f, 18.286f, 10.3813f, 18.4375f, 10.0f, 18.4375f)
        curveTo(9.6188f, 18.4375f, 9.2531f, 18.286f, 8.9836f, 18.0164f)
        curveTo(8.852f, 17.8849f, 8.7486f, 17.7305f, 8.6772f, 17.5625f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.6708f, 10.3354f)
        curveTo(4.7229f, 10.2313f, 4.75f, 10.1164f, 4.75f, 10.0f)
        verticalLineTo(7.0f)
        curveTo(4.75f, 4.9706f, 5.5268f, 3.691f, 6.5272f, 2.9012f)
        curveTo(7.5561f, 2.0889f, 8.8818f, 1.75f, 10.0f, 1.75f)
        curveTo(11.1182f, 1.75f, 12.4439f, 2.0889f, 13.4728f, 2.9012f)
        curveTo(14.4732f, 3.691f, 15.25f, 4.9706f, 15.25f, 7.0f)
        verticalLineTo(10.0f)
        curveTo(15.25f, 10.1164f, 15.2771f, 10.2313f, 15.3292f, 10.3354f)
        lineTo(17.4648f, 14.6067f)
        curveTo(17.6126f, 14.9023f, 17.3977f, 15.25f, 17.0672f, 15.25f)
        horizontalLineTo(2.9327f)
        curveTo(2.6023f, 15.25f, 2.3874f, 14.9023f, 2.5352f, 14.6067f)
        lineTo(4.6708f, 10.3354f)
        close()
    }
}
.build()
