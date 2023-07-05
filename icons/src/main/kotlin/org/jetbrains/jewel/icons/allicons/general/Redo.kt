package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Redo: IntellijIconData
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = IntellijIconData(imageVector = { RedoComposable(it) })
        return _redo!!
    }

private var _redo: IntellijIconData? = null

private fun RedoComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Redo",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 10.5f)
        curveTo(1.0f, 10.7761f, 1.2239f, 11.0f, 1.5f, 11.0f)
        curveTo(1.7761f, 11.0f, 2.0f, 10.7761f, 2.0f, 10.5f)
        horizontalLineTo(1.0f)
        close()
        moveTo(13.6263f, 10.3322f)
        curveTo(13.8098f, 10.5386f, 14.1258f, 10.5572f, 14.3322f, 10.3737f)
        curveTo(14.5386f, 10.1902f, 14.5572f, 9.8742f, 14.3737f, 9.6678f)
        lineTo(13.6263f, 10.3322f)
        close()
        moveTo(11.5f, 10.0f)
        curveTo(11.2239f, 10.0f, 11.0f, 10.2238f, 11.0f, 10.5f)
        curveTo(11.0f, 10.7761f, 11.2239f, 11.0f, 11.5f, 11.0f)
        verticalLineTo(10.0f)
        close()
        moveTo(14.5f, 10.5f)
        verticalLineTo(11.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(10.5f)
        horizontalLineTo(14.5f)
        close()
        moveTo(15.0f, 7.5f)
        curveTo(15.0f, 7.2238f, 14.7761f, 7.0f, 14.5f, 7.0f)
        curveTo(14.2239f, 7.0f, 14.0f, 7.2238f, 14.0f, 7.5f)
        horizontalLineTo(15.0f)
        close()
        moveTo(1.5f, 10.5f)
        curveTo(2.0f, 10.5f, 2.0f, 10.5002f, 2.0f, 10.5004f)
        curveTo(2.0f, 10.5005f, 2.0f, 10.5007f, 2.0f, 10.5008f)
        curveTo(2.0f, 10.5009f, 2.0f, 10.501f, 2.0f, 10.5011f)
        curveTo(2.0f, 10.5011f, 2.0f, 10.5009f, 2.0f, 10.5003f)
        curveTo(2.0f, 10.4993f, 2.0f, 10.4971f, 2.0001f, 10.4937f)
        curveTo(2.0002f, 10.487f, 2.0004f, 10.4759f, 2.0009f, 10.4605f)
        curveTo(2.002f, 10.4298f, 2.0041f, 10.3824f, 2.0085f, 10.3208f)
        curveTo(2.0173f, 10.1974f, 2.0352f, 10.0178f, 2.0713f, 9.801f)
        curveTo(2.144f, 9.365f, 2.2884f, 8.7913f, 2.5722f, 8.2236f)
        curveTo(2.8551f, 7.6579f, 3.2715f, 7.1075f, 3.8867f, 6.6973f)
        curveTo(4.4988f, 6.2892f, 5.3375f, 6.0f, 6.5f, 6.0f)
        verticalLineTo(5.0f)
        curveTo(5.1625f, 5.0f, 4.1262f, 5.3358f, 3.332f, 5.8652f)
        curveTo(2.541f, 6.3925f, 2.0199f, 7.0921f, 1.6778f, 7.7764f)
        curveTo(1.3366f, 8.4587f, 1.1685f, 9.135f, 1.0849f, 9.6365f)
        curveTo(1.0429f, 9.8885f, 1.0217f, 10.0995f, 1.011f, 10.2495f)
        curveTo(1.0057f, 10.3246f, 1.0029f, 10.3847f, 1.0015f, 10.4272f)
        curveTo(1.0008f, 10.4485f, 1.0004f, 10.4654f, 1.0002f, 10.4776f)
        curveTo(1.0001f, 10.4837f, 1.0001f, 10.4887f, 1.0f, 10.4924f)
        curveTo(1.0f, 10.4943f, 1.0f, 10.4959f, 1.0f, 10.4971f)
        curveTo(1.0f, 10.4978f, 1.0f, 10.4983f, 1.0f, 10.4988f)
        curveTo(1.0f, 10.499f, 1.0f, 10.4993f, 1.0f, 10.4995f)
        curveTo(1.0f, 10.4997f, 1.0f, 10.5f, 1.5f, 10.5f)
        close()
        moveTo(6.5f, 6.0f)
        curveTo(8.0682f, 6.0f, 9.8262f, 7.0261f, 11.2543f, 8.1438f)
        curveTo(11.9546f, 8.6918f, 12.5497f, 9.241f, 12.97f, 9.6537f)
        curveTo(13.1799f, 9.8597f, 13.3454f, 10.0309f, 13.4578f, 10.15f)
        curveTo(13.514f, 10.2094f, 13.5568f, 10.2558f, 13.5853f, 10.287f)
        curveTo(13.5995f, 10.3025f, 13.6102f, 10.3142f, 13.617f, 10.3219f)
        curveTo(13.6205f, 10.3257f, 13.623f, 10.3285f, 13.6245f, 10.3302f)
        curveTo(13.6253f, 10.3311f, 13.6258f, 10.3317f, 13.6261f, 10.332f)
        curveTo(13.6263f, 10.3322f, 13.6264f, 10.3323f, 13.6264f, 10.3323f)
        curveTo(13.6264f, 10.3323f, 13.6264f, 10.3323f, 13.6264f, 10.3323f)
        curveTo(13.6264f, 10.3322f, 13.6263f, 10.3322f, 14.0f, 10.0f)
        curveTo(14.3737f, 9.6678f, 14.3736f, 9.6677f, 14.3735f, 9.6676f)
        curveTo(14.3735f, 9.6676f, 14.3733f, 9.6674f, 14.3732f, 9.6673f)
        curveTo(14.373f, 9.6671f, 14.3727f, 9.6667f, 14.3724f, 9.6664f)
        curveTo(14.3717f, 9.6656f, 14.3708f, 9.6646f, 14.3696f, 9.6633f)
        curveTo(14.3673f, 9.6607f, 14.364f, 9.657f, 14.3598f, 9.6523f)
        curveTo(14.3513f, 9.6429f, 14.3391f, 9.6294f, 14.3231f, 9.612f)
        curveTo(14.2913f, 9.5772f, 14.2448f, 9.5269f, 14.1848f, 9.4633f)
        curveTo(14.0648f, 9.3363f, 13.8904f, 9.1559f, 13.6706f, 8.9401f)
        curveTo(13.2315f, 8.509f, 12.6079f, 7.9332f, 11.8707f, 7.3562f)
        curveTo(10.4238f, 6.2239f, 8.4318f, 5.0f, 6.5f, 5.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(11.5f, 11.0f)
        horizontalLineTo(14.5f)
        verticalLineTo(10.0f)
        horizontalLineTo(11.5f)
        verticalLineTo(11.0f)
        close()
        moveTo(15.0f, 10.5f)
        verticalLineTo(7.5f)
        horizontalLineTo(14.0f)
        verticalLineTo(10.5f)
        horizontalLineTo(15.0f)
        close()
    }
}
.build()
