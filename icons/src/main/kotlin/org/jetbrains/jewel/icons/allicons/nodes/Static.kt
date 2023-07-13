package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Static: IntellijIconData
    get() {
        if (_static != null) {
            return _static!!
        }
        _static = IntellijIconData(name = "Static",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { StaticComposable(it) })
        return _static!!
    }

private var _static: IntellijIconData? = null

private fun StaticComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Static", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.orangeFill), stroke = SolidColor(Color(0xFFE66D17)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.9751f, 11.5f)
        curveTo(7.4701f, 11.5f, 7.013f, 11.4195f, 6.6038f, 11.2584f)
        curveTo(6.199f, 11.0973f, 5.8747f, 10.8731f, 5.6309f, 10.5858f)
        curveTo(5.3914f, 10.2942f, 5.263f, 9.9655f, 5.2456f, 9.5998f)
        horizontalLineTo(6.31f)
        curveTo(6.3274f, 9.8001f, 6.4101f, 9.9807f, 6.5581f, 10.1418f)
        curveTo(6.7061f, 10.2985f, 6.902f, 10.4226f, 7.1458f, 10.514f)
        curveTo(7.3896f, 10.6054f, 7.6617f, 10.6511f, 7.962f, 10.6511f)
        curveTo(8.2668f, 10.6511f, 8.5345f, 10.6011f, 8.7652f, 10.5009f)
        curveTo(9.0003f, 10.4008f, 9.1809f, 10.2615f, 9.3072f, 10.083f)
        curveTo(9.4378f, 9.9045f, 9.5031f, 9.7021f, 9.5031f, 9.4757f)
        curveTo(9.5031f, 9.232f, 9.4334f, 9.0274f, 9.2941f, 8.8619f)
        curveTo(9.1592f, 8.6922f, 8.9698f, 8.5855f, 8.726f, 8.542f)
        lineTo(7.1131f, 8.2481f)
        curveTo(6.5995f, 8.1524f, 6.199f, 7.9456f, 5.9117f, 7.6278f)
        curveTo(5.6243f, 7.3057f, 5.4807f, 6.8986f, 5.4807f, 6.4067f)
        curveTo(5.4807f, 6.0541f, 5.5808f, 5.7341f, 5.7811f, 5.4468f)
        curveTo(5.9857f, 5.1552f, 6.2708f, 4.9244f, 6.6365f, 4.7547f)
        curveTo(7.0021f, 4.5849f, 7.4201f, 4.5f, 7.8902f, 4.5f)
        curveTo(8.356f, 4.5f, 8.7761f, 4.5762f, 9.1505f, 4.7285f)
        curveTo(9.5248f, 4.8809f, 9.823f, 5.092f, 10.045f, 5.3619f)
        curveTo(10.2671f, 5.6318f, 10.3868f, 5.9322f, 10.4042f, 6.2631f)
        horizontalLineTo(9.3398f)
        curveTo(9.3268f, 6.0889f, 9.2549f, 5.9322f, 9.1243f, 5.7929f)
        curveTo(8.9981f, 5.6536f, 8.8283f, 5.5448f, 8.615f, 5.4664f)
        curveTo(8.4017f, 5.3881f, 8.1623f, 5.3489f, 7.8967f, 5.3489f)
        curveTo(7.6268f, 5.3489f, 7.3874f, 5.3946f, 7.1784f, 5.486f)
        curveTo(6.9695f, 5.5774f, 6.8062f, 5.7037f, 6.6887f, 5.8647f)
        curveTo(6.5755f, 6.0215f, 6.5189f, 6.1999f, 6.5189f, 6.4002f)
        curveTo(6.5189f, 6.6266f, 6.582f, 6.8137f, 6.7083f, 6.9618f)
        curveTo(6.8345f, 7.1098f, 7.0195f, 7.2055f, 7.2633f, 7.2491f)
        lineTo(8.9154f, 7.5429f)
        curveTo(9.2549f, 7.6039f, 9.5466f, 7.7236f, 9.7904f, 7.9021f)
        curveTo(10.0385f, 8.0805f, 10.2257f, 8.3026f, 10.3519f, 8.5681f)
        curveTo(10.4825f, 8.8336f, 10.5478f, 9.1231f, 10.5478f, 9.4366f)
        curveTo(10.5478f, 9.8284f, 10.4347f, 10.181f, 10.2083f, 10.4944f)
        curveTo(9.9863f, 10.8078f, 9.6794f, 11.0538f, 9.2876f, 11.2323f)
        curveTo(8.8958f, 11.4108f, 8.4583f, 11.5f, 7.9751f, 11.5f)
        close()
    }
}
.build()
