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

public val NodesGroup.Alias: IntellijIconData
    get() {
        if (_alias != null) {
            return _alias!!
        }
        _alias = IntellijIconData(name = "Alias",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { AliasComposable(it) })
        return _alias!!
    }

private var _alias: IntellijIconData? = null

private fun AliasComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Alias",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.0f, 12.4984f)
        verticalLineTo(3.5016f)
        curveTo(2.0f, 3.0686f, 2.5111f, 2.8398f, 2.8326f, 3.1289f)
        lineTo(7.8341f, 7.6274f)
        curveTo(8.0553f, 7.8263f, 8.0553f, 8.1737f, 7.8341f, 8.3726f)
        lineTo(2.8326f, 12.8711f)
        curveTo(2.5111f, 13.1602f, 2.0f, 12.9314f, 2.0f, 12.4984f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(9.0f, 12.4984f)
        verticalLineTo(3.5016f)
        curveTo(9.0f, 3.0686f, 9.5112f, 2.8398f, 9.8326f, 3.1289f)
        lineTo(14.8341f, 7.6274f)
        curveTo(15.0553f, 7.8263f, 15.0553f, 8.1737f, 14.8341f, 8.3726f)
        lineTo(9.8326f, 12.8711f)
        curveTo(9.5112f, 13.1602f, 9.0f, 12.9314f, 9.0f, 12.4984f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(2.9985f, 11.3769f)
        lineTo(6.7531f, 8.0f)
        lineTo(2.9985f, 4.6231f)
        verticalLineTo(11.3769f)
        close()
        moveTo(2.0f, 12.4984f)
        verticalLineTo(3.5016f)
        curveTo(2.0f, 3.0686f, 2.5111f, 2.8398f, 2.8326f, 3.1289f)
        lineTo(7.8341f, 7.6274f)
        curveTo(8.0553f, 7.8263f, 8.0553f, 8.1737f, 7.8341f, 8.3726f)
        lineTo(2.8326f, 12.8711f)
        curveTo(2.5111f, 13.1602f, 2.0f, 12.9314f, 2.0f, 12.4984f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(9.9985f, 11.3769f)
        lineTo(13.7531f, 8.0f)
        lineTo(9.9985f, 4.6231f)
        verticalLineTo(11.3769f)
        close()
        moveTo(9.0f, 12.4984f)
        verticalLineTo(3.5016f)
        curveTo(9.0f, 3.0686f, 9.5112f, 2.8398f, 9.8326f, 3.1289f)
        lineTo(14.8341f, 7.6274f)
        curveTo(15.0553f, 7.8263f, 15.0553f, 8.1737f, 14.8341f, 8.3726f)
        lineTo(9.8326f, 12.8711f)
        curveTo(9.5112f, 13.1602f, 9.0f, 12.9314f, 9.0f, 12.4984f)
        close()
    }
}
.build()
