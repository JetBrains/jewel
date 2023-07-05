package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Sbt: IntellijIconData
    get() {
        if (_sbt != null) {
            return _sbt!!
        }
        _sbt = IntellijIconData(imageVector = { SbtComposable(it) })
        return _sbt!!
    }

private var _sbt: IntellijIconData? = null

private fun SbtComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Sbt",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF380D09)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.0829f, 10.0233f)
        lineTo(0.259f, 10.7694f)
        curveTo(0.259f, 10.7694f, 0.6632f, 11.2746f, 1.1995f, 11.5777f)
        curveTo(1.7357f, 11.8808f, 2.0314f, 11.858f, 2.6335f, 11.85f)
        curveTo(3.2124f, 11.85f, 3.8031f, 11.7409f, 4.2772f, 11.3212f)
        curveTo(4.7513f, 10.9016f, 4.8409f, 10.7865f, 4.8388f, 10.2573f)
        curveTo(4.8378f, 10.009f, 4.772f, 9.4606f, 4.4715f, 9.1062f)
        curveTo(4.1316f, 8.7055f, 3.5524f, 8.5114f, 3.5524f, 8.5114f)
        curveTo(3.5524f, 8.5114f, 1.7786f, 8.0666f, 1.9611f, 7.4508f)
        curveTo(2.0377f, 7.1924f, 2.4472f, 7.0948f, 2.8497f, 7.1658f)
        curveTo(3.3591f, 7.2556f, 3.874f, 7.562f, 3.874f, 7.562f)
        lineTo(4.5938f, 6.8575f)
        curveTo(4.5938f, 6.8575f, 4.2659f, 6.4721f, 3.7564f, 6.2228f)
        curveTo(3.3794f, 6.0383f, 2.8594f, 5.9704f, 2.5264f, 5.9693f)
        curveTo(1.7435f, 5.9663f, 0.7646f, 6.6654f, 0.6476f, 7.3886f)
        curveTo(0.5621f, 7.9171f, 0.7336f, 8.3633f, 1.1217f, 8.7021f)
        curveTo(1.6114f, 9.1295f, 1.9597f, 9.1853f, 1.9597f, 9.1853f)
        curveTo(1.9597f, 9.1853f, 3.5218f, 9.5875f, 3.5218f, 10.0735f)
        curveTo(3.5218f, 10.5595f, 3.1425f, 10.7383f, 2.5362f, 10.7461f)
        curveTo(1.93f, 10.7538f, 1.0829f, 10.0233f, 1.0829f, 10.0233f)
        close()
    }
    path(fill = SolidColor(Color(0xFF380D09)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.3423f, 6.2322f)
        lineTo(12.3547f, 7.3637f)
        horizontalLineTo(13.0014f)
        lineTo(13.0076f, 10.715f)
        curveTo(13.0076f, 10.715f, 13.1196f, 11.1005f, 13.4117f, 11.3865f)
        curveTo(13.7888f, 11.7557f, 14.1827f, 11.85f, 14.1827f, 11.85f)
        horizontalLineTo(15.451f)
        lineTo(15.4573f, 10.6964f)
        lineTo(14.7734f, 10.6901f)
        curveTo(14.7734f, 10.6901f, 14.6241f, 10.6964f, 14.4563f, 10.5347f)
        curveTo(14.2821f, 10.3668f, 14.2884f, 10.1492f, 14.2884f, 10.1492f)
        lineTo(14.3008f, 7.3575f)
        horizontalLineTo(15.5444f)
        lineTo(15.5506f, 6.2259f)
        lineTo(14.3071f, 6.2197f)
        lineTo(14.2946f, 4.0311f)
        horizontalLineTo(13.0014f)
        lineTo(13.0138f, 6.2321f)
        horizontalLineTo(12.3423f)
        verticalLineTo(6.2322f)
        close()
    }
    path(fill = SolidColor(Color(0xFF380D09)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.7409f, 6.5026f)
        curveTo(8.9619f, 6.3305f, 8.171f, 6.4171f, 7.6658f, 6.7124f)
        lineTo(8.3264f, 4.0311f)
        lineTo(7.009f, 3.7085f)
        lineTo(5.136f, 11.2591f)
        lineTo(6.4417f, 11.636f)
        lineTo(6.6217f, 10.8964f)
        curveTo(7.0052f, 11.6217f, 7.4421f, 11.9707f, 8.2798f, 12.1606f)
        curveTo(9.8342f, 12.513f, 11.2215f, 11.4293f, 11.5959f, 9.7564f)
        curveTo(11.9171f, 8.3212f, 10.9378f, 6.7668f, 9.7409f, 6.5026f)
        close()
        moveTo(10.1195f, 10.6846f)
        lineTo(8.2448f, 11.2008f)
        lineTo(6.8464f, 9.7847f)
        lineTo(7.3231f, 7.8524f)
        lineTo(9.198f, 7.3362f)
        lineTo(10.5962f, 8.7524f)
        lineTo(10.1195f, 10.6846f)
        close()
    }
}
.build()
