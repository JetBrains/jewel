package org.jetbrains.jewel.icons.allicons.table

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.TableGroup

public val TableGroup.Pagination: IntellijIconData
    get() {
        if (_pagination != null) {
            return _pagination!!
        }
        _pagination = IntellijIconData(imageVector = { PaginationComposable(it) })
        return _pagination!!
    }

private var _pagination: IntellijIconData? = null

private fun PaginationComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Pagination", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 2.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 13.5f)
        horizontalLineTo(14.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 5.0f)
        lineTo(1.5f, 8.0f)
        lineTo(4.5f, 11.0f)
        moveTo(11.5f, 5.0f)
        lineTo(14.5f, 8.0f)
        lineTo(11.5f, 11.0f)
    }
}
.build()
