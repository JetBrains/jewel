package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
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

public val FiletypesGroup.Freemaker: IntellijIconData
    get() {
        if (_freemaker != null) {
            return _freemaker!!
        }
        _freemaker = IntellijIconData(name = "Freemaker",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { FreemakerComposable(it) })
        return _freemaker!!
    }

private var _freemaker: IntellijIconData? = null

private fun FreemakerComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Freemaker", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.4235f, 6.753f)
        curveTo(11.4235f, 6.4401f, 11.1699f, 6.1865f, 10.857f, 6.1865f)
        horizontalLineTo(10.3455f)
        lineTo(10.5932f, 5.0387f)
        curveTo(10.6751f, 4.6587f, 10.3855f, 4.3f, 9.9968f, 4.3f)
        curveTo(9.7093f, 4.3f, 9.4608f, 4.5007f, 9.4004f, 4.7818f)
        lineTo(9.097f, 6.192f)
        horizontalLineTo(7.5625f)
        lineTo(7.8107f, 5.0384f)
        curveTo(7.8924f, 4.6585f, 7.6028f, 4.3f, 7.2142f, 4.3f)
        curveTo(6.9265f, 4.3f, 6.6779f, 4.5009f, 6.6176f, 4.7822f)
        lineTo(6.314f, 6.1975f)
        horizontalLineTo(5.5165f)
        curveTo(5.2036f, 6.1975f, 4.95f, 6.4511f, 4.95f, 6.764f)
        curveTo(4.95f, 7.0769f, 5.2037f, 7.3305f, 5.5165f, 7.3305f)
        horizontalLineTo(6.072f)
        lineTo(5.72f, 8.986f)
        horizontalLineTo(4.9638f)
        curveTo(4.6524f, 8.986f, 4.4f, 9.2384f, 4.4f, 9.5497f)
        curveTo(4.4f, 9.8611f, 4.6524f, 10.1135f, 4.9638f, 10.1135f)
        horizontalLineTo(5.478f)
        lineTo(5.2304f, 11.2613f)
        curveTo(5.1484f, 11.6413f, 5.438f, 12.0f, 5.8267f, 12.0f)
        curveTo(6.1142f, 12.0f, 6.3627f, 11.7993f, 6.4232f, 11.5182f)
        lineTo(6.7265f, 10.108f)
        horizontalLineTo(8.261f)
        lineTo(8.0129f, 11.2615f)
        curveTo(7.9311f, 11.6415f, 8.2207f, 12.0f, 8.6094f, 12.0f)
        curveTo(8.897f, 12.0f, 9.1456f, 11.7991f, 9.2059f, 11.5178f)
        lineTo(9.5095f, 10.1025f)
        horizontalLineTo(10.3098f)
        curveTo(10.6211f, 10.1025f, 10.8735f, 9.8501f, 10.8735f, 9.5387f)
        curveTo(10.8735f, 9.2274f, 10.6211f, 8.975f, 10.3098f, 8.975f)
        horizontalLineTo(9.7515f)
        lineTo(10.1035f, 7.3195f)
        horizontalLineTo(10.857f)
        curveTo(11.1699f, 7.3195f, 11.4235f, 7.0659f, 11.4235f, 6.753f)
        close()
        moveTo(8.503f, 8.9805f)
        horizontalLineTo(6.9685f)
        lineTo(7.3205f, 7.325f)
        horizontalLineTo(8.855f)
        lineTo(8.503f, 8.9805f)
        close()
        moveTo(4.3134f, 4.607f)
        curveTo(4.5536f, 4.8353f, 4.5632f, 5.2151f, 4.3348f, 5.4552f)
        lineTo(1.7279f, 8.1972f)
        lineTo(4.3348f, 10.9392f)
        curveTo(4.5632f, 11.1794f, 4.5536f, 11.5592f, 4.3134f, 11.7875f)
        curveTo(4.0733f, 12.0158f, 3.6935f, 12.0062f, 3.4652f, 11.7661f)
        lineTo(0.4652f, 8.6106f)
        lineTo(0.0721f, 8.1972f)
        lineTo(0.4652f, 7.7838f)
        lineTo(3.4652f, 4.6284f)
        curveTo(3.6935f, 4.3882f, 4.0733f, 4.3786f, 4.3134f, 4.607f)
        close()
        moveTo(11.6866f, 11.7875f)
        curveTo(11.4465f, 11.5592f, 11.4369f, 11.1794f, 11.6652f, 10.9393f)
        lineTo(14.2722f, 8.1973f)
        lineTo(11.6652f, 5.4553f)
        curveTo(11.4369f, 5.2151f, 11.4465f, 4.8354f, 11.6866f, 4.607f)
        curveTo(11.9268f, 4.3787f, 12.3065f, 4.3883f, 12.5349f, 4.6284f)
        lineTo(15.5349f, 7.7839f)
        lineTo(15.928f, 8.1973f)
        lineTo(15.5349f, 8.6107f)
        lineTo(12.5349f, 11.7661f)
        curveTo(12.3065f, 12.0063f, 11.9268f, 12.0159f, 11.6866f, 11.7875f)
        close()
    }
}
.build()
