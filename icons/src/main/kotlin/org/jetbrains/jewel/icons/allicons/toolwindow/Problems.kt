package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Problems: IntellijIconData
    get() {
        if (_problems != null) {
            return _problems!!
        }
        _problems = IntellijIconData(name = "Problems",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ProblemsComposable(it) })
        return _problems!!
    }

private var _problems: IntellijIconData? = null

private fun ProblemsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Problems", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.2f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 4.6f)
        lineTo(8.0f, 8.4f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke =
            SolidColor(colorScheme.generalStroke), strokeLineWidth = 0.4f, strokeLineCap = Butt,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0008f, 10.7f)
        moveToRelative(-0.5f, 0.0f)
        arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
        arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
    }
}
.build()
