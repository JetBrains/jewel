package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Cut: IntellijIconData
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = IntellijIconData(imageVector = { CutComposable(it) })
        return _cut!!
    }

private var _cut: IntellijIconData? = null

private fun CutComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Cut",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.0f, 4.5f)
        curveTo(7.0f, 5.4224f, 6.5005f, 6.2281f, 5.7572f, 6.6613f)
        lineTo(7.622f, 7.455f)
        lineTo(13.3045f, 5.0398f)
        curveTo(13.5586f, 4.9318f, 13.8522f, 5.0503f, 13.9602f, 5.3044f)
        curveTo(14.0682f, 5.5586f, 13.9498f, 5.8521f, 13.6956f, 5.9602f)
        lineTo(8.8994f, 7.9986f)
        lineTo(13.6956f, 10.0398f)
        curveTo(13.9498f, 10.1478f, 14.0682f, 10.4414f, 13.9602f, 10.6956f)
        curveTo(13.8522f, 10.9497f, 13.5586f, 11.0682f, 13.3045f, 10.9602f)
        lineTo(7.6218f, 8.5416f)
        lineTo(5.7527f, 9.336f)
        curveTo(6.4985f, 9.7687f, 7.0f, 10.5758f, 7.0f, 11.5f)
        curveTo(7.0f, 12.8807f, 5.8807f, 14.0f, 4.5f, 14.0f)
        curveTo(3.1193f, 14.0f, 2.0f, 12.8807f, 2.0f, 11.5f)
        curveTo(2.0f, 10.4975f, 2.5901f, 9.6328f, 3.4419f, 9.2343f)
        lineTo(3.4409f, 9.232f)
        lineTo(6.3443f, 7.998f)
        lineTo(3.6573f, 6.8544f)
        curveTo(2.6912f, 6.5086f, 2.0f, 5.585f, 2.0f, 4.5f)
        curveTo(2.0f, 3.1193f, 3.1193f, 2.0f, 4.5f, 2.0f)
        curveTo(5.8807f, 2.0f, 7.0f, 3.1193f, 7.0f, 4.5f)
        close()
        moveTo(6.0f, 4.5f)
        curveTo(6.0f, 5.3284f, 5.3284f, 6.0f, 4.5f, 6.0f)
        curveTo(4.3303f, 6.0f, 4.1672f, 5.9718f, 4.0151f, 5.9199f)
        lineTo(3.8141f, 5.8344f)
        curveTo(3.3306f, 5.5853f, 3.0f, 5.0813f, 3.0f, 4.5f)
        curveTo(3.0f, 3.6716f, 3.6716f, 3.0f, 4.5f, 3.0f)
        curveTo(5.3284f, 3.0f, 6.0f, 3.6716f, 6.0f, 4.5f)
        close()
        moveTo(6.0f, 11.5f)
        curveTo(6.0f, 12.3284f, 5.3284f, 13.0f, 4.5f, 13.0f)
        curveTo(3.6716f, 13.0f, 3.0f, 12.3284f, 3.0f, 11.5f)
        curveTo(3.0f, 10.6716f, 3.6716f, 10.0f, 4.5f, 10.0f)
        curveTo(5.3284f, 10.0f, 6.0f, 10.6716f, 6.0f, 11.5f)
        close()
    }
}
.build()
