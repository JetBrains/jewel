package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.MethodAbstract: IntellijIconData
    get() {
        if (_methodAbstract != null) {
            return _methodAbstract!!
        }
        _methodAbstract = IntellijIconData(name = "MethodAbstract",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { MethodAbstractComposable(it) })
        return _methodAbstract!!
    }

private var _methodAbstract: IntellijIconData? = null

private fun MethodAbstractComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MethodAbstract", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.9498f, 3.0503f)
        curveTo(15.6835f, 5.7839f, 15.6835f, 10.2161f, 12.9498f, 12.9497f)
        curveTo(10.2162f, 15.6834f, 5.784f, 15.6834f, 3.0503f, 12.9497f)
        curveTo(0.3167f, 10.2161f, 0.3167f, 5.7839f, 3.0503f, 3.0503f)
        curveTo(5.784f, 0.3166f, 10.2162f, 0.3166f, 12.9498f, 3.0503f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.9144f, 6.9048f)
        lineTo(13.9266f, 7.0605f)
        curveTo(13.736f, 5.8512f, 13.1756f, 4.6903f, 12.2427f, 3.7574f)
        curveTo(11.3098f, 2.8245f, 10.1488f, 2.264f, 8.9396f, 2.0735f)
        lineTo(9.0953f, 1.0857f)
        curveTo(10.5063f, 1.308f, 11.8624f, 1.9629f, 12.9498f, 3.0503f)
        curveTo(14.0372f, 4.1376f, 14.6921f, 5.4938f, 14.9144f, 6.9048f)
        close()
        moveTo(6.9049f, 1.0857f)
        lineTo(7.0605f, 2.0735f)
        curveTo(5.8513f, 2.264f, 4.6904f, 2.8245f, 3.7574f, 3.7574f)
        curveTo(2.8245f, 4.6903f, 2.2641f, 5.8512f, 2.0736f, 7.0605f)
        lineTo(1.0858f, 6.9048f)
        curveTo(1.3081f, 5.4938f, 1.9629f, 4.1376f, 3.0503f, 3.0503f)
        curveTo(4.1377f, 1.9629f, 5.4938f, 1.308f, 6.9049f, 1.0857f)
        close()
        moveTo(1.0858f, 9.0952f)
        curveTo(1.3081f, 10.5063f, 1.9629f, 11.8624f, 3.0503f, 12.9497f)
        curveTo(4.1377f, 14.0371f, 5.4938f, 14.692f, 6.9049f, 14.9143f)
        lineTo(7.0605f, 13.9265f)
        curveTo(5.8513f, 13.736f, 4.6904f, 13.1755f, 3.7574f, 12.2426f)
        curveTo(2.8245f, 11.3097f, 2.2641f, 10.1488f, 2.0736f, 8.9396f)
        lineTo(1.0858f, 9.0952f)
        close()
        moveTo(9.0953f, 14.9143f)
        lineTo(8.9396f, 13.9265f)
        curveTo(10.1488f, 13.736f, 11.3098f, 13.1755f, 12.2427f, 12.2426f)
        curveTo(13.1756f, 11.3097f, 13.736f, 10.1488f, 13.9266f, 8.9396f)
        lineTo(14.9144f, 9.0952f)
        curveTo(14.6921f, 10.5063f, 14.0372f, 11.8624f, 12.9498f, 12.9497f)
        curveTo(11.8624f, 14.0371f, 10.5063f, 14.692f, 9.0953f, 14.9143f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0657f, 5.2457f)
        curveTo(9.2536f, 5.2457f, 8.636f, 5.6473f, 8.2959f, 6.3154f)
        curveTo(8.0037f, 5.6426f, 7.4055f, 5.2457f, 6.6071f, 5.2457f)
        curveTo(5.8492f, 5.2457f, 5.2815f, 5.6095f, 4.9619f, 6.2486f)
        verticalLineTo(5.3719f)
        horizontalLineTo(4.0f)
        verticalLineTo(10.7543f)
        horizontalLineTo(4.9987f)
        verticalLineTo(7.59f)
        curveTo(4.9987f, 6.6807f, 5.5138f, 6.1077f, 6.3285f, 6.1077f)
        curveTo(7.0749f, 6.1077f, 7.5059f, 6.6176f, 7.5059f, 7.4376f)
        verticalLineTo(10.7543f)
        horizontalLineTo(8.4941f)
        verticalLineTo(7.59f)
        curveTo(8.4941f, 6.6807f, 9.0197f, 6.1077f, 9.8239f, 6.1077f)
        curveTo(10.5756f, 6.1077f, 11.0013f, 6.6176f, 11.0013f, 7.4376f)
        verticalLineTo(10.7543f)
        horizontalLineTo(12.0f)
        verticalLineTo(7.3587f)
        curveTo(12.0f, 6.071f, 11.2168f, 5.2457f, 10.0657f, 5.2457f)
        close()
    }
}
.build()
