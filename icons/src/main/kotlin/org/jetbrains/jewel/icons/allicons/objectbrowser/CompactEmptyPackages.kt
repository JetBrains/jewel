package org.jetbrains.jewel.icons.allicons.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ObjectbrowserGroup

public val ObjectbrowserGroup.CompactEmptyPackages: IntellijIconData
    get() {
        if (_compactEmptyPackages != null) {
            return _compactEmptyPackages!!
        }
        _compactEmptyPackages = IntellijIconData(imageVector = { CompactEmptyPackagesComposable(it)
                })
        return _compactEmptyPackages!!
    }

private var _compactEmptyPackages: IntellijIconData? = null

private fun CompactEmptyPackagesComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "CompactEmptyPackages", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 3.0f)
        verticalLineTo(7.0f)
        curveTo(1.0f, 7.5523f, 1.4477f, 8.0f, 2.0f, 8.0f)
        horizontalLineTo(8.0f)
        curveTo(8.5523f, 8.0f, 9.0f, 7.5523f, 9.0f, 7.0f)
        verticalLineTo(4.0f)
        curveTo(9.0f, 3.4477f, 8.5523f, 3.0f, 8.0f, 3.0f)
        horizontalLineTo(5.5f)
        lineTo(4.5f, 2.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 2.0f, 1.0f, 2.4477f, 1.0f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 7.0f)
        curveTo(1.0f, 7.5523f, 1.4477f, 8.0f, 2.0f, 8.0f)
        horizontalLineTo(8.0f)
        curveTo(8.5523f, 8.0f, 9.0f, 7.5523f, 9.0f, 7.0f)
        verticalLineTo(4.0f)
        curveTo(9.0f, 3.4477f, 8.5523f, 3.0f, 8.0f, 3.0f)
        horizontalLineTo(5.5f)
        lineTo(4.5f, 2.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 2.0f, 1.0f, 2.4477f, 1.0f, 3.0f)
        verticalLineTo(7.0f)
        close()
        moveTo(4.0858f, 3.0f)
        lineTo(2.0f, 3.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(5.0858f)
        lineTo(4.0858f, 3.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 7.5f)
        verticalLineTo(10.5f)
        moveTo(8.5f, 13.5f)
        horizontalLineTo(5.5f)
        curveTo(4.9477f, 13.5f, 4.5f, 13.0523f, 4.5f, 12.5f)
        verticalLineTo(10.5f)
        moveTo(4.5f, 10.5f)
        horizontalLineTo(8.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 2.5f)
        lineTo(10.5f, 4.5f)
        moveTo(12.5f, 2.5f)
        lineTo(14.5f, 4.5f)
        moveTo(12.5f, 2.5f)
        verticalLineTo(13.5f)
    }
}
.build()
