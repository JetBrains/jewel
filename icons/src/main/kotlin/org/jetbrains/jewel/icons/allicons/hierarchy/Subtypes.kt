package org.jetbrains.jewel.icons.allicons.hierarchy

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
import org.jetbrains.jewel.icons.allicons.HierarchyGroup

public val HierarchyGroup.Subtypes: IntellijIconData
    get() {
        if (_subtypes != null) {
            return _subtypes!!
        }
        _subtypes = IntellijIconData(name = "Subtypes",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { SubtypesComposable(it) })
        return _subtypes!!
    }

private var _subtypes: IntellijIconData? = null

private fun SubtypesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Subtypes", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0f, 2.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.0f, 1.0f)
        curveTo(5.4477f, 1.0f, 5.0f, 1.4477f, 5.0f, 2.0f)
        verticalLineTo(6.0f)
        curveTo(5.0f, 6.5523f, 5.4477f, 7.0f, 6.0f, 7.0f)
        horizontalLineTo(6.5397f)
        lineTo(3.7397f, 11.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 11.0f, 2.0f, 11.4477f, 2.0f, 12.0f)
        verticalLineTo(14.0f)
        curveTo(2.0f, 14.5523f, 2.4477f, 15.0f, 3.0f, 15.0f)
        horizontalLineTo(5.0f)
        curveTo(5.5523f, 15.0f, 6.0f, 14.5523f, 6.0f, 14.0f)
        verticalLineTo(12.0f)
        curveTo(6.0f, 11.4477f, 5.5523f, 11.0f, 5.0f, 11.0f)
        horizontalLineTo(4.9603f)
        lineTo(7.7603f, 7.0f)
        horizontalLineTo(8.2397f)
        lineTo(11.0397f, 11.0f)
        horizontalLineTo(11.0f)
        curveTo(10.4477f, 11.0f, 10.0f, 11.4477f, 10.0f, 12.0f)
        verticalLineTo(14.0f)
        curveTo(10.0f, 14.5523f, 10.4477f, 15.0f, 11.0f, 15.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 15.0f, 14.0f, 14.5523f, 14.0f, 14.0f)
        verticalLineTo(12.0f)
        curveTo(14.0f, 11.4477f, 13.5523f, 11.0f, 13.0f, 11.0f)
        horizontalLineTo(12.2603f)
        lineTo(9.4603f, 7.0f)
        horizontalLineTo(10.0f)
        curveTo(10.5523f, 7.0f, 11.0f, 6.5523f, 11.0f, 6.0f)
        verticalLineTo(2.0f)
        curveTo(11.0f, 1.4477f, 10.5523f, 1.0f, 10.0f, 1.0f)
        horizontalLineTo(6.0f)
        close()
        moveTo(10.0f, 6.0f)
        verticalLineTo(2.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(10.0f)
        close()
        moveTo(11.9939f, 12.0f)
        curveTo(11.9982f, 12.0001f, 12.0026f, 12.0001f, 12.007f, 12.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(11.9939f)
        close()
        moveTo(3.993f, 12.0f)
        curveTo(3.9974f, 12.0001f, 4.0017f, 12.0001f, 4.0061f, 12.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(3.993f)
        close()
    }
}
.build()
