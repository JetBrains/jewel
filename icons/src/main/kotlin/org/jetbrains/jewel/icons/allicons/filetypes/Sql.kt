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

public val FiletypesGroup.Sql: IntellijIconData
    get() {
        if (_sql != null) {
            return _sql!!
        }
        _sql = IntellijIconData(name = "Sql",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { SqlComposable(it) })
        return _sql!!
    }

private var _sql: IntellijIconData? = null

private fun SqlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Sql",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFFAF5FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 1.5f)
        curveTo(4.9624f, 1.5f, 2.5f, 2.4414f, 2.5f, 3.6028f)
        verticalLineTo(12.4343f)
        curveTo(2.5f, 13.5956f, 4.9624f, 14.537f, 8.0f, 14.537f)
        curveTo(11.0376f, 14.537f, 13.5f, 13.5956f, 13.5f, 12.4343f)
        verticalLineTo(3.6028f)
        curveTo(13.5f, 2.4414f, 11.0376f, 1.5f, 8.0f, 1.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 3.6028f)
        arcToRelative(5.5f, 2.1028f, 0.0f, true, false, 11.0f, 0.0f)
        arcToRelative(5.5f, 2.1028f, 0.0f, true, false, -11.0f, 0.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 12.4343f)
        curveTo(13.5f, 13.5956f, 11.0376f, 14.537f, 8.0f, 14.537f)
        curveTo(4.9624f, 14.537f, 2.5f, 13.5956f, 2.5f, 12.4343f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 9.4904f)
        curveTo(13.5f, 10.6518f, 11.0376f, 11.5932f, 8.0f, 11.5932f)
        curveTo(4.9624f, 11.5932f, 2.5f, 10.6518f, 2.5f, 9.4904f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 6.5466f)
        curveTo(13.5f, 7.7079f, 11.0376f, 8.6494f, 8.0f, 8.6494f)
        curveTo(4.9624f, 8.6494f, 2.5f, 7.7079f, 2.5f, 6.5466f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 3.3925f)
        verticalLineTo(12.5184f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 3.3925f)
        verticalLineTo(12.5184f)
    }
}
.build()
