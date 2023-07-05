package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Lombok: IntellijIconData
    get() {
        if (_lombok != null) {
            return _lombok!!
        }
        _lombok = IntellijIconData(imageVector = { LombokComposable(it) })
        return _lombok!!
    }

private var _lombok: IntellijIconData? = null

private fun LombokComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Lombok", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF8FC942)), stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.7215f, 6.0291f)
        curveTo(1.4567f, 2.4062f, 3.2303f, 1.7204f, 3.2303f, 1.7204f)
        curveTo(3.2066f, 1.7062f, 3.481f, 2.0657f, 3.481f, 2.0657f)
        curveTo(3.4999f, 2.0609f, 2.1756f, 2.7183f, 2.7148f, 5.9439f)
        curveTo(2.5492f, 5.8919f, 1.835f, 5.8446f, 1.7215f, 6.0291f)
        close()
    }
    path(fill = SolidColor(Color(0xFFB62233)), stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(0.6527f, 9.6566f)
        curveTo(-0.3642f, 4.8183f, 4.006f, 4.3879f, 4.6728f, 8.5026f)
        curveTo(5.212f, 11.8323f, 6.8011f, 13.5869f, 12.0841f, 11.7566f)
        curveTo(13.1293f, 11.3829f, 19.3156f, 9.9026f, 11.9186f, 13.2984f)
        curveTo(4.6586f, 16.8551f, 0.6527f, 9.808f, 0.6527f, 9.6566f)
        close()
    }
    path(fill = SolidColor(Color(0xFF8FC942)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.8162f, 5.348f)
        lineTo(1.8256f, 5.9628f)
        curveTo(1.8635f, 5.9297f, 2.3317f, 5.8067f, 2.5445f, 5.8351f)
        curveTo(2.5398f, 5.8351f, 2.4641f, 5.2628f, 2.4641f, 5.2628f)
        lineTo(1.8162f, 5.348f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE79EA5)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.7625f, 13.1943f)
        curveTo(3.6416f, 12.8727f, 0.9505f, 10.5552f, 0.9363f, 8.6729f)
        curveTo(1.064f, 5.0169f, 2.9274f, 6.0763f, 1.7167f, 8.3985f)
        curveTo(0.8937f, 9.6519f, 3.249f, 12.2721f, 4.7625f, 13.1943f)
        close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.0032f, 7.7696f)
        curveTo(2.9417f, 7.1453f, 2.4877f, 7.1074f, 2.5208f, 7.8169f)
        curveTo(2.535f, 8.5972f, 3.0883f, 8.6209f, 3.0079f, 7.8169f)
        curveTo(3.0079f, 7.8169f, 2.9985f, 7.7743f, 3.0032f, 7.7696f)
        close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.8357f, 7.7979f)
        curveTo(3.779f, 7.1263f, 3.3155f, 6.9844f, 3.3817f, 7.8358f)
        curveTo(3.4195f, 8.5594f, 3.8878f, 8.5641f, 3.8357f, 7.8027f)
        lineTo(3.8357f, 7.7979f)
        close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.9817f, 8.8857f)
        curveTo(2.379f, 10.5458f, 4.2472f, 10.3424f, 5.0276f, 10.2809f)
        curveTo(5.0229f, 10.3093f, 4.7154f, 8.933f, 4.7344f, 8.8242f)
        curveTo(4.7438f, 8.9614f, 3.4195f, 9.0134f, 3.1925f, 9.0465f)
        curveTo(2.904f, 9.1033f, 1.8777f, 8.654f, 1.9817f, 8.8857f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.9674f, 8.8952f)
        curveTo(2.0336f, 9.1269f, 1.8964f, 9.004f, 2.7998f, 9.2499f)
        curveTo(3.2018f, 9.3539f, 3.4666f, 9.231f, 4.3321f, 9.1837f)
        curveTo(4.3274f, 9.2121f, 4.2849f, 9.0844f, 4.2659f, 8.9472f)
        curveTo(4.1808f, 8.9945f, 3.4146f, 9.0276f, 3.1592f, 9.0418f)
        curveTo(2.866f, 9.1033f, 1.9011f, 8.6587f, 1.9674f, 8.8952f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.8782f, 9.3587f)
        lineTo(4.493f, 9.3492f)
        lineTo(4.4126f, 9.1316f)
        lineTo(5.0417f, 9.0512f)
        lineTo(5.3349f, 10.1012f)
        lineTo(4.5924f, 10.1674f)
        curveTo(4.5545f, 10.1816f, 3.76f, 9.3965f, 3.8782f, 9.3587f)
        close()
    }
}
.build()
