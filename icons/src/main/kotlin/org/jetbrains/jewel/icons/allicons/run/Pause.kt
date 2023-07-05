package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Pause: IntellijIconData
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = IntellijIconData(imageVector = { PauseComposable(it) })
        return _pause!!
    }

private var _pause: IntellijIconData? = null

private fun PauseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Pause",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.5f)
        lineTo(6.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 3.0f)
        lineTo(6.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 13.0f)
        lineTo(3.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 3.0f)
        lineTo(12.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(10.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 13.0f)
        lineTo(9.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 2.5f)
        close()
    }
}
.build()
