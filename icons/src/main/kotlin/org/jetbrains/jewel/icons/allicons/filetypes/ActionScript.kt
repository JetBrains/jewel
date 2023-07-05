package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.ActionScript: IntellijIconData
    get() {
        if (_actionScript != null) {
            return _actionScript!!
        }
        _actionScript = IntellijIconData(imageVector = { ActionScriptComposable(it) })
        return _actionScript!!
    }

private var _actionScript: IntellijIconData? = null

private fun ActionScriptComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ActionScript", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.5408f, 13.0f)
        lineTo(4.4608f, 2.5f)
        horizontalLineTo(6.2758f)
        lineTo(8.2333f, 13.0f)
        horizontalLineTo(6.8008f)
        lineTo(5.4658f, 4.7725f)
        lineTo(5.3683f, 4.075f)
        lineTo(5.2708f, 4.7725f)
        lineTo(4.0108f, 13.0f)
        horizontalLineTo(2.5408f)
        close()
        moveTo(3.6508f, 10.2775f)
        verticalLineTo(9.1f)
        horizontalLineTo(7.0108f)
        verticalLineTo(10.2775f)
        horizontalLineTo(3.6508f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.943f, 13.18f)
        curveTo(10.398f, 13.18f, 9.9455f, 13.065f, 9.5855f, 12.835f)
        curveTo(9.2255f, 12.605f, 8.9555f, 12.2575f, 8.7755f, 11.7925f)
        curveTo(8.6005f, 11.3275f, 8.513f, 10.7325f, 8.513f, 10.0075f)
        horizontalLineTo(9.9455f)
        curveTo(9.9455f, 10.4475f, 9.9805f, 10.81f, 10.0505f, 11.095f)
        curveTo(10.1255f, 11.38f, 10.238f, 11.5925f, 10.388f, 11.7325f)
        curveTo(10.538f, 11.8675f, 10.728f, 11.935f, 10.958f, 11.935f)
        curveTo(11.173f, 11.935f, 11.3505f, 11.87f, 11.4905f, 11.74f)
        curveTo(11.6305f, 11.61f, 11.733f, 11.415f, 11.798f, 11.155f)
        curveTo(11.868f, 10.89f, 11.903f, 10.55f, 11.903f, 10.135f)
        curveTo(11.903f, 9.69f, 11.838f, 9.3325f, 11.708f, 9.0625f)
        curveTo(11.583f, 8.7875f, 11.3855f, 8.5775f, 11.1155f, 8.4325f)
        lineTo(10.2755f, 8.0275f)
        curveTo(9.9155f, 7.8325f, 9.618f, 7.605f, 9.383f, 7.345f)
        curveTo(9.153f, 7.085f, 8.9805f, 6.7825f, 8.8655f, 6.4375f)
        curveTo(8.7555f, 6.0925f, 8.7005f, 5.6975f, 8.7005f, 5.2525f)
        curveTo(8.7005f, 4.5875f, 8.7805f, 4.0375f, 8.9405f, 3.6025f)
        curveTo(9.1005f, 3.1675f, 9.343f, 2.845f, 9.668f, 2.635f)
        curveTo(9.993f, 2.425f, 10.403f, 2.32f, 10.898f, 2.32f)
        curveTo(11.398f, 2.32f, 11.813f, 2.4275f, 12.143f, 2.6425f)
        curveTo(12.473f, 2.8525f, 12.7205f, 3.1725f, 12.8855f, 3.6025f)
        curveTo(13.0505f, 4.0325f, 13.1355f, 4.585f, 13.1405f, 5.26f)
        horizontalLineTo(11.708f)
        curveTo(11.708f, 4.87f, 11.678f, 4.5525f, 11.618f, 4.3075f)
        curveTo(11.558f, 4.0575f, 11.4705f, 3.8725f, 11.3555f, 3.7525f)
        curveTo(11.2405f, 3.6275f, 11.093f, 3.565f, 10.913f, 3.565f)
        curveTo(10.643f, 3.565f, 10.443f, 3.7f, 10.313f, 3.97f)
        curveTo(10.183f, 4.235f, 10.118f, 4.655f, 10.118f, 5.23f)
        curveTo(10.118f, 5.605f, 10.1805f, 5.9125f, 10.3055f, 6.1525f)
        curveTo(10.4305f, 6.3925f, 10.623f, 6.585f, 10.883f, 6.73f)
        lineTo(11.768f, 7.165f)
        curveTo(12.123f, 7.355f, 12.4155f, 7.5875f, 12.6455f, 7.8625f)
        curveTo(12.8755f, 8.1325f, 13.048f, 8.4525f, 13.163f, 8.8225f)
        curveTo(13.278f, 9.1925f, 13.3355f, 9.6175f, 13.3355f, 10.0975f)
        curveTo(13.3355f, 10.7975f, 13.248f, 11.375f, 13.073f, 11.83f)
        curveTo(12.898f, 12.285f, 12.633f, 12.625f, 12.278f, 12.85f)
        curveTo(11.923f, 13.07f, 11.478f, 13.18f, 10.943f, 13.18f)
        close()
    }
}
.build()
