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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.RestartDebug_stroke: IntellijIconData
    get() {
        if (_restartDebug_stroke != null) {
            return _restartDebug_stroke!!
        }
        _restartDebug_stroke = IntellijIconData(name = "RestartDebug_stroke",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { RestartDebug_strokeComposable(it) })
        return _restartDebug_stroke!!
    }

private var _restartDebug_stroke: IntellijIconData? = null

private fun RestartDebug_strokeComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "RestartDebug_stroke", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.9f, 0.0f)
        curveTo(12.3143f, 0.0f, 12.65f, 0.3358f, 12.65f, 0.75f)
        verticalLineTo(4.75f)
        verticalLineTo(5.5f)
        horizontalLineTo(11.9f)
        horizontalLineTo(7.9f)
        curveTo(7.4858f, 5.5f, 7.15f, 5.1642f, 7.15f, 4.75f)
        curveTo(7.15f, 4.3358f, 7.4858f, 4.0f, 7.9f, 4.0f)
        horizontalLineTo(10.1642f)
        curveTo(9.2969f, 3.0758f, 8.0656f, 2.5f, 6.7f, 2.5f)
        curveTo(4.0766f, 2.5f, 1.9499f, 4.6266f, 1.9499f, 7.25f)
        curveTo(1.9499f, 9.2136f, 3.1414f, 10.8989f, 4.8409f, 11.6224f)
        curveTo(4.8203f, 11.8288f, 4.8098f, 12.0382f, 4.8098f, 12.25f)
        curveTo(4.8098f, 12.5844f, 4.836f, 12.9127f, 4.8866f, 13.2329f)
        curveTo(2.3191f, 12.4557f, 0.45f, 10.0711f, 0.45f, 7.25f)
        curveTo(0.45f, 3.7982f, 3.2482f, 1.0f, 6.7f, 1.0f)
        curveTo(8.442f, 1.0f, 10.0173f, 1.7131f, 11.15f, 2.8616f)
        verticalLineTo(0.75f)
        curveTo(11.15f, 0.3358f, 11.4858f, 0.0f, 11.9f, 0.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.8476f, 14.7844f)
        curveTo(15.1824f, 14.9777f, 15.6105f, 14.863f, 15.8038f, 14.5282f)
        curveTo(15.9971f, 14.1934f, 15.8824f, 13.7653f, 15.5476f, 13.572f)
        lineTo(14.8476f, 14.7844f)
        close()
        moveTo(13.0289f, 13.7344f)
        lineTo(14.8476f, 14.7844f)
        lineTo(15.5476f, 13.572f)
        lineTo(13.7289f, 12.522f)
        lineTo(13.0289f, 13.7344f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.556f, 11.0258f)
        curveTo(15.8944f, 10.839f, 16.0173f, 10.4132f, 15.8305f, 10.0747f)
        curveTo(15.6436f, 9.7363f, 15.2178f, 9.6134f, 14.8793f, 9.8002f)
        lineTo(15.556f, 11.0258f)
        close()
        moveTo(13.7172f, 12.041f)
        lineTo(15.556f, 11.0258f)
        lineTo(14.8793f, 9.8002f)
        lineTo(13.0406f, 10.8154f)
        lineTo(13.7172f, 12.041f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.2687f, 14.7844f)
        curveTo(6.9338f, 14.9777f, 6.5057f, 14.863f, 6.3124f, 14.5282f)
        curveTo(6.1191f, 14.1934f, 6.2339f, 13.7653f, 6.5686f, 13.572f)
        lineTo(7.2687f, 14.7844f)
        close()
        moveTo(9.0873f, 13.7344f)
        lineTo(7.2687f, 14.7844f)
        lineTo(6.5686f, 13.572f)
        lineTo(8.3873f, 12.522f)
        lineTo(9.0873f, 13.7344f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.56f, 11.0268f)
        curveTo(6.2215f, 10.84f, 6.0984f, 10.4143f, 6.2852f, 10.0757f)
        curveTo(6.4719f, 9.7372f, 6.8976f, 9.6142f, 7.2362f, 9.8009f)
        lineTo(6.56f, 11.0268f)
        close()
        moveTo(8.3992f, 12.0412f)
        lineTo(6.56f, 11.0268f)
        lineTo(7.2362f, 9.8009f)
        lineTo(9.0754f, 10.8153f)
        lineTo(8.3992f, 12.0412f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.3f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.3607f, 9.8468f)
        curveTo(12.4192f, 9.6929f, 12.4513f, 9.526f, 12.4513f, 9.3516f)
        curveTo(12.4513f, 8.5826f, 11.8279f, 7.9592f, 11.059f, 7.9592f)
        curveTo(10.29f, 7.9592f, 9.6667f, 8.5826f, 9.6667f, 9.3516f)
        curveTo(9.6667f, 9.5385f, 9.7035f, 9.7168f, 9.7703f, 9.8797f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.3f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.6553f, 12.1773f)
        curveTo(8.6553f, 10.8799f, 9.7071f, 9.8281f, 11.0045f, 9.8281f)
        horizontalLineTo(11.1061f)
        curveTo(12.4035f, 9.8281f, 13.4553f, 10.8799f, 13.4553f, 12.1773f)
        verticalLineTo(12.9096f)
        curveTo(13.4553f, 14.2351f, 12.3808f, 15.3096f, 11.0553f, 15.3096f)
        verticalLineTo(15.3096f)
        curveTo(9.7298f, 15.3096f, 8.6553f, 14.2351f, 8.6553f, 12.9096f)
        verticalLineTo(12.1773f)
        close()
    }
}
.build()
