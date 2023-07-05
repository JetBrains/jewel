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

public val ToolwindowGroup.`Messages@20x20`: IntellijIconData
    get() {
        if (`_messages@20x20` != null) {
            return `_messages@20x20`!!
        }
        `_messages@20x20` = IntellijIconData(imageVector = { `Messages@20x20Composable`(it) })
        return `_messages@20x20`!!
    }

private var `_messages@20x20`: IntellijIconData? = null

private fun `Messages@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "Messages@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 3.0f)
        lineTo(17.25f, 3.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 3.75f)
        lineTo(18.0f, 3.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.25f, 4.5f)
        lineTo(2.75f, 4.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 3.75f)
        lineTo(2.0f, 3.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 7.1667f)
        lineTo(13.25f, 7.1667f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 14.0f, 7.9167f)
        lineTo(14.0f, 7.9167f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 13.25f, 8.6667f)
        lineTo(2.75f, 8.6667f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 7.9167f)
        lineTo(2.0f, 7.9167f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 7.1667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 11.3334f)
        lineTo(14.25f, 11.3334f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 15.0f, 12.0834f)
        lineTo(15.0f, 12.0834f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 14.25f, 12.8334f)
        lineTo(2.75f, 12.8334f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 12.0834f)
        lineTo(2.0f, 12.0834f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 11.3334f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 15.5001f)
        lineTo(17.25f, 15.5001f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 16.2501f)
        lineTo(18.0f, 16.2501f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.25f, 17.0001f)
        lineTo(2.75f, 17.0001f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 16.2501f)
        lineTo(2.0f, 16.2501f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 15.5001f)
        close()
    }
}
.build()
