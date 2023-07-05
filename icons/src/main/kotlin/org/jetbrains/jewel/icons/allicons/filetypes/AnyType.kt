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

public val FiletypesGroup.AnyType: IntellijIconData
    get() {
        if (_anyType != null) {
            return _anyType!!
        }
        _anyType = IntellijIconData(imageVector = { AnyTypeComposable(it) })
        return _anyType!!
    }

private var _anyType: IntellijIconData? = null

private fun AnyTypeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "AnyType", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 5.9142f)
        curveTo(3.5f, 5.649f, 3.6054f, 5.3946f, 3.7929f, 5.2071f)
        lineTo(7.2071f, 1.7929f)
        curveTo(7.3946f, 1.6054f, 7.649f, 1.5f, 7.9142f, 1.5f)
        horizontalLineTo(11.5f)
        curveTo(12.0523f, 1.5f, 12.5f, 1.9477f, 12.5f, 2.5f)
        curveTo(12.5f, 8.0979f, 12.5f, 8.6201f, 12.5f, 13.4992f)
        curveTo(12.5f, 14.0514f, 12.0523f, 14.5f, 11.5f, 14.5f)
        horizontalLineTo(4.5f)
        curveTo(3.9477f, 14.5f, 3.5f, 14.0523f, 3.5f, 13.5f)
        verticalLineTo(5.9142f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.9142f, 1.0f)
        curveTo(7.5164f, 1.0f, 7.1349f, 1.158f, 6.8535f, 1.4393f)
        lineTo(3.4393f, 4.8535f)
        curveTo(3.158f, 5.1349f, 3.0f, 5.5164f, 3.0f, 5.9142f)
        verticalLineTo(13.5f)
        curveTo(3.0f, 14.3284f, 3.6716f, 15.0f, 4.5f, 15.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 15.0f, 13.0f, 14.1046f, 13.0f, 13.0f)
        verticalLineTo(2.5f)
        curveTo(13.0f, 1.6716f, 12.3284f, 1.0f, 11.5f, 1.0f)
        horizontalLineTo(7.9142f)
        close()
        moveTo(12.0f, 2.5f)
        curveTo(12.0f, 2.2239f, 11.7761f, 2.0f, 11.5f, 2.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(4.5f)
        curveTo(8.0f, 5.3284f, 7.3284f, 6.0f, 6.5f, 6.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(13.5f)
        curveTo(4.0f, 13.7761f, 4.2239f, 14.0f, 4.5f, 14.0f)
        horizontalLineTo(11.0f)
        curveTo(11.5523f, 14.0f, 12.0f, 13.5523f, 12.0f, 13.0f)
        verticalLineTo(2.5f)
        close()
        moveTo(7.0f, 2.7071f)
        lineTo(4.7071f, 5.0f)
        horizontalLineTo(6.5f)
        curveTo(6.7761f, 5.0f, 7.0f, 4.7761f, 7.0f, 4.5f)
        verticalLineTo(2.7071f)
        close()
    }
}
.build()
