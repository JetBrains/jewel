package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.LombokConfig: IntellijIconData
    get() {
        if (_lombokConfig != null) {
            return _lombokConfig!!
        }
        _lombokConfig = IntellijIconData(name = "LombokConfig",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { LombokConfigComposable(it) })
        return _lombokConfig!!
    }

private var _lombokConfig: IntellijIconData? = null

private fun LombokConfigComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "LombokConfig", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFFB62233)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(7.0534f, 12.7336f)
            curveTo(7.0182f, 12.4942f, 7.0f, 12.2492f, 7.0f, 12.0f)
            curveTo(7.0f, 11.5869f, 7.0501f, 11.1855f, 7.1446f, 10.8015f)
            curveTo(5.5932f, 10.329f, 4.9222f, 8.9233f, 4.6079f, 6.9825f)
            curveTo(3.941f, 2.8677f, -0.4291f, 3.2981f, 0.5878f, 8.1365f)
            curveTo(0.5878f, 8.2502f, 2.8493f, 12.2569f, 7.0534f, 12.7336f)
            close()
        }
        path(fill = SolidColor(Color(0xFF8FC942)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(1.6568f, 4.5091f)
            curveTo(1.392f, 0.8862f, 3.1656f, 0.2004f, 3.1656f, 0.2004f)
            curveTo(3.1419f, 0.1862f, 3.4162f, 0.5457f, 3.4162f, 0.5457f)
            curveTo(3.4352f, 0.541f, 2.1109f, 1.1984f, 2.6501f, 4.4239f)
            curveTo(2.4845f, 4.3719f, 1.7704f, 4.3246f, 1.6568f, 4.5091f)
            close()
        }
        path(fill = SolidColor(Color(0xFF8FC942)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(1.7515f, 3.828f)
            lineTo(1.7609f, 4.4428f)
            curveTo(1.7988f, 4.4097f, 2.267f, 4.2868f, 2.4798f, 4.3151f)
            curveTo(2.4751f, 4.3151f, 2.3994f, 3.7429f, 2.3994f, 3.7429f)
            lineTo(1.7515f, 3.828f)
            close()
        }
        path(fill = SolidColor(Color(0xFFE79EA5)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(4.6983f, 11.6747f)
            curveTo(3.5774f, 11.353f, 0.8863f, 9.0356f, 0.8721f, 7.1532f)
            curveTo(0.9998f, 3.4972f, 2.8632f, 4.5566f, 1.6524f, 6.8789f)
            curveTo(0.8295f, 8.1322f, 3.1848f, 10.7524f, 4.6983f, 11.6747f)
            close()
        }
        path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(2.9387f, 6.2496f)
            curveTo(2.8772f, 5.6253f, 2.4232f, 5.5874f, 2.4563f, 6.2969f)
            curveTo(2.4705f, 7.0773f, 3.0239f, 7.1009f, 2.9435f, 6.2969f)
            curveTo(2.9435f, 6.2969f, 2.934f, 6.2543f, 2.9387f, 6.2496f)
            close()
        }
        path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(3.771f, 6.2779f)
            curveTo(3.7143f, 5.6063f, 3.2508f, 5.4644f, 3.317f, 6.3158f)
            curveTo(3.3548f, 7.0394f, 3.8231f, 7.0441f, 3.771f, 6.2827f)
            lineTo(3.771f, 6.2779f)
            close()
        }
        path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(1.917f, 7.3657f)
            curveTo(2.3143f, 9.0258f, 4.1825f, 8.8224f, 4.9629f, 8.761f)
            curveTo(4.9582f, 8.7893f, 4.6507f, 7.413f, 4.6697f, 7.3042f)
            curveTo(4.6791f, 7.4414f, 3.3548f, 7.4934f, 3.1278f, 7.5265f)
            curveTo(2.8393f, 7.5833f, 1.813f, 7.134f, 1.917f, 7.3657f)
            close()
        }
        path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(1.9031f, 7.3752f)
            curveTo(1.9694f, 7.6069f, 1.8322f, 7.484f, 2.7356f, 7.7299f)
            curveTo(3.1376f, 7.834f, 3.4024f, 7.711f, 4.2679f, 7.6637f)
            curveTo(4.2632f, 7.6921f, 4.2207f, 7.5644f, 4.2017f, 7.4272f)
            curveTo(4.1166f, 7.4745f, 3.3504f, 7.5076f, 3.095f, 7.5218f)
            curveTo(2.8018f, 7.5833f, 1.8369f, 7.1387f, 1.9031f, 7.3752f)
            close()
        }
        path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(3.8137f, 7.8387f)
            lineTo(4.4286f, 7.8292f)
            lineTo(4.3482f, 7.6116f)
            lineTo(4.9772f, 7.5313f)
            lineTo(5.2705f, 8.5812f)
            lineTo(4.5279f, 8.6474f)
            curveTo(4.4901f, 8.6616f, 3.6955f, 7.8765f, 3.8137f, 7.8387f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(11.998f, 13.0f)
            curveTo(12.5503f, 13.0f, 12.998f, 12.5523f, 12.998f, 12.0f)
            curveTo(12.998f, 11.4477f, 12.5503f, 11.0f, 11.998f, 11.0f)
            curveTo(11.4458f, 11.0f, 10.998f, 11.4477f, 10.998f, 12.0f)
            curveTo(10.998f, 12.5523f, 11.4458f, 13.0f, 11.998f, 13.0f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(13.1197f, 15.6756f)
            curveTo(13.0465f, 15.8707f, 12.8599f, 16.0f, 12.6515f, 16.0f)
            horizontalLineTo(11.3445f)
            curveTo(11.1361f, 16.0f, 10.9495f, 15.8707f, 10.8763f, 15.6756f)
            lineTo(10.6268f, 15.0102f)
            curveTo(10.5429f, 14.7865f, 10.3124f, 14.6534f, 10.0766f, 14.6926f)
            lineTo(9.3757f, 14.8092f)
            curveTo(9.1701f, 14.8434f, 8.9649f, 14.7464f, 8.8607f, 14.5659f)
            lineTo(8.2072f, 13.4341f)
            curveTo(8.1029f, 13.2536f, 8.1216f, 13.0273f, 8.254f, 12.8664f)
            lineTo(8.7055f, 12.3177f)
            curveTo(8.8573f, 12.1331f, 8.8573f, 11.8669f, 8.7055f, 11.6824f)
            lineTo(8.254f, 11.1336f)
            curveTo(8.1216f, 10.9727f, 8.1029f, 10.7464f, 8.2071f, 10.5659f)
            lineTo(8.8606f, 9.434f)
            curveTo(8.9648f, 9.2535f, 9.1701f, 9.1566f, 9.3757f, 9.1908f)
            lineTo(10.0766f, 9.3074f)
            curveTo(10.3124f, 9.3466f, 10.5429f, 9.2135f, 10.6268f, 8.9898f)
            lineTo(10.8763f, 8.3244f)
            curveTo(10.9495f, 8.1293f, 11.1361f, 8.0f, 11.3445f, 8.0f)
            horizontalLineTo(12.6515f)
            curveTo(12.8599f, 8.0f, 13.0465f, 8.1293f, 13.1197f, 8.3244f)
            lineTo(13.3691f, 8.9898f)
            curveTo(13.4531f, 9.2135f, 13.6836f, 9.3466f, 13.9194f, 9.3074f)
            lineTo(14.6203f, 9.1908f)
            curveTo(14.8259f, 9.1566f, 15.0311f, 9.2535f, 15.1354f, 9.434f)
            lineTo(15.7888f, 10.5659f)
            curveTo(15.8931f, 10.7464f, 15.8744f, 10.9727f, 15.742f, 11.1336f)
            lineTo(15.2905f, 11.6824f)
            curveTo(15.1387f, 11.8669f, 15.1387f, 12.1331f, 15.2905f, 12.3177f)
            lineTo(15.7419f, 12.8664f)
            curveTo(15.8744f, 13.0273f, 15.893f, 13.2536f, 15.7888f, 13.4341f)
            lineTo(15.1353f, 14.5659f)
            curveTo(15.0311f, 14.7464f, 14.8259f, 14.8434f, 14.6203f, 14.8092f)
            lineTo(13.9194f, 14.6926f)
            curveTo(13.6836f, 14.6534f, 13.4531f, 14.7865f, 13.3691f, 15.0102f)
            lineTo(13.1197f, 15.6756f)
            close()
            moveTo(11.691f, 15.0f)
            horizontalLineTo(12.305f)
            lineTo(12.4328f, 14.6591f)
            curveTo(12.6846f, 13.9878f, 13.3762f, 13.5885f, 14.0834f, 13.7061f)
            lineTo(14.4426f, 13.7659f)
            lineTo(14.7496f, 13.2341f)
            lineTo(14.5183f, 12.953f)
            curveTo(14.0628f, 12.3993f, 14.0628f, 11.6007f, 14.5183f, 11.047f)
            lineTo(14.7496f, 10.7659f)
            lineTo(14.4426f, 10.2341f)
            lineTo(14.0834f, 10.2939f)
            curveTo(13.3762f, 10.4115f, 12.6846f, 10.0122f, 12.4328f, 9.3409f)
            lineTo(12.305f, 9.0f)
            horizontalLineTo(11.691f)
            lineTo(11.5632f, 9.3409f)
            curveTo(11.3114f, 10.0122f, 10.6198f, 10.4115f, 9.9125f, 10.2939f)
            lineTo(9.5534f, 10.2341f)
            lineTo(9.2464f, 10.7659f)
            lineTo(9.4777f, 11.047f)
            curveTo(9.9332f, 11.6007f, 9.9332f, 12.3993f, 9.4777f, 12.953f)
            lineTo(9.2464f, 13.2341f)
            lineTo(9.5534f, 13.7659f)
            lineTo(9.9125f, 13.7061f)
            curveTo(10.6198f, 13.5885f, 11.3114f, 13.9878f, 11.5632f, 14.6591f)
            lineTo(11.691f, 15.0f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(12.3086f, 15.0f)
            horizontalLineTo(11.6946f)
            lineTo(11.5668f, 14.6591f)
            curveTo(11.315f, 13.9878f, 10.6234f, 13.5885f, 9.9161f, 13.7061f)
            lineTo(9.557f, 13.7659f)
            lineTo(9.25f, 13.2341f)
            lineTo(9.4813f, 12.953f)
            curveTo(9.9368f, 12.3993f, 9.9368f, 11.6007f, 9.4813f, 11.047f)
            lineTo(9.25f, 10.7659f)
            lineTo(9.557f, 10.2341f)
            lineTo(9.9161f, 10.2939f)
            curveTo(10.6234f, 10.4115f, 11.315f, 10.0122f, 11.5668f, 9.3409f)
            lineTo(11.6946f, 9.0f)
            horizontalLineTo(12.3086f)
            lineTo(12.4364f, 9.3409f)
            curveTo(12.6882f, 10.0122f, 13.3798f, 10.4115f, 14.087f, 10.2939f)
            lineTo(14.4462f, 10.2341f)
            lineTo(14.7532f, 10.7659f)
            lineTo(14.5219f, 11.047f)
            curveTo(14.0664f, 11.6007f, 14.0664f, 12.3993f, 14.5219f, 12.953f)
            lineTo(14.7532f, 13.2341f)
            lineTo(14.4462f, 13.7659f)
            lineTo(14.087f, 13.7061f)
            curveTo(13.3798f, 13.5885f, 12.6882f, 13.9878f, 12.4364f, 14.6591f)
            lineTo(12.3086f, 15.0f)
            close()
            moveTo(13.0016f, 12.0f)
            curveTo(13.0016f, 12.5523f, 12.5539f, 13.0f, 12.0016f, 13.0f)
            curveTo(11.4494f, 13.0f, 11.0016f, 12.5523f, 11.0016f, 12.0f)
            curveTo(11.0016f, 11.4477f, 11.4494f, 11.0f, 12.0016f, 11.0f)
            curveTo(12.5539f, 11.0f, 13.0016f, 11.4477f, 13.0016f, 12.0f)
            close()
        }
    }
}
.build()
