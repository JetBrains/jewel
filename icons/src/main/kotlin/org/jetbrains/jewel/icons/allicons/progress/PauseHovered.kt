package org.jetbrains.jewel.icons.allicons.progress

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ProgressGroup

public val ProgressGroup.PauseHovered: IntellijIconData
    get() {
        if (_pauseHovered != null) {
            return _pauseHovered!!
        }
        _pauseHovered = IntellijIconData(name = "PauseHovered",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { PauseHoveredComposable(it) })
        return _pauseHovered!!
    }

private var _pauseHovered: IntellijIconData? = null

private fun PauseHoveredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "PauseHovered", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF313547)), stroke = null, fillAlpha = 0.2f, strokeAlpha = 0.2f,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-8.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 3.5f)
        lineTo(6.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 4.0f)
        lineTo(6.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 12.5f)
        lineTo(6.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 12.0f)
        lineTo(5.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 3.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 3.5f)
        lineTo(10.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 4.0f)
        lineTo(10.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 12.5f)
        lineTo(10.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 12.0f)
        lineTo(9.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 3.5f)
        close()
    }
}
.build()
