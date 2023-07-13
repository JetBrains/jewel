package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Gvariable: IntellijIconData
    get() {
        if (_gvariable != null) {
            return _gvariable!!
        }
        _gvariable = IntellijIconData(name = "Gvariable",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { GvariableComposable(it) })
        return _gvariable!!
    }

private var _gvariable: IntellijIconData? = null

private fun GvariableComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Gvariable", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF4EB)), stroke = SolidColor(Color(0xFFE66D17)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 11.3709f)
        horizontalLineTo(8.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(7.5f)
        verticalLineTo(11.3709f)
        close()
        moveTo(7.5f, 3.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(4.6391f)
        horizontalLineTo(7.5f)
        verticalLineTo(3.0f)
        close()
        moveTo(7.9099f, 11.5164f)
        curveTo(7.4378f, 11.5164f, 7.0191f, 11.4307f, 6.6537f, 11.2593f)
        curveTo(6.2884f, 11.0847f, 6.0022f, 10.8422f, 5.7953f, 10.5318f)
        curveTo(5.5916f, 10.2182f, 5.4897f, 9.8593f, 5.4897f, 9.4551f)
        horizontalLineTo(6.484f)
        curveTo(6.484f, 9.6879f, 6.5438f, 9.8949f, 6.6634f, 10.0759f)
        curveTo(6.7863f, 10.257f, 6.9561f, 10.3993f, 7.1727f, 10.5027f)
        curveTo(7.3926f, 10.603f, 7.6431f, 10.6531f, 7.9244f, 10.6531f)
        curveTo(8.1993f, 10.6531f, 8.4418f, 10.6062f, 8.6519f, 10.5124f)
        curveTo(8.8621f, 10.4187f, 9.0238f, 10.2877f, 9.1369f, 10.1196f)
        curveTo(9.2534f, 9.9515f, 9.3116f, 9.7575f, 9.3116f, 9.5376f)
        curveTo(9.3116f, 9.2595f, 9.2275f, 9.0219f, 9.0594f, 8.8246f)
        curveTo(8.8945f, 8.6242f, 8.673f, 8.4997f, 8.3949f, 8.4512f)
        lineTo(7.2697f, 8.262f)
        curveTo(6.9431f, 8.2038f, 6.657f, 8.0891f, 6.4113f, 7.9177f)
        curveTo(6.1687f, 7.7431f, 5.9828f, 7.5265f, 5.8535f, 7.2678f)
        curveTo(5.7242f, 7.0059f, 5.6595f, 6.7214f, 5.6595f, 6.4142f)
        curveTo(5.6595f, 6.0488f, 5.7549f, 5.7206f, 5.9457f, 5.4296f)
        curveTo(6.1364f, 5.1386f, 6.4015f, 4.9107f, 6.741f, 4.7458f)
        curveTo(7.0838f, 4.5777f, 7.4686f, 4.4936f, 7.8953f, 4.4936f)
        curveTo(8.3351f, 4.4936f, 8.7263f, 4.576f, 9.069f, 4.7409f)
        curveTo(9.4118f, 4.9026f, 9.6785f, 5.1289f, 9.8693f, 5.4199f)
        curveTo(10.0601f, 5.7077f, 10.1554f, 6.0375f, 10.1554f, 6.4093f)
        horizontalLineTo(9.1612f)
        curveTo(9.1612f, 6.2056f, 9.1079f, 6.0246f, 9.0012f, 5.8661f)
        curveTo(8.8977f, 5.7045f, 8.7506f, 5.58f, 8.5598f, 5.4927f)
        curveTo(8.3723f, 5.4022f, 8.1556f, 5.3569f, 7.9099f, 5.3569f)
        curveTo(7.6609f, 5.3569f, 7.4411f, 5.4005f, 7.2503f, 5.4878f)
        curveTo(7.0628f, 5.5719f, 6.9156f, 5.6915f, 6.8089f, 5.8467f)
        curveTo(6.7055f, 6.0019f, 6.6537f, 6.183f, 6.6537f, 6.3899f)
        curveTo(6.6537f, 6.6324f, 6.7313f, 6.841f, 6.8865f, 7.0156f)
        curveTo(7.0417f, 7.1902f, 7.2471f, 7.3001f, 7.5025f, 7.3454f)
        lineTo(8.6277f, 7.5345f)
        curveTo(8.9543f, 7.5927f, 9.2453f, 7.7172f, 9.5007f, 7.908f)
        curveTo(9.7594f, 8.0988f, 9.9582f, 8.3348f, 10.0972f, 8.6161f)
        curveTo(10.2395f, 8.8974f, 10.3106f, 9.1932f, 10.3106f, 9.5036f)
        curveTo(10.3106f, 9.8819f, 10.2088f, 10.2247f, 10.0051f, 10.5318f)
        curveTo(9.8046f, 10.8358f, 9.5217f, 11.0766f, 9.1564f, 11.2545f)
        curveTo(8.791f, 11.4291f, 8.3755f, 11.5164f, 7.9099f, 11.5164f)
        close()
    }
}
.build()
