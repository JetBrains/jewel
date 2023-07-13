package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.AddAny: IntellijIconData
    get() {
        if (_addAny != null) {
            return _addAny!!
        }
        _addAny = IntellijIconData(name = "AddAny",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { AddAnyComposable(it) })
        return _addAny!!
    }

private var _addAny: IntellijIconData? = null

private fun AddAnyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "AddAny", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.5f, 9.0f)
        curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
        curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(15.5f)
        curveTo(13.0f, 15.7761f, 12.7761f, 16.0f, 12.5f, 16.0f)
        curveTo(12.2239f, 16.0f, 12.0f, 15.7761f, 12.0f, 15.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
        curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(9.5f)
        curveTo(12.0f, 9.2239f, 12.2239f, 9.0f, 12.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 13.0f)
        verticalLineTo(5.8284f)
        curveTo(3.0f, 5.298f, 3.2107f, 4.7893f, 3.5858f, 4.4142f)
        lineTo(6.4142f, 1.5858f)
        curveTo(6.7893f, 1.2107f, 7.298f, 1.0f, 7.8284f, 1.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 1.0f, 13.0f, 1.8954f, 13.0f, 3.0f)
        verticalLineTo(8.0854f)
        curveTo(12.8436f, 8.0301f, 12.6753f, 8.0f, 12.5f, 8.0f)
        curveTo(11.6716f, 8.0f, 11.0f, 8.6716f, 11.0f, 9.5f)
        verticalLineTo(11.0f)
        horizontalLineTo(9.5f)
        curveTo(8.6716f, 11.0f, 8.0f, 11.6716f, 8.0f, 12.5f)
        curveTo(8.0f, 13.3284f, 8.6716f, 14.0f, 9.5f, 14.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(15.0f)
        horizontalLineTo(5.0f)
        curveTo(3.8954f, 15.0f, 3.0f, 14.1046f, 3.0f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.0f, 13.0f)
        verticalLineTo(5.8284f)
        curveTo(3.0f, 5.298f, 3.2107f, 4.7893f, 3.5858f, 4.4142f)
        lineTo(6.4142f, 1.5858f)
        curveTo(6.7893f, 1.2107f, 7.298f, 1.0f, 7.8284f, 1.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 1.0f, 13.0f, 1.8954f, 13.0f, 3.0f)
        verticalLineTo(8.0854f)
        curveTo(12.8436f, 8.0301f, 12.6753f, 8.0f, 12.5f, 8.0f)
        curveTo(12.3247f, 8.0f, 12.1564f, 8.0301f, 12.0f, 8.0854f)
        verticalLineTo(3.0f)
        curveTo(12.0f, 2.4477f, 11.5523f, 2.0f, 11.0f, 2.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(4.0f)
        curveTo(8.0f, 5.1046f, 7.1046f, 6.0f, 6.0f, 6.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(13.0f)
        curveTo(4.0f, 13.5523f, 4.4477f, 14.0f, 5.0f, 14.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(15.0f)
        horizontalLineTo(5.0f)
        curveTo(3.8954f, 15.0f, 3.0f, 14.1046f, 3.0f, 13.0f)
        close()
        moveTo(4.4142f, 5.0f)
        lineTo(7.0f, 2.4142f)
        verticalLineTo(4.0f)
        curveTo(7.0f, 4.5523f, 6.5523f, 5.0f, 6.0f, 5.0f)
        horizontalLineTo(4.4142f)
        close()
    }
}
.build()
