package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.LibraryFolder: IntellijIconData
    get() {
        if (_libraryFolder != null) {
            return _libraryFolder!!
        }
        _libraryFolder = IntellijIconData(name = "LibraryFolder",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { LibraryFolderComposable(it) })
        return _libraryFolder!!
    }

private var _libraryFolder: IntellijIconData? = null

private fun LibraryFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "LibraryFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 2.0f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(10.0f)
        curveTo(7.0f, 8.8954f, 7.8954f, 8.0f, 9.0f, 8.0f)
        horizontalLineTo(9.2676f)
        curveTo(9.6134f, 7.4022f, 10.2597f, 7.0f, 11.0f, 7.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 7.0f, 14.0f, 7.8954f, 14.0f, 9.0f)
        curveTo(14.3643f, 9.0f, 14.7058f, 9.0974f, 15.0f, 9.2676f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 5.0f)
        horizontalLineTo(8.0938f)
        lineTo(6.0382f, 3.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 3.0f, 2.0f, 3.3262f, 2.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(2.0f, 12.6738f, 2.3956f, 13.0f, 2.75f, 13.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
        lineTo(8.5f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(9.2676f)
        curveTo(14.7058f, 9.0974f, 14.3643f, 9.0f, 14.0f, 9.0f)
        verticalLineTo(6.0f)
        curveTo(14.0f, 5.4477f, 13.5523f, 5.0f, 13.0f, 5.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 9.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.0f, 10.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(9.0f)
        verticalLineTo(10.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 11.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(11.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.0f, 9.0f)
        curveTo(10.0f, 8.4477f, 10.4477f, 8.0f, 11.0f, 8.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(14.0f)
        curveTo(14.5523f, 10.0f, 15.0f, 10.4477f, 15.0f, 11.0f)
        verticalLineTo(14.0f)
        curveTo(15.0f, 14.5523f, 14.5523f, 15.0f, 14.0f, 15.0f)
        horizontalLineTo(9.0f)
        curveTo(8.4477f, 15.0f, 8.0f, 14.5523f, 8.0f, 14.0f)
        verticalLineTo(10.0f)
        curveTo(8.0f, 9.4477f, 8.4477f, 9.0f, 9.0f, 9.0f)
        lineTo(10.0f, 9.0f)
        close()
        moveTo(11.0f, 9.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(9.0f)
        close()
        moveTo(10.0f, 10.0f)
        horizontalLineTo(9.0f)
        lineTo(9.0f, 14.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(10.0f)
        close()
        moveTo(13.0f, 14.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(14.0f)
        close()
    }
}
.build()
