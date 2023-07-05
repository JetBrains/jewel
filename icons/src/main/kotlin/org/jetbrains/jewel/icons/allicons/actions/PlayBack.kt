package org.jetbrains.jewel.icons.allicons.actions

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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.PlayBack: IntellijIconData
    get() {
        if (_playBack != null) {
            return _playBack!!
        }
        _playBack = IntellijIconData(imageVector = { PlayBackComposable(it) })
        return _playBack!!
    }

private var _playBack: IntellijIconData? = null

private fun PlayBackComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "PlayBack", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 12.5f)
        lineTo(5.5f, 8.0f)
        lineTo(10.0f, 3.5f)
    }
}
.build()
