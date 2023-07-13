package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Jsp: IntellijIconData
    get() {
        if (_jsp != null) {
            return _jsp!!
        }
        _jsp = IntellijIconData(name = "Jsp",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { JspComposable(it) })
        return _jsp!!
    }

private var _jsp: IntellijIconData? = null

private fun JspComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Jsp",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.1404f, 13.0f)
        verticalLineTo(11.9795f)
        horizontalLineTo(2.6604f)
        curveTo(2.8814f, 11.9795f, 3.0461f, 11.8842f, 3.1544f, 11.6935f)
        curveTo(3.2627f, 11.5028f, 3.3169f, 11.2103f, 3.3169f, 10.816f)
        verticalLineTo(3.9f)
        horizontalLineTo(4.4024f)
        verticalLineTo(10.881f)
        curveTo(4.4024f, 11.362f, 4.3417f, 11.7607f, 4.2204f, 12.077f)
        curveTo(4.0991f, 12.389f, 3.9149f, 12.6208f, 3.6679f, 12.7725f)
        curveTo(3.4209f, 12.9242f, 3.1067f, 13.0f, 2.7254f, 13.0f)
        horizontalLineTo(2.1404f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.1997f, 13.156f)
        curveTo(6.7621f, 13.156f, 6.4046f, 13.0607f, 6.1272f, 12.87f)
        curveTo(5.8499f, 12.6793f, 5.6441f, 12.3847f, 5.5097f, 11.986f)
        curveTo(5.3797f, 11.583f, 5.3147f, 11.0652f, 5.3147f, 10.4325f)
        horizontalLineTo(6.4327f)
        curveTo(6.4327f, 10.8355f, 6.4587f, 11.167f, 6.5107f, 11.427f)
        curveTo(6.567f, 11.6827f, 6.6515f, 11.8712f, 6.7642f, 11.9925f)
        curveTo(6.8812f, 12.1138f, 7.0307f, 12.1745f, 7.2127f, 12.1745f)
        curveTo(7.3861f, 12.1745f, 7.5247f, 12.1182f, 7.6287f, 12.0055f)
        curveTo(7.7371f, 11.8885f, 7.8172f, 11.7108f, 7.8692f, 11.4725f)
        curveTo(7.9212f, 11.2298f, 7.9472f, 10.9178f, 7.9472f, 10.5365f)
        curveTo(7.9472f, 10.1248f, 7.8931f, 9.7977f, 7.7847f, 9.555f)
        curveTo(7.6807f, 9.3123f, 7.516f, 9.1195f, 7.2907f, 8.9765f)
        lineTo(6.7122f, 8.6255f)
        curveTo(6.4219f, 8.4435f, 6.1857f, 8.2398f, 6.0037f, 8.0145f)
        curveTo(5.8217f, 7.7892f, 5.6874f, 7.5335f, 5.6007f, 7.2475f)
        curveTo(5.5141f, 6.9571f, 5.4707f, 6.6235f, 5.4707f, 6.2465f)
        curveTo(5.4707f, 5.6615f, 5.5292f, 5.1848f, 5.6462f, 4.8165f)
        curveTo(5.7675f, 4.4482f, 5.9517f, 4.1773f, 6.1987f, 4.004f)
        curveTo(6.4457f, 3.8307f, 6.7664f, 3.744f, 7.1607f, 3.744f)
        curveTo(7.5637f, 3.744f, 7.8909f, 3.8328f, 8.1422f, 4.0105f)
        curveTo(8.3935f, 4.1838f, 8.5799f, 4.4568f, 8.7012f, 4.8295f)
        curveTo(8.8225f, 5.1978f, 8.8832f, 5.6767f, 8.8832f, 6.266f)
        horizontalLineTo(7.7717f)
        curveTo(7.7717f, 5.9063f, 7.7501f, 5.6138f, 7.7067f, 5.3885f)
        curveTo(7.6634f, 5.1631f, 7.5984f, 4.9963f, 7.5117f, 4.888f)
        curveTo(7.4294f, 4.7797f, 7.3167f, 4.7255f, 7.1737f, 4.7255f)
        curveTo(6.9657f, 4.7255f, 6.8141f, 4.8468f, 6.7187f, 5.0895f)
        curveTo(6.6234f, 5.3278f, 6.5757f, 5.7113f, 6.5757f, 6.24f)
        curveTo(6.5757f, 6.5823f, 6.6255f, 6.864f, 6.7252f, 7.085f)
        curveTo(6.8292f, 7.3017f, 6.9917f, 7.4771f, 7.2127f, 7.6115f)
        lineTo(7.8497f, 8.0015f)
        curveTo(8.1357f, 8.1791f, 8.3654f, 8.385f, 8.5387f, 8.619f)
        curveTo(8.7164f, 8.8486f, 8.8464f, 9.1195f, 8.9287f, 9.4315f)
        curveTo(9.0111f, 9.7435f, 9.0522f, 10.1075f, 9.0522f, 10.5235f)
        curveTo(9.0522f, 11.1345f, 8.9872f, 11.635f, 8.8572f, 12.025f)
        curveTo(8.7272f, 12.4107f, 8.5257f, 12.6967f, 8.2527f, 12.883f)
        curveTo(7.984f, 13.065f, 7.633f, 13.156f, 7.1997f, 13.156f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.9768f, 13.0f)
        verticalLineTo(3.9f)
        horizontalLineTo(11.5368f)
        curveTo(12.0352f, 3.9f, 12.4403f, 3.9953f, 12.7523f, 4.186f)
        curveTo(13.0687f, 4.3766f, 13.3005f, 4.667f, 13.4478f, 5.057f)
        curveTo(13.5995f, 5.447f, 13.6753f, 5.941f, 13.6753f, 6.539f)
        curveTo(13.6753f, 7.1456f, 13.5995f, 7.6462f, 13.4478f, 8.0405f)
        curveTo(13.2962f, 8.4305f, 13.0578f, 8.7208f, 12.7328f, 8.9115f)
        curveTo(12.4122f, 9.1021f, 11.9962f, 9.1975f, 11.4848f, 9.1975f)
        horizontalLineTo(11.0623f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.9768f)
        close()
        moveTo(11.5368f, 8.1835f)
        curveTo(11.8878f, 8.1835f, 12.1392f, 8.0535f, 12.2908f, 7.7935f)
        curveTo(12.4425f, 7.5292f, 12.5183f, 7.111f, 12.5183f, 6.539f)
        curveTo(12.5183f, 5.98f, 12.4425f, 5.5705f, 12.2908f, 5.3105f)
        curveTo(12.1392f, 5.0462f, 11.8878f, 4.914f, 11.5368f, 4.914f)
        horizontalLineTo(11.0623f)
        verticalLineTo(8.1835f)
        horizontalLineTo(11.5368f)
        close()
    }
}
.build()
