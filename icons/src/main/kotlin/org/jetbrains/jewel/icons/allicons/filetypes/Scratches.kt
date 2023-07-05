package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Scratches: IntellijIconData
    get() {
        if (_scratches != null) {
            return _scratches!!
        }
        _scratches = IntellijIconData(imageVector = { ScratchesComposable(it) })
        return _scratches!!
    }

private var _scratches: IntellijIconData? = null

private fun ScratchesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Scratches", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0275f, 3.0f)
        horizontalLineTo(2.5f)
        curveTo(2.2239f, 3.0f, 2.0f, 3.2239f, 2.0f, 3.5f)
        curveTo(2.0f, 3.7761f, 2.2239f, 4.0f, 2.5f, 4.0f)
        horizontalLineTo(8.0275f)
        curveTo(8.0093f, 3.8358f, 8.0f, 3.669f, 8.0f, 3.5f)
        curveTo(8.0f, 3.331f, 8.0093f, 3.1642f, 8.0275f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.7578f, 6.0f)
        horizontalLineTo(2.5f)
        curveTo(2.2239f, 6.0f, 2.0f, 6.2239f, 2.0f, 6.5f)
        curveTo(2.0f, 6.7761f, 2.2239f, 7.0f, 2.5f, 7.0f)
        horizontalLineTo(9.5f)
        curveTo(9.5505f, 7.0f, 9.5992f, 6.9925f, 9.6451f, 6.9786f)
        curveTo(9.3037f, 6.6981f, 9.0043f, 6.3682f, 8.7578f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 12.0f)
        curveTo(2.2239f, 12.0f, 2.0f, 12.2239f, 2.0f, 12.5f)
        curveTo(2.0f, 12.7761f, 2.2239f, 13.0f, 2.5f, 13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.7761f, 13.0f, 10.0f, 12.7761f, 10.0f, 12.5f)
        curveTo(10.0f, 12.2239f, 9.7761f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 9.0f)
        curveTo(2.2239f, 9.0f, 2.0f, 9.2239f, 2.0f, 9.5f)
        curveTo(2.0f, 9.7761f, 2.2239f, 10.0f, 2.5f, 10.0f)
        horizontalLineTo(13.5f)
        curveTo(13.7761f, 10.0f, 14.0f, 9.7761f, 14.0f, 9.5f)
        curveTo(14.0f, 9.2239f, 13.7761f, 9.0f, 13.5f, 9.0f)
        horizontalLineTo(2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.5f, 7.0f)
        curveTo(14.433f, 7.0f, 16.0f, 5.433f, 16.0f, 3.5f)
        curveTo(16.0f, 1.567f, 14.433f, 0.0f, 12.5f, 0.0f)
        curveTo(10.567f, 0.0f, 9.0f, 1.567f, 9.0f, 3.5f)
        curveTo(9.0f, 5.433f, 10.567f, 7.0f, 12.5f, 7.0f)
        close()
        moveTo(13.0f, 1.5f)
        curveTo(13.0f, 1.2239f, 12.7761f, 1.0f, 12.5f, 1.0f)
        curveTo(12.2239f, 1.0f, 12.0f, 1.2239f, 12.0f, 1.5f)
        verticalLineTo(3.5f)
        curveTo(12.0f, 3.6326f, 12.0527f, 3.7598f, 12.1464f, 3.8535f)
        lineTo(13.5607f, 5.2678f)
        curveTo(13.7559f, 5.463f, 14.0725f, 5.463f, 14.2678f, 5.2678f)
        curveTo(14.463f, 5.0725f, 14.463f, 4.7559f, 14.2678f, 4.5607f)
        lineTo(13.0f, 3.2929f)
        verticalLineTo(1.5f)
        close()
    }
}
.build()
