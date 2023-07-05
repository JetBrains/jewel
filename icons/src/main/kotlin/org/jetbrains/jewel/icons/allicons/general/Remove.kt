package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Remove: IntellijIconData
    get() {
        if (_remove != null) {
            return _remove!!
        }
        _remove = IntellijIconData(imageVector = { RemoveComposable(it) })
        return _remove!!
    }

private var _remove: IntellijIconData? = null

private fun RemoveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Remove", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 7.5f)
        curveTo(1.0f, 7.7761f, 1.2239f, 8.0f, 1.5f, 8.0f)
        lineTo(13.5f, 8.0f)
        curveTo(13.7761f, 8.0f, 14.0f, 7.7761f, 14.0f, 7.5f)
        curveTo(14.0f, 7.2239f, 13.7761f, 7.0f, 13.5f, 7.0f)
        lineTo(1.5f, 7.0f)
        curveTo(1.2239f, 7.0f, 1.0f, 7.2239f, 1.0f, 7.5f)
        close()
    }
}
.build()
