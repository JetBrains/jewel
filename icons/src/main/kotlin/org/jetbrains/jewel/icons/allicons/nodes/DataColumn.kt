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

public val NodesGroup.DataColumn: IntellijIconData
    get() {
        if (_dataColumn != null) {
            return _dataColumn!!
        }
        _dataColumn = IntellijIconData(imageVector = { DataColumnComposable(it) })
        return _dataColumn!!
    }

private var _dataColumn: IntellijIconData? = null

private fun DataColumnComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DataColumn", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 4.0f)
        curveTo(1.0f, 2.8954f, 1.8954f, 2.0f, 3.0f, 2.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 2.0f, 15.0f, 2.8954f, 15.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(15.0f, 13.1046f, 14.1046f, 14.0f, 13.0f, 14.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 14.0f, 1.0f, 13.1046f, 1.0f, 12.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(3.0f, 3.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
        close()
        moveTo(6.0f, 3.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 13.0f, 14.0f, 12.5523f, 14.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(14.0f, 3.4477f, 13.5523f, 3.0f, 13.0f, 3.0f)
        horizontalLineTo(6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 4.0f)
        curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        close()
    }
}
.build()
