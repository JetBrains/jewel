package org.jetbrains.jewel.icons.allicons.filetypes

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

public val FiletypesGroup.Perl: IntellijIconData
    get() {
        if (_perl != null) {
            return _perl!!
        }
        _perl = IntellijIconData(imageVector = { PerlComposable(it) })
        return _perl!!
    }

private var _perl: IntellijIconData? = null

private fun PerlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Perl",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.7987f, 9.1769f)
        verticalLineTo(7.1753f)
        curveTo(14.7987f, 6.6945f, 14.508f, 6.2695f, 14.0943f, 6.0906f)
        lineTo(14.0383f, 5.8558f)
        verticalLineTo(5.8446f)
        curveTo(13.8147f, 5.1513f, 13.2332f, 4.637f, 12.5176f, 4.4804f)
        curveTo(12.3275f, 4.4357f, 12.1486f, 4.3462f, 12.0144f, 4.2009f)
        lineTo(10.5607f, 2.7472f)
        curveTo(9.9904f, 2.1769f, 9.0511f, 2.1769f, 8.4808f, 2.7472f)
        lineTo(7.0607f, 4.1673f)
        curveTo(6.9377f, 4.2903f, 6.7811f, 4.3798f, 6.6022f, 4.4245f)
        curveTo(5.9425f, 4.6034f, 5.3275f, 4.9165f, 4.7684f, 5.3191f)
        curveTo(4.6901f, 5.375f, 4.6006f, 5.3973f, 4.5224f, 5.3973f)
        curveTo(4.2987f, 5.3973f, 4.0974f, 5.2296f, 4.0974f, 4.9724f)
        verticalLineTo(3.5076f)
        curveTo(4.0974f, 3.1833f, 3.8962f, 2.9037f, 3.6278f, 2.7807f)
        curveTo(3.6837f, 2.5459f, 2.7668f, 1.5842f, 2.8339f, 2.5459f)
        curveTo(2.8339f, 2.613f, 2.8451f, 2.6913f, 2.8562f, 2.7584f)
        curveTo(2.8562f, 2.7584f, 1.0f, 3.1609f, 1.0f, 3.3957f)
        verticalLineTo(3.6082f)
        curveTo(1.0f, 3.8654f, 1.2125f, 4.0778f, 1.4697f, 4.0778f)
        horizontalLineTo(1.9505f)
        curveTo(2.3195f, 4.0778f, 2.6214f, 4.3798f, 2.6214f, 4.7488f)
        verticalLineTo(5.6657f)
        curveTo(2.6214f, 6.851f, 3.5942f, 7.8686f, 4.7907f, 7.8686f)
        curveTo(5.5958f, 7.8686f, 6.2444f, 8.5171f, 6.2444f, 9.3223f)
        lineTo(6.4904f, 13.0459f)
        curveTo(6.5016f, 13.2248f, 6.4457f, 13.4037f, 6.3227f, 13.5267f)
        curveTo(6.3003f, 13.5491f, 6.2891f, 13.5715f, 6.2891f, 13.5938f)
        curveTo(6.2556f, 13.7392f, 6.3674f, 13.8622f, 6.5016f, 13.8622f)
        horizontalLineTo(7.139f)
        curveTo(7.2508f, 13.8622f, 7.3514f, 13.7839f, 7.3738f, 13.6721f)
        curveTo(7.3738f, 13.6274f, 7.3738f, 13.5938f, 7.3514f, 13.5491f)
        curveTo(7.2508f, 13.3255f, 7.1837f, 13.0906f, 7.2061f, 12.8558f)
        lineTo(7.4297f, 9.5794f)
        curveTo(7.4297f, 9.0315f, 7.877f, 8.5731f, 8.4361f, 8.5731f)
        horizontalLineTo(9.845f)
        curveTo(10.5607f, 8.5731f, 11.2316f, 8.9309f, 11.6677f, 9.5012f)
        curveTo(11.869f, 9.7695f, 12.1374f, 9.982f, 12.4393f, 10.1162f)
        curveTo(12.7748f, 10.2616f, 12.8419f, 10.474f, 12.976f, 10.9548f)
        lineTo(13.2668f, 13.2807f)
        curveTo(13.278f, 13.3478f, 13.2332f, 13.4149f, 13.1773f, 13.4596f)
        curveTo(13.1102f, 13.5044f, 13.0543f, 13.5826f, 13.0655f, 13.6721f)
        curveTo(13.0767f, 13.7839f, 13.1773f, 13.8734f, 13.3003f, 13.8734f)
        horizontalLineTo(13.9265f)
        curveTo(14.0383f, 13.8734f, 14.1502f, 13.7951f, 14.1613f, 13.6721f)
        curveTo(14.1725f, 13.605f, 14.1502f, 13.5491f, 14.1054f, 13.5044f)
        curveTo(13.9936f, 13.3814f, 13.9489f, 13.2248f, 13.9601f, 13.0571f)
        curveTo(14.0352f, 10.8845f, 14.1837f, 8.7004f, 14.1837f, 6.5267f)
        curveTo(14.3738f, 6.6833f, 14.4856f, 6.9181f, 14.4856f, 7.1753f)
        verticalLineTo(9.1769f)
        curveTo(14.3962f, 9.2216f, 14.3291f, 9.3334f, 14.3291f, 9.5683f)
        curveTo(14.3291f, 9.9261f, 14.4744f, 10.2168f, 14.6645f, 10.2168f)
        curveTo(14.8435f, 10.2168f, 15.0f, 9.9261f, 15.0f, 9.5683f)
        curveTo(14.9553f, 9.3334f, 14.8882f, 9.2216f, 14.7987f, 9.1769f)
        close()
    }
}
.build()
