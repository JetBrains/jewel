package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.StarEmpty: IntellijIconData
    get() {
        if (_starEmpty != null) {
            return _starEmpty!!
        }
        _starEmpty = IntellijIconData(imageVector = { StarEmptyComposable(it) })
        return _starEmpty!!
    }

private var _starEmpty: IntellijIconData? = null

private fun StarEmptyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "StarEmpty", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.9998f, 2.073f)
        curveTo(8.2018f, 2.073f, 8.3839f, 2.1945f, 8.4615f, 2.381f)
        lineTo(9.9312f, 5.9147f)
        lineTo(13.7461f, 6.2205f)
        curveTo(13.9474f, 6.2366f, 14.1193f, 6.3723f, 14.1817f, 6.5644f)
        curveTo(14.2441f, 6.7565f, 14.1848f, 6.9672f, 14.0314f, 7.0986f)
        lineTo(11.1249f, 9.5884f)
        lineTo(12.0129f, 13.3111f)
        curveTo(12.0597f, 13.5075f, 11.9838f, 13.7129f, 11.8204f, 13.8316f)
        curveTo(11.657f, 13.9503f, 11.4383f, 13.9591f, 11.2659f, 13.8538f)
        lineTo(7.9998f, 11.8589f)
        lineTo(4.7337f, 13.8538f)
        curveTo(4.5614f, 13.9591f, 4.3426f, 13.9503f, 4.1792f, 13.8316f)
        curveTo(4.0158f, 13.7129f, 3.9399f, 13.5075f, 3.9867f, 13.3111f)
        lineTo(4.8748f, 9.5884f)
        lineTo(1.9682f, 7.0986f)
        curveTo(1.8148f, 6.9672f, 1.7555f, 6.7565f, 1.818f, 6.5644f)
        curveTo(1.8804f, 6.3723f, 2.0522f, 6.2366f, 2.2535f, 6.2205f)
        lineTo(6.0684f, 5.9147f)
        lineTo(7.5382f, 2.381f)
        curveTo(7.6157f, 2.1945f, 7.7979f, 2.073f, 7.9998f, 2.073f)
        close()
        moveTo(7.9998f, 3.875f)
        lineTo(6.8745f, 6.5807f)
        curveTo(6.8025f, 6.7538f, 6.6396f, 6.8721f, 6.4528f, 6.8871f)
        lineTo(3.5317f, 7.1212f)
        lineTo(5.7572f, 9.0276f)
        curveTo(5.8996f, 9.1496f, 5.9618f, 9.341f, 5.9183f, 9.5234f)
        lineTo(5.2384f, 12.3738f)
        lineTo(7.7392f, 10.8463f)
        curveTo(7.8992f, 10.7486f, 8.1004f, 10.7486f, 8.2605f, 10.8463f)
        lineTo(10.7612f, 12.3738f)
        lineTo(10.0813f, 9.5234f)
        curveTo(10.0378f, 9.341f, 10.1f, 9.1496f, 10.2424f, 9.0276f)
        lineTo(12.4679f, 7.1212f)
        lineTo(9.5469f, 6.8871f)
        curveTo(9.36f, 6.8721f, 9.1972f, 6.7538f, 9.1252f, 6.5807f)
        lineTo(7.9998f, 3.875f)
        close()
    }
}
.build()
