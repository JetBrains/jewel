package org.jetbrains.jewel.icons.allicons.debugger

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
import org.jetbrains.jewel.icons.allicons.DebuggerGroup

public val DebuggerGroup.Watch: IntellijIconData
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = IntellijIconData(imageVector = { WatchComposable(it) })
        return _watch!!
    }

private var _watch: IntellijIconData? = null

private fun WatchComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Watch",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.6254f, 6.5472f)
        curveTo(6.1137f, 5.6245f, 5.1298f, 5.0f, 4.0f, 5.0f)
        curveTo(2.6938f, 5.0f, 1.5825f, 5.8348f, 1.1707f, 7.0f)
        horizontalLineTo(0.5f)
        curveTo(0.2239f, 7.0f, 0.0f, 7.2239f, 0.0f, 7.5f)
        curveTo(0.0f, 7.7761f, 0.2239f, 8.0f, 0.5f, 8.0f)
        horizontalLineTo(1.0f)
        curveTo(1.0f, 9.6568f, 2.3431f, 11.0f, 4.0f, 11.0f)
        curveTo(5.6568f, 11.0f, 7.0f, 9.6568f, 7.0f, 8.0f)
        curveTo(7.0f, 7.4477f, 7.4477f, 7.0f, 8.0f, 7.0f)
        curveTo(8.5523f, 7.0f, 9.0f, 7.4477f, 9.0f, 8.0f)
        curveTo(9.0f, 9.6568f, 10.3431f, 11.0f, 12.0f, 11.0f)
        curveTo(13.6569f, 11.0f, 15.0f, 9.6568f, 15.0f, 8.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 8.0f, 16.0f, 7.7761f, 16.0f, 7.5f)
        curveTo(16.0f, 7.2239f, 15.7761f, 7.0f, 15.5f, 7.0f)
        horizontalLineTo(14.8293f)
        curveTo(14.4175f, 5.8348f, 13.3062f, 5.0f, 12.0f, 5.0f)
        curveTo(10.8702f, 5.0f, 9.8862f, 5.6245f, 9.3746f, 6.5472f)
        curveTo(9.0162f, 6.208f, 8.5324f, 6.0f, 8.0f, 6.0f)
        curveTo(7.4676f, 6.0f, 6.9838f, 6.208f, 6.6254f, 6.5472f)
        close()
        moveTo(4.0f, 10.0f)
        curveTo(5.1046f, 10.0f, 6.0f, 9.1046f, 6.0f, 8.0f)
        curveTo(6.0f, 6.8954f, 5.1046f, 6.0f, 4.0f, 6.0f)
        curveTo(2.8954f, 6.0f, 2.0f, 6.8954f, 2.0f, 8.0f)
        curveTo(2.0f, 9.1046f, 2.8954f, 10.0f, 4.0f, 10.0f)
        close()
        moveTo(10.0f, 8.0f)
        curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
        curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
        curveTo(14.0f, 6.8954f, 13.1046f, 6.0f, 12.0f, 6.0f)
        curveTo(10.8954f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
        close()
    }
}
.build()
