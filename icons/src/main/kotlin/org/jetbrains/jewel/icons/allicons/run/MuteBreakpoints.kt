package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.MuteBreakpoints: IntellijIconData
    get() {
        if (_muteBreakpoints != null) {
            return _muteBreakpoints!!
        }
        _muteBreakpoints = IntellijIconData(name = "MuteBreakpoints",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { MuteBreakpointsComposable(it) })
        return _muteBreakpoints!!
    }

private var _muteBreakpoints: IntellijIconData? = null

private fun MuteBreakpointsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MuteBreakpoints", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.403f, 3.0514f)
        curveTo(9.6769f, 2.6982f, 8.8615f, 2.5f, 7.9998f, 2.5f)
        curveTo(4.9623f, 2.5f, 2.4998f, 4.9625f, 2.4998f, 8.0f)
        curveTo(2.4998f, 8.8617f, 2.698f, 9.6771f, 3.0512f, 10.4031f)
        lineTo(10.403f, 3.0514f)
        close()
        moveTo(5.5968f, 12.9487f)
        curveTo(6.3229f, 13.3019f, 7.1382f, 13.5f, 7.9998f, 13.5f)
        curveTo(11.0374f, 13.5f, 13.4998f, 11.0376f, 13.4998f, 8.0f)
        curveTo(13.4998f, 7.1384f, 13.3017f, 6.323f, 12.9485f, 5.597f)
        lineTo(5.5968f, 12.9487f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.403f, 3.0514f)
        curveTo(9.6769f, 2.6982f, 8.8615f, 2.5f, 7.9998f, 2.5f)
        curveTo(4.9623f, 2.5f, 2.4998f, 4.9625f, 2.4998f, 8.0f)
        curveTo(2.4998f, 8.8617f, 2.698f, 9.6771f, 3.0512f, 10.4031f)
        lineTo(3.8098f, 9.6446f)
        curveTo(3.6097f, 9.1351f, 3.4998f, 8.5804f, 3.4998f, 8.0f)
        curveTo(3.4998f, 5.5147f, 5.5146f, 3.5f, 7.9998f, 3.5f)
        curveTo(8.5802f, 3.5f, 9.135f, 3.6099f, 9.6444f, 3.81f)
        lineTo(10.403f, 3.0514f)
        close()
        moveTo(6.3554f, 12.1901f)
        curveTo(6.8648f, 12.3902f, 7.4195f, 12.5f, 7.9998f, 12.5f)
        curveTo(10.4851f, 12.5f, 12.4998f, 10.4853f, 12.4998f, 8.0f)
        curveTo(12.4998f, 7.4197f, 12.39f, 6.865f, 12.1899f, 6.3556f)
        lineTo(12.9485f, 5.597f)
        curveTo(13.3017f, 6.323f, 13.4998f, 7.1384f, 13.4998f, 8.0f)
        curveTo(13.4998f, 11.0376f, 11.0374f, 13.5f, 7.9998f, 13.5f)
        curveTo(7.1382f, 13.5f, 6.3229f, 13.3019f, 5.5968f, 12.9487f)
        lineTo(6.3554f, 12.1901f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0103f, 1.9896f)
        lineTo(14.0103f, 1.9896f)
        arcTo(0.5f, 0.5f, 83.3377f, false, true, 14.0103f, 2.6967f)
        lineTo(2.6965f, 14.0104f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.9894f, 14.0104f)
        lineTo(1.9894f, 14.0104f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.9894f, 13.3033f)
        lineTo(13.3031f, 1.9896f)
        arcTo(0.5f, 0.5f, 83.3377f, false, true, 14.0103f, 1.9896f)
        close()
    }
}
.build()
