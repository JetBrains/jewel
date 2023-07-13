package org.jetbrains.jewel.icons.allicons.objectbrowser

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
import org.jetbrains.jewel.icons.allicons.ObjectbrowserGroup

public val ObjectbrowserGroup.SortAlphabetically: IntellijIconData
    get() {
        if (_sortAlphabetically != null) {
            return _sortAlphabetically!!
        }
        _sortAlphabetically = IntellijIconData(name = "SortAlphabetically",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { SortAlphabeticallyComposable(it) })
        return _sortAlphabetically!!
    }

private var _sortAlphabetically: IntellijIconData? = null

private fun SortAlphabeticallyComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "SortAlphabetically", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.8536f, 10.8536f)
        curveTo(9.0488f, 10.6583f, 9.0488f, 10.3417f, 8.8536f, 10.1464f)
        curveTo(8.6583f, 9.9512f, 8.3417f, 9.9512f, 8.1465f, 10.1464f)
        lineTo(6.0f, 12.2929f)
        lineTo(6.0f, 2.5f)
        curveTo(6.0f, 2.2239f, 5.7761f, 2.0f, 5.5f, 2.0f)
        curveTo(5.2239f, 2.0f, 5.0f, 2.2239f, 5.0f, 2.5f)
        lineTo(5.0f, 12.2929f)
        lineTo(2.8536f, 10.1464f)
        curveTo(2.6583f, 9.9512f, 2.3417f, 9.9512f, 2.1465f, 10.1464f)
        curveTo(1.9512f, 10.3417f, 1.9512f, 10.6583f, 2.1465f, 10.8536f)
        lineTo(5.1465f, 13.8536f)
        curveTo(5.3417f, 14.0488f, 5.6583f, 14.0488f, 5.8536f, 13.8536f)
        lineTo(8.8536f, 10.8536f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.9729f, 1.9f)
        curveTo(12.3738f, 1.9f, 12.7262f, 1.9712f, 13.0302f, 2.1134f)
        curveTo(13.3373f, 2.2557f, 13.575f, 2.4626f, 13.7431f, 2.7342f)
        curveTo(13.9145f, 3.0026f, 14.0002f, 3.3194f, 14.0002f, 3.6848f)
        verticalLineTo(6.9828f)
        horizontalLineTo(12.9429f)
        lineTo(12.9332f, 5.1253f)
        horizontalLineTo(13.1951f)
        curveTo(13.1951f, 5.5359f, 13.1207f, 5.8899f, 12.972f, 6.1874f)
        curveTo(12.8265f, 6.4816f, 12.6163f, 6.708f, 12.3415f, 6.8664f)
        curveTo(12.0666f, 7.0216f, 11.7417f, 7.0992f, 11.3666f, 7.0992f)
        curveTo(11.0465f, 7.0992f, 10.7588f, 7.0378f, 10.5033f, 6.9149f)
        curveTo(10.2511f, 6.792f, 10.0523f, 6.6223f, 9.9068f, 6.4057f)
        curveTo(9.7645f, 6.189f, 9.6934f, 5.9433f, 9.6934f, 5.6685f)
        curveTo(9.6934f, 5.4033f, 9.7613f, 5.1592f, 9.8971f, 4.9361f)
        curveTo(10.0361f, 4.713f, 10.2269f, 4.5303f, 10.4694f, 4.3881f)
        curveTo(10.7151f, 4.2458f, 10.9916f, 4.1585f, 11.2987f, 4.1262f)
        lineTo(12.5985f, 3.9855f)
        curveTo(12.702f, 3.9758f, 12.7812f, 3.9386f, 12.8362f, 3.874f)
        curveTo(12.8944f, 3.8061f, 12.9235f, 3.7074f, 12.9235f, 3.5781f)
        lineTo(12.9817f, 4.6597f)
        lineTo(11.5461f, 4.8197f)
        curveTo(11.4006f, 4.8359f, 11.2729f, 4.8763f, 11.1629f, 4.941f)
        curveTo(11.053f, 5.0024f, 10.9673f, 5.0865f, 10.9059f, 5.1932f)
        curveTo(10.8444f, 5.2966f, 10.8137f, 5.4146f, 10.8137f, 5.5472f)
        curveTo(10.8137f, 5.6895f, 10.8509f, 5.8156f, 10.9253f, 5.9255f)
        curveTo(10.9996f, 6.0322f, 11.1047f, 6.1163f, 11.2405f, 6.1777f)
        curveTo(11.3763f, 6.2392f, 11.5315f, 6.2699f, 11.7061f, 6.2699f)
        curveTo(11.9486f, 6.2699f, 12.162f, 6.223f, 12.3463f, 6.1292f)
        curveTo(12.5306f, 6.0322f, 12.6729f, 5.898f, 12.7731f, 5.7267f)
        curveTo(12.8734f, 5.5521f, 12.9235f, 5.3516f, 12.9235f, 5.1253f)
        verticalLineTo(3.5878f)
        curveTo(12.9235f, 3.4229f, 12.8831f, 3.279f, 12.8022f, 3.1562f)
        curveTo(12.7214f, 3.0301f, 12.6066f, 2.9331f, 12.4579f, 2.8652f)
        curveTo(12.3091f, 2.7973f, 12.1394f, 2.7633f, 11.9486f, 2.7633f)
        curveTo(11.7579f, 2.7633f, 11.5865f, 2.7957f, 11.4345f, 2.8603f)
        curveTo(11.2826f, 2.925f, 11.1597f, 3.0123f, 11.0659f, 3.1222f)
        curveTo(10.9722f, 3.2322f, 10.9156f, 3.3534f, 10.8962f, 3.486f)
        horizontalLineTo(9.8146f)
        curveTo(9.8469f, 3.182f, 9.9601f, 2.9104f, 10.1541f, 2.6712f)
        curveTo(10.3514f, 2.4287f, 10.6068f, 2.2395f, 10.9204f, 2.1037f)
        curveTo(11.2373f, 1.9679f, 11.5881f, 1.9f, 11.9729f, 1.9f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.7049f, 9.9551f)
        horizontalLineTo(10.212f)
        verticalLineTo(9.0336f)
        horizontalLineTo(14.0096f)
        verticalLineTo(9.9357f)
        lineTo(11.3906f, 13.0785f)
        horizontalLineTo(13.9999f)
        verticalLineTo(14.0f)
        horizontalLineTo(10.0859f)
        verticalLineTo(13.0979f)
        lineTo(12.7049f, 9.9551f)
        close()
    }
}
.build()
