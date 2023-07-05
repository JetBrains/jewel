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
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Dependencies: IntellijIconData
    get() {
        if (_dependencies != null) {
            return _dependencies!!
        }
        _dependencies = IntellijIconData(imageVector = { DependenciesComposable(it) })
        return _dependencies!!
    }

private var _dependencies: IntellijIconData? = null

private fun DependenciesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Dependencies", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.2195f, 1.8978f)
        lineTo(13.831f, 4.6399f)
        curveTo(14.205f, 4.8226f, 14.205f, 5.3556f, 13.831f, 5.5383f)
        lineTo(8.2195f, 8.2804f)
        curveTo(8.081f, 8.3481f, 7.919f, 8.3481f, 7.7805f, 8.2804f)
        lineTo(2.169f, 5.5383f)
        curveTo(1.795f, 5.3556f, 1.795f, 4.8226f, 2.169f, 4.6399f)
        lineTo(7.7805f, 1.8978f)
        curveTo(7.919f, 1.8301f, 8.081f, 1.8301f, 8.2195f, 1.8978f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.2755f, 8.3163f)
        lineTo(8.4369f, 11.1524f)
        curveTo(8.161f, 11.2864f, 7.839f, 11.2864f, 7.5631f, 11.1524f)
        lineTo(1.7245f, 8.3163f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.2755f, 11.5436f)
        lineTo(8.4369f, 14.3797f)
        curveTo(8.161f, 14.5137f, 7.839f, 14.5137f, 7.5631f, 14.3797f)
        lineTo(1.7245f, 11.5436f)
    }
}
.build()
