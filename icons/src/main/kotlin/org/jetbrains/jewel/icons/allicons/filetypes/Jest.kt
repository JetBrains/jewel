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

public val FiletypesGroup.Jest: IntellijIconData
    get() {
        if (_jest != null) {
            return _jest!!
        }
        _jest = IntellijIconData(imageVector = { JestComposable(it) })
        return _jest!!
    }

private var _jest: IntellijIconData? = null

private fun JestComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Jest",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFC63D14)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.3672f, 6.7562f)
        curveTo(3.1447f, 6.7562f, 2.9273f, 6.8221f, 2.7424f, 6.9457f)
        curveTo(2.5575f, 7.0693f, 2.4133f, 7.2449f, 2.3282f, 7.4504f)
        curveTo(2.2431f, 7.6558f, 2.2208f, 7.8819f, 2.2642f, 8.1001f)
        curveTo(2.3076f, 8.3182f, 2.4147f, 8.5186f, 2.572f, 8.6759f)
        curveTo(2.7293f, 8.8331f, 2.9296f, 8.9402f, 3.1478f, 8.9836f)
        curveTo(3.3659f, 9.027f, 3.592f, 9.0047f, 3.7975f, 8.9196f)
        curveTo(4.003f, 8.8345f, 4.1786f, 8.6904f, 4.3022f, 8.5055f)
        curveTo(4.4257f, 8.3205f, 4.4917f, 8.1031f, 4.4917f, 7.8807f)
        curveTo(4.4912f, 7.5826f, 4.3726f, 7.2968f, 4.1618f, 7.086f)
        curveTo(3.951f, 6.8752f, 3.6653f, 6.7566f, 3.3672f, 6.7562f)
        close()
        moveTo(8.2327f, 6.7454f)
        curveTo(8.0103f, 6.7454f, 7.7929f, 6.8114f, 7.608f, 6.935f)
        curveTo(7.4231f, 7.0585f, 7.2789f, 7.2341f, 7.1938f, 7.4396f)
        curveTo(7.1087f, 7.6451f, 7.0864f, 7.8712f, 7.1298f, 8.0893f)
        curveTo(7.1732f, 8.3075f, 7.2803f, 8.5078f, 7.4376f, 8.6651f)
        curveTo(7.5948f, 8.8224f, 7.7952f, 8.9295f, 8.0133f, 8.9729f)
        curveTo(8.2315f, 9.0163f, 8.4576f, 8.994f, 8.6631f, 8.9089f)
        curveTo(8.8686f, 8.8238f, 9.0442f, 8.6796f, 9.1677f, 8.4947f)
        curveTo(9.2913f, 8.3098f, 9.3573f, 8.0924f, 9.3573f, 7.87f)
        curveTo(9.3568f, 7.5719f, 9.2382f, 7.2861f, 9.0274f, 7.0753f)
        curveTo(8.8166f, 6.8645f, 8.5308f, 6.7459f, 8.2327f, 6.7454f)
        close()
        moveTo(13.0797f, 6.7454f)
        curveTo(12.8572f, 6.7454f, 12.6398f, 6.8114f, 12.4549f, 6.935f)
        curveTo(12.27f, 7.0585f, 12.1258f, 7.2341f, 12.0407f, 7.4396f)
        curveTo(11.9556f, 7.6451f, 11.9334f, 7.8712f, 11.9767f, 8.0893f)
        curveTo(12.0201f, 8.3075f, 12.1272f, 8.5078f, 12.2845f, 8.6651f)
        curveTo(12.4418f, 8.8224f, 12.6421f, 8.9295f, 12.8603f, 8.9729f)
        curveTo(13.0784f, 9.0163f, 13.3045f, 8.994f, 13.51f, 8.9089f)
        curveTo(13.7155f, 8.8238f, 13.8911f, 8.6796f, 14.0147f, 8.4947f)
        curveTo(14.1382f, 8.3098f, 14.2042f, 8.0924f, 14.2042f, 7.87f)
        curveTo(14.2037f, 7.5719f, 14.0851f, 7.2861f, 13.8743f, 7.0753f)
        curveTo(13.6635f, 6.8645f, 13.3778f, 6.7459f, 13.0797f, 6.7454f)
        close()
        moveTo(14.1352f, 9.3897f)
        curveTo(13.8596f, 9.5817f, 13.537f, 9.6951f, 13.2019f, 9.7176f)
        curveTo(12.8667f, 9.7402f, 12.5318f, 9.671f, 12.233f, 9.5176f)
        curveTo(11.9342f, 9.3641f, 11.6829f, 9.1322f, 11.5059f, 8.8467f)
        curveTo(11.329f, 8.5612f, 11.2331f, 8.233f, 11.2286f, 7.8971f)
        lineTo(10.0838f, 7.8807f)
        curveTo(10.0823f, 8.1465f, 10.0237f, 8.4089f, 9.9118f, 8.65f)
        curveTo(9.7999f, 8.8911f, 9.6373f, 9.1053f, 9.4353f, 9.2779f)
        curveTo(9.2332f, 9.4506f, 8.9963f, 9.5778f, 8.7407f, 9.6507f)
        curveTo(8.4851f, 9.7236f, 8.2168f, 9.7407f, 7.954f, 9.7006f)
        curveTo(7.6461f, 10.186f, 7.2785f, 10.6308f, 6.86f, 11.0247f)
        curveTo(6.2262f, 11.6312f, 5.4727f, 12.0986f, 4.6477f, 12.3969f)
        lineTo(4.4996f, 12.4495f)
        lineTo(4.3599f, 12.3777f)
        curveTo(3.3383f, 11.853f, 2.8515f, 10.742f, 3.1608f, 9.7204f)
        curveTo(2.9966f, 9.7021f, 2.8358f, 9.6616f, 2.6825f, 9.6f)
        curveTo(2.6322f, 9.7052f, 2.5813f, 9.8115f, 2.5287f, 9.9194f)
        curveTo(2.2245f, 10.5442f, 1.9102f, 11.1898f, 1.7937f, 11.8914f)
        curveTo(1.6682f, 12.6485f, 1.6185f, 14.0297f, 2.6983f, 14.7748f)
        curveTo(4.1683f, 15.7925f, 5.7293f, 15.0196f, 7.5351f, 14.1224f)
        curveTo(8.4397f, 13.6741f, 9.3708f, 13.2105f, 10.3342f, 12.973f)
        curveTo(10.6989f, 12.8831f, 11.0692f, 12.8294f, 11.4327f, 12.7774f)
        curveTo(12.1061f, 12.6801f, 12.7416f, 12.5885f, 13.2724f, 12.281f)
        curveTo(13.5504f, 12.1229f, 13.7901f, 11.9057f, 13.9747f, 11.6446f)
        curveTo(14.1593f, 11.3835f, 14.2841f, 11.085f, 14.3404f, 10.7703f)
        curveTo(14.4196f, 10.3f, 14.3478f, 9.8166f, 14.1352f, 9.3897f)
        close()
        moveTo(6.7893f, 0.7265f)
        lineTo(8.5946f, 6.0546f)
        curveTo(8.6756f, 6.0709f, 8.7555f, 6.0926f, 8.8337f, 6.1196f)
        lineTo(10.6288f, 2.4905f)
        lineTo(12.4204f, 6.1411f)
        curveTo(12.4952f, 6.1126f, 12.5716f, 6.089f, 12.6494f, 6.0704f)
        lineTo(14.4586f, 0.7265f)
        horizontalLineTo(6.7893f)
        close()
    }
}
.build()
