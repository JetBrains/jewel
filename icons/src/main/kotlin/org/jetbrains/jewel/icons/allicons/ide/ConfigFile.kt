package org.jetbrains.jewel.icons.allicons.ide

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
import org.jetbrains.jewel.icons.allicons.IdeGroup

public val IdeGroup.ConfigFile: IntellijIconData
    get() {
        if (_configFile != null) {
            return _configFile!!
        }
        _configFile = IntellijIconData(imageVector = { ConfigFileComposable(it) })
        return _configFile!!
    }

private var _configFile: IntellijIconData? = null

private fun ConfigFileComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ConfigFile", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.9976f, 13.0f)
        curveTo(12.5498f, 13.0f, 12.9976f, 12.5523f, 12.9976f, 12.0f)
        curveTo(12.9976f, 11.4477f, 12.5498f, 11.0f, 11.9976f, 11.0f)
        curveTo(11.4453f, 11.0f, 10.9976f, 11.4477f, 10.9976f, 12.0f)
        curveTo(10.9976f, 12.5523f, 11.4453f, 13.0f, 11.9976f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.1192f, 15.6756f)
        curveTo(13.046f, 15.8707f, 12.8594f, 16.0f, 12.651f, 16.0f)
        horizontalLineTo(11.344f)
        curveTo(11.1356f, 16.0f, 10.949f, 15.8707f, 10.8758f, 15.6756f)
        lineTo(10.6263f, 15.0102f)
        curveTo(10.5424f, 14.7865f, 10.3119f, 14.6534f, 10.0761f, 14.6926f)
        lineTo(9.3752f, 14.8092f)
        curveTo(9.1696f, 14.8434f, 8.9644f, 14.7464f, 8.8602f, 14.5659f)
        lineTo(8.2067f, 13.4341f)
        curveTo(8.1025f, 13.2536f, 8.1211f, 13.0273f, 8.2535f, 12.8664f)
        lineTo(8.705f, 12.3177f)
        curveTo(8.8568f, 12.1331f, 8.8568f, 11.8669f, 8.705f, 11.6824f)
        lineTo(8.2535f, 11.1336f)
        curveTo(8.1211f, 10.9727f, 8.1024f, 10.7464f, 8.2066f, 10.5659f)
        lineTo(8.8601f, 9.434f)
        curveTo(8.9643f, 9.2535f, 9.1696f, 9.1566f, 9.3752f, 9.1908f)
        lineTo(10.0761f, 9.3074f)
        curveTo(10.3119f, 9.3466f, 10.5424f, 9.2135f, 10.6263f, 8.9898f)
        lineTo(10.8758f, 8.3244f)
        curveTo(10.949f, 8.1293f, 11.1356f, 8.0f, 11.344f, 8.0f)
        horizontalLineTo(12.651f)
        curveTo(12.8594f, 8.0f, 13.046f, 8.1293f, 13.1192f, 8.3244f)
        lineTo(13.3687f, 8.9898f)
        curveTo(13.4526f, 9.2135f, 13.6831f, 9.3466f, 13.9189f, 9.3074f)
        lineTo(14.6198f, 9.1908f)
        curveTo(14.8254f, 9.1566f, 15.0307f, 9.2535f, 15.1349f, 9.434f)
        lineTo(15.7884f, 10.5659f)
        curveTo(15.8926f, 10.7464f, 15.8739f, 10.9727f, 15.7415f, 11.1336f)
        lineTo(15.29f, 11.6824f)
        curveTo(15.1382f, 11.8669f, 15.1382f, 12.1331f, 15.29f, 12.3177f)
        lineTo(15.7415f, 12.8664f)
        curveTo(15.8739f, 13.0273f, 15.8926f, 13.2536f, 15.7883f, 13.4341f)
        lineTo(15.1348f, 14.5659f)
        curveTo(15.0306f, 14.7464f, 14.8254f, 14.8434f, 14.6198f, 14.8092f)
        lineTo(13.9189f, 14.6926f)
        curveTo(13.6831f, 14.6534f, 13.4526f, 14.7865f, 13.3687f, 15.0102f)
        lineTo(13.1192f, 15.6756f)
        close()
        moveTo(11.6905f, 15.0f)
        horizontalLineTo(12.3045f)
        lineTo(12.4323f, 14.6591f)
        curveTo(12.6841f, 13.9878f, 13.3757f, 13.5885f, 14.0829f, 13.7061f)
        lineTo(14.4421f, 13.7659f)
        lineTo(14.7491f, 13.2341f)
        lineTo(14.5178f, 12.953f)
        curveTo(14.0623f, 12.3993f, 14.0623f, 11.6007f, 14.5178f, 11.047f)
        lineTo(14.7491f, 10.7659f)
        lineTo(14.4421f, 10.2341f)
        lineTo(14.0829f, 10.2939f)
        curveTo(13.3757f, 10.4115f, 12.6841f, 10.0122f, 12.4323f, 9.3409f)
        lineTo(12.3045f, 9.0f)
        horizontalLineTo(11.6905f)
        lineTo(11.5627f, 9.3409f)
        curveTo(11.3109f, 10.0122f, 10.6193f, 10.4115f, 9.9121f, 10.2939f)
        lineTo(9.5529f, 10.2341f)
        lineTo(9.2459f, 10.7659f)
        lineTo(9.4772f, 11.047f)
        curveTo(9.9327f, 11.6007f, 9.9327f, 12.3993f, 9.4772f, 12.953f)
        lineTo(9.2459f, 13.2341f)
        lineTo(9.5529f, 13.7659f)
        lineTo(9.9121f, 13.7061f)
        curveTo(10.6193f, 13.5885f, 11.3109f, 13.9878f, 11.5627f, 14.6591f)
        lineTo(11.6905f, 15.0f)
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
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.0f, 13.0f)
        verticalLineTo(5.4142f)
        curveTo(3.0f, 5.149f, 3.1054f, 4.8946f, 3.2929f, 4.7071f)
        lineTo(6.7071f, 1.2929f)
        curveTo(6.8946f, 1.1054f, 7.149f, 1.0f, 7.4142f, 1.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 1.0f, 13.0f, 1.8954f, 13.0f, 3.0f)
        verticalLineTo(7.1f)
        curveTo(12.6769f, 7.0344f, 12.3425f, 7.0f, 12.0f, 7.0f)
        verticalLineTo(3.0f)
        curveTo(12.0f, 2.4477f, 11.5523f, 2.0f, 11.0f, 2.0f)
        lineTo(8.0f, 2.0f)
        verticalLineTo(4.0f)
        curveTo(8.0f, 5.1046f, 7.1046f, 6.0f, 6.0f, 6.0f)
        horizontalLineTo(4.0f)
        lineTo(4.0f, 13.0f)
        curveTo(4.0f, 13.5523f, 4.4477f, 14.0f, 5.0f, 14.0f)
        horizontalLineTo(7.416f)
        curveTo(7.572f, 14.357f, 7.7685f, 14.6923f, 7.9996f, 15.0f)
        horizontalLineTo(5.0f)
        curveTo(3.8954f, 15.0f, 3.0f, 14.1046f, 3.0f, 13.0f)
        close()
        moveTo(4.4142f, 5.0f)
        lineTo(7.0f, 2.4142f)
        verticalLineTo(4.0f)
        curveTo(7.0f, 4.5523f, 6.5523f, 5.0f, 6.0f, 5.0f)
        horizontalLineTo(4.4142f)
        close()
    }
}
.build()
