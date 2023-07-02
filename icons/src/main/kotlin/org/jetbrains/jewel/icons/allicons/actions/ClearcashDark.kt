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

public val ActionsGroup.ClearcashDark: ImageVector
    get() {
        if (_clearcashDark != null) {
            return _clearcashDark!!
        }
        _clearcashDark = Builder(name = "ClearcashDark", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFCED0D6)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9353f, 10.1424f)
                lineTo(7.6311f, 14.4897f)
                curveTo(4.335f, 14.3053f, 1.6947f, 11.665f, 1.5103f, 8.3689f)
                lineTo(5.8576f, 7.0647f)
                lineTo(8.9353f, 10.1424f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFCED0D6)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 1.5f)
                lineTo(10.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFCED0D6)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8574f, 6.3574f)
                lineTo(6.9629f, 6.2519f)
                curveTo(7.7331f, 5.4818f, 8.9818f, 5.4818f, 9.752f, 6.2519f)
                verticalLineTo(6.2519f)
                curveTo(10.5221f, 7.0221f, 10.5221f, 8.2708f, 9.752f, 9.041f)
                lineTo(9.6465f, 9.1465f)
            }
        }
        .build()
        return _clearcashDark!!
    }

private var _clearcashDark: ImageVector? = null
