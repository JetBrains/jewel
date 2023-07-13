package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.ExtAnnotation: IntellijIconData
    get() {
        if (_extAnnotation != null) {
            return _extAnnotation!!
        }
        _extAnnotation = IntellijIconData(name = "ExtAnnotation",size = DpSize(height = 14.0.dp,
                width = 14.0.dp),imageVector = { ExtAnnotationComposable(it) })
        return _extAnnotation!!
    }

private var _extAnnotation: IntellijIconData? = null

private fun ExtAnnotationComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ExtAnnotation", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.7299f, 4.3851f)
        verticalLineTo(5.3586f)
        horizontalLineTo(8.7001f)
        curveTo(8.3549f, 4.69f, 7.7161f, 4.3046f, 6.8713f, 4.3046f)
        curveTo(5.3828f, 4.3046f, 4.2644f, 5.4793f, 4.2644f, 7.0402f)
        curveTo(4.2644f, 8.6011f, 5.3828f, 9.7759f, 6.8713f, 9.7759f)
        curveTo(7.811f, 9.7759f, 8.5883f, 9.339f, 9.0026f, 8.6543f)
        curveTo(9.4419f, 9.3357f, 10.2602f, 9.7517f, 11.2885f, 9.7517f)
        curveTo(12.9218f, 9.7517f, 14.0f, 8.6011f, 14.0f, 6.9195f)
        curveTo(14.0f, 3.1138f, 10.854f, 0.0f, 7.0f, 0.0f)
        curveTo(3.146f, 0.0f, 0.0f, 3.1862f, 0.0f, 7.0805f)
        curveTo(0.0f, 10.8862f, 3.146f, 14.0f, 7.0f, 14.0f)
        curveTo(8.8506f, 14.0f, 10.5161f, 13.2356f, 11.4333f, 12.4069f)
        lineTo(10.7092f, 11.6103f)
        curveTo(9.8966f, 12.3345f, 8.5931f, 12.9943f, 7.0f, 12.9943f)
        curveTo(3.7011f, 12.9943f, 1.0057f, 10.331f, 1.0057f, 7.0805f)
        curveTo(1.0057f, 3.7414f, 3.7011f, 1.0057f, 7.0f, 1.0057f)
        curveTo(10.2989f, 1.0057f, 12.9943f, 3.669f, 12.9943f, 6.9195f)
        curveTo(12.9943f, 8.0299f, 12.3264f, 8.7862f, 11.2885f, 8.7862f)
        curveTo(10.3471f, 8.7862f, 9.6552f, 8.1908f, 9.6552f, 7.3218f)
        verticalLineTo(4.3851f)
        horizontalLineTo(8.7299f)
        close()
        moveTo(6.9598f, 8.8908f)
        curveTo(5.9942f, 8.8908f, 5.2701f, 8.0942f, 5.2701f, 7.0402f)
        curveTo(5.2701f, 5.9862f, 5.9942f, 5.1897f, 6.9598f, 5.1897f)
        curveTo(7.9253f, 5.1897f, 8.6494f, 5.9862f, 8.6494f, 7.0402f)
        curveTo(8.6494f, 8.0942f, 7.9253f, 8.8908f, 6.9598f, 8.8908f)
        close()
    }
}
.build()
