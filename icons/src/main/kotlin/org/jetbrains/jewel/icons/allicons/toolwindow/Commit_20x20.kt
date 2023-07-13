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

public val ToolwindowGroup.Commit_20x20: IntellijIconData
    get() {
        if (_commit_20x20 != null) {
            return _commit_20x20!!
        }
        _commit_20x20 = IntellijIconData(name = "Commit_20x20",size = DpSize(height = 20.0.dp, width
                = 20.0.dp),imageVector = { Commit_20x20Composable(it) })
        return _commit_20x20!!
    }

private var _commit_20x20: IntellijIconData? = null

private fun Commit_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Commit_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(19.25f, 9.25f)
        curveTo(19.6642f, 9.25f, 20.0f, 9.5858f, 20.0f, 10.0f)
        curveTo(20.0f, 10.4142f, 19.6642f, 10.75f, 19.25f, 10.75f)
        lineTo(13.9298f, 10.75f)
        curveTo(13.5787f, 12.6006f, 11.9528f, 14.0f, 10.0f, 14.0f)
        curveTo(8.0472f, 14.0f, 6.4212f, 12.6006f, 6.0702f, 10.75f)
        lineTo(0.75f, 10.75f)
        curveTo(0.3358f, 10.75f, -0.0f, 10.4142f, -0.0f, 10.0f)
        curveTo(-0.0f, 9.5858f, 0.3358f, 9.25f, 0.75f, 9.25f)
        lineTo(6.0702f, 9.25f)
        curveTo(6.4212f, 7.3994f, 8.0472f, 6.0f, 10.0f, 6.0f)
        curveTo(11.9528f, 6.0f, 13.5787f, 7.3994f, 13.9298f, 9.25f)
        lineTo(19.25f, 9.25f)
        close()
        moveTo(10.0f, 12.5f)
        curveTo(11.3807f, 12.5f, 12.5f, 11.3807f, 12.5f, 10.0f)
        curveTo(12.5f, 8.6193f, 11.3807f, 7.5f, 10.0f, 7.5f)
        curveTo(8.6193f, 7.5f, 7.5f, 8.6193f, 7.5f, 10.0f)
        curveTo(7.5f, 11.3807f, 8.6193f, 12.5f, 10.0f, 12.5f)
        close()
    }
}
.build()
