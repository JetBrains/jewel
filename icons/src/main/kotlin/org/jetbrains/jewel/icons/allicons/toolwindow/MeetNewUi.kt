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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.MeetNewUi: IntellijIconData
    get() {
        if (_meetNewUi != null) {
            return _meetNewUi!!
        }
        _meetNewUi = IntellijIconData(name = "MeetNewUi",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { MeetNewUiComposable(it) })
        return _meetNewUi!!
    }

private var _meetNewUi: IntellijIconData? = null

private fun MeetNewUiComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MeetNewUi", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(5.3457f, 10.6421f)
            curveTo(4.3642f, 9.6681f, 3.1118f, 8.992f, 1.5217f, 8.5f)
            curveTo(3.1117f, 8.008f, 4.3641f, 7.3319f, 5.3457f, 6.3579f)
            curveTo(6.3282f, 5.3829f, 7.0072f, 4.1415f, 7.5003f, 2.5704f)
            curveTo(7.9933f, 4.1415f, 8.6723f, 5.3829f, 9.6549f, 6.3579f)
            curveTo(10.6364f, 7.3319f, 11.8888f, 8.008f, 13.4789f, 8.5f)
            curveTo(11.8888f, 8.992f, 10.6364f, 9.6681f, 9.6549f, 10.6421f)
            curveTo(8.6723f, 11.6171f, 7.9934f, 12.8585f, 7.5003f, 14.4295f)
            curveTo(7.0072f, 12.8585f, 6.3283f, 11.6171f, 5.3457f, 10.6421f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(12.9935f, 4.9071f)
            curveTo(14.0454f, 4.9071f, 14.8981f, 4.0544f, 14.8981f, 3.0025f)
            curveTo(14.8981f, 1.9506f, 14.0454f, 1.0979f, 12.9935f, 1.0979f)
            curveTo(11.9416f, 1.0979f, 11.0889f, 1.9506f, 11.0889f, 3.0025f)
            curveTo(11.0889f, 4.0544f, 11.9416f, 4.9071f, 12.9935f, 4.9071f)
            close()
        }
    }
}
.build()
