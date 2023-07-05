package org.jetbrains.jewel.icons.allicons.toolbar

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ToolbarGroup

public val ToolbarGroup.`Unknown@20x20`: IntellijIconData
    get() {
        if (`_unknown@20x20` != null) {
            return `_unknown@20x20`!!
        }
        `_unknown@20x20` = IntellijIconData(imageVector = { `Unknown@20x20Composable`(it) })
        return `_unknown@20x20`!!
    }

private var `_unknown@20x20`: IntellijIconData? = null

private fun `Unknown@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Unknown@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.0f, 7.5f)
        curveTo(9.0f, 8.3284f, 8.3284f, 9.0f, 7.5f, 9.0f)
        curveTo(6.6716f, 9.0f, 6.0f, 8.3284f, 6.0f, 7.5f)
        curveTo(6.0f, 6.6716f, 6.6716f, 6.0f, 7.5f, 6.0f)
        curveTo(8.3284f, 6.0f, 9.0f, 6.6716f, 9.0f, 7.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 7.5f)
        curveTo(14.0f, 8.3284f, 13.3284f, 9.0f, 12.5f, 9.0f)
        curveTo(11.6716f, 9.0f, 11.0f, 8.3284f, 11.0f, 7.5f)
        curveTo(11.0f, 6.6716f, 11.6716f, 6.0f, 12.5f, 6.0f)
        curveTo(13.3284f, 6.0f, 14.0f, 6.6716f, 14.0f, 7.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.5f, 14.0f)
        curveTo(13.3284f, 14.0f, 14.0f, 13.3284f, 14.0f, 12.5f)
        curveTo(14.0f, 11.6716f, 13.3284f, 11.0f, 12.5f, 11.0f)
        curveTo(11.6716f, 11.0f, 11.0f, 11.6716f, 11.0f, 12.5f)
        curveTo(11.0f, 13.3284f, 11.6716f, 14.0f, 12.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.0f, 12.5f)
        curveTo(9.0f, 13.3284f, 8.3284f, 14.0f, 7.5f, 14.0f)
        curveTo(6.6716f, 14.0f, 6.0f, 13.3284f, 6.0f, 12.5f)
        curveTo(6.0f, 11.6716f, 6.6716f, 11.0f, 7.5f, 11.0f)
        curveTo(8.3284f, 11.0f, 9.0f, 11.6716f, 9.0f, 12.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(19.0f, 10.0f)
        curveTo(19.0f, 14.9706f, 14.9706f, 19.0f, 10.0f, 19.0f)
        curveTo(5.0294f, 19.0f, 1.0f, 14.9706f, 1.0f, 10.0f)
        curveTo(1.0f, 5.0294f, 5.0294f, 1.0f, 10.0f, 1.0f)
        curveTo(14.9706f, 1.0f, 19.0f, 5.0294f, 19.0f, 10.0f)
        close()
        moveTo(17.5f, 10.0f)
        curveTo(17.5f, 14.1421f, 14.1421f, 17.5f, 10.0f, 17.5f)
        curveTo(5.8579f, 17.5f, 2.5f, 14.1421f, 2.5f, 10.0f)
        curveTo(2.5f, 5.8579f, 5.8579f, 2.5f, 10.0f, 2.5f)
        curveTo(14.1421f, 2.5f, 17.5f, 5.8579f, 17.5f, 10.0f)
        close()
    }
}
.build()
