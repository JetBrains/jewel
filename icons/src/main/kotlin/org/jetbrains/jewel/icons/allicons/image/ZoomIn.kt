package org.jetbrains.jewel.icons.allicons.image

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
import org.jetbrains.jewel.icons.allicons.ImageGroup

public val ImageGroup.ZoomIn: IntellijIconData
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = IntellijIconData(name = "ZoomIn",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ZoomInComposable(it) })
        return _zoomIn!!
    }

private var _zoomIn: IntellijIconData? = null

private fun ZoomInComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ZoomIn", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 4.0f)
        lineTo(8.0f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 4.5f)
        lineTo(8.5f, 11.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 12.0f)
        lineTo(8.0f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 11.5f)
        lineTo(7.5f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 4.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 8.0f)
        lineTo(12.0f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 8.5f)
        lineTo(4.5f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 8.0f)
        lineTo(4.0f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 7.5f)
        lineTo(11.5f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
}
.build()
