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

public val FiletypesGroup.Css: IntellijIconData
    get() {
        if (_css != null) {
            return _css!!
        }
        _css = IntellijIconData(imageVector = { CssComposable(it) })
        return _css!!
    }

private var _css: IntellijIconData? = null

private fun CssComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Css",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF264DE4)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.9924f, 15.0f)
        lineTo(2.9407f, 13.6005f)
        lineTo(1.8149f, 1.0f)
        horizontalLineTo(14.1849f)
        lineTo(13.058f, 13.5985f)
        lineTo(7.9924f, 15.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF2965F1)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.0933f, 12.7963f)
        lineTo(13.0563f, 2.0303f)
        horizontalLineTo(8.0f)
        verticalLineTo(13.9288f)
        lineTo(12.0933f, 12.7963f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEBEBEB)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.3958f, 6.7036f)
        lineTo(4.5346f, 8.249f)
        horizontalLineTo(8.0f)
        verticalLineTo(6.7036f)
        horizontalLineTo(4.3958f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEBEBEB)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.1167f, 3.5757f)
        lineTo(4.2575f, 5.1211f)
        horizontalLineTo(7.9998f)
        verticalLineTo(3.5757f)
        horizontalLineTo(7.9945f)
        horizontalLineTo(4.1167f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEBEBEB)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 10.7172f)
        lineTo(7.9932f, 10.719f)
        lineTo(6.2686f, 10.2543f)
        lineTo(6.1583f, 9.0217f)
        horizontalLineTo(5.3203f)
        horizontalLineTo(4.6038f)
        lineTo(4.8207f, 11.4482f)
        lineTo(7.9929f, 12.327f)
        lineTo(8.0f, 12.3251f)
        verticalLineTo(10.7172f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.5943f, 6.7036f)
        lineTo(11.8739f, 3.5757f)
        horizontalLineTo(7.9946f)
        verticalLineTo(5.1211f)
        horizontalLineTo(10.1768f)
        lineTo(10.0358f, 6.7036f)
        horizontalLineTo(7.9946f)
        verticalLineTo(8.249f)
        horizontalLineTo(9.9016f)
        lineTo(9.7218f, 10.2533f)
        lineTo(7.9946f, 10.7185f)
        verticalLineTo(12.3263f)
        lineTo(11.1693f, 11.4482f)
        lineTo(11.1926f, 11.1871f)
        lineTo(11.5565f, 7.1186f)
        lineTo(11.5943f, 6.7036f)
        close()
    }
}
.build()
