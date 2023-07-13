package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Debug_stroke: IntellijIconData
    get() {
        if (_debug_stroke != null) {
            return _debug_stroke!!
        }
        _debug_stroke = IntellijIconData(name = "Debug_stroke",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { Debug_strokeComposable(it) })
        return _debug_stroke!!
    }

private var _debug_stroke: IntellijIconData? = null

private fun Debug_strokeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Debug_stroke", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.842f, 13.7496f)
        curveTo(14.2007f, 13.9567f, 14.6594f, 13.8338f, 14.8665f, 13.475f)
        curveTo(15.0736f, 13.1163f, 14.9507f, 12.6576f, 14.592f, 12.4505f)
        lineTo(13.842f, 13.7496f)
        close()
        moveTo(11.625f, 12.4696f)
        lineTo(13.842f, 13.7496f)
        lineTo(14.592f, 12.4505f)
        lineTo(12.375f, 11.1705f)
        lineTo(11.625f, 12.4696f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.9004f, 9.75f)
        curveTo(15.3146f, 9.75f, 15.6504f, 9.4142f, 15.6504f, 9.0f)
        curveTo(15.6504f, 8.5858f, 15.3146f, 8.25f, 14.9004f, 8.25f)
        lineTo(14.9004f, 9.75f)
        close()
        moveTo(12.4004f, 9.75f)
        lineTo(14.9004f, 9.75f)
        lineTo(14.9004f, 8.25f)
        lineTo(12.4004f, 8.25f)
        lineTo(12.4004f, 9.75f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.574f, 5.4596f)
        curveTo(14.9383f, 5.2624f, 15.0738f, 4.8073f, 14.8766f, 4.443f)
        curveTo(14.6794f, 4.0787f, 14.2243f, 3.9433f, 13.86f, 4.1404f)
        lineTo(14.574f, 5.4596f)
        close()
        moveTo(12.357f, 6.6596f)
        lineTo(14.574f, 5.4596f)
        lineTo(13.86f, 4.1404f)
        lineTo(11.643f, 5.3404f)
        lineTo(12.357f, 6.6596f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.1549f, 13.7495f)
        curveTo(1.7962f, 13.9566f, 1.3375f, 13.8337f, 1.1304f, 13.475f)
        curveTo(0.9233f, 13.1163f, 1.0462f, 12.6576f, 1.4049f, 12.4505f)
        lineTo(2.1549f, 13.7495f)
        close()
        moveTo(4.375f, 12.4678f)
        lineTo(2.1549f, 13.7495f)
        lineTo(1.4049f, 12.4505f)
        lineTo(3.625f, 11.1687f)
        lineTo(4.375f, 12.4678f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.0996f, 9.7499f)
        curveTo(0.6854f, 9.7499f, 0.3496f, 9.4141f, 0.3496f, 8.9999f)
        curveTo(0.3496f, 8.5857f, 0.6854f, 8.2499f, 1.0996f, 8.2499f)
        lineTo(1.0996f, 9.7499f)
        close()
        moveTo(3.5996f, 9.7499f)
        lineTo(1.0996f, 9.7499f)
        lineTo(1.0996f, 8.2499f)
        lineTo(3.5996f, 8.2499f)
        lineTo(3.5996f, 9.7499f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.4233f, 5.4598f)
        curveTo(1.0589f, 5.2628f, 0.9232f, 4.8078f, 1.1201f, 4.4434f)
        curveTo(1.3171f, 4.079f, 1.7721f, 3.9433f, 2.1365f, 4.1402f)
        lineTo(1.4233f, 5.4598f)
        close()
        moveTo(3.6434f, 6.6598f)
        lineTo(1.4233f, 5.4598f)
        lineTo(2.1365f, 4.1402f)
        lineTo(4.3566f, 5.3402f)
        lineTo(3.6434f, 6.6598f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.2434f, 4.7536f)
        curveTo(10.3443f, 4.4884f, 10.3996f, 4.2006f, 10.3996f, 3.9f)
        curveTo(10.3996f, 2.5745f, 9.3251f, 1.5f, 7.9996f, 1.5f)
        curveTo(6.6741f, 1.5f, 5.5996f, 2.5745f, 5.5996f, 3.9f)
        curveTo(5.5996f, 4.2222f, 5.6631f, 4.5296f, 5.7783f, 4.8104f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 7.5f)
        curveTo(4.0f, 5.8432f, 5.3432f, 4.5f, 7.0f, 4.5f)
        horizontalLineTo(9.0f)
        curveTo(10.6569f, 4.5f, 12.0f, 5.8432f, 12.0f, 7.5f)
        verticalLineTo(10.0f)
        curveTo(12.0f, 12.2091f, 10.2091f, 14.0f, 8.0f, 14.0f)
        verticalLineTo(14.0f)
        curveTo(5.7909f, 14.0f, 4.0f, 12.2091f, 4.0f, 10.0f)
        verticalLineTo(7.5f)
        close()
    }
}
.build()
