package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Less: IntellijIconData
    get() {
        if (_less != null) {
            return _less!!
        }
        _less = IntellijIconData(name = "Less",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { LessComposable(it) })
        return _less!!
    }

private var _less: IntellijIconData? = null

private fun LessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Less",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.9876f, 9.7775f)
        curveTo(3.9976f, 9.3925f, 3.87f, 9.085f, 3.6051f, 8.855f)
        curveTo(3.34f, 8.625f, 2.9825f, 8.51f, 2.5326f, 8.51f)
        horizontalLineTo(2.0f)
        verticalLineTo(7.43f)
        horizontalLineTo(2.5326f)
        curveTo(2.9825f, 7.43f, 3.34f, 7.315f, 3.6051f, 7.085f)
        curveTo(3.87f, 6.855f, 3.9976f, 6.5475f, 3.9876f, 6.1625f)
        lineTo(3.9576f, 4.58f)
        curveTo(3.9476f, 4.06f, 4.055f, 3.605f, 4.28f, 3.215f)
        curveTo(4.51f, 2.825f, 4.8376f, 2.525f, 5.2625f, 2.315f)
        curveTo(5.6876f, 2.105f, 6.1876f, 2.0f, 6.7625f, 2.0f)
        horizontalLineTo(7.5f)
        verticalLineTo(3.005f)
        horizontalLineTo(6.7701f)
        curveTo(6.2501f, 3.005f, 5.8376f, 3.15f, 5.5325f, 3.44f)
        curveTo(5.2326f, 3.725f, 5.0851f, 4.1125f, 5.0901f, 4.6025f)
        lineTo(5.12f, 6.17f)
        curveTo(5.1301f, 6.68f, 4.9925f, 7.0975f, 4.7076f, 7.4225f)
        curveTo(4.4226f, 7.7425f, 4.0375f, 7.92f, 3.5526f, 7.955f)
        curveTo(4.0375f, 8.045f, 4.4226f, 8.255f, 4.7076f, 8.585f)
        curveTo(4.9925f, 8.91f, 5.1301f, 9.305f, 5.12f, 9.77f)
        lineTo(5.0901f, 11.5475f)
        curveTo(5.08f, 11.9875f, 5.2126f, 12.3375f, 5.4875f, 12.5975f)
        curveTo(5.7675f, 12.8625f, 6.1451f, 12.995f, 6.62f, 12.995f)
        horizontalLineTo(7.5f)
        verticalLineTo(14.0f)
        horizontalLineTo(6.6125f)
        curveTo(6.0775f, 14.0f, 5.6076f, 13.9f, 5.2025f, 13.7f)
        curveTo(4.8025f, 13.505f, 4.4925f, 13.2225f, 4.2726f, 12.8525f)
        curveTo(4.0575f, 12.4875f, 3.9525f, 12.06f, 3.9576f, 11.57f)
        lineTo(3.9876f, 9.7775f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.0145f, 9.7775f)
        curveTo(12.0045f, 9.3925f, 12.132f, 9.085f, 12.397f, 8.855f)
        curveTo(12.662f, 8.625f, 13.0195f, 8.51f, 13.4695f, 8.51f)
        horizontalLineTo(14.0f)
        verticalLineTo(7.43f)
        horizontalLineTo(13.4695f)
        curveTo(13.0195f, 7.43f, 12.662f, 7.315f, 12.397f, 7.085f)
        curveTo(12.132f, 6.855f, 12.0045f, 6.5475f, 12.0145f, 6.1625f)
        lineTo(12.0445f, 4.58f)
        curveTo(12.0545f, 4.06f, 11.9445f, 3.605f, 11.7145f, 3.215f)
        curveTo(11.4895f, 2.825f, 11.1645f, 2.525f, 10.7395f, 2.315f)
        curveTo(10.3145f, 2.105f, 9.8146f, 2.0f, 9.2395f, 2.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(3.005f)
        horizontalLineTo(9.232f)
        curveTo(9.7521f, 3.005f, 10.162f, 3.15f, 10.462f, 3.44f)
        curveTo(10.767f, 3.725f, 10.917f, 4.1125f, 10.912f, 4.6025f)
        lineTo(10.882f, 6.17f)
        curveTo(10.872f, 6.68f, 11.0095f, 7.0975f, 11.2945f, 7.4225f)
        curveTo(11.5795f, 7.7425f, 11.9645f, 7.92f, 12.4495f, 7.955f)
        curveTo(11.9645f, 8.045f, 11.5795f, 8.255f, 11.2945f, 8.585f)
        curveTo(11.0095f, 8.91f, 10.872f, 9.305f, 10.882f, 9.77f)
        lineTo(10.912f, 11.5475f)
        curveTo(10.922f, 11.9875f, 10.787f, 12.3375f, 10.507f, 12.5975f)
        curveTo(10.232f, 12.8625f, 9.857f, 12.995f, 9.382f, 12.995f)
        horizontalLineTo(8.5f)
        verticalLineTo(14.0f)
        horizontalLineTo(9.3896f)
        curveTo(9.9246f, 14.0f, 10.392f, 13.9f, 10.792f, 13.7f)
        curveTo(11.197f, 13.505f, 11.507f, 13.2225f, 11.722f, 12.8525f)
        curveTo(11.942f, 12.4875f, 12.0495f, 12.06f, 12.0445f, 11.57f)
        lineTo(12.0145f, 9.7775f)
        close()
    }
}
.build()
