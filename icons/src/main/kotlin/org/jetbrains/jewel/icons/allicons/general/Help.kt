package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Help: IntellijIconData
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = IntellijIconData(name = "Help",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { HelpComposable(it) })
        return _help!!
    }

private var _help: IntellijIconData? = null

private fun HelpComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Help",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.8f, 14.15f)
        moveToRelative(-0.85f, 0.0f)
        arcToRelative(0.85f, 0.85f, 0.0f, true, true, 1.7f, 0.0f)
        arcToRelative(0.85f, 0.85f, 0.0f, true, true, -1.7f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.9796f, 8.2513f)
        curveTo(8.2042f, 8.0139f, 8.4979f, 7.7362f, 8.8602f, 7.4184f)
        curveTo(9.2324f, 7.0904f, 9.5273f, 6.8079f, 9.7457f, 6.5708f)
        lineTo(9.7467f, 6.5697f)
        curveTo(9.9662f, 6.338f, 10.1503f, 6.0594f, 10.2982f, 5.7327f)
        lineTo(10.2988f, 5.7313f)
        curveTo(10.45f, 5.4108f, 10.5268f, 5.0457f, 10.5268f, 4.634f)
        curveTo(10.5268f, 4.1354f, 10.4222f, 3.6961f, 10.2158f, 3.3135f)
        curveTo(10.0093f, 2.931f, 9.7188f, 2.6344f, 9.3426f, 2.4221f)
        lineTo(9.3415f, 2.4215f)
        curveTo(8.9658f, 2.2033f, 8.5339f, 2.093f, 8.0428f, 2.093f)
        curveTo(7.5326f, 2.093f, 7.0814f, 2.2065f, 6.6865f, 2.4312f)
        curveTo(6.298f, 2.656f, 5.9944f, 2.9713f, 5.775f, 3.3796f)
        curveTo(5.6727f, 3.5725f, 5.5947f, 3.7792f, 5.5413f, 4.0f)
        curveTo(5.5164f, 4.1025f, 5.4969f, 4.2081f, 5.4827f, 4.3167f)
        curveTo(5.4432f, 4.6187f, 5.2074f, 4.867f, 4.9029f, 4.867f)
        horizontalLineTo(4.779f)
        curveTo(4.4783f, 4.867f, 4.2378f, 4.6172f, 4.2493f, 4.3167f)
        curveTo(4.2596f, 4.2093f, 4.2736f, 4.1037f, 4.2914f, 4.0f)
        curveTo(4.365f, 3.5712f, 4.5031f, 3.1739f, 4.7064f, 2.8089f)
        curveTo(5.0323f, 2.2353f, 5.4864f, 1.7906f, 6.0664f, 1.4777f)
        curveTo(6.6466f, 1.1583f, 7.3095f, 1.0f, 8.0523f, 1.0f)
        curveTo(8.7757f, 1.0f, 9.4194f, 1.1518f, 9.9806f, 1.4584f)
        curveTo(10.5475f, 1.7583f, 10.9888f, 2.1797f, 11.3023f, 2.7219f)
        curveTo(11.6162f, 3.2647f, 11.7718f, 3.8872f, 11.7718f, 4.5865f)
        curveTo(11.7718f, 5.1358f, 11.6813f, 5.6247f, 11.4976f, 6.0511f)
        curveTo(11.3166f, 6.4712f, 11.0924f, 6.8264f, 10.8239f, 7.1147f)
        curveTo(10.567f, 7.3972f, 10.2283f, 7.7197f, 9.8088f, 8.082f)
        curveTo(9.4742f, 8.3724f, 9.2138f, 8.6141f, 9.0267f, 8.8075f)
        curveTo(8.8506f, 8.9897f, 8.7012f, 9.2028f, 8.5787f, 9.4477f)
        lineTo(8.5783f, 9.4486f)
        curveTo(8.4595f, 9.6802f, 8.3993f, 9.9398f, 8.3993f, 10.2295f)
        curveTo(8.3993f, 10.4946f, 8.1844f, 10.7095f, 7.9193f, 10.7095f)
        horizontalLineTo(7.7198f)
        curveTo(7.4284f, 10.7095f, 7.1923f, 10.4733f, 7.1923f, 10.182f)
        curveTo(7.1923f, 9.7768f, 7.2675f, 9.4104f, 7.4202f, 9.085f)
        curveTo(7.57f, 8.766f, 7.7564f, 8.4877f, 7.9796f, 8.2513f)
        close()
    }
}
.build()
