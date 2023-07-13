package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.RunFailed: IntellijIconData
    get() {
        if (_runFailed != null) {
            return _runFailed!!
        }
        _runFailed = IntellijIconData(name = "RunFailed",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { RunFailedComposable(it) })
        return _runFailed!!
    }

private var _runFailed: IntellijIconData? = null

private fun RunFailedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RunFailed", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.yellowSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.9681f, 6.0957f)
        curveTo(10.9892f, 5.9f, 11.0f, 5.7013f, 11.0f, 5.5f)
        curveTo(11.0f, 2.4624f, 8.5376f, 0.0f, 5.5f, 0.0f)
        curveTo(2.4624f, 0.0f, 0.0f, 2.4624f, 0.0f, 5.5f)
        curveTo(0.0f, 8.5376f, 2.4624f, 11.0f, 5.5f, 11.0f)
        curveTo(5.6685f, 11.0f, 5.8353f, 10.9924f, 6.0f, 10.9776f)
        verticalLineTo(7.5022f)
        curveTo(6.0f, 5.5393f, 8.1585f, 4.342f, 9.8237f, 5.3814f)
        lineTo(10.9681f, 6.0957f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0f, 7.5022f)
        curveTo(7.0f, 6.3244f, 8.2951f, 5.6061f, 9.2942f, 6.2297f)
        lineTo(13.2962f, 8.7275f)
        curveTo(14.2372f, 9.3148f, 14.2372f, 10.6851f, 13.2962f, 11.2725f)
        lineTo(9.2942f, 13.7703f)
        curveTo(8.2951f, 14.3939f, 7.0f, 13.6756f, 7.0f, 12.4978f)
        verticalLineTo(7.5022f)
        close()
        moveTo(8.7647f, 7.078f)
        curveTo(8.4317f, 6.8701f, 8.0f, 7.1096f, 8.0f, 7.5022f)
        verticalLineTo(12.4978f)
        curveTo(8.0f, 12.8904f, 8.4317f, 13.1298f, 8.7647f, 12.922f)
        lineTo(12.7667f, 10.4241f)
        curveTo(13.0804f, 10.2284f, 13.0804f, 9.7716f, 12.7667f, 9.5758f)
        lineTo(8.7647f, 7.078f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 7.5021f)
        curveTo(8.0f, 7.1096f, 8.4317f, 6.8701f, 8.7647f, 7.078f)
        lineTo(12.7667f, 9.5758f)
        curveTo(13.0804f, 9.7716f, 13.0804f, 10.2284f, 12.7667f, 10.4241f)
        lineTo(8.7647f, 12.922f)
        curveTo(8.4317f, 13.1298f, 8.0f, 12.8904f, 8.0f, 12.4978f)
        verticalLineTo(7.5021f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.9999f, 3.0f)
        curveTo(2.7656f, 3.2343f, 2.7656f, 3.6142f, 3.0f, 3.8485f)
        lineTo(4.6514f, 5.5f)
        lineTo(2.9999f, 7.1515f)
        curveTo(2.7656f, 7.3858f, 2.7656f, 7.7657f, 2.9999f, 8.0f)
        curveTo(3.2343f, 8.2343f, 3.6142f, 8.2343f, 3.8485f, 8.0f)
        lineTo(5.4999f, 6.3485f)
        lineTo(6.0672f, 6.9158f)
        curveTo(6.168f, 6.4873f, 6.3769f, 6.1117f, 6.6575f, 5.8091f)
        lineTo(6.3485f, 5.5f)
        lineTo(7.9999f, 3.8485f)
        curveTo(8.2343f, 3.6142f, 8.2343f, 3.2343f, 7.9999f, 3.0f)
        curveTo(7.7656f, 2.7657f, 7.3857f, 2.7657f, 7.1514f, 3.0f)
        lineTo(5.4999f, 4.6515f)
        lineTo(3.8485f, 3.0f)
        curveTo(3.6142f, 2.7657f, 3.2343f, 2.7657f, 2.9999f, 3.0f)
        close()
    }
}
.build()
