package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.ShowAsTree: IntellijIconData
    get() {
        if (_showAsTree != null) {
            return _showAsTree!!
        }
        _showAsTree = IntellijIconData(name = "ShowAsTree",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ShowAsTreeComposable(it) })
        return _showAsTree!!
    }

private var _showAsTree: IntellijIconData? = null

private fun ShowAsTreeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ShowAsTree", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 0.979592f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.9091f, 3.5055f)
        lineTo(12.0543f, 3.6605f)
        horizontalLineTo(12.2667f)
        lineTo(14.0f, 3.6605f)
        curveTo(14.2818f, 3.6605f, 14.5102f, 3.889f, 14.5102f, 4.1707f)
        verticalLineTo(6.9073f)
        curveTo(14.5102f, 7.3155f, 14.2421f, 7.5102f, 14.0667f, 7.5102f)
        horizontalLineTo(8.9333f)
        curveTo(8.7579f, 7.5102f, 8.4898f, 7.3155f, 8.4898f, 6.9073f)
        verticalLineTo(3.0927f)
        curveTo(8.4898f, 2.6845f, 8.7579f, 2.4898f, 8.9333f, 2.4898f)
        horizontalLineTo(10.9226f)
        curveTo(10.9452f, 2.4898f, 10.9668f, 2.4992f, 10.9822f, 2.5156f)
        lineTo(11.9091f, 3.5055f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 0.979592f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.9091f, 11.5055f)
        lineTo(12.0543f, 11.6605f)
        horizontalLineTo(12.2667f)
        lineTo(14.0f, 11.6605f)
        curveTo(14.2818f, 11.6605f, 14.5102f, 11.889f, 14.5102f, 12.1707f)
        verticalLineTo(14.9073f)
        curveTo(14.5102f, 15.3155f, 14.2421f, 15.5102f, 14.0667f, 15.5102f)
        horizontalLineTo(8.9333f)
        curveTo(8.7579f, 15.5102f, 8.4898f, 15.3155f, 8.4898f, 14.9073f)
        verticalLineTo(11.0927f)
        curveTo(8.4898f, 10.6845f, 8.7579f, 10.4898f, 8.9333f, 10.4898f)
        horizontalLineTo(10.9226f)
        curveTo(10.9452f, 10.4898f, 10.9668f, 10.4991f, 10.9822f, 10.5156f)
        lineTo(11.9091f, 11.5055f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 1.5f)
        verticalLineTo(4.5f)
        moveTo(1.5f, 4.5f)
        horizontalLineTo(6.5f)
        moveTo(1.5f, 4.5f)
        verticalLineTo(12.0f)
        curveTo(1.5f, 12.2761f, 1.7239f, 12.5f, 2.0f, 12.5f)
        horizontalLineTo(6.5f)
    }
}
.build()
