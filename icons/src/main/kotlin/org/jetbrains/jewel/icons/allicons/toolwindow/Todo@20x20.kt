package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.`Todo@20x20`: IntellijIconData
    get() {
        if (`_todo@20x20` != null) {
            return `_todo@20x20`!!
        }
        `_todo@20x20` = IntellijIconData(imageVector = { `Todo@20x20Composable`(it) })
        return `_todo@20x20`!!
    }

private var `_todo@20x20`: IntellijIconData? = null

private fun `Todo@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Todo@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.1f, 4.7f)
        moveToRelative(-1.1f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, 2.2f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, -2.2f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 4.7f)
        curveTo(5.5f, 4.2858f, 5.8358f, 3.95f, 6.25f, 3.95f)
        horizontalLineTo(17.25f)
        curveTo(17.6642f, 3.95f, 18.0f, 4.2858f, 18.0f, 4.7f)
        verticalLineTo(4.7f)
        curveTo(18.0f, 5.1142f, 17.6642f, 5.45f, 17.25f, 5.45f)
        horizontalLineTo(6.25f)
        curveTo(5.8358f, 5.45f, 5.5f, 5.1142f, 5.5f, 4.7f)
        verticalLineTo(4.7f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.1f, 10.0f)
        moveToRelative(-1.1f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, 2.2f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, -2.2f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 10.0f)
        curveTo(5.5f, 9.5858f, 5.8358f, 9.25f, 6.25f, 9.25f)
        horizontalLineTo(17.25f)
        curveTo(17.6642f, 9.25f, 18.0f, 9.5858f, 18.0f, 10.0f)
        verticalLineTo(10.0f)
        curveTo(18.0f, 10.4142f, 17.6642f, 10.75f, 17.25f, 10.75f)
        horizontalLineTo(6.25f)
        curveTo(5.8358f, 10.75f, 5.5f, 10.4142f, 5.5f, 10.0f)
        verticalLineTo(10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.1f, 15.3f)
        moveToRelative(-1.1f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, 2.2f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, -2.2f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 15.3f)
        curveTo(5.5f, 14.8858f, 5.8358f, 14.55f, 6.25f, 14.55f)
        horizontalLineTo(17.25f)
        curveTo(17.6642f, 14.55f, 18.0f, 14.8858f, 18.0f, 15.3f)
        verticalLineTo(15.3f)
        curveTo(18.0f, 15.7142f, 17.6642f, 16.05f, 17.25f, 16.05f)
        horizontalLineTo(6.25f)
        curveTo(5.8358f, 16.05f, 5.5f, 15.7142f, 5.5f, 15.3f)
        verticalLineTo(15.3f)
        close()
    }
}
.build()
