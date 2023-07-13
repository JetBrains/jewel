package org.jetbrains.jewel.icons.allicons.filetypes

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

public val FiletypesGroup.Idl: IntellijIconData
    get() {
        if (_idl != null) {
            return _idl!!
        }
        _idl = IntellijIconData(name = "Idl",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { IdlComposable(it) })
        return _idl!!
    }

private var _idl: IntellijIconData? = null

private fun IdlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Idl",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.purpleStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.1848f, 13.0f)
        verticalLineTo(3.9f)
        horizontalLineTo(4.2703f)
        verticalLineTo(13.0f)
        horizontalLineTo(3.1848f)
        close()
    }
    path(fill = SolidColor(colorScheme.purpleStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5842f, 13.0f)
        verticalLineTo(3.9f)
        horizontalLineTo(7.3782f)
        curveTo(7.8462f, 3.9f, 8.2276f, 4.0322f, 8.5222f, 4.2965f)
        curveTo(8.8169f, 4.5608f, 9.0336f, 4.9703f, 9.1722f, 5.525f)
        curveTo(9.3109f, 6.0753f, 9.3802f, 6.7925f, 9.3802f, 7.6765f)
        verticalLineTo(9.2235f)
        curveTo(9.3802f, 10.1075f, 9.3109f, 10.8268f, 9.1722f, 11.3815f)
        curveTo(9.0336f, 11.9318f, 8.8169f, 12.3392f, 8.5222f, 12.6035f)
        curveTo(8.2276f, 12.8678f, 7.8462f, 13.0f, 7.3782f, 13.0f)
        horizontalLineTo(5.5842f)
        close()
        moveTo(7.3782f, 11.986f)
        curveTo(7.5819f, 11.986f, 7.7466f, 11.8885f, 7.8722f, 11.6935f)
        curveTo(8.0022f, 11.4985f, 8.0976f, 11.1995f, 8.1582f, 10.7965f)
        curveTo(8.2189f, 10.3935f, 8.2492f, 9.8692f, 8.2492f, 9.2235f)
        verticalLineTo(7.6765f)
        curveTo(8.2492f, 7.0308f, 8.2189f, 6.5065f, 8.1582f, 6.1035f)
        curveTo(8.0976f, 5.7005f, 8.0022f, 5.4015f, 7.8722f, 5.2065f)
        curveTo(7.7466f, 5.0115f, 7.5819f, 4.914f, 7.3782f, 4.914f)
        horizontalLineTo(6.6697f)
        verticalLineTo(11.986f)
        horizontalLineTo(7.3782f)
        close()
    }
    path(fill = SolidColor(colorScheme.purpleStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.3831f, 3.9f)
        horizontalLineTo(11.4556f)
        verticalLineTo(11.9795f)
        horizontalLineTo(13.5291f)
        verticalLineTo(13.0f)
        horizontalLineTo(10.3831f)
        verticalLineTo(3.9f)
        close()
    }
}
.build()
