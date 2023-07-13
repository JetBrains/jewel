package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Hierarchy: IntellijIconData
    get() {
        if (_hierarchy != null) {
            return _hierarchy!!
        }
        _hierarchy = IntellijIconData(name = "Hierarchy",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { HierarchyComposable(it) })
        return _hierarchy!!
    }

private var _hierarchy: IntellijIconData? = null

private fun HierarchyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Hierarchy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.5f, 2.0f)
        horizontalLineTo(9.5f)
        verticalLineTo(5.0f)
        horizontalLineTo(6.5f)
        verticalLineTo(2.0f)
        close()
        moveTo(5.5f, 2.0f)
        curveTo(5.5f, 1.4477f, 5.9477f, 1.0f, 6.5f, 1.0f)
        horizontalLineTo(9.5f)
        curveTo(10.0523f, 1.0f, 10.5f, 1.4477f, 10.5f, 2.0f)
        verticalLineTo(5.0f)
        curveTo(10.5f, 5.5523f, 10.0523f, 6.0f, 9.5f, 6.0f)
        horizontalLineTo(8.4004f)
        verticalLineTo(7.5f)
        horizontalLineTo(11.0f)
        curveTo(11.5523f, 7.5f, 12.0f, 7.9477f, 12.0f, 8.5f)
        verticalLineTo(10.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 10.0f, 14.0f, 10.4477f, 14.0f, 11.0f)
        verticalLineTo(14.0f)
        curveTo(14.0f, 14.5523f, 13.5523f, 15.0f, 13.0f, 15.0f)
        horizontalLineTo(10.0f)
        curveTo(9.4477f, 15.0f, 9.0f, 14.5523f, 9.0f, 14.0f)
        verticalLineTo(11.0f)
        curveTo(9.0f, 10.4477f, 9.4477f, 10.0f, 10.0f, 10.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(8.5f)
        horizontalLineTo(5.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(6.0f)
        curveTo(6.5523f, 10.0f, 7.0f, 10.4477f, 7.0f, 11.0f)
        verticalLineTo(14.0f)
        curveTo(7.0f, 14.5523f, 6.5523f, 15.0f, 6.0f, 15.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 15.0f, 2.0f, 14.5523f, 2.0f, 14.0f)
        verticalLineTo(11.0f)
        curveTo(2.0f, 10.4477f, 2.4477f, 10.0f, 3.0f, 10.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(8.5f)
        curveTo(4.0f, 7.9477f, 4.4477f, 7.5f, 5.0f, 7.5f)
        horizontalLineTo(7.4004f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.5f)
        curveTo(5.9477f, 6.0f, 5.5f, 5.5523f, 5.5f, 5.0f)
        verticalLineTo(2.0f)
        close()
        moveTo(6.0f, 11.0f)
        horizontalLineTo(3.0f)
        lineTo(3.0f, 14.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(11.0f)
        close()
        moveTo(13.0f, 11.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(11.0f)
        close()
    }
}
.build()
