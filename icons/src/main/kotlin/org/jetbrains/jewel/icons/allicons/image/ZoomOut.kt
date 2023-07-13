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

public val ImageGroup.ZoomOut: IntellijIconData
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = IntellijIconData(name = "ZoomOut",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ZoomOutComposable(it) })
        return _zoomOut!!
    }

private var _zoomOut: IntellijIconData? = null

private fun ZoomOutComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ZoomOut", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
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
