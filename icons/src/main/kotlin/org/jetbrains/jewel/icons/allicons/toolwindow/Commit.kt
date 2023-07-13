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

public val ToolwindowGroup.Commit: IntellijIconData
    get() {
        if (_commit != null) {
            return _commit!!
        }
        _commit = IntellijIconData(name = "Commit",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CommitComposable(it) })
        return _commit!!
    }

private var _commit: IntellijIconData? = null

private fun CommitComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Commit", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 10.0f)
        curveTo(9.1046f, 10.0f, 10.0f, 9.1046f, 10.0f, 8.0f)
        curveTo(10.0f, 6.8954f, 9.1046f, 6.0f, 8.0f, 6.0f)
        curveTo(6.8954f, 6.0f, 6.0f, 6.8954f, 6.0f, 8.0f)
        curveTo(6.0f, 9.1046f, 6.8954f, 10.0f, 8.0f, 10.0f)
        close()
        moveTo(10.9585f, 7.5f)
        curveTo(10.7205f, 6.0811f, 9.4865f, 5.0f, 8.0f, 5.0f)
        curveTo(6.5135f, 5.0f, 5.2795f, 6.0811f, 5.0415f, 7.5f)
        horizontalLineTo(0.5f)
        curveTo(0.2239f, 7.5f, 0.0f, 7.7239f, 0.0f, 8.0f)
        curveTo(0.0f, 8.2761f, 0.2239f, 8.5f, 0.5f, 8.5f)
        horizontalLineTo(5.0415f)
        curveTo(5.2795f, 9.9189f, 6.5135f, 11.0f, 8.0f, 11.0f)
        curveTo(9.4865f, 11.0f, 10.7205f, 9.9189f, 10.9585f, 8.5f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 8.5f, 16.0f, 8.2761f, 16.0f, 8.0f)
        curveTo(16.0f, 7.7239f, 15.7761f, 7.5f, 15.5f, 7.5f)
        horizontalLineTo(10.9585f)
        close()
    }
}
.build()
