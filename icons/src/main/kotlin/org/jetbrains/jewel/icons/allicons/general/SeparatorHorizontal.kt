package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.SeparatorHorizontal: IntellijIconData
    get() {
        if (_separatorHorizontal != null) {
            return _separatorHorizontal!!
        }
        _separatorHorizontal = IntellijIconData(imageVector = { SeparatorHorizontalComposable(it) })
        return _separatorHorizontal!!
    }

private var _separatorHorizontal: IntellijIconData? = null

private fun SeparatorHorizontalComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "SeparatorHorizontal", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0001f, 7.5f)
        curveTo(1.0001f, 7.2239f, 1.2239f, 7.0f, 1.5001f, 7.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(1.5001f)
        curveTo(1.2239f, 8.0f, 1.0001f, 7.7761f, 1.0001f, 7.5f)
        verticalLineTo(7.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.0001f, 7.0f)
        horizontalLineTo(9.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(6.0001f)
        verticalLineTo(7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 7.0f)
        horizontalLineTo(13.4999f)
        curveTo(13.7761f, 7.0f, 13.9999f, 7.2239f, 13.9999f, 7.5f)
        verticalLineTo(7.5f)
        curveTo(13.9999f, 7.7761f, 13.7761f, 8.0f, 13.4999f, 8.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(7.0f)
        close()
    }
}
.build()
