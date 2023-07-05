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

public val NodesGroup.TestIgnored: IntellijIconData
    get() {
        if (_testIgnored != null) {
            return _testIgnored!!
        }
        _testIgnored = IntellijIconData(imageVector = { TestIgnoredComposable(it) })
        return _testIgnored!!
    }

private var _testIgnored: IntellijIconData? = null

private fun TestIgnoredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestIgnored", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF7F7)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(14.9621f, 8.7327f)
        curveTo(14.9872f, 8.4919f, 15.0f, 8.2474f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        curveTo(8.2474f, 15.0f, 8.4919f, 14.9872f, 8.7327f, 14.9621f)
        curveTo(8.2694f, 14.2547f, 8.0f, 13.4088f, 8.0f, 12.5f)
        curveTo(8.0f, 10.0147f, 10.0147f, 8.0f, 12.5f, 8.0f)
        curveTo(13.4088f, 8.0f, 14.2547f, 8.2694f, 14.9621f, 8.7327f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.2542f, 13.9947f)
        curveTo(8.1699f, 13.9982f, 8.0852f, 14.0f, 8.0f, 14.0f)
        curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.3137f, 2.0f, 14.0f, 4.6863f, 14.0f, 8.0f)
        curveTo(14.0f, 8.0852f, 13.9982f, 8.1699f, 13.9947f, 8.2542f)
        curveTo(14.3382f, 8.3751f, 14.6626f, 8.5365f, 14.9621f, 8.7327f)
        curveTo(14.9872f, 8.4919f, 15.0f, 8.2474f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        curveTo(8.2474f, 15.0f, 8.4919f, 14.9872f, 8.7327f, 14.9621f)
        curveTo(8.5365f, 14.6626f, 8.3751f, 14.3382f, 8.2542f, 13.9947f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.4321f, 10.5733f)
        curveTo(8.1885f, 10.5074f, 8.0202f, 10.2924f, 8.0202f, 10.0214f)
        verticalLineTo(6.8188f)
        horizontalLineTo(9.4606f)
        lineTo(9.4661f, 5.9131f)
        horizontalLineTo(8.0202f)
        verticalLineTo(4.5f)
        horizontalLineTo(7.0764f)
        verticalLineTo(5.4493f)
        curveTo(7.0764f, 5.7221f, 6.8854f, 5.9131f, 6.6126f, 5.9131f)
        horizontalLineTo(5.9088f)
        lineTo(5.9033f, 6.8188f)
        horizontalLineTo(6.9836f)
        lineTo(6.9891f, 10.1142f)
        curveTo(6.9891f, 10.7992f, 7.4491f, 11.331f, 8.1193f, 11.4664f)
        curveTo(8.1925f, 11.155f, 8.298f, 10.856f, 8.4321f, 10.5733f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.1542f, 14.6073f)
        curveTo(11.5427f, 14.8559f, 12.0045f, 15.0f, 12.5f, 15.0f)
        curveTo(13.8807f, 15.0f, 15.0f, 13.8807f, 15.0f, 12.5f)
        curveTo(15.0f, 12.0045f, 14.8559f, 11.5427f, 14.6073f, 11.1542f)
        lineTo(11.1542f, 14.6073f)
        close()
        moveTo(10.3927f, 13.8458f)
        lineTo(13.8458f, 10.3927f)
        curveTo(13.4573f, 10.1441f, 12.9955f, 10.0f, 12.5f, 10.0f)
        curveTo(11.1193f, 10.0f, 10.0f, 11.1193f, 10.0f, 12.5f)
        curveTo(10.0f, 12.9955f, 10.1441f, 13.4573f, 10.3927f, 13.8458f)
        close()
        moveTo(12.5f, 16.0f)
        curveTo(10.567f, 16.0f, 9.0f, 14.433f, 9.0f, 12.5f)
        curveTo(9.0f, 10.567f, 10.567f, 9.0f, 12.5f, 9.0f)
        curveTo(14.433f, 9.0f, 16.0f, 10.567f, 16.0f, 12.5f)
        curveTo(16.0f, 14.433f, 14.433f, 16.0f, 12.5f, 16.0f)
        close()
    }
}
.build()
