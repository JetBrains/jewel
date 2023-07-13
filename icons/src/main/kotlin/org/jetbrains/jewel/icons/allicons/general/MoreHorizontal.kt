package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.MoreHorizontal: IntellijIconData
    get() {
        if (_moreHorizontal != null) {
            return _moreHorizontal!!
        }
        _moreHorizontal = IntellijIconData(name = "MoreHorizontal",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { MoreHorizontalComposable(it) })
        return _moreHorizontal!!
    }

private var _moreHorizontal: IntellijIconData? = null

private fun MoreHorizontalComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MoreHorizontal", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.0f, 8.0f)
        moveToRelative(0.0f, 1.0f)
        arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
        arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(0.0f, 1.0f)
        arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
        arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 8.0f)
        moveToRelative(0.0f, 1.0f)
        arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
        arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
    }
}
.build()
