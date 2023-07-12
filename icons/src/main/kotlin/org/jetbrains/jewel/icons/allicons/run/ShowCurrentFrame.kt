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

public val RunGroup.ShowCurrentFrame: IntellijIconData
    get() {
        if (_showCurrentFrame != null) {
            return _showCurrentFrame!!
        }
        _showCurrentFrame = IntellijIconData(imageVector = { ShowCurrentFrameComposable(it) })
        return _showCurrentFrame!!
    }

private var _showCurrentFrame: IntellijIconData? = null

private fun ShowCurrentFrameComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ShowCurrentFrame", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 3.0f)
        lineTo(13.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 3.5f)
        lineTo(14.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(2.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 3.5f)
        lineTo(2.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 3.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 6.5f)
        lineTo(13.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 7.0f)
        lineTo(13.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 9.5f)
        lineTo(3.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 9.0f)
        lineTo(2.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 6.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 12.0f)
        lineTo(13.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 12.5f)
        lineTo(14.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 13.0f)
        lineTo(2.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 12.5f)
        lineTo(2.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 12.0f)
        close()
    }
}
.build()
