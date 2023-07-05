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

public val GeneralGroup.`MoreHorizontal@20x20`: IntellijIconData
    get() {
        if (`_moreHorizontal@20x20` != null) {
            return `_moreHorizontal@20x20`!!
        }
        `_moreHorizontal@20x20` = IntellijIconData(imageVector = {
                `MoreHorizontal@20x20Composable`(it) })
        return `_moreHorizontal@20x20`!!
    }

private var `_moreHorizontal@20x20`: IntellijIconData? = null

private fun `MoreHorizontal@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "MoreHorizontal@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 10.0f)
        moveToRelative(0.0f, 1.5f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 10.0f)
        moveToRelative(0.0f, 1.5f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(16.5f, 10.0f)
        moveToRelative(0.0f, 1.5f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
    }
}
.build()
