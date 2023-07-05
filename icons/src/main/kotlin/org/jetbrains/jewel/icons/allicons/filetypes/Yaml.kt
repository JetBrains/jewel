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

public val FiletypesGroup.Yaml: IntellijIconData
    get() {
        if (_yaml != null) {
            return _yaml!!
        }
        _yaml = IntellijIconData(imageVector = { YamlComposable(it) })
        return _yaml!!
    }

private var _yaml: IntellijIconData? = null

private fun YamlComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Yaml",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF7F7)), stroke = SolidColor(Color(0xFFDB3B4B)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(13.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
        lineTo(2.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5934f, 11.5f)
        horizontalLineTo(7.4494f)
        verticalLineTo(8.845f)
        lineTo(5.0f, 4.5f)
        horizontalLineTo(6.2579f)
        lineTo(7.8386f, 7.38f)
        lineTo(8.0285f, 7.775f)
        lineTo(8.2184f, 7.37f)
        lineTo(9.7563f, 4.5f)
        horizontalLineTo(11.0f)
        lineTo(8.5934f, 8.835f)
        verticalLineTo(11.5f)
        close()
    }
}
.build()
