package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Rerun_stroke: IntellijIconData
    get() {
        if (_rerun_stroke != null) {
            return _rerun_stroke!!
        }
        _rerun_stroke = IntellijIconData(imageVector = { Rerun_strokeComposable(it) })
        return _rerun_stroke!!
    }

private var _rerun_stroke: IntellijIconData? = null

private fun Rerun_strokeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Rerun_stroke", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.9002f, 0.0f)
        curveTo(12.3145f, 0.0f, 12.6502f, 0.3358f, 12.6502f, 0.75f)
        verticalLineTo(4.75f)
        verticalLineTo(5.5f)
        horizontalLineTo(11.9002f)
        horizontalLineTo(7.9002f)
        curveTo(7.486f, 5.5f, 7.1502f, 5.1642f, 7.1502f, 4.75f)
        curveTo(7.1502f, 4.3358f, 7.486f, 4.0f, 7.9002f, 4.0f)
        horizontalLineTo(10.1644f)
        curveTo(9.2971f, 3.0758f, 8.0659f, 2.5f, 6.7002f, 2.5f)
        curveTo(4.0768f, 2.5f, 1.9502f, 4.6266f, 1.9502f, 7.25f)
        curveTo(1.9502f, 9.8063f, 3.9695f, 11.8909f, 6.5f, 11.9958f)
        verticalLineTo(13.4968f)
        curveTo(3.1409f, 13.3911f, 0.4502f, 10.6348f, 0.4502f, 7.25f)
        curveTo(0.4502f, 3.7982f, 3.2484f, 1.0f, 6.7002f, 1.0f)
        curveTo(8.4422f, 1.0f, 10.0175f, 1.7131f, 11.1502f, 2.8615f)
        verticalLineTo(0.75f)
        curveTo(11.1502f, 0.3358f, 11.486f, 0.0f, 11.9002f, 0.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.4f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.5f, 11.0341f)
        curveTo(15.1667f, 11.419f, 15.1667f, 12.3812f, 14.5f, 12.7661f)
        lineTo(10.3f, 15.191f)
        curveTo(9.6333f, 15.5759f, 8.8f, 15.0948f, 8.8f, 14.325f)
        lineTo(8.8f, 9.4752f)
        curveTo(8.8f, 8.7054f, 9.6333f, 8.2243f, 10.3f, 8.6092f)
        lineTo(14.5f, 11.0341f)
        close()
    }
}
.build()
