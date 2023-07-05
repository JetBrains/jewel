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

public val RunGroup.StopColored: IntellijIconData
    get() {
        if (_stopColored != null) {
            return _stopColored!!
        }
        _stopColored = IntellijIconData(imageVector = { StopColoredComposable(it) })
        return _stopColored!!
    }

private var _stopColored: IntellijIconData? = null

private fun StopColoredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "StopColored", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF5F5)), stroke = SolidColor(Color(0xFFE35252)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 2.5f)
        lineTo(13.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 3.0f)
        lineTo(13.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 13.5f)
        lineTo(3.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 13.0f)
        lineTo(2.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 2.5f)
        close()
    }
}
.build()
