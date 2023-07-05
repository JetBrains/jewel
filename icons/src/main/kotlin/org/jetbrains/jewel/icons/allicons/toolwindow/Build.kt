package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Build: IntellijIconData
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = IntellijIconData(imageVector = { BuildComposable(it) })
        return _build!!
    }

private var _build: IntellijIconData? = null

private fun BuildComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Build",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5996f, 1.5f)
        horizontalLineTo(1.5996f)
        verticalLineTo(4.7f)
        horizontalLineTo(3.5996f)
        lineTo(4.3996f, 4.3f)
        horizontalLineTo(5.5996f)
        lineTo(6.5996f, 5.1f)
        horizontalLineTo(8.7996f)
        lineTo(10.3996f, 3.9f)
        curveTo(11.5996f, 3.9f, 12.3996f, 3.9f, 14.3996f, 5.3f)
        curveTo(13.1996f, 1.5f, 10.7996f, 1.5f, 9.5996f, 1.5f)
        horizontalLineTo(6.5996f)
        lineTo(5.5996f, 1.9f)
        horizontalLineTo(4.3996f)
        lineTo(3.5996f, 1.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 14.5f)
        horizontalLineTo(9.4f)
        verticalLineTo(9.4263f)
        curveTo(9.4f, 8.7492f, 9.2625f, 8.0791f, 8.9957f, 7.4567f)
        lineTo(8.8f, 7.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(6.6f)
        verticalLineTo(7.0f)
        lineTo(6.4043f, 7.4567f)
        curveTo(6.1375f, 8.0791f, 6.0f, 8.7492f, 6.0f, 9.4263f)
        verticalLineTo(14.5f)
        close()
    }
}
.build()
