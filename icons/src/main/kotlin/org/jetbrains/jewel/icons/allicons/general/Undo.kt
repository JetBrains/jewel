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

public val GeneralGroup.Undo: IntellijIconData
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = IntellijIconData(imageVector = { UndoComposable(it) })
        return _undo!!
    }

private var _undo: IntellijIconData? = null

private fun UndoComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Undo",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.6263f, 9.6678f)
        curveTo(1.4429f, 9.8742f, 1.4614f, 10.1902f, 1.6679f, 10.3737f)
        curveTo(1.8742f, 10.5572f, 2.1903f, 10.5386f, 2.3737f, 10.3322f)
        lineTo(1.6263f, 9.6678f)
        close()
        moveTo(14.0f, 10.5f)
        curveTo(14.0f, 10.7761f, 14.2239f, 11.0f, 14.5f, 11.0f)
        curveTo(14.7761f, 11.0f, 15.0f, 10.7761f, 15.0f, 10.5f)
        horizontalLineTo(14.0f)
        close()
        moveTo(2.0f, 7.5f)
        curveTo(2.0f, 7.2239f, 1.7761f, 7.0f, 1.5f, 7.0f)
        curveTo(1.2239f, 7.0f, 1.0f, 7.2239f, 1.0f, 7.5f)
        horizontalLineTo(2.0f)
        close()
        moveTo(1.5f, 10.5f)
        horizontalLineTo(1.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(1.5f)
        verticalLineTo(10.5f)
        close()
        moveTo(4.5f, 11.0f)
        curveTo(4.7761f, 11.0f, 5.0f, 10.7761f, 5.0f, 10.5f)
        curveTo(5.0f, 10.2239f, 4.7761f, 10.0f, 4.5f, 10.0f)
        verticalLineTo(11.0f)
        close()
        moveTo(2.0f, 10.0f)
        curveTo(2.3737f, 10.3322f, 2.3737f, 10.3322f, 2.3736f, 10.3323f)
        curveTo(2.3736f, 10.3323f, 2.3736f, 10.3323f, 2.3736f, 10.3323f)
        curveTo(2.3737f, 10.3323f, 2.3737f, 10.3322f, 2.3739f, 10.332f)
        curveTo(2.3742f, 10.3317f, 2.3747f, 10.3311f, 2.3755f, 10.3302f)
        curveTo(2.377f, 10.3285f, 2.3795f, 10.3257f, 2.383f, 10.3219f)
        curveTo(2.3899f, 10.3142f, 2.4005f, 10.3025f, 2.4147f, 10.287f)
        curveTo(2.4432f, 10.2558f, 2.4861f, 10.2094f, 2.5422f, 10.15f)
        curveTo(2.6547f, 10.0309f, 2.8202f, 9.8597f, 3.03f, 9.6537f)
        curveTo(3.4503f, 9.241f, 4.0455f, 8.6918f, 4.7457f, 8.1438f)
        curveTo(6.1738f, 7.0261f, 7.9318f, 6.0f, 9.5f, 6.0f)
        verticalLineTo(5.0f)
        curveTo(7.5683f, 5.0f, 5.5762f, 6.2239f, 4.1294f, 7.3562f)
        curveTo(3.3921f, 7.9332f, 2.7685f, 8.509f, 2.3294f, 8.9401f)
        curveTo(2.1096f, 9.1559f, 1.9352f, 9.3363f, 1.8152f, 9.4633f)
        curveTo(1.7552f, 9.5269f, 1.7087f, 9.5772f, 1.6769f, 9.612f)
        curveTo(1.661f, 9.6294f, 1.6487f, 9.6429f, 1.6402f, 9.6523f)
        curveTo(1.636f, 9.657f, 1.6327f, 9.6607f, 1.6304f, 9.6633f)
        curveTo(1.6292f, 9.6646f, 1.6283f, 9.6656f, 1.6276f, 9.6664f)
        curveTo(1.6273f, 9.6667f, 1.627f, 9.6671f, 1.6268f, 9.6673f)
        curveTo(1.6267f, 9.6674f, 1.6266f, 9.6676f, 1.6265f, 9.6676f)
        curveTo(1.6264f, 9.6677f, 1.6263f, 9.6678f, 2.0f, 10.0f)
        close()
        moveTo(9.5f, 6.0f)
        curveTo(10.6625f, 6.0f, 11.5012f, 6.2892f, 12.1133f, 6.6973f)
        curveTo(12.7285f, 7.1075f, 13.1449f, 7.6579f, 13.4278f, 8.2236f)
        curveTo(13.7116f, 8.7913f, 13.856f, 9.3649f, 13.9287f, 9.801f)
        curveTo(13.9648f, 10.0178f, 13.9827f, 10.1974f, 13.9915f, 10.3208f)
        curveTo(13.9959f, 10.3824f, 13.998f, 10.4298f, 13.9991f, 10.4605f)
        curveTo(13.9996f, 10.4759f, 13.9998f, 10.487f, 13.9999f, 10.4937f)
        curveTo(14.0f, 10.4971f, 14.0f, 10.4993f, 14.0f, 10.5003f)
        curveTo(14.0f, 10.5009f, 14.0f, 10.5011f, 14.0f, 10.5011f)
        curveTo(14.0f, 10.501f, 14.0f, 10.5009f, 14.0f, 10.5008f)
        curveTo(14.0f, 10.5007f, 14.0f, 10.5005f, 14.0f, 10.5004f)
        curveTo(14.0f, 10.5002f, 14.0f, 10.5f, 14.5f, 10.5f)
        curveTo(15.0f, 10.5f, 15.0f, 10.4997f, 15.0f, 10.4995f)
        curveTo(15.0f, 10.4993f, 15.0f, 10.499f, 15.0f, 10.4988f)
        curveTo(15.0f, 10.4983f, 15.0f, 10.4978f, 15.0f, 10.4971f)
        curveTo(15.0f, 10.4959f, 15.0f, 10.4943f, 15.0f, 10.4924f)
        curveTo(14.9999f, 10.4887f, 14.9999f, 10.4837f, 14.9998f, 10.4776f)
        curveTo(14.9996f, 10.4654f, 14.9992f, 10.4485f, 14.9985f, 10.4272f)
        curveTo(14.9971f, 10.3847f, 14.9943f, 10.3246f, 14.989f, 10.2495f)
        curveTo(14.9782f, 10.0995f, 14.9571f, 9.8885f, 14.9151f, 9.6365f)
        curveTo(14.8315f, 9.1351f, 14.6634f, 8.4587f, 14.3222f, 7.7764f)
        curveTo(13.9801f, 7.0921f, 13.459f, 6.3925f, 12.668f, 5.8652f)
        curveTo(11.8739f, 5.3358f, 10.8375f, 5.0f, 9.5f, 5.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(1.0f, 7.5f)
        verticalLineTo(10.5f)
        horizontalLineTo(2.0f)
        verticalLineTo(7.5f)
        horizontalLineTo(1.0f)
        close()
        moveTo(1.5f, 11.0f)
        horizontalLineTo(4.5f)
        verticalLineTo(10.0f)
        horizontalLineTo(1.5f)
        verticalLineTo(11.0f)
        close()
    }
}
.build()
