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

public val FiletypesGroup.Xml: IntellijIconData
    get() {
        if (_xml != null) {
            return _xml!!
        }
        _xml = IntellijIconData(imageVector = { XmlComposable(it) })
        return _xml!!
    }

private var _xml: IntellijIconData? = null

private fun XmlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Xml",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.0775f, 2.4404f)
        curveTo(10.1656f, 2.1209f, 9.9781f, 1.7905f, 9.6587f, 1.7024f)
        curveTo(9.3392f, 1.6143f, 9.0088f, 1.8018f, 8.9207f, 2.1213f)
        lineTo(5.7653f, 13.5596f)
        curveTo(5.6772f, 13.8791f, 5.8647f, 14.2095f, 6.1841f, 14.2976f)
        curveTo(6.5036f, 14.3857f, 6.834f, 14.1982f, 6.9221f, 13.8788f)
        lineTo(10.0775f, 2.4404f)
        close()
        moveTo(5.4128f, 4.667f)
        curveTo(5.6198f, 4.9257f, 5.5779f, 5.3033f, 5.3191f, 5.5103f)
        lineTo(1.9605f, 8.1972f)
        lineTo(5.3191f, 10.8841f)
        curveTo(5.5779f, 11.0911f, 5.6198f, 11.4687f, 5.4128f, 11.7275f)
        curveTo(5.2058f, 11.9862f, 4.8282f, 12.0282f, 4.5695f, 11.8212f)
        lineTo(0.6252f, 8.6657f)
        lineTo(0.0396f, 8.1972f)
        lineTo(0.6252f, 7.7287f)
        lineTo(4.5695f, 4.5733f)
        curveTo(4.8282f, 4.3663f, 5.2058f, 4.4082f, 5.4128f, 4.667f)
        close()
        moveTo(10.5872f, 11.7275f)
        curveTo(10.3802f, 11.4687f, 10.4222f, 11.0911f, 10.6809f, 10.8841f)
        lineTo(14.0395f, 8.1973f)
        lineTo(10.6809f, 5.5104f)
        curveTo(10.4222f, 5.3033f, 10.3802f, 4.9258f, 10.5872f, 4.667f)
        curveTo(10.7942f, 4.4082f, 11.1718f, 4.3663f, 11.4305f, 4.5733f)
        lineTo(15.3748f, 7.7287f)
        lineTo(15.9605f, 8.1973f)
        lineTo(15.3748f, 8.6658f)
        lineTo(11.4305f, 11.8212f)
        curveTo(11.1718f, 12.0282f, 10.7942f, 11.9862f, 10.5872f, 11.7275f)
        close()
    }
}
.build()
