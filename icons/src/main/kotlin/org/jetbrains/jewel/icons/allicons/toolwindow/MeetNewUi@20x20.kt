package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.`MeetNewUi@20x20`: IntellijIconData
    get() {
        if (`_meetNewUi@20x20` != null) {
            return `_meetNewUi@20x20`!!
        }
        `_meetNewUi@20x20` = IntellijIconData(imageVector = { `MeetNewUi@20x20Composable`(it) })
        return `_meetNewUi@20x20`!!
    }

private var `_meetNewUi@20x20`: IntellijIconData? = null

private fun `MeetNewUi@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "MeetNewUi@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    group {
    }
    group {
        path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(6.7699f, 8.036f)
            curveTo(7.9384f, 6.8766f, 8.765f, 5.4231f, 9.3751f, 3.6167f)
            curveTo(9.9852f, 5.4231f, 10.8118f, 6.8766f, 11.9803f, 8.036f)
            curveTo(13.1472f, 9.1939f, 14.6128f, 10.0165f, 16.4395f, 10.6249f)
            curveTo(14.6128f, 11.2334f, 13.1472f, 12.0559f, 11.9803f, 13.2139f)
            curveTo(10.8118f, 14.3733f, 9.9852f, 15.8268f, 9.3751f, 17.6331f)
            curveTo(8.765f, 15.8268f, 7.9384f, 14.3733f, 6.77f, 13.2139f)
            curveTo(5.603f, 12.0559f, 4.1375f, 11.2334f, 2.3108f, 10.6249f)
            curveTo(4.1375f, 10.0165f, 5.603f, 9.1939f, 6.7699f, 8.036f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(16.2411f, 6.1338f)
            curveTo(17.556f, 6.1338f, 18.6219f, 5.0679f, 18.6219f, 3.7531f)
            curveTo(18.6219f, 2.4382f, 17.556f, 1.3723f, 16.2411f, 1.3723f)
            curveTo(14.9263f, 1.3723f, 13.8604f, 2.4382f, 13.8604f, 3.7531f)
            curveTo(13.8604f, 5.0679f, 14.9263f, 6.1338f, 16.2411f, 6.1338f)
            close()
        }
    }
}
.build()
