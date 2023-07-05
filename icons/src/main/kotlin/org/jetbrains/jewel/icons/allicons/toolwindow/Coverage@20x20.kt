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

public val ToolwindowGroup.`Coverage@20x20`: IntellijIconData
    get() {
        if (`_coverage@20x20` != null) {
            return `_coverage@20x20`!!
        }
        `_coverage@20x20` = IntellijIconData(imageVector = { `Coverage@20x20Composable`(it) })
        return `_coverage@20x20`!!
    }

private var `_coverage@20x20`: IntellijIconData? = null

private fun `Coverage@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "Coverage@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.5f, 4.481f)
        verticalLineTo(11.0f)
        curveTo(3.5f, 12.6577f, 4.3174f, 13.9783f, 5.7164f, 15.2345f)
        curveTo(6.8245f, 16.2294f, 8.1419f, 17.0554f, 9.5149f, 17.9163f)
        curveTo(9.6759f, 18.0173f, 9.8377f, 18.1187f, 10.0f, 18.221f)
        curveTo(10.1623f, 18.1187f, 10.3241f, 18.0173f, 10.4851f, 17.9163f)
        curveTo(11.8581f, 17.0554f, 13.1755f, 16.2294f, 14.2836f, 15.2345f)
        curveTo(15.6826f, 13.9783f, 16.5f, 12.6577f, 16.5f, 11.0f)
        verticalLineTo(4.481f)
        lineTo(10.0f, 1.6373f)
        lineTo(3.5f, 4.481f)
        close()
        moveTo(10.0f, 0.0f)
        lineTo(2.0f, 3.5f)
        verticalLineTo(11.0f)
        curveTo(2.0f, 14.9793f, 5.5899f, 17.2285f, 8.7931f, 19.2354f)
        curveTo(9.2046f, 19.4932f, 9.6097f, 19.747f, 10.0f, 20.0f)
        curveTo(10.3903f, 19.747f, 10.7954f, 19.4932f, 11.2069f, 19.2354f)
        curveTo(14.4101f, 17.2285f, 18.0f, 14.9793f, 18.0f, 11.0f)
        verticalLineTo(3.5f)
        lineTo(10.0f, 0.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.697f, 7.3585f)
        curveTo(13.9899f, 7.6514f, 13.9899f, 8.1263f, 13.697f, 8.4192f)
        lineTo(9.4747f, 12.6414f)
        curveTo(9.3341f, 12.7821f, 9.1433f, 12.8611f, 8.9444f, 12.8611f)
        curveTo(8.7455f, 12.8611f, 8.5547f, 12.7821f, 8.4141f, 12.6414f)
        lineTo(6.303f, 10.5303f)
        curveTo(6.0101f, 10.2374f, 6.0101f, 9.7625f, 6.303f, 9.4696f)
        curveTo(6.5959f, 9.1767f, 7.0707f, 9.1767f, 7.3636f, 9.4696f)
        lineTo(8.9444f, 11.0504f)
        lineTo(12.6363f, 7.3585f)
        curveTo(12.9292f, 7.0656f, 13.4041f, 7.0656f, 13.697f, 7.3585f)
        close()
    }
}
.build()
