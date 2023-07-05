package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Desktop: IntellijIconData
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = IntellijIconData(imageVector = { DesktopComposable(it) })
        return _desktop!!
    }

private var _desktop: IntellijIconData? = null

private fun DesktopComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Desktop", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 13.5f)
        curveTo(2.0f, 13.2239f, 2.2239f, 13.0f, 2.5f, 13.0f)
        lineTo(13.5f, 13.0f)
        curveTo(13.7761f, 13.0f, 14.0f, 13.2239f, 14.0f, 13.5f)
        curveTo(14.0f, 13.7761f, 13.7761f, 14.0f, 13.5f, 14.0f)
        lineTo(2.5f, 14.0f)
        curveTo(2.2239f, 14.0f, 2.0f, 13.7761f, 2.0f, 13.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 4.0f)
        lineTo(13.5f, 10.0f)
        curveTo(13.5f, 10.8284f, 12.8284f, 11.5f, 12.0f, 11.5f)
        lineTo(4.0f, 11.5f)
        curveTo(3.1716f, 11.5f, 2.5f, 10.8284f, 2.5f, 10.0f)
        lineTo(2.5f, 4.0f)
        curveTo(2.5f, 3.1716f, 3.1716f, 2.5f, 4.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        curveTo(12.8284f, 2.5f, 13.5f, 3.1716f, 13.5f, 4.0f)
        close()
    }
}
.build()
