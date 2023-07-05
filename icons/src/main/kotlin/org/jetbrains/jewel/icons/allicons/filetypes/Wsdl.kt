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

public val FiletypesGroup.Wsdl: IntellijIconData
    get() {
        if (_wsdl != null) {
            return _wsdl!!
        }
        _wsdl = IntellijIconData(imageVector = { WsdlComposable(it) })
        return _wsdl!!
    }

private var _wsdl: IntellijIconData? = null

private fun WsdlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Wsdl",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.1921f, 13.0f)
        verticalLineTo(2.5f)
        horizontalLineTo(5.5396f)
        curveTo(6.1496f, 2.5f, 6.6571f, 2.6625f, 7.0621f, 2.9875f)
        curveTo(7.4721f, 3.3075f, 7.7771f, 3.8f, 7.9771f, 4.465f)
        curveTo(8.1821f, 5.125f, 8.2846f, 5.965f, 8.2846f, 6.985f)
        verticalLineTo(8.515f)
        curveTo(8.2846f, 9.535f, 8.1821f, 10.3775f, 7.9771f, 11.0425f)
        curveTo(7.7771f, 11.7025f, 7.4746f, 12.195f, 7.0696f, 12.52f)
        curveTo(6.6646f, 12.84f, 6.1571f, 13.0f, 5.5471f, 13.0f)
        horizontalLineTo(3.1921f)
        close()
        moveTo(5.5396f, 11.7025f)
        curveTo(5.8246f, 11.7025f, 6.0621f, 11.59f, 6.2521f, 11.365f)
        curveTo(6.4471f, 11.135f, 6.5921f, 10.7875f, 6.6871f, 10.3225f)
        curveTo(6.7821f, 9.8525f, 6.8296f, 9.25f, 6.8296f, 8.515f)
        verticalLineTo(6.985f)
        curveTo(6.8296f, 6.25f, 6.7821f, 5.65f, 6.6871f, 5.185f)
        curveTo(6.5921f, 4.715f, 6.4471f, 4.3675f, 6.2521f, 4.1425f)
        curveTo(6.0621f, 3.9125f, 5.8246f, 3.7975f, 5.5396f, 3.7975f)
        horizontalLineTo(4.6021f)
        verticalLineTo(11.7025f)
        horizontalLineTo(5.5396f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.5056f, 2.5f)
        horizontalLineTo(10.9006f)
        verticalLineTo(11.695f)
        horizontalLineTo(13.6306f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.5056f)
        verticalLineTo(2.5f)
        close()
    }
}
.build()
