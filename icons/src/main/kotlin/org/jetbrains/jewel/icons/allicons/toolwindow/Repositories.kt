package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Repositories: IntellijIconData
    get() {
        if (_repositories != null) {
            return _repositories!!
        }
        _repositories = IntellijIconData(imageVector = { RepositoriesComposable(it) })
        return _repositories!!
    }

private var _repositories: IntellijIconData? = null

private fun RepositoriesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Repositories", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.8026f, 4.7167f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(8.5f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(7.8026f, 4.7167f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.5f, 15.0f)
        curveTo(11.3284f, 15.0f, 12.0f, 14.3284f, 12.0f, 13.5f)
        curveTo(12.0f, 12.6716f, 11.3284f, 12.0f, 10.5f, 12.0f)
        curveTo(9.6716f, 12.0f, 9.0f, 12.6716f, 9.0f, 13.5f)
        curveTo(9.0f, 14.3284f, 9.6716f, 15.0f, 10.5f, 15.0f)
        close()
        moveTo(12.95f, 13.0f)
        curveTo(12.7184f, 11.8589f, 11.7095f, 11.0f, 10.5f, 11.0f)
        curveTo(9.2905f, 11.0f, 8.2816f, 11.8589f, 8.05f, 13.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 13.0f, 5.0f, 13.2239f, 5.0f, 13.5f)
        curveTo(5.0f, 13.7761f, 5.2239f, 14.0f, 5.5f, 14.0f)
        horizontalLineTo(8.05f)
        curveTo(8.2816f, 15.1411f, 9.2905f, 16.0f, 10.5f, 16.0f)
        curveTo(11.7095f, 16.0f, 12.7184f, 15.1411f, 12.95f, 14.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 14.0f, 16.0f, 13.7761f, 16.0f, 13.5f)
        curveTo(16.0f, 13.2239f, 15.7761f, 13.0f, 15.5f, 13.0f)
        horizontalLineTo(12.95f)
        close()
    }
}
.build()
