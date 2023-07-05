package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.`Documentation@20x20`: IntellijIconData
    get() {
        if (`_documentation@20x20` != null) {
            return `_documentation@20x20`!!
        }
        `_documentation@20x20` = IntellijIconData(imageVector = {
                `Documentation@20x20Composable`(it) })
        return `_documentation@20x20`!!
    }

private var `_documentation@20x20`: IntellijIconData? = null

private fun `Documentation@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "Documentation@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 4.75f)
        lineTo(13.0f, 4.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 14.25f, 6.0f)
        lineTo(14.25f, 17.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 13.0f, 18.25f)
        lineTo(4.0f, 18.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.75f, 17.0f)
        lineTo(2.75f, 6.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 4.0f, 4.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.502f, 2.5f)
        horizontalLineTo(15.5f)
        curveTo(16.0523f, 2.5f, 16.5f, 2.9477f, 16.5f, 3.5f)
        verticalLineTo(4.4108f)
        curveTo(16.5013f, 4.4404f, 16.502f, 4.4701f, 16.502f, 4.5f)
        verticalLineTo(15.5f)
        curveTo(16.502f, 15.6023f, 16.4943f, 15.7027f, 16.4795f, 15.8008f)
        curveTo(17.3734f, 15.4198f, 18.0f, 14.5331f, 18.0f, 13.5f)
        verticalLineTo(3.5f)
        curveTo(18.0f, 2.1193f, 16.8807f, 1.0f, 15.5f, 1.0f)
        horizontalLineTo(7.5f)
        curveTo(6.4748f, 1.0f, 5.5938f, 1.6171f, 5.208f, 2.5f)
        horizontalLineTo(7.5f)
        horizontalLineTo(14.502f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.5f, 7.75f)
        curveTo(6.0858f, 7.75f, 5.75f, 8.0858f, 5.75f, 8.5f)
        curveTo(5.75f, 8.9142f, 6.0858f, 9.25f, 6.5f, 9.25f)
        verticalLineTo(7.75f)
        close()
        moveTo(10.5f, 9.25f)
        curveTo(10.9142f, 9.25f, 11.25f, 8.9142f, 11.25f, 8.5f)
        curveTo(11.25f, 8.0858f, 10.9142f, 7.75f, 10.5f, 7.75f)
        verticalLineTo(9.25f)
        close()
        moveTo(6.5f, 9.25f)
        horizontalLineTo(10.5f)
        verticalLineTo(7.75f)
        horizontalLineTo(6.5f)
        verticalLineTo(9.25f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.5f, 10.75f)
        curveTo(6.0858f, 10.75f, 5.75f, 11.0858f, 5.75f, 11.5f)
        curveTo(5.75f, 11.9142f, 6.0858f, 12.25f, 6.5f, 12.25f)
        verticalLineTo(10.75f)
        close()
        moveTo(10.5f, 12.25f)
        curveTo(10.9142f, 12.25f, 11.25f, 11.9142f, 11.25f, 11.5f)
        curveTo(11.25f, 11.0858f, 10.9142f, 10.75f, 10.5f, 10.75f)
        verticalLineTo(12.25f)
        close()
        moveTo(6.5f, 12.25f)
        horizontalLineTo(10.5f)
        verticalLineTo(10.75f)
        horizontalLineTo(6.5f)
        verticalLineTo(12.25f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.5f, 13.75f)
        curveTo(6.0858f, 13.75f, 5.75f, 14.0858f, 5.75f, 14.5f)
        curveTo(5.75f, 14.9142f, 6.0858f, 15.25f, 6.5f, 15.25f)
        verticalLineTo(13.75f)
        close()
        moveTo(10.5f, 15.25f)
        curveTo(10.9142f, 15.25f, 11.25f, 14.9142f, 11.25f, 14.5f)
        curveTo(11.25f, 14.0858f, 10.9142f, 13.75f, 10.5f, 13.75f)
        verticalLineTo(15.25f)
        close()
        moveTo(6.5f, 15.25f)
        horizontalLineTo(10.5f)
        verticalLineTo(13.75f)
        horizontalLineTo(6.5f)
        verticalLineTo(15.25f)
        close()
    }
}
.build()
