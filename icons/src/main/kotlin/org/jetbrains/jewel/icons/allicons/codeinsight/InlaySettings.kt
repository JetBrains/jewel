package org.jetbrains.jewel.icons.allicons.codeinsight

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
import org.jetbrains.jewel.icons.allicons.CodeinsightGroup

public val CodeinsightGroup.InlaySettings: IntellijIconData
    get() {
        if (_inlaySettings != null) {
            return _inlaySettings!!
        }
        _inlaySettings = IntellijIconData(name = "InlaySettings",size = DpSize(height = 12.0.dp,
                width = 12.0.dp),imageVector = { InlaySettingsComposable(it) })
        return _inlaySettings!!
    }

private var _inlaySettings: IntellijIconData? = null

private fun InlaySettingsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "InlaySettings", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp, viewportWidth = 12.0f,
        viewportHeight = 12.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 0.2f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.9996f, 2.0157f)
        lineTo(7.9124f, 2.0647f)
        lineTo(7.9996f, 2.0157f)
        lineTo(7.3174f, 0.8035f)
        curveTo(7.2164f, 0.6242f, 7.0409f, 0.4925f, 6.8319f, 0.4614f)
        curveTo(6.5604f, 0.4209f, 6.2826f, 0.4f, 6.0f, 0.4f)
        curveTo(5.7173f, 0.4f, 5.4394f, 0.421f, 5.1679f, 0.4614f)
        curveTo(4.9589f, 0.4925f, 4.7834f, 0.6242f, 4.6825f, 0.8035f)
        lineTo(4.0002f, 2.0157f)
        curveTo(3.9087f, 2.1783f, 3.7358f, 2.2781f, 3.5492f, 2.2761f)
        lineTo(2.1592f, 2.2608f)
        curveTo(1.9537f, 2.2586f, 1.7524f, 2.3444f, 1.6208f, 2.5092f)
        curveTo(1.2753f, 2.9421f, 0.9927f, 3.4273f, 0.7866f, 3.9512f)
        curveTo(0.7094f, 4.1476f, 0.7357f, 4.3651f, 0.8405f, 4.5419f)
        lineTo(1.5495f, 5.7396f)
        curveTo(1.6446f, 5.9002f, 1.6446f, 6.0998f, 1.5495f, 6.2604f)
        lineTo(0.8405f, 7.4581f)
        curveTo(0.7357f, 7.6349f, 0.7094f, 7.8524f, 0.7866f, 8.0488f)
        curveTo(0.9927f, 8.5727f, 1.2753f, 9.0579f, 1.6208f, 9.4908f)
        curveTo(1.7524f, 9.6556f, 1.9538f, 9.7414f, 2.1592f, 9.7392f)
        lineTo(3.5492f, 9.7239f)
        curveTo(3.7358f, 9.7219f, 3.9087f, 9.8217f, 4.0002f, 9.9843f)
        lineTo(4.6825f, 11.1965f)
        curveTo(4.7834f, 11.3758f, 4.9589f, 11.5075f, 5.1679f, 11.5386f)
        curveTo(5.4394f, 11.579f, 5.7173f, 11.6f, 6.0f, 11.6f)
        curveTo(6.2826f, 11.6f, 6.5604f, 11.5791f, 6.8319f, 11.5386f)
        curveTo(7.0409f, 11.5075f, 7.2164f, 11.3758f, 7.3174f, 11.1965f)
        lineTo(7.9996f, 9.9843f)
        curveTo(8.0911f, 9.8217f, 8.264f, 9.7219f, 8.4506f, 9.7239f)
        lineTo(9.8408f, 9.7392f)
        curveTo(10.0462f, 9.7414f, 10.2475f, 9.6556f, 10.3791f, 9.4908f)
        curveTo(10.7246f, 9.058f, 11.0072f, 8.5728f, 11.2132f, 8.049f)
        curveTo(11.2905f, 7.8525f, 11.2641f, 7.635f, 11.1594f, 7.4582f)
        lineTo(10.4503f, 6.2604f)
        curveTo(10.3552f, 6.0998f, 10.3552f, 5.9002f, 10.4503f, 5.7396f)
        lineTo(11.1594f, 4.5418f)
        curveTo(11.2641f, 4.365f, 11.2905f, 4.1475f, 11.2132f, 3.9511f)
        curveTo(11.0072f, 3.4272f, 10.7246f, 2.942f, 10.3791f, 2.5092f)
        curveTo(10.2475f, 2.3444f, 10.0462f, 2.2586f, 9.8408f, 2.2608f)
        lineTo(8.4506f, 2.2761f)
        curveTo(8.264f, 2.2781f, 8.0911f, 2.1783f, 7.9996f, 2.0157f)
        close()
        moveTo(2.3977f, 5.2374f)
        lineTo(1.7639f, 4.1669f)
        curveTo(1.9058f, 3.8394f, 2.0848f, 3.5314f, 2.2957f, 3.2481f)
        lineTo(3.5384f, 3.2617f)
        curveTo(4.0849f, 3.2677f, 4.5912f, 2.9754f, 4.8592f, 2.4991f)
        lineTo(5.4689f, 1.4159f)
        curveTo(5.6429f, 1.396f, 5.8201f, 1.3857f, 6.0f, 1.3857f)
        curveTo(6.1798f, 1.3857f, 6.357f, 1.396f, 6.5309f, 1.4158f)
        lineTo(7.1406f, 2.4991f)
        curveTo(7.4086f, 2.9754f, 7.9149f, 3.2677f, 8.4614f, 3.2617f)
        lineTo(9.7043f, 3.2481f)
        curveTo(9.9151f, 3.5314f, 10.0941f, 3.8394f, 10.236f, 4.1668f)
        lineTo(9.6021f, 5.2374f)
        curveTo(9.3237f, 5.7077f, 9.3237f, 6.2923f, 9.6021f, 6.7626f)
        lineTo(10.236f, 7.8332f)
        curveTo(10.0941f, 8.1606f, 9.9151f, 8.4686f, 9.7043f, 8.7519f)
        lineTo(8.4614f, 8.7383f)
        curveTo(7.9149f, 8.7323f, 7.4086f, 9.0246f, 7.1406f, 9.5009f)
        lineTo(6.5309f, 10.5842f)
        curveTo(6.357f, 10.604f, 6.1798f, 10.6143f, 6.0f, 10.6143f)
        curveTo(5.8201f, 10.6143f, 5.6429f, 10.604f, 5.4689f, 10.5841f)
        lineTo(4.8592f, 9.5009f)
        curveTo(4.5912f, 9.0246f, 4.0849f, 8.7323f, 3.5384f, 8.7383f)
        lineTo(2.2957f, 8.7519f)
        curveTo(2.0848f, 8.4686f, 1.9058f, 8.1606f, 1.7639f, 7.8331f)
        lineTo(2.3977f, 6.7626f)
        curveTo(2.6762f, 6.2923f, 2.6762f, 5.7077f, 2.3977f, 5.2374f)
        close()
        moveTo(5.9999f, 8.1829f)
        curveTo(7.2055f, 8.1829f, 8.1828f, 7.2056f, 8.1828f, 6.0f)
        curveTo(8.1828f, 4.7944f, 7.2055f, 3.8171f, 5.9999f, 3.8171f)
        curveTo(4.7943f, 3.8171f, 3.817f, 4.7944f, 3.817f, 6.0f)
        curveTo(3.817f, 7.2056f, 4.7943f, 8.1829f, 5.9999f, 8.1829f)
        close()
        moveTo(7.1971f, 6.0f)
        curveTo(7.1971f, 6.6612f, 6.6611f, 7.1972f, 5.9999f, 7.1972f)
        curveTo(5.3387f, 7.1972f, 4.8027f, 6.6612f, 4.8027f, 6.0f)
        curveTo(4.8027f, 5.3388f, 5.3387f, 4.8028f, 5.9999f, 4.8028f)
        curveTo(6.6611f, 4.8028f, 7.1971f, 5.3388f, 7.1971f, 6.0f)
        close()
    }
}
.build()
