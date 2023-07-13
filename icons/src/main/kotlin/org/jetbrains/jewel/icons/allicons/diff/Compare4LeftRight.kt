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

public val DiffGroup.Compare4LeftRight: IntellijIconData
    get() {
        if (_compare4LeftRight != null) {
            return _compare4LeftRight!!
        }
        _compare4LeftRight = IntellijIconData(name = "Compare4LeftRight",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { Compare4LeftRightComposable(it) })
        return _compare4LeftRight!!
    }

private var _compare4LeftRight: IntellijIconData? = null

private fun Compare4LeftRightComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "Compare4LeftRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 9.0f)
        verticalLineTo(2.0f)
        curveTo(1.5f, 1.7239f, 1.7239f, 1.5f, 2.0f, 1.5f)
        horizontalLineTo(4.0f)
        curveTo(4.2761f, 1.5f, 4.5f, 1.7239f, 4.5f, 2.0f)
        verticalLineTo(9.0f)
        curveTo(4.5f, 9.2761f, 4.2761f, 9.5f, 4.0f, 9.5f)
        horizontalLineTo(2.0f)
        curveTo(1.7239f, 9.5f, 1.5f, 9.2761f, 1.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 9.0f)
        verticalLineTo(2.0f)
        curveTo(11.5f, 1.7239f, 11.7239f, 1.5f, 12.0f, 1.5f)
        horizontalLineTo(14.0f)
        curveTo(14.2761f, 1.5f, 14.5f, 1.7239f, 14.5f, 2.0f)
        verticalLineTo(9.0f)
        curveTo(14.5f, 9.2761f, 14.2761f, 9.5f, 14.0f, 9.5f)
        horizontalLineTo(12.0f)
        curveTo(11.7239f, 9.5f, 11.5f, 9.2761f, 11.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 8.0f)
        verticalLineTo(3.0f)
        curveTo(7.5f, 2.7239f, 7.7239f, 2.5f, 8.0f, 2.5f)
        curveTo(8.2761f, 2.5f, 8.5f, 2.7239f, 8.5f, 3.0f)
        verticalLineTo(8.0f)
        curveTo(8.5f, 8.2761f, 8.2761f, 8.5f, 8.0f, 8.5f)
        curveTo(7.7239f, 8.5f, 7.5f, 8.2761f, 7.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 12.5f)
        lineTo(14.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 13.0f)
        lineTo(14.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 13.0f)
        lineTo(1.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 12.5f)
        close()
    }
}
.build()
