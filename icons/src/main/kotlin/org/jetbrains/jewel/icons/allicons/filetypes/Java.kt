package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Java: IntellijIconData
    get() {
        if (_java != null) {
            return _java!!
        }
        _java = IntellijIconData(name = "Java",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { JavaComposable(it) })
        return _java!!
    }

private var _java: IntellijIconData? = null

private fun JavaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Java",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 13.0f)
        lineTo(13.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 13.5f)
        lineTo(14.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 14.0f)
        lineTo(2.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.orangeFill), stroke = SolidColor(Color(0xFFE66D17)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 3.6f)
        curveTo(2.5f, 3.3117f, 2.5004f, 3.1256f, 2.512f, 2.9839f)
        curveTo(2.5231f, 2.8481f, 2.5419f, 2.7977f, 2.5545f, 2.773f)
        curveTo(2.6024f, 2.6789f, 2.6789f, 2.6024f, 2.773f, 2.5545f)
        curveTo(2.7977f, 2.5419f, 2.8481f, 2.5231f, 2.9839f, 2.512f)
        curveTo(3.1256f, 2.5004f, 3.3117f, 2.5f, 3.6f, 2.5f)
        horizontalLineTo(11.4f)
        curveTo(11.6883f, 2.5f, 11.8744f, 2.5004f, 12.0161f, 2.512f)
        curveTo(12.1519f, 2.5231f, 12.2023f, 2.5419f, 12.227f, 2.5545f)
        curveTo(12.3211f, 2.6024f, 12.3976f, 2.6789f, 12.4455f, 2.773f)
        lineTo(12.8864f, 2.5483f)
        lineTo(12.4455f, 2.773f)
        curveTo(12.4581f, 2.7977f, 12.4769f, 2.8481f, 12.488f, 2.9839f)
        curveTo(12.4996f, 3.1256f, 12.5f, 3.3117f, 12.5f, 3.6f)
        verticalLineTo(6.5f)
        curveTo(12.5f, 7.9319f, 12.4946f, 8.5371f, 12.3493f, 9.016f)
        curveTo(12.01f, 10.1346f, 11.1346f, 11.01f, 10.016f, 11.3493f)
        curveTo(9.5371f, 11.4946f, 8.9319f, 11.5f, 7.5f, 11.5f)
        curveTo(6.0681f, 11.5f, 5.4629f, 11.4946f, 4.984f, 11.3493f)
        curveTo(3.8654f, 11.01f, 2.99f, 10.1346f, 2.6507f, 9.016f)
        curveTo(2.5054f, 8.5371f, 2.5f, 7.9319f, 2.5f, 6.5f)
        verticalLineTo(3.6f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFE66D17)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 2.5f)
        horizontalLineTo(14.5f)
        curveTo(14.7761f, 2.5f, 15.0f, 2.7239f, 15.0f, 3.0f)
        verticalLineTo(4.1812f)
        curveTo(15.0f, 4.7813f, 14.6424f, 5.3236f, 14.0909f, 5.5599f)
        lineTo(12.5f, 6.2417f)
        verticalLineTo(2.5f)
        close()
    }
}
.build()
