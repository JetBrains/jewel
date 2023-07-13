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

public val GeneralGroup.ChevronDownLarge: IntellijIconData
    get() {
        if (_chevronDownLarge != null) {
            return _chevronDownLarge!!
        }
        _chevronDownLarge = IntellijIconData(name = "ChevronDownLarge",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { ChevronDownLargeComposable(it) })
        return _chevronDownLarge!!
    }

private var _chevronDownLarge: IntellijIconData? = null

private fun ChevronDownLargeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ChevronDownLarge", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 5.75f)
        lineTo(8.0f, 10.25f)
        lineTo(3.5f, 5.75f)
    }
}
.build()
