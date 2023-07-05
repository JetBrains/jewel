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

public val ToolwindowGroup.Task: IntellijIconData
    get() {
        if (_task != null) {
            return _task!!
        }
        _task = IntellijIconData(imageVector = { TaskComposable(it) })
        return _task!!
    }

private var _task: IntellijIconData? = null

private fun TaskComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Task",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 14.0528f)
        curveTo(7.8581f, 14.0579f, 7.7139f, 14.0118f, 7.609f, 13.9027f)
        curveTo(5.5895f, 11.8023f, 3.2876f, 12.6215f, 2.0029f, 13.3773f)
        curveTo(1.595f, 13.6173f, 1.0f, 13.3303f, 1.0f, 12.857f)
        verticalLineTo(3.4695f)
        curveTo(1.0f, 3.1853f, 1.1529f, 2.9251f, 1.4121f, 2.8087f)
        curveTo(2.5615f, 2.2922f, 5.8586f, 1.0952f, 8.0f, 3.2017f)
        curveTo(10.1414f, 1.0952f, 13.4385f, 2.2922f, 14.5879f, 2.8087f)
        curveTo(14.8472f, 2.9251f, 15.0f, 3.1853f, 15.0f, 3.4695f)
        verticalLineTo(12.857f)
        curveTo(15.0f, 13.3303f, 14.4051f, 13.6173f, 13.9971f, 13.3773f)
        curveTo(12.7125f, 12.6215f, 10.4105f, 11.8023f, 8.3911f, 13.9027f)
        curveTo(8.2862f, 14.0118f, 8.1419f, 14.0579f, 8.0f, 14.0528f)
        close()
        moveTo(7.5f, 4.131f)
        curveTo(6.728f, 3.229f, 5.7189f, 2.9668f, 4.674f, 3.0032f)
        curveTo(3.6187f, 3.0399f, 2.6082f, 3.3865f, 2.0f, 3.6433f)
        verticalLineTo(12.2424f)
        curveTo(2.6724f, 11.9094f, 3.5343f, 11.6052f, 4.4933f, 11.5696f)
        curveTo(5.4766f, 11.5331f, 6.5163f, 11.7821f, 7.5f, 12.4869f)
        verticalLineTo(4.131f)
        close()
        moveTo(8.5f, 12.4869f)
        curveTo(9.4838f, 11.7821f, 10.5235f, 11.5331f, 11.5068f, 11.5696f)
        curveTo(12.4658f, 11.6052f, 13.3276f, 11.9094f, 14.0f, 12.2424f)
        verticalLineTo(3.6433f)
        curveTo(13.3919f, 3.3865f, 12.3813f, 3.0399f, 11.326f, 3.0032f)
        curveTo(10.2812f, 2.9668f, 9.272f, 3.229f, 8.5f, 4.131f)
        verticalLineTo(12.4869f)
        close()
    }
}
.build()
