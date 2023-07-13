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

public val HierarchyGroup.Supertypes: IntellijIconData
    get() {
        if (_supertypes != null) {
            return _supertypes!!
        }
        _supertypes = IntellijIconData(name = "Supertypes",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { SupertypesComposable(it) })
        return _supertypes!!
    }

private var _supertypes: IntellijIconData? = null

private fun SupertypesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Supertypes", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0f, 10.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.7397f, 5.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 5.0f, 2.0f, 4.5523f, 2.0f, 4.0f)
        verticalLineTo(2.0f)
        curveTo(2.0f, 1.4477f, 2.4477f, 1.0f, 3.0f, 1.0f)
        horizontalLineTo(5.0f)
        curveTo(5.5523f, 1.0f, 6.0f, 1.4477f, 6.0f, 2.0f)
        verticalLineTo(4.0f)
        curveTo(6.0f, 4.5523f, 5.5523f, 5.0f, 5.0f, 5.0f)
        horizontalLineTo(4.9603f)
        lineTo(7.7603f, 9.0f)
        horizontalLineTo(8.2397f)
        lineTo(11.0397f, 5.0f)
        horizontalLineTo(11.0f)
        curveTo(10.4477f, 5.0f, 10.0f, 4.5523f, 10.0f, 4.0f)
        verticalLineTo(2.0f)
        curveTo(10.0f, 1.4477f, 10.4477f, 1.0f, 11.0f, 1.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 1.0f, 14.0f, 1.4477f, 14.0f, 2.0f)
        verticalLineTo(4.0f)
        curveTo(14.0f, 4.5523f, 13.5523f, 5.0f, 13.0f, 5.0f)
        horizontalLineTo(12.2603f)
        lineTo(9.4603f, 9.0f)
        horizontalLineTo(10.0f)
        curveTo(10.5523f, 9.0f, 11.0f, 9.4477f, 11.0f, 10.0f)
        verticalLineTo(14.0f)
        curveTo(11.0f, 14.5523f, 10.5523f, 15.0f, 10.0f, 15.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 15.0f, 5.0f, 14.5523f, 5.0f, 14.0f)
        verticalLineTo(10.0f)
        curveTo(5.0f, 9.4477f, 5.4477f, 9.0f, 6.0f, 9.0f)
        horizontalLineTo(6.5397f)
        lineTo(3.7397f, 5.0f)
        close()
        moveTo(3.0f, 2.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(4.0051f)
        curveTo(4.0014f, 4.0f, 3.9977f, 4.0f, 3.994f, 4.0f)
        horizontalLineTo(3.0f)
        verticalLineTo(2.0f)
        close()
        moveTo(7.4965f, 10.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(8.5035f)
        lineTo(8.5f, 10.0f)
        horizontalLineTo(7.5f)
        lineTo(7.4965f, 10.0f)
        close()
        moveTo(12.006f, 4.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(2.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(11.9949f)
        curveTo(11.9986f, 4.0f, 12.0023f, 4.0f, 12.006f, 4.0f)
        close()
    }
}
.build()
