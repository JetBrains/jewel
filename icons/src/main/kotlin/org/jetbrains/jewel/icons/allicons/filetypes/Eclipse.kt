package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FiletypesGroup.Eclipse: IntellijIconData
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = IntellijIconData(imageVector = { EclipseComposable(it) })
        return _eclipse!!
    }

private var _eclipse: IntellijIconData? = null

private fun EclipseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Eclipse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF2C2255)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.853f, 9.8104f)
        horizontalLineTo(2.7063f)
        curveTo(2.9905f, 10.7854f, 3.518f, 11.6593f, 4.2902f, 12.4315f)
        curveTo(5.5212f, 13.6628f, 7.0014f, 14.2774f, 8.7325f, 14.2774f)
        curveTo(9.0785f, 14.2774f, 9.4137f, 14.2517f, 9.7394f, 14.2025f)
        curveTo(11.0432f, 14.0058f, 12.1848f, 13.4163f, 13.1628f, 12.4315f)
        curveTo(13.94f, 11.6596f, 14.4712f, 10.7854f, 14.7576f, 9.8104f)
        horizontalLineTo(13.8864f)
        horizontalLineTo(12.6126f)
        horizontalLineTo(4.853f)
        close()
    }
    path(fill = SolidColor(Color(0xFF2C2255)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.6694f, 6.8947f)
        horizontalLineTo(2.548f)
        curveTo(2.5069f, 7.1411f, 2.479f, 7.3927f, 2.4663f, 7.6506f)
        horizontalLineTo(3.7991f)
        horizontalLineTo(4.4677f)
        horizontalLineTo(14.1184f)
        horizontalLineTo(14.9993f)
        curveTo(14.9865f, 7.3927f, 14.9585f, 7.1411f, 14.9171f, 6.8947f)
    }
    path(fill = SolidColor(Color(0xFF2C2255)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.4663f, 8.3525f)
        curveTo(2.479f, 8.6106f, 2.5068f, 8.8622f, 2.548f, 9.1084f)
        horizontalLineTo(3.7139f)
        horizontalLineTo(4.5976f)
        horizontalLineTo(14.0397f)
        horizontalLineTo(14.9173f)
        curveTo(14.9586f, 8.8622f, 14.9868f, 8.6106f, 14.9997f, 8.3525f)
    }
    path(fill = SolidColor(Color(0xFF2C2255)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.758f, 6.1927f)
        curveTo(14.4718f, 5.215f, 13.9406f, 4.3371f, 13.163f, 3.5594f)
        curveTo(12.1875f, 2.584f, 11.0491f, 1.9986f, 9.7495f, 1.8017f)
        curveTo(9.4208f, 1.7518f, 9.0822f, 1.7256f, 8.7326f, 1.7256f)
        curveTo(7.0016f, 1.7256f, 5.5212f, 2.3371f, 4.2903f, 3.5594f)
        curveTo(3.5178f, 4.3371f, 2.9902f, 5.215f, 2.706f, 6.1927f)
    }
    path(fill = SolidColor(Color(0xFFF7941E)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.0936f, 8.0018f)
        curveTo(2.0936f, 4.691f, 4.5801f, 1.9401f, 7.8149f, 1.4563f)
        curveTo(7.7346f, 1.4533f, 7.654f, 1.45f, 7.573f, 1.45f)
        curveTo(3.943f, 1.45f, 1.0f, 4.3835f, 1.0f, 8.0018f)
        curveTo(1.0f, 11.6203f, 3.9428f, 14.5535f, 7.573f, 14.5535f)
        curveTo(7.6542f, 14.5535f, 7.7349f, 14.5505f, 7.8154f, 14.5475f)
        curveTo(4.5801f, 14.0636f, 2.0936f, 11.3127f, 2.0936f, 8.0018f)
        close()
    }
    path(fill = linearGradient(0.3033f to Color(0xFF473788), 0.872f to Color(0xFF2C2255), start =
            Offset(8.73275f,15.1294f), end = Offset(8.73275f,5.689f)), stroke = null,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.9979f, 7.6505f)
        curveTo(12.9769f, 7.3914f, 12.9333f, 7.1387f, 12.8682f, 6.8946f)
        horizontalLineTo(4.5977f)
        curveTo(4.5325f, 7.1384f, 4.4888f, 7.3913f, 4.4678f, 7.6505f)
        horizontalLineTo(12.9979f)
        close()
    }
    path(fill = linearGradient(0.3033f to Color(0xFF473788), 0.872f to Color(0xFF2C2255), start =
            Offset(8.73298f,15.1296f), end = Offset(8.73298f,5.6891f)), stroke = null,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.998f, 8.3525f)
        horizontalLineTo(4.468f)
        curveTo(4.489f, 8.6116f, 4.5325f, 8.8642f, 4.5978f, 9.1084f)
        horizontalLineTo(12.8684f)
        curveTo(12.9335f, 8.8643f, 12.977f, 8.6116f, 12.998f, 8.3525f)
        close()
    }
    path(fill = linearGradient(0.3033f to Color(0xFF473788), 0.8631f to Color(0xFF2C2255), start =
            Offset(8.73287f,15.1291f), end = Offset(8.73287f,5.68945f)), stroke = null,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.7329f, 12.2823f)
        curveTo(10.4505f, 12.2823f, 11.931f, 11.2704f, 12.6128f, 9.8104f)
        horizontalLineTo(4.853f)
        curveTo(5.5348f, 11.2704f, 7.0153f, 12.2823f, 8.7329f, 12.2823f)
        close()
    }
}
.build()
