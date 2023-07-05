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

public val GeneralGroup.ChevronDownLargeWhite: IntellijIconData
    get() {
        if (_chevronDownLargeWhite != null) {
            return _chevronDownLargeWhite!!
        }
        _chevronDownLargeWhite = IntellijIconData(imageVector = {
                ChevronDownLargeWhiteComposable(it) })
        return _chevronDownLargeWhite!!
    }

private var _chevronDownLargeWhite: IntellijIconData? = null

private fun ChevronDownLargeWhiteComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ChevronDownLargeWhite", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 5.75f)
        lineTo(8.0f, 10.25f)
        lineTo(3.5f, 5.75f)
    }
}
.build()
