package org.jetbrains.jewel.icons.allicons.build

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
import org.jetbrains.jewel.icons.allicons.BuildGroup

public val BuildGroup.TaskGroup: IntellijIconData
    get() {
        if (_taskGroup != null) {
            return _taskGroup!!
        }
        _taskGroup = IntellijIconData(name = "TaskGroup",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TaskGroupComposable(it) })
        return _taskGroup!!
    }

private var _taskGroup: IntellijIconData? = null

private fun TaskGroupComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TaskGroup", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
        lineTo(8.5f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(7.3895f)
        curveTo(14.1372f, 6.8269f, 13.1068f, 6.5f, 12.0f, 6.5f)
        curveTo(8.9624f, 6.5f, 6.5f, 8.9624f, 6.5f, 12.0f)
        curveTo(6.5f, 12.7056f, 6.6329f, 13.3801f, 6.8749f, 14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.0382f, 3.0f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(6.8749f)
        curveTo(14.3525f, 7.0126f, 14.6872f, 7.1856f, 15.0f, 7.3895f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(6.8749f)
        curveTo(6.75f, 13.6801f, 6.6542f, 13.3457f, 6.5907f, 13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 13.0f)
        curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
        curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
        curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
        curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.1216f, 15.6756f)
        curveTo(13.0484f, 15.8707f, 12.8619f, 16.0f, 12.6534f, 16.0f)
        horizontalLineTo(11.3464f)
        curveTo(11.138f, 16.0f, 10.9515f, 15.8707f, 10.8783f, 15.6756f)
        lineTo(10.6288f, 15.0102f)
        curveTo(10.5449f, 14.7865f, 10.3143f, 14.6534f, 10.0786f, 14.6926f)
        lineTo(9.3777f, 14.8092f)
        curveTo(9.1721f, 14.8434f, 8.9668f, 14.7464f, 8.8626f, 14.5659f)
        lineTo(8.2091f, 13.4341f)
        curveTo(8.1049f, 13.2536f, 8.1236f, 13.0273f, 8.256f, 12.8664f)
        lineTo(8.7074f, 12.3177f)
        curveTo(8.8593f, 12.1331f, 8.8593f, 11.8669f, 8.7074f, 11.6824f)
        lineTo(8.256f, 11.1336f)
        curveTo(8.1236f, 10.9727f, 8.1049f, 10.7464f, 8.2091f, 10.5659f)
        lineTo(8.8626f, 9.434f)
        curveTo(8.9668f, 9.2535f, 9.172f, 9.1566f, 9.3776f, 9.1908f)
        lineTo(10.0786f, 9.3074f)
        curveTo(10.3143f, 9.3466f, 10.5449f, 9.2135f, 10.6288f, 8.9898f)
        lineTo(10.8783f, 8.3244f)
        curveTo(10.9515f, 8.1293f, 11.138f, 8.0f, 11.3464f, 8.0f)
        horizontalLineTo(12.6534f)
        curveTo(12.8619f, 8.0f, 13.0484f, 8.1293f, 13.1216f, 8.3244f)
        lineTo(13.3711f, 8.9898f)
        curveTo(13.455f, 9.2135f, 13.6856f, 9.3466f, 13.9213f, 9.3074f)
        lineTo(14.6222f, 9.1908f)
        curveTo(14.8278f, 9.1566f, 15.0331f, 9.2535f, 15.1373f, 9.434f)
        lineTo(15.7908f, 10.5659f)
        curveTo(15.895f, 10.7464f, 15.8763f, 10.9727f, 15.7439f, 11.1336f)
        lineTo(15.2925f, 11.6824f)
        curveTo(15.1406f, 11.8669f, 15.1406f, 12.1331f, 15.2925f, 12.3177f)
        lineTo(15.7439f, 12.8664f)
        curveTo(15.8763f, 13.0273f, 15.895f, 13.2536f, 15.7908f, 13.4341f)
        lineTo(15.1373f, 14.5659f)
        curveTo(15.0331f, 14.7464f, 14.8278f, 14.8434f, 14.6222f, 14.8092f)
        lineTo(13.9213f, 14.6926f)
        curveTo(13.6856f, 14.6534f, 13.455f, 14.7865f, 13.3711f, 15.0102f)
        lineTo(13.1216f, 15.6756f)
        close()
        moveTo(11.6929f, 15.0f)
        horizontalLineTo(12.3069f)
        lineTo(12.4348f, 14.6591f)
        curveTo(12.6865f, 13.9878f, 13.3781f, 13.5885f, 14.0854f, 13.7061f)
        lineTo(14.4445f, 13.7659f)
        lineTo(14.7515f, 13.2341f)
        lineTo(14.5202f, 12.953f)
        curveTo(14.0647f, 12.3993f, 14.0647f, 11.6007f, 14.5202f, 11.047f)
        lineTo(14.7515f, 10.7659f)
        lineTo(14.4445f, 10.2341f)
        lineTo(14.0854f, 10.2939f)
        curveTo(13.3781f, 10.4115f, 12.6865f, 10.0122f, 12.4348f, 9.3409f)
        lineTo(12.3069f, 9.0f)
        horizontalLineTo(11.6929f)
        lineTo(11.5651f, 9.3409f)
        curveTo(11.3134f, 10.0122f, 10.6217f, 10.4115f, 9.9145f, 10.2939f)
        lineTo(9.5554f, 10.2341f)
        lineTo(9.2484f, 10.7659f)
        lineTo(9.4797f, 11.047f)
        curveTo(9.9352f, 11.6007f, 9.9352f, 12.3993f, 9.4797f, 12.953f)
        lineTo(9.2484f, 13.2341f)
        lineTo(9.5554f, 13.7659f)
        lineTo(9.9145f, 13.7061f)
        curveTo(10.6217f, 13.5885f, 11.3134f, 13.9878f, 11.5651f, 14.6591f)
        lineTo(11.6929f, 15.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.3069f, 15.0f)
        horizontalLineTo(11.6929f)
        lineTo(11.5651f, 14.6591f)
        curveTo(11.3134f, 13.9878f, 10.6217f, 13.5885f, 9.9145f, 13.7061f)
        lineTo(9.5554f, 13.7659f)
        lineTo(9.2484f, 13.2341f)
        lineTo(9.4797f, 12.953f)
        curveTo(9.9352f, 12.3993f, 9.9352f, 11.6007f, 9.4797f, 11.047f)
        lineTo(9.2484f, 10.7659f)
        lineTo(9.5554f, 10.2341f)
        lineTo(9.9145f, 10.2939f)
        curveTo(10.6217f, 10.4115f, 11.3134f, 10.0122f, 11.5651f, 9.3409f)
        lineTo(11.6929f, 9.0f)
        horizontalLineTo(12.3069f)
        lineTo(12.4348f, 9.3409f)
        curveTo(12.6865f, 10.0122f, 13.3781f, 10.4115f, 14.0854f, 10.2939f)
        lineTo(14.4445f, 10.2341f)
        lineTo(14.7515f, 10.7659f)
        lineTo(14.5202f, 11.047f)
        curveTo(14.0647f, 11.6007f, 14.0647f, 12.3993f, 14.5202f, 12.953f)
        lineTo(14.7515f, 13.2341f)
        lineTo(14.4445f, 13.7659f)
        lineTo(14.0854f, 13.7061f)
        curveTo(13.3781f, 13.5885f, 12.6865f, 13.9878f, 12.4348f, 14.6591f)
        lineTo(12.3069f, 15.0f)
        close()
        moveTo(13.0f, 12.0f)
        curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
        curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
        curveTo(11.0f, 11.4477f, 11.4477f, 11.0f, 12.0f, 11.0f)
        curveTo(12.5523f, 11.0f, 13.0f, 11.4477f, 13.0f, 12.0f)
        close()
    }
}
.build()
