package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Csv: IntellijIconData
    get() {
        if (_csv != null) {
            return _csv!!
        }
        _csv = IntellijIconData(name = "Csv",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CsvComposable(it) })
        return _csv!!
    }

private var _csv: IntellijIconData? = null

private fun CsvComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Csv",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.0f)
        lineTo(12.0f, 2.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
        lineTo(14.0f, 12.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
        lineTo(4.0f, 14.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 12.0f)
        lineTo(2.0f, 4.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 5.5f)
        horizontalLineTo(11.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 8.0f)
        lineTo(11.0f, 8.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 10.5f)
        lineTo(9.0f, 10.5f)
    }
}
.build()
