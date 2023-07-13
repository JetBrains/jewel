package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.CherryPick: IntellijIconData
    get() {
        if (_cherryPick != null) {
            return _cherryPick!!
        }
        _cherryPick = IntellijIconData(name = "CherryPick",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CherryPickComposable(it) })
        return _cherryPick!!
    }

private var _cherryPick: IntellijIconData? = null

private fun CherryPickComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CherryPick", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.5f, 11.0f)
        curveTo(6.5f, 12.1046f, 5.6046f, 13.0f, 4.5f, 13.0f)
        curveTo(3.3954f, 13.0f, 2.5f, 12.1046f, 2.5f, 11.0f)
        curveTo(2.5f, 9.8954f, 3.3954f, 9.0f, 4.5f, 9.0f)
        curveTo(5.6046f, 9.0f, 6.5f, 9.8954f, 6.5f, 11.0f)
        close()
        moveTo(4.5f, 14.0f)
        curveTo(6.1568f, 14.0f, 7.5f, 12.6569f, 7.5f, 11.0f)
        curveTo(7.5f, 9.3432f, 6.1568f, 8.0f, 4.5f, 8.0f)
        curveTo(2.8431f, 8.0f, 1.5f, 9.3432f, 1.5f, 11.0f)
        curveTo(1.5f, 12.6569f, 2.8431f, 14.0f, 4.5f, 14.0f)
        close()
        moveTo(13.5f, 11.0f)
        curveTo(13.5f, 12.1046f, 12.6046f, 13.0f, 11.5f, 13.0f)
        curveTo(10.3954f, 13.0f, 9.5f, 12.1046f, 9.5f, 11.0f)
        curveTo(9.5f, 9.8954f, 10.3954f, 9.0f, 11.5f, 9.0f)
        curveTo(12.6046f, 9.0f, 13.5f, 9.8954f, 13.5f, 11.0f)
        close()
        moveTo(11.5f, 14.0f)
        curveTo(13.1569f, 14.0f, 14.5f, 12.6569f, 14.5f, 11.0f)
        curveTo(14.5f, 9.3432f, 13.1569f, 8.0f, 11.5f, 8.0f)
        curveTo(9.8432f, 8.0f, 8.5f, 9.3432f, 8.5f, 11.0f)
        curveTo(8.5f, 12.6569f, 9.8432f, 14.0f, 11.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.8537f, 1.1465f)
        curveTo(11.7934f, 1.0862f, 11.7216f, 1.0445f, 11.6453f, 1.0214f)
        curveTo(11.5869f, 1.0037f, 11.5244f, 0.9965f, 11.46f, 1.0016f)
        lineTo(11.4585f, 1.0017f)
        lineTo(11.4577f, 1.0018f)
        curveTo(8.893f, 1.2158f, 7.1068f, 2.5136f, 5.93f, 4.0311f)
        curveTo(4.7621f, 5.537f, 4.1835f, 7.2695f, 4.0059f, 8.424f)
        curveTo(3.9639f, 8.6969f, 4.1511f, 8.9522f, 4.424f, 8.9942f)
        curveTo(4.697f, 9.0362f, 4.9523f, 8.849f, 4.9943f, 8.5761f)
        curveTo(5.15f, 7.5638f, 5.6713f, 5.9964f, 6.7202f, 4.6439f)
        curveTo(7.4338f, 3.7238f, 8.3862f, 2.9082f, 9.6361f, 2.4269f)
        lineTo(10.8329f, 1.8728f)
        lineTo(10.1507f, 2.4855f)
        curveTo(9.6372f, 3.4581f, 9.4862f, 4.482f, 9.5384f, 5.4276f)
        curveTo(9.6146f, 6.8079f, 10.1221f, 8.0385f, 10.5761f, 8.765f)
        curveTo(10.7225f, 8.9992f, 11.031f, 9.0704f, 11.2651f, 8.924f)
        curveTo(11.4993f, 8.7777f, 11.5705f, 8.4692f, 11.4241f, 8.235f)
        curveTo(11.0449f, 7.6282f, 10.6024f, 6.5588f, 10.5369f, 5.3725f)
        curveTo(10.4723f, 4.2011f, 10.7737f, 2.9336f, 11.8537f, 1.8536f)
        curveTo(12.049f, 1.6583f, 12.049f, 1.3417f, 11.8537f, 1.1465f)
        close()
    }
}
.build()
