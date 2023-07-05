package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Method: IntellijIconData
    get() {
        if (_method != null) {
            return _method!!
        }
        _method = IntellijIconData(imageVector = { MethodComposable(it) })
        return _method!!
    }

private var _method: IntellijIconData? = null

private fun MethodComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Method", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF7F7)), stroke = SolidColor(Color(0xFFDB3B4B)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0657f, 5.2457f)
        curveTo(9.2536f, 5.2457f, 8.636f, 5.6473f, 8.2959f, 6.3154f)
        curveTo(8.0037f, 5.6426f, 7.4055f, 5.2457f, 6.6071f, 5.2457f)
        curveTo(5.8492f, 5.2457f, 5.2815f, 5.6095f, 4.9619f, 6.2486f)
        verticalLineTo(5.3719f)
        horizontalLineTo(4.0f)
        verticalLineTo(10.7543f)
        horizontalLineTo(4.9987f)
        verticalLineTo(7.59f)
        curveTo(4.9987f, 6.6807f, 5.5138f, 6.1077f, 6.3285f, 6.1077f)
        curveTo(7.0749f, 6.1077f, 7.5059f, 6.6176f, 7.5059f, 7.4376f)
        verticalLineTo(10.7543f)
        horizontalLineTo(8.4941f)
        verticalLineTo(7.59f)
        curveTo(8.4941f, 6.6807f, 9.0197f, 6.1077f, 9.8239f, 6.1077f)
        curveTo(10.5756f, 6.1077f, 11.0013f, 6.6176f, 11.0013f, 7.4376f)
        verticalLineTo(10.7543f)
        horizontalLineTo(12.0f)
        verticalLineTo(7.3587f)
        curveTo(12.0f, 6.071f, 11.2168f, 5.2457f, 10.0657f, 5.2457f)
        close()
    }
}
.build()
