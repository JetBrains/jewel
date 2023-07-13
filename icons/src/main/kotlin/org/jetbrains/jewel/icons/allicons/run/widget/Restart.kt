package org.jetbrains.jewel.icons.allicons.run.widget

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.run.WidgetGroup

public val WidgetGroup.Restart: IntellijIconData
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = IntellijIconData(name = "Restart",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { RestartComposable(it) })
        return _restart!!
    }

private var _restart: IntellijIconData? = null

private fun RestartComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Restart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(13.7f, 1.5f)
        curveTo(13.7f, 1.1135f, 13.3866f, 0.8f, 13.0f, 0.8f)
        curveTo(12.6134f, 0.8f, 12.3f, 1.1135f, 12.3f, 1.5f)
        verticalLineTo(3.5336f)
        curveTo(11.1858f, 2.4608f, 9.6701f, 1.8001f, 8.0f, 1.8001f)
        curveTo(4.5758f, 1.8001f, 1.8f, 4.5759f, 1.8f, 8.0f)
        curveTo(1.8f, 11.4242f, 4.5758f, 14.2f, 8.0f, 14.2f)
        curveTo(10.4718f, 14.2f, 12.6044f, 12.7535f, 13.6f, 10.6639f)
        curveTo(13.7663f, 10.3148f, 13.6181f, 9.8971f, 13.2691f, 9.7308f)
        curveTo(12.9201f, 9.5646f, 12.5024f, 9.7127f, 12.3361f, 10.0617f)
        curveTo(11.564f, 11.6824f, 9.9118f, 12.8f, 8.0f, 12.8f)
        curveTo(5.349f, 12.8f, 3.2f, 10.651f, 3.2f, 8.0f)
        curveTo(3.2f, 5.3491f, 5.349f, 3.2001f, 8.0f, 3.2001f)
        curveTo(9.4211f, 3.2001f, 10.6982f, 3.8171f, 11.5778f, 4.8f)
        horizontalLineTo(9.0f)
        curveTo(8.6134f, 4.8f, 8.3f, 5.1135f, 8.3f, 5.5001f)
        curveTo(8.3f, 5.8867f, 8.6134f, 6.2f, 9.0f, 6.2f)
        horizontalLineTo(13.0f)
        horizontalLineTo(13.7f)
        verticalLineTo(5.5001f)
        verticalLineTo(1.5f)
        close()
    }
}
.build()
