package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.GroupByModule: IntellijIconData
    get() {
        if (_groupByModule != null) {
            return _groupByModule!!
        }
        _groupByModule = IntellijIconData(imageVector = { GroupByModuleComposable(it) })
        return _groupByModule!!
    }

private var _groupByModule: IntellijIconData? = null

private fun GroupByModuleComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "GroupByModule", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 13.5f)
        horizontalLineTo(2.5f)
        curveTo(1.9477f, 13.5f, 1.5f, 13.0523f, 1.5f, 12.5f)
        verticalLineTo(3.5f)
        curveTo(1.5f, 2.9477f, 1.9477f, 2.5f, 2.5f, 2.5f)
        horizontalLineTo(3.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 13.5f)
        horizontalLineTo(13.5f)
        curveTo(14.0523f, 13.5f, 14.5f, 13.0523f, 14.5f, 12.5f)
        verticalLineTo(3.5f)
        curveTo(14.5f, 2.9477f, 14.0523f, 2.5f, 13.5f, 2.5f)
        horizontalLineTo(12.5f)
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 4.5f)
        lineTo(10.0f, 4.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 6.0f)
        lineTo(11.5f, 10.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 11.5f)
        lineTo(6.0f, 11.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 10.0f)
        lineTo(4.5f, 6.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 4.5f)
        close()
    }
}
.build()
