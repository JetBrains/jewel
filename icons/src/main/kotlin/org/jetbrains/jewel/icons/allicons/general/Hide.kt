package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Hide: IntellijIconData
    get() {
        if (_hide != null) {
            return _hide!!
        }
        _hide = IntellijIconData(name = "Hide",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { HideComposable(it) })
        return _hide!!
    }

private var _hide: IntellijIconData? = null

private fun HideComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Hide",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 8.5f)
        curveTo(1.7239f, 8.5f, 1.5f, 8.2761f, 1.5f, 8.0f)
        curveTo(1.5f, 7.7239f, 1.7239f, 7.5f, 2.0f, 7.5f)
        lineTo(2.0f, 8.5f)
        close()
        moveTo(14.0f, 7.5f)
        curveTo(14.2761f, 7.5f, 14.5f, 7.7239f, 14.5f, 8.0f)
        curveTo(14.5f, 8.2761f, 14.2761f, 8.5f, 14.0f, 8.5f)
        lineTo(14.0f, 7.5f)
        close()
        moveTo(2.0f, 7.5f)
        lineTo(14.0f, 7.5f)
        lineTo(14.0f, 8.5f)
        lineTo(2.0f, 8.5f)
        lineTo(2.0f, 7.5f)
        close()
    }
}
.build()
