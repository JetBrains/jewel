package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Plugin: IntellijIconData
    get() {
        if (_plugin != null) {
            return _plugin!!
        }
        _plugin = IntellijIconData(name = "Plugin",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { PluginComposable(it) })
        return _plugin!!
    }

private var _plugin: IntellijIconData? = null

private fun PluginComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Plugin", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0f, 4.0f)
        horizontalLineTo(7.0f)
        curveTo(5.3432f, 4.0f, 4.0f, 5.3432f, 4.0f, 7.0f)
        verticalLineTo(9.0f)
        curveTo(4.0f, 10.6569f, 5.3432f, 12.0f, 7.0f, 12.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(11.0f)
        verticalLineTo(10.0f)
        verticalLineTo(6.0f)
        verticalLineTo(5.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(12.0f, 5.0f)
        verticalLineTo(4.0f)
        curveTo(12.0f, 3.4477f, 11.5523f, 3.0f, 11.0f, 3.0f)
        horizontalLineTo(7.0f)
        curveTo(5.1362f, 3.0f, 3.5701f, 4.2748f, 3.126f, 6.0f)
        horizontalLineTo(1.0f)
        curveTo(0.4477f, 6.0f, 0.0f, 6.4477f, 0.0f, 7.0f)
        verticalLineTo(9.0f)
        curveTo(0.0f, 9.5523f, 0.4477f, 10.0f, 1.0f, 10.0f)
        horizontalLineTo(3.126f)
        curveTo(3.5701f, 11.7252f, 5.1362f, 13.0f, 7.0f, 13.0f)
        horizontalLineTo(11.0f)
        curveTo(11.5523f, 13.0f, 12.0f, 12.5523f, 12.0f, 12.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 11.0f, 16.0f, 10.7761f, 16.0f, 10.5f)
        curveTo(16.0f, 10.2239f, 15.7761f, 10.0f, 15.5f, 10.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 6.0f, 16.0f, 5.7761f, 16.0f, 5.5f)
        curveTo(16.0f, 5.2239f, 15.7761f, 5.0f, 15.5f, 5.0f)
        horizontalLineTo(12.0f)
        close()
        moveTo(3.0f, 7.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(1.0f)
        verticalLineTo(7.0f)
        lineTo(3.0f, 7.0f)
        close()
    }
}
.build()
