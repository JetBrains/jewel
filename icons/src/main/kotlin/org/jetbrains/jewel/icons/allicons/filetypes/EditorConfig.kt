package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val FiletypesGroup.EditorConfig: IntellijIconData
    get() {
        if (_editorConfig != null) {
            return _editorConfig!!
        }
        _editorConfig = IntellijIconData(name = "EditorConfig",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { EditorConfigComposable(it) })
        return _editorConfig!!
    }

private var _editorConfig: IntellijIconData? = null

private fun EditorConfigComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "EditorConfig", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.5486f, 5.2886f)
        curveTo(1.5276f, 5.3384f, 1.5072f, 5.3886f, 1.4874f, 5.439f)
        curveTo(1.4047f, 5.6492f, 1.4318f, 5.885f, 1.5469f, 6.0794f)
        lineTo(2.4494f, 7.6038f)
        curveTo(2.5941f, 7.8481f, 2.5941f, 8.1519f, 2.4494f, 8.3962f)
        lineTo(1.5469f, 9.9206f)
        curveTo(1.4318f, 10.115f, 1.4047f, 10.3508f, 1.4874f, 10.561f)
        curveTo(1.5071f, 10.6112f, 1.5274f, 10.6611f, 1.5483f, 10.7107f)
        moveTo(1.5486f, 5.2886f)
        curveTo(1.7786f, 4.7415f, 2.0762f, 4.2298f, 2.4309f, 3.7639f)
        curveTo(2.4635f, 3.7211f, 2.4965f, 3.6786f, 2.5301f, 3.6366f)
        curveTo(2.671f, 3.4601f, 2.8886f, 3.3658f, 3.1144f, 3.3683f)
        lineTo(4.8836f, 3.3877f)
        curveTo(4.9013f, 3.3879f, 4.919f, 3.3875f, 4.9365f, 3.3865f)
        curveTo(5.1999f, 3.3714f, 5.4393f, 3.2235f, 5.5699f, 2.9915f)
        lineTo(6.4382f, 1.4488f)
        curveTo(6.438f, 1.449f, 6.4383f, 1.4485f, 6.4382f, 1.4488f)
        curveTo(6.5492f, 1.2519f, 6.7403f, 1.1101f, 6.9639f, 1.0768f)
        curveTo(7.0173f, 1.0688f, 7.0708f, 1.0615f, 7.1246f, 1.0547f)
        curveTo(7.4127f, 1.0186f, 7.7062f, 1.0f, 8.0041f, 1.0f)
        curveTo(8.3019f, 1.0f, 8.5953f, 1.0186f, 8.8834f, 1.0547f)
        curveTo(8.8831f, 1.0547f, 8.8837f, 1.0547f, 8.8834f, 1.0547f)
        curveTo(8.9369f, 1.0614f, 8.991f, 1.0688f, 9.0441f, 1.0767f)
        curveTo(9.2675f, 1.11f, 9.4582f, 1.2511f, 9.5693f, 1.4477f)
        curveTo(9.5695f, 1.4481f, 9.5697f, 1.4484f, 9.5699f, 1.4487f)
        lineTo(10.4382f, 2.9915f)
        curveTo(10.5774f, 3.2389f, 10.8405f, 3.3908f, 11.1245f, 3.3877f)
        lineTo(12.8938f, 3.3683f)
        curveTo(12.8936f, 3.3683f, 12.8939f, 3.3683f, 12.8938f, 3.3683f)
        curveTo(13.1194f, 3.366f, 13.3373f, 3.4602f, 13.4781f, 3.6366f)
        curveTo(13.5113f, 3.6783f, 13.5441f, 3.7204f, 13.5765f, 3.7628f)
        curveTo(13.5767f, 3.7632f, 13.577f, 3.7635f, 13.5773f, 3.7639f)
        curveTo(13.9319f, 4.2298f, 14.2295f, 4.7414f, 14.4596f, 5.2885f)
        curveTo(14.4594f, 5.2882f, 14.4597f, 5.2888f, 14.4596f, 5.2885f)
        curveTo(14.4804f, 5.338f, 14.501f, 5.3887f, 14.5207f, 5.4388f)
        curveTo(14.6034f, 5.6489f, 14.5763f, 5.8845f, 14.4615f, 6.0788f)
        curveTo(14.4616f, 6.0786f, 14.4614f, 6.079f, 14.4615f, 6.0788f)
        lineTo(13.5586f, 7.6038f)
        curveTo(13.4139f, 7.8481f, 13.4139f, 8.1519f, 13.5586f, 8.3962f)
        lineTo(14.4612f, 9.9207f)
        curveTo(14.4611f, 9.9206f, 14.4612f, 9.9208f, 14.4612f, 9.9207f)
        curveTo(14.5761f, 10.1151f, 14.6034f, 10.351f, 14.5207f, 10.5612f)
        curveTo(14.5013f, 10.6106f, 14.4813f, 10.6598f, 14.4607f, 10.7087f)
        curveTo(14.4603f, 10.7097f, 14.4599f, 10.7106f, 14.4596f, 10.7115f)
        curveTo(14.2295f, 11.2586f, 13.9319f, 11.7703f, 13.5773f, 12.2361f)
        curveTo(13.5447f, 12.2789f, 13.5116f, 12.3214f, 13.4781f, 12.3634f)
        curveTo(13.3372f, 12.5399f, 13.1196f, 12.6342f, 12.8938f, 12.6317f)
        lineTo(11.1245f, 12.6123f)
        curveTo(11.1067f, 12.6121f, 11.0891f, 12.6125f, 11.0715f, 12.6135f)
        curveTo(10.8081f, 12.6285f, 10.5687f, 12.7765f, 10.4382f, 13.0085f)
        lineTo(9.5699f, 14.5513f)
        curveTo(9.57f, 14.5511f, 9.5697f, 14.5515f, 9.5699f, 14.5513f)
        curveTo(9.4588f, 14.7481f, 9.2677f, 14.89f, 9.0441f, 14.9233f)
        curveTo(8.9908f, 14.9312f, 8.9372f, 14.9386f, 8.8834f, 14.9453f)
        curveTo(8.5953f, 14.9814f, 8.3019f, 15.0f, 8.0041f, 15.0f)
        curveTo(7.7062f, 15.0f, 7.4127f, 14.9814f, 7.1246f, 14.9453f)
        curveTo(7.1241f, 14.9452f, 7.1235f, 14.9451f, 7.123f, 14.9451f)
        curveTo(7.0698f, 14.9384f, 7.0167f, 14.9311f, 6.9639f, 14.9232f)
        curveTo(6.7401f, 14.8899f, 6.5491f, 14.7484f, 6.4382f, 14.5512f)
        lineTo(5.5699f, 13.0085f)
        curveTo(5.4306f, 12.7611f, 5.1675f, 12.6092f, 4.8836f, 12.6123f)
        lineTo(3.1144f, 12.6317f)
        curveTo(2.8886f, 12.6342f, 2.671f, 12.5399f, 2.5301f, 12.3634f)
        curveTo(2.4966f, 12.3214f, 2.4635f, 12.2789f, 2.4309f, 12.2361f)
        curveTo(2.0762f, 11.7702f, 1.7783f, 11.2578f, 1.5483f, 10.7107f)
        moveTo(3.2266f, 4.3696f)
        curveTo(3.2095f, 4.392f, 3.1927f, 4.4145f, 3.1759f, 4.4371f)
        curveTo(2.894f, 4.8184f, 2.6563f, 5.234f, 2.4704f, 5.6763f)
        lineTo(3.3099f, 7.0943f)
        curveTo(3.6406f, 7.6528f, 3.6406f, 8.3472f, 3.3099f, 8.9057f)
        lineTo(2.4704f, 10.3237f)
        curveTo(2.4815f, 10.3503f, 2.4929f, 10.3769f, 2.5045f, 10.4033f)
        curveTo(2.6965f, 10.8419f, 2.9396f, 11.2535f, 3.2266f, 11.6304f)
        lineTo(4.8726f, 11.6124f)
        curveTo(5.5216f, 11.6053f, 6.123f, 11.9524f, 6.4413f, 12.5181f)
        lineTo(7.249f, 13.953f)
        curveTo(7.2578f, 13.9542f, 7.2667f, 13.9552f, 7.2755f, 13.9563f)
        curveTo(7.514f, 13.9851f, 7.7571f, 14.0f, 8.0041f, 14.0f)
        curveTo(8.2602f, 14.0f, 8.5121f, 13.984f, 8.759f, 13.9531f)
        lineTo(9.5667f, 12.5181f)
        curveTo(9.8851f, 11.9524f, 10.4864f, 11.6053f, 11.1354f, 11.6124f)
        lineTo(12.7816f, 11.6304f)
        curveTo(12.7986f, 11.608f, 12.8155f, 11.5855f, 12.8322f, 11.5629f)
        curveTo(13.1142f, 11.1816f, 13.3518f, 10.766f, 13.5377f, 10.3239f)
        lineTo(12.6981f, 8.9057f)
        curveTo(12.6568f, 8.8359f, 12.6206f, 8.764f, 12.5896f, 8.6904f)
        curveTo(12.3726f, 8.1757f, 12.4088f, 7.583f, 12.6981f, 7.0943f)
        lineTo(13.5377f, 5.6761f)
        curveTo(13.5266f, 5.6495f, 13.5152f, 5.623f, 13.5036f, 5.5966f)
        curveTo(13.3117f, 5.1581f, 13.0685f, 4.7465f, 12.7816f, 4.3696f)
        lineTo(11.1354f, 4.3876f)
        curveTo(10.4864f, 4.3948f, 9.8851f, 4.0476f, 9.5667f, 3.4819f)
        lineTo(8.759f, 2.0469f)
        curveTo(8.7502f, 2.0458f, 8.7414f, 2.0447f, 8.7325f, 2.0437f)
        curveTo(8.4941f, 2.0149f, 8.251f, 2.0f, 8.0041f, 2.0f)
        curveTo(7.7479f, 2.0f, 7.4959f, 2.016f, 7.249f, 2.047f)
        lineTo(6.4413f, 3.4819f)
        curveTo(6.123f, 4.0476f, 5.5216f, 4.3948f, 4.8726f, 4.3876f)
        lineTo(3.2266f, 4.3696f)
        close()
        moveTo(8.004f, 9.651f)
        curveTo(8.9158f, 9.651f, 9.655f, 8.9118f, 9.655f, 8.0f)
        curveTo(9.655f, 7.0882f, 8.9158f, 6.349f, 8.004f, 6.349f)
        curveTo(7.0922f, 6.349f, 6.353f, 7.0882f, 6.353f, 8.0f)
        curveTo(6.353f, 8.9118f, 7.0922f, 9.651f, 8.004f, 9.651f)
        close()
        moveTo(10.655f, 8.0f)
        curveTo(10.655f, 9.4641f, 9.4681f, 10.651f, 8.004f, 10.651f)
        curveTo(6.5399f, 10.651f, 5.353f, 9.4641f, 5.353f, 8.0f)
        curveTo(5.353f, 6.5359f, 6.5399f, 5.349f, 8.004f, 5.349f)
        curveTo(9.4681f, 5.349f, 10.655f, 6.5359f, 10.655f, 8.0f)
        close()
    }
}
.build()
