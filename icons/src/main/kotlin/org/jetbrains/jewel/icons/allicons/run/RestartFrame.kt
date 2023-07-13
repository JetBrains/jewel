package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val RunGroup.RestartFrame: IntellijIconData
    get() {
        if (_restartFrame != null) {
            return _restartFrame!!
        }
        _restartFrame = IntellijIconData(name = "RestartFrame",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { RestartFrameComposable(it) })
        return _restartFrame!!
    }

private var _restartFrame: IntellijIconData? = null

private fun RestartFrameComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RestartFrame", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.8008f, 1.0f)
        curveTo(12.0769f, 1.0f, 12.3008f, 1.2239f, 12.3008f, 1.5f)
        verticalLineTo(4.5f)
        verticalLineTo(5.0f)
        horizontalLineTo(11.8008f)
        horizontalLineTo(8.8008f)
        curveTo(8.5246f, 5.0f, 8.3008f, 4.7761f, 8.3008f, 4.5f)
        curveTo(8.3008f, 4.2239f, 8.5246f, 4.0f, 8.8008f, 4.0f)
        horizontalLineTo(10.5708f)
        curveTo(9.6629f, 3.0738f, 8.3984f, 2.5f, 7.0f, 2.5f)
        curveTo(4.2386f, 2.5f, 2.0f, 4.7386f, 2.0f, 7.5f)
        curveTo(2.0f, 10.2614f, 4.2386f, 12.5f, 7.0f, 12.5f)
        verticalLineTo(13.5f)
        curveTo(3.6863f, 13.5f, 1.0f, 10.8137f, 1.0f, 7.5f)
        curveTo(1.0f, 4.1863f, 3.6863f, 1.5f, 7.0f, 1.5f)
        curveTo(8.687f, 1.5f, 10.2112f, 2.1965f, 11.3008f, 3.3164f)
        verticalLineTo(1.5f)
        curveTo(11.3008f, 1.2239f, 11.5246f, 1.0f, 11.8008f, 1.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 9.5f)
        lineTo(13.0f, 9.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 11.0f)
        lineTo(14.5f, 13.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 14.5f)
        lineTo(11.0f, 14.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 13.0f)
        lineTo(9.5f, 11.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 9.5f)
        close()
    }
}
.build()
