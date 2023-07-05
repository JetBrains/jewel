package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.CopyOfFolder: IntellijIconData
    get() {
        if (_copyOfFolder != null) {
            return _copyOfFolder!!
        }
        _copyOfFolder = IntellijIconData(imageVector = { CopyOfFolderComposable(it) })
        return _copyOfFolder!!
    }

private var _copyOfFolder: IntellijIconData? = null

private fun CopyOfFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CopyOfFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 4.0f)
        curveTo(1.7835f, 4.0f, 1.0f, 4.8357f, 1.0f, 5.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(11.25f)
        curveTo(12.2165f, 14.0f, 13.0f, 13.1643f, 13.0f, 12.1333f)
        verticalLineTo(8.0f)
        curveTo(13.0f, 6.8954f, 12.1046f, 6.0f, 11.0f, 6.0f)
        lineTo(8.5f, 6.0f)
        lineTo(6.7356f, 4.2833f)
        curveTo(6.5489f, 4.1016f, 6.2987f, 4.0f, 6.0382f, 4.0f)
        horizontalLineTo(2.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0938f, 7.0f)
        lineTo(6.0382f, 5.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 5.0f, 2.0f, 5.3262f, 2.0f, 5.8667f)
        verticalLineTo(12.1333f)
        curveTo(2.0f, 12.6738f, 2.3956f, 13.0f, 2.75f, 13.0f)
        horizontalLineTo(11.25f)
        curveTo(11.6044f, 13.0f, 12.0f, 12.6738f, 12.0f, 12.1333f)
        verticalLineTo(8.0f)
        curveTo(12.0f, 7.4477f, 11.5523f, 7.0f, 11.0f, 7.0f)
        horizontalLineTo(8.0938f)
        close()
        moveTo(8.5f, 6.0f)
        lineTo(11.0f, 6.0f)
        curveTo(12.1046f, 6.0f, 13.0f, 6.8954f, 13.0f, 8.0f)
        verticalLineTo(12.1333f)
        curveTo(13.0f, 13.1643f, 12.2165f, 14.0f, 11.25f, 14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(5.8667f)
        curveTo(1.0f, 4.8357f, 1.7835f, 4.0f, 2.75f, 4.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 4.0f, 6.5489f, 4.1016f, 6.7356f, 4.2833f)
        lineTo(8.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 2.5f)
        curveTo(3.0f, 2.7761f, 3.2239f, 3.0f, 3.5f, 3.0f)
        lineTo(8.0382f, 3.0f)
        lineTo(10.0938f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(11.5f)
        curveTo(14.0f, 11.7761f, 14.2239f, 12.0f, 14.5f, 12.0f)
        verticalLineTo(12.0f)
        curveTo(14.7761f, 12.0f, 15.0f, 11.7761f, 15.0f, 11.5f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(10.5f, 4.0f)
        lineTo(8.7356f, 2.2833f)
        curveTo(8.5489f, 2.1016f, 8.2987f, 2.0f, 8.0382f, 2.0f)
        horizontalLineTo(3.5f)
        curveTo(3.2239f, 2.0f, 3.0f, 2.2239f, 3.0f, 2.5f)
        verticalLineTo(2.5f)
        close()
    }
}
.build()
