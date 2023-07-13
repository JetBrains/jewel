package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.ChevronRight: IntellijIconData
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = IntellijIconData(name = "ChevronRight",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { ChevronRightComposable(it) })
        return _chevronRight!!
    }

private var _chevronRight: IntellijIconData? = null

private fun ChevronRightComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ChevronRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 11.5f)
        lineTo(9.5f, 8.0f)
        lineTo(6.0f, 4.5f)
    }
}
.build()
