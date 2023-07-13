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

public val ToolwindowGroup.Debug_20x20: IntellijIconData
    get() {
        if (_debug_20x20 != null) {
            return _debug_20x20!!
        }
        _debug_20x20 = IntellijIconData(name = "Debug_20x20",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { Debug_20x20Composable(it) })
        return _debug_20x20!!
    }

private var _debug_20x20: IntellijIconData? = null

private fun Debug_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Debug_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(18.5f, 11.75f)
        curveTo(18.9142f, 11.75f, 19.25f, 11.4142f, 19.25f, 11.0f)
        curveTo(19.25f, 10.5858f, 18.9142f, 10.25f, 18.5f, 10.25f)
        verticalLineTo(11.75f)
        close()
        moveTo(14.0f, 11.75f)
        horizontalLineTo(18.5f)
        verticalLineTo(10.25f)
        horizontalLineTo(14.0f)
        verticalLineTo(11.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(17.8553f, 6.9876f)
        curveTo(18.2201f, 6.7914f, 18.3568f, 6.3367f, 18.1607f, 5.9718f)
        curveTo(17.9645f, 5.607f, 17.5098f, 5.4703f, 17.1449f, 5.6665f)
        lineTo(17.8553f, 6.9876f)
        close()
        moveTo(14.7438f, 8.6606f)
        lineTo(17.8553f, 6.9876f)
        lineTo(17.1449f, 5.6665f)
        lineTo(14.0335f, 7.3394f)
        lineTo(14.7438f, 8.6606f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(17.8553f, 15.0124f)
        curveTo(18.2201f, 15.2086f, 18.3568f, 15.6633f, 18.1607f, 16.0281f)
        curveTo(17.9645f, 16.393f, 17.5098f, 16.5297f, 17.1449f, 16.3335f)
        lineTo(17.8553f, 15.0124f)
        close()
        moveTo(14.7438f, 13.3394f)
        lineTo(17.8553f, 15.0124f)
        lineTo(17.1449f, 16.3335f)
        lineTo(14.0335f, 14.6606f)
        lineTo(14.7438f, 13.3394f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.1428f, 6.9876f)
        curveTo(1.7779f, 6.7914f, 1.6412f, 6.3367f, 1.8374f, 5.9718f)
        curveTo(2.0335f, 5.607f, 2.4883f, 5.4703f, 2.8531f, 5.6665f)
        lineTo(2.1428f, 6.9876f)
        close()
        moveTo(5.2542f, 8.6606f)
        lineTo(2.1428f, 6.9876f)
        lineTo(2.8531f, 5.6665f)
        lineTo(5.9646f, 7.3394f)
        lineTo(5.2542f, 8.6606f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.1428f, 15.0124f)
        curveTo(1.7779f, 15.2086f, 1.6412f, 15.6633f, 1.8374f, 16.0281f)
        curveTo(2.0335f, 16.393f, 2.4883f, 16.5297f, 2.8531f, 16.3335f)
        lineTo(2.1428f, 15.0124f)
        close()
        moveTo(5.2542f, 13.3394f)
        lineTo(2.1428f, 15.0124f)
        lineTo(2.8531f, 16.3335f)
        lineTo(5.9646f, 14.6606f)
        lineTo(5.2542f, 13.3394f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 11.75f)
        curveTo(1.0858f, 11.75f, 0.75f, 11.4142f, 0.75f, 11.0f)
        curveTo(0.75f, 10.5858f, 1.0858f, 10.25f, 1.5f, 10.25f)
        verticalLineTo(11.75f)
        close()
        moveTo(6.0f, 11.75f)
        horizontalLineTo(1.5f)
        verticalLineTo(10.25f)
        horizontalLineTo(6.0f)
        verticalLineTo(11.75f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 5.75f)
        horizontalLineTo(11.5f)
        curveTo(13.2949f, 5.75f, 14.75f, 7.2051f, 14.75f, 9.0f)
        verticalLineTo(12.5f)
        curveTo(14.75f, 15.1234f, 12.6234f, 17.25f, 10.0f, 17.25f)
        curveTo(7.3766f, 17.25f, 5.25f, 15.1234f, 5.25f, 12.5f)
        verticalLineTo(9.0f)
        curveTo(5.25f, 7.2051f, 6.7051f, 5.75f, 8.5f, 5.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0002f, 5.0309f)
        curveTo(8.0001f, 5.0206f, 8.0f, 5.0103f, 8.0f, 5.0f)
        curveTo(8.0f, 3.8954f, 8.8954f, 3.0f, 10.0f, 3.0f)
        curveTo(11.1046f, 3.0f, 12.0f, 3.8954f, 12.0f, 5.0f)
        curveTo(12.0f, 5.0103f, 11.9999f, 5.0206f, 11.9998f, 5.0309f)
        curveTo(12.5259f, 5.0965f, 13.0204f, 5.2643f, 13.4626f, 5.5137f)
        curveTo(13.4872f, 5.3461f, 13.5f, 5.1745f, 13.5f, 5.0f)
        curveTo(13.5f, 3.067f, 11.933f, 1.5f, 10.0f, 1.5f)
        curveTo(8.067f, 1.5f, 6.5f, 3.067f, 6.5f, 5.0f)
        curveTo(6.5f, 5.1745f, 6.5128f, 5.3461f, 6.5374f, 5.5137f)
        curveTo(6.9797f, 5.2643f, 7.4741f, 5.0965f, 8.0002f, 5.0309f)
        close()
    }
}
.build()
