package org.jetbrains.jewel.icons.allicons.diff

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
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.Compare3MiddleRight: IntellijIconData
    get() {
        if (_compare3MiddleRight != null) {
            return _compare3MiddleRight!!
        }
        _compare3MiddleRight = IntellijIconData(name = "Compare3MiddleRight",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { Compare3MiddleRightComposable(it) })
        return _compare3MiddleRight!!
    }

private var _compare3MiddleRight: IntellijIconData? = null

private fun Compare3MiddleRightComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "Compare3MiddleRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.5f, 14.0f)
        verticalLineTo(2.0f)
        curveTo(6.5f, 1.7239f, 6.7239f, 1.5f, 7.0f, 1.5f)
        horizontalLineTo(9.0f)
        curveTo(9.2761f, 1.5f, 9.5f, 1.7239f, 9.5f, 2.0f)
        verticalLineTo(14.0f)
        curveTo(9.5f, 14.2761f, 9.2761f, 14.5f, 9.0f, 14.5f)
        horizontalLineTo(7.0f)
        curveTo(6.7239f, 14.5f, 6.5f, 14.2761f, 6.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 14.0f)
        verticalLineTo(2.0f)
        curveTo(11.5f, 1.7239f, 11.7239f, 1.5f, 12.0f, 1.5f)
        horizontalLineTo(14.0f)
        curveTo(14.2761f, 1.5f, 14.5f, 1.7239f, 14.5f, 2.0f)
        verticalLineTo(14.0f)
        curveTo(14.5f, 14.2761f, 14.2761f, 14.5f, 14.0f, 14.5f)
        horizontalLineTo(12.0f)
        curveTo(11.7239f, 14.5f, 11.5f, 14.2761f, 11.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(3.5f, 12.2761f, 3.2761f, 12.5f, 3.0f, 12.5f)
        curveTo(2.7239f, 12.5f, 2.5f, 12.2761f, 2.5f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.5f, 3.7239f, 2.7239f, 3.5f, 3.0f, 3.5f)
        curveTo(3.2761f, 3.5f, 3.5f, 3.7239f, 3.5f, 4.0f)
        close()
    }
}
.build()
