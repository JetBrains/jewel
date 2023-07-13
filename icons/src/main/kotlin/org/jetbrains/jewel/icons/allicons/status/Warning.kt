package org.jetbrains.jewel.icons.allicons.status

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
import org.jetbrains.jewel.icons.allicons.StatusGroup

public val StatusGroup.Warning: IntellijIconData
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = IntellijIconData(name = "Warning",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { WarningComposable(it) })
        return _warning!!
    }

private var _warning: IntellijIconData? = null

private fun WarningComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Warning", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.134f, 1.5f)
        curveTo(7.5189f, 0.8333f, 8.4811f, 0.8333f, 8.866f, 1.5f)
        lineTo(14.9282f, 12.0f)
        curveTo(15.3131f, 12.6667f, 14.832f, 13.5f, 14.0622f, 13.5f)
        horizontalLineTo(1.9378f)
        curveTo(1.168f, 13.5f, 0.6869f, 12.6667f, 1.0718f, 12.0f)
        lineTo(7.134f, 1.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.8f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 4.5f)
        lineTo(8.0f, 8.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0004f, 11.1f)
        moveToRelative(-1.1f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, 2.2f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, -2.2f, 0.0f)
    }
}
.build()
