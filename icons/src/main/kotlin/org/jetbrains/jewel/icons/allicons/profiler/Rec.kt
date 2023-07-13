package org.jetbrains.jewel.icons.allicons.profiler

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ProfilerGroup

public val ProfilerGroup.Rec: IntellijIconData
    get() {
        if (_rec != null) {
            return _rec!!
        }
        _rec = IntellijIconData(name = "Rec",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { RecComposable(it) })
        return _rec!!
    }

private var _rec: IntellijIconData? = null

private fun RecComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Rec",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 11.0f)
        curveTo(9.6568f, 11.0f, 11.0f, 9.6568f, 11.0f, 8.0f)
        curveTo(11.0f, 6.3432f, 9.6568f, 5.0f, 8.0f, 5.0f)
        curveTo(6.3432f, 5.0f, 5.0f, 6.3432f, 5.0f, 8.0f)
        curveTo(5.0f, 9.6568f, 6.3432f, 11.0f, 8.0f, 11.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(15.0f, 8.0f)
        curveTo(15.0f, 11.866f, 11.866f, 15.0f, 8.0f, 15.0f)
        curveTo(4.134f, 15.0f, 1.0f, 11.866f, 1.0f, 8.0f)
        curveTo(1.0f, 4.134f, 4.134f, 1.0f, 8.0f, 1.0f)
        curveTo(11.866f, 1.0f, 15.0f, 4.134f, 15.0f, 8.0f)
        close()
        moveTo(14.0f, 8.0f)
        curveTo(14.0f, 11.3137f, 11.3137f, 14.0f, 8.0f, 14.0f)
        curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.3137f, 2.0f, 14.0f, 4.6863f, 14.0f, 8.0f)
        close()
    }
}
.build()
