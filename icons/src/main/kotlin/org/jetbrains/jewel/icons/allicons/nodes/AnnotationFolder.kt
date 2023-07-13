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

public val NodesGroup.AnnotationFolder: IntellijIconData
    get() {
        if (_annotationFolder != null) {
            return _annotationFolder!!
        }
        _annotationFolder = IntellijIconData(name = "AnnotationFolder",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { AnnotationFolderComposable(it) })
        return _annotationFolder!!
    }

private var _annotationFolder: IntellijIconData? = null

private fun AnnotationFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "AnnotationFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 16.0f)
        lineTo(12.31f, 9.7f)
        horizontalLineTo(13.59f)
        lineTo(15.98f, 16.0f)
        horizontalLineTo(14.889f)
        lineTo(14.3175f, 14.398f)
        horizontalLineTo(11.6445f)
        lineTo(11.109f, 16.0f)
        horizontalLineTo(10.0f)
        close()
        moveTo(13.9774f, 13.4534f)
        lineTo(13.0485f, 10.897f)
        lineTo(12.945f, 10.51f)
        lineTo(12.8415f, 10.897f)
        lineTo(11.9628f, 13.4534f)
        horizontalLineTo(13.9774f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7313f, 2.0f, 2.6333f, 2.0f)
        horizontalLineTo(6.1217f)
        curveTo(6.3941f, 2.0f, 6.6548f, 2.1112f, 6.8434f, 2.3077f)
        lineTo(8.4667f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(8.7f)
        horizontalLineTo(11.6114f)
        lineTo(9.6681f, 14.0f)
        horizontalLineTo(2.6333f)
        curveTo(1.7313f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.6333f, 3.0f)
        lineTo(6.1217f, 3.0f)
        lineTo(8.0402f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(8.7f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.4667f, 4.0f)
        lineTo(6.8434f, 2.3077f)
        curveTo(6.6548f, 2.1112f, 6.3941f, 2.0f, 6.1217f, 2.0f)
        horizontalLineTo(2.6333f)
        curveTo(1.7313f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7313f, 14.0f, 2.6333f, 14.0f)
        horizontalLineTo(9.6681f)
        lineTo(10.0348f, 13.0f)
        horizontalLineTo(2.6333f)
        curveTo(2.4048f, 13.0f, 2.0f, 12.7416f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.2584f, 2.4048f, 3.0f, 2.6333f, 3.0f)
        close()
    }
}
.build()
