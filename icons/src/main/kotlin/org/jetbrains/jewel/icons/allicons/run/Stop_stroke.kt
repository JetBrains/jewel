package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Stop_stroke: IntellijIconData
    get() {
        if (_stop_stroke != null) {
            return _stop_stroke!!
        }
        _stop_stroke = IntellijIconData(name = "Stop_stroke",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { Stop_strokeComposable(it) })
        return _stop_stroke!!
    }

private var _stop_stroke: IntellijIconData? = null

private fun Stop_strokeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Stop_stroke", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 1.75f)
        lineTo(13.0f, 1.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 14.25f, 3.0f)
        lineTo(14.25f, 13.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 13.0f, 14.25f)
        lineTo(3.0f, 14.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 1.75f, 13.0f)
        lineTo(1.75f, 3.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 3.0f, 1.75f)
        close()
    }
}
.build()
