package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Profile: IntellijIconData
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = IntellijIconData(name = "Profile",size = DpSize(height = 16.0.dp, width =
                17.0.dp),imageVector = { ProfileComposable(it) })
        return _profile!!
    }

private var _profile: IntellijIconData? = null

private fun ProfileComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Profile", defaultWidth = 17.0.dp, defaultHeight = 16.0.dp, viewportWidth = 17.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(9.0f, 9.5021f)
        curveTo(9.0f, 8.3244f, 10.2951f, 7.6061f, 11.2942f, 8.2297f)
        lineTo(15.2962f, 10.7275f)
        curveTo(16.2372f, 11.3149f, 16.2372f, 12.6851f, 15.2962f, 13.2725f)
        lineTo(11.2942f, 15.7703f)
        curveTo(10.2951f, 16.3939f, 9.0f, 15.6756f, 9.0f, 14.4978f)
        verticalLineTo(9.5021f)
        close()
        moveTo(10.7647f, 9.078f)
        curveTo(10.4317f, 8.8701f, 10.0f, 9.1096f, 10.0f, 9.5021f)
        verticalLineTo(14.4978f)
        curveTo(10.0f, 14.8904f, 10.4317f, 15.1298f, 10.7647f, 14.922f)
        lineTo(14.7667f, 12.4241f)
        curveTo(15.0804f, 12.2284f, 15.0804f, 11.7716f, 14.7667f, 11.5758f)
        lineTo(10.7647f, 9.078f)
        close()
    }
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 9.5022f)
        curveTo(10.0f, 9.1096f, 10.4317f, 8.8701f, 10.7647f, 9.078f)
        lineTo(14.7667f, 11.5758f)
        curveTo(15.0804f, 11.7716f, 15.0804f, 12.2284f, 14.7667f, 12.4242f)
        lineTo(10.7647f, 14.922f)
        curveTo(10.4317f, 15.1299f, 10.0f, 14.8904f, 10.0f, 14.4978f)
        verticalLineTo(9.5022f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 9.0f)
        curveTo(1.5f, 5.4102f, 4.4102f, 2.5f, 8.0f, 2.5f)
        curveTo(11.5899f, 2.5f, 14.5f, 5.4102f, 14.5f, 9.0f)
        curveTo(14.5f, 9.0172f, 14.4999f, 9.0344f, 14.4997f, 9.0518f)
        lineTo(15.4651f, 9.6544f)
        curveTo(15.4879f, 9.4279f, 15.5f, 9.2081f, 15.5f, 9.0f)
        curveTo(15.5f, 4.8579f, 12.1421f, 1.5f, 8.0f, 1.5f)
        curveTo(3.8579f, 1.5f, 0.5f, 4.8579f, 0.5f, 9.0f)
        curveTo(0.5f, 10.1604f, 0.8772f, 11.6805f, 1.3664f, 12.7304f)
        curveTo(1.4446f, 12.8984f, 1.6159f, 13.0f, 1.8013f, 13.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(2.1392f)
        curveTo(1.7697f, 11.0874f, 1.5f, 9.8909f, 1.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 10.6f)
        verticalLineTo(9.6f)
        curveTo(7.5583f, 9.5999f, 7.2002f, 9.2418f, 7.2002f, 8.8f)
        curveTo(7.2002f, 8.3582f, 7.5584f, 8.0f, 8.0002f, 8.0f)
        curveTo(8.1521f, 8.0f, 8.2942f, 8.0423f, 8.4151f, 8.1159f)
        curveTo(8.6065f, 7.8299f, 8.8545f, 7.5894f, 9.1385f, 7.4055f)
        curveTo(8.9793f, 7.2755f, 8.7975f, 7.1721f, 8.5999f, 7.1023f)
        verticalLineTo(4.0f)
        curveTo(8.5999f, 3.6686f, 8.3313f, 3.4f, 7.9999f, 3.4f)
        curveTo(7.6685f, 3.4f, 7.3999f, 3.6686f, 7.3999f, 4.0f)
        verticalLineTo(7.1025f)
        curveTo(6.7009f, 7.3497f, 6.2002f, 8.0164f, 6.2002f, 8.8f)
        curveTo(6.2002f, 9.7941f, 7.006f, 10.5999f, 8.0f, 10.6f)
        close()
    }
}
.build()
