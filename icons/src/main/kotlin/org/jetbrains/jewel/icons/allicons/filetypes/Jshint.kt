package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Jshint: IntellijIconData
    get() {
        if (_jshint != null) {
            return _jshint!!
        }
        _jshint = IntellijIconData(imageVector = { JshintComposable(it) })
        return _jshint!!
    }

private var _jshint: IntellijIconData? = null

private fun JshintComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Jshint", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF636361)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.0f, 2.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 14.0f, 2.0f, 13.1046f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(12.0f)
        close()
        moveTo(8.977f, 11.8718f)
        curveTo(9.3047f, 12.0257f, 9.6809f, 12.1026f, 10.1056f, 12.1026f)
        curveTo(10.5274f, 12.1026f, 10.9021f, 12.0242f, 11.2299f, 11.8675f)
        curveTo(11.5576f, 11.7107f, 11.8127f, 11.4956f, 11.9951f, 11.222f)
        curveTo(12.1775f, 10.9455f, 12.2687f, 10.6363f, 12.2687f, 10.2943f)
        curveTo(12.2687f, 10.0121f, 12.206f, 9.7457f, 12.0806f, 9.4949f)
        curveTo(11.9552f, 9.2441f, 11.7771f, 9.0346f, 11.5462f, 8.8664f)
        curveTo(11.3182f, 8.6983f, 11.0575f, 8.5886f, 10.7639f, 8.5373f)
        lineTo(9.7678f, 8.3748f)
        curveTo(9.5655f, 8.3406f, 9.4016f, 8.2537f, 9.2762f, 8.114f)
        curveTo(9.1508f, 7.9715f, 9.0881f, 7.8034f, 9.0881f, 7.6096f)
        curveTo(9.0881f, 7.4443f, 9.1309f, 7.2989f, 9.2164f, 7.1735f)
        curveTo(9.3019f, 7.0481f, 9.4216f, 6.9512f, 9.5755f, 6.8828f)
        curveTo(9.7294f, 6.8144f, 9.9075f, 6.7802f, 10.1098f, 6.7802f)
        curveTo(10.3122f, 6.7802f, 10.4903f, 6.8159f, 10.6442f, 6.8871f)
        curveTo(10.7981f, 6.9584f, 10.9178f, 7.0595f, 11.0033f, 7.1906f)
        curveTo(11.0888f, 7.3189f, 11.1316f, 7.4642f, 11.1316f, 7.6267f)
        horizontalLineTo(12.1447f)
        curveTo(12.1419f, 7.2932f, 12.0535f, 6.9968f, 11.8797f, 6.7375f)
        curveTo(11.7058f, 6.4781f, 11.4636f, 6.2758f, 11.1529f, 6.1304f)
        curveTo(10.8451f, 5.9851f, 10.4932f, 5.9124f, 10.097f, 5.9124f)
        curveTo(9.7094f, 5.9124f, 9.3617f, 5.9879f, 9.0539f, 6.139f)
        curveTo(8.7461f, 6.2872f, 8.5053f, 6.4938f, 8.3315f, 6.7589f)
        curveTo(8.1604f, 7.0211f, 8.075f, 7.3175f, 8.075f, 7.6481f)
        curveTo(8.075f, 7.9245f, 8.132f, 8.1796f, 8.2459f, 8.4133f)
        curveTo(8.3628f, 8.6441f, 8.5281f, 8.8365f, 8.7418f, 8.9904f)
        curveTo(8.9556f, 9.1443f, 9.2078f, 9.2469f, 9.4985f, 9.2982f)
        lineTo(10.5117f, 9.4692f)
        curveTo(10.734f, 9.5063f, 10.9121f, 9.606f, 11.0461f, 9.7685f)
        curveTo(11.18f, 9.9281f, 11.247f, 10.119f, 11.247f, 10.3413f)
        curveTo(11.247f, 10.518f, 11.2f, 10.6748f, 11.1059f, 10.8116f)
        curveTo(11.0147f, 10.9455f, 10.8836f, 11.0495f, 10.7126f, 11.1236f)
        curveTo(10.5416f, 11.1977f, 10.3435f, 11.2348f, 10.1184f, 11.2348f)
        curveTo(9.8876f, 11.2348f, 9.6824f, 11.1949f, 9.5028f, 11.1151f)
        curveTo(9.3261f, 11.0324f, 9.1879f, 10.917f, 9.0881f, 10.7688f)
        curveTo(8.9884f, 10.6206f, 8.9385f, 10.4525f, 8.9385f, 10.2644f)
        horizontalLineTo(7.9253f)
        curveTo(7.9282f, 10.6235f, 8.0222f, 10.9427f, 8.2075f, 11.222f)
        curveTo(8.3927f, 11.4984f, 8.6492f, 11.715f, 8.977f, 11.8718f)
        close()
        moveTo(5.2218f, 11.0f)
        horizontalLineTo(4.2129f)
        verticalLineTo(12.0f)
        horizontalLineTo(5.3201f)
        curveTo(5.6479f, 12.0f, 5.9386f, 11.9316f, 6.1922f, 11.7948f)
        curveTo(6.4459f, 11.6552f, 6.6439f, 11.4614f, 6.7864f, 11.2134f)
        curveTo(6.9289f, 10.9655f, 7.0002f, 10.6805f, 7.0002f, 10.3584f)
        lineTo(7.0002f, 6.0f)
        horizontalLineTo(5.9999f)
        lineTo(5.9998f, 10.222f)
        curveTo(5.9998f, 10.3759f, 5.9671f, 10.5127f, 5.9015f, 10.6324f)
        curveTo(5.8388f, 10.7492f, 5.7476f, 10.8404f, 5.6279f, 10.906f)
        curveTo(5.5111f, 10.9687f, 5.3757f, 11.0f, 5.2218f, 11.0f)
        close()
    }
}
.build()
