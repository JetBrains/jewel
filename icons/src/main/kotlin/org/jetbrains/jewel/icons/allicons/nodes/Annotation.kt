package org.jetbrains.jewel.icons.allicons.nodes

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

public val NodesGroup.Annotation: IntellijIconData
    get() {
        if (_annotation != null) {
            return _annotation!!
        }
        _annotation = IntellijIconData(name = "Annotation",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { AnnotationComposable(it) })
        return _annotation!!
    }

private var _annotation: IntellijIconData? = null

private fun AnnotationComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Annotation", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.greenFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-7.0f, 0.0f)
        arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
        arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.7299f, 5.3851f)
        verticalLineTo(6.3586f)
        horizontalLineTo(9.7001f)
        curveTo(9.3549f, 5.69f, 8.7161f, 5.3046f, 7.8713f, 5.3046f)
        curveTo(6.3828f, 5.3046f, 5.2644f, 6.4793f, 5.2644f, 8.0402f)
        curveTo(5.2644f, 9.6011f, 6.3828f, 10.7759f, 7.8713f, 10.7759f)
        curveTo(8.811f, 10.7759f, 9.5883f, 10.339f, 10.0026f, 9.6543f)
        curveTo(10.442f, 10.3357f, 11.2602f, 10.7517f, 12.2885f, 10.7517f)
        curveTo(13.9218f, 10.7517f, 15.0f, 9.6011f, 15.0f, 7.9195f)
        curveTo(15.0f, 4.1138f, 11.854f, 1.0f, 8.0f, 1.0f)
        curveTo(4.146f, 1.0f, 1.0f, 4.1862f, 1.0f, 8.0805f)
        curveTo(1.0f, 11.8862f, 4.146f, 15.0f, 8.0f, 15.0f)
        curveTo(9.8506f, 15.0f, 11.5161f, 14.2356f, 12.4333f, 13.4069f)
        lineTo(11.7092f, 12.6103f)
        curveTo(10.8966f, 13.3345f, 9.5931f, 13.9943f, 8.0f, 13.9943f)
        curveTo(4.7011f, 13.9943f, 2.0057f, 11.331f, 2.0057f, 8.0805f)
        curveTo(2.0057f, 4.7414f, 4.7011f, 2.0057f, 8.0f, 2.0057f)
        curveTo(11.2989f, 2.0057f, 13.9943f, 4.669f, 13.9943f, 7.9195f)
        curveTo(13.9943f, 9.0299f, 13.3264f, 9.7862f, 12.2885f, 9.7862f)
        curveTo(11.3471f, 9.7862f, 10.6552f, 9.1908f, 10.6552f, 8.3218f)
        verticalLineTo(5.3851f)
        horizontalLineTo(9.7299f)
        close()
        moveTo(7.9598f, 9.8908f)
        curveTo(6.9942f, 9.8908f, 6.2701f, 9.0942f, 6.2701f, 8.0402f)
        curveTo(6.2701f, 6.9862f, 6.9942f, 6.1897f, 7.9598f, 6.1897f)
        curveTo(8.9253f, 6.1897f, 9.6494f, 6.9862f, 9.6494f, 8.0402f)
        curveTo(9.6494f, 9.0942f, 8.9253f, 9.8908f, 7.9598f, 9.8908f)
        close()
    }
}
.build()
