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

public val FiletypesGroup.Yarn: IntellijIconData
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = IntellijIconData(imageVector = { YarnComposable(it) })
        return _yarn!!
    }

private var _yarn: IntellijIconData? = null

private fun YarnComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Yarn",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF498DB7)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.1031f, 12.2043f)
        curveTo(13.3868f, 12.3661f, 12.7124f, 12.6765f, 12.1236f, 13.1153f)
        curveTo(11.2152f, 13.6855f, 10.2337f, 14.1298f, 9.206f, 14.4364f)
        curveTo(9.08f, 14.5835f, 8.9058f, 14.681f, 8.7145f, 14.7114f)
        curveTo(7.6457f, 14.8634f, 6.5697f, 14.9597f, 5.4909f, 14.9999f)
        curveTo(4.9093f, 15.0044f, 4.5528f, 14.8499f, 4.4538f, 14.6119f)
        curveTo(4.4131f, 14.5155f, 4.3919f, 14.4119f, 4.3917f, 14.3073f)
        curveTo(4.3914f, 14.2026f, 4.4121f, 14.099f, 4.4524f, 14.0024f)
        curveTo(4.4927f, 13.9058f, 4.5519f, 13.8182f, 4.6265f, 13.7448f)
        curveTo(4.7011f, 13.6714f, 4.7896f, 13.6136f, 4.8868f, 13.5749f)
        curveTo(4.7959f, 13.5191f, 4.71f, 13.4557f, 4.6298f, 13.3854f)
        curveTo(4.5443f, 13.2999f, 4.4538f, 13.1283f, 4.4268f, 13.1913f)
        curveTo(4.3143f, 13.4664f, 4.2553f, 14.1384f, 3.9533f, 14.4414f)
        curveTo(3.5383f, 14.8609f, 2.7533f, 14.7209f, 2.2893f, 14.4774f)
        curveTo(1.7797f, 14.2069f, 2.3253f, 13.5709f, 2.3253f, 13.5709f)
        curveTo(2.2816f, 13.593f, 2.2339f, 13.6061f, 2.1851f, 13.6095f)
        curveTo(2.1362f, 13.6128f, 2.0872f, 13.6063f, 2.0409f, 13.5903f)
        curveTo(1.9946f, 13.5743f, 1.952f, 13.5491f, 1.9157f, 13.5163f)
        curveTo(1.8793f, 13.4835f, 1.8499f, 13.4437f, 1.8292f, 13.3994f)
        curveTo(1.5637f, 12.956f, 1.4468f, 12.4393f, 1.4957f, 11.9248f)
        curveTo(1.6238f, 11.3607f, 1.9305f, 10.8531f, 2.3703f, 10.4773f)
        curveTo(2.301f, 9.7281f, 2.4139f, 8.9733f, 2.6993f, 8.2772f)
        curveTo(3.0762f, 7.5515f, 3.6183f, 6.9245f, 4.2818f, 6.4466f)
        curveTo(4.2818f, 6.4466f, 3.3128f, 5.3731f, 3.6738f, 4.4081f)
        curveTo(3.9083f, 3.7771f, 4.0028f, 3.7815f, 4.0798f, 3.7541f)
        curveTo(4.3521f, 3.6701f, 4.6008f, 3.5233f, 4.8058f, 3.3255f)
        curveTo(5.0817f, 3.0218f, 5.4248f, 2.7868f, 5.8076f, 2.6392f)
        curveTo(6.1905f, 2.4916f, 6.6025f, 2.4355f, 7.0109f, 2.4755f)
        curveTo(7.0109f, 2.4755f, 7.5989f, 0.6995f, 8.1375f, 1.0445f)
        curveTo(8.4354f, 1.5017f, 8.6919f, 1.9847f, 8.904f, 2.4875f)
        curveTo(8.904f, 2.4875f, 9.5445f, 2.1135f, 9.6165f, 2.253f)
        curveTo(9.9848f, 3.2313f, 10.0753f, 4.2925f, 9.878f, 5.3191f)
        curveTo(9.6452f, 6.3043f, 9.2017f, 7.2274f, 8.578f, 8.0247f)
        curveTo(8.5105f, 8.1372f, 9.3535f, 8.4937f, 9.8855f, 9.9683f)
        curveTo(10.377f, 11.3183f, 9.9395f, 12.4483f, 10.0165f, 12.5743f)
        curveTo(10.03f, 12.5968f, 10.0345f, 12.6058f, 10.0345f, 12.6058f)
        curveTo(10.0345f, 12.6058f, 10.598f, 12.6508f, 11.7301f, 11.9518f)
        curveTo(12.3564f, 11.4943f, 13.0959f, 11.217f, 13.8686f, 11.1498f)
        curveTo(14.0072f, 11.1221f, 14.1511f, 11.1498f, 14.2696f, 11.227f)
        curveTo(14.388f, 11.3041f, 14.4715f, 11.4246f, 14.5021f, 11.5626f)
        curveTo(14.5328f, 11.7005f, 14.5082f, 11.845f, 14.4336f, 11.9651f)
        curveTo(14.359f, 12.0851f, 14.2404f, 12.1712f, 14.1031f, 12.2048f)
        verticalLineTo(12.2043f)
        close()
    }
}
.build()
