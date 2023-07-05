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

public val FiletypesGroup.Cucumber: IntellijIconData
    get() {
        if (_cucumber != null) {
            return _cucumber!!
        }
        _cucumber = IntellijIconData(imageVector = { CucumberComposable(it) })
        return _cucumber!!
    }

private var _cucumber: IntellijIconData? = null

private fun CucumberComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Cucumber", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF00A817)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.4178f, 9.1608f)
        curveTo(11.2188f, 9.1608f, 11.057f, 9.1144f, 10.858f, 9.032f)
        curveTo(10.3007f, 8.7851f, 9.8952f, 8.2932f, 9.776f, 7.7578f)
        curveTo(10.0743f, 7.552f, 10.4437f, 7.4417f, 10.8083f, 7.4493f)
        curveTo(11.0269f, 7.4533f, 11.2462f, 7.498f, 11.455f, 7.5907f)
        curveTo(11.6143f, 7.673f, 11.7685f, 7.7503f, 11.9279f, 7.8738f)
        curveTo(12.4852f, 8.2856f, 12.1344f, 9.202f, 11.4178f, 9.1608f)
        close()
        moveTo(8.9798f, 10.8853f)
        curveTo(8.8601f, 10.7618f, 8.7857f, 10.5994f, 8.7059f, 10.4348f)
        curveTo(8.467f, 9.8583f, 8.5492f, 9.2404f, 8.8677f, 8.7873f)
        curveTo(9.425f, 8.9111f, 9.9348f, 9.2793f, 10.1737f, 9.8557f)
        curveTo(10.2535f, 10.0204f, 10.2983f, 10.2315f, 10.2983f, 10.3964f)
        curveTo(10.3379f, 11.0138f, 9.4176f, 11.3794f, 8.9798f, 10.8853f)
        close()
        moveTo(8.6312f, 3.6782f)
        curveTo(8.7108f, 3.5136f, 8.7857f, 3.354f, 8.9049f, 3.1893f)
        curveTo(9.0691f, 2.9886f, 9.3041f, 2.9083f, 9.5268f, 2.932f)
        curveTo(9.8986f, 2.9712f, 10.2483f, 3.2795f, 10.2236f, 3.7168f)
        curveTo(10.2236f, 3.8817f, 10.1788f, 4.0928f, 10.099f, 4.2575f)
        curveTo(9.8604f, 4.834f, 9.3875f, 5.2019f, 8.8305f, 5.3256f)
        curveTo(8.4721f, 4.8726f, 8.3924f, 4.2547f, 8.6312f, 3.6782f)
        close()
        moveTo(7.5492f, 10.3964f)
        curveTo(7.4696f, 10.561f, 7.3947f, 10.7206f, 7.2755f, 10.8853f)
        curveTo(6.8773f, 11.4206f, 5.9543f, 11.0448f, 5.9942f, 10.3446f)
        curveTo(5.9942f, 10.18f, 6.039f, 9.9817f, 6.1185f, 9.8171f)
        curveTo(6.3574f, 9.2404f, 6.8301f, 8.8724f, 7.3874f, 8.749f)
        curveTo(7.7058f, 9.2431f, 7.788f, 9.8608f, 7.5492f, 10.3964f)
        close()
        moveTo(5.3598f, 9.0707f)
        curveTo(5.2005f, 9.153f, 4.999f, 9.1992f, 4.7998f, 9.1992f)
        curveTo(4.0834f, 9.2404f, 3.7351f, 8.378f, 4.2525f, 7.9253f)
        curveTo(4.372f, 7.8018f, 4.5262f, 7.7116f, 4.7254f, 7.6293f)
        curveTo(4.9344f, 7.5366f, 5.1535f, 7.4922f, 5.372f, 7.4876f)
        curveTo(5.7348f, 7.4811f, 6.0907f, 7.5887f, 6.3922f, 7.7967f)
        curveTo(6.3127f, 8.3321f, 5.9171f, 8.8235f, 5.3598f, 9.0707f)
        close()
        moveTo(4.6757f, 4.9524f)
        curveTo(4.7176f, 4.9501f, 4.7553f, 4.9471f, 4.8f, 4.9524f)
        curveTo(4.999f, 4.9524f, 5.1608f, 4.9989f, 5.3598f, 5.0812f)
        curveTo(5.9171f, 5.3281f, 6.3227f, 5.82f, 6.4419f, 6.3554f)
        curveTo(5.9644f, 6.6846f, 5.3199f, 6.7695f, 4.7628f, 6.5225f)
        curveTo(4.6035f, 6.4402f, 4.4491f, 6.3501f, 4.29f, 6.2266f)
        curveTo(3.7674f, 5.8019f, 4.0479f, 4.9857f, 4.6757f, 4.9524f)
        close()
        moveTo(6.6286f, 2.9704f)
        curveTo(6.8467f, 2.9489f, 7.0738f, 3.0272f, 7.2381f, 3.228f)
        curveTo(7.3575f, 3.3514f, 7.4322f, 3.5136f, 7.5117f, 3.6782f)
        curveTo(7.7506f, 4.2547f, 7.6686f, 4.8728f, 7.3499f, 5.3256f)
        curveTo(6.7929f, 5.2019f, 6.2828f, 4.834f, 6.0439f, 4.2575f)
        curveTo(5.9641f, 4.0928f, 5.9196f, 3.8817f, 5.9196f, 3.7168f)
        curveTo(5.9196f, 3.3052f, 6.2652f, 3.0063f, 6.6286f, 2.9704f)
        close()
        moveTo(11.0834f, 1.8248f)
        curveTo(10.9736f, 1.7593f, 10.8625f, 1.6937f, 10.7478f, 1.6363f)
        curveTo(10.631f, 1.5779f, 10.511f, 1.5206f, 10.3889f, 1.4715f)
        curveTo(10.3504f, 1.4548f, 10.3123f, 1.44f, 10.2733f, 1.4242f)
        curveTo(10.1669f, 1.3844f, 10.0595f, 1.3392f, 9.9493f, 1.3065f)
        curveTo(9.3562f, 1.1073f, 8.7217f, 1.0f, 8.0633f, 1.0f)
        curveTo(4.712f, 1.0f, 2.0f, 3.7621f, 2.0f, 7.175f)
        curveTo(2.0f, 10.1799f, 4.115f, 12.6767f, 6.9062f, 13.2321f)
        verticalLineTo(15.0f)
        curveTo(10.5349f, 14.4428f, 13.748f, 11.5092f, 13.9877f, 7.6584f)
        curveTo(14.1319f, 5.3404f, 12.9972f, 2.9741f, 11.0834f, 1.8248f)
        close()
    }
}
.build()
