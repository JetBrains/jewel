package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Patch: IntellijIconData
    get() {
        if (_patch != null) {
            return _patch!!
        }
        _patch = IntellijIconData(imageVector = { PatchComposable(it) })
        return _patch!!
    }

private var _patch: IntellijIconData? = null

private fun PatchComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Patch",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 1.0f)
        curveTo(7.7238f, 1.0f, 7.5f, 1.2239f, 7.5f, 1.5f)
        verticalLineTo(5.5f)
        horizontalLineTo(3.5f)
        curveTo(3.2239f, 5.5f, 3.0f, 5.7239f, 3.0f, 6.0f)
        curveTo(3.0f, 6.2761f, 3.2239f, 6.5f, 3.5f, 6.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(10.5f)
        curveTo(7.5f, 10.7761f, 7.7238f, 11.0f, 8.0f, 11.0f)
        curveTo(8.2761f, 11.0f, 8.5f, 10.7761f, 8.5f, 10.5f)
        verticalLineTo(6.5f)
        horizontalLineTo(12.5f)
        curveTo(12.7761f, 6.5f, 13.0f, 6.2761f, 13.0f, 6.0f)
        curveTo(13.0f, 5.7239f, 12.7761f, 5.5f, 12.5f, 5.5f)
        horizontalLineTo(8.5f)
        verticalLineTo(1.5f)
        curveTo(8.5f, 1.2239f, 8.2761f, 1.0f, 8.0f, 1.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 13.5f)
        lineTo(13.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 14.0f)
        lineTo(3.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 13.5f)
        lineTo(3.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 13.0f)
        lineTo(12.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 13.5f)
        close()
    }
}
.build()
