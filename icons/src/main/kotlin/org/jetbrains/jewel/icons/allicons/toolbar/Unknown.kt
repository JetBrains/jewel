package org.jetbrains.jewel.icons.allicons.toolbar

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
import org.jetbrains.jewel.icons.allicons.ToolbarGroup

public val ToolbarGroup.Unknown: IntellijIconData
    get() {
        if (_unknown != null) {
            return _unknown!!
        }
        _unknown = IntellijIconData(imageVector = { UnknownComposable(it) })
        return _unknown!!
    }

private var _unknown: IntellijIconData? = null

private fun UnknownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Unknown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.9497f, 12.9497f)
        curveTo(10.2161f, 15.6834f, 5.7839f, 15.6834f, 3.0503f, 12.9497f)
        curveTo(0.3166f, 10.2161f, 0.3166f, 5.7839f, 3.0503f, 3.0503f)
        curveTo(5.7839f, 0.3166f, 10.2161f, 0.3166f, 12.9497f, 3.0503f)
        curveTo(15.6834f, 5.7839f, 15.6834f, 10.2161f, 12.9497f, 12.9497f)
        close()
        moveTo(12.2426f, 12.2426f)
        curveTo(9.8995f, 14.5858f, 6.1005f, 14.5858f, 3.7574f, 12.2426f)
        curveTo(1.4142f, 9.8995f, 1.4142f, 6.1005f, 3.7574f, 3.7574f)
        curveTo(6.1005f, 1.4142f, 9.8995f, 1.4142f, 12.2426f, 3.7574f)
        curveTo(14.5858f, 6.1005f, 14.5858f, 9.8995f, 12.2426f, 12.2426f)
        close()
        moveTo(7.0f, 6.0f)
        curveTo(7.0f, 6.5523f, 6.5523f, 7.0f, 6.0f, 7.0f)
        curveTo(5.4477f, 7.0f, 5.0f, 6.5523f, 5.0f, 6.0f)
        curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
        curveTo(6.5523f, 5.0f, 7.0f, 5.4477f, 7.0f, 6.0f)
        close()
        moveTo(11.0f, 6.0f)
        curveTo(11.0f, 6.5523f, 10.5523f, 7.0f, 10.0f, 7.0f)
        curveTo(9.4477f, 7.0f, 9.0f, 6.5523f, 9.0f, 6.0f)
        curveTo(9.0f, 5.4477f, 9.4477f, 5.0f, 10.0f, 5.0f)
        curveTo(10.5523f, 5.0f, 11.0f, 5.4477f, 11.0f, 6.0f)
        close()
        moveTo(10.0f, 11.0f)
        curveTo(10.5523f, 11.0f, 11.0f, 10.5523f, 11.0f, 10.0f)
        curveTo(11.0f, 9.4477f, 10.5523f, 9.0f, 10.0f, 9.0f)
        curveTo(9.4477f, 9.0f, 9.0f, 9.4477f, 9.0f, 10.0f)
        curveTo(9.0f, 10.5523f, 9.4477f, 11.0f, 10.0f, 11.0f)
        close()
        moveTo(7.0f, 10.0f)
        curveTo(7.0f, 10.5523f, 6.5523f, 11.0f, 6.0f, 11.0f)
        curveTo(5.4477f, 11.0f, 5.0f, 10.5523f, 5.0f, 10.0f)
        curveTo(5.0f, 9.4477f, 5.4477f, 9.0f, 6.0f, 9.0f)
        curveTo(6.5523f, 9.0f, 7.0f, 9.4477f, 7.0f, 10.0f)
        close()
    }
}
.build()
