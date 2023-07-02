package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.MovetobuttonDark: ImageVector
    get() {
        if (_movetobuttonDark != null) {
            return _movetobuttonDark!!
        }
        _movetobuttonDark = Builder(name = "MovetobuttonDark", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFFCED0D6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 3.0f)
                curveTo(11.0f, 2.4477f, 11.4477f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 2.0f, 15.0f, 2.2239f, 15.0f, 2.5f)
                curveTo(15.0f, 2.7761f, 14.7761f, 3.0f, 14.5f, 3.0f)
                lineTo(12.0f, 3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 13.0f, 15.0f, 13.2239f, 15.0f, 13.5f)
                curveTo(15.0f, 13.7761f, 14.7761f, 14.0f, 14.5f, 14.0f)
                horizontalLineTo(12.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 13.5523f, 11.0f, 13.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCED0D6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.6465f, 5.1465f)
                curveTo(6.8417f, 4.9512f, 7.1583f, 4.9512f, 7.3535f, 5.1465f)
                lineTo(9.8535f, 7.6465f)
                curveTo(9.9473f, 7.7402f, 10.0f, 7.8674f, 10.0f, 8.0f)
                curveTo(10.0f, 8.1326f, 9.9473f, 8.2598f, 9.8535f, 8.3535f)
                lineTo(7.3535f, 10.8536f)
                curveTo(7.1583f, 11.0488f, 6.8417f, 11.0488f, 6.6465f, 10.8536f)
                curveTo(6.4512f, 10.6583f, 6.4512f, 10.3417f, 6.6465f, 10.1464f)
                lineTo(8.2929f, 8.5f)
                horizontalLineTo(1.5f)
                curveTo(1.2239f, 8.5f, 1.0f, 8.2761f, 1.0f, 8.0f)
                curveTo(1.0f, 7.7239f, 1.2239f, 7.5f, 1.5f, 7.5f)
                horizontalLineTo(8.2929f)
                lineTo(6.6465f, 5.8535f)
                curveTo(6.4512f, 5.6583f, 6.4512f, 5.3417f, 6.6465f, 5.1465f)
                close()
            }
        }
        .build()
        return _movetobuttonDark!!
    }

private var _movetobuttonDark: ImageVector? = null
