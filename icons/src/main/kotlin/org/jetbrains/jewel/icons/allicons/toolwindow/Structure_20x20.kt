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

public val ToolwindowGroup.Structure_20x20: IntellijIconData
    get() {
        if (_structure_20x20 != null) {
            return _structure_20x20!!
        }
        _structure_20x20 = IntellijIconData(name = "Structure_20x20",size = DpSize(height = 20.0.dp,
                width = 20.0.dp),imageVector = { Structure_20x20Composable(it) })
        return _structure_20x20!!
    }

private var _structure_20x20: IntellijIconData? = null

private fun Structure_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Structure_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.25f, 3.5f)
        horizontalLineTo(4.0f)
        curveTo(3.7239f, 3.5f, 3.5f, 3.7239f, 3.5f, 4.0f)
        verticalLineTo(7.25f)
        curveTo(3.5f, 7.5261f, 3.7239f, 7.75f, 4.0f, 7.75f)
        horizontalLineTo(7.25f)
        curveTo(7.5261f, 7.75f, 7.75f, 7.5261f, 7.75f, 7.25f)
        verticalLineTo(4.0f)
        curveTo(7.75f, 3.7239f, 7.5261f, 3.5f, 7.25f, 3.5f)
        close()
        moveTo(4.0f, 2.0f)
        curveTo(2.8954f, 2.0f, 2.0f, 2.8954f, 2.0f, 4.0f)
        verticalLineTo(7.25f)
        curveTo(2.0f, 8.3546f, 2.8954f, 9.25f, 4.0f, 9.25f)
        horizontalLineTo(7.25f)
        curveTo(8.3546f, 9.25f, 9.25f, 8.3546f, 9.25f, 7.25f)
        verticalLineTo(4.0f)
        curveTo(9.25f, 2.8954f, 8.3546f, 2.0f, 7.25f, 2.0f)
        horizontalLineTo(4.0f)
        close()
        moveTo(7.25f, 12.25f)
        horizontalLineTo(4.0f)
        curveTo(3.7239f, 12.25f, 3.5f, 12.4739f, 3.5f, 12.75f)
        verticalLineTo(16.0f)
        curveTo(3.5f, 16.2761f, 3.7239f, 16.5f, 4.0f, 16.5f)
        horizontalLineTo(7.25f)
        curveTo(7.5261f, 16.5f, 7.75f, 16.2761f, 7.75f, 16.0f)
        verticalLineTo(12.75f)
        curveTo(7.75f, 12.4739f, 7.5261f, 12.25f, 7.25f, 12.25f)
        close()
        moveTo(4.0f, 10.75f)
        curveTo(2.8954f, 10.75f, 2.0f, 11.6454f, 2.0f, 12.75f)
        verticalLineTo(16.0f)
        curveTo(2.0f, 17.1046f, 2.8954f, 18.0f, 4.0f, 18.0f)
        horizontalLineTo(7.25f)
        curveTo(8.3546f, 18.0f, 9.25f, 17.1046f, 9.25f, 16.0f)
        verticalLineTo(12.75f)
        curveTo(9.25f, 11.6454f, 8.3546f, 10.75f, 7.25f, 10.75f)
        horizontalLineTo(4.0f)
        close()
        moveTo(12.75f, 12.25f)
        horizontalLineTo(16.0f)
        curveTo(16.2761f, 12.25f, 16.5f, 12.4739f, 16.5f, 12.75f)
        verticalLineTo(16.0f)
        curveTo(16.5f, 16.2761f, 16.2761f, 16.5f, 16.0f, 16.5f)
        horizontalLineTo(12.75f)
        curveTo(12.4739f, 16.5f, 12.25f, 16.2761f, 12.25f, 16.0f)
        verticalLineTo(12.75f)
        curveTo(12.25f, 12.4739f, 12.4739f, 12.25f, 12.75f, 12.25f)
        close()
        moveTo(10.75f, 12.75f)
        curveTo(10.75f, 11.6454f, 11.6454f, 10.75f, 12.75f, 10.75f)
        horizontalLineTo(16.0f)
        curveTo(17.1046f, 10.75f, 18.0f, 11.6454f, 18.0f, 12.75f)
        verticalLineTo(16.0f)
        curveTo(18.0f, 17.1046f, 17.1046f, 18.0f, 16.0f, 18.0f)
        horizontalLineTo(12.75f)
        curveTo(11.6454f, 18.0f, 10.75f, 17.1046f, 10.75f, 16.0f)
        verticalLineTo(12.75f)
        close()
    }
}
.build()
