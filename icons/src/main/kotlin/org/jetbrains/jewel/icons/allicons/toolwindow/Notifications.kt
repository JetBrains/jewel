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
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Notifications: IntellijIconData
    get() {
        if (_notifications != null) {
            return _notifications!!
        }
        _notifications = IntellijIconData(imageVector = { NotificationsComposable(it) })
        return _notifications!!
    }

private var _notifications: IntellijIconData? = null

private fun NotificationsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Notifications", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 0.915741f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.9567f, 14.4579f)
        horizontalLineTo(9.0494f)
        curveTo(8.9929f, 14.5871f, 8.9123f, 14.7059f, 8.8107f, 14.8076f)
        curveTo(8.5965f, 15.0218f, 8.306f, 15.1421f, 8.0031f, 15.1421f)
        curveTo(7.7002f, 15.1421f, 7.4097f, 15.0218f, 7.1955f, 14.8076f)
        curveTo(7.0938f, 14.7059f, 7.0133f, 14.5871f, 6.9567f, 14.4579f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.9472f, 8.2236f)
        curveTo(3.9819f, 8.1542f, 4.0f, 8.0776f, 4.0f, 8.0f)
        verticalLineTo(6.0f)
        curveTo(4.0f, 4.2926f, 4.5711f, 3.1851f, 5.3241f, 2.5001f)
        curveTo(6.0881f, 1.805f, 7.0866f, 1.502f, 8.0011f, 1.5f)
        lineTo(8.0039f, 1.5f)
        lineTo(8.0045f, 1.5f)
        lineTo(8.0046f, 1.5f)
        horizontalLineTo(8.0054f)
        lineTo(8.0062f, 1.5f)
        lineTo(8.0089f, 1.5f)
        curveTo(8.9233f, 1.502f, 9.919f, 1.8049f, 10.6804f, 2.4996f)
        curveTo(11.431f, 3.1844f, 12.0f, 4.2919f, 12.0f, 6.0f)
        verticalLineTo(8.0f)
        curveTo(12.0f, 8.0776f, 12.0181f, 8.1542f, 12.0528f, 8.2236f)
        lineTo(13.8492f, 11.8164f)
        curveTo(14.0062f, 12.1305f, 13.7779f, 12.5f, 13.4267f, 12.5f)
        horizontalLineTo(2.5733f)
        curveTo(2.2221f, 12.5f, 1.9938f, 12.1305f, 2.1508f, 11.8164f)
        lineTo(3.9472f, 8.2236f)
        close()
    }
}
.build()
