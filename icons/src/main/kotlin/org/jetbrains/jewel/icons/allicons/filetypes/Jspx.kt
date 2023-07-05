package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Jspx: IntellijIconData
    get() {
        if (_jspx != null) {
            return _jspx!!
        }
        _jspx = IntellijIconData(imageVector = { JspxComposable(it) })
        return _jspx!!
    }

private var _jspx: IntellijIconData? = null

private fun JspxComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Jspx",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.0388f, 13.0f)
        verticalLineTo(11.9795f)
        horizontalLineTo(2.5588f)
        curveTo(2.7798f, 11.9795f, 2.9445f, 11.8842f, 3.0528f, 11.6935f)
        curveTo(3.1611f, 11.5029f, 3.2153f, 11.2104f, 3.2153f, 10.816f)
        verticalLineTo(3.9f)
        horizontalLineTo(4.3008f)
        verticalLineTo(10.881f)
        curveTo(4.3008f, 11.362f, 4.2401f, 11.7607f, 4.1188f, 12.077f)
        curveTo(3.9975f, 12.389f, 3.8133f, 12.6209f, 3.5663f, 12.7725f)
        curveTo(3.3193f, 12.9242f, 3.0052f, 13.0f, 2.6238f, 13.0f)
        horizontalLineTo(2.0388f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.0981f, 13.156f)
        curveTo(6.6605f, 13.156f, 6.303f, 13.0607f, 6.0257f, 12.87f)
        curveTo(5.7483f, 12.6794f, 5.5425f, 12.3847f, 5.4082f, 11.986f)
        curveTo(5.2782f, 11.583f, 5.2132f, 11.0652f, 5.2132f, 10.4325f)
        horizontalLineTo(6.3312f)
        curveTo(6.3312f, 10.8355f, 6.3572f, 11.167f, 6.4092f, 11.427f)
        curveTo(6.4655f, 11.6827f, 6.55f, 11.8712f, 6.6627f, 11.9925f)
        curveTo(6.7797f, 12.1139f, 6.9292f, 12.1745f, 7.1111f, 12.1745f)
        curveTo(7.2845f, 12.1745f, 7.4232f, 12.1182f, 7.5272f, 12.0055f)
        curveTo(7.6355f, 11.8885f, 7.7157f, 11.7109f, 7.7677f, 11.4725f)
        curveTo(7.8197f, 11.2299f, 7.8457f, 10.9179f, 7.8457f, 10.5365f)
        curveTo(7.8457f, 10.1249f, 7.7915f, 9.7977f, 7.6831f, 9.555f)
        curveTo(7.5792f, 9.3124f, 7.4145f, 9.1195f, 7.1891f, 8.9765f)
        lineTo(6.6107f, 8.6255f)
        curveTo(6.3203f, 8.4435f, 6.0841f, 8.2399f, 5.9022f, 8.0145f)
        curveTo(5.7201f, 7.7892f, 5.5858f, 7.5335f, 5.4991f, 7.2475f)
        curveTo(5.4125f, 6.9572f, 5.3692f, 6.6235f, 5.3692f, 6.2465f)
        curveTo(5.3692f, 5.6615f, 5.4276f, 5.1849f, 5.5447f, 4.8165f)
        curveTo(5.666f, 4.4482f, 5.8502f, 4.1774f, 6.0971f, 4.004f)
        curveTo(6.3442f, 3.8307f, 6.6648f, 3.744f, 7.0592f, 3.744f)
        curveTo(7.4622f, 3.744f, 7.7893f, 3.8328f, 8.0407f, 4.0105f)
        curveTo(8.292f, 4.1838f, 8.4783f, 4.4569f, 8.5997f, 4.8295f)
        curveTo(8.721f, 5.1979f, 8.7817f, 5.6767f, 8.7817f, 6.266f)
        horizontalLineTo(7.6701f)
        curveTo(7.6701f, 5.9064f, 7.6485f, 5.6139f, 7.6052f, 5.3885f)
        curveTo(7.5618f, 5.1632f, 7.4968f, 4.9963f, 7.4102f, 4.888f)
        curveTo(7.3278f, 4.7797f, 7.2151f, 4.7255f, 7.0722f, 4.7255f)
        curveTo(6.8642f, 4.7255f, 6.7125f, 4.8468f, 6.6171f, 5.0895f)
        curveTo(6.5218f, 5.3278f, 6.4742f, 5.7113f, 6.4742f, 6.24f)
        curveTo(6.4742f, 6.5823f, 6.524f, 6.864f, 6.6237f, 7.085f)
        curveTo(6.7277f, 7.3017f, 6.8902f, 7.4772f, 7.1111f, 7.6115f)
        lineTo(7.7481f, 8.0015f)
        curveTo(8.0342f, 8.1792f, 8.2638f, 8.385f, 8.4372f, 8.619f)
        curveTo(8.6148f, 8.8487f, 8.7448f, 9.1195f, 8.8272f, 9.4315f)
        curveTo(8.9095f, 9.7435f, 8.9507f, 10.1075f, 8.9507f, 10.5235f)
        curveTo(8.9507f, 11.1345f, 8.8856f, 11.635f, 8.7556f, 12.025f)
        curveTo(8.6257f, 12.4107f, 8.4242f, 12.6967f, 8.1511f, 12.883f)
        curveTo(7.8825f, 13.065f, 7.5315f, 13.156f, 7.0981f, 13.156f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.7043f, 13.0f)
        lineTo(11.3328f, 8.84f)
        lineTo(11.0338f, 8.5475f)
        lineTo(9.4153f, 3.9f)
        horizontalLineTo(10.5203f)
        lineTo(11.5668f, 7.0135f)
        lineTo(11.8918f, 7.371f)
        lineTo(13.8028f, 13.0f)
        horizontalLineTo(12.7043f)
        close()
        moveTo(9.2853f, 13.0f)
        lineTo(11.2158f, 7.3515f)
        lineTo(11.5083f, 7.085f)
        lineTo(12.5873f, 3.9f)
        horizontalLineTo(13.6728f)
        lineTo(12.0218f, 8.6125f)
        lineTo(11.7228f, 8.905f)
        lineTo(10.3708f, 13.0f)
        horizontalLineTo(9.2853f)
        close()
    }
}
.build()
