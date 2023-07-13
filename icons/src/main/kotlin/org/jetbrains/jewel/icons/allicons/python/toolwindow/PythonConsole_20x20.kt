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

public val ToolwindowGroup.PythonConsole_20x20: IntellijIconData
    get() {
        if (_pythonConsole_20x20 != null) {
            return _pythonConsole_20x20!!
        }
        _pythonConsole_20x20 = IntellijIconData(name = "PythonConsole_20x20",size = DpSize(height =
                20.0.dp, width = 20.0.dp),imageVector = { PythonConsole_20x20Composable(it) })
        return _pythonConsole_20x20!!
    }

private var _pythonConsole_20x20: IntellijIconData? = null

private fun PythonConsole_20x20Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "PythonConsole_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0081f, 1.4212f)
        curveTo(8.6686f, 1.306f, 9.3379f, 1.2487f, 10.0084f, 1.25f)
        lineTo(10.0131f, 1.25f)
        curveTo(10.7227f, 1.2559f, 11.4306f, 1.3183f, 12.1302f, 1.4368f)
        curveTo(12.8027f, 1.5123f, 13.4286f, 1.8182f, 13.9014f, 2.3031f)
        curveTo(14.3718f, 2.7856f, 14.7269f, 3.494f, 14.7269f, 4.18f)
        verticalLineTo(7.8698f)
        curveTo(14.7271f, 8.5873f, 14.4468f, 9.2767f, 13.9459f, 9.7904f)
        curveTo(13.445f, 10.3042f, 12.7631f, 10.6018f, 12.0457f, 10.6198f)
        lineTo(12.0269f, 10.62f)
        horizontalLineTo(8.1433f)
        curveTo(7.7045f, 10.6282f, 7.2854f, 10.8038f, 6.9718f, 11.1109f)
        curveTo(6.6599f, 11.4164f, 6.4759f, 11.829f, 6.457f, 12.2649f)
        verticalLineTo(14.14f)
        curveTo(6.457f, 14.5542f, 6.1212f, 14.89f, 5.707f, 14.89f)
        horizontalLineTo(4.347f)
        curveTo(3.5738f, 14.89f, 2.9323f, 14.5939f, 2.4525f, 14.0948f)
        curveTo(1.9932f, 13.6169f, 1.7115f, 12.986f, 1.5513f, 12.3301f)
        curveTo(1.1512f, 10.9034f, 1.1496f, 9.3945f, 1.5465f, 7.9671f)
        curveTo(1.6922f, 7.2363f, 2.0901f, 6.5794f, 2.6712f, 6.1117f)
        curveTo(3.2583f, 5.6391f, 3.9941f, 5.3906f, 4.7473f, 5.41f)
        horizontalLineTo(5.4469f)
        verticalLineTo(4.16f)
        curveTo(5.4469f, 3.5669f, 5.5206f, 2.9063f, 5.9828f, 2.3678f)
        curveTo(6.4349f, 1.8411f, 7.1341f, 1.5757f, 8.0063f, 1.4215f)
        lineTo(8.0081f, 1.4212f)
        close()
        moveTo(10.0032f, 2.75f)
        curveTo(9.4211f, 2.749f, 8.8401f, 2.7988f, 8.2667f, 2.8987f)
        curveTo(7.4996f, 3.0345f, 7.229f, 3.219f, 7.1211f, 3.3447f)
        curveTo(7.0233f, 3.4587f, 6.9469f, 3.6531f, 6.9469f, 4.16f)
        curveTo(6.9469f, 4.7434f, 6.9469f, 5.3267f, 6.9469f, 5.91f)
        curveTo(6.9469f, 6.4623f, 6.4992f, 6.91f, 5.9469f, 6.91f)
        horizontalLineTo(4.7369f)
        curveTo(4.7296f, 6.91f, 4.7222f, 6.9099f, 4.7148f, 6.9097f)
        curveTo(4.3147f, 6.8979f, 3.9235f, 7.0293f, 3.6117f, 7.2802f)
        curveTo(3.259f, 7.5641f, 3.1172f, 7.9243f, 2.9987f, 8.3438f)
        curveTo(2.6671f, 9.5183f, 2.6671f, 10.7617f, 2.9987f, 11.9362f)
        curveTo(3.1121f, 12.3377f, 3.2371f, 12.7465f, 3.5339f, 13.0553f)
        curveTo(3.7366f, 13.2661f, 3.9901f, 13.39f, 4.347f, 13.39f)
        horizontalLineTo(4.957f)
        verticalLineTo(12.25f)
        curveTo(4.957f, 12.2409f, 4.9571f, 12.2319f, 4.9574f, 12.2228f)
        curveTo(4.9874f, 11.3982f, 5.3328f, 10.6166f, 5.9222f, 10.0393f)
        curveTo(6.5117f, 9.462f, 7.3003f, 9.1329f, 8.1253f, 9.1201f)
        lineTo(8.1369f, 9.1199f)
        lineTo(12.0165f, 9.12f)
        curveTo(12.3395f, 9.1098f, 12.6462f, 8.9748f, 12.872f, 8.7433f)
        curveTo(13.0997f, 8.5097f, 13.2271f, 8.1964f, 13.2269f, 7.8703f)
        verticalLineTo(4.2121f)
        curveTo(13.1959f, 3.8879f, 13.055f, 3.5838f, 12.8274f, 3.3503f)
        curveTo(12.568f, 3.0843f, 12.2558f, 2.9801f, 11.9004f, 2.9193f)
        curveTo(11.2736f, 2.812f, 10.6391f, 2.7554f, 10.0032f, 2.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.227f, 5.7197f)
        curveTo(13.227f, 5.3055f, 13.5628f, 4.9697f, 13.977f, 4.9697f)
        horizontalLineTo(15.487f)
        curveTo(16.2797f, 4.9697f, 16.8997f, 5.2921f, 17.3451f, 5.8115f)
        curveTo(17.7589f, 6.294f, 17.997f, 6.9153f, 18.1491f, 7.516f)
        curveTo(18.5984f, 8.9583f, 18.5962f, 10.5037f, 18.1424f, 11.945f)
        lineTo(18.1409f, 11.9498f)
        curveTo(17.9448f, 12.5583f, 17.7063f, 13.186f, 17.3071f, 13.6578f)
        curveTo(16.8644f, 14.1813f, 16.2644f, 14.4697f, 15.487f, 14.4697f)
        horizontalLineTo(14.287f)
        verticalLineTo(15.7197f)
        curveTo(14.287f, 16.5467f, 13.9145f, 17.1748f, 13.4f, 17.6156f)
        curveTo(12.9117f, 18.0339f, 12.2998f, 18.2838f, 11.7515f, 18.4385f)
        curveTo(10.3425f, 18.8822f, 8.831f, 18.8811f, 7.4226f, 18.4354f)
        curveTo(6.336f, 18.0974f, 4.957f, 17.3138f, 4.957f, 15.7197f)
        verticalLineTo(14.0697f)
        curveTo(4.957f, 13.6555f, 5.2928f, 13.3197f, 5.707f, 13.3197f)
        curveTo(6.1212f, 13.3197f, 6.457f, 13.6555f, 6.457f, 14.0697f)
        verticalLineTo(15.7197f)
        curveTo(6.457f, 16.2447f, 6.8964f, 16.7012f, 7.8696f, 17.0035f)
        lineTo(7.8735f, 17.0047f)
        curveTo(8.9918f, 17.359f, 10.1922f, 17.359f, 11.3105f, 17.0048f)
        curveTo(11.7043f, 16.88f, 12.1044f, 16.7502f, 12.4241f, 16.4764f)
        curveTo(12.6596f, 16.2747f, 12.787f, 16.0427f, 12.787f, 15.7197f)
        curveTo(12.787f, 15.3478f, 12.787f, 14.5941f, 12.787f, 13.9697f)
        curveTo(12.787f, 13.4174f, 13.2347f, 12.9697f, 13.787f, 12.9697f)
        horizontalLineTo(15.487f)
        curveTo(15.8396f, 12.9697f, 16.0147f, 12.8632f, 16.1619f, 12.6891f)
        curveTo(16.3525f, 12.4638f, 16.5188f, 12.0922f, 16.7124f, 11.4922f)
        curveTo(17.0754f, 10.3376f, 17.0751f, 9.0994f, 16.7116f, 7.945f)
        curveTo(16.5845f, 7.541f, 16.4901f, 7.1187f, 16.2065f, 6.788f)
        curveTo(16.0344f, 6.5873f, 15.8244f, 6.4697f, 15.487f, 6.4697f)
        horizontalLineTo(13.977f)
        curveTo(13.5628f, 6.4697f, 13.227f, 6.1339f, 13.227f, 5.7197f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.4381f, 4.5f)
        curveTo(9.6265f, 4.4977f, 9.8113f, 4.5514f, 9.9691f, 4.6543f)
        curveTo(10.1269f, 4.7572f, 10.2505f, 4.9048f, 10.3242f, 5.0781f)
        curveTo(10.398f, 5.2515f, 10.4185f, 5.4429f, 10.3832f, 5.628f)
        curveTo(10.3479f, 5.813f, 10.2583f, 5.9834f, 10.126f, 6.1174f)
        curveTo(9.9936f, 6.2515f, 9.8244f, 6.3432f, 9.6397f, 6.3808f)
        curveTo(9.4551f, 6.4184f, 9.2635f, 6.4003f, 9.0892f, 6.3288f)
        curveTo(8.915f, 6.2572f, 8.7659f, 6.1355f, 8.661f, 5.979f)
        curveTo(8.556f, 5.8225f, 8.5f, 5.6384f, 8.5f, 5.45f)
        curveTo(8.4984f, 5.3258f, 8.5215f, 5.2025f, 8.568f, 5.0873f)
        curveTo(8.6144f, 4.9721f, 8.6833f, 4.8673f, 8.7705f, 4.779f)
        curveTo(8.8578f, 4.6906f, 8.9618f, 4.6204f, 9.0764f, 4.5725f)
        curveTo(9.191f, 4.5246f, 9.3139f, 4.5f, 9.4381f, 4.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.2718f, 13.8252f)
        curveTo(10.5237f, 13.8252f, 10.7653f, 13.9252f, 10.9435f, 14.1034f)
        curveTo(11.1217f, 14.2816f, 11.2218f, 14.5232f, 11.2218f, 14.7752f)
        curveTo(11.2218f, 15.0271f, 11.1217f, 15.2688f, 10.9435f, 15.4469f)
        curveTo(10.7653f, 15.6251f, 10.5237f, 15.7252f, 10.2718f, 15.7252f)
        curveTo(10.0198f, 15.7252f, 9.7782f, 15.6251f, 9.6f, 15.4469f)
        curveTo(9.4218f, 15.2688f, 9.3217f, 15.0271f, 9.3217f, 14.7752f)
        curveTo(9.3217f, 14.5232f, 9.4218f, 14.2816f, 9.6f, 14.1034f)
        curveTo(9.7782f, 13.9252f, 10.0198f, 13.8252f, 10.2718f, 13.8252f)
        close()
    }
}
.build()
