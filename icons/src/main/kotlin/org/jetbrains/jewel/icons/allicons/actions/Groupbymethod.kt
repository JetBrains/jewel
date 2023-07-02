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

public val ActionsGroup.Groupbymethod: ImageVector
    get() {
        if (_groupbymethod != null) {
            return _groupbymethod!!
        }
        _groupbymethod = Builder(name = "Groupbymethod", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0735f, 5.1182f)
                curveTo(10.4584f, 5.1182f, 10.7962f, 5.2117f, 11.0866f, 5.3987f)
                curveTo(11.3806f, 5.582f, 11.6063f, 5.8423f, 11.7638f, 6.1797f)
                curveTo(11.9213f, 6.5133f, 12.0f, 6.8965f, 12.0f, 7.3292f)
                verticalLineTo(10.8822f)
                horizontalLineTo(10.9764f)
                verticalLineTo(7.4282f)
                curveTo(10.9764f, 6.9918f, 10.8784f, 6.6527f, 10.6824f, 6.4107f)
                curveTo(10.4899f, 6.1687f, 10.2117f, 6.0477f, 9.8478f, 6.0477f)
                curveTo(9.5713f, 6.0477f, 9.3316f, 6.1173f, 9.1286f, 6.2567f)
                curveTo(8.9291f, 6.3923f, 8.7752f, 6.5867f, 8.6667f, 6.8397f)
                curveTo(8.5617f, 7.089f, 8.5092f, 7.3823f, 8.5092f, 7.7197f)
                verticalLineTo(10.8822f)
                horizontalLineTo(7.4961f)
                verticalLineTo(7.4282f)
                curveTo(7.4961f, 6.9955f, 7.3928f, 6.6582f, 7.1863f, 6.4162f)
                curveTo(6.9834f, 6.1705f, 6.6999f, 6.0477f, 6.336f, 6.0477f)
                curveTo(5.9265f, 6.0477f, 5.6063f, 6.198f, 5.3753f, 6.4987f)
                curveTo(5.1444f, 6.7993f, 5.0289f, 7.2063f, 5.0289f, 7.7197f)
                verticalLineTo(10.8822f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.2502f)
                horizontalLineTo(4.9974f)
                verticalLineTo(6.1137f)
                curveTo(5.1618f, 5.7947f, 5.3788f, 5.549f, 5.6483f, 5.3767f)
                curveTo(5.9213f, 5.2043f, 6.2327f, 5.1182f, 6.5827f, 5.1182f)
                curveTo(6.9781f, 5.1182f, 7.3228f, 5.2172f, 7.6168f, 5.4152f)
                curveTo(7.9143f, 5.6095f, 8.14f, 5.8808f, 8.294f, 6.2292f)
                curveTo(8.4759f, 5.8772f, 8.7192f, 5.604f, 9.0236f, 5.4097f)
                curveTo(9.3316f, 5.2153f, 9.6815f, 5.1182f, 10.0735f, 5.1182f)
                close()
            }
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
        }
        .build()
        return _groupbymethod!!
    }

private var _groupbymethod: ImageVector? = null
