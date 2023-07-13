package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Ant: IntellijIconData
    get() {
        if (_ant != null) {
            return _ant!!
        }
        _ant = IntellijIconData(name = "Ant",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { AntComposable(it) })
        return _ant!!
    }

private var _ant: IntellijIconData? = null

private fun AntComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Ant",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.4003f, 14.4f)
        verticalLineTo(13.6f)
        verticalLineTo(10.72f)
        lineTo(10.4062f, 9.8787f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.5978f, 14.4f)
        verticalLineTo(13.6f)
        verticalLineTo(10.72f)
        lineTo(5.5918f, 9.8787f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.4f, 4.4f)
        verticalLineTo(6.8f)
        lineTo(10.0f, 8.4f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.6f, 4.4f)
        verticalLineTo(6.8f)
        lineTo(6.0f, 8.4f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0088f, 2.3626f)
        lineTo(8.0088f, 2.8626f)
        horizontalLineTo(8.0088f)
        lineTo(8.0088f, 2.3626f)
        close()
        moveTo(7.9996f, 14.4f)
        lineTo(7.9996f, 14.9f)
        horizontalLineTo(7.9996f)
        lineTo(7.9996f, 14.4f)
        close()
        moveTo(9.4688f, 4.6253f)
        curveTo(9.4688f, 5.2884f, 9.3202f, 5.5275f, 9.1765f, 5.6401f)
        curveTo(8.9983f, 5.7798f, 8.6671f, 5.8625f, 8.0088f, 5.8625f)
        verticalLineTo(6.8625f)
        curveTo(8.6735f, 6.8625f, 9.3224f, 6.7963f, 9.7934f, 6.4271f)
        curveTo(10.299f, 6.0309f, 10.4688f, 5.4014f, 10.4688f, 4.6253f)
        horizontalLineTo(9.4688f)
        close()
        moveTo(8.0088f, 2.8626f)
        curveTo(8.2923f, 2.8626f, 8.6585f, 2.9677f, 8.948f, 3.2287f)
        curveTo(9.2238f, 3.4775f, 9.4688f, 3.9026f, 9.4688f, 4.6253f)
        horizontalLineTo(10.4688f)
        curveTo(10.4688f, 3.6507f, 10.1259f, 2.9444f, 9.6177f, 2.4861f)
        curveTo(9.1231f, 2.0401f, 8.5093f, 1.8626f, 8.0088f, 1.8626f)
        lineTo(8.0088f, 2.8626f)
        close()
        moveTo(6.5488f, 4.6253f)
        curveTo(6.5488f, 3.9026f, 6.7939f, 3.4775f, 7.0697f, 3.2287f)
        curveTo(7.3591f, 2.9677f, 7.7253f, 2.8626f, 8.0088f, 2.8626f)
        lineTo(8.0088f, 1.8626f)
        curveTo(7.5083f, 1.8626f, 6.8945f, 2.0401f, 6.4f, 2.4861f)
        curveTo(5.8918f, 2.9444f, 5.5488f, 3.6507f, 5.5488f, 4.6253f)
        horizontalLineTo(6.5488f)
        close()
        moveTo(8.0088f, 5.8625f)
        curveTo(7.3505f, 5.8625f, 7.0194f, 5.7798f, 6.8411f, 5.6401f)
        curveTo(6.6975f, 5.5275f, 6.5488f, 5.2884f, 6.5488f, 4.6253f)
        horizontalLineTo(5.5488f)
        curveTo(5.5488f, 5.4014f, 5.7187f, 6.0309f, 6.2243f, 6.4271f)
        curveTo(6.6953f, 6.7963f, 7.3442f, 6.8625f, 8.0088f, 6.8625f)
        verticalLineTo(5.8625f)
        close()
        moveTo(9.8996f, 10.4616f)
        curveTo(9.8996f, 11.0292f, 9.7176f, 11.9393f, 9.3499f, 12.6961f)
        curveTo(8.9672f, 13.4838f, 8.4929f, 13.9f, 7.9996f, 13.9f)
        lineTo(7.9996f, 14.9f)
        curveTo(9.1064f, 14.9f, 9.832f, 13.9921f, 10.2493f, 13.1331f)
        curveTo(10.6817f, 12.2432f, 10.8996f, 11.1841f, 10.8996f, 10.4616f)
        horizontalLineTo(9.8996f)
        close()
        moveTo(7.9996f, 8.5f)
        curveTo(9.0048f, 8.5f, 9.8996f, 9.3139f, 9.8996f, 10.4616f)
        horizontalLineTo(10.8996f)
        curveTo(10.8996f, 8.7544f, 9.5499f, 7.5f, 7.9996f, 7.5f)
        verticalLineTo(8.5f)
        close()
        moveTo(6.0996f, 10.4616f)
        curveTo(6.0996f, 9.3139f, 6.9944f, 8.5f, 7.9996f, 8.5f)
        verticalLineTo(7.5f)
        curveTo(6.4493f, 7.5f, 5.0996f, 8.7544f, 5.0996f, 10.4616f)
        horizontalLineTo(6.0996f)
        close()
        moveTo(7.9996f, 13.9f)
        curveTo(7.5064f, 13.9f, 7.032f, 13.4838f, 6.6493f, 12.6961f)
        curveTo(6.2817f, 11.9393f, 6.0996f, 11.0292f, 6.0996f, 10.4616f)
        horizontalLineTo(5.0996f)
        curveTo(5.0996f, 11.1841f, 5.3176f, 12.2432f, 5.7499f, 13.1331f)
        curveTo(6.1672f, 13.9921f, 6.8928f, 14.9f, 7.9996f, 14.9f)
        lineTo(7.9996f, 13.9f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.5996f, 3.1999f)
        lineTo(10.3996f, 1.1999f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.4004f, 3.1999f)
        lineTo(5.6004f, 1.1999f)
    }
}
.build()
