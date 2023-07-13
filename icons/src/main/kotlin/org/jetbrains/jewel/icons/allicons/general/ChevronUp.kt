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

public val GeneralGroup.ChevronUp: IntellijIconData
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = IntellijIconData(name = "ChevronUp",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ChevronUpComposable(it) })
        return _chevronUp!!
    }

private var _chevronUp: IntellijIconData? = null

private fun ChevronUpComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ChevronUp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 9.75f)
        lineTo(8.0f, 6.25f)
        lineTo(11.5f, 9.75f)
    }
}
.build()
