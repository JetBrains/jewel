package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Exit: IntellijIconData
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = IntellijIconData(name = "Exit",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ExitComposable(it) })
        return _exit!!
    }

private var _exit: IntellijIconData? = null

private fun ExitComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Exit",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.0f, 2.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 2.0f, 14.0f, 2.4477f, 14.0f, 3.0f)
        verticalLineTo(13.0f)
        curveTo(14.0f, 13.5523f, 13.5523f, 14.0f, 13.0f, 14.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(13.0f)
        curveTo(4.0f, 14.1046f, 4.8954f, 15.0f, 6.0f, 15.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 15.0f, 15.0f, 14.1046f, 15.0f, 13.0f)
        verticalLineTo(3.0f)
        curveTo(15.0f, 1.8954f, 14.1046f, 1.0f, 13.0f, 1.0f)
        horizontalLineTo(6.0f)
        curveTo(4.8954f, 1.0f, 4.0f, 1.8954f, 4.0f, 3.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(3.0f)
        curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 8.0f)
        horizontalLineTo(11.0f)
        moveTo(11.0f, 8.0f)
        lineTo(8.5f, 5.5f)
        moveTo(11.0f, 8.0f)
        lineTo(8.5f, 10.5f)
    }
}
.build()
