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

public val NodesGroup.Function: IntellijIconData
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = IntellijIconData(imageVector = { FunctionComposable(it) })
        return _function!!
    }

private var _function: IntellijIconData? = null

private fun FunctionComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Function", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
        moveTo(7.2573f, 12.0f)
        horizontalLineTo(8.2744f)
        verticalLineTo(7.3274f)
        horizontalLineTo(9.8287f)
        verticalLineTo(6.4303f)
        horizontalLineTo(8.2744f)
        verticalLineTo(5.48f)
        curveTo(8.2744f, 5.12f, 8.5201f, 4.8743f, 8.8744f, 4.8743f)
        horizontalLineTo(9.8801f)
        verticalLineTo(4.0f)
        horizontalLineTo(8.7773f)
        curveTo(7.8744f, 4.0f, 7.2573f, 4.5714f, 7.2573f, 5.4057f)
        verticalLineTo(6.4303f)
        horizontalLineTo(6.1201f)
        verticalLineTo(7.3274f)
        horizontalLineTo(7.2573f)
        verticalLineTo(12.0f)
        close()
    }
}
.build()
