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

public val FiletypesGroup.AngularJS: IntellijIconData
    get() {
        if (_angularJS != null) {
            return _angularJS!!
        }
        _angularJS = IntellijIconData(name = "AngularJS",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { AngularJSComposable(it) })
        return _angularJS!!
    }

private var _angularJS: IntellijIconData? = null

private fun AngularJSComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "AngularJS", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFDD0031)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 1.0f)
        lineTo(1.483f, 3.324f)
        lineTo(2.477f, 11.941f)
        lineTo(8.0f, 15.0f)
        lineTo(13.523f, 11.941f)
        lineTo(14.517f, 3.324f)
        lineTo(8.0f, 1.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFC3002F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 1.0f)
        verticalLineTo(2.554f)
        verticalLineTo(2.547f)
        verticalLineTo(9.638f)
        verticalLineTo(15.0f)
        lineTo(13.523f, 11.941f)
        lineTo(14.517f, 3.324f)
        lineTo(8.0f, 1.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.547f)
        lineTo(3.926f, 11.682f)
        horizontalLineTo(5.445f)
        lineTo(6.264f, 9.638f)
        horizontalLineTo(9.722f)
        lineTo(10.541f, 11.682f)
        horizontalLineTo(12.06f)
        lineTo(8.0f, 2.547f)
        close()
        moveTo(9.19f, 8.378f)
        horizontalLineTo(6.81f)
        lineTo(8.0f, 5.515f)
        lineTo(9.19f, 8.378f)
        close()
    }
}
.build()
