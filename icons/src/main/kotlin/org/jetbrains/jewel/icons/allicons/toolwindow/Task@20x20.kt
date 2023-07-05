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

public val ToolwindowGroup.`Task@20x20`: IntellijIconData
    get() {
        if (`_task@20x20` != null) {
            return `_task@20x20`!!
        }
        `_task@20x20` = IntellijIconData(imageVector = { `Task@20x20Composable`(it) })
        return `_task@20x20`!!
    }

private var `_task@20x20`: IntellijIconData? = null

private fun `Task@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Task@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0f, 17.4433f)
        curveTo(9.7599f, 17.468f, 9.5093f, 17.4062f, 9.3265f, 17.2366f)
        curveTo(6.7684f, 14.8638f, 3.8933f, 15.9073f, 2.2791f, 16.8502f)
        curveTo(1.7563f, 17.1556f, 1.0f, 16.7875f, 1.0f, 16.1821f)
        verticalLineTo(4.0973f)
        curveTo(1.0f, 3.7294f, 1.1992f, 3.3931f, 1.5356f, 3.2442f)
        curveTo(3.0153f, 2.5892f, 7.2326f, 1.0772f, 10.0f, 3.6471f)
        curveTo(12.7674f, 1.0772f, 16.9847f, 2.5892f, 18.4644f, 3.2442f)
        curveTo(18.8008f, 3.3931f, 19.0f, 3.7294f, 19.0f, 4.0973f)
        verticalLineTo(16.1821f)
        curveTo(19.0f, 16.7875f, 18.2437f, 17.1556f, 17.7209f, 16.8502f)
        curveTo(16.1067f, 15.9073f, 13.2316f, 14.8638f, 10.6735f, 17.2366f)
        curveTo(10.4907f, 17.4062f, 10.24f, 17.468f, 10.0f, 17.4433f)
        close()
        moveTo(9.25f, 5.0239f)
        curveTo(8.3174f, 3.9768f, 7.0978f, 3.662f, 5.7954f, 3.7072f)
        curveTo(4.5223f, 3.7515f, 3.2918f, 4.1467f, 2.5f, 4.4651f)
        verticalLineTo(15.0493f)
        curveTo(3.3012f, 14.6874f, 4.2763f, 14.3744f, 5.3497f, 14.3033f)
        curveTo(6.6071f, 14.22f, 7.9575f, 14.474f, 9.25f, 15.2894f)
        verticalLineTo(5.0239f)
        close()
        moveTo(10.75f, 15.2894f)
        curveTo(12.0425f, 14.474f, 13.3929f, 14.22f, 14.6503f, 14.3033f)
        curveTo(15.7237f, 14.3744f, 16.6988f, 14.6874f, 17.5f, 15.0493f)
        verticalLineTo(4.4651f)
        curveTo(16.7082f, 4.1467f, 15.4777f, 3.7515f, 14.2046f, 3.7072f)
        curveTo(12.9022f, 3.662f, 11.6826f, 3.9768f, 10.75f, 5.0239f)
        verticalLineTo(15.2894f)
        close()
    }
}
.build()
