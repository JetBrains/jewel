package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Run_20x20: IntellijIconData
    get() {
        if (_run_20x20 != null) {
            return _run_20x20!!
        }
        _run_20x20 = IntellijIconData(name = "Run_20x20",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { Run_20x20Composable(it) })
        return _run_20x20!!
    }

private var _run_20x20: IntellijIconData? = null

private fun Run_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Run_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(16.125f, 11.0825f)
        lineTo(5.625f, 17.1447f)
        curveTo(4.7917f, 17.6258f, 3.75f, 17.0244f, 3.75f, 16.0622f)
        lineTo(3.75f, 3.9378f)
        curveTo(3.75f, 2.9756f, 4.7917f, 2.3742f, 5.625f, 2.8553f)
        lineTo(16.125f, 8.9175f)
        curveTo(16.9583f, 9.3986f, 16.9583f, 10.6014f, 16.125f, 11.0825f)
        close()
    }
}
.build()
