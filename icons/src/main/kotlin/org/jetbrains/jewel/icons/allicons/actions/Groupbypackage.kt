package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val ActionsGroup.Groupbypackage: ImageVector
    get() {
        if (_groupbypackage != null) {
            return _groupbypackage!!
        }
        _groupbypackage = Builder(name = "Groupbypackage", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6C707E)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 13.5f)
                horizontalLineTo(2.5f)
                curveTo(1.9477f, 13.5f, 1.5f, 13.0523f, 1.5f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1.5f, 2.9477f, 1.9477f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6C707E)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 13.5f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 13.5f, 14.5f, 13.0523f, 14.5f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(14.5f, 2.9477f, 14.0523f, 2.5f, 13.5f, 2.5f)
                horizontalLineTo(12.5f)
            }
            path(fill = SolidColor(Color(0xFFEBECF0)), stroke = SolidColor(Color(0xFF6C707E)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6465f, 6.3535f)
                lineTo(8.7929f, 6.5f)
                horizontalLineTo(9.0f)
                horizontalLineTo(12.0f)
                curveTo(12.2761f, 6.5f, 12.5f, 6.7239f, 12.5f, 7.0f)
                verticalLineTo(11.0f)
                curveTo(12.5f, 11.2761f, 12.2761f, 11.5f, 12.0f, 11.5f)
                horizontalLineTo(4.0f)
                curveTo(3.7239f, 11.5f, 3.5f, 11.2761f, 3.5f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(3.5f, 4.7239f, 3.7239f, 4.5f, 4.0f, 4.5f)
                horizontalLineTo(6.5858f)
                curveTo(6.7184f, 4.5f, 6.8456f, 4.5527f, 6.9393f, 4.6465f)
                lineTo(8.6465f, 6.3535f)
                close()
            }
        }
        .build()
        return _groupbypackage!!
    }

private var _groupbypackage: ImageVector? = null
