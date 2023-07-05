package org.jetbrains.jewel.icons.allicons.progress

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
import org.jetbrains.jewel.icons.allicons.ProgressGroup

public val ProgressGroup.Stop: IntellijIconData
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = IntellijIconData(imageVector = { StopComposable(it) })
        return _stop!!
    }

private var _stop: IntellijIconData? = null

private fun StopComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Stop",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF313547)), stroke = null, fillAlpha = 0.1f, strokeAlpha = 0.1f,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-8.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.494f, 4.488f)
        curveTo(11.3002f, 4.2802f, 10.9725f, 4.2756f, 10.773f, 4.4779f)
        lineTo(8.0008f, 7.2886f)
        lineTo(5.2288f, 4.478f)
        curveTo(5.0293f, 4.2757f, 4.7015f, 4.2803f, 4.5077f, 4.4881f)
        curveTo(4.3251f, 4.6839f, 4.3294f, 4.9889f, 4.5174f, 5.1796f)
        lineTo(7.2991f, 8.0f)
        lineTo(4.5176f, 10.8203f)
        curveTo(4.3296f, 11.0109f, 4.3253f, 11.3159f, 4.5079f, 11.5118f)
        curveTo(4.7017f, 11.7195f, 5.0295f, 11.7241f, 5.229f, 11.5219f)
        lineTo(8.0008f, 8.7115f)
        lineTo(10.7728f, 11.522f)
        curveTo(10.9722f, 11.7243f, 11.3f, 11.7197f, 11.4938f, 11.5119f)
        curveTo(11.6764f, 11.3161f, 11.6721f, 11.0111f, 11.4841f, 10.8204f)
        lineTo(8.7025f, 8.0f)
        lineTo(11.4843f, 5.1795f)
        curveTo(11.6723f, 4.9888f, 11.6766f, 4.6838f, 11.494f, 4.488f)
        close()
    }
}
.build()
