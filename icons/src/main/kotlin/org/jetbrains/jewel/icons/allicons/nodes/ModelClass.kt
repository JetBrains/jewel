package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.ModelClass: IntellijIconData
    get() {
        if (_modelClass != null) {
            return _modelClass!!
        }
        _modelClass = IntellijIconData(imageVector = { ModelClassComposable(it) })
        return _modelClass!!
    }

private var _modelClass: IntellijIconData? = null

private fun ModelClassComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ModelClass", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        verticalLineTo(10.0f)
        curveTo(8.0f, 8.8954f, 8.8954f, 8.0f, 10.0f, 8.0f)
        horizontalLineTo(15.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 14.0f)
        curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.3137f, 2.0f, 14.0f, 4.6863f, 14.0f, 8.0f)
        horizontalLineTo(15.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        verticalLineTo(14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0f, 9.0f)
        curveTo(9.4477f, 9.0f, 9.0f, 9.4477f, 9.0f, 10.0f)
        lineTo(9.0f, 15.0f)
        curveTo(9.0f, 15.5523f, 9.4477f, 16.0f, 10.0f, 16.0f)
        lineTo(15.0f, 16.0f)
        curveTo(15.5523f, 16.0f, 16.0f, 15.5523f, 16.0f, 15.0f)
        lineTo(16.0f, 10.0f)
        curveTo(16.0f, 9.4477f, 15.5523f, 9.0f, 15.0f, 9.0f)
        lineTo(10.0f, 9.0f)
        close()
        moveTo(10.0f, 11.0f)
        lineTo(10.0f, 10.0f)
        horizontalLineTo(12.0f)
        lineTo(12.0f, 11.0f)
        horizontalLineTo(10.0f)
        close()
        moveTo(10.0f, 12.0f)
        lineTo(10.0f, 15.0f)
        horizontalLineTo(12.0f)
        lineTo(12.0f, 12.0f)
        horizontalLineTo(10.0f)
        close()
        moveTo(13.0f, 15.0f)
        horizontalLineTo(15.0f)
        lineTo(15.0f, 12.0f)
        horizontalLineTo(13.0f)
        lineTo(13.0f, 15.0f)
        close()
        moveTo(15.0f, 11.0f)
        lineTo(15.0f, 10.0f)
        horizontalLineTo(13.0f)
        lineTo(13.0f, 11.0f)
        horizontalLineTo(15.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 10.5731f)
        curveTo(6.7301f, 10.5048f, 5.8265f, 9.4534f, 5.8265f, 8.0f)
        curveTo(5.8265f, 6.4966f, 6.7933f, 5.4233f, 8.1324f, 5.4233f)
        curveTo(9.1041f, 5.4233f, 9.8824f, 5.9454f, 10.1966f, 6.6754f)
        horizontalLineTo(11.2118f)
        curveTo(10.8976f, 5.3992f, 9.6214f, 4.5f, 8.1324f, 4.5f)
        curveTo(6.2132f, 4.5f, 4.7871f, 5.9938f, 4.7871f, 8.0f)
        curveTo(4.7871f, 9.9598f, 6.148f, 11.4306f, 8.0f, 11.4976f)
        verticalLineTo(10.5731f)
        close()
    }
}
.build()
