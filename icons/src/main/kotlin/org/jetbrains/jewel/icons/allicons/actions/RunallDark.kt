package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.RunallDark: ImageVector
    get() {
        if (_runallDark != null) {
            return _runallDark!!
        }
        _runallDark = Builder(name = "RunallDark", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF253627)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3556f, 7.2593f)
                curveTo(9.8164f, 7.6581f, 9.8164f, 8.3728f, 9.3556f, 8.7716f)
                lineTo(4.1568f, 13.2709f)
                curveTo(3.5091f, 13.8315f, 2.5024f, 13.3714f, 2.5024f, 12.5148f)
                lineTo(2.5024f, 3.5161f)
                curveTo(2.5024f, 2.6595f, 3.5091f, 2.1994f, 4.1568f, 2.76f)
                lineTo(9.3556f, 7.2593f)
                close()
            }
            path(fill = SolidColor(Color(0xFF57965C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.6828f, 6.8812f)
                curveTo(10.374f, 7.4794f, 10.374f, 8.5514f, 9.6828f, 9.1496f)
                lineTo(4.484f, 13.649f)
                curveTo(3.5124f, 14.4898f, 2.0024f, 13.7997f, 2.0024f, 12.5148f)
                lineTo(2.0024f, 3.5161f)
                curveTo(2.0024f, 2.2312f, 3.5124f, 1.541f, 4.484f, 2.3819f)
                lineTo(9.6828f, 6.8812f)
                close()
                moveTo(9.0284f, 8.3935f)
                curveTo(9.2588f, 8.1941f, 9.2588f, 7.8368f, 9.0284f, 7.6374f)
                lineTo(3.8296f, 3.138f)
                curveTo(3.5057f, 2.8577f, 3.0024f, 3.0878f, 3.0024f, 3.5161f)
                lineTo(3.0024f, 12.5148f)
                curveTo(3.0024f, 12.9431f, 3.5057f, 13.1731f, 3.8296f, 12.8928f)
                lineTo(9.0284f, 8.3935f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF57965C)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8576f, 2.5f)
                lineTo(13.3568f, 7.2593f)
                curveTo(13.8176f, 7.6581f, 13.8176f, 8.3728f, 13.3568f, 8.7716f)
                lineTo(7.8933f, 13.5f)
            }
        }
        .build()
        return _runallDark!!
    }

private var _runallDark: ImageVector? = null
