package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.Run: IntellijIconData
    get() {
        if (_run != null) {
            return _run!!
        }
        _run = IntellijIconData(name = "Run",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { RunComposable(it) })
        return _run!!
    }

private var _run: IntellijIconData? = null

private fun RunComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Run",
        defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f, viewportHeight =
        14.0f).apply {
    path(fill = SolidColor(colorScheme.greenFill), stroke = SolidColor(colorScheme.greenStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.0f, 6.134f)
        curveTo(12.6667f, 6.5189f, 12.6667f, 7.4811f, 12.0f, 7.866f)
        lineTo(3.0f, 13.0622f)
        curveTo(2.3333f, 13.4471f, 1.5f, 12.966f, 1.5f, 12.1962f)
        lineTo(1.5f, 1.8039f)
        curveTo(1.5f, 1.0341f, 2.3333f, 0.5529f, 3.0f, 0.9378f)
        lineTo(12.0f, 6.134f)
        close()
    }
}
.build()
