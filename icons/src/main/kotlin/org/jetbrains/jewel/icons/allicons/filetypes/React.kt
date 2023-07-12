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

public val FiletypesGroup.React: IntellijIconData
    get() {
        if (_react != null) {
            return _react!!
        }
        _react = IntellijIconData(imageVector = { ReactComposable(it) })
        return _react!!
    }

private var _react: IntellijIconData? = null

private fun ReactComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "React",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF3FA1C4)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 9.2479f)
        curveTo(8.6892f, 9.2479f, 9.2479f, 8.6892f, 9.2479f, 8.0f)
        curveTo(9.2479f, 7.3109f, 8.6892f, 6.7522f, 8.0f, 6.7522f)
        curveTo(7.3109f, 6.7522f, 6.7522f, 7.3109f, 6.7522f, 8.0f)
        curveTo(6.7522f, 8.6892f, 7.3109f, 9.2479f, 8.0f, 9.2479f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3FA1C4)),
            strokeLineWidth = 0.608696f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0001f, 10.5565f)
        curveTo(11.698f, 10.5565f, 14.6957f, 9.4119f, 14.6957f, 8.0f)
        curveTo(14.6957f, 6.5881f, 11.698f, 5.4435f, 8.0001f, 5.4435f)
        curveTo(4.3022f, 5.4435f, 1.3044f, 6.5881f, 1.3044f, 8.0f)
        curveTo(1.3044f, 9.4119f, 4.3022f, 10.5565f, 8.0001f, 10.5565f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3FA1C4)),
            strokeLineWidth = 0.608696f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.786f, 9.2783f)
        curveTo(7.635f, 12.4808f, 10.1251f, 14.5046f, 11.3479f, 13.7986f)
        curveTo(12.5706f, 13.0927f, 12.063f, 9.9242f, 10.214f, 6.7218f)
        curveTo(8.3651f, 3.5193f, 5.875f, 1.4955f, 4.6522f, 2.2014f)
        curveTo(3.4294f, 2.9074f, 3.9371f, 6.0758f, 5.786f, 9.2783f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3FA1C4)),
            strokeLineWidth = 0.608696f, strokeLineCap = Butt, strokeLineJoin = Miter,
            strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.7859f, 6.7218f)
        curveTo(3.937f, 9.9242f, 3.4293f, 13.0927f, 4.6521f, 13.7986f)
        curveTo(5.8749f, 14.5046f, 8.365f, 12.4808f, 10.2139f, 9.2783f)
        curveTo(12.0629f, 6.0758f, 12.5705f, 2.9074f, 11.3478f, 2.2014f)
        curveTo(10.125f, 1.4955f, 7.6349f, 3.5193f, 5.7859f, 6.7218f)
        close()
    }
}
.build()
