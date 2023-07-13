package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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

public val NodesGroup.WebFolder: IntellijIconData
    get() {
        if (_webFolder != null) {
            return _webFolder!!
        }
        _webFolder = IntellijIconData(name = "WebFolder",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { WebFolderComposable(it) })
        return _webFolder!!
    }

private var _webFolder: IntellijIconData? = null

private fun WebFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "WebFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7313f, 2.0f, 2.6333f, 2.0f)
        horizontalLineTo(6.1217f)
        curveTo(6.3941f, 2.0f, 6.6548f, 2.1112f, 6.8434f, 2.3077f)
        lineTo(8.4667f, 4.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(12.1333f)
        curveTo(15.0f, 13.1643f, 14.2687f, 14.0f, 13.3667f, 14.0f)
        horizontalLineTo(2.6333f)
        curveTo(1.7313f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
        moveTo(6.0f, 10.0f)
        curveTo(6.5523f, 10.0f, 7.0f, 9.5523f, 7.0f, 9.0f)
        curveTo(7.0f, 8.4477f, 6.5523f, 8.0f, 6.0f, 8.0f)
        curveTo(5.4477f, 8.0f, 5.0f, 8.4477f, 5.0f, 9.0f)
        curveTo(5.0f, 9.5523f, 5.4477f, 10.0f, 6.0f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0402f, 5.0f)
        lineTo(6.1217f, 3.0f)
        horizontalLineTo(2.6333f)
        curveTo(2.4048f, 3.0f, 2.0f, 3.2584f, 2.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(2.0f, 12.7416f, 2.4048f, 13.0f, 2.6333f, 13.0f)
        horizontalLineTo(13.3667f)
        curveTo(13.5952f, 13.0f, 14.0f, 12.7416f, 14.0f, 12.1333f)
        verticalLineTo(6.0f)
        curveTo(14.0f, 5.4477f, 13.5523f, 5.0f, 13.0f, 5.0f)
        horizontalLineTo(8.0402f)
        close()
        moveTo(8.4667f, 4.0f)
        lineTo(6.8434f, 2.3077f)
        curveTo(6.6548f, 2.1112f, 6.3941f, 2.0f, 6.1217f, 2.0f)
        horizontalLineTo(2.6333f)
        curveTo(1.7313f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7313f, 14.0f, 2.6333f, 14.0f)
        horizontalLineTo(13.3667f)
        curveTo(14.2687f, 14.0f, 15.0f, 13.1643f, 15.0f, 12.1333f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        horizontalLineTo(8.4667f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(4.0f, 9.0f)
        curveTo(4.0f, 7.8954f, 4.8954f, 7.0f, 6.0f, 7.0f)
        curveTo(7.1046f, 7.0f, 8.0f, 7.8954f, 8.0f, 9.0f)
        curveTo(8.0f, 10.1046f, 7.1046f, 11.0f, 6.0f, 11.0f)
        curveTo(4.8954f, 11.0f, 4.0f, 10.1046f, 4.0f, 9.0f)
        close()
        moveTo(7.0f, 9.0f)
        curveTo(7.0f, 9.5523f, 6.5523f, 10.0f, 6.0f, 10.0f)
        curveTo(5.4477f, 10.0f, 5.0f, 9.5523f, 5.0f, 9.0f)
        curveTo(5.0f, 8.4477f, 5.4477f, 8.0f, 6.0f, 8.0f)
        curveTo(6.5523f, 8.0f, 7.0f, 8.4477f, 7.0f, 9.0f)
        close()
    }
}
.build()
