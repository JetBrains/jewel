package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Xsd: IntellijIconData
    get() {
        if (_xsd != null) {
            return _xsd!!
        }
        _xsd = IntellijIconData(imageVector = { XsdComposable(it) })
        return _xsd!!
    }

private var _xsd: IntellijIconData? = null

private fun XsdComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Xsd",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.6299f, 13.0f)
        lineTo(3.2584f, 8.84f)
        lineTo(2.9594f, 8.5475f)
        lineTo(1.3409f, 3.9f)
        horizontalLineTo(2.4459f)
        lineTo(3.4924f, 7.0135f)
        lineTo(3.8174f, 7.371f)
        lineTo(5.7284f, 13.0f)
        horizontalLineTo(4.6299f)
        close()
        moveTo(1.2109f, 13.0f)
        lineTo(3.1414f, 7.3515f)
        lineTo(3.4339f, 7.085f)
        lineTo(4.5129f, 3.9f)
        horizontalLineTo(5.5984f)
        lineTo(3.9474f, 8.6125f)
        lineTo(3.6484f, 8.905f)
        lineTo(2.2964f, 13.0f)
        horizontalLineTo(1.2109f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.9994f, 13.156f)
        curveTo(7.5617f, 13.156f, 7.2042f, 13.0607f, 6.9269f, 12.87f)
        curveTo(6.6495f, 12.6794f, 6.4437f, 12.3847f, 6.3094f, 11.986f)
        curveTo(6.1794f, 11.583f, 6.1144f, 11.0652f, 6.1144f, 10.4325f)
        horizontalLineTo(7.2324f)
        curveTo(7.2324f, 10.8355f, 7.2584f, 11.167f, 7.3104f, 11.427f)
        curveTo(7.3667f, 11.6827f, 7.4512f, 11.8712f, 7.5639f, 11.9925f)
        curveTo(7.6809f, 12.1139f, 7.8304f, 12.1745f, 8.0124f, 12.1745f)
        curveTo(8.1857f, 12.1745f, 8.3244f, 12.1182f, 8.4284f, 12.0055f)
        curveTo(8.5367f, 11.8885f, 8.6169f, 11.7109f, 8.6689f, 11.4725f)
        curveTo(8.7209f, 11.2299f, 8.7469f, 10.9179f, 8.7469f, 10.5365f)
        curveTo(8.7469f, 10.1249f, 8.6927f, 9.7977f, 8.5844f, 9.555f)
        curveTo(8.4804f, 9.3124f, 8.3157f, 9.1195f, 8.0904f, 8.9765f)
        lineTo(7.5119f, 8.6255f)
        curveTo(7.2215f, 8.4435f, 6.9854f, 8.2399f, 6.8034f, 8.0145f)
        curveTo(6.6214f, 7.7892f, 6.487f, 7.5335f, 6.4004f, 7.2475f)
        curveTo(6.3137f, 6.9572f, 6.2704f, 6.6235f, 6.2704f, 6.2465f)
        curveTo(6.2704f, 5.6615f, 6.3289f, 5.1849f, 6.4459f, 4.8165f)
        curveTo(6.5672f, 4.4482f, 6.7514f, 4.1774f, 6.9984f, 4.004f)
        curveTo(7.2454f, 3.8307f, 7.566f, 3.744f, 7.9604f, 3.744f)
        curveTo(8.3634f, 3.744f, 8.6905f, 3.8328f, 8.9419f, 4.0105f)
        curveTo(9.1932f, 4.1838f, 9.3795f, 4.4569f, 9.5009f, 4.8295f)
        curveTo(9.6222f, 5.1979f, 9.6829f, 5.6767f, 9.6829f, 6.266f)
        horizontalLineTo(8.5714f)
        curveTo(8.5714f, 5.9064f, 8.5497f, 5.6139f, 8.5064f, 5.3885f)
        curveTo(8.463f, 5.1632f, 8.398f, 4.9963f, 8.3114f, 4.888f)
        curveTo(8.229f, 4.7797f, 8.1164f, 4.7255f, 7.9734f, 4.7255f)
        curveTo(7.7654f, 4.7255f, 7.6137f, 4.8468f, 7.5184f, 5.0895f)
        curveTo(7.423f, 5.3278f, 7.3754f, 5.7113f, 7.3754f, 6.24f)
        curveTo(7.3754f, 6.5823f, 7.4252f, 6.864f, 7.5249f, 7.085f)
        curveTo(7.6289f, 7.3017f, 7.7914f, 7.4772f, 8.0124f, 7.6115f)
        lineTo(8.6494f, 8.0015f)
        curveTo(8.9354f, 8.1792f, 9.165f, 8.385f, 9.3384f, 8.619f)
        curveTo(9.516f, 8.8487f, 9.646f, 9.1195f, 9.7284f, 9.4315f)
        curveTo(9.8107f, 9.7435f, 9.8519f, 10.1075f, 9.8519f, 10.5235f)
        curveTo(9.8519f, 11.1345f, 9.7869f, 11.635f, 9.6569f, 12.025f)
        curveTo(9.5269f, 12.4107f, 9.3254f, 12.6967f, 9.0524f, 12.883f)
        curveTo(8.7837f, 13.065f, 8.4327f, 13.156f, 7.9994f, 13.156f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.7765f, 13.0f)
        verticalLineTo(3.9f)
        horizontalLineTo(12.5705f)
        curveTo(13.0385f, 3.9f, 13.4198f, 4.0322f, 13.7145f, 4.2965f)
        curveTo(14.0092f, 4.5609f, 14.2258f, 4.9703f, 14.3645f, 5.525f)
        curveTo(14.5032f, 6.0753f, 14.5725f, 6.7925f, 14.5725f, 7.6765f)
        verticalLineTo(9.2235f)
        curveTo(14.5725f, 10.1075f, 14.5032f, 10.8269f, 14.3645f, 11.3815f)
        curveTo(14.2258f, 11.9319f, 14.0092f, 12.3392f, 13.7145f, 12.6035f)
        curveTo(13.4198f, 12.8679f, 13.0385f, 13.0f, 12.5705f, 13.0f)
        horizontalLineTo(10.7765f)
        close()
        moveTo(12.5705f, 11.986f)
        curveTo(12.7742f, 11.986f, 12.9388f, 11.8885f, 13.0645f, 11.6935f)
        curveTo(13.1945f, 11.4985f, 13.2898f, 11.1995f, 13.3505f, 10.7965f)
        curveTo(13.4112f, 10.3935f, 13.4415f, 9.8692f, 13.4415f, 9.2235f)
        verticalLineTo(7.6765f)
        curveTo(13.4415f, 7.0308f, 13.4112f, 6.5065f, 13.3505f, 6.1035f)
        curveTo(13.2898f, 5.7005f, 13.1945f, 5.4015f, 13.0645f, 5.2065f)
        curveTo(12.9388f, 5.0115f, 12.7742f, 4.914f, 12.5705f, 4.914f)
        horizontalLineTo(11.862f)
        verticalLineTo(11.986f)
        horizontalLineTo(12.5705f)
        close()
    }
}
.build()
