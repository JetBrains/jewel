package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Changes_20x20: IntellijIconData
    get() {
        if (_changes_20x20 != null) {
            return _changes_20x20!!
        }
        _changes_20x20 = IntellijIconData(name = "Changes_20x20",size = DpSize(height = 20.0.dp,
                width = 20.0.dp),imageVector = { Changes_20x20Composable(it) })
        return _changes_20x20!!
    }

private var _changes_20x20: IntellijIconData? = null

private fun Changes_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Changes_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.75f, 7.0f)
        lineTo(11.25f, 7.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 7.75f)
        lineTo(12.0f, 7.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 11.25f, 8.5f)
        lineTo(3.75f, 8.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 7.75f)
        lineTo(3.0f, 7.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 3.75f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.75f, 11.0f)
        lineTo(8.25f, 11.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 9.0f, 11.75f)
        lineTo(9.0f, 11.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 8.25f, 12.5f)
        lineTo(3.75f, 12.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 11.75f)
        lineTo(3.0f, 11.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 3.75f, 11.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.75f, 3.0f)
        lineTo(16.25f, 3.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.0f, 3.75f)
        lineTo(17.0f, 3.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 16.25f, 4.5f)
        lineTo(3.75f, 4.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 3.75f)
        lineTo(3.0f, 3.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 3.75f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(15.0404f, 9.0404f)
        curveTo(15.2942f, 8.7865f, 15.7058f, 8.7865f, 15.9596f, 9.0404f)
        curveTo(16.2135f, 9.2942f, 16.2135f, 9.7058f, 15.9596f, 9.9596f)
        lineTo(14.8192f, 11.1f)
        horizontalLineTo(19.2502f)
        curveTo(19.6092f, 11.1f, 19.9002f, 11.391f, 19.9002f, 11.75f)
        curveTo(19.9002f, 12.109f, 19.6092f, 12.4f, 19.2502f, 12.4f)
        horizontalLineTo(14.8193f)
        lineTo(15.9596f, 13.5404f)
        curveTo(16.2135f, 13.7942f, 16.2135f, 14.2058f, 15.9596f, 14.4596f)
        curveTo(15.7058f, 14.7134f, 15.2942f, 14.7134f, 15.0404f, 14.4596f)
        lineTo(12.7904f, 12.2096f)
        lineTo(12.3308f, 11.75f)
        lineTo(12.7904f, 11.2904f)
        lineTo(15.0404f, 9.0404f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.1696f, 13.9904f)
        curveTo(10.9158f, 13.7366f, 10.5042f, 13.7366f, 10.2504f, 13.9904f)
        curveTo(9.9965f, 14.2443f, 9.9965f, 14.6558f, 10.2504f, 14.9097f)
        lineTo(11.3908f, 16.05f)
        horizontalLineTo(6.96f)
        curveTo(6.601f, 16.05f, 6.31f, 16.3411f, 6.31f, 16.7f)
        curveTo(6.31f, 17.059f, 6.601f, 17.35f, 6.96f, 17.35f)
        horizontalLineTo(11.3908f)
        lineTo(10.2504f, 18.4904f)
        curveTo(9.9965f, 18.7443f, 9.9965f, 19.1558f, 10.2504f, 19.4097f)
        curveTo(10.5042f, 19.6635f, 10.9158f, 19.6635f, 11.1696f, 19.4097f)
        lineTo(13.4196f, 17.1597f)
        lineTo(13.8792f, 16.7f)
        lineTo(13.4196f, 16.2404f)
        lineTo(11.1696f, 13.9904f)
        close()
    }
}
.build()
