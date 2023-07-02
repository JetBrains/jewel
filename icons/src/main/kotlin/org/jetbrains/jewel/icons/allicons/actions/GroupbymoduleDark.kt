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

public val ActionsGroup.GroupbymoduleDark: ImageVector
    get() {
        if (_groupbymoduleDark != null) {
            return _groupbymoduleDark!!
        }
        _groupbymoduleDark = Builder(name = "GroupbymoduleDark", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFCED0D6)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 13.5f)
                horizontalLineTo(2.5f)
                curveTo(1.9477f, 13.5f, 1.5f, 13.0523f, 1.5f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1.5f, 2.9477f, 1.9477f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFCED0D6)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 13.5f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 13.5f, 14.5f, 13.0523f, 14.5f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(14.5f, 2.9477f, 14.0523f, 2.5f, 13.5f, 2.5f)
                horizontalLineTo(12.5f)
            }
            path(fill = SolidColor(Color(0xFF25324D)), stroke = SolidColor(Color(0xFF548AF7)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                lineTo(10.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 6.0f)
                lineTo(11.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 11.5f)
                lineTo(6.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 10.0f)
                lineTo(4.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 4.5f)
                close()
            }
        }
        .build()
        return _groupbymoduleDark!!
    }

private var _groupbymoduleDark: ImageVector? = null
