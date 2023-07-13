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

public val FiletypesGroup.Xhtml: IntellijIconData
    get() {
        if (_xhtml != null) {
            return _xhtml!!
        }
        _xhtml = IntellijIconData(name = "Xhtml",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { XhtmlComposable(it) })
        return _xhtml!!
    }

private var _xhtml: IntellijIconData? = null

private fun XhtmlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Xhtml",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.3681f, 4.9736f)
        curveTo(6.6297f, 4.7702f, 6.6768f, 4.3932f, 6.4734f, 4.1316f)
        curveTo(6.2699f, 3.8701f, 5.893f, 3.8229f, 5.6314f, 4.0264f)
        lineTo(0.5225f, 8.0f)
        lineTo(5.6314f, 11.9736f)
        curveTo(5.893f, 12.177f, 6.2699f, 12.1299f, 6.4734f, 11.8684f)
        curveTo(6.6768f, 11.6068f, 6.6297f, 11.2298f, 6.3681f, 11.0264f)
        lineTo(2.4771f, 8.0f)
        lineTo(6.3681f, 4.9736f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.6314f, 4.9736f)
        curveTo(9.3698f, 4.7702f, 9.3227f, 4.3932f, 9.5261f, 4.1316f)
        curveTo(9.7296f, 3.8701f, 10.1066f, 3.8229f, 10.3681f, 4.0264f)
        lineTo(15.4771f, 8.0f)
        lineTo(10.3681f, 11.9736f)
        curveTo(10.1066f, 12.177f, 9.7296f, 12.1299f, 9.5261f, 11.8684f)
        curveTo(9.3227f, 11.6068f, 9.3698f, 11.2298f, 9.6314f, 11.0264f)
        lineTo(13.5225f, 8.0f)
        lineTo(9.6314f, 4.9736f)
        close()
    }
}
.build()
