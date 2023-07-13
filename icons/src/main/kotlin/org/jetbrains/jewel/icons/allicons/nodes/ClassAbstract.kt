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

public val NodesGroup.ClassAbstract: IntellijIconData
    get() {
        if (_classAbstract != null) {
            return _classAbstract!!
        }
        _classAbstract = IntellijIconData(name = "ClassAbstract",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ClassAbstractComposable(it) })
        return _classAbstract!!
    }

private var _classAbstract: IntellijIconData? = null

private fun ClassAbstractComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ClassAbstract", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.9497f, 3.0503f)
        curveTo(15.6834f, 5.7839f, 15.6834f, 10.2161f, 12.9497f, 12.9497f)
        curveTo(10.216f, 15.6834f, 5.7839f, 15.6834f, 3.0502f, 12.9497f)
        curveTo(0.3165f, 10.2161f, 0.3165f, 5.7839f, 3.0502f, 3.0503f)
        curveTo(5.7839f, 0.3166f, 10.216f, 0.3166f, 12.9497f, 3.0503f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.9143f, 6.9048f)
        lineTo(13.9264f, 7.0605f)
        curveTo(13.7359f, 5.8512f, 13.1755f, 4.6903f, 12.2426f, 3.7574f)
        curveTo(11.3097f, 2.8245f, 10.1487f, 2.264f, 8.9395f, 2.0735f)
        lineTo(9.0951f, 1.0857f)
        curveTo(10.5062f, 1.308f, 11.8623f, 1.9629f, 12.9497f, 3.0503f)
        curveTo(14.0371f, 4.1376f, 14.6919f, 5.4938f, 14.9143f, 6.9048f)
        close()
        moveTo(6.9048f, 1.0857f)
        lineTo(7.0604f, 2.0735f)
        curveTo(5.8512f, 2.264f, 4.6902f, 2.8245f, 3.7573f, 3.7574f)
        curveTo(2.8244f, 4.6903f, 2.264f, 5.8512f, 2.0735f, 7.0605f)
        lineTo(1.0857f, 6.9048f)
        curveTo(1.308f, 5.4938f, 1.9628f, 4.1376f, 3.0502f, 3.0503f)
        curveTo(4.1376f, 1.9629f, 5.4937f, 1.308f, 6.9048f, 1.0857f)
        close()
        moveTo(1.0857f, 9.0952f)
        curveTo(1.308f, 10.5063f, 1.9628f, 11.8624f, 3.0502f, 12.9497f)
        curveTo(4.1376f, 14.0371f, 5.4937f, 14.692f, 6.9048f, 14.9143f)
        lineTo(7.0604f, 13.9265f)
        curveTo(5.8512f, 13.736f, 4.6902f, 13.1755f, 3.7573f, 12.2426f)
        curveTo(2.8244f, 11.3097f, 2.264f, 10.1488f, 2.0735f, 8.9396f)
        lineTo(1.0857f, 9.0952f)
        close()
        moveTo(9.0951f, 14.9143f)
        lineTo(8.9395f, 13.9265f)
        curveTo(10.1487f, 13.736f, 11.3097f, 13.1755f, 12.2426f, 12.2426f)
        curveTo(13.1755f, 11.3097f, 13.7359f, 10.1488f, 13.9264f, 8.9396f)
        lineTo(14.9143f, 9.0952f)
        curveTo(14.6919f, 10.5063f, 14.0371f, 11.8624f, 12.9497f, 12.9497f)
        curveTo(11.8623f, 14.0371f, 10.5062f, 14.692f, 9.0951f, 14.9143f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.1329f, 11.5f)
        curveTo(9.6122f, 11.5f, 10.8836f, 10.6105f, 11.2075f, 9.3391f)
        horizontalLineTo(10.2213f)
        curveTo(9.9023f, 10.0739f, 9.1191f, 10.6057f, 8.1329f, 10.6057f)
        curveTo(6.7794f, 10.6057f, 5.8028f, 9.518f, 5.8028f, 8.0f)
        curveTo(5.8028f, 6.482f, 6.7794f, 5.3943f, 8.1329f, 5.3943f)
        curveTo(9.1191f, 5.3943f, 9.9023f, 5.9261f, 10.2213f, 6.6609f)
        horizontalLineTo(11.2075f)
        curveTo(10.8836f, 5.3895f, 9.6122f, 4.5f, 8.1329f, 4.5f)
        curveTo(6.2186f, 4.5f, 4.7925f, 5.9938f, 4.7925f, 8.0f)
        curveTo(4.7925f, 10.0062f, 6.2186f, 11.5f, 8.1329f, 11.5f)
        close()
    }
}
.build()
