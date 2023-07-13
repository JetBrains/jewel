package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.AspectJ: IntellijIconData
    get() {
        if (_aspectJ != null) {
            return _aspectJ!!
        }
        _aspectJ = IntellijIconData(name = "AspectJ",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { AspectJComposable(it) })
        return _aspectJ!!
    }

private var _aspectJ: IntellijIconData? = null

private fun AspectJComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "AspectJ", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.6028f, 13.0f)
        lineTo(5.5228f, 2.5f)
        horizontalLineTo(7.3378f)
        lineTo(9.2953f, 13.0f)
        horizontalLineTo(7.8628f)
        lineTo(6.5278f, 4.7725f)
        lineTo(6.4303f, 4.075f)
        lineTo(6.3328f, 4.7725f)
        lineTo(5.0728f, 13.0f)
        horizontalLineTo(3.6028f)
        close()
        moveTo(4.7128f, 10.2775f)
        verticalLineTo(9.1f)
        horizontalLineTo(8.0728f)
        verticalLineTo(10.2775f)
        horizontalLineTo(4.7128f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.8048f, 13.0f)
        verticalLineTo(11.695f)
        horizontalLineTo(9.5624f)
        curveTo(9.8323f, 11.695f, 10.0349f, 11.585f, 10.1699f, 11.365f)
        curveTo(10.3099f, 11.14f, 10.3799f, 10.805f, 10.3799f, 10.36f)
        verticalLineTo(2.5f)
        horizontalLineTo(11.7899f)
        verticalLineTo(10.45f)
        curveTo(11.7899f, 11.015f, 11.7099f, 11.4875f, 11.5499f, 11.8675f)
        curveTo(11.3899f, 12.2425f, 11.1524f, 12.525f, 10.8374f, 12.715f)
        curveTo(10.5274f, 12.905f, 10.1399f, 13.0f, 9.6749f, 13.0f)
        horizontalLineTo(8.8048f)
        close()
    }
}
.build()
