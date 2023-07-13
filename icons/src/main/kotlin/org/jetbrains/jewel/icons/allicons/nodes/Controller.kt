package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Controller: IntellijIconData
    get() {
        if (_controller != null) {
            return _controller!!
        }
        _controller = IntellijIconData(name = "Controller",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ControllerComposable(it) })
        return _controller!!
    }

private var _controller: IntellijIconData? = null

private fun ControllerComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Controller", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.8659f, 4.1338f, 14.9998f, 7.9996f, 15.0f)
        curveTo(7.372f, 14.1643f, 7.0f, 13.1256f, 7.0f, 12.0f)
        curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
        curveTo(13.1256f, 7.0f, 14.1643f, 7.372f, 15.0f, 7.9996f)
        curveTo(14.9998f, 4.1338f, 11.8659f, 1.0f, 8.0f, 1.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.4034f, 13.9707f)
        curveTo(4.3698f, 13.6712f, 2.0f, 11.1124f, 2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.1124f, 2.0f, 13.6712f, 4.3698f, 13.9707f, 7.4034f)
        curveTo(14.3387f, 7.5613f, 14.6839f, 7.7622f, 15.0f, 7.9996f)
        curveTo(14.9998f, 4.1338f, 11.8659f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.8659f, 4.1338f, 14.9998f, 7.9996f, 15.0f)
        curveTo(7.7622f, 14.6839f, 7.5613f, 14.3387f, 7.4034f, 13.9707f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.9978f, 13.0f)
        curveTo(12.5501f, 13.0f, 12.9978f, 12.5523f, 12.9978f, 12.0f)
        curveTo(12.9978f, 11.4477f, 12.5501f, 11.0f, 11.9978f, 11.0f)
        curveTo(11.4455f, 11.0f, 10.9978f, 11.4477f, 10.9978f, 12.0f)
        curveTo(10.9978f, 12.5523f, 11.4455f, 13.0f, 11.9978f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.1194f, 15.6756f)
        curveTo(13.0462f, 15.8707f, 12.8597f, 16.0f, 12.6512f, 16.0f)
        horizontalLineTo(11.3442f)
        curveTo(11.1358f, 16.0f, 10.9493f, 15.8707f, 10.8761f, 15.6756f)
        lineTo(10.6266f, 15.0102f)
        curveTo(10.5427f, 14.7865f, 10.3121f, 14.6534f, 10.0764f, 14.6926f)
        lineTo(9.3755f, 14.8092f)
        curveTo(9.1699f, 14.8434f, 8.9646f, 14.7464f, 8.8604f, 14.5659f)
        lineTo(8.2069f, 13.4341f)
        curveTo(8.1027f, 13.2536f, 8.1214f, 13.0273f, 8.2538f, 12.8664f)
        lineTo(8.7052f, 12.3177f)
        curveTo(8.857f, 12.1331f, 8.857f, 11.8669f, 8.7052f, 11.6824f)
        lineTo(8.2538f, 11.1336f)
        curveTo(8.1214f, 10.9727f, 8.1027f, 10.7464f, 8.2069f, 10.5659f)
        lineTo(8.8604f, 9.434f)
        curveTo(8.9646f, 9.2535f, 9.1698f, 9.1566f, 9.3754f, 9.1908f)
        lineTo(10.0764f, 9.3074f)
        curveTo(10.3121f, 9.3466f, 10.5427f, 9.2135f, 10.6266f, 8.9898f)
        lineTo(10.8761f, 8.3244f)
        curveTo(10.9493f, 8.1293f, 11.1358f, 8.0f, 11.3442f, 8.0f)
        horizontalLineTo(12.6512f)
        curveTo(12.8597f, 8.0f, 13.0462f, 8.1293f, 13.1194f, 8.3244f)
        lineTo(13.3689f, 8.9898f)
        curveTo(13.4528f, 9.2135f, 13.6834f, 9.3466f, 13.9191f, 9.3074f)
        lineTo(14.6201f, 9.1908f)
        curveTo(14.8256f, 9.1566f, 15.0309f, 9.2535f, 15.1351f, 9.434f)
        lineTo(15.7886f, 10.5659f)
        curveTo(15.8928f, 10.7464f, 15.8741f, 10.9727f, 15.7417f, 11.1336f)
        lineTo(15.2903f, 11.6824f)
        curveTo(15.1384f, 11.8669f, 15.1384f, 12.1331f, 15.2903f, 12.3177f)
        lineTo(15.7417f, 12.8664f)
        curveTo(15.8741f, 13.0273f, 15.8928f, 13.2536f, 15.7886f, 13.4341f)
        lineTo(15.1351f, 14.5659f)
        curveTo(15.0309f, 14.7464f, 14.8256f, 14.8434f, 14.62f, 14.8092f)
        lineTo(13.9191f, 14.6926f)
        curveTo(13.6834f, 14.6534f, 13.4528f, 14.7865f, 13.3689f, 15.0102f)
        lineTo(13.1194f, 15.6756f)
        close()
        moveTo(11.6907f, 15.0f)
        horizontalLineTo(12.3047f)
        lineTo(12.4326f, 14.6591f)
        curveTo(12.6843f, 13.9878f, 13.3759f, 13.5885f, 14.0832f, 13.7061f)
        lineTo(14.4423f, 13.7659f)
        lineTo(14.7493f, 13.2341f)
        lineTo(14.518f, 12.953f)
        curveTo(14.0625f, 12.3993f, 14.0625f, 11.6007f, 14.518f, 11.047f)
        lineTo(14.7493f, 10.7659f)
        lineTo(14.4423f, 10.2341f)
        lineTo(14.0832f, 10.2939f)
        curveTo(13.3759f, 10.4115f, 12.6843f, 10.0122f, 12.4326f, 9.3409f)
        lineTo(12.3047f, 9.0f)
        horizontalLineTo(11.6907f)
        lineTo(11.5629f, 9.3409f)
        curveTo(11.3112f, 10.0122f, 10.6195f, 10.4115f, 9.9123f, 10.2939f)
        lineTo(9.5532f, 10.2341f)
        lineTo(9.2462f, 10.7659f)
        lineTo(9.4775f, 11.047f)
        curveTo(9.933f, 11.6007f, 9.933f, 12.3993f, 9.4775f, 12.953f)
        lineTo(9.2462f, 13.2341f)
        lineTo(9.5532f, 13.7659f)
        lineTo(9.9123f, 13.7061f)
        curveTo(10.6195f, 13.5885f, 11.3112f, 13.9878f, 11.5629f, 14.6591f)
        lineTo(11.6907f, 15.0f)
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
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.7871f, 8.0f)
        curveTo(4.7871f, 9.1413f, 5.2487f, 10.1168f, 6.0f, 10.7458f)
        curveTo(6.3045f, 11.0008f, 6.6566f, 11.1984f, 7.0448f, 11.3275f)
        curveTo(7.0875f, 11.0105f, 7.1598f, 10.7028f, 7.259f, 10.4075f)
        curveTo(6.3931f, 10.049f, 5.827f, 9.1505f, 5.827f, 8.0f)
        curveTo(5.827f, 6.4966f, 6.7933f, 5.4233f, 8.1324f, 5.4233f)
        curveTo(8.3449f, 5.4233f, 8.5482f, 5.4483f, 8.7394f, 5.495f)
        curveTo(9.2807f, 5.6271f, 9.7251f, 5.9331f, 10.0085f, 6.3382f)
        lineTo(10.7532f, 5.7233f)
        curveTo(10.3764f, 5.2281f, 9.8248f, 4.8529f, 9.1817f, 4.6555f)
        curveTo(8.8523f, 4.5544f, 8.4988f, 4.5f, 8.1324f, 4.5f)
        curveTo(6.2132f, 4.5f, 4.7871f, 5.9938f, 4.7871f, 8.0f)
        close()
    }
}
.build()
