package org.jetbrains.jewel.icons.allicons.python.toolwindow

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
import org.jetbrains.jewel.icons.allicons.python.ToolwindowGroup

public val ToolwindowGroup.PythonConsole: IntellijIconData
    get() {
        if (_pythonConsole != null) {
            return _pythonConsole!!
        }
        _pythonConsole = IntellijIconData(name = "PythonConsole",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { PythonConsoleComposable(it) })
        return _pythonConsole!!
    }

private var _pythonConsole: IntellijIconData? = null

private fun PythonConsoleComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "PythonConsole", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.4065f, 1.1369f)
        curveTo(6.9349f, 1.0448f, 7.4703f, 0.999f, 8.0067f, 1.0f)
        lineTo(8.0105f, 1.0f)
        curveTo(8.5781f, 1.0047f, 9.1445f, 1.0547f, 9.7042f, 1.1494f)
        curveTo(10.2421f, 1.2098f, 10.7429f, 1.4546f, 11.1211f, 1.8425f)
        curveTo(11.4975f, 2.2285f, 11.7816f, 2.7952f, 11.7816f, 3.344f)
        verticalLineTo(6.2958f)
        curveTo(11.7817f, 6.8698f, 11.5575f, 7.4214f, 11.1568f, 7.8323f)
        curveTo(10.756f, 8.2434f, 10.2105f, 8.4815f, 9.6366f, 8.4958f)
        lineTo(9.6216f, 8.496f)
        horizontalLineTo(6.5146f)
        curveTo(6.1636f, 8.5026f, 5.8283f, 8.643f, 5.5774f, 8.8887f)
        curveTo(5.3279f, 9.1331f, 5.1807f, 9.4632f, 5.1656f, 9.8119f)
        verticalLineTo(11.312f)
        curveTo(5.1656f, 11.6434f, 4.8969f, 11.912f, 4.5656f, 11.912f)
        horizontalLineTo(3.4776f)
        curveTo(2.8591f, 11.912f, 2.3459f, 11.6751f, 1.962f, 11.2758f)
        curveTo(1.5945f, 10.8936f, 1.3692f, 10.3888f, 1.2411f, 9.8641f)
        curveTo(0.9209f, 8.7227f, 0.9197f, 7.5156f, 1.2372f, 6.3737f)
        curveTo(1.3538f, 5.789f, 1.6721f, 5.2635f, 2.137f, 4.8894f)
        curveTo(2.6067f, 4.5113f, 3.1953f, 4.3124f, 3.7978f, 4.328f)
        horizontalLineTo(4.3576f)
        verticalLineTo(3.328f)
        curveTo(4.3576f, 2.8535f, 4.4165f, 2.3251f, 4.7863f, 1.8943f)
        curveTo(5.1479f, 1.4729f, 5.7073f, 1.2606f, 6.4051f, 1.1372f)
        lineTo(6.4065f, 1.1369f)
        close()
        moveTo(8.0025f, 2.2f)
        curveTo(7.5369f, 2.1992f, 7.0721f, 2.239f, 6.6133f, 2.319f)
        curveTo(5.9997f, 2.4276f, 5.7832f, 2.5752f, 5.6969f, 2.6758f)
        curveTo(5.6186f, 2.767f, 5.5576f, 2.9225f, 5.5576f, 3.328f)
        curveTo(5.5576f, 3.728f, 5.5576f, 4.128f, 5.5576f, 4.528f)
        curveTo(5.5576f, 5.0803f, 5.1098f, 5.528f, 4.5576f, 5.528f)
        horizontalLineTo(3.7896f)
        curveTo(3.7836f, 5.528f, 3.7777f, 5.5279f, 3.7718f, 5.5278f)
        curveTo(3.4518f, 5.5183f, 3.1388f, 5.6234f, 2.8894f, 5.8242f)
        curveTo(2.6072f, 6.0513f, 2.4938f, 6.3394f, 2.399f, 6.6751f)
        curveTo(2.1337f, 7.6147f, 2.1337f, 8.6094f, 2.399f, 9.549f)
        curveTo(2.4897f, 9.8702f, 2.5897f, 10.1972f, 2.8271f, 10.4442f)
        curveTo(2.9893f, 10.6129f, 3.192f, 10.712f, 3.4776f, 10.712f)
        horizontalLineTo(3.9656f)
        verticalLineTo(9.8f)
        curveTo(3.9656f, 9.7928f, 3.9657f, 9.7855f, 3.966f, 9.7782f)
        curveTo(3.9899f, 9.1186f, 4.2662f, 8.4933f, 4.7378f, 8.0314f)
        curveTo(5.2094f, 7.5696f, 5.8402f, 7.3063f, 6.5002f, 7.2961f)
        lineTo(6.5096f, 7.2959f)
        lineTo(9.6132f, 7.296f)
        curveTo(9.8716f, 7.2878f, 10.1169f, 7.1799f, 10.2976f, 6.9946f)
        curveTo(10.4797f, 6.8078f, 10.5816f, 6.5571f, 10.5816f, 6.2962f)
        verticalLineTo(3.3697f)
        curveTo(10.5567f, 3.1103f, 10.444f, 2.867f, 10.2619f, 2.6802f)
        curveTo(10.0544f, 2.4674f, 9.8047f, 2.3841f, 9.5204f, 2.3354f)
        curveTo(9.0189f, 2.2496f, 8.5113f, 2.2043f, 8.0025f, 2.2f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.5816f, 4.5758f)
        curveTo(10.5816f, 4.2445f, 10.8503f, 3.9758f, 11.1816f, 3.9758f)
        horizontalLineTo(12.3896f)
        curveTo(13.0238f, 3.9758f, 13.5197f, 4.2337f, 13.8761f, 4.6492f)
        curveTo(14.2072f, 5.0353f, 14.3976f, 5.5323f, 14.5193f, 6.0128f)
        curveTo(14.8787f, 7.1667f, 14.877f, 8.403f, 14.5139f, 9.556f)
        lineTo(14.5127f, 9.5599f)
        curveTo(14.3558f, 10.0467f, 14.165f, 10.5488f, 13.8457f, 10.9263f)
        curveTo(13.4915f, 11.3451f, 13.0116f, 11.5758f, 12.3896f, 11.5758f)
        horizontalLineTo(11.4296f)
        verticalLineTo(12.5758f)
        curveTo(11.4296f, 13.2374f, 11.1316f, 13.7399f, 10.72f, 14.0925f)
        curveTo(10.3293f, 14.4271f, 9.8398f, 14.6271f, 9.4012f, 14.7509f)
        curveTo(8.274f, 15.1058f, 7.0648f, 15.1049f, 5.9381f, 14.7483f)
        curveTo(5.0688f, 14.4779f, 3.9656f, 13.8511f, 3.9656f, 12.5758f)
        verticalLineTo(11.2558f)
        curveTo(3.9656f, 10.9245f, 4.2343f, 10.6558f, 4.5656f, 10.6558f)
        curveTo(4.897f, 10.6558f, 5.1656f, 10.9245f, 5.1656f, 11.2558f)
        verticalLineTo(12.5758f)
        curveTo(5.1656f, 12.9958f, 5.5171f, 13.361f, 6.2957f, 13.6028f)
        lineTo(6.2989f, 13.6038f)
        curveTo(7.1935f, 13.8873f, 8.1538f, 13.8873f, 9.0484f, 13.6038f)
        curveTo(9.3635f, 13.504f, 9.6836f, 13.4002f, 9.9393f, 13.1812f)
        curveTo(10.1277f, 13.0198f, 10.2296f, 12.8342f, 10.2296f, 12.5758f)
        curveTo(10.2296f, 12.3171f, 10.2296f, 11.8275f, 10.2296f, 11.3758f)
        curveTo(10.2296f, 10.8235f, 10.6774f, 10.3758f, 11.2296f, 10.3758f)
        horizontalLineTo(12.3896f)
        curveTo(12.6717f, 10.3758f, 12.8117f, 10.2906f, 12.9295f, 10.1513f)
        curveTo(13.082f, 9.9711f, 13.2151f, 9.6738f, 13.3699f, 9.1938f)
        curveTo(13.6603f, 8.2701f, 13.6601f, 7.2796f, 13.3693f, 6.356f)
        curveTo(13.2676f, 6.0328f, 13.1921f, 5.695f, 12.9652f, 5.4304f)
        curveTo(12.8275f, 5.2699f, 12.6595f, 5.1758f, 12.3896f, 5.1758f)
        horizontalLineTo(11.1816f)
        curveTo(10.8503f, 5.1758f, 10.5816f, 4.9072f, 10.5816f, 4.5758f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.5505f, 3.6001f)
        curveTo(7.7012f, 3.5982f, 7.8491f, 3.6412f, 7.9753f, 3.7235f)
        curveTo(8.1015f, 3.8059f, 8.2004f, 3.9239f, 8.2594f, 4.0626f)
        curveTo(8.3184f, 4.2013f, 8.3348f, 4.3544f, 8.3065f, 4.5024f)
        curveTo(8.2783f, 4.6505f, 8.2067f, 4.7868f, 8.1008f, 4.894f)
        curveTo(7.9949f, 5.0013f, 7.8595f, 5.0746f, 7.7118f, 5.1047f)
        curveTo(7.5641f, 5.1348f, 7.4108f, 5.1203f, 7.2714f, 5.0631f)
        curveTo(7.132f, 5.0058f, 7.0127f, 4.9085f, 6.9288f, 4.7833f)
        curveTo(6.8448f, 4.6581f, 6.8f, 4.5108f, 6.8f, 4.3601f)
        curveTo(6.7987f, 4.2607f, 6.8172f, 4.1621f, 6.8544f, 4.07f)
        curveTo(6.8915f, 3.9778f, 6.9466f, 3.8939f, 7.0164f, 3.8232f)
        curveTo(7.0862f, 3.7525f, 7.1694f, 3.6964f, 7.2611f, 3.6581f)
        curveTo(7.3528f, 3.6198f, 7.4511f, 3.6001f, 7.5505f, 3.6001f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.2174f, 11.0602f)
        curveTo(8.419f, 11.0602f, 8.6123f, 11.1402f, 8.7548f, 11.2828f)
        curveTo(8.8973f, 11.4253f, 8.9774f, 11.6186f, 8.9774f, 11.8202f)
        curveTo(8.9774f, 12.0217f, 8.8973f, 12.215f, 8.7548f, 12.3576f)
        curveTo(8.6123f, 12.5001f, 8.419f, 12.5802f, 8.2174f, 12.5802f)
        curveTo(8.0158f, 12.5802f, 7.8225f, 12.5001f, 7.68f, 12.3576f)
        curveTo(7.5375f, 12.215f, 7.4574f, 12.0217f, 7.4574f, 11.8202f)
        curveTo(7.4574f, 11.6186f, 7.5375f, 11.4253f, 7.68f, 11.2828f)
        curveTo(7.8225f, 11.1402f, 8.0158f, 11.0602f, 8.2174f, 11.0602f)
        close()
    }
}
.build()
