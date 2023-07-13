package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
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

public val GeneralGroup.MoreVertical_stroke: IntellijIconData
    get() {
        if (_moreVertical_stroke != null) {
            return _moreVertical_stroke!!
        }
        _moreVertical_stroke = IntellijIconData(name = "MoreVertical_stroke",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { MoreVertical_strokeComposable(it) })
        return _moreVertical_stroke!!
    }

private var _moreVertical_stroke: IntellijIconData? = null

private fun MoreVertical_strokeComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "MoreVertical_stroke", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.5999f)
        moveToRelative(-1.2f, 0.0f)
        arcToRelative(1.2f, 1.2f, 0.0f, true, true, 2.4f, 0.0f)
        arcToRelative(1.2f, 1.2f, 0.0f, true, true, -2.4f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 7.9998f)
        moveToRelative(-1.2f, 0.0f)
        arcToRelative(1.2f, 1.2f, 0.0f, true, true, 2.4f, 0.0f)
        arcToRelative(1.2f, 1.2f, 0.0f, true, true, -2.4f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 13.3997f)
        moveToRelative(-1.2f, 0.0f)
        arcToRelative(1.2f, 1.2f, 0.0f, true, true, 2.4f, 0.0f)
        arcToRelative(1.2f, 1.2f, 0.0f, true, true, -2.4f, 0.0f)
    }
}
.build()
