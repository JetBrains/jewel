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

public val FiletypesGroup.VueJs: IntellijIconData
    get() {
        if (_vueJs != null) {
            return _vueJs!!
        }
        _vueJs = IntellijIconData(name = "VueJs",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { VueJsComposable(it) })
        return _vueJs!!
    }

private var _vueJs: IntellijIconData? = null

private fun VueJsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "VueJs",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF41B883)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.732f, 2.0f)
        lineTo(8.0f, 5.0f)
        lineTo(6.268f, 2.0f)
        horizontalLineTo(0.5f)
        lineTo(8.0f, 14.9905f)
        lineTo(15.5f, 2.0f)
        horizontalLineTo(9.732f)
        close()
    }
    path(fill = SolidColor(Color(0xFF34495E)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.732f, 2.0f)
        lineTo(8.0f, 5.0f)
        lineTo(6.268f, 2.0f)
        horizontalLineTo(3.5f)
        lineTo(8.0f, 9.7942f)
        lineTo(12.5f, 2.0f)
        horizontalLineTo(9.732f)
        close()
    }
}
.build()
