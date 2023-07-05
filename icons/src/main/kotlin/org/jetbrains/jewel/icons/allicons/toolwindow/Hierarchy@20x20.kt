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

public val ToolwindowGroup.`Hierarchy@20x20`: IntellijIconData
    get() {
        if (`_hierarchy@20x20` != null) {
            return `_hierarchy@20x20`!!
        }
        `_hierarchy@20x20` = IntellijIconData(imageVector = { `Hierarchy@20x20Composable`(it) })
        return `_hierarchy@20x20`!!
    }

private var `_hierarchy@20x20`: IntellijIconData? = null

private fun `Hierarchy@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "Hierarchy@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(9.0f, 2.5f)
        horizontalLineTo(11.0f)
        curveTo(11.2761f, 2.5f, 11.5f, 2.7239f, 11.5f, 3.0f)
        verticalLineTo(5.0f)
        curveTo(11.5f, 5.2761f, 11.2761f, 5.5f, 11.0f, 5.5f)
        horizontalLineTo(9.0f)
        curveTo(8.7239f, 5.5f, 8.5f, 5.2761f, 8.5f, 5.0f)
        verticalLineTo(3.0f)
        curveTo(8.5f, 2.7239f, 8.7239f, 2.5f, 9.0f, 2.5f)
        close()
        moveTo(7.0f, 3.0f)
        curveTo(7.0f, 1.8954f, 7.8954f, 1.0f, 9.0f, 1.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 1.0f, 13.0f, 1.8954f, 13.0f, 3.0f)
        verticalLineTo(5.0f)
        curveTo(13.0f, 6.1046f, 12.1046f, 7.0f, 11.0f, 7.0f)
        horizontalLineTo(10.75f)
        verticalLineTo(9.0f)
        horizontalLineTo(13.25f)
        curveTo(14.0784f, 9.0f, 14.75f, 9.6716f, 14.75f, 10.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(15.0f)
        curveTo(16.1046f, 13.0f, 17.0f, 13.8954f, 17.0f, 15.0f)
        verticalLineTo(17.0f)
        curveTo(17.0f, 18.1046f, 16.1046f, 19.0f, 15.0f, 19.0f)
        horizontalLineTo(13.0f)
        curveTo(11.8954f, 19.0f, 11.0f, 18.1046f, 11.0f, 17.0f)
        verticalLineTo(15.0f)
        curveTo(11.0f, 13.8954f, 11.8954f, 13.0f, 13.0f, 13.0f)
        horizontalLineTo(13.25f)
        verticalLineTo(10.5f)
        horizontalLineTo(6.75f)
        verticalLineTo(13.0f)
        horizontalLineTo(7.0f)
        curveTo(8.1046f, 13.0f, 9.0f, 13.8954f, 9.0f, 15.0f)
        verticalLineTo(17.0f)
        curveTo(9.0f, 18.1046f, 8.1046f, 19.0f, 7.0f, 19.0f)
        horizontalLineTo(5.0f)
        curveTo(3.8954f, 19.0f, 3.0f, 18.1046f, 3.0f, 17.0f)
        verticalLineTo(15.0f)
        curveTo(3.0f, 13.8954f, 3.8954f, 13.0f, 5.0f, 13.0f)
        horizontalLineTo(5.25f)
        verticalLineTo(10.5f)
        curveTo(5.25f, 9.6716f, 5.9216f, 9.0f, 6.75f, 9.0f)
        horizontalLineTo(9.25f)
        verticalLineTo(7.0f)
        horizontalLineTo(9.0f)
        curveTo(7.8954f, 7.0f, 7.0f, 6.1046f, 7.0f, 5.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(7.0f, 14.5f)
        horizontalLineTo(5.0f)
        curveTo(4.7239f, 14.5f, 4.5f, 14.7239f, 4.5f, 15.0f)
        verticalLineTo(17.0f)
        curveTo(4.5f, 17.2761f, 4.7239f, 17.5f, 5.0f, 17.5f)
        horizontalLineTo(7.0f)
        curveTo(7.2761f, 17.5f, 7.5f, 17.2761f, 7.5f, 17.0f)
        verticalLineTo(15.0f)
        curveTo(7.5f, 14.7239f, 7.2761f, 14.5f, 7.0f, 14.5f)
        close()
        moveTo(15.0f, 14.5f)
        horizontalLineTo(13.0f)
        curveTo(12.7239f, 14.5f, 12.5f, 14.7239f, 12.5f, 15.0f)
        verticalLineTo(17.0f)
        curveTo(12.5f, 17.2761f, 12.7239f, 17.5f, 13.0f, 17.5f)
        horizontalLineTo(15.0f)
        curveTo(15.2761f, 17.5f, 15.5f, 17.2761f, 15.5f, 17.0f)
        verticalLineTo(15.0f)
        curveTo(15.5f, 14.7239f, 15.2761f, 14.5f, 15.0f, 14.5f)
        close()
    }
}
.build()
