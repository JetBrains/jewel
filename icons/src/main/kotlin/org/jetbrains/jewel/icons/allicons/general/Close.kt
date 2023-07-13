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

public val GeneralGroup.Close: IntellijIconData
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = IntellijIconData(name = "Close",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CloseComposable(it) })
        return _close!!
    }

private var _close: IntellijIconData? = null

private fun CloseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Close",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 13.0f)
        lineTo(13.0f, 3.0f)
        moveTo(13.0f, 13.0f)
        lineTo(3.0f, 3.0f)
    }
}
.build()
