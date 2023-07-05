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

public val FiletypesGroup.Archive: IntellijIconData
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = IntellijIconData(imageVector = { ArchiveComposable(it) })
        return _archive!!
    }

private var _archive: IntellijIconData? = null

private fun ArchiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Archive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFE7EFFD)), stroke = SolidColor(Color(0xFF3574F0)),
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
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.5f, 4.0f)
        lineTo(7.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 4.5f)
        lineTo(8.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 6.0f)
        lineTo(6.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 5.5f)
        lineTo(6.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 4.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.5f, 8.0f)
        lineTo(7.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 8.5f)
        lineTo(8.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 10.0f)
        lineTo(6.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 9.5f)
        lineTo(6.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 10.0f)
        lineTo(9.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 10.5f)
        lineTo(10.0f, 11.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 12.0f)
        lineTo(8.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 11.5f)
        lineTo(8.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 10.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 6.0f)
        lineTo(9.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 6.5f)
        lineTo(10.0f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 8.0f)
        lineTo(8.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 7.5f)
        lineTo(8.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 6.0f)
        close()
    }
}
.build()
