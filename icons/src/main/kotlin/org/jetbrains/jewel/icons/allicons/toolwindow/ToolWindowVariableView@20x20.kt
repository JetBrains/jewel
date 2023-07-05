package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val ToolwindowGroup.`ToolWindowVariableView@20x20`: IntellijIconData
    get() {
        if (`_toolWindowVariableView@20x20` != null) {
            return `_toolWindowVariableView@20x20`!!
        }
        `_toolWindowVariableView@20x20` = IntellijIconData(imageVector = {
                `ToolWindowVariableView@20x20Composable`(it) })
        return `_toolWindowVariableView@20x20`!!
    }

private var `_toolWindowVariableView@20x20`: IntellijIconData? = null

private fun `ToolWindowVariableView@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ToolWindowVariableView@20x20", defaultWidth = 20.0.dp, defaultHeight =
        20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.5f, 4.0f)
        verticalLineTo(7.0f)
        curveTo(3.5f, 7.2761f, 3.7239f, 7.5f, 4.0f, 7.5f)
        horizontalLineTo(16.0f)
        curveTo(16.2761f, 7.5f, 16.5f, 7.2761f, 16.5f, 7.0f)
        verticalLineTo(4.0f)
        curveTo(16.5f, 3.7239f, 16.2761f, 3.5f, 16.0f, 3.5f)
        horizontalLineTo(4.0f)
        curveTo(3.7239f, 3.5f, 3.5f, 3.7239f, 3.5f, 4.0f)
        close()
        moveTo(2.0f, 7.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(16.0f)
        curveTo(17.1046f, 2.0f, 18.0f, 2.8954f, 18.0f, 4.0f)
        verticalLineTo(7.0f)
        curveTo(18.0f, 8.1046f, 17.1046f, 9.0f, 16.0f, 9.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 9.0f, 2.0f, 8.1046f, 2.0f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.5f, 13.0f)
        verticalLineTo(16.0f)
        curveTo(3.5f, 16.2761f, 3.7239f, 16.5f, 4.0f, 16.5f)
        horizontalLineTo(16.0f)
        curveTo(16.2761f, 16.5f, 16.5f, 16.2761f, 16.5f, 16.0f)
        verticalLineTo(13.0f)
        curveTo(16.5f, 12.7239f, 16.2761f, 12.5f, 16.0f, 12.5f)
        horizontalLineTo(4.0f)
        curveTo(3.7239f, 12.5f, 3.5f, 12.7239f, 3.5f, 13.0f)
        close()
        moveTo(2.0f, 16.0f)
        verticalLineTo(13.0f)
        curveTo(2.0f, 11.8954f, 2.8954f, 11.0f, 4.0f, 11.0f)
        horizontalLineTo(16.0f)
        curveTo(17.1046f, 11.0f, 18.0f, 11.8954f, 18.0f, 13.0f)
        verticalLineTo(16.0f)
        curveTo(18.0f, 17.1046f, 17.1046f, 18.0f, 16.0f, 18.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 18.0f, 2.0f, 17.1046f, 2.0f, 16.0f)
        close()
    }
}
.build()
