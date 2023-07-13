package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Profiler_20x20: IntellijIconData
    get() {
        if (_profiler_20x20 != null) {
            return _profiler_20x20!!
        }
        _profiler_20x20 = IntellijIconData(name = "Profiler_20x20",size = DpSize(height = 20.0.dp,
                width = 20.0.dp),imageVector = { Profiler_20x20Composable(it) })
        return _profiler_20x20!!
    }

private var _profiler_20x20: IntellijIconData? = null

private fun Profiler_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Profiler_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0f, 4.0f)
        curveTo(5.5817f, 4.0f, 2.0f, 7.5817f, 2.0f, 12.0f)
        curveTo(2.0f, 13.1896f, 2.2576f, 14.4539f, 2.6992f, 15.5f)
        horizontalLineTo(17.3008f)
        curveTo(17.7424f, 14.4539f, 18.0f, 13.1896f, 18.0f, 12.0f)
        curveTo(18.0f, 7.5817f, 14.4183f, 4.0f, 10.0f, 4.0f)
        close()
        moveTo(0.5f, 12.0f)
        curveTo(0.5f, 6.7533f, 4.7533f, 2.5f, 10.0f, 2.5f)
        curveTo(15.2467f, 2.5f, 19.5f, 6.7533f, 19.5f, 12.0f)
        curveTo(19.5f, 13.6282f, 19.0904f, 15.3821f, 18.3686f, 16.7477f)
        curveTo(18.2852f, 16.9055f, 18.1192f, 17.0f, 17.9407f, 17.0f)
        horizontalLineTo(2.0593f)
        curveTo(1.8808f, 17.0f, 1.7148f, 16.9055f, 1.6314f, 16.7477f)
        curveTo(0.9096f, 15.3821f, 0.5f, 13.6282f, 0.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.8711f, 8.6227f)
        curveTo(15.2323f, 8.3228f, 15.282f, 7.7869f, 14.9821f, 7.4257f)
        curveTo(14.6822f, 7.0646f, 14.1463f, 7.0149f, 13.7851f, 7.3148f)
        lineTo(10.9993f, 9.6279f)
        curveTo(10.6971f, 9.4819f, 10.3581f, 9.4f, 10.0f, 9.4f)
        curveTo(8.7298f, 9.4f, 7.7f, 10.4298f, 7.7f, 11.7f)
        curveTo(7.7f, 12.9703f, 8.7298f, 14.0f, 10.0f, 14.0f)
        curveTo(11.2703f, 14.0f, 12.3f, 12.9703f, 12.3f, 11.7f)
        curveTo(12.3f, 11.4119f, 12.247f, 11.1361f, 12.1502f, 10.8819f)
        lineTo(14.8711f, 8.6227f)
        close()
        moveTo(10.8f, 11.7f)
        curveTo(10.8f, 12.1419f, 10.4418f, 12.5f, 10.0f, 12.5f)
        curveTo(9.5582f, 12.5f, 9.2f, 12.1419f, 9.2f, 11.7f)
        curveTo(9.2f, 11.2582f, 9.5582f, 10.9f, 10.0f, 10.9f)
        curveTo(10.4418f, 10.9f, 10.8f, 11.2582f, 10.8f, 11.7f)
        close()
    }
}
.build()
