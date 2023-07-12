package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Structure: IntellijIconData
    get() {
        if (_structure != null) {
            return _structure!!
        }
        _structure = IntellijIconData(imageVector = { StructureComposable(it) })
        return _structure!!
    }

private var _structure: IntellijIconData? = null

private fun StructureComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Structure", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 2.5f)
        lineTo(6.0f, 2.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.5f)
        lineTo(7.0f, 6.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
        lineTo(3.5f, 7.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 2.5f, 6.0f)
        lineTo(2.5f, 3.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 3.5f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 9.0f)
        lineTo(6.0f, 9.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 10.0f)
        lineTo(7.0f, 12.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 13.5f)
        lineTo(3.5f, 13.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 2.5f, 12.5f)
        lineTo(2.5f, 10.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 3.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 9.0f)
        lineTo(12.5f, 9.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 13.5f, 10.0f)
        lineTo(13.5f, 12.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 13.5f)
        lineTo(10.0f, 13.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 12.5f)
        lineTo(9.0f, 10.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 9.0f)
        close()
    }
}
.build()
