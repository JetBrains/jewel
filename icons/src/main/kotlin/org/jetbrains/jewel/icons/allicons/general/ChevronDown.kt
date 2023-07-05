package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.ChevronDown: IntellijIconData
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = IntellijIconData(imageVector = { ChevronDownComposable(it) })
        return _chevronDown!!
    }

private var _chevronDown: IntellijIconData? = null

private fun ChevronDownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ChevronDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 6.25f)
        lineTo(8.0f, 9.75f)
        lineTo(4.5f, 6.25f)
    }
}
.build()
