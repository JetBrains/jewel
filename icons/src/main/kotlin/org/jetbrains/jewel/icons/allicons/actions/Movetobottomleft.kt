package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Movetobottomleft: ImageVector
    get() {
        if (_movetobottomleft != null) {
            return _movetobottomleft!!
        }
        _movetobottomleft = Builder(name = "Movetobottomleft", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF6C707E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(12.0f)
                curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                horizontalLineTo(4.0f)
                curveTo(3.931f, 14.0f, 3.8628f, 13.9965f, 3.7955f, 13.9897f)
                curveTo(2.787f, 13.8873f, 2.0f, 13.0355f, 2.0f, 12.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 9.4477f, 8.5523f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(3.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 12.5178f, 3.3935f, 12.9436f, 3.8978f, 12.9948f)
                curveTo(3.9314f, 12.9983f, 3.9655f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _movetobottomleft!!
    }

private var _movetobottomleft: ImageVector? = null
